package com.example.sending_age_and_name_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var edt_name:EditText
    lateinit var edt_age: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        var btn_send = findViewById<Button>(R.id.btn_send)
         edt_name = findViewById<EditText>(R.id.edt_name)
         edt_age = findViewById<EditText>(R.id.edt_age)

        btn_send.setOnClickListener{
            openDetailActivity()
        }
    }

    private fun openDetailActivity() {
        var intent = Intent(this,DetailsActivity::class.java)
        intent.putExtra("name",edt_name.text.toString())
        intent.putExtra("age",edt_age.text.toString())
        startActivity(intent)
    }
}