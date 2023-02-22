package com.example.esupanoru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class test extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        TextView testQuestion = findViewById(R.id.test_question);

        View next= findViewById(R.id.next_test);
        View back= findViewById(R.id.back_test);
        View check= findViewById(R.id.check);


        Intent intent = getIntent(); //コースの選択　インスタンスの生成
        int option = intent.getIntExtra("OPTION",0);

        int score=0;

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
        //コースをfinalコースに格納
        structure finalCourse = course;
        testQuestion.setText(finalCourse.getJapanese(finalCourse.getCount()));
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (finalCourse.getCount() == finalCourse.getJapaneseSize()-1) {
                    Intent intent = new Intent(getApplicationContext(), score.class);
                    intent.putExtra("SCORE", score);
                    startActivity(intent);
                } else{
                    finalCourse.checkCount(true);
                    testQuestion.setText(finalCourse.getJapanese(finalCourse.getCount()));
                }
                System.out.println(finalCourse.getJapaneseSize());
                System.out.println(finalCourse.getCount());
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testQuestion.setText(finalCourse.getJapanese(finalCourse.getCount()));

                finalCourse.checkCount(false);
            }
        });

//        testQuestion.setText(finalCourse.getJapanese(finalCourse.getCount()));


    }
}