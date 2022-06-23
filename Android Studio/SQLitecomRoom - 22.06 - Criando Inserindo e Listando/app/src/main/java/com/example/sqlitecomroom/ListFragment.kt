package com.example.sqlitecomroom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sqlitecomroom.adapter.UserAdapter
import com.example.sqlitecomroom.databinding.FragmentList2Binding

class ListFragment : Fragment() {

    private lateinit var binding: FragmentList2Binding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentList2Binding.inflate(layoutInflater, container, false)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val adapter = UserAdapter()
        binding.RecycleTarefa.layoutManager = LinearLayoutManager(context)
        binding.RecycleTarefa.adapter = adapter
        binding.RecycleTarefa.setHasFixedSize(true)

        mainViewModel.selectUsers.observe(viewLifecycleOwner){
            response -> adapter.setList(response)
        }

        binding.floatingActionButton2.setOnClickListener{
            findNavController().navigate(R.id.action_listFragment_to_addFragment)
        }
        return binding.root
    }
}