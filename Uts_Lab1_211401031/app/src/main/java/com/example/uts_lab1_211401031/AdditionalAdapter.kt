package com.example.uts_lab1_211401031

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdditionalAdapter(private val additionalList : List<Additional>) :
    RecyclerView.Adapter<AdditionalAdapter.additionalViewHolder>(){
    class additionalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val girlBgPhoto:ImageView = itemView.findViewById(R.id.bg_iv)
        val girlPhoto:ImageView = itemView.findViewById(R.id.iv_addExercise)
        val title:TextView = itemView.findViewById(R.id.tv_title)
        val tvKalori:TextView = itemView.findViewById(R.id.tv_kalori)
        val time : TextView = itemView.findViewById(R.id.time_addExercise)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): additionalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.additionaitem , parent, false)
        return additionalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return additionalList.size
    }

    override fun onBindViewHolder(holder: additionalViewHolder, position: Int) {
        val category = additionalList[position]
        holder.girlBgPhoto.setImageResource(category.bgPhoto)
        holder.girlPhoto.setImageResource(category.photo)
        holder.title.text = category.title
        holder.tvKalori.text = category.kalori
        holder.time.text = category.time
    }
}