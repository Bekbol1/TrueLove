package com.example.truelove.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity(tableName = "database-name")
data class LoveModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    var insertTime: Long,
    @SerializedName("fname")
    val firstName: String,
    @SerializedName("sname")
    val secondName: String,
    val percentage: String,
    val result: String,
) :Serializable
