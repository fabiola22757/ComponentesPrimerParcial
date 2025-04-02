package com.example.ejemplofjf.actividades

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejemplofjf.R

@Composable
fun Carrera(idNum: Int, name: String){

    val rainbowColorsBrush = Brush.linearGradient(
        colors = listOf(Color.Red, Color.Yellow, Color.Green, Color.Blue, Color.Magenta)
    )

    val (mensaje, imagen) = when (idNum){
        in 1..10 -> "Bienvenido al Laboratorio del ISND estimado Coordinador ${name}" to R.drawable.coordi
        in 11..100 -> "Permiso autorizado para el profesor ${name}" to R.drawable.profesor
        in 100..19000 -> "Acceso denegado a egresados que no son de sistemas" to R.drawable.denegado
        22180 -> "Alumno en intercambio no es posible esté presente en el I.E.S.T." to R.drawable.intercambio
        in 19001..22210 -> "Bienvenido ${name} es un gusto verlo por aquí" to R.drawable.alumno
        else -> "Este laboratorio es de uso exclusivo para la carrera ISND" to R.drawable.denegado
    }

    Card(
        modifier = Modifier.padding(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.LightGray)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Su ID es: $idNum", fontSize = 24.sp, fontWeight = FontWeight.Bold)
            if(idNum in 19001..22210){
                Text(text = "Alumno $name autorizado para el uso del laboratorio.")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = mensaje, fontSize = 18.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Image(painter = painterResource(id = imagen),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(150.dp)
                    .border(BorderStroke(width = 4.dp, rainbowColorsBrush), CircleShape)
                    .padding(4.dp)
                    .clip(CircleShape)
            )
        }
    }
}