package com.example.taskplannerproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class OnBoarding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);

        new Handler().post(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(OnBoarding.this, Login.class));
                finish();
            }
        });
    }
}