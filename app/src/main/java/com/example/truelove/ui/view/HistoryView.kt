package com.example.truelove.ui.view

import com.example.truelove.model.LoveModel

interface HistoryView {

    fun initRecyclerView(historyList: List<LoveModel>)

    fun showTimeDialog(time:Long)

    fun showDeleteDialog(loveModel: LoveModel)
}