package com.ncubesdev.zimsecpastexampapersandmarksschemes.data

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(
    entities = [LocationCacheInfo::class],
    version = 1
)
abstract class LocationCacheInfoDatabase:RoomDatabase() {
    abstract val dao: LocationCacheInfoDao
}

