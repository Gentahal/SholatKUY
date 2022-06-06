package com.idn.sholatkuy.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.idn.sholatkuy.network.ApiClient
import com.idn.sholatkuy.response.Data
import com.idn.sholatkuy.response.Jadwal
import com.idn.sholatkuy.response.JadwalResponse
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.schedulers.Schedulers
import java.text.SimpleDateFormat
import java.util.*

class MainViewModel : ViewModel() {

    val jadwalResponse = MutableLiveData<Jadwal>()
    val isLoading = MutableLiveData<Boolean>()
    val isError = MutableLiveData<Throwable>()

    private fun getJadwalSholat(responHandler: (Jadwal)-> Unit, errorHandler: (Throwable)-> Unit) {
        val idKota = 1203
        // get today date
        val date = SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()).format(Date())
        val tahun = date.split("/")[0].toInt()
        val bulan = date.split("/")[1].toInt()
        val tanggal = date.split("/")[2].toInt()


        ApiClient.getApiService().getJadwalSholat(idKota, tahun, bulan, tanggal)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                responHandler(it.data?.jadwal as Jadwal)
            }, {
                errorHandler(it)
            })
    }

    fun getData(){
        isLoading.value= true
        getJadwalSholat({
            isLoading.value = false
            jadwalResponse.value = it
        },{
            isLoading.value = true
            isError.value = it
        })
    }

}