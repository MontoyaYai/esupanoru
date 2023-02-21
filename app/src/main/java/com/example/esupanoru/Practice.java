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
        View back= findViewById(R.id.back);
        //ファインドビュー設定
        TextView spanish= findViewById(R.id.spanishMeaning);
        TextView japanese= findViewById(R.id.japaneseMeaning);
        //クリックリスナー
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                japanese.setText(fruits.getJapanese(fruits.count));
                spanish.setText(fruits.getSpanish(fruits.count));
                fruits.getCount(true);


                Toast.makeText(Practice.this, "次", Toast.LENGTH_SHORT).show();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                japanese.setText(fruits.getJapanese(fruits.count));
                spanish.setText(fruits.getSpanish(fruits.count));
                fruits.getCount(false);
            }
        });


    }
}