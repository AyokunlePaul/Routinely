package com.ayokunlepaul.core.utils

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

inline fun <reified RECEIVER: BroadcastReceiver> createBroadcastIntent (
    context: Context,
    block: Intent.() -> Unit = {}
): Intent {
    val intent = Intent(context, RECEIVER::class.java)
    intent.apply(block)
    return intent
}