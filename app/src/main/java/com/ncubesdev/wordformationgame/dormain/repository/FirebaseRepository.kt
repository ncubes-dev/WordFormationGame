package com.ncubesdev.wordformationgame.dormain.repository

import android.app.Activity
import androidx.lifecycle.viewModelScope
import com.ncubesdev.wordformationgame.dormain.models.MyOtherApp
import com.ncubesdev.wordformationgame.dormain.models.Player
import com.ncubesdev.wordformationgame.util.Response
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

interface FirebaseRepository {
    fun anonymousSignIn(context: Activity): Flow<Response<String>>
    fun updatePlayer(player: Player)
    fun getPlayers(): Flow<List<Player>>
    suspend fun getMyOtherApps(): Flow<List<MyOtherApp>>

  suspend fun putApp(app: MyOtherApp,sent:()->Unit)
}