package com.example.zadanie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.BreakIterator;
import java.util.ArrayList;

public class third_question extends AppCompatActivity implements View.OnClickListener{
    String rightanswer[] = {"наследование", "Наследование"};
    private BreakIterator editText;
    String string = editText.getText().toString();
    private Button mWriteResultButton3;
    private ArrayList<String> mResult3;
    private TextView mResultTextView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_question);
        mWriteResultButton3 = findViewById(R.id.write_result);
        mResult3 = new ArrayList<>();
        if (string.equals(rightanswer[])) {
            mResult3.add("Ваш ответ - " + mResultTextView3);}
        else
        mResult3.remove("Ваш ответ " + mResultTextView3);
        break;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.write_result:
                Intent intent = new Intent(this, answers.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}