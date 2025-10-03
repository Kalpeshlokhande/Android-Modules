package com.techmaina.listviewsmodule

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

//    listview
//    lateinit var lisview: ListView
    
//    Recyclerview
    lateinit var recyclerView: RecyclerView
    var countryNameList = ArrayList<String>()
    var detailList= ArrayList<String>()
    var imageList = ArrayList<Int>()
    lateinit var adapter: CountryAdapter
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        listview
//        lisview = findViewById(R.id.listview)
//        var countryList = resources.getStringArray(R.array.countries)
//        var arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,countryList)
//        lisview.adapter = arrayAdapter
//
//        lisview.setOnItemClickListener{parent, view, position, id ->
//            val countryName:String=parent.getItemAtPosition(position).toString()
//            Toast.makeText(applicationContext,"You sekcted the ${countryName}",Toast.LENGTH_SHORT).show()
//        }
        
//        REcyclerview

        recyclerView =  findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        countryNameList.add("United Kingdom")
        countryNameList.add("Germeny")
        countryNameList.add("USA")

        detailList.add("This is the United Kindom Flag")
        detailList.add("This is the United  Germeny Flag")
        detailList.add("This is the United USA Flag")

        imageList.add(R.drawable.img)
        imageList.add(R.drawable.img_1)
        imageList.add(R.drawable.img_2)

        adapter = CountryAdapter(countryNameList,detailList,imageList,this@MainActivity)
        recyclerView.adapter =  adapter





    }
}