package com.techmaina.listviewsmodule

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ListView
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
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
//    lateinit var recyclerView: RecyclerView
//    var countryNameList = ArrayList<String>()
//    var detailList= ArrayList<String>()
//    var imageList = ArrayList<Int>()
//    lateinit var adapter: CountryAdapter

//    Grid View
//    lateinit var gridView: GridView
//    var nameList = ArrayList<String>()
//    var imageList = ArrayList<Int>()


//    webView
    lateinit var webview: WebView


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

//        recyclerView =  findViewById(R.id.recyclerView)
//        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
//        countryNameList.add("United Kingdom")
//        countryNameList.add("Germeny")
//        countryNameList.add("USA")
//
//        detailList.add("This is the United Kindom Flag")
//        detailList.add("This is the United  Germeny Flag")
//        detailList.add("This is the United USA Flag")
//
//        imageList.add(R.drawable.img)
//        imageList.add(R.drawable.img_1)
//        imageList.add(R.drawable.img_2)
//
//        adapter = CountryAdapter(countryNameList,detailList,imageList,this@MainActivity)
//        recyclerView.adapter =  adapter


//        Grid View
//        gridView=findViewById(R.id.gridView)
//
//        fillArrays()
//        val adapter = AnimalAdpter(this,nameList,imageList)
//        gridView.adapter = adapter
//        gridView.setOnItemClickListener { adapterView, view, position, id ->
//
//            Toast.makeText(applicationContext,"You selected the ${nameList[position]}"
//                ,Toast.LENGTH_LONG).show()
//
//        }

//        webview
        webview=findViewById(R.id.webView)
        webview.webViewClient = WebViewClient()
        webview.loadUrl("http://www.google.com")
        onBackPressedDispatcher.addCallback((this,callback))




    }
//    fun fillArrays(){
//        nameList.add("Bird")
//        nameList.add("Cat")
//        nameList.add("Chicken")
//        nameList.add("Dog")
//        nameList.add("Fish")
//        nameList.add("Monkey")
//        nameList.add("Rabbit")
//        nameList.add("Sheep")
//        nameList.add("lion")
//
//        imageList.add(R.drawable.lion)
//        imageList.add(R.drawable.cat)
//        imageList.add(R.drawable.chicken)
//        imageList.add(R.drawable.monkey)
//        imageList.add(R.drawable.rabbit)
//        imageList.add(R.drawable.sheep)
//        imageList.add(R.drawable.dog)
//        imageList.add(R.drawable.bird)
//    }

//    webviws backe buttom

    val callback = object :OnBackPressedCallback(true){
        override fun handleOnBackPressed() {
            if(webview.canGoBack()){
                webview.goBack()
            }else{
                finish()
            }
        }

    }

}