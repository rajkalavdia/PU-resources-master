package com.example.puresources;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

public class ListViewOfFaculty extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    FirebaseAuth mAuth;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_of_faculty);

        listView = findViewById(R.id.listview);


        List<String> list = new ArrayList<>();
        list.add("Faculty Of Engineering");
        list.add("Faculty Of Pharmacy");
        list.add("Faculty Of Management Studies");
        list.add("Faculty Of Law");
        list.add("Faculty Of Applied Science");
        list.add("Faculty Of Architecture");
        list.add("Faculty Of Design");
        list.add("Faculty Of Social Work");
        list.add("Faculty Of Medicine and Health Science");


        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0) {
                    startActivity(new Intent(ListViewOfFaculty.this, FacultyOfEngineering.class));
                } else if (i==1) {
                    startActivity(new Intent(ListViewOfFaculty.this, FacultyOfPharmacy.class));
                } else if (i==2) {
                    startActivity(new Intent(ListViewOfFaculty.this, FacultyOfManagementStudies.class));
                } else if (i==3) {
                    startActivity(new Intent(ListViewOfFaculty.this, FacultyOfLaw.class));
                } else if (i==4) {
                    startActivity(new Intent(ListViewOfFaculty.this, FacultyOfAppliedScience.class));
                } else if (i==5) {
                    startActivity(new Intent(ListViewOfFaculty.this, FacultyOfArchitecture.class));
                } else if (i==6) {
                    startActivity(new Intent(ListViewOfFaculty.this, FacultyOfDesign.class));
                } else if (i==7) {
                    startActivity(new Intent(ListViewOfFaculty.this, FacultyOfSocialWork.class));
                } else if (i==8) {
                    startActivity(new Intent(ListViewOfFaculty.this, FacultyOfMedicinesAndHealthScienes.class));
                } else {
                    Toast.makeText(ListViewOfFaculty.this, "Invalid input", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

   @Override
    public void onItemSelected(@NonNull AdapterView<?> adapterView, View view, int i, long l) {
        String choice = adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}