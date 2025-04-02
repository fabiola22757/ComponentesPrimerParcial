package com.example.ejemplofjf

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.ejemplofjf.actividades.AgeNavegation
import com.example.ejemplofjf.actividades.NavMan
import com.example.ejemplofjf.ui.theme.EjemplofjfTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjemplofjfTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                        innerPadding ->
                    /*
                    innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                     */
                    Column (modifier = Modifier.padding(innerPadding)){
                        //InfoView()
                        //AgeNavegation()
                        //val studentViewModel = StudentViewModel()
                        //SorteoView(studentViewModel)
                        //ListProductsView()
                        //ListCategoriasView()
                        //AgeNavegation()
                        val navController = rememberNavController()
                        //SetupNavigation(navController)
                        NavMan(navController)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EjemplofjfTheme {
        Greeting("Android")
    }
}