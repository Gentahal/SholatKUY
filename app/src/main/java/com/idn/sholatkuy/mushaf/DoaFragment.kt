package com.idn.sholatkuy.mushaf

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.idn.sholatkuy.R
import com.idn.sholatkuy.databinding.FragmentDoaBinding
import com.idn.sholatkuy.mushaf.DoaAdapter
import com.idn.sholatkuy.ui.JadwalAdapter
import com.idn.sholatkuy.ui.MainViewModel

class DoaFragment : Fragment() {

    private var _binding : FragmentDoaBinding? = null
    private val binding get() = _binding as FragmentDoaBinding

    private val viewModel : MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDoaBinding.inflate(inflater, container, false)
        binding.rvDoa.setOnClickListener {
            activity?.let {
                val intent = Intent(it, DetailDoa::class.java)
                it.startActivity(intent)
            }
        }

        viewModel.getDoa()

        viewModel.listDoa.observe(viewLifecycleOwner){
            Log.i("Data Doa", "$it")
            val adapter = DoaAdapter()
            adapter.setData(it)
            binding.rvDoa.adapter = adapter
        }
        return binding.root
    }

}