package com.example.user.womeninstem.Database;


import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.preference.PreferenceManager;
import android.util.Log;

public class DBOperations {
    private DBHandler dbHandler;
    private Context context;
    private SharedPreferences sharedPreferences;

    public DBOperations(Context context) {
        this.context = context;
        dbHandler = new DBHandler(context);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    // Add a row to the Women Table
    public void addWomen(Women women) {
        SQLiteDatabase db = dbHandler.getWritableDatabase();

        // prepare teh values for the new entry
        ContentValues values = new ContentValues();
        values.put(Women.COLUMN_ID, women.getId());
        values.put(Women.COLUMN_NAME, women.getName());
        values.put(Women.COLUMN_DESCRIPTION, women.getDescrption());

        // inter into the DB
        db.insert(Women.tablename, null, values);
        Log.i("SQLite DB", "Row added to Women table");

        // close the DB
        db.close();
    }

    // Find a Women in the Women table
    public Women findWomen(int id) {
        SQLiteDatabase db = dbHandler.getWritableDatabase();

        // construct the SQL string
        String sqlQuery = "SELECT * FROM " + Women.tablename +
                " WHERE " + Women.COLUMN_ID + " = '" +
                id +"'";


        // Execute the query on the DB and store the returned rows
        Cursor myCursor = db.rawQuery(sqlQuery, null);

        // Create and empty User object
        Women women = new Women();

        //  if at least one row is returned, point to the first entry
        // and extract the data
        if(myCursor.moveToFirst()) {
            // have to know index and type of each row in table
            women.setId(myCursor.getInt(0));
            women.setName(myCursor.getString(1));
            women.setDescrption(myCursor.getString(2));
        }
        else {
            // nothing was returned
            women = null;
        }

        myCursor.close();
        db.close();
        Log.i("SQLite DB", "Row searched to Women table");

        return women;
    }

    // Find a counter in the Women table
    public Counter findCounter() {
        SQLiteDatabase db = dbHandler.getWritableDatabase();

        // construct the SQL string
        String sqlQuery = "SELECT * FROM " + Counter.tablename +
                " WHERE " + Counter.COLUMN_ID + " = 1";


        // Execute the query on the DB and store the returned rows
        Cursor myCursor = db.rawQuery(sqlQuery, null);

        // Create and empty User object
        Counter counter = new Counter();

        //  if at least one row is returned, point to the first entry
        // and extract the data
        if(myCursor.moveToFirst()) {
            // have to know index and type of each row in table
            counter.setId(myCursor.getInt(0));
            counter.setCounter(myCursor.getInt(1));
            counter.setMute(myCursor.getInt(2));
            counter.setTime(myCursor.getInt(3));
        }
        else {
            // nothing was returned
            counter = null;
        }

        myCursor.close();
        db.close();
        Log.i("SQLite DB", "Row searched to Counter table");

        return counter;
    }

    // Return boolean true if women table is empty
    public boolean isWomenEmpty() {
        SQLiteDatabase db = dbHandler.getWritableDatabase();

        // construct the SQL string
        String sqlQuery = "SELECT * FROM " + Women.tablename;


        // Execute the query on the DB and store the returned rows
        Cursor myCursor = db.rawQuery(sqlQuery, null);

        // Create and empty survey object
        Counter counter = new Counter();

        //  if at least one row is returned, point to the first entry
        // and extract the data
        if(myCursor.moveToFirst()) {
            db.close();
            return false;
        }
        else {
            db.close();

            return true;
        }

    }

    // Add a row to the Counter Table
    public void addCounter(Counter counter) {
        SQLiteDatabase db = dbHandler.getWritableDatabase();

        // prepare teh values for the new entry
        ContentValues values = new ContentValues();
        values.put(Counter.COLUMN_ID, counter.getId());
        values.put(Counter.COLUMN_COUNTER, counter.getCounter());
        values.put(Counter.COLUMN_MUTE, counter.getMute());
        values.put(Counter.COLUMN_TIME, counter.getTime());

        // inter into the DB
        db.insert(Counter.tablename, null, values);
        Log.i("SQLite DB", "Row added to Counter table");

        // close the DB
        db.close();
    }

    // Update the counter column in GlobalStore Table
    public void updateCounter(int counter) {
        SQLiteDatabase db = dbHandler.getWritableDatabase();


        // construct query to update row in data base
        String query = "UPDATE " + Counter.tablename + " SET " +
                Counter.COLUMN_COUNTER + " = " + counter + " WHERE ID = 1";


        // execute query
        db.execSQL(query);

        // close the DB
        db.close();

        Log.i("GlobalStore Table", "Counter Updated");
    }

    // Find a Women in the Women table
    public Counter getCounter() {
        SQLiteDatabase db = dbHandler.getWritableDatabase();

        // construct the SQL string
        String sqlQuery = "SELECT * FROM " + Counter.tablename +
                " WHERE " + Counter.COLUMN_ID + " = 1";


        // Execute the query on the DB and store the returned rows
        Cursor myCursor = db.rawQuery(sqlQuery, null);

        // Create and empty User object
        Counter counter = new Counter();

        //  if at least one row is returned, point to the first entry
        // and extract the data
        if(myCursor.moveToFirst()) {
            // have to know index and type of each row in table
            counter.setId(myCursor.getInt(0));
            counter.setCounter(myCursor.getInt(1));
            counter.setMute(myCursor.getInt(2));
            counter.setTime(myCursor.getInt(3));
        }
        else {
            // nothing was returned
            counter = null;
        }

        myCursor.close();
        db.close();
        Log.i("SQLite DB", "Row searched to counter table");

        return counter;
    }

    // Return boolean true if counter table is empty
    public boolean isCounterEmpty() {
        SQLiteDatabase db = dbHandler.getWritableDatabase();

        // construct the SQL string
        String sqlQuery = "SELECT * FROM " + Counter.tablename;


        // Execute the query on the DB and store the returned rows
        Cursor myCursor = db.rawQuery(sqlQuery, null);

        // Create and empty survey object
        Counter counter = new Counter();

        //  if at least one row is returned, point to the first entry
        // and extract the data
        if(myCursor.moveToFirst()) {
            db.close();
            return false;
        }
        else {
            db.close();

            return true;
        }

    }

    // Update the mute column in GlobalStore Table
    public void updateMute(int mute) {
        SQLiteDatabase db = dbHandler.getWritableDatabase();

        // construct query to update row in data base
        String query = "UPDATE " + Counter.tablename + " SET " +
                Counter.COLUMN_MUTE + " = " + mute + " WHERE ID = 1";

        // execute query
        db.execSQL(query);

        // close the DB
        db.close();

        Log.i("GlobalStore Table", "Mute Updated");
    }

    // Update the mute column in GlobalStore Table
    public void updateTime(int time) {
        SQLiteDatabase db = dbHandler.getWritableDatabase();

        // construct query to update row in data base
        String query = "UPDATE " + Counter.tablename + " SET " +
                Counter.COLUMN_TIME + " = " + time + " WHERE ID = 1";

        // execute query
        db.execSQL(query);

        // close the DB
        db.close();

        Log.i("GlobalStore Table", "Time Updated");
    }
}
