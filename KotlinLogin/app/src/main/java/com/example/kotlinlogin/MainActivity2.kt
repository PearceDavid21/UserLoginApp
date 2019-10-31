package com.example.kotlinlogin

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_main_2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)

        val userIn: user = intent?.getParcelableExtra("my_user_key") as user

        userIn.let { user ->
            val string = "${user.name}  ${user.phonenumber} ${user.email}"
            user_textview.text = string
        }


        camera_button.setOnClickListener { _ ->
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(cameraIntent, 777)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 777 && resultCode == Activity.RESULT_OK) {
            val bitmap: Bitmap = (data?.extras?.get("data") as Bitmap)
            my_imageview.setImageBitmap(bitmap)
        }
    }
}
