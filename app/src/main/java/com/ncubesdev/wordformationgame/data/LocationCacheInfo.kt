package com.ncubesdev.zimsecpastexampapersandmarksschemes.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "url_table")
data class LocationCacheInfo(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    var answerLocalUrl: String,
    var questionLocalUrl: String,
    var isDone:Boolean=false
)
