package com.techmaina.listviewsmodule

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class CountryAdapter(
    var countryNameList: ArrayList<String>,
    var detailsList: ArrayList<String>,
    var imageList: ArrayList<Int>,
    var context: Context
): RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CountryViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.card_design,parent,false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: CountryViewHolder,
        position: Int
    ) {
        holder.textViewCountryName.text =  countryNameList.get(position)
        holder.textViewDetails.text = detailsList.get(position)
        holder.imageView.setImageResource(imageList.get(position))
        holder.cardView.setOnClickListener {
            Toast.makeText(context,"You selcted this ${countryNameList.get(position)}", Toast.LENGTH_LONG).show()
        }


    }

    override fun getItemCount(): Int {
        return  countryNameList.size
    }

    class CountryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var textViewCountryName: TextView =itemView.findViewById(R.id.textView)
        var textViewDetails: TextView =itemView.findViewById(R.id.textView2)
        var imageView: TextView =itemView.findViewById(R.id.profile_image)

        var cardView : CardView = itemView.findViewById(R.id.cardView)

    }


}