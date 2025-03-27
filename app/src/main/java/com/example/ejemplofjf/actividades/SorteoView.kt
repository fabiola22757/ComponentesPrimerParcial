package com.example.ejemplofjf.actividades

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejemplofjf.R
import com.example.ejemplofjf.lazylist.viewmodels.StudentViewModel

//locale = "en" es la abreviatura para el idioma
//@Preview(showBackground = true, locale = "en")
@Composable

fun SorteoView(studentViewModel: StudentViewModel){
    //val studentViewModel = StudentViewModel()

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        //Text(text = "Bienvenido, ¿tendré suerte?") --> lo convertimos a string resource
        Text(text = stringResource(R.string.welcome))
        Spacer(modifier = Modifier.height(8.dp))

        if(studentViewModel.isLoading){
            CircularProgressIndicator()
        }else{
            Button(onClick = {
                studentViewModel.onClickLuckyButton()
            })
            {
                //en el string "Comenzar" Alt+Enter - Extract String Resource y le damos el nombre start_message
                //esto se guarda en la carpeta res --> strings.xml
                //en OpenEditor puedo agregar un idioma en el mundito
                Text(text = stringResource(R.string.start_message))
            }
        }

        //ya no tengo que volver a escribir la palabra y evito errores ortográficos futuros
        //Text(text = stringResource(R.string.start_message))
        //Text(text = studentViewModel.selectedStudent) //aquí el ganador
        //Text(text = studentViewModel.contador.toString()) //aquí el número de

        Text(text = "${studentViewModel.winner.name} -- ${studentViewModel.winner.number} ")
    }
}