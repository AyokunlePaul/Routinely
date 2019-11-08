package com.ayokunlepaul.core.factories

import android.content.Context
import androidx.work.ListenableWorker
import androidx.work.WorkerFactory
import androidx.work.WorkerParameters
import javax.inject.Inject
import javax.inject.Provider

class RoutinelyWorkerFactory constructor(
    private val workerCreators: @JvmSuppressWildcards Map<Class<out ListenableWorker>, Provider<RoutinelyChildWorkerFactory>>
): WorkerFactory() {

    override fun createWorker(
        appContext: Context,
        workerClassName: String,
        workerParameters: WorkerParameters
    ): ListenableWorker? {
        val worker = workerCreators.entries.find { Class.forName(workerClassName).isAssignableFrom(it.key) }
        val provider = worker?.value ?: throw IllegalArgumentException("Invalid worker. Please ensure that the worker class has been added to the object graph")
        return provider.get().create(
            appContext,
            workerParameters
        )
    }
}