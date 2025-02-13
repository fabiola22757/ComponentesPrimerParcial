package com.example.ejemplofjf.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//El nombre del Objeto siempre inicia con letra Mayúscula
data class MiObjeto(
    val esGrande: Boolean,
    val saludo: String,
    val pinkColorText: Color,
    val fontSize: TextUnit,
    val limite: Int
)

@Preview(showBackground = true)
@Composable
//El Composable es para el código que sea visual
//Si es lógico, utilizamos composable sin C mayúscula

fun HolaMundoView(){

    val miObjeto: MiObjeto = MiObjeto(false, "Adiós Mundo", Color.Magenta, 30.sp, 2)
    /*
    //Variable es var
    var esGrande: Boolean = false

    //Constante es val
    val saludo: String = "Hola mundo, bienvenidos a la prueba de Android donde aprenderémos muchas cosas nuevas"
    val pinkColorText: Color = Color.Magenta
    val fontSize: TextUnit = 25.sp
    val limite: Int = 3
     */

    Text(text = miObjeto.saludo,
        color = miObjeto.pinkColorText,
        fontSize = miObjeto.fontSize,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Monospace,
        maxLines = if(miObjeto.esGrande) miObjeto.limite else 1,
        overflow = TextOverflow.Ellipsis,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(color = Color(0xFF0C9ADE))
            .padding(16.dp)
            .background(color = Color(0xFFEF41BE))
            .padding(horizontal = 8.dp)
            .background(color = Color.LightGray)
            .padding(top = 6.dp)
            .background(color = Color.White)
            .border(width = 3.dp, color = Color(0xFFE8C409))
            //.fillMaxWidth() Ocupa tod.o el ancho
            //.fillMaxHeight() Ocupa tod.o el alto
            .fillMaxSize() //Ocupa tod.o el ancho y el alto
            //.width(20.dp)
            .blur(3.dp) //difuminado a una imagen o componente
        )
    //alt+Intro eliges el que diga Compose y Text
    //Si le haces clic derecho en la palabra y en Go to, Declaration y Usages te muestra atributos
}