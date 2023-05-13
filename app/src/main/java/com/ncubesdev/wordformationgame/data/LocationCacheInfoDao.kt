package com.ncubesdev.zimsecpastexampapersandmarksschemes.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface LocationCacheInfoDao {
    @Query("SELECT * FROM url_table WHERE id=:id")
    fun getUrls(id:String): LocationCacheInfo
    @Query("SELECT * FROM url_table")
    fun getAllUrls(): Flow<List<LocationCacheInfo>>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUrl(locationCacheInfo: LocationCacheInfo)
    @Update
    suspend fun updateUrl(locationCacheInfo: LocationCacheInfo)
}