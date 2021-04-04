package com.example.aula4intentyactivity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Cliente(var codigo: Int, var nome: String): Parcelable {
}