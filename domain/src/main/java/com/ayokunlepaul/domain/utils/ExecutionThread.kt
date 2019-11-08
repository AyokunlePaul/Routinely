package com.ayokunlepaul.domain.utils

import io.reactivex.Scheduler

interface ExecutionThread {
    val observationThread: Scheduler
    val executionThread: Scheduler
}