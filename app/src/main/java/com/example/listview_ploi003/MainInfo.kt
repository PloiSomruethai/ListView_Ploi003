package com.example.listview_ploi003

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_info.*

class MainInfo : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

       val title = intent.extras?.getString(MainActivity().KEY_TITLE,"")
       val info = intent.extras?.getString(MainActivity().KEY_INFO)

        tv_info.setText(title)
        tv_viewinfo.setText(info)

        btn_back.setOnClickListener {
            finish()
        }
    }
}