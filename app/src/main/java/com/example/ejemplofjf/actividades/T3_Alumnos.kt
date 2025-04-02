package com.example.ejemplofjf.actividades

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Alumnos(nav: NavController){
    var name by remember { mutableStateOf("") }
    var id by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) { //Contenido de la Columna

        OutlinedTextField(
            value = name,
            onValueChange = {name = it},
            label = { Text("Ingrese su nombre: ") }
        )
        OutlinedTextField(
            value = id,
            onValueChange = {id = it},
            label = { Text("Ingrese su id: ") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        //BOTÓN
        ExtendedFloatingActionButton(
            onClick = {
                val idNumber = id.toIntOrNull() ?: 0
                nav.navigate("carrera/$idNumber/$name")
            }
        ) {
            Text("Ingresar")
        }
        //BOTÓN
    }
}