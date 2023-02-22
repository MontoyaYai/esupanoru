package com.example.esupanoru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Random;

public class test extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


//        View next= findViewById(R.id.next_test);
        View back= findViewById(R.id.back_test);
        View check= findViewById(R.id.check);

        TextView testQuestion = findViewById(R.id.test_question);

        RadioButton ans1 = findViewById(R.id.answer1);
        RadioButton ans2 = findViewById(R.id.answer2);
        RadioButton ans3 = findViewById(R.id.answer3);

        TextView dataNum= findViewById(R.id.dataNum);

        Intent intent = getIntent(); //コースの選択　インスタンスの生成
        int option = intent.getIntExtra("OPTION",0);

        Random random = new Random();
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
        dataNum.setText(finalCourse.getCount()+1+"/"+ finalCourse.getJapaneseSize());
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (finalCourse.getCount() == finalCourse.getJapaneseSize()-1) {
                    Intent intent = new Intent(getApplicationContext(), score.class);
                    intent.putExtra("SCORE", score);
                    startActivity(intent);
                } else{
                    finalCourse.checkCount(true);
                    testQuestion.setText(finalCourse.getJapanese(finalCourse.getCount()));
                    dataNum.setText(finalCourse.getCount()+1+"/"+ finalCourse.getJapaneseSize());

                    String[] choices =generateChoices(finalCourse.getSpanishHash(),finalCourse.getCount(), random, finalCourse.getJapaneseSize());

                    ans1.setText(choices[0]);
                    ans2.setText(choices[1]);
                    ans3.setText(choices[2]);
                }
//                System.out.println(finalCourse.getJapaneseSize());
//                System.out.println(finalCourse.getCount());
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                finalCourse.checkCount(false);

                testQuestion.setText(finalCourse.getJapanese(finalCourse.getCount()));
                dataNum.setText(finalCourse.getCount()+"/"+ finalCourse.getJapaneseSize());

                String[] choices =generateChoices(finalCourse.getSpanishHash(),finalCourse.getCount(), random, finalCourse.getJapaneseSize());

                ans1.setText(choices[0]);
                ans2.setText(choices[1]);
                ans3.setText(choices[2]);


            }
        });

        String[] choices =generateChoices(finalCourse.getSpanishHash(),finalCourse.getCount(), random, finalCourse.getJapaneseSize());

        ans1.setText(choices[0]);
        ans2.setText(choices[1]);
        ans3.setText(choices[2]);
//        testQuestion.setText(finalCourse.getJapanese(finalCourse.getCount()));

    }
    String[] generateChoices(HashMap<Integer,String> hashmap, int correctAnswer, Random random, int size){
        String [] choices=new String[3];
        choices[0]=hashmap.get(correctAnswer);
        while (true){
            int n1 =random.nextInt(size);
            int n2 = random.nextInt(size);
            if (n1!=correctAnswer && n2!= correctAnswer && n1!=n2){
                choices[1]=hashmap.get(n1);
                choices[2]=hashmap.get(n2);
                break;
            }
        }
        shuffleArray(choices,random);
        return choices;
    }
    void shuffleArray(String[]array, Random random){
        for (int i =array.length-1;i>0;i--){
            int j=random.nextInt(i);
            String temp = array[j];
            array [j]=array[i];
            array[i]=temp;
        }
    }
}