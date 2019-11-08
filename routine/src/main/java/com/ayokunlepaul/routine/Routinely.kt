package com.ayokunlepaul.routine

import android.content.Context
import com.ayokunlepaul.domain.interactors.routine.CreateRoutineUseCase
import com.ayokunlepaul.domain.interactors.routine.GetAllRoutinesUseCase
import com.ayokunlepaul.routine.models.RoutineModel
import com.ayokunlepaul.routine.utils.FrequencyConverter
import javax.inject.Inject

/**
 * [Class] Routinely is the access point for the routine library.
 * @param context is the context of the
 */
class Routinely @Inject constructor(
    context: Context,
    private val createRoutineUseCase: CreateRoutineUseCase,
    private val getAllRoutinesUseCase: GetAllRoutinesUseCase
) {
    /**
     * A function for creating a routine.
     * @param routineName is the name [title] of the routine.
     * @param routineDescription is the description for this routine.
     * @param routineFrequency is the frequency of which this routine should be repeated.
     * @param onCompleted is a callback for delivering result back to the call point.
     */
    fun createRoutine(
        routineName: String,
        routineDescription: String,
        routineFrequency: RoutineModel.FREQUENCY,
        onCompleted: (String?) -> Unit
    ) {
        val parameter = CreateRoutineUseCase.Parameter(
            routineName = routineName,
            routineDescription = routineDescription,
            frequency = FrequencyConverter.convertToDomainFrequency(routineFrequency)
        )
        createRoutineUseCase.executeCompletableUseCaseAndPerformAction(parameter, {
            onCompleted.invoke(null)
        }) {
            onCompleted.invoke(it)
        }
    }

    /**
     * A function for getting all creating routines.
     * @param onCompleted is a callback for delivering result back to the call point.
     */
    fun getAllRoutines(
        onCompleted: (List<RoutineModel>) -> Unit
    ) {
        getAllRoutinesUseCase.executeObservableUseCaseAndPerformAction(onSuccess = {
            onCompleted.invoke(
                it.map { routine ->
                    RoutineModel(
                        timeCreated = routine.timeCreated,
                        routineDescription = routine.routineDescription,
                        routineTitle = routine.routineTitle,
                        totalCompletedRoutines = routine.totalCompletedRoutines,
                        totalMissedRoutines = routine.totalMissedRoutines,
                        routineId = routine.routineId
                    )
                }
            )
        }, onError = {
            onCompleted.invoke(emptyList())
        })
    }

    /**
     * A function for getting all [nextUp] routines.
     * A [nextUp] routine is a routine that will happen in the next 12 hours
     * @param onCompleted is a callback for delivering result back to the call point.
     */
    fun getNextUpRoutines(
        onCompleted: (List<RoutineModel>) -> Unit
    ) {
        getAllRoutinesUseCase.executeObservableUseCaseAndPerformAction(onSuccess = {
            val upNextRoutines = it.filter { routine -> routine.isUpNext }
            onCompleted.invoke(
                upNextRoutines.map { routine ->
                    RoutineModel(
                        timeCreated = routine.timeCreated,
                        routineDescription = routine.routineDescription,
                        routineTitle = routine.routineTitle,
                        totalCompletedRoutines = routine.totalCompletedRoutines,
                        totalMissedRoutines = routine.totalMissedRoutines,
                        routineId = routine.routineId
                    )
                }
            )
        }, onError = {
            onCompleted.invoke(emptyList())
        })
    }

    /**
     * Clean up and dispose all Rx subscriptions.
     */
    fun cleanup() {
        createRoutineUseCase.dispose()
        getAllRoutinesUseCase.dispose()
    }

//    companion object : SingletonHolder<Context, Routinely>(::Routinely)
}