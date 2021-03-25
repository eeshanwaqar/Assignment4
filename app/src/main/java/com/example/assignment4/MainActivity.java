package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String dataset[] = {"Hamza","Eeshan","Huzaifa","Bhatti","Salar","Big","Salar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView v = findViewById(R.id.list);
        v.setAdapter(new myList(dataset));
        v.setLayoutManager(new LinearLayoutManager(this));
    }
}