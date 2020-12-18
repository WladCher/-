package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private CheckBox m1check;
    private  CheckBox m2check;
    private CheckBox m3check;
    private  CheckBox m4check;
    private CheckBox m5check;
    private  CheckBox m6check;
    private CheckBox m7check;
    private  CheckBox m8check;
    private Button mWriteResultButton;
    private TextView mResultTextView;
    private ArrayList<String> mResult;
    String rightanswer[] = {"Наследование"};
    private BreakIterator editText;
    String string = editText.getText().toString();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1check = findViewById(R.id.check_1);
        m2check = findViewById(R.id.check_2);
        m3check = findViewById(R.id.check_3);
        m4check = findViewById(R.id.check_4);
        m5check = findViewById(R.id.check_5);
        m6check = findViewById(R.id.check_6);
        m7check = findViewById(R.id.check_7);
        m8check = findViewById(R.id.check_8);
        mWriteResultButton = findViewById(R.id.write_result);
        mResultTextView = findViewById(R.id.result);
        mResult = new ArrayList<>();
        mResultTextView.setEnabled(false);

        m1check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m1check.isChecked())
                    mResult.add("Правильный ответ 1,3");
                else
                    mResult.remove("Правильный ответ 1,3");
            }
        });
        m2check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m2check.isChecked())
                    mResult.add("Правильный ответ 1,3");
                else
                    mResult.remove("Правильный ответ 1,3");
            }
        });
        m3check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m3check.isChecked())
                    mResult.add("Правильный ответ 1,3");
                else
                    mResult.remove("Правильный ответ 1,3");
            }
        });
        m4check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m4check.isChecked())
                    mResult.add("Правильный ответ 1,3");
                else
                    mResult.remove("Правильный ответ 1,3");
            }
        });
        m5check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m5check.isChecked())
                    mResult.add("Правильный ответ 3,4");
                else
                    mResult.remove("Правильный ответ 3,4");
            }
        });
        m6check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m6check.isChecked())
                    mResult.add("Правильный ответ 3,4");
                else
                    mResult.remove("Правильный ответ 3,4");
            }
        });
        m7check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m7check.isChecked())
                    mResult.add("Правильный ответ 3,4");
                else
                    mResult.remove("Правильный ответ 3,4");
            }
        });
        m8check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m8check.isChecked())
                    mResult.add("Правильный ответ 3,4");
                else
                    mResult.remove("Правильный ответ 3,4");
            }
        });
        mWriteResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                for (String s : mResult)
                    stringBuilder.append(s).append("\n");
                mResultTextView.setText(stringBuilder.toString());
                mResultTextView.setEnabled(false);
            }
        });
        if (string.equals(rightanswer[])) {
            mResult.add("Правильный ответ - наследование");}
        else
          mResult.remove("Правильный ответ - наследование");
          break;
    }
}