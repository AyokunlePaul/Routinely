package com.ayokunlepaul.core.utils

import com.ayokunlepaul.domain.utils.ExecutionThread
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class ExecutionThreadImpl @Inject constructor() : ExecutionThread {

    override val observationThread: Scheduler
        get() = AndroidSchedulers.mainThread()
    override val executionThread: Scheduler
        get() = Schedulers.io()
}