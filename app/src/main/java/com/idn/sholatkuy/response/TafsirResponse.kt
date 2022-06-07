package com.idn.sholatkuy.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TafsirResponse(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
) : Parcelable

@Parcelize
data class DataTafsir(

	@field:SerializedName("mufasir")
	val mufasir: String? = null,

	@field:SerializedName("aya_number")
	val ayaNumber: Int? = null,

	@field:SerializedName("aya_name")
	val ayaName: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("tafsir_id")
	val tafsirId: Int? = null,

	@field:SerializedName("sura_id")
	val suraId: Int? = null,

	@field:SerializedName("html")
	val html: String? = null
) : Parcelable
