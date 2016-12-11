package com.dm.user.womeninstem.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dm.user.womeninstem.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
    public void onBackkButton3Click(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
