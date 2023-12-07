package com.example.uts_lab1_211401031

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.RecyclerView

class GoalAdapter(private val goalList : List<Goal>) :
    RecyclerView.Adapter<GoalAdapter.goalViewHolder>(){

    private var selectedPosition: Int = RecyclerView.NO_POSITION

    class goalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val goalTextView : TextView = itemView.findViewById(R.id.buttonGoal)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): goalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.goalitem , parent, false)
        return goalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return goalList.size
    }

    override fun onBindViewHolder(holder: goalViewHolder, position: Int) {
        val goal = goalList[position]
        holder.goalTextView.text = goal.goalText

        if (position == selectedPosition) {
            holder.goalTextView.setBackgroundResource(R.drawable.button_black)
            holder.goalTextView.setTextColor(Color.WHITE)
        } else {
            holder.goalTextView.setBackgroundResource(R.drawable.button_white)
            holder.goalTextView.setTextColor(Color.BLACK)
        }

        holder.goalTextView.setOnClickListener {
            val prevSelectedPosition = selectedPosition
            selectedPosition = position
            notifyItemChanged(prevSelectedPosition)
            notifyItemChanged(selectedPosition)
        }
    }
}