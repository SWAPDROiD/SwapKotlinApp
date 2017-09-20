package com.cs.swapkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvText: TextView = findViewById(R.id.tvText);
        val btnTest : Button = findViewById(R.id.btnTest);

        btnTest.setOnClickListener {
            tvText.setText("Hi Swapnil!");
            //toast("Thanks for the love!")
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onResume() {
        super.onResume()
    }

}
