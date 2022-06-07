package com.idn.sholatkuy.network2

import com.idn.sholatkuy.response.DoaResponseItem
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService2 {
    @GET("api")
    fun getDoa(): Flowable<List<DoaResponseItem>>
}