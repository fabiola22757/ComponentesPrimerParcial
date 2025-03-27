package com.example.ejemplofjf.actividades

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Preview(showBackground = true)
@Composable

fun AgeNavegation(){
    //constante
    val navController = rememberNavController() // Controlador de navegación

    //Define las rutas
    NavHost(navController = navController, startDestination = "Input"){

        composable(route = "Input"){
            InputView(navController)
        }

        composable(route = "Resultado/{edad}") {parametros ->
            val edad = parametros.arguments?.getString("edad")?.toIntOrNull() ?: 0
            CardView(edad)
        }
    }

}//termina la función