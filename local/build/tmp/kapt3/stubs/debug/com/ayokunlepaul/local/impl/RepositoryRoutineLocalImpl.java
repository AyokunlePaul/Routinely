package com.ayokunlepaul.local.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/ayokunlepaul/local/impl/RepositoryRoutineLocalImpl;", "Lcom/ayokunlepaul/repository/local/RepositoryRoutineLocal;", "routineDAO", "Lcom/ayokunlepaul/local/room/daos/RoutineDAO;", "(Lcom/ayokunlepaul/local/room/daos/RoutineDAO;)V", "createRoutine", "Lio/reactivex/Completable;", "name", "", "description", "frequency", "Lcom/ayokunlepaul/repository/models/RoutineEntity$FREQUENCY;", "getAllRoutines", "Lio/reactivex/Observable;", "", "Lcom/ayokunlepaul/repository/models/RoutineEntity;", "local_debug"})
public final class RepositoryRoutineLocalImpl implements com.ayokunlepaul.repository.local.RepositoryRoutineLocal {
    private final com.ayokunlepaul.local.room.daos.RoutineDAO routineDAO = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable createRoutine(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    com.ayokunlepaul.repository.models.RoutineEntity.FREQUENCY frequency) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<com.ayokunlepaul.repository.models.RoutineEntity>> getAllRoutines() {
        return null;
    }
    
    @javax.inject.Inject()
    public RepositoryRoutineLocalImpl(@org.jetbrains.annotations.NotNull()
    com.ayokunlepaul.local.room.daos.RoutineDAO routineDAO) {
        super();
    }
}