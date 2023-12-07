package com.example.uts_lab1_211401031

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.RecyclerView

class MealAdapter(private val mealList: List<Meal>) :
    RecyclerView.Adapter<MealAdapter.mealViewHolder>(){
    class mealViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val mealImageView : ImageView = itemView.findViewById(R.id.greekPicture)
        val mealTextView : TextView = itemView.findViewById(R.id.greekDesc)
        val mealKcalView : TextView = itemView.findViewById(R.id.teksKcal)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mealViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.mealitem , parent, false)
        return mealViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mealList.size
    }

    override fun onBindViewHolder(holder: mealViewHolder, position: Int) {
        val meal = mealList[position]
        holder.mealImageView.setImageResource(meal.mealImage)
        holder.mealTextView.text = meal.mealDesc
        holder.mealKcalView.text = meal.mealKcal
    }
}