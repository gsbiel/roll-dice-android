package com.example.rolldice.rolldice

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class DiceViewModelFactory(private val dice1: Int, private val dice2: Int): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(DiceViewModel::class.java)){
            return DiceViewModel(dice1, dice2) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class!")
    }
}