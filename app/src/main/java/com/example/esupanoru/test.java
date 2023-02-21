package com.example.esupanoru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class test extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        TextView testQuestion = findViewById(R.id.test_question);

        RadioButton ans1 = findViewById(R.id.answer1);
        RadioButton ans2 = findViewById(R.id.answer2);
        RadioButton ans3 = findViewById(R.id.answer3);
        Intent intent = getIntent();
        //コースの選択　インスタンスの生成
        int option = intent.getIntExtra("OPTION",0);
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




    }
}