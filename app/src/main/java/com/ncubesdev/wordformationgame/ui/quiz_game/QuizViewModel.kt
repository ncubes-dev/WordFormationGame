package com.ncubesdev.wordformationgame.ui.quiz_game

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ncubesdev.wordformationgame.dormain.models.Player
import com.ncubesdev.wordformationgame.dormain.models.UiState
import com.ncubesdev.wordformationgame.dormain.repository.DataStoreRepository
import com.ncubesdev.wordformationgame.dormain.repository.FirebaseRepository
import com.ncubesdev.wordformationgame.util.Constants
import com.ncubesdev.wordformationgame.util.Constants.quizWords
import com.ncubesdev.wordformationgame.util.Response
import com.ncubesdev.wordformationgame.util.UiEvents
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuizViewModel @Inject constructor(
    private val dataStoreRepository: DataStoreRepository,
    private val firebaseRepository: FirebaseRepository
) : ViewModel() {
    private val _uiEvent = MutableSharedFlow<UiEvents>()
    val uiEvent = _uiEvent.asSharedFlow()
    val answers = mutableStateListOf<String>()
    private var _validWords = MutableStateFlow<List<String>>(emptyList())
    private var _loading = MutableStateFlow<Boolean>(false)

    private var _players = MutableStateFlow<List<Player>>(emptyList())
    private var _admin = MutableStateFlow<Player?>(null)
    private var _highScorePlayer = MutableStateFlow<Player?>(null)

    val validWords = _validWords.asStateFlow()
    private val characters = ('a'..'z').toList()

    private var _possibleStrings = MutableStateFlow("")
    val possibleStrings = _possibleStrings.asStateFlow()

    private var _highScore = MutableStateFlow("0")
    val highScore = _highScore.asStateFlow()
    private var _uiState = MutableStateFlow<UiState>(UiState())

    private var _numberOfGames = MutableStateFlow("0")
    val numberOfGames = _numberOfGames.asStateFlow()
    val uiState = combine(
        _uiState,
        _players,
        _admin,
        _loading,
        _highScorePlayer
    ) { uiState, players, player,loading ,highScorePlayer-> uiState.copy(highScorePlayer=highScorePlayer,players = players, admin = player, loading = loading) }.stateIn(
        viewModelScope, SharingStarted.WhileSubscribed(5000),
        UiState()
    )

    init {
        viewModelScope.launch {
            launch { restart() }
            launch {
                firebaseRepository.getPlayers().collect { players ->
                    _players.value = players
                    try {
                        _highScorePlayer.value= if (players.isEmpty()) null else players.first()
                    }catch (e:Exception){
                        _highScorePlayer.value =null
                    }
                    dataStoreRepository.getKeyValuePair(Constants.ID).collect { nullableId ->
                        nullableId?.let { id ->
                            _admin.value = players.find { it.id == id }
                        }
                    }
                }
            }
            launch {
                dataStoreRepository.getKeyValuePair(Constants.GAME_NUMBER).collect {
                    it?.let {
                        _numberOfGames.value = it
                    }
                }
            }
            launch {
                dataStoreRepository.getKeyValuePair(Constants.SCORE).collect {
                    it?.let {
                        _highScore.value = it
                    }
                }
            }
        }
    }

    fun onEvent(event: QuizGameScreenEvent) {
        when (event) {
            is QuizGameScreenEvent.SignUp -> {
                viewModelScope.launch {
                    firebaseRepository.anonymousSignIn(event.context).collect {
                        when (it) {
                            is Response.Failure -> {
                                _uiEvent.emit(UiEvents.Error(it.e))
                                _loading.value=false
                            }
                            is Response.Success -> {
                                _loading.value=false
                                _uiEvent.emit(UiEvents.Success)
                                firebaseRepository.updatePlayer(
                                    Player(
                                        name = event.name,
                                        id = it.data.toString()
                                    )
                                )
                                dataStoreRepository.putKeyValuePair(
                                    key = Constants.ID,
                                    value = it.data.toString()
                                )
                            }
                            is Response.Loading -> {
                                _loading.value=true
                            }
                        }
                    }
                }
            }

            is QuizGameScreenEvent.ReStart -> {
                restart()
                answers.clear()
            }

            is QuizGameScreenEvent.AddScore -> {
                viewModelScope.launch {
                    dataStoreRepository.putKeyValuePair(
                        Constants.SCORE,
                        _highScore.value.toInt().plus(1).toString()
                    )
                    _admin.value?.let {
                    firebaseRepository.updatePlayer(
                        it.copy(numberOfGames=_numberOfGames.value, numberOfWins = _highScore.value)
                    )
                    }
                }
            }
            is QuizGameScreenEvent.AddGameNumber -> {
                viewModelScope.launch {
                    dataStoreRepository.putKeyValuePair(
                        Constants.GAME_NUMBER,
                        _numberOfGames.value.toInt().plus(1).toString()
                    )
                    _admin.value?.let {
                        firebaseRepository.updatePlayer(
                            it.copy(numberOfGames=_numberOfGames.value, numberOfWins = _highScore.value)
                        )
                    }
                }
            }
        }
    }

    private fun restart() {
        val randomCharacters = characters.shuffled()
        answers.clear()
        _possibleStrings.value =
            randomCharacters.random().toString() + randomCharacters.random()
                .toString() + randomCharacters.random()
                .toString() + randomCharacters.random().toString()
        _validWords.value =
            possibleWords(_possibleStrings.value).toSet().toList().filter { isTrueWord(it) }
        if (_validWords.value.isEmpty()) {
            restart()
        }
    }

    private fun possibleWords(str: String): List<String> {
        val result = mutableListOf<String>()
        val permutations = str.toCharArray().toList().permute()
        for (perm in permutations) {
            result.add(perm.joinToString(""))
        }
        return result
    }

    private fun <T> List<T>.permute(): List<List<T>> {
        if (size <= 1) {
            return listOf(toList())
        }
        val result = mutableListOf<List<T>>()
        for (i in indices) {
            val elem = this[i]
            val rest = subList(0, i) + subList(i + 1, size)
            for (perm in rest.permute()) {
                result.add(listOf(elem) + perm)
            }
        }
        return result
    }
    private fun isTrueWord(word: String): Boolean {
        val index = quizWords.binarySearch(word)
        return (index >= 0)
    }
}