package com.example.msnapp.Controller

import android.app.Application
import com.example.msnapp.Utilities.SharedPrefs

class App : Application() {

    companion object {
        lateinit var prefs: SharedPrefs
    }

    override fun onCreate() {
        prefs = SharedPrefs(applicationContext)
        super.onCreate()
    }
}