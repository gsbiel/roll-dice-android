package com.example.rolldice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rollButton;
    ImageView dice1;
    ImageView dice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.dice1 = (ImageView) findViewById(R.id.firstDice);
        this.dice2 = (ImageView) findViewById(R.id.secondDice);
        this.rollButton = (Button) findViewById(R.id.rollButton);

        this.rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int limiteSuperior = 6;

                ImageView dice1 = (ImageView) findViewById(R.id.firstDice);
                ImageView dice2 = (ImageView) findViewById(R.id.secondDice);

                changeImageResourceOfDiceToIndex(dice1, rand.nextInt(limiteSuperior));
                changeImageResourceOfDiceToIndex(dice2, rand.nextInt(limiteSuperior));
            }
        });
    }

    private void changeImageResourceOfDiceToIndex(ImageView image, int index) {
        if(index == 0){
            image.setImageResource(R.drawable.dice1);
        }else if(index == 1){
            image.setImageResource(R.drawable.dice2);
        }else if(index == 2){
            image.setImageResource(R.drawable.dice3);
        }else if(index == 3){
            image.setImageResource(R.drawable.dice4);
        }else if(index == 4){
            image.setImageResource(R.drawable.dice5);
        }else if(index == 5){
            image.setImageResource(R.drawable.dice6);
        }
    }

}
