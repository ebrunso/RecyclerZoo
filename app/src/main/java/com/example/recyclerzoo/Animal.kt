package com.example.recyclerzoo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Animal(
    var animalName : String,
    var phyla : String,
    var globalOrigin : String) : Parcelable