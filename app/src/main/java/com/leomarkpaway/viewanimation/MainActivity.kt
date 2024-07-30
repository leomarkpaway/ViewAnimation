package com.leomarkpaway.viewanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val upwardFadeButton = findViewById<Button>(R.id.btn_upward_fade)
        val helloWord = findViewById<TextView>(R.id.tv_hello_world)

        upwardFadeButton.setOnClickListener { startAnimation(helloWord, R.anim.upward_fade) }
    }
}