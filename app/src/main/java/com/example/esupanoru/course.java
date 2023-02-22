package com.example.esupanoru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class course extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        Intent intent= getIntent();
        int option=intent.getIntExtra("OPTION",0);

        View practiceImage = findViewById(R.id.practice);
        View testImage= findViewById(R.id.test);


        practiceImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent practiceIntent= new Intent(getApplicationContext(),Practice.class);
                practiceIntent.putExtra("OPTION",option);
                startActivity(practiceIntent);
            }
        });
        testImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent testIntent= new Intent(getApplicationContext(), test.class);
                testIntent.putExtra("OPTION",option);
                startActivity(testIntent);
            }
        });
    }
}