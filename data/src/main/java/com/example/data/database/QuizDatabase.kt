package com.example.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import java.security.AccessControlContext

@Database(entities = [Question::class], version = 1, exportSchema = false)
@TypeConverters(ListConverter::class)
public abstract class QuizDatabase : RoomDatabase() {

    abstract fun quizDao(): QuizDao

    companion object {
        fun createDatabase(context: Context): QuizDatabase {
            return Room.databaseBuilder(context.applicationContext, QuizDatabase::class.java, "Quiz_database").build()
        }
    }
}