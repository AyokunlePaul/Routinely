package com.ayokunlepaul.local.di

import android.content.Context
import com.ayokunlepaul.local.room.RoutinelyDatabase
import com.ayokunlepaul.local.room.daos.RoutineDAO
import com.ayokunlepaul.local.utils.database
import dagger.Module
import dagger.Provides

@Module
class RoutinelyDatabaseModule {

    @Provides
    internal fun provideRoutinelyDatabase(context: Context): RoutinelyDatabase {
        return database(context) {
            allowMainThreadQueries()
            fallbackToDestructiveMigration()
        }
    }

    @Provides
    internal fun provideRoutineDAO(database: RoutinelyDatabase): RoutineDAO =
        database.getRoutineDAO()
}