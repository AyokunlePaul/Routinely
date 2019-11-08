package com.ayokunlepaul.local.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RoutineLocalModel (
    @PrimaryKey val routineId: String,
    var timeCreated: Long,
    var routineTitle: String? = null,
    var routineDescription: String? = null,
    var routineFrequency: Int = 0,
    var routineState: Int = 0,
    var totalMissedRoutines: Int = 0,
    var totalCompletedRoutine: Int = 0
) {
    val expiryTime: Long?
        get() = timeCreated + 900000 /*900000 is 15 minutes*/
}