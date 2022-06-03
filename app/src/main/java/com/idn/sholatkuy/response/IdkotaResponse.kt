package com.idn.sholatkuy.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class IdkotaResponse(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

) : Parcelable

@Parcelize
data class DataItem(

	@field:SerializedName("lokasi")
	val lokasi: String? = null,

	@field:SerializedName("id")
	val id: String? = null
) : Parcelable
