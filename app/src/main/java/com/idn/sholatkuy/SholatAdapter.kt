package com.idn.sholatkuy

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.idn.sholatkuy.databinding.RowItemSholatBinding
import com.idn.sholatkuy.response.JadwalResponse

class SholatAdapter : RecyclerView.Adapter<SholatAdapter.MyViewHolder>() {

    private var listSholat = ArrayList<JadwalResponse>()

    fun setData(data: List<JadwalResponse>?) {
        if (data == null) return
        listSholat.clear()
        listSholat.addAll(data)
    }

    private var onItemClickCallback : OnItemClickCallback? = null

    class MyViewHolder(val binding: RowItemSholatBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}