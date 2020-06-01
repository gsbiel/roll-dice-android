package com.example.rolldice.rolldice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders

class DiceFragment: Fragment() {

    private lateinit var viewModel: DiceViewModel
    private lateinit var viewModelFactory: DiceViewModelFactory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
        viewModelFactory = DiceViewModelFactory(1,2)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(DiceViewModel::class.java)
    }
}