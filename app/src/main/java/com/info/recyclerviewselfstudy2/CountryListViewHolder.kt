package com.info.recyclerviewselfstudy2

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_item.view.*

class CountryListViewHolder(view:View): RecyclerView.ViewHolder(view) {

    fun bindItems(countries:Countries){

        val CountryName:TextView = itemView.txt_name

        //burda UI elementlerini data classimizin elementlerine beraberlesidirirk

        CountryName.text = countries.CountryName

    }

}