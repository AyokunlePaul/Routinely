package com.ayokunlepaul.repository.di

import com.ayokunlepaul.domain.local.DomainRoutineLocal
import com.ayokunlepaul.repository.impl.DomainRoutineLocalImpl
import dagger.Binds
import dagger.Module

@Module
abstract class DomainImplModule {

    @Binds
    internal abstract fun bindDomainRoutineLocal(
        domainRoutineLocal: DomainRoutineLocalImpl
    ): DomainRoutineLocal
}