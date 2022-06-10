package com.generation.projeto0606

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.projeto0606.api.Repository
import com.generation.projeto0606.model.Categoria
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel: ViewModel() {

    val repository = Repository()

    private val _myCategoriaResponse =
        MutableLiveData<Response<List<Categoria>>>()

    val myCategoriaResponse: LiveData<Response<List<Categoria>>> =
        _myCategoriaResponse

    fun listCategoria(){
        viewModelScope.launch{
            _myCategoriaResponse.value = repository.listCategoria()
        }
    }
}

//Retorno para caso de erro!!! prox aula.
/*
fun listCategoria(){
    viewModelScope.launch{
        try {
            val response = repository.listCategoria()
            _myCategoriaResponse.value = response
        }catch (e: Exception){
            Log.d("ErroRequisicao", e.message.toString())

 */