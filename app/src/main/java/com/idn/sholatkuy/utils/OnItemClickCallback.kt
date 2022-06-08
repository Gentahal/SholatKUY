package com.idn.sholatkuy.utils

import com.idn.sholatkuy.response.DoaResponseItem
import com.idn.sholatkuy.response.JadwalResponse


interface OnItemClickCallback  {

    fun onItemClicked (item : DoaResponseItem)
}