package com.ayokunlepaul.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/ayokunlepaul/core/utils/ExecutionThreadImpl;", "Lcom/ayokunlepaul/domain/utils/ExecutionThread;", "()V", "executionThread", "Lio/reactivex/Scheduler;", "getExecutionThread", "()Lio/reactivex/Scheduler;", "observationThread", "getObservationThread", "core_debug"})
public final class ExecutionThreadImpl implements com.ayokunlepaul.domain.utils.ExecutionThread {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler getObservationThread() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler getExecutionThread() {
        return null;
    }
    
    @javax.inject.Inject()
    public ExecutionThreadImpl() {
        super();
    }
}