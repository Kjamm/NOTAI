package com.iguana.data.di

import android.content.Context
import androidx.room.Room
import com.iguana.data.local.dao.RecentFileDao
import com.iguana.data.local.db.AppDatabase
import com.iguana.data.repository.LoginRepositoryImpl
import com.iguana.domain.repository.LoginRepository
import com.iguana.domain.repository.SharedPreferencesHelper
import com.iguana.data.local.db.SharedPreferencesHelperImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    @Singleton
    abstract fun bindLoginRepository(
        loginRepositoryImpl: LoginRepositoryImpl
    ): com.iguana.domain.repository.LoginRepository

    @Binds
    @Singleton
    abstract fun bindSharedPreferencesHelper(
        sharedPreferencesHelperImpl: SharedPreferencesHelperImpl
    ): com.iguana.domain.repository.SharedPreferencesHelper

    companion object {
        @Provides
        @Singleton
        fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
            return Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "app_database"
            ).build()
        }

        @Provides
        fun provideRecentFileDao(appDatabase: AppDatabase): RecentFileDao {
            return appDatabase.recentFileDao()
        }
    }
}