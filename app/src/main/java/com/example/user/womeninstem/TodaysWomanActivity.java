package com.example.user.womeninstem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TodaysWomanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todays_woman);
    }

    public void onBackkButton2Click(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}