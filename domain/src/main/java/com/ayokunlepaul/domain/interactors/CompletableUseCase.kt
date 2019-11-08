package com.ayokunlepaul.domain.interactors

import com.ayokunlepaul.domain.utils.ExecutionThread
import io.reactivex.Completable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableCompletableObserver

abstract class CompletableUseCase <in PARAMETER> constructor(
    private val executionThread: ExecutionThread

) {
    private val disposable = CompositeDisposable()

    abstract fun buildCompletableUseCase(parameter: PARAMETER? = null): Completable

    fun executeCompletableUseCase(
        parameter: PARAMETER? = null,
        observer: DisposableCompletableObserver
    ) {
        disposable.add(
            buildCompletableUseCase(parameter)
                .subscribeOn(executionThread.executionThread)
                .observeOn(executionThread.observationThread)
                .subscribeWith(observer)
        )
    }

    fun executeCompletableUseCaseAndPerformAction(
        parameter: PARAMETER? = null,
        onSuccess: () -> Unit,
        onError: (String?) -> Unit
    ) {
        disposable.add(
            buildCompletableUseCase(parameter)
                .subscribeOn(executionThread.executionThread)
                .observeOn(executionThread.observationThread)
                .subscribe({
                    onSuccess.invoke()
                }) {
                    onError.invoke(it.localizedMessage)
                }
        )
    }

    fun dispose() = disposable.dispose()
}