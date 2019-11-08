package com.ayokunlepaul.local.impl

import com.ayokunlepaul.local.room.daos.RoutineDAO
import com.ayokunlepaul.local.utils.RoutineLocalFrequencyUtil
import com.ayokunlepaul.local.utils.routineLocalModel
import com.ayokunlepaul.repository.local.RepositoryRoutineLocal
import com.ayokunlepaul.repository.models.RoutineEntity
import io.reactivex.Completable
import io.reactivex.Observable
import javax.inject.Inject

class RepositoryRoutineLocalImpl @Inject constructor(
    private val routineDAO: RoutineDAO
) : RepositoryRoutineLocal {

    override fun createRoutine(
        name: String,
        description: String,
        frequency: RoutineEntity.FREQUENCY
    ): Completable {
        val routine = routineLocalModel {
            routineTitle = name
            routineDescription = description
            routineFrequency = RoutineLocalFrequencyUtil.convertFrequencyToLocal(frequency)
        }
        return routineDAO.saveRoutine(routine)
    }

    override fun getAllRoutines(): Observable<List<RoutineEntity>> {
        return routineDAO.getAllRoutines().map {
            it.map { routineLocalModel ->
                RoutineEntity(
                    timeCreated = routineLocalModel.timeCreated,
                    routineDescription = routineLocalModel.routineDescription ?: "N/A",
                    routineTitle = routineLocalModel.routineTitle ?: "N/A",
                    totalCompletedRoutines = routineLocalModel.totalCompletedRoutine,
                    totalMissedRoutines = routineLocalModel.totalMissedRoutines,
                    frequency = RoutineLocalFrequencyUtil.convertFrequencyToRepository(routineLocalModel.routineFrequency),
                    routineId = routineLocalModel.routineId
                )
            }
        }
    }
}