package com.learnkotlin.bongeshoppin.Controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.learnkotlin.bongeshoppin.R
import com.learnkotlin.bongeshoppin.Services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
        private fun init() {
            recyclerView = findViewById(R.id.list_categories)
            var data = DataService.categories
            adapter = CategoryAdapter(data)
        }
}