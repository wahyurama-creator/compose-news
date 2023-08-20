package com.ways.composenews.data.di

import android.app.Application
import com.ways.composenews.data.manager.LocalUserManagerImpl
import com.ways.composenews.domain.manager.LocalUserManager
import com.ways.composenews.domain.usecases.AppEntryUseCases
import com.ways.composenews.domain.usecases.ReadAppEntry
import com.ways.composenews.domain.usecases.SaveAppEntry
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
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    ): AppEntryUseCases = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )

}