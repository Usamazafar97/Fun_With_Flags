package com.example.funwithflags

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val btn_start:Button = findViewById(R.id.btn_start)
        val ed_name:EditText = findViewById(R.id.ed_name)

        btn_start.setOnClickListener {
            if (ed_name.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"Please enter your name",Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this,QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            }
        }


    }
}