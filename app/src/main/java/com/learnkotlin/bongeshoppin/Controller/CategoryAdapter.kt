package com.learnkotlin.bongeshoppin.Controller

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.learnkotlin.bongeshoppin.Modal.Category

class CategoryAdapter(private val data: List<Category>): RecyclerView.Adapter<CategoryHolder>(){
    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        return CategoryHolder(inflater, parent)
    }
}