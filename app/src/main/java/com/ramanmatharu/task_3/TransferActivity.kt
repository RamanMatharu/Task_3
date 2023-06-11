package com.ramanmatharu.task_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText


class TransferActivity : AppCompatActivity() {
    var m_name=""
    var rollNO =""
    var temperature = ""
    lateinit var name : EditText
    lateinit var uni_roll : EditText
    lateinit var temp : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transfer)

        name = findViewById(R.id.t_name)
        uni_roll = findViewById(R.id.t_uni_roll)
        temp = findViewById(R.id.t_temp)

        intent?.extras?.let{
            m_name = it.getString("name","")
            rollNO = it.getString("rollNo","")
            temperature= it.getString("temp","")
        }

        name.setText(m_name)
        uni_roll.setText(rollNO)
        temp.setText(temperature)
    }
}