package com.ramanmatharu.task_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var name : EditText
    lateinit var uni_roll : EditText
    lateinit var temp: EditText
    lateinit var moveBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        uni_roll = findViewById(R.id.uni_roll)
        temp = findViewById(R.id.temp)
        moveBtn = findViewById(R.id.moveBtn)

        moveBtn.setOnClickListener {
            if(name.text.toString().isEmpty()){
                name.error = "Enter your name"
            }else if(uni_roll.text.toString().isEmpty()){
                uni_roll.error="Enter your University RollNo"
            }else if(temp.text.toString().isEmpty()){
                temp.error="Enter temperature of your city"
            }else{
                Toast.makeText(this,"Transfer is Successful",Toast.LENGTH_SHORT).show()
                var t_name = name.text.toString()
                var t_uniRoll = uni_roll.text.toString()
                var t_temp = temp.text.toString()
                var intent = Intent(this,TransferActivity::class.java)
                intent.putExtra("name",t_name)
                intent.putExtra("rollNo",t_uniRoll)
                intent.putExtra("temp",t_temp)
                startActivity(intent)
                finish()
            }
        }
    }
}