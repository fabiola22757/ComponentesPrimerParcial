package com.example.ejemplofjf.componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable

fun FilasView(){ //función
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ){ //Contenido
        Column (modifier = Modifier.padding(bottom = 28.dp),
            verticalArrangement = Arrangement.Top
        ){
            Text(text = "Primero")
        }

        Column{
            Text(text = "Segundo")
            Text(text = "Tercero")
            Text(text = "Cuarto")
        }
    } //Contenido
} //función