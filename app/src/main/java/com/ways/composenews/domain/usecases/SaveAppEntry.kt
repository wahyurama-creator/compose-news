package com.ways.composenews.domain.usecases

import com.ways.composenews.domain.manager.LocalUserManager

class SaveAppEntry(private val localUserManager: LocalUserManager) {

    suspend operator fun invoke() {
        localUserManager.saveAppEntry()
    }

}