package com.rakhulant.learningapp

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TimePicker
import kotlinx.android.synthetic.main.activity_car_wash.*
import java.util.*

class CarWashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_wash)
    }
    fun datePicker(view: View){
        val calned = Calendar.getInstance()
        val year = calned.get(Calendar.YEAR)
        val month = calned.get(Calendar.MONTH)
        val day = calned.get(Calendar.DAY_OF_MONTH)
        DatePickerDialog(this, DatePickerDialog.OnDateSetListener { datePicker, i, i2, i3 ->
            val date = "$i3/$i2/$i"
            btnDate.text = date
        }, year, month, day).show()

    }
    fun timePicker(view: View){
        val calned = Calendar.getInstance()
        val hr:Int = calned.get(Calendar.HOUR)
        val min = calned.get(Calendar.MINUTE)
        TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { timePicker: TimePicker?, i: Int, i2: Int ->
                if(i>12){
                    val time = "${i-12}:$i2 PM"
                    btnTime.text = time
                }
                else if(i == 12){
                    val time = "$i:$i2 PM"
                    btnTime.text = time
                }
                else{
                    val time = "$i:$i2 AM"
                    btnTime.text = time
                }
            }, hr, min, false).show()
    }
}