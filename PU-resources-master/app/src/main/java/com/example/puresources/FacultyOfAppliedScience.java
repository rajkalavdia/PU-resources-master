package com.example.puresources;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FacultyOfAppliedScience extends AppCompatActivity {

    ListView listView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_of_applied_science);

        listView = findViewById(R.id.listview6);

        List<String> list = new ArrayList<>();
        list.add("Bachelor of Science in Mathematics");
        list.add("Bachelor of Science in Physics");
        list.add("Bachelor of Science in Chemistry");
        list.add("Bachelor of Science in Forensic Sciences");
        list.add("Bachelor of Science in Applied Biology");
        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);
    }
}