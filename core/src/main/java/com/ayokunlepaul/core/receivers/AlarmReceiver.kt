package com.ayokunlepaul.core.receivers

import android.content.Context
import android.content.Intent
import com.ayokunlepaul.core.notification.RoutinelyNotificationManager
import dagger.android.DaggerBroadcastReceiver
import javax.inject.Inject

class AlarmReceiver : DaggerBroadcastReceiver() {

    @Inject lateinit var notificationManager: RoutinelyNotificationManager

    override fun onReceive(context: Context?, intent: Intent?) {
        super.onReceive(context, intent)
        val title = "Your Routine"
        val body = "You have a routine in ${5} minutes"
        notificationManager.showNotification(title, body)
    }
}