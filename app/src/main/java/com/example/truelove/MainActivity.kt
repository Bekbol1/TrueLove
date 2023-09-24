package com.example.truelove

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.os.bundleOf
import com.example.truelove.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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
