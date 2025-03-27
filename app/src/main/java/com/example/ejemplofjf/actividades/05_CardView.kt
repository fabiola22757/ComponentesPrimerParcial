package com.example.ejemplofjf.actividades

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejemplofjf.R

@Composable

fun CardView(edad: Int){
    val (mensaje, imagen) = when (edad){
        in 0..14 -> "Menor de edad" to R.drawable.child
        15 -> "Mayor de edad en Indonesia pero no en México" to R.drawable.teen
        16 -> "Mayor de edad en Cuba pero no en México" to R.drawable.teen
        17 -> "Mayor de edad en Corea del Norte pero no en México" to R.drawable.teen
        18 -> "Mayor de edad en México y gran parte de Latinoamerica" to R.drawable.teen
        19 -> "Mayor de edad en Corea del Sur" to R.drawable.teen
        20 -> "Mayor de edad en Japón" to R.drawable.teen
        21 -> "Mayor de edad en USA y posiblemente en todo el mundo" to R.drawable.teen
        in 60..64 -> "Eres de la tercera edad" to R.drawable.senior
        65 -> "Ya te puedes jubilar" to R.drawable.senior
        else -> "Adulto" to R.drawable.unknown
    }

    Card(
        modifier = Modifier.padding(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.LightGray)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Tu edad es: $edad", fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = mensaje, fontSize = 18.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Image(painter = painterResource(id = imagen), contentDescription = null)
        }
    }
}//fin de la función