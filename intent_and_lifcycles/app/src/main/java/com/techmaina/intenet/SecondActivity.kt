package com.techmaina.intenet

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {

//    lateinit var result: TextView

//    main activity lifecycel
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        result = findViewById(R.id.textView)
//       var userName : String= intent.getStringExtra("username").toString()
//        var userAge:Int = intent.getIntExtra("userage",0).toInt()
//        result.text = "Your naem is $userName and your age is $userAge"
        button = findViewById(R.id.button)
        button.setOnClickListener {
            var intent = Intent(this@SecondActivity, MainActivity::class.java)
            startActivity(intent)
        }






    }

//    Ndroid lifcyles and different stages
    override fun onDestroy() {
        super.onDestroy()
        Log.d("Messages","second activity onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Messages","seconde activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Messages","second activity onStop")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Messages","second activity onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Messages","second activity onStart")
    }
}