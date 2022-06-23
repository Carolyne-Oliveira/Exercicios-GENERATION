package com.generation.projeto0606

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.generation.projeto0606.databinding.FragmentFormBinding
import com.generation.projeto0606.fragment.DatePickerFragment
import com.generation.projeto0606.fragment.TimerPickerListener
import com.generation.projeto0606.model.Categoria
import com.generation.projeto0606.model.Tarefa
import java.time.LocalDate
import kotlin.math.log

class FormFragment : Fragment(), TimerPickerListener {

    private lateinit var binding: FragmentFormBinding
    private val mainViewModel: MainViewModel by activityViewModels()
    private var categoriaSelecionada = 0L
    private var tarefaSelecionada: Tarefa? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentFormBinding.inflate (layoutInflater, container,false)

        carregarDados()

        mainViewModel.listCategoria()

        mainViewModel.dataSelecionada.value = LocalDate.now()

        mainViewModel.myCategoriaResponse.observe(viewLifecycleOwner){
            response -> Log.d("Requisicao", response.body().toString())
            spinnerCategoria(response.body())
        }

        mainViewModel.dataSelecionada.observe(viewLifecycleOwner){
            selectedDate -> binding.Data.setText(selectedDate.toString())
        }

        binding.buttonSalvar.setOnClickListener{
           inserirNoBanco()
        }

        binding.Data.setOnClickListener {
            DatePickerFragment(this)
                .show(parentFragmentManager, "DatePicker")
        }

        return binding.root
    }

    private fun spinnerCategoria(listCategoria: List<Categoria>?){
        if (listCategoria != null){
            binding.spinnerCategoria.adapter =
                ArrayAdapter(
                    requireContext(),
                    androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                    listCategoria
                )

            binding.spinnerCategoria.onItemSelectedListener =
                object : AdapterView.OnItemSelectedListener{
                    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                        val selected = binding.spinnerCategoria.selectedItem as Categoria

                        categoriaSelecionada = selected.id
                    }

                    override fun onNothingSelected(p0: AdapterView<*>?) {
                        TODO("Not yet implemented")
                    }

                }
        }
    }

    private fun validarCampos(
        nome: String, descricao: String, responsavel: String
    ): Boolean{
        return !(
                (nome == "" || nome.length < 3 || nome.length > 20) ||
                        (descricao == "" || descricao.length < 5 || descricao.length > 200) ||
                        (responsavel == "" || responsavel.length < 3 || responsavel.length > 20)
                )
    }

    private fun inserirNoBanco(){
        val nome = binding.Nome.text.toString()
        val desc = binding.Tarefa.text.toString()
        val resp = binding.Responsavel.text.toString()
        val data = binding.Data.text.toString()
        val status = binding.switch1.isChecked
        val categoria = Categoria(categoriaSelecionada, null, null)
        Log.d("categoria", categoria.id.toString())

        if(validarCampos(nome, desc, resp)){
            val salvar: String
            if(tarefaSelecionada != null){
                salvar = "Tarefa Atualizada!"
                val tarefa = Tarefa(tarefaSelecionada?.id!!, nome, desc, resp, data, status, categoria)
                mainViewModel.updateTarefa(tarefa)
            }else{
                salvar = "Tarefa Criada!"
                val tarefa = Tarefa(0, nome, desc, resp, data, status, categoria)
                mainViewModel.addTarefa(tarefa)
            }
            Toast.makeText(context, salvar, Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_listFragment_to_formFragment)

        }else{
            Toast.makeText(context, "Verifique os campos!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun carregarDados(){
        tarefaSelecionada = mainViewModel.tarefaSelecionada
        if(tarefaSelecionada!= null){
            binding.Nome.setText(tarefaSelecionada?.nome)
            binding.Tarefa.setText(tarefaSelecionada?.descricao)
            binding.Responsavel.setText(tarefaSelecionada?.responsavel)
            binding.Data.setText(tarefaSelecionada?.data)
            binding.switch1.isChecked = tarefaSelecionada?.status!!
        }
    }

    override fun onDateSelected(date: LocalDate) {
        mainViewModel.dataSelecionada.value = date
    }
    
}


