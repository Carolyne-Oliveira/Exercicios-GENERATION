package com.generation.projeto0606

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.generation.projeto0606.databinding.FragmentListBinding
import com.generation.projeto0606.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater, container, false)

               val listTarefa = listOf(
            Tarefa(
                "Lavar a louça",
                "Lavar a louça o dia todo",
                "Carolyne",
                "2022-06-15",
                false,
                "Dia a Dia"
            ),
            Tarefa(
                "Ir ao Cinema",
                "Assistir qualquer filme",
                "Carolyne",
                "2022-06-20",
                false,
                "Lazer"
            ),
            Tarefa(
                "Correr no parque",
                "Correr no parque do Povo",
                "Carolyne",
                "2022-06-09",
                true,
                "Lazer"
            ),

        )

        binding.floatingAdd.setOnClickListener {
        findNavController().navigate(R.id.action_listFragment_to_formFragment)
    }

        return binding.root
    }
}


