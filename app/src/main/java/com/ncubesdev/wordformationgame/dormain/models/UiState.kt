package com.ncubesdev.wordformationgame.dormain.models


data class UiState (
    var players: List<Player> = listOf<Player>(),
    var admin: Player?=null,
    var loading:Boolean=false,
    val highScorePlayer:Player?=null,
)