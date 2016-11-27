package com.example.user.womeninstem.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.user.womeninstem.Database.Counter;
import com.example.user.womeninstem.Database.DBOperations;
import com.example.user.womeninstem.Database.Women;
import com.example.user.womeninstem.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // update the database
        updateDB();
    }

    public void onMenukButtonClick(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    public void updateDB(){
        DBOperations dbOperations = new DBOperations(this);
        if(dbOperations.isWomenEmpty()){
            Women w1 = new Women(1, "  ", " ");
            Women w2 = new Women(2, " ", " ");
            Women w3 = new Women(3, " ", " ");
            Women w4 = new Women(4, " ", " ");
            Women w5 = new Women(5, " ", " ");
            Women w6 = new Women(6, " ", " ");
            Women w7 = new Women(7, " ", " ");
            Women w8 = new Women(8, " ", " ");
            Women w9 = new Women(9, " ", " ");
            Women w10 = new Women(10, " ", " ");
            Women w11 = new Women(11, " ", " ");
            Women w12 = new Women(12, " ", " ");
            Women w13 = new Women(13, " ", " ");
            Women w14 = new Women(14, " ", " ");
            Women w15 = new Women(15, " ", " ");
            Women w16 = new Women(16, " ", " ");
            Women w17 = new Women(17, " ", " ");
            Women w18 = new Women(18, " ", " ");
            Women w19 = new Women(19, " ", " ");
            Women w20 = new Women(20, " ", " ");
            Women w21 = new Women(21, " ", " ");
            Women w22 = new Women(22, " ", " ");
            Women w23 = new Women(23, " ", " ");
            Women w24 = new Women(24, " ", " ");
            Women w25 = new Women(25, " ", " ");
            Women w26 = new Women(26, " ", " ");
            Women w27 = new Women(27, " ", " ");
            Women w28 = new Women(28, " ", " ");
            Women w29 = new Women(29, " ", " ");
            Women w30 = new Women(30, " ", " ");
            Women w31 = new Women(31, " ", " ");
            dbOperations.addWomen(w1);
            dbOperations.addWomen(w2);
            dbOperations.addWomen(w3);
            dbOperations.addWomen(w4);
            dbOperations.addWomen(w5);
            dbOperations.addWomen(w6);
            dbOperations.addWomen(w7);
            dbOperations.addWomen(w8);
            dbOperations.addWomen(w9);
            dbOperations.addWomen(w10);
            dbOperations.addWomen(w11);
            dbOperations.addWomen(w12);
            dbOperations.addWomen(w13);
            dbOperations.addWomen(w14);
            dbOperations.addWomen(w15);
            dbOperations.addWomen(w16);
            dbOperations.addWomen(w17);
            dbOperations.addWomen(w18);
            dbOperations.addWomen(w19);
            dbOperations.addWomen(w20);
            dbOperations.addWomen(w21);
            dbOperations.addWomen(w22);
            dbOperations.addWomen(w23);
            dbOperations.addWomen(w24);
            dbOperations.addWomen(w25);
            dbOperations.addWomen(w26);
            dbOperations.addWomen(w27);
            dbOperations.addWomen(w28);
            dbOperations.addWomen(w29);
            dbOperations.addWomen(w30);
            dbOperations.addWomen(w31);
        }
        if (dbOperations.isCounterEmpty()) {
            Counter counter = new Counter(1, 1, 1, 12);
            dbOperations.addCounter(counter);
        }

    }

}
