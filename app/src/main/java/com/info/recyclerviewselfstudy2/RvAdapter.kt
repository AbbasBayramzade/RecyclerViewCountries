package com.info.recyclerviewselfstudy2

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(private val mContext: Context,private val CountryList:List<Countries>):RecyclerView.Adapter<CountryListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryListViewHolder {
        return CountryListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_item,parent,false))
    }

    override fun onBindViewHolder(holder: CountryListViewHolder, position: Int) {
        holder.bindItems(CountryList[position])
    }

    override fun getItemCount(): Int {
        return CountryList.size
    }
}