package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt.translationY = -1000f
        txt.animate().translationY(0f).duration = 600

        Handler().postDelayed({

            val intent = Intent(this,SingUPActivity::class.java)
            startActivity(intent)
        },1000)
    }
}