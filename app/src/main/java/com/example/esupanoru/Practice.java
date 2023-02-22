package com.example.esupanoru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Practice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        View next= findViewById(R.id.next);
        View back= findViewById(R.id.back);

        TextView spanish= findViewById(R.id.test_question);
        TextView japanese= findViewById(R.id.japaneseMeaning);

        Intent intent= getIntent();
        int option= intent.getIntExtra("OPTION",0);

        structure course = null;

        switch (option){
            default:
            case 0:
                Toast.makeText(this, "No category selected", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                course = new Greeting();
                break;
            case 2:
                course = new Fruits();
                break;
            case 3:
                course = new Number();
                break;
        }


        structure finalCourse = course;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                japanese.setText(finalCourse.getJapanese(finalCourse.count));
                spanish.setText(finalCourse.getSpanish(finalCourse.count));
                finalCourse.checkCount(true);


//                Toast.makeText(Practice.this, "次", Toast.LENGTH_SHORT).show();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                japanese.setText(finalCourse.getJapanese(finalCourse.count));
                spanish.setText(finalCourse.getSpanish(finalCourse.count));
                finalCourse.checkCount(false);
            }
        });
        japanese.setText(finalCourse.getJapanese(finalCourse.count));
        spanish.setText(finalCourse.getSpanish(finalCourse.count));


    }
}