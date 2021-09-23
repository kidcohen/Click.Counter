package com.example.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x=0
        Increase
            .setOnClickListener {
                x = x + 2
                textView.text = x.toString()
            }
        Decrease1
            .setOnClickListener {
                x= x - 2
                textView.text=x.toString()
            }
        Restart
            .setOnClickListener {
                x=0
                textView.text=x.toString()
            }
    }
}
