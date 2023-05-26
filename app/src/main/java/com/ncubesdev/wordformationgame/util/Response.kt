package com.ncubesdev.wordformationgame.util

sealed class Response<out T> {
    object Loading: Response<Nothing>()
    data class Success<out T>(val data: T?): Response<T>()
    data class Failure(val e: String): Response<Nothing>()
}