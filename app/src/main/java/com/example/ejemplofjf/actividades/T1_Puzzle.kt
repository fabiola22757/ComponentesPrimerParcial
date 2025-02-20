package com.example.ejemplofjf.actividades

import android.icu.text.ListFormatter.Width
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Puzzle(){

    Column (modifier = Modifier
        .background(color = Color(0xFF070454))
        .padding(10.dp)
        .fillMaxSize()){ //Lienzo

        //Cuadro de puzzle
        Box(
            modifier = Modifier
                .background(color = Color(0xFF0B1873))
                .width(500.dp)
                .height(374.dp)
        ){
            Column {
                //Fila (1, 2, 3, 4)
                Row(horizontalArrangement = Arrangement.Center) {
                    //Número 1
                    Box(
                        modifier = Modifier
                            .background(color = Color.Blue)
                            .size(93.dp)
                            .border(4.dp, color = Color(0xFF0B1873))
                    ) {
                        Text(
                            text = "1",
                            color = Color.White,
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }

                    //Número 2
                    Box(
                        modifier = Modifier
                            .background(color = Color.White)
                            .size(93.dp)
                            .border(4.dp, color = Color(0xFF0B1873))

                    ) {
                        Text(
                            text = "2",
                            color = Color.Blue,
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }

                    //Número 3
                    Box(
                        modifier = Modifier
                            .background(color = Color.Blue)
                            .size(93.dp)
                            .border(4.dp, color = Color(0xFF0B1873))

                    ) {
                        Text(
                            text = "3",
                            color = Color.White,
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }

                    //Número 4
                    Box(
                        modifier = Modifier
                            .background(color = Color.White)
                            .size(93.dp)
                            .border(4.dp, color = Color(0xFF0B1873))
                    ) {
                        Text(
                            text = "4",
                            color = Color.Blue,
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }

                }

                //Fila (5, 6, 7, 8)
                Row(horizontalArrangement = Arrangement.Center) {
                    //Número 5
                    Box(
                        modifier = Modifier
                            .background(color = Color.Blue)
                            .size(93.dp)
                            .border(4.dp, color = Color(0xFF0B1873))
                    ) {
                        Text(
                            text = "5",
                            color = Color.White,
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }

                    //Número 6
                    Box(
                        modifier = Modifier
                            .background(color = Color.White)
                            .size(93.dp)
                            .border(4.dp, color = Color(0xFF0B1873))

                    ) {
                        Text(
                            text = "6",
                            color = Color.Blue,
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }

                    //Número 7
                    Box(
                        modifier = Modifier
                            .background(color = Color.Blue)
                            .size(93.dp)
                            .border(4.dp, color = Color(0xFF0B1873))

                    ) {
                        Text(
                            text = "7",
                            color = Color.White,
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }

                    //Número 8
                    Box(
                        modifier = Modifier
                            .background(color = Color.White)
                            .size(93.dp)
                            .border(4.dp, color = Color(0xFF0B1873))
                    ) {
                        Text(
                            text = "8",
                            color = Color.Blue,
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }

                } //Termina fila 2

                //Fila (9, 10, 11, 12)
                Row(horizontalArrangement = Arrangement.Center) {
                    //Número 9
                    Box(
                        modifier = Modifier
                            .background(color = Color.Blue)
                            .size(93.dp)
                            .border(4.dp, color = Color(0xFF0B1873))
                    ) {
                        Text(
                            text = "9",
                            color = Color.White,
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }

                    //Número 10
                    Box(
                        modifier = Modifier
                            .background(color = Color.White)
                            .size(93.dp)
                            .border(4.dp, color = Color(0xFF0B1873))

                    ) {
                        Text(
                            text = "10",
                            color = Color.Blue,
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }

                    //Número 11
                    Box(
                        modifier = Modifier
                            .background(color = Color.Blue)
                            .size(93.dp)
                            .border(4.dp, color = Color(0xFF0B1873))

                    ) {
                        Text(
                            text = "11",
                            color = Color.White,
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }

                    //Número 12
                    Box(
                        modifier = Modifier
                            .background(color = Color.White)
                            .size(93.dp)
                            .border(4.dp, color = Color(0xFF0B1873))
                    ) {
                        Text(
                            text = "12",
                            color = Color.Blue,
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }

                } //Termina fila 3

                //Fila (13, 14, , 15)
                Row(horizontalArrangement = Arrangement.Center) {
                    //Número 13
                    Box(
                        modifier = Modifier
                            .background(color = Color.Blue)
                            .size(93.dp)
                            .border(4.dp, color = Color(0xFF0B1873))
                    ) {
                        Text(
                            text = "13",
                            color = Color.White,
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }

                    //Número 14
                    Box(
                        modifier = Modifier
                            .background(color = Color.White)
                            .size(93.dp)
                            .border(4.dp, color = Color(0xFF0B1873))

                    ) {
                        Text(
                            text = "14",
                            color = Color.Blue,
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }

                    //Caja Vacía
                    Box(
                        modifier = Modifier
                            .background(color = Color(0xFF0B1873))
                            .size(93.dp)
                            .border(4.dp, color = Color(0xFF0B1873))

                    )

                    //Número 15
                    Box(
                        modifier = Modifier
                            .background(color = Color.Blue)
                            .size(93.dp)
                            .border(4.dp, color = Color(0xFF0B1873))
                    ) {
                        Text(
                            text = "15",
                            color = Color.White,
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }

                } //Termina fila 4
            }
        }
    } //Termina Lienzo
}