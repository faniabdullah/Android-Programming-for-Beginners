package com.faniabdullah.bangkit.data

import android.content.Context
import android.database.sqlite.SQLiteOpenHelper
import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase

class DatabaseHelper(context: Context) :
        SQLiteOpenHelper(context, DATABASE_NAME, null, 1) {

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE $TABLE_NAME (ID INTEGER PRIMARY KEY " +
                "AUTOINCREMENT,NAME TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)
        onCreate(db)
    }

    fun insertData(name: String) {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COL_2, name)
        db.insert(TABLE_NAME, null, contentValues)
    }

    fun updateData(name: String): Boolean {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COL_2, name)
        db.update(TABLE_NAME, contentValues, "NAME = ?", arrayOf(name))
        return true
    }

    fun deleteData(name : String) : Int {
        val db = this.writableDatabase
        return db.delete(TABLE_NAME,"NAME = ?", arrayOf(name))
    }

    fun isExistsData (id : String): Boolean {
        val db = this.writableDatabase
        val cursor = db.rawQuery("SELECT * FROM $TABLE_NAME where $COL_1 = '$id' ", null)
        if(cursor.getCount() <= 0){
            cursor.close();
            return false;
        }
        cursor.close();
        return true;
    }

    val allData : Cursor
        get() {
            val db = this.writableDatabase
            val res = db.rawQuery("SELECT * FROM " + TABLE_NAME, null)
            return res
        }

    companion object {
        val DATABASE_NAME = "stars.db"
        val TABLE_NAME = "restaurant_bookmarked"
        val COL_1 = "ID"
        val COL_2 = "NAME"
    }
}