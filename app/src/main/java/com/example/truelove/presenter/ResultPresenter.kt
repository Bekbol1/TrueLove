package com.example.truelove.presenter

import com.example.truelove.model.LoveModel
import com.example.truelove.ui.view.ResultView

class ResultPresenter(private val resultView: ResultView) {

    fun getData(loveModel: LoveModel) {
        resultView.showLove(
            loveModel.firstName,
            loveModel.secondName,
            loveModel.percentage
        )
    }

}