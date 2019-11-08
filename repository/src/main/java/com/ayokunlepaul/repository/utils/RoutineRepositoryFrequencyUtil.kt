package com.ayokunlepaul.repository.utils

import com.ayokunlepaul.domain.models.Routine
import com.ayokunlepaul.repository.models.RoutineEntity

object RoutineRepositoryFrequencyUtil {

    fun convertFrequencyToRepository(frequency: Routine.FREQUENCY): RoutineEntity.FREQUENCY {
        return when (frequency) {
            Routine.FREQUENCY.HOURLY -> RoutineEntity.FREQUENCY.HOURLY
            Routine.FREQUENCY.DAILY -> RoutineEntity.FREQUENCY.DAILY
            Routine.FREQUENCY.WEEKLY -> RoutineEntity.FREQUENCY.WEEKLY
            Routine.FREQUENCY.MONTHLY -> RoutineEntity.FREQUENCY.MONTHLY
            Routine.FREQUENCY.YEARLY -> RoutineEntity.FREQUENCY.YEARLY
        }
    }

    fun convertFrequencyToDomain(frequency: RoutineEntity.FREQUENCY): Routine.FREQUENCY {
        return when (frequency) {
            RoutineEntity.FREQUENCY.HOURLY -> Routine.FREQUENCY.HOURLY
            RoutineEntity.FREQUENCY.DAILY -> Routine.FREQUENCY.DAILY
            RoutineEntity.FREQUENCY.WEEKLY -> Routine.FREQUENCY.WEEKLY
            RoutineEntity.FREQUENCY.MONTHLY -> Routine.FREQUENCY.MONTHLY
            RoutineEntity.FREQUENCY.YEARLY -> Routine.FREQUENCY.YEARLY
        }
    }
}