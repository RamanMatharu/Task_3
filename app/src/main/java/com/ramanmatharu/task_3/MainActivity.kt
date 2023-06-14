package com.ramanmatharu.task_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var name : EditText
    lateinit var uniRoll : EditText
    lateinit var temp: EditText
    lateinit var moveBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        uniRoll = findViewById(R.id.uniRoll)
        temp = findViewById(R.id.temp)
        moveBtn = findViewById(R.id.moveBtn)

        moveBtn.setOnClickListener {
            if(name.text.toString().isNullOrEmpty()){
                name.error = "Enter your name"
            }else if(uniRoll.text.toString().isNullOrEmpty()){
                uniRoll.error="Enter your University RollNo"
            }else if(temp.text.toString().isNullOrEmpty()){
                temp.error="Enter temperature of your city"
            }else{
                Toast.makeText(this,"Transfer is Successful",Toast.LENGTH_SHORT).show()
                var tName = name.text.toString()
                var tUniRoll = uniRoll.text.toString()
                var tTemp = temp.text.toString()
                var intent = Intent(this,TransferActivity::class.java)
                intent.putExtra("name",tName)
                intent.putExtra("rollNo",tUniRoll)
                intent.putExtra("temp",tTemp)
                startActivity(intent)
                finish()
            }
        }
    }
}