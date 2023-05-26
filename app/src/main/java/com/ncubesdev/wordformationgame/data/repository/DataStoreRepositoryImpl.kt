package com.ncubesdev.wordformationgame.data.repository



import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.ncubesdev.wordformationgame.dormain.repository.DataStoreRepository
import com.ncubesdev.wordformationgame.util.Constants
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject


private val android.content.Context.dataStore by preferencesDataStore(
    name = Constants.USER_PREFERENCES_NAME
)


class DataStoreRepositoryImpl @Inject constructor(
    private val context: Context
) : DataStoreRepository {
    override suspend fun putKeyValuePair(key: String, value: String) {
        val prefKey= stringPreferencesKey(key)
        context.dataStore.edit { preferences ->
            preferences[prefKey] = value
        }
    }
    override fun getKeyValuePair(key: String): Flow<String?> {
        val prefKey= stringPreferencesKey(key)
        return context.dataStore.data.map { preferences ->
            preferences[prefKey] }
    }
}