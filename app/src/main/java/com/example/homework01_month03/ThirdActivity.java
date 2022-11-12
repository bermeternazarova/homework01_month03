package com.example.homework01_month03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView text ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
         text= findViewById(R.id.textOfNumber_tv);

        Intent intent = getIntent();
        String num= intent.getStringExtra("phone");
        text.setText(num);
    }}