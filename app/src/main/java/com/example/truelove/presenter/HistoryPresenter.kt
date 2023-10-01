package com.example.truelove.presenter

import android.util.Log
import com.example.truelove.App
import com.example.truelove.model.LoveModel
import com.example.truelove.ui.view.HistoryView

class HistoryPresenter(private val historyView: HistoryView) {

    fun getHistoryList(){
        historyView.initRecyclerView(App.database.loveDao().getAll())
    }

    fun deleteHistory(loveModel: LoveModel){
        App.database.loveDao().delete(loveModel)
        getHistoryList()
    }

    fun getTime(loveModel: LoveModel){
        Log.d("ololo", "getDate: ${loveModel.insertTime}")
        loveModel.insertTime?.let { historyView.showTimeDialog(it) }
    }

}