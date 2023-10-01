package com.example.truelove.model.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.truelove.model.LoveModel

@Database(entities = [LoveModel::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun loveDao():LoveDao

}