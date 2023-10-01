package com.example.truelove

import android.app.Application
import androidx.room.Room
import com.example.truelove.model.data.AppDatabase

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database-name"
        ).allowMainThreadQueries().build()
    }
    companion object{
        lateinit var database: AppDatabase
    }

}