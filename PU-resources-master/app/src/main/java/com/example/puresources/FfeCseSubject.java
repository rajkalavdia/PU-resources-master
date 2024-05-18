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

import java.util.ArrayList;
import java.util.List;

public class FfeCseSubject extends AppCompatActivity {
    ListView listView;
    EditText editText;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ffe_cse_subject);

        listView = findViewById(R.id.listviewcse);
        editText = findViewById(R.id.searchCSE);

        List<String> list = new ArrayList<>();
        list.add("Basic Electrical Engineering");
        list.add("Environmental Science");
        list.add("Engineering Graphics & Design");
        list.add("Mathematics-I");
        list.add("Programming for Problem Solving");
        list.add("Basic Mechanical Engineering");
        list.add("Mathematics-II");
        list.add("Basic Electronics");
        list.add("Physics Group - II");
        list.add("Effective Technical Communication");
        list.add("Probability and Statistics");
        list.add("Indian Constitution");
        list.add("Data Structures");
        list.add("Database Management Systems");
        list.add("Digital Fundamentals");
        list.add("Object Oriented Programming With C++");
        list.add("Operating System");
        list.add("Object Oriented Programming - I");
        list.add("Computer Organization & Architecture");
        list.add("Discrete Mathematics");
        list.add("Principles Of Economics And Management");
        list.add("Analysis And Design Of Algorithms");
        list.add("Professional Ethics");
        list.add("Computer Networks");
        list.add("Software Engineering");
        list.add("Computer Graphics");
        list.add("Python for Data Science");
        list.add("Cyber Security");
        list.add("Theory of Computation");
        list.add("Advanced Java");
        list.add("Web Technology");
        list.add("Theory of Computation");
        list.add("Advance java Programming");
        list.add("Microprocessor and Interfacing");
        list.add("WEB Programming");
        list.add("Data Mining");
        list.add("IOT and Applications");
        list.add("Artificial Intelligence");
        list.add("Information and Network Security");
        list.add("Mobile Computing and Wireless Communication");
        list.add("Data Mining and Business Intelligence");
        list.add("Compiler Design");
        list.add("Distributed System");
        list.add("Big Data Analytics");
        list.add("Mobile Application Development");
        list.add("Cloud Infrastructure and Services");
        list.add("Web Data Management");
        list.add("iOS Programming");
        list.add("Android Programming");


        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = listView.getItemAtPosition(position).toString();
                Intent intent = new Intent(FfeCseSubject.this, PdfViewer.class);
                intent.putExtra("pdf file",item);
                startActivity(intent);
            }
        });

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                arrayAdapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }
}