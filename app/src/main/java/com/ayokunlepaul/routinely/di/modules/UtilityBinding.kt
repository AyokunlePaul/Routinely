package com.ayokunlepaul.routinely.di.modules

import android.content.Context
import com.ayokunlepaul.routinely.RoutinelyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UtilityBinding {

    @Provides
    @Singleton
    fun provideRoutinelyActivity(application: RoutinelyApplication): Context
            = application.applicationContext
}