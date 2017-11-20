package com.example.yash.sqlapp;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBhelper extends SQLiteOpenHelper{

    public static final String databasename="Student1.db";
    public static final String tablename="StudentsInfo1";
    public static final String col1="ID";
    public static final String col2="Name";
    public static final String col3="Dept";
    public static final String col4="Mobile";

    public DBhelper(Context context) {

        super(context, databasename, null, 1);

    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+tablename+"(ID INTEGER PRIMARY KEY,NAME TEXT,DEPT TEXT,MOBILE INTEGER)");

    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS"+tablename);
        onCreate(db);
    }

    public boolean insertData(String id,String name,String dept,String mobile)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(col1,id);
        contentValues.put(col2,name);
        contentValues.put(col3,dept);
        contentValues.put(col4,mobile);
        long r=db.insert(tablename,null,contentValues);
        if(r==-1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public Cursor viewAll()
    {
        SQLiteDatabase db=this.getWritableDatabase();

        Cursor cursor=db.rawQuery("select * from "+tablename,null);

        return cursor;
    }

    public int deleteData(String id)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        return db.delete(tablename,"id=?",new String[]{id});
    }

    public boolean updateData(String id,String name,String dept,String mobile)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(col1,id);
        contentValues.put(col2,name);
        contentValues.put(col3,dept);
        contentValues.put(col4,mobile);
        long r=db.update(tablename,contentValues,"id=?",new String[]{id});
        if(r==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public Cursor search(String id)
    {
        SQLiteDatabase db=this.getWritableDatabase();

        Cursor cursor=db.rawQuery("select * from "+tablename+" where id=?",new String[]{id});

        return cursor;
    }

}
