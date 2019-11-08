package com.ayokunlepaul.routinely.presentation.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ayokunlepaul.core.base.BaseViewModel
import com.ayokunlepaul.routine.Routinely
import com.ayokunlepaul.routine.models.RoutineModel
import javax.inject.Inject

class MainFragmentViewModel @Inject constructor(
    private val routinely: Routinely
): BaseViewModel() {

    private val _routines = MutableLiveData<List<RoutineModel>>()
    val routines: LiveData<List<RoutineModel>>
        get() = _routines

    fun getRoutines() {
        routinely.getAllRoutines {
            _routines.postValue(it)
        }
    }

    fun getNextUpRoutines() {
        routinely.getNextUpRoutines {
            _routines.postValue(it)
        }
    }

    override fun onCleared() {
        super.onCleared()
        routinely.cleanup()
    }
}