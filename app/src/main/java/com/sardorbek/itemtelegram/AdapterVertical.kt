package com.sardorbek.itemtelegram

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterVertical(val member: List<Model>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemone,parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return member.size
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {


        if (holder is CustomViewHolder ){

            holder.imageview.setImageResource(member[position].icon)
            holder.title.text= member[position].title
            holder.saptitle.text= member[position].subtitle
            holder.time.text= member[position].time
            holder.message.text= member[position].messagesms
        }
    }
    class CustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageview = itemView.findViewById<ImageView>(R.id.imageview)
        val title = itemView.findViewById<TextView>(R.id.textname)
        val saptitle = itemView.findViewById<TextView>(R.id.texttitle)
        val time = itemView.findViewById<TextView>(R.id.texttime)
        val message = itemView.findViewById<TextView>(R.id.sms)

    }
}