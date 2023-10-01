package com.example.truelove.model.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.truelove.model.LoveModel

@Dao
interface LoveDao {

    @Query("SELECT * FROM `database-name` ORDER BY id DESC")
    fun getAll():List<LoveModel>

    @Insert
    fun insert(loveModel: LoveModel)

    @Delete
    fun delete(loveModel: LoveModel)

}