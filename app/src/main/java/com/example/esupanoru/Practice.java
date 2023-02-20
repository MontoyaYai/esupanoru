package com.example.esupanoru;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Practice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        Fruits fruits = new Fruits();
        View next= findViewById(R.id.next);

        TextView spanish= findViewById(R.id.spanishMeaning);
        TextView japanese= findViewById(R.id.japaneseMeaning);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fruits.getCount(true);
                japanese.setText(fruits.getJapanese(fruits.count));
                spanish.setText(fruits.getSpanish(fruits.count));

                Toast.makeText(Practice.this, "aaa", Toast.LENGTH_SHORT).show();
            }
        });

    }
}