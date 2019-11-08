package com.ayokunlepaul.core.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/ayokunlepaul/core/di/RoutinelyCoreComponent;", "", "provideDomainRoutineLocal", "Lcom/ayokunlepaul/domain/local/DomainRoutineLocal;", "provideExecutionThread", "Lcom/ayokunlepaul/domain/utils/ExecutionThread;", "provideRepositoryRoutineLocal", "Lcom/ayokunlepaul/repository/local/RepositoryRoutineLocal;", "Builder", "core_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.ayokunlepaul.local.di.RepositoryImplModule.class, com.ayokunlepaul.local.di.RoutinelyDatabaseModule.class, com.ayokunlepaul.repository.di.DomainImplModule.class, com.ayokunlepaul.core.di.modules.DomainModule.class, com.ayokunlepaul.core.di.modules.ContextModule.class, com.ayokunlepaul.core.di.modules.FactoryModule.class})
public abstract interface RoutinelyCoreComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ayokunlepaul.domain.utils.ExecutionThread provideExecutionThread();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ayokunlepaul.domain.local.DomainRoutineLocal provideDomainRoutineLocal();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ayokunlepaul.repository.local.RepositoryRoutineLocal provideRepositoryRoutineLocal();
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/ayokunlepaul/core/di/RoutinelyCoreComponent$Builder;", "", "buildCoreComponent", "Lcom/ayokunlepaul/core/di/RoutinelyCoreComponent;", "provideContextModule", "contextModule", "Lcom/ayokunlepaul/core/di/modules/ContextModule;", "core_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.ayokunlepaul.core.di.RoutinelyCoreComponent buildCoreComponent();
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.ayokunlepaul.core.di.RoutinelyCoreComponent.Builder provideContextModule(@org.jetbrains.annotations.NotNull()
        com.ayokunlepaul.core.di.modules.ContextModule contextModule);
    }
}