package com.ayokunlepaul.local.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0001\u00a2\u0006\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lcom/ayokunlepaul/local/di/RoutinelyDatabaseModule;", "", "()V", "provideRoutineDAO", "Lcom/ayokunlepaul/local/room/daos/RoutineDAO;", "database", "Lcom/ayokunlepaul/local/room/RoutinelyDatabase;", "provideRoutineDAO$local_debug", "provideRoutinelyDatabase", "context", "Landroid/content/Context;", "provideRoutinelyDatabase$local_debug", "local_debug"})
@dagger.Module()
public final class RoutinelyDatabaseModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.ayokunlepaul.local.room.RoutinelyDatabase provideRoutinelyDatabase$local_debug(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.ayokunlepaul.local.room.daos.RoutineDAO provideRoutineDAO$local_debug(@org.jetbrains.annotations.NotNull()
    com.ayokunlepaul.local.room.RoutinelyDatabase database) {
        return null;
    }
    
    public RoutinelyDatabaseModule() {
        super();
    }
}