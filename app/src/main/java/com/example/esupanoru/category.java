package com.example.esupanoru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.GregorianCalendar;

public class category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Button greet = findViewById(R.id.greets);
        Button fruits = findViewById(R.id.fruits);
        Button number = findViewById(R.id.numbers);


        greet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent greetIntent = new Intent(getApplicationContext(), course.class);
                greetIntent.putExtra("OPTION",1);
                Toast.makeText(category.this, "Greets", Toast.LENGTH_SHORT).show();
                startActivity(greetIntent);
            }
        });
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fruitsIntent= new Intent(getApplicationContext(),course.class);
                Toast.makeText(category.this, "Fruits", Toast.LENGTH_SHORT).show();
                fruitsIntent.putExtra("OPTION",2);
                startActivity(fruitsIntent);
            }
        });
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numberIntent= new Intent(getApplicationContext(), course.class);
                Toast.makeText(category.this, "Numbers", Toast.LENGTH_SHORT).show();
                numberIntent.putExtra("OPTION",3);
                startActivity(numberIntent);
            }
        });
    }

}