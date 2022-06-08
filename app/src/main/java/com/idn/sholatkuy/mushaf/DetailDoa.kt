package com.idn.sholatkuy.mushaf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.idn.sholatkuy.R
import com.idn.sholatkuy.databinding.ActivityDetailDoaBinding
import com.idn.sholatkuy.response.DoaResponseItem
import com.idn.sholatkuy.ui.MainViewModel

class DetailDoa : AppCompatActivity() {

    private var _binding : ActivityDetailDoaBinding? = null
    private val binding get() = _binding as ActivityDetailDoaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_doa)

        _binding = ActivityDetailDoaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(false)

       val doa = intent.getParcelableExtra<DoaResponseItem>(EXTRA_DOA)
        doa?.let {
            binding.apply {
                Glide.with(this@DetailDoa)
                tvNamaDoa.text = doa.doa
                tvAyatArab.text = doa.ayat
                tvLatin.text = doa.latin
                tvArti.text = doa.artinya
            }
        }
    }
    companion object {
        const val EXTRA_DOA = "extra_doa"
    }
}