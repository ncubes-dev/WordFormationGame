package com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.uploadScreen

import android.annotation.SuppressLint
import android.net.Uri
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.PdfDocument
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.QuestionPaper
import com.ncubesdev.zimsecpastexampapersandmarksschemes.repos.Repo
import com.ncubesdev.zimsecpastexampapersandmarksschemes.util.UiEvents
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UploadScreenViewModel @Inject constructor(
    private val repo: Repo
) : ViewModel() {
    private val storageRef = repo.getStorageService().reference
    private val fireStoreDb = repo.getFirestore()
    private val _uiEvent = MutableSharedFlow<UiEvents>()
    val uiEvent = _uiEvent.asSharedFlow()
    private var _isLoading = MutableStateFlow<Boolean>(false)
    var isLoading = _isLoading.asStateFlow()
    fun onEvent(event: UploadScreenEvent) {
        when (event) {
            is UploadScreenEvent.OnUploadClick -> {
                viewModelScope.launch {
                    _isLoading.value = true
                    saveTheQuestionPaper(event.pdfDocument, event.paper)
                }
            }
            is UploadScreenEvent.OnAnswerUpdate -> {
                viewModelScope.launch {
                    _isLoading.value = true
                    updateTheQuestionPaperAnswer(event.pdfDocument, event.paper)
                }
            }
        }
    }

    private fun saveTheQuestionPaper(pdfDocument: PdfDocument, paper: QuestionPaper) {
        var uri = Uri.parse(pdfDocument.localUri)
        var uriAnswer = Uri.parse(pdfDocument.answerUri)
        if (pdfDocument.answerUri.isEmpty()) {
            Log.e("mytag", "1,,,,,,,,,,,,,,,,,,,,")

            val paperRef =
                storageRef.child("papers/${paper.level}${paper.month}${paper.paper}${paper.year} ")
            val uploadTask = paperRef.putFile(uri)
            Log.e("mytag", "2........................")
            uploadTask.addOnSuccessListener {
                val downloadUrlTask = paperRef.downloadUrl
                Log.e("mytag", "uploaded'''''''''''''''''''''")
                downloadUrlTask.addOnSuccessListener { downloadUrl ->
                    viewModelScope.launch {
                        paper.apply { remoteUrl = downloadUrl.toString() }
                        _isLoading.value = false
                        _uiEvent.emit(UiEvents.Success)
                        saveToFireStore(paper)
                        Log.e("mytag", "uploaded...........................")

                    }
                    downloadUrlTask.addOnFailureListener {
                        _isLoading.value = false
                        viewModelScope.launch {
                            it.message?.let { it1 -> UiEvents.Error("Contact the Developer for permission to upload") }
                                ?.let { it2 -> _uiEvent.emit(it2) }
                        }
                    }
                }
                uploadTask.addOnFailureListener {
                    _isLoading.value = false
                    viewModelScope.launch {
                        it.message?.let { it1 -> UiEvents.Error("Contact the Developer for permission to upload") }
                            ?.let { it2 -> _uiEvent.emit(it2) }
                    }
                }
            }
        }
    else {
        //uploads the PDF and then on success, it sends the PDF info to FireStore
        val paperRef =
            storageRef.child("papers/${paper.level}${paper.month}${paper.paper}${paper.year} ")
        val answersRef =
            storageRef.child("answers/${paper.level}${paper.month}${paper.paper}${paper.year}")
        val uploadTask = paperRef.putFile(uri)
        uploadTask.addOnSuccessListener {
            val downloadUrlTask = paperRef.downloadUrl
            downloadUrlTask.addOnSuccessListener { downloadUrl ->
                paper.apply { remoteUrl = downloadUrl.toString() }
                val UploadTaskAnswer = answersRef.putFile(uriAnswer)
                UploadTaskAnswer.addOnSuccessListener {
                    val answerUrlTask = answersRef.downloadUrl.addOnSuccessListener {
                        paper.apply { answerRemoteUrl = it.toString() }
                        viewModelScope.launch {
                            _isLoading.value = false
                            _uiEvent.emit(UiEvents.Success)
                        }
                        saveToFireStore(paper)
                    }
                    answerUrlTask.addOnFailureListener {
                        _isLoading.value = false
                        viewModelScope.launch {
                            it.message?.let { it1 -> UiEvents.Error("Contact the Developer for permission to upload") }
                                ?.let { it2 -> _uiEvent.emit(it2) }
                        }
                    }
                }
                UploadTaskAnswer.addOnFailureListener {
                    _isLoading.value = false
                    viewModelScope.launch {
                        it.message?.let { it1 -> UiEvents.Error("Contact the Developer for permission to upload") }
                            ?.let { it2 -> _uiEvent.emit(it2) }
                    }
                }
            }
            downloadUrlTask.addOnFailureListener {
                _isLoading.value = false
                viewModelScope.launch {
                    it.message?.let { it1 -> UiEvents.Error("Contact the Developer for permission to upload") }
                        ?.let { it2 -> _uiEvent.emit(it2) }
                }
            }
        }
        uploadTask.addOnFailureListener {
            _isLoading.value = false
            viewModelScope.launch {
                it.message?.let { it1 -> UiEvents.Error("Contact the Developer for permission to upload") }
                    ?.let { it2 -> _uiEvent.emit(it2) }
            }
        }
    }
}

private fun updateTheQuestionPaperAnswer(pdfDocument: PdfDocument, paper: QuestionPaper) {
    //uploads the PDF and then on success, it sends the PDF info to FireStore
    var uriAnswer = Uri.parse(pdfDocument.answerUri)
    val answersRef = storageRef.child("answers/${paper.level}${paper.month}${paper.paper}${paper.year}")
    val UploadTaskAnswer = answersRef.putFile(uriAnswer)
    UploadTaskAnswer.addOnSuccessListener {
        val answerUrlTask = answersRef.downloadUrl.addOnSuccessListener {
            paper.apply { answerRemoteUrl = it.toString() }
            viewModelScope.launch {
                _isLoading.value = false
                _uiEvent.emit(UiEvents.Success)
            }
            saveToFireStore(paper)
        }
        answerUrlTask.addOnFailureListener {
            _isLoading.value = false
            viewModelScope.launch {
                it.message?.let { it1 -> UiEvents.Error("Contact the Developer for permission to upload") }
                    ?.let { it2 -> _uiEvent.emit(it2) }
            }
        }
    }
    UploadTaskAnswer.addOnFailureListener {
        _isLoading.value = false
        viewModelScope.launch {
            it.message?.let { it1 -> UiEvents.Error("Contact the Developer for permission to upload") }
                ?.let { it2 -> _uiEvent.emit(it2) }
        }
    }
}

private fun saveToFireStore(questionPaper: QuestionPaper) {
    //Saves all info about the PDF to the fireStore database
    val document = if (questionPaper.id.isEmpty()) fireStoreDb.collection("pastpapers").document() else fireStoreDb.collection("pastpapers").document(questionPaper.id)
    questionPaper.apply { id=document.id }
    val handle = document.set(questionPaper)
    handle.addOnSuccessListener {
        viewModelScope.launch {
            _uiEvent.emit(UiEvents.ShowToast("Success"))
        }
    }
    handle.addOnFailureListener {
        viewModelScope.launch {
            _uiEvent.emit(UiEvents.ShowToast("Error occured"))
        }
    }
}
}