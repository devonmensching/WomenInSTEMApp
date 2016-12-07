package com.example.user.womeninstem.Activities;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.ToggleButton;

import com.example.user.womeninstem.Database.Counter;
import com.example.user.womeninstem.Database.DBOperations;
import com.example.user.womeninstem.R;
import com.example.user.womeninstem.alarm.AlarmReceiver;

import java.util.Calendar;

public class SettingsActivity extends AppCompatActivity {

    private ToggleButton muteButton;
    private EditText timeEditText;
    private Counter counter;
    EditText time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //  initiate the edit text
        time = (EditText) findViewById(R.id.timePicker);
        // perform click event listener on edit text
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(SettingsActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        if(selectedMinute == 0 ) {
                            time.setText(selectedHour + ":00");
                        }
                        else if(selectedMinute < 10){
                            time.setText(selectedHour + ":0" + selectedMinute);
                        }
                        else {
                            time.setText(selectedHour + ":" + selectedMinute);
                        }
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });

        DBOperations dbOperations = new DBOperations(this);
        counter = dbOperations.getCounter();

        muteButton = (ToggleButton) findViewById(R.id.muteToggleButton);
        if(counter.getMute() == 1){
            muteButton.setChecked(true);
        }else{
            muteButton.setChecked(false);
        }

    }


    public void onBackkButton5Click(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    public void onSaveButton5Click(View view) {
        DBOperations dbOperations = new DBOperations(this);
        if(muteButton.isChecked()){
            dbOperations.updateMute(1);
        }else if(!muteButton.isChecked()) {
            dbOperations.updateMute(0);
        }
        String timeSelected = time.getText().toString();
        if(!timeSelected.equals("Select Time...")){
            String[] splitTime = timeSelected.split(":");
            int newTime = Integer.parseInt(splitTime[0]);
            dbOperations.updateTime(newTime);
            AlarmReceiver alarmReceiver = new AlarmReceiver();
            alarmReceiver.SetAlarm(this, newTime);
        }

        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
