package com.example.ejemplofjf.componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable

fun CajaDeTextoView(){

    var firstNumber by remember {
        mutableStateOf("")
    }

    var secondNumber by remember {
        mutableStateOf("")
    }

    var resultado by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "Dame dos números")
        TextField(
            value = firstNumber,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = {Text(text = "Sólo números")},
            onValueChange = {
            //it
            textoIngresado ->
            firstNumber = textoIngresado
        })
        TextField(
            value = secondNumber,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = {Text(text = "Sólo números")},
            onValueChange = {
                secondNumber = it
            }
        )
        Button(
            onClick = {
                resultado = (firstNumber.toInt() + secondNumber.toInt()).toString()
            }
        ) {
            //Contenido
            Text(text = "Sumar")
        }

        Text(text = resultado)
    }
}

fun TextField(value: String, placeholder: String, onValueChange: Any) {

}
