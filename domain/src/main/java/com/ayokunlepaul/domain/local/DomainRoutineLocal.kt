package com.ayokunlepaul.domain.local

import com.ayokunlepaul.domain.models.Routine
import io.reactivex.Completable
import io.reactivex.Observable

interface DomainRoutineLocal {

    fun createRoutine(
        routineName: String,
        routineDescription: String,
        frequency: Routine.FREQUENCY
    ): Completable

    fun getAllRoutines(): Observable<List<Routine>>
}