package com.ayokunlepaul.core.alarm

import com.ayokunlepaul.routine.models.RoutineModel

interface RoutinelyAlarmManager {

    fun scheduleAlarm(frequency: RoutineModel.FREQUENCY)
}