package com.ncubesdev.zimsecpastexampapersandmarksschemes.util

import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.LocationCacheInfo
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.QuestionPaper

sealed class UiEvents{
    object Success: UiEvents()
    data class Open(val url:String): UiEvents()
    data class ShowToast(val text:String): UiEvents()
    data class OpenAnswer(val locationCacheInfo: LocationCacheInfo, val paper: QuestionPaper): UiEvents()
    data class OpenQuestion(val locationCacheInfo: LocationCacheInfo, val paper: QuestionPaper): UiEvents()
    data class Error(val message:String): UiEvents()
}
