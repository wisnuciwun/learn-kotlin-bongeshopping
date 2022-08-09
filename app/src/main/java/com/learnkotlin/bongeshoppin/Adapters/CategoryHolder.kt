package com.learnkotlin.bongeshoppin.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.learnkotlin.bongeshoppin.Modal.Category
import com.learnkotlin.bongeshoppin.R

class CategoryHolder(inflater: LayoutInflater, parent: ViewGroup, val itemCLick: (Category) -> Unit): RecyclerView.ViewHolder(inflater.inflate(R.layout.card_layout, parent, false)) {
    private var imgView: ImageView? = null
    private var textView: TextView? = null


    init{
        imgView = itemView.findViewById(R.id.img_category)
        textView = itemView.findViewById(R.id.img_title)
    }
    fun bind(data: Category){
        imgView?.setImageResource(data.image)
        textView?.setText(data.title)
        itemView.setOnClickListener{
            itemCLick(data)
        }
    }
}