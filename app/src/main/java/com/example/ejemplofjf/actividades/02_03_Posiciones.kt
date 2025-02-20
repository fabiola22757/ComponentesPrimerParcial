package com.example.ejemplofjf.actividades

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable

fun PosicionesView(){
    Box(modifier = Modifier
        .background(color = Color.Black)
        .fillMaxSize())
    {
        Box(modifier = Modifier
            .padding(15.dp)
            .background(color = Color.White)
            .fillMaxSize())
        {
            //Caja BottomEnd
            Box(modifier = Modifier
                .align(Alignment.BottomEnd)
                .background(color = Color.Yellow)
                .width(82.dp)
                .height(200.dp)
            ){
                //Texto BottomEnd
                Text(
                    text = "BottomEnd",
                    modifier = Modifier.align(Alignment.BottomEnd)
                )
            }

            //Caja Center
            Box(modifier = Modifier
                .align(Alignment.Center)
                .background(color = Color.Gray)
                .width(75.dp)
                .height(421.dp)
            ){
                //Texto Center
                Text(
                    text = "Center",
                    modifier = Modifier.align(Alignment.Center)
                )
            }

            //Caja BottomCenter
            Box(modifier = Modifier
                .align(Alignment.BottomCenter)
                .background(color = Color.Black)
                .width(200.dp)
                .height(200.dp)
            ){
                //Texto BottomCenter
                Text(
                    text = "BottomCenter",
                    color = Color.White,
                    modifier = Modifier.align(Alignment.BottomCenter)
                )
            }

            //Caja BottomStart
            Box(modifier = Modifier
                .align(Alignment.BottomStart)
                .background(color = Color.Cyan)
                .width(82.dp)
                .height(200.dp)
            ){
                //Texto BottomStart
                Text(
                    text = "BottomStart",
                    modifier = Modifier.align(Alignment.BottomStart)
                )
            }

            //Caja CenterStart
            Box(modifier = Modifier
                .padding(top = 200.dp)
                .align(Alignment.TopStart)
                .background(color = Color.Green)
                .width(144.dp)
                .height(200.dp)
            ){
                //Texto CenterStart
                Text(
                    text = "CenterStart",
                    modifier = Modifier.align(Alignment.CenterStart)
                )
            }

            //Caja CenterEnd
            Box(modifier = Modifier
                .padding(bottom = 404.dp)
                .align(Alignment.CenterEnd)
                .background(color = Color.Black)
                .width(144.dp)
            ){
                //Texto CenterEnd
                Text(
                    text = "CenterEnd",
                    color = Color.White,
                    modifier = Modifier.align(Alignment.CenterEnd)
                )
            }

            //Caja TopStart
            Box(modifier = Modifier
                .padding(bottom = 404.dp)
                .align(Alignment.TopStart)
                .background(color = Color.Red)
                .width(115.dp)
            ){
                //Texto TopStart
                Text(
                    text = "TopStart",
                    color = Color.White,
                    modifier = Modifier.align(Alignment.TopStart)
                )
            }

            //Caja TopCenter
            Box(modifier = Modifier
                .align(Alignment.TopCenter)
                .background(color = Color.Blue)
                .width(140.dp)
                .height(200.dp)
            ){
                //Texto TopCenter
                Text(
                    text = "Top",
                    color = Color.White,
                    modifier = Modifier.align(Alignment.TopCenter)
                )
            }

            //Caja TopEnd
            Box(modifier = Modifier
                .align(Alignment.TopEnd)
                .background(color = Color(0xFFC034BA))
                .width(112.dp)
                .height(50.dp)
            ){
                //Texto TopEnd
                Text(
                    text = "TopEnd",
                    color = Color.White,
                    modifier = Modifier.align(Alignment.TopEnd)
                )
            }

        }
    }
}