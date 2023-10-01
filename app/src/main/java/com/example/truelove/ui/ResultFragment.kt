package com.example.truelove.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.truelove.R
import com.example.truelove.model.LoveModel
import com.example.truelove.databinding.FragmentResultBinding
import com.example.truelove.presenter.ResultPresenter
import com.example.truelove.ui.CalculateFragment.Companion.MODEL_KEY
import com.example.truelove.ui.view.ResultView

class ResultFragment : Fragment(), ResultView {

    private lateinit var binding: FragmentResultBinding
    private val presenter = ResultPresenter(this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResultBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
        getResult()
    }

    private fun getResult() {
        val result = arguments?.getSerializable(MODEL_KEY) as LoveModel
        presenter.getData(result)


    }

    private fun initListeners() {
        with(binding) {
            btnTryAgain.setOnClickListener {
                findNavController().navigateUp()
            }
            imgHistory.setOnClickListener {
                findNavController().navigate(R.id.historyFragment)
            }
            imgHome.setOnClickListener {
                findNavController().navigate(R.id.calculateFragment)
            }
        }
    }


    override fun showLove(
        firstName: String,
        secondName: String,
        percentage: String,
    ) {
        with(binding) {
            tvFirstname.text = firstName
            tvSecondname.text = secondName
            tvPercent.text = percentage
        }


    }
}