package com.ayokunlepaul.routine.models

data class RoutineModel (
    val routineId: String,
    val timeCreated: Long,
    val routineTitle: String,
    val routineDescription: String,
    val totalMissedRoutines: Int,
    val totalCompletedRoutines: Int
) {
    enum class FREQUENCY {
        HOURLY, DAILY, WEEKLY, MONTHLY, YEARLY
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RoutineModel

        if (timeCreated != other.timeCreated) return false
        if (routineTitle != other.routineTitle) return false
        if (routineDescription != other.routineDescription) return false
        if (totalMissedRoutines != other.totalMissedRoutines) return false
        if (totalCompletedRoutines != other.totalCompletedRoutines) return false

        return true
    }

    override fun hashCode(): Int {
        var result = timeCreated.hashCode()
        result = 31 * result + routineTitle.hashCode()
        result = 31 * result + routineDescription.hashCode()
        result = 31 * result + totalMissedRoutines
        result = 31 * result + totalCompletedRoutines
        return result
    }


}