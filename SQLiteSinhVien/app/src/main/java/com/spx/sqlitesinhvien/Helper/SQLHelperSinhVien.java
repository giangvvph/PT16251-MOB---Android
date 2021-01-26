package com.spx.sqlitesinhvien.Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLHelperSinhVien extends SQLiteOpenHelper {
    public static final String DB_NAME = "QLSV";
    public static final int DB_VERSION = 1;

    public SQLHelperSinhVien( Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SqlTbLop =  "CREATE TABLE \"tb_lop\" ( \"id\" INTEGER NOT NULL,\"m_lop\" TEXT NOT NULL UNIQUE, PRIMARY KEY(\"id\" AUTOINCREMENT))";
        db.execSQL(SqlTbLop);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
