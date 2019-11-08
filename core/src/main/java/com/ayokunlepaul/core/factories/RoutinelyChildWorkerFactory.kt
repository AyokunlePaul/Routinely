package com.ayokunlepaul.core.factories

import android.content.Context
import androidx.work.ListenableWorker
import androidx.work.WorkerParameters

interface RoutinelyChildWorkerFactory {

    fun create(
        context: Context,
        params: WorkerParameters
    ): ListenableWorker
}