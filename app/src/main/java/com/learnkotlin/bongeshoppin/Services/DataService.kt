package com.learnkotlin.bongeshoppin.Services

import com.learnkotlin.bongeshoppin.Modal.Category
import com.learnkotlin.bongeshoppin.Modal.Product
import com.learnkotlin.bongeshoppin.R

object DataService {
    // this is singleton

    val categories = listOf<Category>(
        Category("Shirts", R.drawable.shirtimage),
        Category("Hoodies", R.drawable.hoodieimage),
        Category("Hats", R.drawable.hatimage),
        Category("Digital", R.drawable.digitalgoodsimage)
    )

    val hats = listOf<Product>(
        Product("Bonge CFW Daily", "1670000", R.drawable.hat1),
        Product("Black Dessert", "168000", R.drawable.hat2),
        Product("White Sky", "1207000", R.drawable.hat3),
        Product("Bonge Snapback Citayam", "1900000", R.drawable.hat4),
    )

    val hoodies = listOf<Product>(
        Product("Bestie Hoodie", "140000", R.drawable.hoodie1),
        Product("That's a Wrap Hoodie", "167000", R.drawable.hoodie2),
        Product("Amazing Bonge", "155000", R.drawable.hoodie3),
        Product("Red Alert Bitsh", "140200", R.drawable.hoodie4),
    )

    val shirts = listOf<Product>(
        Product("Shirt Black", "140000", R.drawable.shirt1),
        Product("Grayscale Bonge", "167000", R.drawable.shirt2),
        Product("The Raid", "155000", R.drawable.shirt3),
        Product("Bonge Hustle", "140200", R.drawable.shirt4),
        Product("Arrange Studio Hustle", "140200", R.drawable.shirt5),
    )

    fun getProducts(category: String?) : List<Product> {
        return when(category) {
            "Shirts" -> shirts
            "Hats" -> hats
            "Hoodies" -> hoodies
            else -> hats
        }
    }

}