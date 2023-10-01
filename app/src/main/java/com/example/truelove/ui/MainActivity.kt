package com.example.truelove.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.truelove.R

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }
    }

//    private fun initClickers() {
//        with(binding) {
//            calculate.setOnClickListener {
//                RetrofitService().api.countCompatibility(
//                    firstName.text.toString(),
//                    secondName.text.toString()
//                ).enqueue(object : Callback<LoveModel> {
//                    override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
//                        if (response.isSuccessful) {
//                            Log.e("ololo", "onResponse: ${response.body()}")
//                            findNavController().navigate(
//                                R.id.resultFragment,
//                                bundleOf("result" to response.body())
//                            )
//                        }
//                        firstName.text.clear()
//                        secondName.text.clear()
//                    }
//
//
//                    override fun onFailure(call: Call<LoveModel>, t: Throwable) {
//                        Toast.makeText(requireContext(),"OnFailure: ${t.message}",Toast.LENGTH_SHORT).show()                    }
//                })
//            }
//        }
//    }
