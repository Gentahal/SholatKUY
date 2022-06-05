package com.idn.sholatkuy.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.idn.sholatkuy.databinding.RowItemSholatBinding
import com.idn.sholatkuy.response.JadwalResponse

class JadwalAdapter : RecyclerView.Adapter<JadwalAdapter.MyViewHolder>() {

    private var listSholat = ArrayList<JadwalResponse>()

    fun setData(data:List<JadwalResponse>){
        if (data == null) return
        listSholat.clear()
        listSholat.addAll(data)
    }

    class MyViewHolder(val binding: RowItemSholatBinding) :
        RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= MyViewHolder(
        RowItemSholatBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = listSholat[position]
        holder.binding.apply {
            rvTime.text
        }
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}