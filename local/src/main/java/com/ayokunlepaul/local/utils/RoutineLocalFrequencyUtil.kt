package com.ayokunlepaul.local.utils

import com.ayokunlepaul.repository.models.RoutineEntity

object RoutineLocalFrequencyUtil {

    fun convertFrequencyToLocal(frequency: RoutineEntity.FREQUENCY): Int {
        return when (frequency) {
            RoutineEntity.FREQUENCY.HOURLY -> 0
            RoutineEntity.FREQUENCY.DAILY -> 1
            RoutineEntity.FREQUENCY.WEEKLY -> 2
            RoutineEntity.FREQUENCY.MONTHLY -> 3
            else -> 4
        }
    }

    fun convertFrequencyToRepository(frequency: Int): RoutineEntity.FREQUENCY {
        return when (frequency) {
            0 -> RoutineEntity.FREQUENCY.HOURLY
            1 -> RoutineEntity.FREQUENCY.DAILY
            2 -> RoutineEntity.FREQUENCY.WEEKLY
            3 -> RoutineEntity.FREQUENCY.MONTHLY
            else -> RoutineEntity.FREQUENCY.YEARLY
        }
    }
}