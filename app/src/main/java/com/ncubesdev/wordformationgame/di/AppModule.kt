package com.ncubesdev.wordformationgame.di

import android.app.Application
import com.ncubesdev.wordformationgame.repos.DataStoreRepository
import com.ncubesdev.wordformationgame.repos.DataStoreRepositoryImpl
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
    }}