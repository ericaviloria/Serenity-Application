package com.example.serenityapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class motivquotes extends AppCompatActivity {
    Random random = new Random();
    TextView textQuot;
    Button buttonQuot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivquotes);

        textQuot = findViewById(R.id.textViewNextQuote);
        buttonQuot = findViewById(R.id.buttonNextQuote);

        buttonQuot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayQuote();

            }
        });

        displayQuote();
    }

    public void displayQuote(){

        int randNum = random.nextInt((5+1)-1)+1;
        String randQuote="";

        switch(randNum){
            case 1:
                randQuote = getString(R.string.quote1);
                break;
            case 2:
                randQuote = getString(R.string.quote2);
                break;
            case 3:
                randQuote = getString(R.string.quote3);
                break;
            case 4:
                randQuote = getString(R.string.quote4);
                break;
            case 5:
                randQuote = getString(R.string.quote5);
                break;
        }
        textQuot.setText(randQuote);
    }
}