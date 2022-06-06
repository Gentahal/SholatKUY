package com.idn.sholatkuy.network

import com.idn.sholatkuy.response.Jadwal
import com.idn.sholatkuy.response.JadwalResponse
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("sholat/jadwal/{idKota}/{tahun}/{bulan}/{tanggal}")
    fun getJadwalSholat(
        @Path("idKota") idKota: Int,
        @Path("tahun") tahun: Int,
        @Path("bulan") bulan: Int,
        @Path("tanggal") tanggal: Int
    ) : Flowable<JadwalResponse>
}