package com.example.belajarandroidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.R
import com.example.belajarandroidactivity.model.Doa

class DoaAdapter(val data:ArrayList<Doa>)
    :RecyclerView.Adapter<DoaAdapter.DoaViewHolder>()

{
    class DoaViewHolder(view:View)
        :RecyclerView.ViewHolder(view){
    val tvteskDoa:TextView = view.findViewById(R.id.tvteksDoa)
    val ivgambarDoa:ImageView = view.findViewById(R.id.ivgambarDoa)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaViewHolder {
        val view= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_doa,parent,false)
        return DoaViewHolder(view)
    }

    override fun getItemCount(): Int= data.size

    override fun onBindViewHolder(holder: DoaViewHolder, position: Int) {
        val item  = data.get(position)

        holder.tvteskDoa.text=item.name
        holder.ivgambarDoa.setImageResource(item.image)
    }

}