package com.ncubesdev.wordformationgame.data.repository

import android.app.Activity
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.snapshots
import com.google.firebase.firestore.ktx.toObjects
import com.ncubesdev.wordformationgame.dormain.models.MyOtherApp
import com.ncubesdev.wordformationgame.dormain.models.Player
import com.ncubesdev.wordformationgame.dormain.repository.FirebaseRepository
import com.ncubesdev.wordformationgame.util.Response
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class FirebaseRepositoryImpl @Inject constructor (
    private val db: FirebaseFirestore,
    private val firebaseAuth: FirebaseAuth
        ):FirebaseRepository{
    override fun anonymousSignIn(context: Activity): Flow<Response<String>> = flow {
        emit(Response.Loading)
        val auth = firebaseAuth.signInAnonymously().await()
        emit(Response.Success(auth.user?.uid))
    }.catch {
        emit(Response.Failure(it.message.toString()))
    }
    override fun updatePlayer(player: Player,success:()->Unit) {
        db.collection("players").document(player.id).set(player).addOnSuccessListener {
            success()
        }
    }
    override fun getPlayers(): Flow<List<Player>> =
        db.collection("players").snapshots().map {
            it.toObjects<Player>() }

    override suspend fun getMyOtherApps(): Flow<List<MyOtherApp>> =
            db.collection("myotherapps").snapshots().map { it.toObjects<MyOtherApp>() }

    override suspend fun putApp(app: MyOtherApp,sent:()->Unit) {
                db.collection("myotherapps").document().set(app).addOnSuccessListener {
                    sent()
                }
            }
}