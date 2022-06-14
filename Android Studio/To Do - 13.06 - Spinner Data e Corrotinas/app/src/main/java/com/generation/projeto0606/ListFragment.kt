package com.generation.projeto0606

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generation.projeto0606.adapter.TarefaAdapter
import com.generation.projeto0606.databinding.FragmentListBinding
import com.generation.projeto0606.model.Tarefa

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater, container, false)

        //Configuração do RecycleView
        val adapter = TarefaAdapter()
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.setHasFixedSize(true)

        binding.floatingAdd.setOnClickListener {
        findNavController().navigate(R.id.action_listFragment_to_formFragment)
    }

        return binding.root
    }
}


