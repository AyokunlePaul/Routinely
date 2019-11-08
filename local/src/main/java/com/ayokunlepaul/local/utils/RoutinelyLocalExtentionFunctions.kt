package com.ayokunlepaul.local.utils

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ayokunlepaul.local.models.RoutineLocalModel
import java.util.*

inline fun <reified T: RoomDatabase> database (context: Context, block: RoomDatabase.Builder<T>.() -> Unit): T {
    val database = Room.databaseBuilder(context, T::class.java, RoutinelyLocalConstants.ROUTINELY_DATABASE)
    return database.apply(block).build()
}

internal fun routineLocalModel(block: RoutineLocalModel.() -> Unit): RoutineLocalModel {
    val routineId = UUID.randomUUID().toString()
    val timeCreated = System.currentTimeMillis()
    val routine = RoutineLocalModel(
        routineId = routineId,
        timeCreated = timeCreated
    )
    return routine.apply(block)
}