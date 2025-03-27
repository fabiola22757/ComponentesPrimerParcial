package com.example.ejemplofjf.lazylist.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejemplofjf.R
import com.example.ejemplofjf.lazylist.models.ProductModel

@Preview(showBackground = true)
@Composable

fun ProductPreview(){
    val product = ProductModel(
        id = 1,
        name = "Orden de Sopes",
        description = "Deliciosos zopes para disfrutar en familia",
        price = 25.00f,
        image = R.drawable.sopes
    )
    ProductView(product)
}

@Composable
fun ProductView(product: ProductModel){
    Card(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(id = product.image),
                contentDescription = "Zopes",
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Crop)

            Column (modifier = Modifier.padding(start = 10.dp)){

                Text(text = product.name,
                    fontSize = 18.sp,
                    color = Color.Black)

                Text(text = product.description ?: "Sin descripción",
                    //agregar ?:
                    fontSize = 10.sp,
                    color = Color.DarkGray)

                Text(text = "Precio: $${product.price} MXN",
                    fontSize = 10.sp,
                    color = Color.DarkGray)

                Row (modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End) {

                    Button(onClick = {/*TODO*/},) {
                        Text("Comprar")
                    }
                }

            }
        }
    }
}