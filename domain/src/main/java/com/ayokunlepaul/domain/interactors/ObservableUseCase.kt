package com.ayokunlepaul.domain.interactors

import com.ayokunlepaul.domain.utils.ExecutionThread
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver

abstract class ObservableUseCase <in PARAMETER, RETURN> constructor(
    private val executionThread: ExecutionThread
) {
    private val disposable = CompositeDisposable()

    abstract fun buildObservableUseCase(parameter: PARAMETER? = null): Observable<RETURN>

    fun executeObservableUseCase(
        parameter: PARAMETER? = null,
        observer: DisposableObserver<RETURN>
    ) {
        disposable.add(
            buildObservableUseCase(parameter)
                .subscribeOn(executionThread.executionThread)
                .observeOn(executionThread.observationThread)
                .subscribeWith(observer)
        )
    }

    fun executeObservableUseCaseAndPerformAction(
        parameter: PARAMETER? = null,
        onSuccess: (RETURN) -> Unit,
        onError: (String?) -> Unit
    ) {
        disposable.add(
            buildObservableUseCase(parameter)
                .subscribeOn(executionThread.executionThread)
                .observeOn(executionThread.observationThread)
                .subscribe({
                    onSuccess.invoke(it)
                }) {
                    onError.invoke(it.localizedMessage)
                }
        )
    }

    fun dispose() = disposable.dispose()
}