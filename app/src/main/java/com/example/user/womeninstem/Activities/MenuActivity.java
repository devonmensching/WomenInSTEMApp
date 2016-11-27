package com.example.user.womeninstem.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.user.womeninstem.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onBackkButton1Click(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onTodayWomanIconClick(View view) {
        Intent intent = new Intent(this, TodaysWomanActivity.class);
        startActivity(intent);
    }

    public void onAboutIconClick(View view) {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    public void onOtherWomenIconClick(View view) {
        Intent intent = new Intent(this, OtherWomenActivity.class);
        startActivity(intent);
    }

    public void onSettingsIconClick(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}
