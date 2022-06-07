package com.idn.sholatkuy.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.idn.sholatkuy.databinding.RowItemSholatBinding
import com.idn.sholatkuy.response.Jadwal

class JadwalAdapter(jadwal: Jadwal) : RecyclerView.Adapter<JadwalAdapter.MyViewHolder>() {
    private val listSholat = listOf("subuh","dhuha","dzuhur","ashar","maghrib","isya")
    private val listWaktu = listOf(jadwal.subuh,jadwal.dhuha,jadwal.dzuhur,jadwal.ashar,jadwal.maghrib,jadwal.isya)
    init {
        Log.i("JadwalAdapter", "$jadwal")
    }
//
//    fun setData(data:List<JadwalResponse>){
//        if (data == null) return
//        listSholat.clear()
//        listSholat.addAll(data)
//    }

    class MyViewHolder(val binding: RowItemSholatBinding) :
        RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= MyViewHolder(
        RowItemSholatBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val waktuSholat = listSholat[position]
        val jamSholat = listWaktu[position]
        Log.i("Sholat", "$waktuSholat $jamSholat")
        holder.binding.apply {
            rvWaktu.text  = waktuSholat
            rvTime.text = jamSholat
        }
    }

    override fun getItemCount() = listSholat.size


}