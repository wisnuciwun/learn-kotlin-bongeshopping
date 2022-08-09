package com.learnkotlin.bongeshoppin.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.learnkotlin.bongeshoppin.Modal.Product
import com.learnkotlin.bongeshoppin.R

class ProductAdapter(val context: Context, val products: List<Product>): RecyclerView.Adapter<ProductAdapter.ProductHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.card_product, parent, false)
        return ProductHolder(view)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder?.bind(products[position])
    }

    override fun getItemCount(): Int {
        return products.size
    }

    inner class ProductHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!){
        val productImage = itemView?.findViewById<ImageView>(R.id.img_product)
        val productName = itemView?.findViewById<TextView>(R.id.product_title)
        val productPrice = itemView?.findViewById<TextView>(R.id.product_price)

        fun bind (data: Product){
            productImage?.setImageResource(data.image)
            productName?.setText(data.title)
            productPrice?.setText(data.price)
        }
    }
}