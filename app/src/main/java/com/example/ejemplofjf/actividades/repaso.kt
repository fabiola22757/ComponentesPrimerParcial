package com.example.ejemplofjf.actividades

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejemplofjf.R

@Preview(showBackground = true)
@Composable

fun Repaso_View(){

    Column (modifier = Modifier.fillMaxSize()){

        Column (modifier = Modifier
            .background(color = Color(0xFFCC50AD))
            .fillMaxWidth(),
            horizontalAlignment = Alignment.End){
            Image(painter = painterResource(id = R.drawable.mexico),
                contentDescription = "bandera",
                modifier = Modifier.size(70.dp))
        }

        Column (modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)){
            Text("Holaaa")
        }

        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center){
            Text(text = "Otro",
                color = Color.Blue,
                modifier = Modifier.width(100.dp))
            Text(text = "Otro",
                color = Color.Blue,
                modifier = Modifier.width(100.dp))
            Text(text = "Otro",
                color = Color.Blue,
                modifier = Modifier.width(100.dp))
        }

        HorizontalDivider()

    }
}