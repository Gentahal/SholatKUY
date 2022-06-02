package com.idn.sholatkuy.network

import com.idn.sholatkuy.response.JadwalResponse
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET

interface ApiService {
    @GET("jadwal")
    fun getJadwalSholat() : Flowable<List<JadwalResponse>>
}