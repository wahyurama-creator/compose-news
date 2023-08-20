package com.ways.composenews.data.manager

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.ways.composenews.domain.manager.LocalUserManager
import com.ways.composenews.utils.Constants
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = Constants.USER_SETTINGS)

class LocalUserManagerImpl(private val context: Context) : LocalUserManager {
    override suspend fun saveAppEntry() {
        context.dataStore.edit { settings ->
            settings[APP_ENTRY] = true
        }
    }

    override fun readAppEntry(): Flow<Boolean> {
        return context.dataStore.data.map { preferences ->
            preferences[APP_ENTRY] ?: false
        }
    }

    private companion object {
        val APP_ENTRY = booleanPreferencesKey(Constants.APP_ENTRY)
    }

}