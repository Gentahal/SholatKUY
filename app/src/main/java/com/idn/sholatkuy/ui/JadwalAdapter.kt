package com.idn.sholatkuy.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.recyclerview.widget.RecyclerView
import com.idn.sholatkuy.R
import com.idn.sholatkuy.databinding.RowItemSholatBinding
import com.idn.sholatkuy.response.Data
import com.idn.sholatkuy.response.Jadwal

class JadwalAdapter(jadwal: Jadwal) : RecyclerView.Adapter<JadwalAdapter.MyViewHolder>() {
    private val listSholat = listOf("subuh","dhuha","dzuhur","ashar","maghrib","isya")
    private val listWaktu = listOf(jadwal.subuh,jadwal.dhuha,jadwal.dzuhur,jadwal.ashar,jadwal.maghrib,jadwal.isya)
    init {
        Log.i("JadwalAdapter", "$jadwal")
    }

    val NOTIF_ID = "notif_id"
    val NOTIFICATION_ID = 0

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
            btnJadwalSholat.apply {
                text  = waktuSholat
                setOnClickListener {
                    val notification = NotificationCompat.Builder(context, NOTIF_ID)
                        .setContentTitle("Sholat Kuy")
                        .setContentText("Sudah masuk waktu $waktuSholat nih SHOLATKUY!!")
                        .setColor(resources.getColor(R.color.primary))
                        .setSmallIcon(R.drawable.ic_baseline_menu_book_24)
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .build()

                    val notificationManager = NotificationManagerCompat.from(context)

                    setOnClickListener {
                        notificationManager.notify(NOTIFICATION_ID, notification)
                    }
                }
            }
            rvTime.text = jamSholat
        }
    }

    override fun getItemCount() = listSholat.size


}