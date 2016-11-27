package com.example.user.womeninstem.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class DBHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 4;
    public static final String DATABASE_NAME = "WomenInSTEMDB.db";

    // Declare Women table
    public static final String TABLE_WOMEN = Women.tablename;
    public static final String COLUMN_ID = Women.COLUMN_ID;
    public static final String COLUMN_NAME = Women.COLUMN_NAME;
    public static final String COLUMN_DESCRIPTION= Women.COLUMN_DESCRIPTION;

    // Declare Counter table
    public static final String TABLE_COUNTER = Counter.tablename;
    public static final String COLUMN_CID = Counter.COLUMN_ID;
    public static final String COLUMN_COUNTER = Counter.COLUMN_COUNTER;
    public static final String COLUMN_MUTE = Counter.COLUMN_MUTE;
    public static final String COLUMN_TIME = Counter.COLUMN_TIME;
    public static final String COLUMN_ALARM = Counter.COLUMN_ALARM;

    public DBHandler(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // SQL query to create User table
        String CREATE_WOMEN_TABLE = "CREATE TABLE " +
                TABLE_WOMEN + "(" +
                COLUMN_ID + " INTEGER, " +
                COLUMN_NAME + " Text, " +
                COLUMN_DESCRIPTION + " Text)";

        // SQL query to create ZoneData table
        String CREATE_COUNTER_TABLE = "CREATE TABLE " +
                TABLE_COUNTER + "(" +
                COLUMN_CID + " INTEGER, " +
                COLUMN_COUNTER + " INTEGER, " +
                COLUMN_MUTE + " INTEGER, " +
                COLUMN_TIME + " INTEGER, " +
                COLUMN_ALARM + " INTEGER)";

        // Execute the SQL commands, No return value
        db.execSQL(CREATE_WOMEN_TABLE);
        Log.i("SQLite DB", "User table created");
        db.execSQL(CREATE_COUNTER_TABLE);
        Log.i("SQLite DB", "ZoneData table created");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        // drop table if it exists
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_WOMEN);
        Log.i("SQLite DB", "Women table dropped");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_COUNTER);
        Log.i("SQLite DB","Counter table dropped");

        // recreate the table by calling onCreate
        onCreate(db);
    }
}
