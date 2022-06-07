package com.idn.sholatkuy.network

import com.idn.sholatkuy.response.IdkotaResponse
import com.idn.sholatkuy.response.Jadwal
import com.idn.sholatkuy.response.JadwalResponse
import com.idn.sholatkuy.response.TafsirResponse
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("sholat/jadwal/{idKota}/{tahun}/{bulan}/{tanggal}")
    fun getJadwalSholat(
        @Path("idKota") idKota: String,
        @Path("tahun") tahun: Int,
        @Path("bulan") bulan: Int,
        @Path("tanggal") tanggal: Int
    ): Flowable<JadwalResponse>

    @GET("sholat/kota/cari/{kota}")
    fun getKota(
        @Path("kota") kota: String
    ): Flowable<IdkotaResponse>

    @GET("tafsir/quran/kemenag/id/{idTafsir}")
    fun getBacaTafsir(
        @Path("idTafsir") idTafsir: Int
    ): Flowable<TafsirResponse>
}