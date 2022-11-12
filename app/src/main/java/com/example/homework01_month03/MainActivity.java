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

public class MainActivity extends AppCompatActivity {
    EditText phoneNumberEt;
    Button signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phoneNumberEt=findViewById(R.id.phone_number_et);
        signUpBtn=findViewById(R.id.signUp_btn);

                signUpBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        String number = phoneNumberEt.getText().toString();
                        intent.putExtra("phoneNumber",number);
                        startActivity(intent);
                    }
                });
    }
}