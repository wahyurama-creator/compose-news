package com.ways.composenews.domain.usecases

import com.ways.composenews.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(private val localUserManager: LocalUserManager) {

    operator fun invoke(): Flow<Boolean> {
        return localUserManager.readAppEntry()
    }

}