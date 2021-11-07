package com.example.serenityapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class stress extends AppCompatActivity {

    ImageView back1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stress);

        ImageView back1=(ImageView) findViewById(R.id.back1);

        back1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(stress.this,MainActivity.class);
                startActivity(int1);
            }
        });

        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Diaphragmatic Breathing");
        list.add("The Body Scan Meditation");
        list.add("Visualization");
        list.add("The Stimulating Breath");
        list.add("Counting the Breath");
        list.add("Progressive Muscle Relaxation");
        list.add("The Blackboard Technique");
        list.add("Walking Meditation");
        list.add("Gratitude Meditation");
        list.add("Stillness Challenge");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
//                   startActivity(new Intent(stress.this,Therapy1.class));
                } else if (position == 1) {
                    startActivity(new Intent(stress.this,Therapy2.class));
                } else if (position == 2) {
                    startActivity(new Intent(stress.this,Therapy3.class));
                } else if (position == 3) {
                    startActivity(new Intent(stress.this,Therapy4.class));
                } else if (position == 4) {
                    startActivity(new Intent(stress.this,Therapy5.class));

                }
            }
        });
    }
    }