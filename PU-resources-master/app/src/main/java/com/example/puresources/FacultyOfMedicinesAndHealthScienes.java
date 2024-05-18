package com.example.puresources;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FacultyOfMedicinesAndHealthScienes extends AppCompatActivity {

    ListView listView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_of_medicines_and_health_scienes);

        listView = findViewById(R.id.listview10);

        List<String> list = new ArrayList<>();
        list.add("Bachelor of Medicine");
        list.add("Bachelor of Ayurveda");
        list.add("Bachelor of Homeopathy");
        list.add("Bachelor of Dental Science");
        list.add("Bachelor of Physiotherapy");
        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);
    }
}