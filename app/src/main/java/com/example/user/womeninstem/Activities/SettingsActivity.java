package com.example.user.womeninstem.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ToggleButton;

import com.example.user.womeninstem.Database.Counter;
import com.example.user.womeninstem.Database.DBOperations;
import com.example.user.womeninstem.R;

public class SettingsActivity extends AppCompatActivity {

    private ToggleButton muteButton;
    private EditText timeEditText;
    private Counter counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        DBOperations dbOperations = new DBOperations(this);
        counter = dbOperations.getCounter();

        muteButton = (ToggleButton) findViewById(R.id.muteToggleButton);
        if(counter.getMute() == 1){
            muteButton.setChecked(true);
        }else{
            muteButton.setChecked(false);
        }

        timeEditText = (EditText) findViewById(R.id.timeEditText);
        timeEditText.setText(counter.getTime()+":00");
        Log.i("TIME", Integer.toString(counter.getTime()));
    }


    public void onBackkButton5Click(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    public void onSaveButton5Click(View view) {
        DBOperations dbOperations = new DBOperations(this);
        if(muteButton.isChecked()){
            dbOperations.updateMute(1);
        }else if(!muteButton.isChecked()){
            dbOperations.updateMute(0);
        }

        String time = timeEditText.getText().toString().substring(0,2);
        dbOperations.updateTime(Integer.parseInt(time));

        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
