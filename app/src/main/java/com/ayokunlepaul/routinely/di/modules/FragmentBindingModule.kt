package com.ayokunlepaul.routinely.di.modules

import com.ayokunlepaul.core.di.scopes.PerFragment
import com.ayokunlepaul.routinely.presentation.fragments.CreateRoutineFragment
import com.ayokunlepaul.routinely.presentation.fragments.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {

    @PerFragment
    @ContributesAndroidInjector
    abstract fun bindMainFragment(): MainFragment

    @PerFragment
    @ContributesAndroidInjector
    abstract fun bindCreateRoutineFragment(): CreateRoutineFragment
}