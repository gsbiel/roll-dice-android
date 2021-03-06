package com.example.rolldice.rolldice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.rolldice.getImage
import kotlin.random.Random

class DiceViewModel(private val dice1: Int, private val dice2: Int): ViewModel() {

    private val _firstDice = MutableLiveData<Int>()
    val firstDice: LiveData<Int>
        get() = _firstDice

    private val _secondDice = MutableLiveData<Int>()
    val secondDice: LiveData<Int>
        get() = _secondDice

    fun rollDices(){
        _firstDice.postValue(Random.nextInt(0,6))
        _secondDice.postValue(Random.nextInt(0,6))
    }
}