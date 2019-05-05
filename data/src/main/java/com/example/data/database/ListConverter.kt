package com.example.data.database

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

class ListConverter {
    companion object {
        @TypeConverter
        @JvmStatic
        fun fromAnswers(value: String): List<String> {
            val objects = Gson().fromJson(value, Array<String>::class.java) as Array<String>
            val list = objects.toList()
            return list
        }

        @TypeConverter
        @JvmStatic
        fun toAnswer(value: List<String>): String {
            return Gson().toJson(value)
        }
    }
}