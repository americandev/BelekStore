package com.example.hggg.Splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.hggg.LoginActivity
import com.example.hggg.MainActivity
import com.example.hggg.R
import com.example.hggg.ui.login.loginPassword

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }, 2000L)

    }
}