package com.techmaina.layouts

import android.app.AlertDialog
import android.content.DialogInterface
import android.graphics.Color
import android.media.Image
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton
import android.widget.Toolbar
import androidx.activity.SystemBarStyle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
//    Tetx view
//    lateinit var myText: TextView

//    Button
//    lateinit var  doMagic: Button
//    lateinit var myButton: Button
//    lateinit var myText: TextView

//    Edit text

//    lateinit var namee: TextView
//    lateinit var ok: Button
//    lateinit var resukt: TextView
//
////    image view
//    lateinit var image: ImageView

//    checkbox anndroid

//    lateinit var male: CheckBox
//    lateinit var female: CheckBox
//    lateinit var result:


//    radiobutton

//    lateinit var linearLayout: LinearLayout
//    lateinit var green: RadioButton
//    lateinit var yellow: RadioButton
//    lateinit var black: RadioButton
//    lateinit var change: Button


//    Toggel button
//     lateinit var togglebutton: ToggleButton
//     lateinit var image: ImageView
//     lateinit var reult: TextView

//    spinner
//    lateinit var spinner: Spinner
//    lateinit var  result: TextView

//    top bar and tool bar
//    lateinit var toolbar: MaterialToolbar


//    Toast Message
//    lateinit var showToast: Button
    lateinit var showsnack:Button
    lateinit var layout: ConstraintLayout
    lateinit var showdialog: Button







    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(SystemBarStyle.dark(1))
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->)
//        myText.text="This is an example"
//        myText.setOnClickListener {
//            myText.setTextColor(Color.WHITE)
//            myText.setBackgroundColor(Color.BLACK)
//        }
//        val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//        insets
//    }
//    myText.setTextColor(Color.BLACK)
//    myText.setText("This is an example"]

//        button
//        doMagic =findViewById(R.id.doMagic)
//        myButton=findViewById(R.id.myButton)
//        myText=findViewById(R.id.textView)
//        doMagic.setOnClickListener {
//            doMagic.setBackgroundColor(Color.BLACK)
//            myText.setText("I have done my magic")
//            myText.isVisible=false
//            doMagic.isVisible=false
//        }

//        edit text
//        namee = findViewById(R.id.nam)
//        ok=findViewById(R.id.ok)
//        resukt=findViewById(R.id.result)
//        image=findViewById(R.id.imageView)
//        ok.setOnClickListener {
////            var userName: String=namee.text.toString()
////            resukt.setText(userName)
//            image.setImageResource((R.drawable.parlegS)
//        }

//        checkbox in anndroid
//        male=findViewById(R.id.checkBox)
//        female=findViewById(R.id.checkBox2)
//        result=findViewById(R.id.textView7)
//        male.setOnClickListener {
//            if(male.isChecked){
//                result.text="male"
//                female.isChecked=false
//            }else{
//                result.text="genser"
//            }
//        }
//        female.setOnClickListener {
//            if(male.isChecked){
//                result.text="female"
//                male.isChecked=false
//            }else{
//                result.text="genser"
//            }
//        }

//        radio button
//        linearLayout=findViewById(R.id.main)
//        green=findViewById(R.id.radioButtonGreen)
//        yellow=findViewById(R.id.radioButtonyellow)
//        black=findViewById(R.id.radioButtonblack)
//        change=findViewById(R.id.buttonchnge)
//        change.setOnClickListener {
//            if(green.isChecked){
//                linearLayout.setBackgroundColor(Color.GREEN)
//            }else if (yellow.isChecked){
//                linearLayout.setBackgroundColor(Color.YELLOW)
//
//            }else if (black.isChecked){
//                linearLayout.setBackgroundColor(Color.BLACK)
//            }
//        }

//        ToggleButton
//        togglebutton = findViewById(R.id.toggleButton)
//        image=findViewById(R.id.imageView)
//        reult=findViewById(R.id.textView)
//        togglebutton.setOnCheckedChangeListener {  compoundButton, isChecked ->
//            if (isChecked){
//                image.visibility= View.INVISIBLE
//                reult.text="This image is invinsible"
//            }else{
//                image.visibility= View.INVISIBLE
//                reult.text="This image is visible"
//            }
//
//        }

//        spinner buttin
//        spinner=findViewById(R.id.spinner)
//        result=findViewById(R.id.textView2)
//        spinner.onItemSelectedListener = this
//
//        var arrayAdapter= ArrayAdapter.createFromResource(
//            this,
//            R.array.countries,
//            android.R.layout.simple_spinner_item
//        )
//        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        spinner.adapter=arrayAdapter
//
//
//
//    }
//
//    override fun onItemSelected(
//        parent: AdapterView<*>?,
//        view: View?,
//        position: Int,
//        id: Long
//    ) {
//        if (parent != null){
//            result.text=parent.getItemAtPosition(position).toString()
//        }
//    }
//
//    override fun onNothingSelected(parent: AdapterView<*>?) {
//

//        toolbar
//        toolbar=findViewById(R.id.toolbar)
//        toolbar.overflowIcon= AppCompatResources.getDrawable(this,R.drawable.baseline_more_vert_24)
//
//        toolbar.setNavigationOnClickListener {
//            Toast.makeText(application,"Navigation icon is clicked",Toast.LENGTH_SHORT).show()
//        }
//
//        toolbar.setOnMenuItemClickListener { item ->
//        val message=when(item.itemId){
//            R.id.share -> "Share icon is clicked"
//            R.id.edit -> "Edit icon is clicked"
//            R.id.settings -> "Settings is clicked"
//            else -> "sign out is clicked"
//        }
//            Toast.makeText(applicationContext,message, Toast.LENGTH_SHORT).show()
//            return@setOnMenuItemClickListener true
//
//        }


//        Toast
//        showToast=findViewById(R.id.button2)
//        showToast.setOnClickListener {
//            Toast.makeText(applicationContext,"This is a Toast Message",Toast.LENGTH_LONG).show()
//        }

//        showsnackbaressage
//        showsnack=findViewById(R.id.button2)
//        layout=findViewById(R.id.main)
//        showsnack.setOnClickListener {
//            Snackbar.make(layout,"This is snack bar messgae", Snackbar.LENGTH_INDEFINITE).setAction("Close",View.OnClickListener{
//
//            }
//
//            ).show()
//        }
        showdialog=findViewById(R.id.button4)
        showdialog.setOnClickListener {
            showAlertDialog()
        }
        fun showAlertDialog(){
            var alertDialog= AlertDialog.Builder(this@MainActivity)
            alertDialog.setTitle("Change")
                .setMessage("Do you want to chnage the text of button?")
                .setIcon(R.drawable.outline_warning_24)
                .setCancelable(false)
                .setNegativeButton("No", DialogInterface.OnClickListener{ dialogInterface, which ->
                    dialogInterface.cancel()

                })
                .setPositiveButton("Yes", DialogInterface.OnClickListener{ dialogInterface,Which ->
                    showdialog.text ="Alert Dialog"

                })
            alertDialog.show()
        }



    }
}