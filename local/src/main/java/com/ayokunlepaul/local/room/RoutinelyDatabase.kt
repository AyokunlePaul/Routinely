package com.ayokunlepaul.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ayokunlepaul.local.BuildConfig
import com.ayokunlepaul.local.models.RoutineLocalModel
import com.ayokunlepaul.local.room.daos.RoutineDAO

@Database(
    version = BuildConfig.VERSION_CODE,
    entities = [RoutineLocalModel::class]
)
abstract class RoutinelyDatabase : RoomDatabase() {
    abstract fun getRoutineDAO(): RoutineDAO
}