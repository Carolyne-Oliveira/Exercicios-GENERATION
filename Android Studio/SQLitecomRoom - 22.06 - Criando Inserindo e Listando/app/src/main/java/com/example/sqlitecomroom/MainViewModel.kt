package com.example.sqlitecomroom

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sqlitecomroom.data.UserDataBase
import com.example.sqlitecomroom.data.UserRepository
import com.example.sqlitecomroom.data.Usuario
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel (application: Application): AndroidViewModel(application){
    //              (context: Context): ViewModel(){  --> usado apenas para uma tela

    val selectUsers: LiveData<List<Usuario>>
    val repository: UserRepository

    init {
        val userDao = UserDataBase.getDataBase(application).userDao()
                                          //   (context) --> usado para referenciar uma tela
        repository = UserRepository(userDao)
        selectUsers = repository.selectUsers
    }

    fun addUser(usuario: Usuario){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addUser(usuario)
        }
    }
}