package com.ayokunlepaul.routine

import com.ayokunlepaul.domain.interactors.routine.CreateRoutineUseCase
import com.ayokunlepaul.routine.models.RoutineModel
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class RoutinelyTest {

    @MockK
    lateinit var createRoutineUseCase: CreateRoutineUseCase

    private val routineName = "First Routine"
    private val routineDescription = "This is my first routine description"
    private val frequency = RoutineModel.FREQUENCY.HOURLY

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxUnitFun = true)
    }

    @After
    fun tearDown() {
    }

    @Test
    fun createRoutine() {
//        val onCompleted: ((String?) -> Unit)
//        every { onCompleted.invoke(null) }
//        createRoutineUseCase.executeCompletableUseCaseAndPerformAction()
    }

    @Test
    fun getAllRoutines() {
    }

    @Test
    fun getNextUpRoutines() {
    }

    @Test
    fun cleanup() {
    }
}