package com.idn.sholatkuy

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.idn.sholatkuy.network.ApiClient

class MainViewModel : ViewModel() {

    val jadwalResponse = MutableLiveData<List<JadwalResponse>>()
    val isLoading = MutableLiveData<Boolean>()
    val isError = MutableLiveData<Throwable>()

    private fun getJadwalSholat(responHandler: (List<JadwalResponse>)-> Unit, errorHandler: (Throwable)-> Unit) {
        ApiClient.getApiService().jadwalSholat()
    }
}