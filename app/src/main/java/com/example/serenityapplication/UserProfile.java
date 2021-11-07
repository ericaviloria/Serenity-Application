package com.example.serenityapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UserProfile extends AppCompatActivity {

    TextView logout;
    TextView backmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        backmenu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent myIntent = new Intent(v.getContext(), MainActivity2.class);
                startActivity(myIntent);
            }
        });

        logout.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent myIntent1 = new Intent(v.getContext(), MainActivity.class);
                startActivity(myIntent1);
            }
        });
    }
}