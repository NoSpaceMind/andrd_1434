package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    private boolean isAnswerTrue;       // переменная для ответа
    private TextView textAnswer;        // переменная поля TextView с id = textAnswer

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        isAnswerTrue = getIntent().getBooleanExtra("answer",false); // получем из ответа переменную getBooleanExtra

        textAnswer = findViewById(R.id.textAnswer);
        textAnswer.setText(isAnswerTrue?R.string.yes:R.string.no);

        /*if(isAnswerTrue){
            textAnswer.setText(R.string.correct);
        }else{
            textAnswer.setText(R.string.incorrect);
        }*/

        /*<!--
                Практическая работа
        1) Создать 3ю активность
        2) 3я активность  должна содержать в себе TextView
        3) 3 активность запускается тогда, когда заканчиваются вопросы
        4) на 3 активности выводится результат теста (Вопросы - правильно/неправильно)
                -->*/


    }
}