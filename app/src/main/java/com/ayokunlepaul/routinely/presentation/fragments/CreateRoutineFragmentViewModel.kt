package com.ayokunlepaul.routinely.presentation.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ayokunlepaul.core.alarm.RoutinelyAlarmManager
import com.ayokunlepaul.core.base.BaseViewModel
import com.ayokunlepaul.routine.Routinely
import com.ayokunlepaul.routine.models.RoutineModel
import javax.inject.Inject

class CreateRoutineFragmentViewModel @Inject constructor(
    private val routinely: Routinely,
    private val alarmManager: RoutinelyAlarmManager
): BaseViewModel() {

    val routineName = MutableLiveData<String>()
    val routineDescription = MutableLiveData<String>()
    val routineFrequency = MutableLiveData<String>()

    private val _routineLiveData = MutableLiveData<String?>()
    val routineLiveData: LiveData<String?>
        get() = _routineLiveData

    val frequencies = listOf("HOURLY", "DAILY", "WEEKLY", "MONTHLY", "YEARLY")

    fun createRoutine() {
        when {
            routineName.value == null -> {
                _routineLiveData.postValue("Please enter routine name")
                return
            }
            routineDescription.value == null -> {
                _routineLiveData.postValue("Please enter routine description")
                return
            }
            routineFrequency.value == null -> {
                _routineLiveData.postValue("Please select routine frequency")
                return
            }
        }
        routinely.createRoutine(
            routineName = routineName.value!!,
            routineDescription = routineDescription.value!!,
            routineFrequency = frequency,
            onCompleted = object : ((String?) -> Unit) {
                override fun invoke(p1: String?) {
                    alarmManager.scheduleAlarm(frequency)
                    _routineLiveData.postValue(p1)
                }
            }
        )
    }

    private val frequency: RoutineModel.FREQUENCY
        get() = when (frequencies.indexOf(routineFrequency.value)) {
            0 -> RoutineModel.FREQUENCY.HOURLY
            1 -> RoutineModel.FREQUENCY.DAILY
            1 -> RoutineModel.FREQUENCY.WEEKLY
            1 -> RoutineModel.FREQUENCY.MONTHLY
            else -> RoutineModel.FREQUENCY.YEARLY
        }

    override fun onCleared() {
        super.onCleared()
        routinely.cleanup()
    }
}