package com.ayokunlepaul.local.di

import com.ayokunlepaul.local.impl.RepositoryRoutineLocalImpl
import com.ayokunlepaul.repository.local.RepositoryRoutineLocal
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryImplModule {

    @Binds
    abstract fun provideRepositoryRoutineLocal(
        repositoryRoutineLocal: RepositoryRoutineLocalImpl
    ): RepositoryRoutineLocal
}