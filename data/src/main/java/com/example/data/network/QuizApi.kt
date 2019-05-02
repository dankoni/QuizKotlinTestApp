package com.example.data.network

import io.reactivex.Observable
import retrofit2.http.GET

interface QuizApi {

    @GET("api.php?amount=1&category=18")
    fun getQuestion(): Observable<QuestionModel>

}