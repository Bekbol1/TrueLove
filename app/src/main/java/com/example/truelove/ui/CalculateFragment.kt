package com.example.truelove.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.leanback.widget.Presenter
import androidx.navigation.fragment.findNavController
import com.example.truelove.model.LoveModel
import com.example.truelove.R
import com.example.truelove.model.RetrofitService
import com.example.truelove.databinding.FragmentCalculateBinding
import com.example.truelove.presenter.MainPresenter
import com.example.truelove.ui.view.LoveView
import retrofit2.Call
import retrofit2.Response

class CalculateFragment : Fragment(), LoveView {

    private lateinit var binding: FragmentCalculateBinding
    private val presenter = MainPresenter(this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCalculateBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            btnCalculate.setOnClickListener {
                presenter.getLoveResult(etFirstname.text.toString(), etSecondname.text.toString())
            }
            containerHistory.setOnClickListener {
                findNavController().navigate(R.id.historyFragment)
            }

        }
    }


    override fun changeFragment(loveModel: LoveModel) {
        findNavController().navigate(R.id.resultFragment, bundleOf(MODEL_KEY to loveModel))

        binding.etFirstname.text.clear()
        binding.etSecondname.text.clear()
    }

    override fun showError(error: String) {
        Toast.makeText(requireContext(),error, Toast.LENGTH_SHORT).show()
    }

    companion object {
        val MODEL_KEY = "model.key"
    }


}