package com.ramanmatharu.task_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText


class TransferActivity : AppCompatActivity() {
    var mName=""
    var rollNo =""
    var temperature = ""
    lateinit var name : EditText
    lateinit var uniRoll : EditText
    lateinit var temp : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transfer)

        name = findViewById(R.id.tName)
        uniRoll = findViewById(R.id.tUniRoll)
        temp = findViewById(R.id.tTemp)

        intent?.extras?.let{
            mName = it.getString("name","")
            rollNo = it.getString("rollNo","")
            temperature= it.getString("temp","")
        }

        name.setText(mName)
        uniRoll.setText(rollNo)
        temp.setText(temperature)
    }
}