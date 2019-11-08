package com.ayokunlepaul.core.di.keys

import com.ayokunlepaul.core.base.BaseViewModel
import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
annotation class RoutinelyViewModelKey (val value: KClass<out BaseViewModel>)