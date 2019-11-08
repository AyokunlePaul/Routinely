package com.ayokunlepaul.routinely.impl

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.widget.Toast
import androidx.core.content.getSystemService
import com.ayokunlepaul.core.alarm.RoutinelyAlarmManager
import com.ayokunlepaul.core.receivers.AlarmReceiver
import com.ayokunlepaul.core.utils.createBroadcastIntent
import com.ayokunlepaul.routine.models.RoutineModel
import javax.inject.Inject
import kotlin.random.Random

class RoutinelyAlarmManagerImpl @Inject constructor(
    private val context: Context
) : RoutinelyAlarmManager {

    private val alarmManager = context.getSystemService<AlarmManager>()!!

    override fun scheduleAlarm(frequency: RoutineModel.FREQUENCY) {
        when (frequency) {
            RoutineModel.FREQUENCY.HOURLY -> {
                val intent = createBroadcastIntent<AlarmReceiver>(context)
                val pendingIntent = PendingIntent.getBroadcast(context, Random(System.currentTimeMillis()).nextInt(), intent, 0)
                alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (3_600_000L - 300_000L), 3_600_000L, pendingIntent)
                Toast.makeText(context, "Alarm Scheduled", Toast.LENGTH_LONG).show()
            }
            RoutineModel.FREQUENCY.DAILY -> {
                val intent = createBroadcastIntent<AlarmReceiver>(context)
                val pendingIntent = PendingIntent.getBroadcast(context, Random(System.currentTimeMillis()).nextInt(), intent, 0)
                alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (86_400_000L - 300_000L), 86_400_000L, pendingIntent)
                Toast.makeText(context, "Alarm Scheduled", Toast.LENGTH_LONG).show()
            }
            RoutineModel.FREQUENCY.WEEKLY -> {
                val intent = createBroadcastIntent<AlarmReceiver>(context)
                val pendingIntent = PendingIntent.getBroadcast(context, Random(System.currentTimeMillis()).nextInt(), intent, 0)
                alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (604_800_000L - 300_000L), 604_800_000L, pendingIntent)
                Toast.makeText(context, "Alarm Scheduled", Toast.LENGTH_LONG).show()
            }
            RoutineModel.FREQUENCY.MONTHLY -> {
                val intent = createBroadcastIntent<AlarmReceiver>(context)
                val pendingIntent = PendingIntent.getBroadcast(context, Random(System.currentTimeMillis()).nextInt(), intent, 0)
                alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (2_592_000_000L - 300_000L), 2_592_000_000L, pendingIntent)
                Toast.makeText(context, "Alarm Scheduled", Toast.LENGTH_LONG).show()
            }
            else -> {
                val intent = createBroadcastIntent<AlarmReceiver>(context)
                val pendingIntent = PendingIntent.getBroadcast(context, Random(System.currentTimeMillis()).nextInt(), intent, 0)
                alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (31_556_952_000L - 300_000L), 31_556_952_000L, pendingIntent)
                Toast.makeText(context, "Alarm Scheduled", Toast.LENGTH_LONG).show()
            }
        }
    }
}