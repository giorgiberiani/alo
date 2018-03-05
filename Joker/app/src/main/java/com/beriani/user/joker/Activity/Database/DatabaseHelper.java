package com.beriani.user.joker.Activity.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.beriani.user.joker.Activity.DataClass.History_Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 26/12/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {


    public static  final String DATABASE_NAME = "RESULT";
    public static final int DATABASE_VERSION = 1;
    public static final String Table_name = "result_table";
    public static final String primarykey = "_ID";

    public DatabaseHelper(Context context ) {
        super(context,DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE result_table("
                +"_ID INTEGER PRIMARY KEY AUTOINCREMENt,"
                +"FIRST_PLAYER_NAME TEXT,"
                +"SECOND_PLAYER_NAME TEXT,"
                +"THIRD_PLAYER_NAME TEXT,"
                +"FOURTH_PLAYER_NAME TEXT,"
                +"FIRST_PLAYER_RESULT REAL,"
                +"SECOND_PLAYER_RESULT REAL,"
                +"THIRD_PLAYER_RESULT REAL,"
                +"FOURTH_PLAYER_RESULT REAL,"
                +"DATETIME TEXT,"
                +"GAMETYPE TEXT,"
                +"COUPLE INTEGER,"
                +"FIRSTCOUPLERESULT REAL,"
                +"SECONDCOUPLERESULT REAL);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists result_table");
        onCreate(db);
    }

    // retrieve data from database
    public List<History_Data> getDataFromDB(){
        List<History_Data> detallist = new ArrayList<History_Data>();
        String query = "select * from result_table";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query,null);

        if (cursor.moveToLast()){
            do {
                History_Data model = new History_Data(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),
                        cursor.getDouble(5),cursor.getDouble(6),cursor.getDouble(7) ,cursor.getDouble(8),cursor.getString(9),
                        cursor.getString(10),cursor.getInt(11),cursor.getDouble(12),cursor.getDouble(13));

                detallist.add(model);
            }while (cursor.moveToPrevious());
        }




        db.close();
        cursor.close();
        return detallist;
    }


    public boolean insert_data (String first_player_name,String second_player_name,String third_player_name,String fourth_player_name,
       Double first_player_result, Double second_player_result,Double third_player_result,Double fourth_player_result,String datetime,
                                String gametype,int couple,Double firstcouple,Double secondcouple){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("FIRST_PLAYER_NAME",first_player_name);
        contentValues.put("SECOND_PLAYER_NAME",second_player_name);
        contentValues.put("THIRD_PLAYER_NAME",third_player_name);
        contentValues.put("FOURTH_PLAYER_NAME",fourth_player_name);

        contentValues.put("FIRST_PLAYER_RESULT",first_player_result);
        contentValues.put("SECOND_PLAYER_RESULT",second_player_result);
        contentValues.put("THIRD_PLAYER_RESULT",third_player_result);
        contentValues.put("FOURTH_PLAYER_RESULT",fourth_player_result);

        contentValues.put("DATETIME",datetime);
        contentValues.put("GAMETYPE",gametype);
        contentValues.put("COUPLE",couple);

        contentValues.put("FIRSTCOUPLERESULT",firstcouple);
        contentValues.put("SECONDCOUPLERESULT",secondcouple);

        long result = db.insert("result_table",null,contentValues);

        db.close();

        if (result == -1)
            return false;
        else
        return true;

    }

    public Integer delete_data(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(Table_name,"_ID = ?",new String[]{id});

    }
}
