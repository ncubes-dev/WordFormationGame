package com.ncubesdev.wordformationgame.util

sealed class UiEvents {
    object StartLoading:UiEvents()
    object Success:UiEvents()
    data class Error(val message:String):UiEvents()
}
