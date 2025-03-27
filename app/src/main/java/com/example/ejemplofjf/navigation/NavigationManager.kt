package com.example.ejemplofjf.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.ejemplofjf.HomeView
import com.example.ejemplofjf.actividades.Barras
import com.example.ejemplofjf.componentes.BotonesView
import com.example.ejemplofjf.componentes.CajaView

@Preview(showBackground = true)
@Composable //Para interactuar con la sintaxis de Interfaz de usuario

fun NavigationManager(){

    //constante
    //remember va siguiendo el estado del controlador que maneja toda la navegación
    val navController = rememberNavController()

    //navController va la constante
    //startDestination es la primera pantalla en aparecer
    NavHost(navController = navController, startDestination = "Inicio") {
        /////Aquí los nombres de rutas y su componente/vista respectiva

        composable(route = "Inicio"){ //label
            //lo que vas a traer para que se visualice como pantalla de Inicio
            HomeView(navController)
        }

        composable(route = "Botones"){
            BotonesView(navController)
        }

        /*Si se envían cadenas vacías generará error
        composable(route = "estudiante/{nombre}/{id}",
            arguments = listOf(
                //primer parámetro
                navArgument("nombre"){
                    type = NavType.StringType
                }, //hasta aquí primer parámetro
                //segundo parámetro
                navArgument("id"){
                    type = NavType.IntType
                } //aquí termina el segundo parámetro
            )//termina lista de parámetros
            ){parametros ->
            val studentName = parametros.arguments?.getString("nombre") ?: ""
            val studentId = parametros.arguments?.getInt("id") ?: 0
            StudentView(studentId, studentName)
        }
        */

        //No acepta valores null
        composable(route = "estudiante?nombre={nombre}&id={id}",
            arguments = listOf(
                //primer parámetro
                navArgument("nombre"){
                    type = NavType.StringType
                    nullable = true
                    defaultValue = "-"
                }, //hasta aquí primer parámetro
                //segundo parámetro
                navArgument("id"){
                    type = NavType.IntType
                    defaultValue = 0
                } //aquí termina el segundo parámetro
            )//termina lista de parámetros
        ){parametros ->
            val studentName = parametros.arguments?.getString("nombre") ?: ""
            val studentId = parametros.arguments?.getInt("id") ?: 0
            StudentView(studentId, studentName)
        }
        /////
    }
}

