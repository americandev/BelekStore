package com.example.hggg.adapter

import android.graphics.drawable.Drawable
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.example.hggg.R
import com.example.hggg.dataClasss.SimpleDataModel

class AutoAdapter: RecyclerView.Adapter<AutoAdapter.AutoHolder>() {


    class AutoHolder(item : View): RecyclerView.ViewHolder(item) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AutoHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: AutoHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {




        var itemTitle: TextView = itemView.findViewById(R.id.name)

    }
}