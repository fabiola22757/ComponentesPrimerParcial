package com.example.ejemplofjf.lazylist.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ejemplofjf.lazylist.models.WinnerModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class StudentViewModel: ViewModel() {

    var selectedStudent by mutableStateOf("")
        private  set

    //Vengo de SorteoView.kt
    var isLoading by mutableStateOf(false)
        private set

    var contador by mutableIntStateOf(0)
        private set

    var winner by mutableStateOf(
        WinnerModel(name="", number=0)
    )
        private set

    //constructor init, hace el proceso inmediatamente
    init {

    }

    //function sincrona, hace el proceso cuando le dan clic al botón
    fun onClickLuckyButton(){
        viewModelScope.launch {
            selectedStudent = getStudentsAsync()
            //winner.name = selectedStudent
            winner = winner.copy(name = selectedStudent)
        }
    }

    //clase --> function metodos acciones
    //dataclass --> datos
    //              Entity --> name, id, age

    suspend fun getStudentsAsync() : String {
        //le das Alt+Enter Suspend al withContext
        return withContext(Dispatchers.IO){
            isLoading = true
            contador ++
            //winner.number = contador
            winner = winner.copy(number = contador)
            selectedStudent = ""
            delay(5000)
            val students = listOf<String>(
                "Fabiola", "Yahir", "Marcelo", "Retta", "Karime",
                "Ester", "Julia", "Max", "Juan Pablo", "Zuri", "Gerardo",
                "Luis", "David", "Fano", "Valeria", "Edna", "Memo"
            )
            delay(3000)
            isLoading = false
             students.random()
            //sólo regresa Strings
            //"Faby"
            //2.toString()
        }

    }
}