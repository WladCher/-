package com.example.zadanie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class second_question extends AppCompatActivity implements View.OnClickListener{
    private CheckBox m5check;
    private CheckBox m6check;
    private CheckBox m7check;
    private CheckBox m8check;
    private Button mWriteResultButton2;
    private ArrayList<String> mResult2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_question);
        m5check = findViewById(R.id.check_5);
        m6check = findViewById(R.id.check_6);
        m7check = findViewById(R.id.check_7);
        m8check = findViewById(R.id.check_8);
        mWriteResultButton2 = findViewById(R.id.write_result);
        mResult2 = new ArrayList<>();
        m5check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m5check.isChecked())
                    mResult2.add("Ваш ответ " + m5check);
                else
                    mResult2.remove("Ваш ответ " + m5check);
            }
        });
        m6check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m6check.isChecked())
                    mResult2.add("Ваш ответ " + m6check);
                else
                    mResult2.remove("Ваш ответ " + m6check);
            }
        });
        m7check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m7check.isChecked())
                    mResult2.add("Ваш ответ " + m7check);
                else
                    mResult2.remove("Ваш ответ " + m7check);
            }
        });
        m8check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m8check.isChecked())
                    mResult2.add("Ваш ответ " + m8check);
                else
                    mResult2.remove("Ваш ответ " + m8check);
            }
        });
        mWriteResultButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                for (String s : mResult2)
                    stringBuilder.append(s).append("\n");
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.write_result:
                Intent intent = new Intent(this, third_question.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}