package com.example.android.azkar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Azkar1 extends AppCompatActivity {
    azkaradapter1 azkarAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar1);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        azkarAdapter = new azkaradapter1(this);

        recyclerView.setAdapter(azkarAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override
    protected void onStop() {
        super.onStop();

        azkarAdapter.relase();
    }
}
