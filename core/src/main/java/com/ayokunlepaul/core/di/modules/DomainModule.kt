package com.ayokunlepaul.core.di.modules

import com.ayokunlepaul.core.utils.ExecutionThreadImpl
import com.ayokunlepaul.domain.utils.ExecutionThread
import dagger.Binds
import dagger.Module

@Module
abstract class DomainModule {

    @Binds
    internal abstract fun bindDomainExecutionThread(
        impl: ExecutionThreadImpl
    ): ExecutionThread
}