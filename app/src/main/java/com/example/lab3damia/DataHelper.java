package com.example.lab3damia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

    // Database Name
    private static final String DATABASE_NAME = "personalbiodata.db";

    // Database version
    private static final int DATABASE_VERSION = 1;

    // Create constructor for Data Helper
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    // Create Table
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table biodata (no integer primary key, name text null, dob text null, gender text null,address text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
    }

    // Create method to upgrade database version if database exists
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Add your upgrade logic here if needed
    }
}
