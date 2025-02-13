package com.example.ejemplofjf.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable

fun TablaView(){
    Column (modifier = Modifier.fillMaxSize()){
        Text(text = "Hey friend",
            modifier = Modifier
                .fillMaxHeight()
                .background(Color.Blue)
                .weight(27f)) //70% o 27%
        Text(text = "Hey enemy",
            modifier = Modifier
                .fillMaxHeight()
                .background(Color.Red)
                .weight(3f)) //30% + 70% = 100% o 3% + 27% = 30%
    }
}