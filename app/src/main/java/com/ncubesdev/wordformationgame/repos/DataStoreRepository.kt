package com.ncubesdev.wordformationgame.repos

import kotlinx.coroutines.flow.Flow

interface DataStoreRepository {
        fun getKeyValuePair(key: String): Flow<String?>
        suspend fun putKeyValuePair(key: String, value: String)
    }