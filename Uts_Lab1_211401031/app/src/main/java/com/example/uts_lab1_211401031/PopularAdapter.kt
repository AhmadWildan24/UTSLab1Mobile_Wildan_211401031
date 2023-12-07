package com.example.uts_lab1_211401031

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PopularAdapter(private val popularList : List<Popular>) :
    RecyclerView.Adapter<PopularAdapter.popularViewHolder>(){
    class popularViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val popularImageView : ImageView = itemView.findViewById(R.id.barbelGirl)
        val popularTextView : TextView = itemView.findViewById(R.id.fullShotText)
        val popularTimeView : TextView = itemView.findViewById(R.id.timesText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): popularViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.popularitem , parent, false)
        return popularViewHolder(view)
    }

    override fun getItemCount(): Int {
        return popularList.size
    }

    override fun onBindViewHolder(holder: popularViewHolder, position: Int) {
        val popular = popularList[position]
        holder.popularImageView.setImageResource(popular.popularImage)
        holder.popularTextView.text = popular.popularDesc
        holder.popularTimeView.text = popular.popularTime
    }
}