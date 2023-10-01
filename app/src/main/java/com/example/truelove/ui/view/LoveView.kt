package com.example.truelove.ui.view

import com.example.truelove.model.LoveModel

interface LoveView {
    fun changeFragment(loveModel: LoveModel)
    fun showError(error: String)
}