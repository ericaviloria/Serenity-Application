package com.example.serenityapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    Button butt1;
    Button butt2;
    Button butt4;
    ImageButton Profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button butt1=(Button) findViewById(R.id.button);
        Button butt2=(Button) findViewById(R.id.button1);
        Button butt4=(Button) findViewById(R.id.button3);
        ImageButton butt5=(ImageButton) findViewById(R.id.Profile);

        butt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(MainActivity2.this,MusicPlayer.class);
                startActivity(int1);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(MainActivity2.this,stress.class);
                startActivity(int2);
            }
        });

        butt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(MainActivity2.this,motivquotes.class);
                startActivity(int4);
            }
        });

        butt5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(MainActivity2.this,UserProfile.class);
                startActivity(int5);
            }
        });

    }

}