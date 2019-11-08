package com.ayokunlepaul.routinely.di.modules

import com.ayokunlepaul.core.di.scopes.PerReceiver
import com.ayokunlepaul.core.receivers.AlarmReceiver
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ReceiverBindingModule {

    @ContributesAndroidInjector
    @PerReceiver
    internal abstract fun bindAlarmReceiver(): AlarmReceiver
}