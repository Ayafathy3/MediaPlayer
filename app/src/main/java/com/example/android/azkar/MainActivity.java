package com.example.android.azkar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView azkar1 = findViewById(R.id.azkar1);
        TextView azkar2 = findViewById(R.id.azkar2);
        TextView azkar3 = findViewById(R.id.azkar3);
        TextView azkar4 = findViewById(R.id.azkar4);

      azkar1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.azkar1:
                Intent intent = new Intent(MainActivity.this, Azkar1.class);
                startActivity(intent);
                break;

            case R.id.azkar2:
                Intent intent1 = new Intent(MainActivity.this, Azkar2.class);
                startActivity(intent1);
                break;
        }
    }
}
