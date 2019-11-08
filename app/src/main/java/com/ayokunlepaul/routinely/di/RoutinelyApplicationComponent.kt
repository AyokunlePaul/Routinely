package com.ayokunlepaul.routinely.di

import com.ayokunlepaul.core.di.RoutinelyCoreComponent
import com.ayokunlepaul.routinely.RoutinelyApplication
import com.ayokunlepaul.routinely.di.modules.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBindingModule::class, FragmentBindingModule::class,
        ViewModelModule::class, UtilityBinding::class, ManagerBindingModule::class,
        ReceiverBindingModule::class
    ],
    dependencies = [RoutinelyCoreComponent::class]
)
@Singleton
interface RoutinelyApplicationComponent : AndroidInjector<RoutinelyApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun bindRoutinelyApplication(
            application: RoutinelyApplication
        ): Builder
        fun addCoreComponent(component: RoutinelyCoreComponent): Builder
        fun buildRoutinelyComponent(): RoutinelyApplicationComponent
    }
}