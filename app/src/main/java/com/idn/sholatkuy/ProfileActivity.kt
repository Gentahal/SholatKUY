package com.idn.sholatkuy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.idn.sholatkuy.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private var _binding : ActivityProfileBinding? = null
    private val binding get() = _binding as ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtnProfile.setOnClickListener {
            finish()
        }
    }
}