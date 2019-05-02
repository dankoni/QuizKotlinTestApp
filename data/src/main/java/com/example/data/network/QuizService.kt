package com.example.data.network

class QuizService(private val quizApi: QuizApi) {

    fun getNextQuestion() {
        quizApi.getQuestion()
    }
}