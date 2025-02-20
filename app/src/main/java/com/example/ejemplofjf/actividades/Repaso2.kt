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
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.VectorProperty
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable

fun Test2(){

    Row (modifier = Modifier
        .fillMaxSize()
        .padding(15.dp)){

        Box(
            modifier = Modifier
                .background(color = Color.Blue)
                .width(85.dp)
                .height(250.dp)
        )

        Spacer(modifier = Modifier.width(5.dp))

        Column {
            Box(
                modifier = Modifier
                    .background(color = Color.Blue)
                    .width(180.dp)
                    .height(122.dp)
            )

            Spacer(modifier = Modifier.height(5.dp))

            Box(
                modifier = Modifier
                    .background(color = Color.Blue)
                    .width(180.dp)
                    .height(122.dp)
            )
        }

        Spacer(modifier = Modifier.width(5.dp))

        Box(
            modifier = Modifier
                .background(color = Color.Blue)
                .width(85.dp)
                .height(250.dp)
        )
    }

   

}