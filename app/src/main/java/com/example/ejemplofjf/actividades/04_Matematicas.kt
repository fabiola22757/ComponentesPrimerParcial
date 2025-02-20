package com.example.ejemplofjf.actividades

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AcUnit
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejemplofjf.R
import kotlin.math.min

@Preview(showBackground = true)
@Composable

fun MateView(){

    var firstNumber by remember { mutableStateOf("") }
    var secondNumber by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize()){

        //Columna que contendrán los TextFields
        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text(text = "Dame dos números:")
            //Primer número
            TextField(
                value = firstNumber,
                placeholder = {Text(text = "Primer número")},
                onValueChange = {
                    firstNumber = it
                })
            //Segundo número
            TextField(
                value = secondNumber,
                placeholder = {Text(text = "Segundo número")},
                onValueChange = {
                    secondNumber = it
                })

            //Botón para SUMAR
            Button(
                onClick = {
                    resultado = (firstNumber.toInt() + secondNumber.toInt()).toString()
                }
            ) {
                //Texto del botón
                Text(text = "Sumar")
            }

            //Botón OutlinedButton para RESTAR
            OutlinedButton(
                onClick = {
                    resultado = (firstNumber.toInt() - secondNumber.toInt()).toString()
                }
            ) {
                //Texto del botón
                Text(text = "Restar")
            }

            //Botón IconButton para MULTIPLICAR
            IconButton(
                onClick = {
                    resultado = (firstNumber.toInt() * secondNumber.toInt()).toString()
                }
            ) {
                //Texto del botón
                Icon(imageVector = Icons.Filled.AcUnit,
                    contentDescription = "Multiplicar")
            }

            //Image con evento Modifier.clickable{} para DIVISIÓN
            Image(painter = painterResource(id = R.drawable.division),
                contentDescription = "Dividir",
                modifier = Modifier.size(50.dp).clickable {
                    resultado = (firstNumber.toInt() / secondNumber.toInt()).toString()
                }
                )

            //Imprimir resultado
            Text(text = resultado)
        }

    }
}

//@Preview(showBackground = true)
@Composable

fun Mayor_Menor_View(){
    var firstNumber by remember { mutableStateOf("") }
    var secondNumber by remember { mutableStateOf("") }
    var thirdNumber by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize()){
        //Columna que contendrán los TextFields
        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Dame dos números:")
            //Primer número
            TextField(
                value = firstNumber,
                placeholder = { Text(text = "Primer número") },
                onValueChange = {
                    firstNumber = it
                })
            //Segundo número
            TextField(
                value = secondNumber,
                placeholder = { Text(text = "Segundo número") },
                onValueChange = {
                    secondNumber = it
                })
            //Tercer número
            TextField(
                value = thirdNumber,
                placeholder = { Text(text = "Tercer número") },
                onValueChange = {
                    thirdNumber = it
                })

            //Botón para MAYOR
            Button(
                onClick = {
                    val num1 = firstNumber.toIntOrNull() ?: 0
                    val num2 = secondNumber.toIntOrNull() ?: 0
                    val num3 = thirdNumber.toIntOrNull() ?: 0

                    resultado = maxOf(num1, num2, num3).toString()
                }
            ) {
                //Texto del botón
                Text(text = "MAYOR")
            }

            //Botón para Menor
            Button(
                onClick = {
                    val num1 = firstNumber.toIntOrNull() ?: 0
                    val num2 = secondNumber.toIntOrNull() ?: 0
                    val num3 = thirdNumber.toIntOrNull() ?: 0

                    resultado = minOf(num1, num2, num3).toString()
                }
            ) {
                //Texto del botón
                Text(text = "Menor")
            }

            Text(text = resultado)
        }
    }
}
