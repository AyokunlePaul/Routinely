package com.ayokunlepaul.routine.utils

import com.ayokunlepaul.domain.models.Routine
import com.ayokunlepaul.routine.models.RoutineModel

internal object FrequencyConverter {

    fun convertToDomainFrequency(frequency: RoutineModel.FREQUENCY): Routine.FREQUENCY {
        return when (frequency) {
            RoutineModel.FREQUENCY.HOURLY -> Routine.FREQUENCY.HOURLY
            RoutineModel.FREQUENCY.DAILY -> Routine.FREQUENCY.DAILY
            RoutineModel.FREQUENCY.WEEKLY -> Routine.FREQUENCY.WEEKLY
            RoutineModel.FREQUENCY.MONTHLY -> Routine.FREQUENCY.MONTHLY
            else -> Routine.FREQUENCY.YEARLY
        }
    }
}