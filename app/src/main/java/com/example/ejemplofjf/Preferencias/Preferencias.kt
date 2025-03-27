package com.example.ejemplofjf.Preferencias

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

//DataStore almacena pequeños conjuntos de datos de forma eficiente y segura
//Importa Preferences, que representa un contenedor de pares clave-valor en DataStore.

class Preferencias (private val context: Context) {
    companion object { //para que sea singleton el acceso al archivo
        val Context.dataStore: DataStore<Preferences>
        by preferencesDataStore(name = "settings")
        //se almacenarán las preferencias en un archivo llamado "settings"

        /* llaves
            settings.txt
            edad = null por default
            nombre = null
            registrado = null
         */
        val AGE = intPreferencesKey("edad")
        val NAME = stringPreferencesKey("nombre")
        val SIGN_UP = booleanPreferencesKey("registrado")
    }

    ///Lectura de valores
    //Flow parte de las corrutinas para transmitir (recibir) el flujo de datos tipo Entero de forma asincrona
    /*alternativa 01- siempre escucha el cambio*/
    val age: Flow<Int> = context.dataStore.data.map { misDatos ->
        // No type safety.
        misDatos[AGE] ?: 0
    }

    //Flow parte de las corrutinas para transmiti(recibir) el flujo de datos tipo String de forma asincrona
    val name: Flow<String> = context.dataStore.data.map{preferences ->
        preferences[NAME] ?: ""
    }
    ///

    ///Escritura de valores
    suspend fun savePersonData(personName: String, personAge: Int) {
        context.dataStore.edit { settings ->
            settings[AGE] = personAge
            settings[NAME] = personName }
    }
    ///

    //Borra los datos
    suspend fun clearSession() {
        context.dataStore.edit { preferences ->
            preferences.remove(AGE)
            preferences.remove(NAME)
        }
    }

}