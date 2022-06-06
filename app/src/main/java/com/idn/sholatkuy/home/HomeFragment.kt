package com.idn.sholatkuy.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.idn.sholatkuy.databinding.FragmentHomeBinding
import com.idn.sholatkuy.ui.JadwalAdapter
import com.idn.sholatkuy.ui.MainViewModel

class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding as FragmentHomeBinding

    val viewModel : MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        viewModel.getData()

        viewModel.jadwalResponse.observe(viewLifecycleOwner){
            Log.i("Jadwal", "$it")
            binding.rvJadwal.adapter = JadwalAdapter(it)
        }

        return binding.root
    }

}