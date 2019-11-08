package com.ayokunlepaul.local.room.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ayokunlepaul.local.models.RoutineLocalModel
import io.reactivex.Completable
import io.reactivex.Observable

@Dao
interface RoutineDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveRoutine(routineLocalModel: RoutineLocalModel): Completable

    @Query("SELECT * FROM RoutineLocalModel")
    fun getAllRoutines(): Observable<List<RoutineLocalModel>>

    @Query("DELETE FROM RoutineLocalModel WHERE routineId = :routineId")
    fun deleteRoutineWithId(routineId: String)
}