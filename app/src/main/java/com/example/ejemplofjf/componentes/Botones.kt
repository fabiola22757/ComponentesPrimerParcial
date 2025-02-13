package com.example.ejemplofjf.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AcUnit
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejemplofjf.R

@Preview(showBackground = true)
@Composable

fun BotonesView(){

    //Declaración de variables para el botón
    //Modo imperativo:
    //var texto : String = "Centro"
    //Modo declarativo:
    var texto by remember {
        mutableStateOf("Hellooooo")
    }
    var cambio by remember {
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Image(painter = painterResource(id = R.drawable.sopes),
            contentDescription = "imagen",
            modifier = Modifier.align(Alignment.TopEnd)
        )

        Column(
            modifier = Modifier.align(Alignment.Center)
        ) {
            HorizontalDivider() //Línea de división horizontal

            Icon(imageVector = Icons.Filled.AcUnit,
                contentDescription = "ícono",
                tint = Color.Magenta,
                modifier = Modifier.align(Alignment.End)
            )

            Text(
                //text = "Hola",
                text = texto,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            HorizontalDivider()

            Button(onClick = {
                //if(cambio) es igual a TRUE
                //if(!cambio) es igual a FALSE
                //Función del botón
                if(!cambio) { //SÍ es false
                    texto = "Ningún Afternoon ni ningún Hello"
                }else { //SÍ es true
                    texto = "Hellooooo"
                }
                cambio = !cambio
            }, modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Magenta,
                    contentColor = Color.White
                )
                ){
                //Contenido
                Text(text = texto) //Variable de texto
            }
        }

        Text(
            text = "Adiós",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .background(color = Color.Black)
                .fillMaxWidth()
        )
    }
}
