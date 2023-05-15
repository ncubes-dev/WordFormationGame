package com.ncubesdev.wordformationgame.ui.quiz_game

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ncubesdev.wordformationgame.repos.DataStoreRepository
import com.ncubesdev.wordformationgame.util.Constants
import com.ncubesdev.wordformationgame.util.Constants.quizWords
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuizViewModel @Inject constructor(
    private val dataStoreRepository: DataStoreRepository) : ViewModel() {

    val answers= mutableStateListOf<String>()
    private var _validWords = MutableStateFlow<List<String>>(emptyList())

    val validWords = _validWords.asStateFlow()
    private val characters = ('a'..'z').toList()

    private var _possibleStrings = MutableStateFlow("")
    val possibleStrings = _possibleStrings.asStateFlow()

    private var _highScore = MutableStateFlow("0")
    val highScore = _highScore.asStateFlow()

    private var _numberOfGames = MutableStateFlow("0")
    val numberOfGames = _numberOfGames.asStateFlow()

    init {

        viewModelScope.launch {
            launch {
                restart()
            }

            launch {
                dataStoreRepository.getKeyValuePair(Constants.GAME_NUMBER).collect{
                    it?.let {
                        _numberOfGames.value=it
                    }
                }
            }
            launch {
                dataStoreRepository.getKeyValuePair(Constants.SCORE).collect{
                    it?.let {
                        _highScore.value=it
                    }
                }
            }
        }
    }

    fun onEvent(event: QuizGameScreenEvent){
        when(event){
            is QuizGameScreenEvent.ReStart->{
                restart()
                answers.clear()
            }
            is QuizGameScreenEvent.AddScore->{
                viewModelScope.launch {
                    dataStoreRepository.putKeyValuePair(Constants.SCORE,_highScore.value.toInt().plus(1).toString())

                }
            }
            is QuizGameScreenEvent.AddGameNumber->{
                viewModelScope.launch {
                    dataStoreRepository.putKeyValuePair(Constants.GAME_NUMBER,_numberOfGames.value.toInt().plus(1).toString())
                }
            }
        }
    }

    private fun restart() {
       val randomCharacters=characters.shuffled()
        answers.clear()
        _possibleStrings.value =
            randomCharacters.random().toString() + randomCharacters.random().toString() + randomCharacters.random()
                .toString() + randomCharacters.random().toString()
        _validWords.value=possibleWords(_possibleStrings.value).toSet().toList().filter { isTrueWord(it) }
        if (_validWords.value.isEmpty()){
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