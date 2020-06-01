package com.example.rolldice
import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("diceImage")
fun ImageView.setDiceImage(item: Int?){
    item?.let{
        setImageResource(when(it){
            0 -> R.drawable.dice1
            1 -> R.drawable.dice2
            2 -> R.drawable.dice3
            3 -> R.drawable.dice4
            4 -> R.drawable.dice5
            5 -> R.drawable.dice6
            else -> R.drawable.dice1
        })
    }
}