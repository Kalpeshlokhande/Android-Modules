package com.techmaina.intenet

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.techmaina.intenet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    intnet lifecycle and data transfer
//    lateinit var name: EditText
//    lateinit var age: EditText
//    lateinit var button: Button

//    Activity lifecycle
//    lateinit var textview: TextView
//    lateinit var one: Button
//    lateinit var button: Button
//    var counter = 0

//    services in android
//    lateinit var startClassicService: Button
//    lateinit var startjobservice: Button
//    lateinit var stop: Button

//    bROADCASET

//    var br = BroadcastExample()


//    viewbidibg
        lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        intent lifecycle and data transfer
//        name=findViewById(R.id.editTextText)
//        age=findViewById(R.id.editTextNumber)
//        button=findViewById(R.id.button)
//        button.setOnClickListener {
//
//            var userName:String = name.text.toString()
//            var userAge:Int= age.text.toString().toInt()
//
//           var intent = Intent(this@MainActivity, SecondActivity::class.java)
//            intent.putExtra("username",userName)
//            intent.putExtra("userage",userAge)
//            startActivity(intent)
//        }

//    androif lifecycle and diffrenet stages
//        Log.d("Messages","onCreate")


//        activity lifecycle

//        textview= findViewById(R.id.textView)
//        one = findViewById(R.id.button2)
//        button= findViewById(R.id.button3)
//
//        one.setOnClickListener {
//            counter = counter + 1
//            textview.text = "" +counter
//        }
//        button.setOnClickListener {
//            var intent= Intent(this@MainActivity, SecondActivity::class.java)
//            startActivity(intent)
//        }
//        Log.d("Message","first activity on Crceate")

//        SEVICES ON ANDROID

//        startClassicService=findViewById(R.id.button4)
//        startjobservice=findViewById(R.id.button5)
//        stop=findViewById(R.id.button6)
//
//        startClassicService.setOnClickListener {
//            val intent = Intent(this@MainActivity, ClassicServiceExample::class.java)
//            startService(intent)
//        }
//        startjobservice.setOnClickListener {
//            val intent= Intent(this@MainActivity, JobIntentServiceExample::class.java)
//            JobIntentServiceExample.myBackgroundService(this@MainActivity,intent)
//
//        }
//        stop.setOnClickListener {
//            val intent = Intent(this@MainActivity, ClassicServiceExample::class.java
//            )
//            stopService(intent)
//
//        }

//        broadcast explael
//
//        val filter = IntentFilter()
//        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
//        this.registerReceiver(br,filter)

//        viewBinding

        mainBinding= ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        mainBinding.button7.setOnClickListener {
            mainBinding.textView3.text=mainBinding.editTextText2.text.toString()
        }




    }

//    Ndroid lifcyles and different stages
//    override fun onDestroy() {
//        super.onDestroy()
//    Log.d("Messages","first activity onDestroy")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.d("Messages","first activity onPause")
//    }
//
    override fun onStop() {
        super.onStop()
//        Log.d("Messages","first activity onStop"
          this.unregisterReceiver(br)

    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.d("Messages","first activity onResume")
//    }
//
    override fun onStart() {
        super.onStart()
//        Log.d("Messages","first activity onStart")
            val filter = IntentFilter()
            filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
            this.registerReceiver(br,filter)

    }
}