package com.ayokunlepaul.repository.local

import com.ayokunlepaul.repository.models.RoutineEntity
import io.reactivex.Completable
import io.reactivex.Observable

interface RepositoryRoutineLocal {

    fun createRoutine(
        name: String,
        description: String,
        frequency: RoutineEntity.FREQUENCY
    ): Completable

    fun getAllRoutines(): Observable<List<RoutineEntity>>
}