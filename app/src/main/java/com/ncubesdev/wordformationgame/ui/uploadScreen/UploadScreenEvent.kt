package com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.uploadScreen

import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.PdfDocument
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.QuestionPaper

sealed class UploadScreenEvent{
    data class OnUploadClick(val paper: QuestionPaper, val pdfDocument: PdfDocument):UploadScreenEvent()
    data class OnAnswerUpdate(val paper: QuestionPaper, val pdfDocument: PdfDocument):UploadScreenEvent()
}
