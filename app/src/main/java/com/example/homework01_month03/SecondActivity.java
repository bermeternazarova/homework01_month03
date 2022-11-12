package com.example.homework01_month03;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SecondActivity extends AppCompatActivity {
    TextView myNumberTv, codeTv;
    EditText generateCodeEt;
    Button generateCodeBtn,signInBtn;
    String val = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        myNumberTv = findViewById(R.id.my_number_tv);
        codeTv=findViewById(R.id.code_tv);
        generateCodeEt=findViewById(R.id.generated_code_et);
        generateCodeBtn=findViewById(R.id.generate_code_btn);
        signInBtn=findViewById(R.id.signIn_btn);

        Intent intent = getIntent();
        String number= intent.getStringExtra("phoneNumber");
        myNumberTv.setText(number);

        generateCodeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i <6 ; i++) {
                    Random random = new Random();
                    int code= random.nextInt(9);
                    String newCode = String.valueOf(code);
                    val =  val+newCode;
                }
                System.out.println(val);
            }});
        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check();
            }});}

        void check() {
            if (generateCodeEt.getText().toString().equals(val)) {
                Intent intent1 = new Intent(SecondActivity.this,ThirdActivity.class);
                String num= myNumberTv.getText().toString();
                intent1.putExtra("phone",num);
                startActivity(intent1);
            } else {
                Toast.makeText(this, "wrong", Toast.LENGTH_SHORT).show();
            }}}