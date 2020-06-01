package com.example.rolldice.rolldice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.rolldice.R
import com.example.rolldice.databinding.FragmentDiceBinding

class DiceFragment: Fragment() {

    private lateinit var viewModel: DiceViewModel
    private lateinit var viewModelFactory: DiceViewModelFactory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentDiceBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_dice, container, false)
        binding.lifecycleOwner = this
        viewModelFactory = DiceViewModelFactory(1,2)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(DiceViewModel::class.java)
        binding.diceViewModel = viewModel
        return binding.root
    }
}