package com.example.esupanoru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View level0 = findViewById(R.id.level0Image);
        View level1 = findViewById(R.id.level1image);
        View level2 = findViewById(R.id.level2image);

        level0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(),category.class);
               startActivity(intent);

            }
        });
        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Level 1 Coming Soon", Toast.LENGTH_SHORT).show();
            }
        });
        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Level 2 Coming Soon", Toast.LENGTH_SHORT).show();
            }
        });
    }
}