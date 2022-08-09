package com.learnkotlin.bongeshoppin.Controller

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.learnkotlin.bongeshoppin.Adapters.CategoryAdapter
import com.learnkotlin.bongeshoppin.R
import com.learnkotlin.bongeshoppin.Services.DataService
import com.learnkotlin.bongeshoppin.Utils.EXTRA_CATEGORY

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
            adapter = CategoryAdapter(data) {
                // this is lambda

                category -> println(category.title)
                val productIntent = Intent(this, ProductActivity::class.java)
                productIntent.putExtra(EXTRA_CATEGORY, category.title)
                startActivity(productIntent)
            }
        }
}