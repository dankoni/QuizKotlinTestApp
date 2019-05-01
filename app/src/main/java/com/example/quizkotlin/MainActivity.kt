package com.example.quizkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.fabric.sdk.android.Fabric
import com.crashlytics.android.Crashlytics



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Fabric.with(this, Crashlytics())
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
