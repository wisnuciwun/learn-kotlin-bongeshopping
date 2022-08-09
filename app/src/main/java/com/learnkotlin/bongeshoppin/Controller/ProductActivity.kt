package com.learnkotlin.bongeshoppin.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.learnkotlin.bongeshoppin.R
import com.learnkotlin.bongeshoppin.Utils.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        intent.getStringExtra(EXTRA_CATEGORY)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        category_name.setText(categoryType)
    }
}