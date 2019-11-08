package com.ayokunlepaul.routinely.di.modules

import com.ayokunlepaul.core.base.BaseViewModel
import com.ayokunlepaul.core.di.keys.RoutinelyViewModelKey
import com.ayokunlepaul.core.di.scopes.PerActivity
import com.ayokunlepaul.routinely.presentation.MainActivityViewModel
import com.ayokunlepaul.routinely.presentation.fragments.CreateRoutineFragmentViewModel
import com.ayokunlepaul.routinely.presentation.fragments.MainFragmentViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @PerActivity
    @RoutinelyViewModelKey(MainActivityViewModel::class)
    abstract fun bindMainActivityViewModel(
        viewModel: MainActivityViewModel
    ): BaseViewModel

    @Binds
    @IntoMap
    @PerActivity
    @RoutinelyViewModelKey(MainFragmentViewModel::class)
    abstract fun bindMainFragmentViewModel(
        viewModel: MainFragmentViewModel
    ): BaseViewModel

    @Binds
    @IntoMap
    @PerActivity
    @RoutinelyViewModelKey(CreateRoutineFragmentViewModel::class)
    abstract fun bindCreateRoutineFragmentViewModel(
        viewModel: CreateRoutineFragmentViewModel
    ): BaseViewModel
}