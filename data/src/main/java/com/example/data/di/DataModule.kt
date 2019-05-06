package com.example.data.di

import com.example.data.QuizRepository
import com.example.data.database.QuizDatabase
import com.example.data.network.QuizApi
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

fun dataModule() = module {

    factory<Interceptor> {
        HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.HEADERS)
    }

    factory { OkHttpClient.Builder().addInterceptor(get()).build() }

    single {
        Retrofit.Builder()
            .client(get())
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
    }

    factory { get<Retrofit>().create(QuizApi::class.java) }

    single { QuizDatabase.createDatabase(androidContext()) }

    factory { get<QuizDatabase>().quizDao() }

    single { QuizRepository(get(), get()) }
}