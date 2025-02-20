package com.example.ejemplofjf.actividades

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable

fun Barras(){
    Column (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(16.dp)// Agrega margen para la estética
    ) {//Contenido
        //Barra horizontal 1
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(110.dp)
                .background(color = Color(0xFF0C1F4B))
        )

        Spacer(modifier = Modifier.height(15.dp)) //espacio

        //Barra horizontal 2
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(110.dp)
                .background(color = Color(0xFF02B6B6))
        )

        Spacer(modifier = Modifier.height(15.dp)) //espacio

        //Barra horizontal 3
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(110.dp)
                .background(color = Color(0xFF0C1F4B))
        )

        Spacer(modifier = Modifier.height(15.dp)) //espacio

        //Rows Filas para hacer cajas en forma de filas y ponerles altura
        Row (modifier = Modifier.fillMaxSize()){
            //Barra vertical 1
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(110.dp)
                    .background(color = Color(0xFF0C1F4B))
            )

            Spacer(modifier = Modifier.width(15.dp)) //espacio

            //Barra vertical 2
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(110.dp)
                    .background(color = Color(0xFF1C59FC))
            )

            Spacer(modifier = Modifier.width(15.dp)) //espacio

            //Barra vertical 3
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(110.dp)
                    .background(color = Color(0xFF0C1F4B))
            )

        }
    }


}