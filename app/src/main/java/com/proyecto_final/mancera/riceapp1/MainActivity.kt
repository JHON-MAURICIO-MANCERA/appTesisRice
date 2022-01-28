package com.proyecto_final.mancera.riceapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        startTimer()
    }

    fun startTimer(){

        object : CountDownTimer(3000,1000) {
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
              val intent = Intent(applicationContext, PrincipalActivity::class.java).apply {  }
                startActivity(intent)
            }


        }.start()
    }
}