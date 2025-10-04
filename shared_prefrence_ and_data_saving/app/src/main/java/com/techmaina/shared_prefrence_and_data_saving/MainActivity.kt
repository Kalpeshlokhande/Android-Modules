package com.techmaina.shared_prefrence_and_data_saving

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var  userName: EditText
    lateinit var  userMessage: EditText
    lateinit var counter: Button

    var count = 0

    var name:String? = null
    var message: String? = null
    var ischecked: Boolean? = null

    lateinit var  sharedPreferences: SharedPreferences
    lateinit var remember: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        userName = findViewById(R.id.editTextText)
        userMessage =  findViewById(R.id.editTextTextMultiLine)
        counter = findViewById(R.id.button)
        remember = findViewById(R.id.checkBox)

        counter.setOnClickListener {
            count= count +1
            counter.setText(""+count)
        }

    }

    override fun onPause() {
        super.onPause()
        saveDATA()

    }
    fun saveDATA(){
        sharedPreferences = this.getSharedPreferences("saveData", Context.MODE_PRIVATE)
        name= userName.text.toString()
        message = userMessage.text.toString()
        ischecked = remember.isChecked
        val editor = sharedPreferences.edit()
        editor.putString("key name",name)
        editor.putString("key message",message)
        editor.putInt("key count",count)
        editor.putBoolean("key remember",ischecked!!)

        editor.apply()
        Toast.makeText(applicationContext,"Your data is saved", Toast.LENGTH_LONG).show()
    }
    fun retivedData(){
        sharedPreferences = this.getSharedPreferences("saveData", Context.MODE_PRIVATE)
        name = sharedPreferences.getString("key name",null)
        message = sharedPreferences.getString("key message",null)
        count = sharedPreferences.getInt("key count ",0)
        ischecked =sharedPreferences.getBoolean("key remember", false)

        userName.setText(name)
        userMessage.setText(message)
        counter.setText(""+count)
        remember.isChecked=ischecked!!




    }

    override fun onResume() {
        super.onResume()
        retivedData()
    }
}