package com.ayokunlepaul.domain.interactors

import com.ayokunlepaul.domain.utils.ExecutionThread
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.observers.DisposableSingleObserver

abstract class SingleUseCase <in PARAMETER, RETURN> constructor(
    private val executionThread: ExecutionThread
) {
    private val disposable = CompositeDisposable()

    abstract fun buildSingleUseCase(parameter: PARAMETER? = null): Single<RETURN>

    fun executeSingleUseCase(
        parameter: PARAMETER? = null,
        observer: DisposableSingleObserver<RETURN>
    ) {
        disposable.add(
            buildSingleUseCase(parameter)
                .subscribeOn(executionThread.executionThread)
                .observeOn(executionThread.observationThread)
                .subscribeWith(observer)
        )
    }

    fun executeSingleUseCaseAndPerformAction(
        parameter: PARAMETER? = null,
        onSuccess: (RETURN) -> Unit,
        onError: (String?) -> Unit
    ) {
        disposable.add(
            buildSingleUseCase(parameter)
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