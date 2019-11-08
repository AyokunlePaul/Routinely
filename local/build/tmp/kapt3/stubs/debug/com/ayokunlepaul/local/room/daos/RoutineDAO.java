package com.ayokunlepaul.local.room.daos;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\'\u00a8\u0006\r"}, d2 = {"Lcom/ayokunlepaul/local/room/daos/RoutineDAO;", "", "deleteRoutineWithId", "", "routineId", "", "getAllRoutines", "Lio/reactivex/Observable;", "", "Lcom/ayokunlepaul/local/models/RoutineLocalModel;", "saveRoutine", "Lio/reactivex/Completable;", "routineLocalModel", "local_debug"})
public abstract interface RoutineDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract io.reactivex.Completable saveRoutine(@org.jetbrains.annotations.NotNull()
    com.ayokunlepaul.local.models.RoutineLocalModel routineLocalModel);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM RoutineLocalModel")
    public abstract io.reactivex.Observable<java.util.List<com.ayokunlepaul.local.models.RoutineLocalModel>> getAllRoutines();
    
    @androidx.room.Query(value = "DELETE FROM RoutineLocalModel WHERE routineId = :routineId")
    public abstract void deleteRoutineWithId(@org.jetbrains.annotations.NotNull()
    java.lang.String routineId);
}