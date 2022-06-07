package com.idn.sholatkuy.network2

import com.idn.sholatkuy.response.DoaResponse
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService2 {
    @GET("api")
    fun getDoa(
        @Path("id") id: String,
        @Path("doa") doa: String,
        @Path("ayat") ayat: String,
        @Path("latin") latin: String,
        @Path("arinya") artinya: String
    ): Flowable<DoaResponse>
}