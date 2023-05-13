package com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.pdfViewerScreen

import android.content.Context
import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.firestore.ktx.snapshots
import com.google.firebase.firestore.ktx.toObjects
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.LocationCacheInfo
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.UiEvents
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.QuestionPaper
import com.ncubesdev.zimsecpastexampapersandmarksschemes.dormain.models.CacheState
import com.ncubesdev.zimsecpastexampapersandmarksschemes.dormain.models.DownLoadProgress
import com.ncubesdev.zimsecpastexampapersandmarksschemes.repos.DataStoreRepository
import com.ncubesdev.zimsecpastexampapersandmarksschemes.repos.Repo
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.Constants
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.LoadingState
import com.rizzi.bouquet.HorizontalPdfReaderState
import com.rizzi.bouquet.PdfReaderState
import com.rizzi.bouquet.ResourceType
import com.rizzi.bouquet.VerticalPdfReaderState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import java.io.File
import javax.inject.Inject

@HiltViewModel
class ViewerScreenViewModel @Inject constructor(
    private val repo: Repo,
    private val dataStoreRepository: DataStoreRepository,
) : ViewModel() {
    private var _loadingDialog = MutableStateFlow<LoadingState>(LoadingState.NONE)
    val loadingDialog = _loadingDialog.asStateFlow()

    private val mStateFlow = MutableStateFlow<PdfReaderState?>(null)
    val stateFlow: StateFlow<PdfReaderState?> = mStateFlow


    val allLocationInfo=repo.getAllUrls()

    private val switchState = mutableStateOf(false)
    private val storageRef = repo.getStorageService().reference
    private val _uiEvent = MutableSharedFlow<UiEvents>()
    val uiEvent = _uiEvent.asSharedFlow()
    private val _pages = MutableStateFlow<List<QuestionPaper>>(emptyList())
    private val _filteredPapers = MutableStateFlow<List<QuestionPaper>>(emptyList())
    val unFilteredPapers = _pages.asStateFlow()
    val pages = _filteredPapers.asStateFlow()
    private val _isDialog = MutableStateFlow<Boolean>(false)
    private val openingState = MutableStateFlow<Boolean>(false)
    private val fireStoreDb = repo.getFirestore()
    private val _unAnsweredPapers = MutableStateFlow<List<QuestionPaper>>(emptyList())
    val unAnsweredPapers = _unAnsweredPapers.asStateFlow()
    private val _level = MutableStateFlow<String?>(null)
    private val _subject = MutableStateFlow<String?>(null)
    private val _downloadedSize = MutableStateFlow<Float>(0.0f)
    private val _downloadSize = MutableStateFlow<Float>(0.0f)
    private val _cacheState = MutableStateFlow<CacheState>(CacheState())
    private val _downloadState = MutableStateFlow<DownLoadProgress>(DownLoadProgress())

    val downloadState = combine(
        _downloadState, _downloadedSize, _downloadSize
    ) { downloadState, downloadedSize, downloadSize ->
        downloadState.copy(
            downloadedSize = downloadedSize,
            downloadSize = downloadSize
        )
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), DownLoadProgress())


    val cacheState = combine(
        _cacheState, _level, _subject
    ) { cacheState, level, subject ->
        cacheState.copy(
            level = level,
            subject = subject
        )
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), CacheState())

    init {
        viewModelScope.launch {
            launch {
                dataStoreRepository.getKeyValuePair(Constants.SUBJECT)
                    .collect { nullableSubject ->
                        nullableSubject?.let { subject ->
                            _subject.value = subject
                        }
                    }
            }
            launch {
                dataStoreRepository.getKeyValuePair(Constants.LEVEL)
                    .collect { nullableLevel ->
                        nullableLevel?.let { level ->
                            _level.value = level
                        }
                    }
            }
            launch {
                getDucumentFromfirestore()
            }


        }
    }

    fun onEvent(event: ViewerScreenEvent) {
        when (event) {
            is ViewerScreenEvent.ShowFilterDialog -> {
                _isDialog.value = true
            }
            is ViewerScreenEvent.OpeningError -> {
                _isDialog.value = true
            }
            is ViewerScreenEvent.Opening -> {
                _isDialog.value = true
            }
            is ViewerScreenEvent.BackHome -> {
                mStateFlow.value = null
            }
            is ViewerScreenEvent.ShowLoadingDialog -> {
                _loadingDialog.value = LoadingState.LOADING
            }
            is ViewerScreenEvent.Filter -> {
                viewModelScope.launch {
                    launch {
                        if (event.level.isEmpty()) {
                            _subject.value = event.subject
                            dataStoreRepository.putKeyValuePair(Constants.SUBJECT, event.subject)
                        } else if (event.subject.isEmpty()) {
                            _level.value = event.level
                        }
                        if (_level.value.isNullOrEmpty() && _subject.value.isNullOrEmpty()) {
                            _filteredPapers.value = _pages.value


                        } else if (!_level.value.isNullOrEmpty() && _subject.value == null) {
                            _filteredPapers.value = _pages.value.filter { it.level == _level.value }

                        } else if (!_subject.value.isNullOrEmpty() && _level.value == null) {
                            _filteredPapers.value =
                                _pages.value.filter { it.subject == _subject.value }

                        } else {
                            _filteredPapers.value = _pages.value.filter { it.level == _level.value }
                                .filter { it.subject == _subject.value }
                        }
                    }

                }
            }
            is ViewerScreenEvent.HideFilterDialog -> {
                _isDialog.value = false
            }
            is ViewerScreenEvent.StopLoading -> {
                _loadingDialog.value = LoadingState.NONE
            }
            is ViewerScreenEvent.Reload -> {
                getDucumentFromfirestore()
            }

            is ViewerScreenEvent.NoNetwork -> {
                viewModelScope.launch {
                    _uiEvent.emit(UiEvents.ShowToast("You aren't connected to the internet"))
                }
            }
            is ViewerScreenEvent.OnCheckClick -> {
                UpdateDocumentInfoToFireStore(event.paper)
            }
            is ViewerScreenEvent.OnCacheAnswerRequest -> {
                viewModelScope.launch {
                    cacheTheAnswer(event.paper, event.context)
                }

            }
            is ViewerScreenEvent.OnCacheQuestionRequest -> {
                cacheTheQuestion(event.paper, event.context)
            }
            is ViewerScreenEvent.OnGetAnswerUrl -> {
                viewModelScope.launch(Dispatchers.IO) {
                    try {
                        val doc = repo.getUrls(event.paper.id)
                        _uiEvent.emit(UiEvents.OpenAnswer(doc, event.paper))
                    } catch (e: java.lang.Exception) {
                        _uiEvent.emit(
                            UiEvents.OpenAnswer(
                                LocationCacheInfo("", "", ""),
                                event.paper
                            )
                        )
                    }
                }
            }
            is ViewerScreenEvent.OnGetQuestionUrl -> {
                viewModelScope.launch(Dispatchers.IO) {
                    try {
                        val doc = repo.getUrls(event.paper.id)
                        _uiEvent.emit(UiEvents.OpenQuestion(doc, event.paper))
                    } catch (e: java.lang.Exception) {
                        _uiEvent.emit(
                            UiEvents.OpenQuestion(
                                LocationCacheInfo("", "", ""),
                                event.paper
                            )
                        )
                    }
                }
            }
            is ViewerScreenEvent.UpdateLocalCacheInfo -> {
                viewModelScope.launch(Dispatchers.IO) {
                    repo.updateUrl(event.cacheInfo)
                }
            }
        }
    }

    private fun UpdateDocumentInfoToFireStore(questionPaper: QuestionPaper) {
        fireStoreDb.collection("pastpapers").document(questionPaper.id).set(questionPaper)
    }

    private fun getDucumentFromfirestore() {
        viewModelScope.launch {
            fireStoreDb.collection("pastpapers").snapshots().map { it.toObjects<QuestionPaper>() }
                .collect { questionPapers ->
                    _pages.value = questionPapers.sortedWith(
                        compareBy({ it.month },
                            { it.year },
                            { it.month },
                            { it.paper },
                            { it.subject })
                    )
                    if (_level.value.isNullOrEmpty() && _subject.value.isNullOrEmpty()) {
                        _filteredPapers.value = questionPapers

                    } else if (!_level.value.isNullOrEmpty() && _subject.value == null) {
                        _filteredPapers.value = questionPapers.filter { it.level == _level.value }

                    } else if (!_subject.value.isNullOrEmpty() && _level.value == null) {
                        _filteredPapers.value =
                            questionPapers.filter { it.subject == _subject.value }

                    } else {
                        _filteredPapers.value = questionPapers.filter { it.level == _level.value }
                            .filter { it.subject == _subject.value }

                    }
                    _unAnsweredPapers.value =
                        _filteredPapers.value.filter { it.answerRemoteUrl.isEmpty() }
                }
        }
    }

    private fun cacheTheAnswer(paper: QuestionPaper, context: Context) {
        var answerRef =
            storageRef.child("answers/${paper.level}${paper.month}${paper.paper}${paper.year}")
        val localFile = File(context.filesDir, "answer${paper.id}.pdf")
        val answerDownloadTask = answerRef.getFile(localFile)
        answerDownloadTask.addOnSuccessListener {
            _downloadedSize.value=it.bytesTransferred .toFloat()
            _downloadSize.value=it.totalByteCount.toFloat()
            localFile.canRead()
            viewModelScope.launch(Dispatchers.IO) {
                try {
                    val localUrls = repo.getUrls(paper.id)
                    localUrls.apply {
                        answerLocalUrl = localFile.toURI().toString()
                    }
                    repo.insertUrl(localUrls)
                    _loadingDialog.value = LoadingState.SUCCESS
                    _uiEvent.emit(UiEvents.Open(localFile.toURI().toString()))
                } catch (e: Exception) {
                    repo.insertUrl(
                        LocationCacheInfo(
                            paper.id,
                            answerLocalUrl = localFile.toURI().toString(),
                            questionLocalUrl = ""
                        )
                    )
                    _loadingDialog.value = LoadingState.SUCCESS
                    _uiEvent.emit(UiEvents.Open(localFile.toURI().toString()))
                }
            }
        }
        answerDownloadTask.addOnFailureListener {
            viewModelScope.launch {
                _loadingDialog.value = LoadingState.ERROR
            }
        }
    }

    private fun cacheTheQuestion(paper: QuestionPaper, context: Context) {
        //caches PDF to local storage
        var pdfRef =
            storageRef.child("papers/${paper.level}${paper.month}${paper.paper}${paper.year} ")
        val localFile = File(context.filesDir, "question${paper.id}.pdf")
        val questionDownloadTask = pdfRef.getFile(localFile)
        questionDownloadTask.addOnSuccessListener {
            _downloadedSize.value=it.bytesTransferred .toFloat()
            _downloadSize.value=it.totalByteCount.toFloat()
            localFile.canRead()
            viewModelScope.launch(Dispatchers.IO) {
                try {
                    val localUrls = repo.getUrls(paper.id)
                    localUrls.apply {
                        questionLocalUrl = localFile.toURI().toString()
                    }
                    repo.insertUrl(localUrls)
                    _loadingDialog.value = LoadingState.SUCCESS
                    _uiEvent.emit(UiEvents.Open(localFile.toURI().toString()))
                } catch (e: Exception) {
                    repo.insertUrl(
                        LocationCacheInfo(
                            paper.id,
                            answerLocalUrl = "",
                            questionLocalUrl = localFile.toURI().toString()
                        )
                    )
                    _loadingDialog.value = LoadingState.SUCCESS
                    _uiEvent.emit(UiEvents.Open(localFile.toURI().toString()))
                }
            }
        }
        questionDownloadTask.addOnFailureListener {
            viewModelScope.launch {
                _loadingDialog.value = LoadingState.ERROR
            }
        }
    }

    fun openResource(resourceType: ResourceType) {
        mStateFlow.tryEmit(
            if (switchState.value) {
                HorizontalPdfReaderState(resourceType, true)
            } else {
                VerticalPdfReaderState(resourceType, true)
            }
        )
    }

    fun clearResource() {
        mStateFlow.tryEmit(null)
    }
}







