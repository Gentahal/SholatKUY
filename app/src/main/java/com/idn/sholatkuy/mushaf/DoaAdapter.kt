package com.idn.sholatkuy.mushaf

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.idn.sholatkuy.databinding.RowItemDoaBinding
import com.idn.sholatkuy.response.DoaResponseItem

class DoaAdapter(): RecyclerView.Adapter<DoaAdapter.MyViewHolder>()  {

    private var listDoa = ArrayList<DoaResponseItem>()



    fun setData(data: List<DoaResponseItem>?) {
        if (data == null) return
        listDoa.clear()
        listDoa.addAll(data)
    }

    class MyViewHolder(val binding: RowItemDoaBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= MyViewHolder(
        RowItemDoaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )



    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val doa = listDoa[position]
        Log.i("ItemDoa","$doa")
        holder.binding.apply {
            tvTafsir.text = doa.doa
        }

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailDoa::class.java)
            intent.putExtra(DetailDoa.EXTRA_DOA, doa)
            it.context.startActivities(arrayOf(intent))
        }
    }

    override fun getItemCount()= listDoa.size
}