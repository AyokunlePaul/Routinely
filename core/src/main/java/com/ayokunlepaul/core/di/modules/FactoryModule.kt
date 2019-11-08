package com.ayokunlepaul.core.di.modules

import androidx.lifecycle.ViewModelProvider
import androidx.work.WorkerFactory
import com.ayokunlepaul.core.factories.RoutinelyViewModelFactory
import com.ayokunlepaul.core.factories.RoutinelyWorkerFactory
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class FactoryModule {

//    @Singleton
//    @Binds
//    internal abstract fun bindWorkerFactory(
//        factory: RoutinelyWorkerFactory
//    ): WorkerFactory

    @Singleton
    @Binds
    internal abstract fun bindViewModelFactory(
        factory: RoutinelyViewModelFactory
    ): ViewModelProvider.Factory
}