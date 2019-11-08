package com.ayokunlepaul.routine.utils

/**
 * @class SingletonHolder is used for handling the single instance provision of a class.
 * @param instanceCreator takes in the argument `ARGUMENT` and returns the instance `INSTANCE`.
 */
internal open class SingletonHolder <in ARGUMENT, out INSTANCE: Any> constructor(
    instanceCreator: SingletonArrayArgument<ARGUMENT, INSTANCE>
) {

    private var instanceCreator: SingletonArrayArgument<ARGUMENT, INSTANCE>? = instanceCreator
    @Volatile private var instance: INSTANCE? = null

    fun getInstance(argument: ARGUMENT): INSTANCE {
        val currentInstance = instance
        if (currentInstance != null) {
            return currentInstance
        }

        return synchronized(this) {
            val newInstance = instance
            if (newInstance != null) newInstance
            else {
                val createdInstance = instanceCreator!!(argument)
                instance = createdInstance
                instanceCreator = null
                createdInstance
            }
        }
    }
}