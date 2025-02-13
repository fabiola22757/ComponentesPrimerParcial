package com.example.ejemplofjf.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AcUnit
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejemplofjf.R

@Preview(showBackground = true)
@Composable

fun CajaView(){
    Box(
        modifier = Modifier
            .background(Color.Yellow)
            .size(64.dp)
            //.fillMaxSize()
    ){
        //imagen jpg o png (carpeta res - drawable)
        //el nombre de la img no puede tener mayúsculas ni caracteres
        Image(painter = painterResource(id = R.drawable.sopes),
            contentDescription = "fondo",
            modifier = Modifier.fillMaxSize().rotate(90f),
            contentScale = ContentScale.Crop, //pone la imagen a escala
            alpha = 0.7f
        )

        Text(text = "7",
            color = Color.White,
            modifier = Modifier.align(Alignment.BottomStart)
            )
        //9 textos en las 9 posiciones diferentes de la box
        Text(text = "1",
            modifier = Modifier.align(Alignment.TopStart))
        Text(text = "2",
            modifier = Modifier.align(Alignment.TopCenter))
        Text(text = "3",
            modifier = Modifier.align(Alignment.TopEnd))
        Text(text = "4",
            modifier = Modifier.align(Alignment.CenterStart))
        Text(text = "5",
            modifier = Modifier.align(Alignment.Center))
        Text(text = "6",
            modifier = Modifier.align(Alignment.CenterEnd))
        Text(text = "8",
            modifier = Modifier.align(Alignment.BottomCenter))
        Text(text = "9",
            modifier = Modifier.align(Alignment.BottomEnd))

        //Ícono del sistema (image vector)
        Icon(imageVector = Icons.Filled.AcUnit,
            contentDescription = "ícono",
            tint = Color.Magenta
            )

        Icon(painter = painterResource(id = R.drawable.baseline_add_shopping_cart_24),
            contentDescription = "ícono descargado",
            modifier = Modifier.align(Alignment.BottomCenter),
            tint = Color.Unspecified //para respetar el color del ícono
        )
    }
}