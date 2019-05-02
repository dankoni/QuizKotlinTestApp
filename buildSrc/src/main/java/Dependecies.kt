object Modules {
    val app = ":app"
    val data = ":data"
}

object Releases {
    val versionCode = 1
    val versionName = "1.0"
}

object Sdk {
    val minSdk = 23
    val compileSdk = 28
    val targetSdk = 28
}

object Versions {
    val kotlin = "1.3.21"
    val gradle = "3.3.2"
    val appCompat = "1.1.0-alpha04"
    val coreKtx = "1.1.0-alpha04"
    val constraintLayout = "1.1.3"
    val junit = "4.12"
    val androidTestRunner = "1.1.2-alpha02"
    val espressoCore = "3.2.0-alpha02"
    val retrofit = "2.5.0"
    val retrofitCoroutines = "0.9.2"
    val retrofitGson = "2.4.0"
    val gson = "2.8.5"
    val okHttp = "3.12.1"
    val coroutines = "1.1.1"
    val koin = "1.0.2"
    val timber = "4.7.1"
    val lifecycle = "2.1.0-alpha04"
    val nav = "2.0.0"
    val room = "2.1.0-alpha06"
    val recyclerview = "1.0.0"
    val safeArgs = "2.1.0-alpha01"
    val glide = "4.9.0"
    val mockwebserver = "2.7.5"
    val archCoreTest = "2.0.0"
    val androidJunit = "1.1.0"
    val mockk = "1.9.2"
    val fragmentTest = "1.1.0-alpha06"
    val databinding = "3.3.2"
    val RxAndroidVersion = "2.0.1"
    val RxJavaVersion = "2.1.3"
}

object Libarary {

    val nav_version = "2.1.0-alpha02"


    // KOIN
    val koin = "org.koin:koin-android:${Versions.koin}"
    val koinViewModel = "org.koin:koin-android-viewmodel:${Versions.koin}"
    // ROOM
    val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    val roomRunTime = "androidx.room:room-runtime:${Versions.room}"
    val roomKtx = "androidx.room:room-ktx:${Versions.room}"

    // RETROFIT
    val retrofitCoroutineAdapter =
        "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutines}"
    val gson = "com.google.code.gson:gson:${Versions.gson}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofitGson}"
    val httpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.RxJavaVersion}"
    val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.RxAndroidVersion}"
}
