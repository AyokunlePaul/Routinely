package com.ayokunlepaul.routinely.notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.graphics.Color
import android.media.RingtoneManager
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import androidx.core.content.getSystemService
import com.ayokunlepaul.core.notification.RoutinelyNotificationManager
import com.ayokunlepaul.routinely.R
import javax.inject.Inject
import kotlin.random.Random

class RoutinelyNotificationManagerImpl @Inject constructor(
    private val context: Context
) : RoutinelyNotificationManager {

    override fun showNotification(title: String, body: String) {
        val id = Random.nextInt()

        val soundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)

        val manager = context.getSystemService<NotificationManager>()
        val notificationBuilder = NotificationCompat.Builder(context, DEFAULT_NOTIFICATION_CHANNEL_NAME)
        notificationBuilder.apply {
            setSound(soundUri)
            setContentTitle(title)
            setContentText(body)
            setSmallIcon(R.mipmap.ic_launcher_round)
            color = ContextCompat.getColor(context, R.color.colorPrimary)
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            setupChannels(manager)
        }
        manager?.notify(TAG, id, notificationBuilder.build())
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private fun setupChannels(notificationManager: NotificationManager?) {
        val adminChannelName = DEFAULT_NOTIFICATION_ADMIN_CHANNEL_NAME
        val adminChannelDescription = DEFAULT_NOTIFICATION_ADMIN_CHANNEL_DESCRIPTION
        val adminChannel: NotificationChannel
        adminChannel = NotificationChannel(DEFAULT_NOTIFICATION_CHANNEL_NAME, adminChannelName, NotificationManager.IMPORTANCE_LOW)
        adminChannel.description = adminChannelDescription
        adminChannel.enableLights(true)
        adminChannel.lightColor = Color.RED
        adminChannel.enableVibration(true)
        notificationManager?.createNotificationChannel(adminChannel)
    }

    companion object {
        const val TAG = ""
        const val DEFAULT_NOTIFICATION_CHANNEL_NAME = "Routinely"
        const val DEFAULT_NOTIFICATION_ADMIN_CHANNEL_NAME = "Routinely Channel"
        const val DEFAULT_NOTIFICATION_ADMIN_CHANNEL_DESCRIPTION = "Routinely Channel Description"
    }
}