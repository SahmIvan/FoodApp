package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.foodapp.activities.confirmation

class MainActivity : AppCompatActivity() {
    private lateinit var buybtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buybtn = findViewById(R.id.buybtn)
        buybtn.setOnClickListener {
            //Se enviara al confirmation.xml

            val intent = Intent(this@MainActivity, confirmation::class.java)
            startActivity(intent)


        }

    }
}