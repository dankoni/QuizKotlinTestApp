package com.example.data

import com.example.data.database.QuizDao
import com.example.data.network.QuizApi

class QuizRepository(private val quizDao: QuizDao, private val quizApi: QuizApi) {
}