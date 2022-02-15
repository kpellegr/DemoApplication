package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mijnknop = findViewById(R.id.mijnbutton);
        mijnknop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView mijntextview = findViewById(R.id.mijntextview);
                mijntextview.setText("Hallo Koen!");
            }
        });
    }
}