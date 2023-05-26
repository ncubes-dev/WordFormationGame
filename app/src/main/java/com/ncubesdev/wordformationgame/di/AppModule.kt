package com.ncubesdev.wordformationgame.di

import android.app.Application
import android.content.Context
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.ncubesdev.wordformationgame.AdMobInterstitial
import com.ncubesdev.wordformationgame.data.repository.DataStoreRepositoryImpl
import com.ncubesdev.wordformationgame.data.repository.FirebaseRepositoryImpl
import com.ncubesdev.wordformationgame.dormain.repository.DataStoreRepository
import com.ncubesdev.wordformationgame.dormain.repository.FirebaseRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
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
    @Singleton
    @Provides
    fun provideAdMobInterstitial(
        @ApplicationContext context: Context
    ): AdMobInterstitial = AdMobInterstitial(context)
    @Provides
    @Singleton
    fun provideFirebaseFireStore() = Firebase.firestore
    @Provides
    @Singleton
    fun provideFirebaseAuth() = FirebaseAuth.getInstance()
    @Provides
    @Singleton
    fun provideFirebaseRepository(
        db: FirebaseFirestore,
        authResult: FirebaseAuth
    ): FirebaseRepository {
        return FirebaseRepositoryImpl( db = db, firebaseAuth = authResult)
    }
}