package com.example.zadanie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CheckBox m1check;
    private  CheckBox m2check;
    private CheckBox m3check;
    private  CheckBox m4check;
    private Button mWriteResultButton;
    private ArrayList<String> mResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1check = findViewById(R.id.check_1);
        m2check = findViewById(R.id.check_2);
        m3check = findViewById(R.id.check_3);
        m4check = findViewById(R.id.check_4);
        mWriteResultButton = findViewById(R.id.write_result);
        mResult = new ArrayList<>();

        m1check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m1check.isChecked())
                    mResult.add("Ваш ответ " + m1check);
                else
                    mResult.remove("Ваш ответ " + m1check);
            }
        });
        m2check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m2check.isChecked())
                    mResult.add("Ваш ответ " + m2check);
                else
                    mResult.remove("Ваш ответ " + m2check);
            }
        });
        m3check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m3check.isChecked())
                    mResult.add("Ваш ответ " + m3check);
                else
                    mResult.remove("Ваш ответ " + m3check);
            }
        });
        m4check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m4check.isChecked())
                    mResult.add("Ваш ответ " + m4check);
                else
                    mResult.remove("Ваш ответ " + m4check);
            }
        });
        mWriteResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                for (String s : mResult)
                    stringBuilder.append(s).append("\n");
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.write_result:
                Intent intent = new Intent(this, second_question.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}