package com.ayokunlepaul.core.di

import com.ayokunlepaul.core.di.modules.ContextModule
import com.ayokunlepaul.core.di.modules.DomainModule
import com.ayokunlepaul.core.di.modules.FactoryModule
import com.ayokunlepaul.domain.local.DomainRoutineLocal
import com.ayokunlepaul.domain.utils.ExecutionThread
import com.ayokunlepaul.local.di.RepositoryImplModule
import com.ayokunlepaul.local.di.RoutinelyDatabaseModule
import com.ayokunlepaul.repository.di.DomainImplModule
import com.ayokunlepaul.repository.local.RepositoryRoutineLocal
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        RepositoryImplModule::class, RoutinelyDatabaseModule::class,
        DomainImplModule::class, DomainModule::class,
        ContextModule::class,
        FactoryModule::class
    ]
)
interface RoutinelyCoreComponent {
    fun provideExecutionThread(): ExecutionThread
    fun provideDomainRoutineLocal(): DomainRoutineLocal
    fun provideRepositoryRoutineLocal(): RepositoryRoutineLocal

    @Component.Builder
    interface Builder {
        fun buildCoreComponent(): RoutinelyCoreComponent
        fun provideContextModule(contextModule: ContextModule): Builder
    }
}