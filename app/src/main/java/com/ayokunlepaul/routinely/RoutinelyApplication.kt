package com.ayokunlepaul.routinely

import com.ayokunlepaul.core.di.DaggerRoutinelyCoreComponent
import com.ayokunlepaul.core.di.modules.ContextModule
import com.ayokunlepaul.routinely.di.DaggerRoutinelyApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class RoutinelyApplication : DaggerApplication() {

    private val coreComponent by lazy {
        DaggerRoutinelyCoreComponent.builder().provideContextModule(ContextModule(applicationContext)).buildCoreComponent()
    }

    override fun onCreate() {
        super.onCreate()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerRoutinelyApplicationComponent.builder()
            .addCoreComponent(coreComponent)
            .bindRoutinelyApplication(this)
            .buildRoutinelyComponent()
    }
}