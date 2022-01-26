package com.example.sending_age_and_name_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    lateinit var  tv_name:TextView
    lateinit var  tv_age:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        initViews()

    }

    private fun initViews() {
        tv_name = findViewById(R.id.tv_name)
        tv_age = findViewById(R.id.tv_age)

        tv_name.text =intent.getStringExtra("name")
        tv_age.text = intent.getStringExtra("age")
    }
}