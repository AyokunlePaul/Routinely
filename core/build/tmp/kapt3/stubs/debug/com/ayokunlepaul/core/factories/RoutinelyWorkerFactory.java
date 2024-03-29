package com.ayokunlepaul.core.factories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B,\u0012%\u0010\u0002\u001a!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003\u00a2\u0006\u0002\b\b\u00a2\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R-\u0010\u0002\u001a!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003\u00a2\u0006\u0002\b\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/ayokunlepaul/core/factories/RoutinelyWorkerFactory;", "Landroidx/work/WorkerFactory;", "workerCreators", "", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "Ljavax/inject/Provider;", "Lcom/ayokunlepaul/core/factories/RoutinelyChildWorkerFactory;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;)V", "createWorker", "appContext", "Landroid/content/Context;", "workerClassName", "", "workerParameters", "Landroidx/work/WorkerParameters;", "core_debug"})
public final class RoutinelyWorkerFactory extends androidx.work.WorkerFactory {
    private final java.util.Map<java.lang.Class<? extends androidx.work.ListenableWorker>, javax.inject.Provider<com.ayokunlepaul.core.factories.RoutinelyChildWorkerFactory>> workerCreators = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.work.ListenableWorker createWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    java.lang.String workerClassName, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters workerParameters) {
        return null;
    }
    
    public RoutinelyWorkerFactory(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Class<? extends androidx.work.ListenableWorker>, javax.inject.Provider<com.ayokunlepaul.core.factories.RoutinelyChildWorkerFactory>> workerCreators) {
        super();
    }
}