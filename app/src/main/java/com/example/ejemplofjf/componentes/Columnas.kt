package com.example.ejemplofjf.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//@Preview(showBackground = true) // si se pone rojo: alt+Enter
@Composable

fun ColumnasView(){
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
            .background(Color.LightGray), //lo aplica a cada text
        verticalArrangement = Arrangement.SpaceEvenly, //posición verticalmente
        //verticalArrangement = Arrangement.Top
        //verticalArrangement = Arrangement.spacedBy(20.dp)
        horizontalAlignment = Alignment.CenterHorizontally //posición horizontal
    ) {
        Text(text = "Hola",
            color = Color.Red,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
        )
        Text(text = "Adiós",
            color = Color.Yellow,
            modifier = Modifier
                .background(Color.Black)
        )

        Column(
            modifier = Modifier
                .background(color = Color(0xFFC400C2))
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center, //importa mucho el orden de los comandos
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "De nuevo",
                color = Color.White
            )
        }//cierra columna interna que tiene el tercer texto
    } //cierra columna externa
}

@Preview(showBackground = true) //pongo en comentario el otro para ver sólo este
@Composable
//por cada componente es un Composable
fun ColumnasSeparadas(){
    Column(
        modifier = Modifier.fillMaxSize()
    ){
        Text(text = "1") //Ctrl+D para duplicar la línea
        Spacer(modifier = Modifier.height(16.dp)) //Espacio
        Text(text = "2")
        Spacer(modifier = Modifier.height(40.dp)) //Espacio
        HorizontalDivider() //Línea de división horizontal
        Text(text = "3")
    }
}