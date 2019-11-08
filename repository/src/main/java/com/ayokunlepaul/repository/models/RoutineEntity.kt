package com.ayokunlepaul.repository.models

data class RoutineEntity (
    val routineId: String,
    val timeCreated: Long,
    val routineTitle: String,
    val routineDescription: String,
    val totalMissedRoutines: Int,
    val frequency: FREQUENCY,
    val totalCompletedRoutines: Int
) {
    enum class FREQUENCY {
        HOURLY, DAILY, WEEKLY, MONTHLY, YEARLY
    }
}