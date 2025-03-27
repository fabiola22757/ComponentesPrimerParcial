package com.example.ejemplofjf.lazylist.viewmodels
import androidx.lifecycle.ViewModel
import com.example.ejemplofjf.R
import com.example.ejemplofjf.lazylist.models.ProductModel

class ProductViewModel (): ViewModel(){
    init {
        //obtenerProductos()
    }
    fun obtenerProductos() : List<ProductModel>{
        val productoUno = ProductModel(
            id = 1,
            name = "tacos",
            description = "de cecina, al pastor, etc.",
            price = 5.0f,
            image = R.drawable.sopes)
        val productoDos = ProductModel(
            id = 2,
            name = "torta",
            description = "de ternera, de la barda, mixta",
            price = 5.0f,
            image = R.drawable.sopes)
        val productoTres = ProductModel(
            id = 3,
            name = "sopes",
            description = "con todo",
            price = 5.0f,
            image = R.drawable.sopes)
        val productoCuatro = ProductModel(
            id = 4,
            name = "flautas",
            description = "de res, de pollo, mixta",
            price = 5.0f,
            image = R.drawable.sopes)
        val productoCinco = ProductModel(
            id = 5,
            name = "migadas",
            description = "con base de frijol o papa",
            price = 5.0f,
            image = R.drawable.sopes)
        val productoSeis = ProductModel(
            id = 5,
            name = "hamburguesa",
            description = "doble queso, americana, con tocino",
            price = 5.0f,
            image = R.drawable.sopes)
        val productoSiete = ProductModel(
            id = 5,
            name = "pizza",
            description = "pepperoni, hawaiiana, mexicana",
            price = 5.0f,
            image = R.drawable.sopes)
        val productoOcho = ProductModel(
            id = 5,
            name = "alitas",
            description = "barbecue, spicy, etc.",
            price = 5.0f,
            image = R.drawable.sopes)
        val productoNueve = ProductModel(
            id = 5,
            name = "tamales",
            description = "picadillo, puerco, pollo",
            price = 5.0f,
            image = R.drawable.sopes)
        val productoDiez = ProductModel(
            id = 5,
            name = "garnachas",
            description = "con todo",
            price = 5.0f,
            image = R.drawable.sopes)

        val productsList = listOf<ProductModel>(
            //Elementos de la lista
            productoUno,
            productoDos,
            productoTres,
            productoCuatro,
            productoCinco,
            productoSeis,
            productoSiete,
            productoOcho,
            productoNueve,
            productoDiez
        )

        return productsList
    }
}