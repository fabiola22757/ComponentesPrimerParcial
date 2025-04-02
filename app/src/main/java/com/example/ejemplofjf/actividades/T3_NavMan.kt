package com.example.ejemplofjf.actividades

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavMan(navController: NavController){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "welcome"){
        composable(route = "welcome"){
            Bienvenida(navController)
        }

        composable(route = "alumnos"){
            Alumnos(navController)
        }

        composable(route = "carrera/{idNumber}/{name}"){parametros ->
            val idNumber = parametros.arguments?.getString("idNumber")?.toIntOrNull() ?:0
            val name = parametros.arguments?.getString("name") ?: ""
            Carrera(idNumber, name)
        }
    }
}