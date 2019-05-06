package com.example.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters

@Entity
data class Question(
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
    val correct_answer: String,
    val difficulty: String,
    @TypeConverters(ListConverter::class) val incorrect_answers: List<String>,
    val question: String,
    val type: String
)

