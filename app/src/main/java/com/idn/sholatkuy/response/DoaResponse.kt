package com.idn.sholatkuy.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DoaResponse(

	@field:SerializedName("DoaResponse")
	val doaResponse: List<DoaItem?>? = null
) : Parcelable

@Parcelize
data class DoaItem(

	@field:SerializedName("ayat")
	val ayat: String? = null,

	@field:SerializedName("doa")
	val doa: String? = null,

	@field:SerializedName("artinya")
	val artinya: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("latin")
	val latin: String? = null
) : Parcelable
