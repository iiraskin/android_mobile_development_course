package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("Notes")
        val cardView = findViewById<View>(R.id.card_view)
        val detailLayout = findViewById<View>(R.id.linear_layout_detail)

        cardView.setOnClickListener {
            setTitle("")
            cardView.visibility = View.GONE
            detailLayout.visibility = View.VISIBLE
        }
    }
}
