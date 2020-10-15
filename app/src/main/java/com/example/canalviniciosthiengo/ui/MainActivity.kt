package com.example.canalviniciosthiengo.ui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.canalviniciosthiengo.R
import com.example.canalviniciosthiengo.config.YouTubeConfig

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

    fun openYouTubeChannel(view: View){
        val intent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse(YouTubeConfig.Channel.CHANNEL_URL)
        )

        if(intent.resolveActivity(packageManager) != null){
            startActivity(intent)
        }else{
            Toast
                .makeText(
                    this,
                    getString(R.string.channel_toast_alert),
                    Toast.LENGTH_LONG
                )
                .show()
        }
    }
}