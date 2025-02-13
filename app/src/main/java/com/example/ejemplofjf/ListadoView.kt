package com.example.ejemplofjf

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejemplofjf.Compartido.TarjetaView
import com.example.ejemplofjf.Compartido.TerminalView //nombre de mi función TerminalView

@Preview(showBackground = true)
@Composable

//Compartir componentes (vistas)
fun ListadoView(){

    Column (modifier = Modifier.fillMaxSize()) {
        TerminalView() //función externa
        TerminalView()
        TerminalView()

        TarjetaView()
        TarjetaView(colorText = Color.Blue)
        TarjetaView(background = Color.Blue)
        TarjetaView(colorText = Color.Green, background = Color.Blue)
        TarjetaView(Color.LightGray, Color.Magenta, "Hola")
    }
}