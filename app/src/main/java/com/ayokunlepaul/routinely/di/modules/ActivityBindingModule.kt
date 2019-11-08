package com.ayokunlepaul.routinely.di.modules

import com.ayokunlepaul.core.di.scopes.PerActivity
import com.ayokunlepaul.routinely.presentation.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @PerActivity
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}