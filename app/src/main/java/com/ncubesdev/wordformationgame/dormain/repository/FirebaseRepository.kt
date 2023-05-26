package com.ncubesdev.wordformationgame.dormain.repository

import android.app.Activity
import com.ncubesdev.wordformationgame.dormain.models.Player
import com.ncubesdev.wordformationgame.util.Response
import kotlinx.coroutines.flow.Flow

interface FirebaseRepository {
    fun anonymousSignIn(context: Activity): Flow<Response<String>>
    fun updatePlayer(player: Player)
    fun getPlayers(): Flow<List<Player>>
}