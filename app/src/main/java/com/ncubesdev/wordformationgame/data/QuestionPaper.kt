package com.ncubesdev.zimsecpastexampapersandmarksschemes.data

data class QuestionPaper(
    var answerRemoteUrl: String = "",
    var remoteUrl: String = "",
    var isDone: Boolean = false,
    var subject: String = "",
    var month: String = "",
    var year: Int = 0,
    var paper: String = "",
    var level: String = "",
    var id: String = "",
    )


