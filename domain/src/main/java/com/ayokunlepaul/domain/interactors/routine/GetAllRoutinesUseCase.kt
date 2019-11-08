package com.ayokunlepaul.domain.interactors.routine

import com.ayokunlepaul.domain.interactors.ObservableUseCase
import com.ayokunlepaul.domain.local.DomainRoutineLocal
import com.ayokunlepaul.domain.models.Routine
import com.ayokunlepaul.domain.utils.ExecutionThread
import io.reactivex.Observable
import javax.inject.Inject

class GetAllRoutinesUseCase @Inject constructor(
    executionThread: ExecutionThread,
    private val domainRoutineLocal: DomainRoutineLocal
): ObservableUseCase<Unit, List<Routine>>(executionThread) {

    override fun buildObservableUseCase(parameter: Unit?): Observable<List<Routine>> {
        return domainRoutineLocal.getAllRoutines()
    }
}