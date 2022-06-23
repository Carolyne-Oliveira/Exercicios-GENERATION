package com.example.sqlitecomroom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.sqlitecomroom.data.Usuario
import com.example.sqlitecomroom.databinding.FragmentAdd2Binding
import com.example.sqlitecomroom.databinding.FragmentList2Binding

class AddFragment : Fragment() {

    private lateinit var binding: FragmentAdd2Binding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAdd2Binding.inflate(layoutInflater, container, false)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.buttonAdd.setOnClickListener {
            inserirNoBanco()
        }
        return binding.root
    }

    fun verificarCampos(nome: String, sobrenome: String, idade: String): Boolean{
        return !(nome == "" || sobrenome == "" || idade == "")
    }

    fun inserirNoBanco(){
        val nome = binding.TextName.text.toString()
        val sobrenome = binding.TextSobrenome.text.toString()
        val idade = binding.TextIdade.text.toString()

        if(verificarCampos(nome, sobrenome, idade)){
            val user = Usuario(0, nome, sobrenome, idade.toInt())
            mainViewModel.addUser(user)
            Toast.makeText(context, "Usuário Add com sucesso!", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_addFragment_to_listFragment)
        }else{
            Toast.makeText(context, "Preencha todos os campo!", Toast.LENGTH_LONG).show()
        }

    }

}