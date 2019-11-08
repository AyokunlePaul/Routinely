package com.ayokunlepaul.routinely.di.modules

import com.ayokunlepaul.core.alarm.RoutinelyAlarmManager
import com.ayokunlepaul.core.notification.RoutinelyNotificationManager
import com.ayokunlepaul.routinely.impl.RoutinelyAlarmManagerImpl
import com.ayokunlepaul.routinely.notification.RoutinelyNotificationManagerImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class ManagerBindingModule {

    @Binds
    @Singleton
    internal abstract fun bindAlarmManager(
        manager: RoutinelyAlarmManagerImpl
    ): RoutinelyAlarmManager

    @Binds
    @Singleton
    internal abstract fun bindNotificationManager(
        manager: RoutinelyNotificationManagerImpl
    ): RoutinelyNotificationManager
}