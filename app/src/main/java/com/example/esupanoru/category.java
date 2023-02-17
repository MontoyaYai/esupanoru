package com.example.esupanoru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Button greet = findViewById(R.id.greets);
        Button number = findViewById(R.id.numbers);
        Button fruits = findViewById(R.id.fruits);

        greet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent greetIntent = new Intent(getApplicationContext(), course.class);
                startActivity(greetIntent);
            }
        });
    }
}