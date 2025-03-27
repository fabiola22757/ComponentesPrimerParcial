package com.example.ejemplofjf.Preferencias

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.launch

@Preview(showBackground = true)
@Composable

fun InfoView(){
    val context = LocalContext.current
    val preferencias = Preferencias(context)
    val corroutine = rememberCoroutineScope()
    //leer en tiempo real los cambios en el archivo de preferencias
    val savedName = preferencias.name.collectAsState(initial = "---")
    val savedAge = preferencias.age.collectAsState(initial = -1)
    //END leer en...

    var name by remember{ mutableStateOf("")}
    var age by remember{ mutableStateOf("0")}

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Ingrese su información personal")
        TextField(value = name, onValueChange = {name = it})
        TextField(value = age, onValueChange = {age = it})
        Button(onClick = {
            corroutine.launch {
                preferencias.savePersonData(name, age.toInt())
            }
        }) {
            Text(text = "Guardar datos")
        }

        Text(text = "Datos guardados son ${savedName.value} y ${savedAge.value}")

        Button(onClick = {
            corroutine.launch {
                preferencias.clearSession()
            }
        }) {
            Text(text = "Limpiar sesión")
        }
    }
}