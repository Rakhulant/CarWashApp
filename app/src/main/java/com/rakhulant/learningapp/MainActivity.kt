package com.rakhulant.learningapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.TimePicker
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Clock
import java.util.*
import android.app.TimePickerDialog as TimePickerDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun datePicker(view: View){
        val calned = Calendar.getInstance()
        val year = calned.get(Calendar.YEAR)
        val month = calned.get(Calendar.MONTH)
        val day = calned.get(Calendar.DAY_OF_MONTH)
        DatePickerDialog(this, DatePickerDialog.OnDateSetListener { datePicker, i, i2, i3 ->
            btnDate.text = "$i3/$i2/$i"
        }, year, month, day).show()

    }
    fun timePicker(view: View){
        val calned = Calendar.getInstance()
        val hr:Int = calned.get(Calendar.HOUR)
        val min = calned.get(Calendar.MINUTE)
        TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { timePicker: TimePicker?, i: Int, i2: Int ->
                btnTime.text = "$i:$i2"
            } ,
                    hr, min, false).show()
    }
}