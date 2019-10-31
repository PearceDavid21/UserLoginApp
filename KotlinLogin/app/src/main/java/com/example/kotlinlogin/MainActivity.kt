package com.example.kotlinlogin

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        new_user_button.setOnClickListener{ _ ->
            val name = name_edittext.text.toString()

            val email = email_edittext.text.toString()

            val phonenumber = phone_number_edittext.text.toString()

            val newuser = user(name, email, phonenumber)

            val userIntent = Intent(this, MainActivity2::class.java)
            userIntent.putExtra("my_user_key", newuser)
            startActivity(userIntent)

        }








    }
















}