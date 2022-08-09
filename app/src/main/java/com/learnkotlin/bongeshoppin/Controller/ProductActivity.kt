package com.learnkotlin.bongeshoppin.Controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.learnkotlin.bongeshoppin.Adapters.ProductAdapter
import com.learnkotlin.bongeshoppin.R
import com.learnkotlin.bongeshoppin.Services.DataService
import com.learnkotlin.bongeshoppin.Utils.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var adapter : ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        intent.getStringExtra(EXTRA_CATEGORY)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        product_name.setText(categoryType)

        adapter = ProductAdapter(this, DataService.getProducts(categoryType))

        var spanCount = 2
        val orientation = resources.configuration.orientation

        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp

        if(screenSize > 720){
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        list_product.layoutManager = layoutManager
        list_product.adapter = adapter
    }
}