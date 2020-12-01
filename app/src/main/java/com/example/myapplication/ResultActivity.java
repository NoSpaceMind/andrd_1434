package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    private TextView resultTxt1;        // создаем переменные для вывода результатов
    private TextView resultTxt2;
    private TextView resultTxt3;
    private TextView resultTxt4;
    private TextView resultTxt5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

       ArrayList<String> questionsList = (ArrayList<String>) getIntent().getSerializableExtra("list");

        resultTxt1 = findViewById(R.id.resultTxt11);       //присваиваем им по id поле
        resultTxt1.setText(questionsList.get(0));
        resultTxt2 = findViewById(R.id.resultTxt12);
        resultTxt2.setText(questionsList.get(1));
        resultTxt3 = findViewById(R.id.resultTxt13);
        resultTxt3.setText(questionsList.get(2));
        resultTxt4 = findViewById(R.id.resultTxt14);
        resultTxt4.setText(questionsList.get(3));
        resultTxt5 = findViewById(R.id.resultTxt15);
        resultTxt5.setText(questionsList.get(4));


        //System.out.println("ArrayList<String> questionsList = " + questionsList);

    }
}