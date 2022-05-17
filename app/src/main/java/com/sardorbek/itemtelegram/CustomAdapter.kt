package com.sardorbek.itemtelegram

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import java.lang.reflect.Member



class CustomAdapter(val member: List<com.sardorbek.itemtelegram.Member>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tableitem,parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return member.size
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = member[position].titleTV

        if (holder is CustomViewHolder){
            holder.titleTV.setText(member)
        }
    }
    class CustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val titleTV = itemView.findViewById<TextView>(R.id.text2)

    }
}