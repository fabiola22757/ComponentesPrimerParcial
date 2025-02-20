package com.example.ejemplofjf.actividades

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejemplofjf.R


@Preview(showBackground = true)
@Composable

fun Contabilidad(){
    //Constantes
    val eneroI: Int = 2000
    val eneroE: Int = 500

    val abrilI: Int = 4000
    val abrilE: Int = 4500

    val mayoE: Int = 1200

    val junioE: Int = 3000

    val julioI: Int = 8000
    val julioE: Int = 4500

    val septE: Int = 4650

    val octI: Int = 12000
    val octE: Int = 6000

    val dicI: Int = 25000
    val dicE: Int = 75000

    //Variables
    var eneroR by remember {
        mutableStateOf("")
    }

    var febreroR by remember {
        mutableStateOf("")
    }

    var marzoR by remember {
        mutableStateOf("")
    }

    var abrilR by remember {
        mutableStateOf("")
    }

    var mayoR by remember {
        mutableStateOf("")
    }

    var junioR by remember {
        mutableStateOf("")
    }

    var julioR by remember {
        mutableStateOf("")
    }

    var agostoR by remember {
        mutableStateOf("")
    }

    var septiembreR by remember {
        mutableStateOf("")
    }

    var octubreR by remember {
        mutableStateOf("")
    }

    var noviembreR by remember {
        mutableStateOf("")
    }

    var diciembreR by remember {
        mutableStateOf("")
    }

    //Lienzo
    Column (modifier = Modifier.fillMaxSize()){
        //Bandera
        Column (modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.End){
            Image(painter = painterResource(id = R.drawable.mexico),
                contentDescription = "Bandera",
                modifier = Modifier.size(70.dp))
        }

        //Título Contabilidad
        Column (modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "Contabilidad de Alfonso Estudiante",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold)
        }

        //Fila de encabezados
        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround){
            Text(text = "",
                modifier = Modifier.width(120.dp))
            Text(text = "Ingresos",
                color = Color.White,
                modifier = Modifier
                    .width(100.dp)
                    .background(color = Color(0xFF0E9106)))
            Text(text = "Egresos",
                color = Color.White,
                modifier = Modifier
                    .width(100.dp)
                    .background(color = Color(0xFF0E9106)))
            Text(text = "Neto",
                color = Color.White,
                modifier = Modifier
                    .width(100.dp)
                    .background(color = Color(0xFF0E9106)))
            }

        //Tabla - Columna que contiene los meses y números
        Column {
            //Fila de para cada Mes y datos
            //ENERO
            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Enero",
                    color = Color.White,
                    modifier = Modifier
                        .width(120.dp)
                        .background(color = Color(0xFF0E9106)))
                Text(text = "$eneroI",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.width(100.dp))
                Text(text = "$eneroE",
                    modifier = Modifier.width(100.dp))
                Text(text = eneroR,
                    color = if(eneroR < 0.toString()) Color.Red else Color.Black,
                    modifier = Modifier.width(100.dp))
            }

            //FEBRERO
            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Febrero",
                    color = Color.White,
                    modifier = Modifier
                        .width(120.dp)
                        .background(color = Color(0xFF0E9106)))
                Text(text = "$eneroI",
                    modifier = Modifier.width(100.dp))
                Text(text = "$eneroE",
                    modifier = Modifier.width(100.dp))
                Text(text = febreroR,
                    color = if(febreroR < 0.toString()) Color.Red else Color.Black,
                    modifier = Modifier.width(100.dp))
            }

            //MARZO
            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Marzo",
                    color = Color.White,
                    modifier = Modifier
                        .width(120.dp)
                        .background(color = Color(0xFF0E9106)))
                Text(text = "$eneroI",
                    modifier = Modifier.width(100.dp))
                Text(text = "$eneroE",
                    modifier = Modifier.width(100.dp))
                Text(text = marzoR,
                    color = if(marzoR < 0.toString()) Color.Red else Color.Black,
                    modifier = Modifier.width(100.dp))
            }

            //ABRIL
            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Abril",
                    color = Color.White,
                    modifier = Modifier
                        .width(120.dp)
                        .background(color = Color(0xFF0E9106)))
                Text(text = "$abrilI",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.width(100.dp))
                Text(text = "$abrilE",
                    modifier = Modifier.width(100.dp))
                Text(text = abrilR,
                    color = if(abrilR < 0.toString()) Color.Red else Color.Black,
                    modifier = Modifier.width(100.dp))
            }

            //MAYO
            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Mayo",
                    color = Color.White,
                    modifier = Modifier
                        .width(120.dp)
                        .background(color = Color(0xFF0E9106)))
                Text(text = "$abrilI",
                    modifier = Modifier.width(100.dp))
                Text(text = "$mayoE",
                    modifier = Modifier.width(100.dp))
                Text(text = mayoR,
                    color = if(mayoR < 0.toString()) Color.Red else Color.Black,
                    modifier = Modifier.width(100.dp))
            }

            //JUNIO
            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Junio",
                    color = Color.White,
                    modifier = Modifier
                        .width(120.dp)
                        .background(color = Color(0xFF0E9106)))
                Text(text = "$abrilI",
                    modifier = Modifier.width(100.dp))
                Text(text = "$junioE",
                    modifier = Modifier.width(100.dp))
                Text(text = junioR,
                    color = if(junioR < 0.toString()) Color.Red else Color.Black,
                    modifier = Modifier.width(100.dp))
            }

            //JULIO
            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Julio",
                    color = Color.White,
                    modifier = Modifier
                        .width(120.dp)
                        .background(color = Color(0xFF0E9106)))
                Text(text = "$julioI",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.width(100.dp))
                Text(text = "$julioE",
                    modifier = Modifier.width(100.dp))
                Text(text = julioR,
                    color = if(julioR < 0.toString()) Color.Red else Color.Black,
                    modifier = Modifier.width(100.dp))
            }

            //AGOSTO
            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Agosto",
                    color = Color.White,
                    modifier = Modifier
                        .width(120.dp)
                        .background(color = Color(0xFF0E9106)))
                Text(text = "$julioI",
                    modifier = Modifier.width(100.dp))
                Text(text = "$julioE",
                    modifier = Modifier.width(100.dp))
                Text(text = agostoR,
                    color = if(agostoR < 0.toString()) Color.Red else Color.Black,
                    modifier = Modifier.width(100.dp))
            }

            //SEPTIEMBRE
            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Septiembre",
                    color = Color.White,
                    modifier = Modifier
                        .width(120.dp)
                        .background(color = Color(0xFF0E9106)))
                Text(text = "$julioI",
                    modifier = Modifier.width(100.dp))
                Text(text = "$septE",
                    modifier = Modifier.width(100.dp))
                Text(text = septiembreR,
                    color = if(septiembreR < 0.toString()) Color.Red else Color.Black,
                    modifier = Modifier.width(100.dp))
            }

            //OCTUBRE
            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Octubre",
                    color = Color.White,
                    modifier = Modifier
                        .width(120.dp)
                        .background(color = Color(0xFF0E9106)))
                Text(text = "$octI",
                    modifier = Modifier.width(100.dp))
                Text(text = "$octE",
                    modifier = Modifier.width(100.dp))
                Text(text = octubreR,
                    color = if(octubreR < 0.toString()) Color.Red else Color.Black,
                    modifier = Modifier.width(100.dp))
            }

            //NOVIEMBRE
            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Noviembre",
                    color = Color.White,
                    modifier = Modifier
                        .width(120.dp)
                        .background(color = Color(0xFF0E9106)))
                Text(text = "$octI",
                    modifier = Modifier.width(100.dp))
                Text(text = "$octE",
                    modifier = Modifier.width(100.dp))
                Text(text = noviembreR,
                    color = if(noviembreR < 0.toString()) Color.Red else Color.Black,
                    modifier = Modifier.width(100.dp))
            }

            //DICIEMBRE
            Row (modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Diciembre",
                    color = Color.White,
                    modifier = Modifier
                        .width(120.dp)
                        .background(color = Color(0xFF0E9106)))
                Text(text = "$dicI",
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.width(100.dp))
                Text(text = "$dicE",
                    modifier = Modifier.width(100.dp))
                Text(text = diciembreR,
                    color = if(diciembreR < 0.toString()) Color.Red else Color.Black,
                    modifier = Modifier.width(100.dp))
            }
        }

        //Botón para CALCULAR Neto
        Button(onClick =
        {eneroR = (eneroI.toInt() - eneroE.toInt()).toString();
            febreroR = (eneroI.toInt() - eneroE.toInt()).toString();
            marzoR = (eneroI.toInt() - eneroE.toInt()).toString();
            abrilR = (abrilI.toInt() - abrilE.toInt()).toString();
            mayoR = (abrilI.toInt() - mayoE.toInt()).toString();
            junioR = (abrilI.toInt() - junioE.toInt()).toString();
            julioR = (julioI.toInt() - julioE.toInt()).toString();
            agostoR = (julioI.toInt() - julioE.toInt()).toString();
            septiembreR = (julioI.toInt() - septE.toInt()).toString();
            octubreR = (octI.toInt() - octE.toInt()).toString();
            noviembreR = (octI.toInt() - octE.toInt()).toString();
            diciembreR = (dicI.toInt() - dicE.toInt()).toString()},
            modifier = Modifier.fillMaxWidth()
        ) {
            //Contenido del botón
            Text(text = "Calcular")
        }
    }
}
