package com.example.ejemplofjf.lazylist.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.ejemplofjf.lazylist.viewmodels.ProductViewModel
import com.example.ejemplofjf.lazylist.viewmodels.StudentViewModel

@Preview(showBackground = true)
@Composable

fun ListProductsView(){
    val productViewModel: ProductViewModel = ProductViewModel()
    //val studentViewModel: StudentViewModel = StudentViewModel()

    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.weight(1f)) {
            //solo acepta dos tipos de elementos: item y items

            /*
            item {
                Text(text = studentViewModel.selectedStudent, fontSize = 24.sp)
            }*/

            items(productViewModel.obtenerProductos()){ product ->
                //componentes o vistas
                ProductView(product = product)
            }

            item {
                Button(onClick = {}) {
                    Text(text = "Terminar compra")
                }
            }
        }
    }
}