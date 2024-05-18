package com.example.puresources;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FacultyOfEngineering extends AppCompatActivity {

    ListView listView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_of_engineering);

        listView = findViewById(R.id.listview2);

        List<String> list = new ArrayList<>();
        list.add("Bachelor of Technology in Civil Engineering");
        list.add("Bachelor of Technology in Mechanical Engineering");
        list.add("Bachelor of Technology in Electrical Engineering");
        list.add("Bachelor of Technology in Electronics and Communication Engineering");
        list.add("Bachelor of Technology in Computer Science and Engineering");
        list.add("Bachelor of Technology in Information and Technology");
        list.add("Bachelor of Technology in Automobile Engineering");
        list.add("Bachelor of Technology in Aeronautical Engineering");
        list.add("Bachelor of Technology in Chemical Engineering");
        list.add("Bachelor of Technology in Mining Engineering");
        list.add("Bachelor of Technology in Metallurgical and Material Engineering");
        list.add("Bachelor of Technology in Artificial Intelligence and Machine Learning");
        list.add("Bachelor of Technology in Agriculture");
        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==4) {
                    startActivity(new Intent(FacultyOfEngineering.this, FfeCseSubject.class));
                } else {
                    Toast.makeText(FacultyOfEngineering.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

