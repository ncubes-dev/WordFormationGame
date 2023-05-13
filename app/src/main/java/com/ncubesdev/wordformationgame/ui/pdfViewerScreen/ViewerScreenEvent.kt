package com.ncubesdev.zimsecpastexampapersandmarksschemes.ui.pdfViewerScreen

import android.content.Context
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.LocationCacheInfo
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.QuestionPaper
import javax.security.auth.Subject


sealed class ViewerScreenEvent {
    object NoNetwork : ViewerScreenEvent()
    object ShowFilterDialog : ViewerScreenEvent()
    object StopLoading : ViewerScreenEvent()
    object Opening : ViewerScreenEvent()
    object OpeningError : ViewerScreenEvent()
    object BackHome : ViewerScreenEvent()
    data class Filter(
        val subject: String,
        val level: String,
        val isDone: Boolean,
    ) : ViewerScreenEvent()

    object HideFilterDialog : ViewerScreenEvent()
    object ShowLoadingDialog : ViewerScreenEvent()
    data class UpdateLocalCacheInfo(var cacheInfo: LocationCacheInfo) : ViewerScreenEvent()
    data class OnGetAnswerUrl(val paper: QuestionPaper) : ViewerScreenEvent()
    data class OnGetQuestionUrl(val paper: QuestionPaper) : ViewerScreenEvent()
    data class OnCheckClick(val paper: QuestionPaper) : ViewerScreenEvent()
    data class OnCacheAnswerRequest(val paper: QuestionPaper, var context: Context) :
        ViewerScreenEvent()

    data class OnCacheQuestionRequest(val paper: QuestionPaper, var context: Context) :
        ViewerScreenEvent()

    object Reload :ViewerScreenEvent()

}


