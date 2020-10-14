package com.example.canalviniciosthiengo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.canalviniciosthiengo.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        /**
         * Devido ao uso de uma Splash Screen
         * personalizada
         * */
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}