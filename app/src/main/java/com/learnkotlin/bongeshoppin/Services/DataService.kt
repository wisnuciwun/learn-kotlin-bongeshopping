package com.learnkotlin.bongeshoppin.Services

import com.learnkotlin.bongeshoppin.Modal.Category
import com.learnkotlin.bongeshoppin.Modal.Product

object DataService {
    // this is singleton

    val categories = listOf<Category>(
        Category("Shirts", "shirtimage"),
        Category("Hoodies", "hoodieimage"),
        Category("Hats", "hatimage"),
        Category("Digital", "digitalgoodsimage")
    )

    val hats = listOf<Product>(
        Product("Bonge CFW Daily", "1670000", "hat01"),
        Product("Black Dessert", "168000", "hat02"),
        Product("White Sky", "1207000", "hat03"),
        Product("Bonge Snapback Citayam", "1900000", "hat04"),
    )

    val hoodies = listOf<Product>(
        Product("Bestie Hoodie", "140000", "hoodie01"),
        Product("That's a Wrap Hoodie", "167000", "hoodie02"),
        Product("Amazing Bonge", "155000", "hoodie03"),
        Product("Red Alert Bitsh", "140200", "hoodie04"),
    )

    val shirts = listOf<Product>(
        Product("Shirt Black", "140000", "shirt01"),
        Product("Grayscale Bonge", "167000", "shirt02"),
        Product("The Raid", "155000", "shirt03"),
        Product("Bonge Hustle", "140200", "shirt04"),
        Product("Arrange Studio Hustle", "140200", "shirt05"),
    )

}