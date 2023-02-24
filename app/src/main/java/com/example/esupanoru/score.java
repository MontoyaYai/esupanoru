package com.example.esupanoru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        TextView textView = findViewById(R.id.scoreText);

        Intent intent= getIntent();
        int score = intent.getIntExtra("SCORE",0);
        int index = intent.getIntExtra("INDEX",0);

        textView.setText(score+"/"+index);


    }
}