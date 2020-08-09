package com.rakhulant.learningapp

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TimePicker
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import android.app.TimePickerDialog as TimePickerDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun carwashorder(view: View){
        startActivity(Intent(this, CarWashActivity::class.java))
    }
}