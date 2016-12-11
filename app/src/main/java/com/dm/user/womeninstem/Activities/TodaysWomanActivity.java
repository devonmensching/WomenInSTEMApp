package com.dm.user.womeninstem.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dm.user.womeninstem.Database.DBOperations;
import com.dm.user.womeninstem.Database.Women;
import com.dm.user.womeninstem.R;

public class TodaysWomanActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView descriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todays_woman);

        DBOperations dbOperations = new DBOperations(this);
        int counter = dbOperations.getCounter().getCounter();
        Women women = dbOperations.findWomen(counter);

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        descriptionTextView = (TextView) findViewById(R.id.descriptionTextView);

        nameTextView.setText(women.getName());
        descriptionTextView.setText(women.getDescrption());
    }

    public void onBackkButton2Click(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
