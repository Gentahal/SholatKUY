package com.idn.sholatkuy.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.idn.sholatkuy.databinding.RowItemSholatBinding
import com.idn.sholatkuy.response.Jadwal
import com.idn.sholatkuy.response.JadwalResponse

class JadwalAdapter(private val jadwal: Jadwal) : RecyclerView.Adapter<JadwalAdapter.MyViewHolder>() {
    private val listSholat = listOf("subuh","dhuha","dzuhur","ashar","maghrib","isya")
    private val listWaktu = listOf(jadwal.subuh,jadwal.dhuha,jadwal.dzuhur,jadwal.ashar,jadwal.maghrib,jadwal.isya)

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
        holder.binding.apply {
            rvWaktu.text  = waktuSholat
            rvTime.text = jamSholat
        }
    }

    override fun getItemCount() = listSholat.size


}