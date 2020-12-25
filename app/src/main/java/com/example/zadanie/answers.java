package com.example.zadanie;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class answers extends AppCompatActivity {
    private TextView mResultTextView;
    private TextView mResultTextView2;
    private TextView mResultTextView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mResultTextView = findViewById(R.id.result);
        mResultTextView2 = findViewById(R.id.result2);
        mResultTextView3 = findViewById(R.id.result3);
        mResultTextView.setEnabled(false);
        mResultTextView2.setEnabled(false);
        mResultTextView3.setEnabled(false);

    }
}