package com.example.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface QuizDao {

    @Query("Select * from question_table ORDER BY id ASC")
    fun getAllQuestions(): List<Question>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(question: Question)

    @Query("Select * from question_table WHERE id == :id")
    fun getQuestionById(id: Int): LiveData<Question>

}