package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int number = 5;
    TextView tv;
    Button plusKnop;
    Button minKnop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plusKnop = findViewById(R.id.plusKnop);
        minKnop = findViewById(R.id.minKnop);
        tv = findViewById(R.id.mijntextview);

        update();

        plusKnop.setOnClickListener(view -> {
            number++;
            MainActivity.this.update();
        });

        minKnop.setOnClickListener(view -> {
            number--;
            update();
        });
    }

    void update() {
        tv.setText(String.format("Tel af vanaf %d", number));
        plusKnop.setEnabled(number < 10);
        minKnop.setEnabled(number > 1);
    }

}