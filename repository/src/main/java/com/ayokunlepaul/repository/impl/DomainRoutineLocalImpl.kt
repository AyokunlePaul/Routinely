package com.ayokunlepaul.repository.impl

import com.ayokunlepaul.domain.local.DomainRoutineLocal
import com.ayokunlepaul.domain.models.Routine
import com.ayokunlepaul.repository.local.RepositoryRoutineLocal
import com.ayokunlepaul.repository.utils.RoutineRepositoryFrequencyUtil
import io.reactivex.Completable
import io.reactivex.Observable
import javax.inject.Inject

class DomainRoutineLocalImpl @Inject constructor(
    private val repositoryRoutineLocal: RepositoryRoutineLocal
) : DomainRoutineLocal {

    override fun createRoutine(
        routineName: String,
        routineDescription: String,
        frequency: Routine.FREQUENCY
    ): Completable {
        return repositoryRoutineLocal.createRoutine(
            name = routineName,
            description = routineDescription,
            frequency = RoutineRepositoryFrequencyUtil.convertFrequencyToRepository(frequency)
        )
    }

    override fun getAllRoutines(): Observable<List<Routine>> {
        return repositoryRoutineLocal.getAllRoutines().map {
            it.map { routineEntity ->
                Routine(
                    timeCreated = routineEntity.timeCreated,
                    routineDescription = routineEntity.routineDescription,
                    routineTitle = routineEntity.routineTitle,
                    totalCompletedRoutines = routineEntity.totalCompletedRoutines,
                    totalMissedRoutines = routineEntity.totalMissedRoutines,
                    frequency = RoutineRepositoryFrequencyUtil.convertFrequencyToDomain(routineEntity.frequency),
                    routineId = routineEntity.routineId
                )
            }
        }
    }
}