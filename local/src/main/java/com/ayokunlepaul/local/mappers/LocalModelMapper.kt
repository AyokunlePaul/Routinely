package com.ayokunlepaul.local.mappers

interface LocalModelMapper <LOCAL, REPOSITORY> {

    fun mapToRepository(local: LOCAL): REPOSITORY

    fun mapToRepositoryList(local: LOCAL): List<REPOSITORY>
}