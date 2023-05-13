package com.ncubesdev.zimsecpastexampapersandmarksschemes.repos

import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.LocationCacheInfo
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.LocationCacheInfoDao
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
class RepoImpl @Inject constructor(
    private val storage: FirebaseStorage,
    private val db: FirebaseFirestore,
    private val dao: LocationCacheInfoDao
) : Repo {
    override fun getFirestore(): FirebaseFirestore {
        return db
    }
    override fun getStorageService(): FirebaseStorage {
        return storage
    }

    override suspend  fun getUrls(id:String): LocationCacheInfo {
        return  dao.getUrls(id)
    }

    override fun getAllUrls(): Flow<List<LocationCacheInfo>> {
        return dao.getAllUrls()
    }

    override suspend fun updateUrl(locationCacheInfo: LocationCacheInfo) {
        dao.updateUrl(locationCacheInfo)
    }

    override suspend fun insertUrl(locationCacheInfo: LocationCacheInfo) {
        dao.insertUrl(locationCacheInfo)
    }


}

