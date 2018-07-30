package com.mysticwater.mydiscountcalculator

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CalculateDiscountFragment : Fragment() {

    private lateinit var calculatedPriceText: TextView

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_calculate, container, false)

        calculatedPriceText = view.findViewById(R.id.text_calculated_price)
        calculatedPriceText.text = getString(R.string.text_price_zero)

        setupFab(view)

        return view
    }

    private fun setupFab(view: View) {
        view.findViewById<FloatingActionButton>(R.id.fab_calculate).apply {
            setOnClickListener {
                calculatePrice()
            }
        }
    }

    private fun calculatePrice() {
        // TODO
    }

    companion object {
        fun newInstance() = CalculateDiscountFragment()
    }

}