package com.ayokunlepaul.domain.interactors.routine

import com.ayokunlepaul.domain.interactors.CompletableUseCase
import com.ayokunlepaul.domain.local.DomainRoutineLocal
import com.ayokunlepaul.domain.models.Routine
import com.ayokunlepaul.domain.utils.ExecutionThread
import io.reactivex.Completable
import javax.inject.Inject

class CreateRoutineUseCase @Inject constructor(
    executionThread: ExecutionThread,
    private val domainRoutineLocal: DomainRoutineLocal
) : CompletableUseCase<CreateRoutineUseCase.Parameter>(executionThread){

    override fun buildCompletableUseCase(parameter: Parameter?): Completable {
        return parameter?.let {
            domainRoutineLocal.createRoutine(
                routineName = it.routineName,
                frequency = it.frequency,
                routineDescription = it.routineDescription
            )
        } ?: throw  IllegalArgumentException("Create routine parameter cannot be null")
    }

    data class Parameter(
        val routineName: String,
        val routineDescription: String,
        val frequency: Routine.FREQUENCY
    )
}