package com.example.viewmodelelivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    /*
    LiveData - é imultável por padrão
    MutableLiveData - para o LiveData se tornar mutável
     */

    var cont = MutableLiveData<Int>(0)

    fun addNum(){
        cont.value = cont.value?.plus(1)
        //cont.value = cont.value!! +1 -> indica que o valor nunca será nulo e soma 1
    }
}