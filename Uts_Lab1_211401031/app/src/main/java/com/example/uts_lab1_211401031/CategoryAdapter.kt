package com.example.uts_lab1_211401031

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(private val categoryList : List<Category>) :
    RecyclerView.Adapter<CategoryAdapter.categoryViewHolder>(){
    class categoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val categoryImageView : ImageView = itemView.findViewById(R.id.iconYoga)
        val categoryTextView : TextView = itemView.findViewById(R.id.titleTeks)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): categoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.categoryitem , parent, false)
        return categoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    override fun onBindViewHolder(holder: categoryViewHolder, position: Int) {
        val category = categoryList[position]
        holder.categoryImageView.setImageResource(category.iconImage)
        holder.categoryTextView.text = category.title
    }
}