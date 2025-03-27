package com.example.ejemplofjf.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable

fun StudentView(id: Int, name: String){
    Column {
        Text(text = "$name -- $id")
    }
}