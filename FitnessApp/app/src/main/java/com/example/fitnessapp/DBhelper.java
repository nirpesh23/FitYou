package com.example.fitnessapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBhelper extends SQLiteOpenHelper {

    public static final int DB_VERSION = 1;
    public static final String DB_Name = "Fitness database";
    public static final String TABLE_NAME = "Username";
    public static final String COL_ONE = "user_id";
    public static final String COL_TWO = "user_name";

    public DBhelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_Name, factory, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query  = "CREATE TABLE " + TABLE_NAME + "(" + COL_ONE + " INTEGER PRIMARY KEY AUTOINCREMENT," + COL_TWO + " TEXT" + ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void insertUsername(model_for_database username)
    {
        ContentValues values = new ContentValues();
        values.put(COL_TWO, username.getUsername());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

//    public void removeUsername()
//    {
//        SQLiteDatabase db = getWritableDatabase();
//
//    }

    public String display_username(){
        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_NAME;
        Cursor c = db.rawQuery(query,null);

        if(c.moveToFirst()){
            do {
                dbString = dbString + c.getString(c.getColumnIndex(COL_TWO));
                dbString = dbString + "\n";
            }
            while(c.moveToNext());
        }
        c.close();
        db.close();
        return dbString;
    }
}
