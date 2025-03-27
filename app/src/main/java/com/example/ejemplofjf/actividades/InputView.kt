package com.example.ejemplofjf.actividades

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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

//Recibe un navController como parámetro, que permite la navegación entre pantallas
fun InputView(navController: NavController){
    var year by remember { mutableStateOf("") }
    val currentYear = 2025

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = year,
            onValueChange = {year = it},
            label = { Text("Ingrese su año de nacimiento: ") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        FloatingActionButton(onClick = {
            val edad = currentYear - (year.toIntOrNull() ?: currentYear)
            navController.navigate("Resultado/$edad")
        }) {
            Text("Calcular")
        }
    }//termina columna lienzo
}//termina función