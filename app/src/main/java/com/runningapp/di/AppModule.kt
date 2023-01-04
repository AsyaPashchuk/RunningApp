package com.runningapp.di

import android.content.Context
import androidx.room.Room
import com.runningapp.db.RunningDB
import com.runningapp.util.Constants.RUNNING_DB_NAME
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
    fun provideRunningDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        RunningDB::class.java,
        RUNNING_DB_NAME
    ).build()

    @Provides
    @Singleton
    fun provideRunDao(db: RunningDB) = db.getRunDao()
}