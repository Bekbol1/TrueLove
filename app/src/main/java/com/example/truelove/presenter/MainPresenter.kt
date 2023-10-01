package com.example.truelove.presenter

import android.util.Log
import com.example.truelove.App
import com.example.truelove.model.LoveModel
import com.example.truelove.model.RetrofitService
import com.example.truelove.ui.view.LoveView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainPresenter(val loveView: LoveView) {

    private var api = RetrofitService.api

    fun getLoveResult(firstName: String, secondName: String) {
        api.countCompatibility(
            firstName, secondName
        ).enqueue(object : Callback<LoveModel> {
            override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                response.body()?.let {model ->
                    model.insertTime = java.util.Date().time
                    Log.e("ololo", "onResponse: ${model.insertTime}")
                    loveView.changeFragment(model)
                    App.database.loveDao().insert(model)
                    //findNavController().navigate(R.id.resultFragment, bundleOf("result" to response.body()))
                }
            }

            override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                loveView.showError(t.message.toString())
            }

        })
    }

}