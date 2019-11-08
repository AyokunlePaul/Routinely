package com.ayokunlepaul.core.receivers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/ayokunlepaul/core/receivers/AlarmReceiver;", "Ldagger/android/DaggerBroadcastReceiver;", "()V", "notificationManager", "Lcom/ayokunlepaul/core/notification/RoutinelyNotificationManager;", "getNotificationManager", "()Lcom/ayokunlepaul/core/notification/RoutinelyNotificationManager;", "setNotificationManager", "(Lcom/ayokunlepaul/core/notification/RoutinelyNotificationManager;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "core_debug"})
public final class AlarmReceiver extends dagger.android.DaggerBroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.ayokunlepaul.core.notification.RoutinelyNotificationManager notificationManager;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ayokunlepaul.core.notification.RoutinelyNotificationManager getNotificationManager() {
        return null;
    }
    
    public final void setNotificationManager(@org.jetbrains.annotations.NotNull()
    com.ayokunlepaul.core.notification.RoutinelyNotificationManager p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    public AlarmReceiver() {
        super();
    }
}