package com.ayokunlepaul.core.factories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ayokunlepaul.core.base.BaseViewModel
import javax.inject.Inject
import javax.inject.Provider

class RoutinelyViewModelFactory @Inject constructor(
    private val creators: @JvmSuppressWildcards Map<Class<out BaseViewModel>, Provider<BaseViewModel>>
): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val found = creators.entries.find { modelClass.isAssignableFrom(it.key) }
        val creator = found?.value
            ?: throw IllegalArgumentException("Unknown model class $modelClass")
        try {
            @Suppress("UNCHECKED_CAST")
            return creator.get() as T
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }
}