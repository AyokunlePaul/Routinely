package com.ayokunlepaul.domain.models

import kotlin.math.absoluteValue

data class Routine (
    val routineId: String,
    val timeCreated: Long,
    val routineTitle: String,
    val routineDescription: String,
    val totalMissedRoutines: Int,
    val frequency: FREQUENCY,
    val totalCompletedRoutines: Int
) {

    /*Converts the frequency to integer*/
    val frequencyInt: Int
        get() {
            return when (frequency) {
                FREQUENCY.HOURLY -> 0
                FREQUENCY.DAILY -> 1
                FREQUENCY.WEEKLY -> 2
                FREQUENCY.MONTHLY -> 3
                else -> 4
            }
        }

    /**
     * A routine is up next if it will occur in the next 12 hours
     */
    val isUpNext: Boolean
        get() {
            val totalNumberOfTimesRoutineExecuted = if (totalMissedRoutines + totalCompletedRoutines
                != 0) totalMissedRoutines + totalCompletedRoutines else 1
            val nextExecutionTime = when (frequency) {
                FREQUENCY.HOURLY -> totalNumberOfTimesRoutineExecuted * 3_600_000L
                FREQUENCY.DAILY -> totalNumberOfTimesRoutineExecuted * 86_400_000L
                FREQUENCY.WEEKLY -> totalNumberOfTimesRoutineExecuted * 604_800_000L
                FREQUENCY.MONTHLY -> totalNumberOfTimesRoutineExecuted * 2_592_000_000L
                else -> 31_556_952_000L
            }
            return (nextExecutionTime - System.currentTimeMillis()).absoluteValue in 43_200_000..46_800_000
        }

    enum class FREQUENCY {
        HOURLY, DAILY, WEEKLY, MONTHLY, YEARLY
    }
}