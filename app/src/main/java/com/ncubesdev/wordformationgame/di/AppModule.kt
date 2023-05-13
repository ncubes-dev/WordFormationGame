package com.ncubesdev.zimsecpastexampapersandmarksschemes.di

import android.app.Application
import androidx.room.Room
import com.ncubesdev.zimsecpastexampapersandmarksschemes.data.LocationCacheInfoDatabase
import com.ncubesdev.zimsecpastexampapersandmarksschemes.repos.Repo
import com.ncubesdev.zimsecpastexampapersandmarksschemes.repos.RepoImpl
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.ktx.storage
import com.ncubesdev.zimsecpastexampapersandmarksschemes.repos.DataStoreRepository
import com.ncubesdev.zimsecpastexampapersandmarksschemes.repos.DataStoreRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDataStoreRepository(app: Application): DataStoreRepository {
        return DataStoreRepositoryImpl(app)
    }
    @Provides
    @Singleton
    fun provideFirebaseStorage() =  Firebase.storage
    @Provides
    @Singleton
    fun provideDatabase(app: Application): LocationCacheInfoDatabase {
        return Room.databaseBuilder(
            app,
            LocationCacheInfoDatabase::class.java,
            "url_db"
        ).build()
    }
    @Provides
    @Singleton
    fun provideFirebaseFirestore() = Firebase.firestore

    @Provides
    @Singleton
    fun providePdfRepository(storage: FirebaseStorage, db: FirebaseFirestore, localDb:LocationCacheInfoDatabase): Repo {
        return RepoImpl(storage = storage, db = db,dao=localDb.dao)
    }
}