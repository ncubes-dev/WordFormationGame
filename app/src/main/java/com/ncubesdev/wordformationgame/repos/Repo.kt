package com.ncubesdev.zimsecpastexampapersandmarksschemes.repos
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.LocationCacheInfo
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import kotlinx.coroutines.flow.Flow


interface Repo {
    suspend fun insertUrl(locationCacheInfo: LocationCacheInfo)
    suspend fun getUrls(id:String): LocationCacheInfo
    fun getAllUrls(): Flow<List<LocationCacheInfo>>
    suspend fun updateUrl(locationCacheInfo: LocationCacheInfo)
    fun getFirestore(): FirebaseFirestore
    fun getStorageService(): FirebaseStorage
}