package com.example.hggg.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hggg.dataClasss.SimpleDataModel
import com.example.hggg.databinding.ItemAppliancesBinding
import com.example.hggg.databinding.ItemCarBinding
import com.example.hggg.model.AddOnClick

class AppliancesAdapter(private val listener: AddOnClick) : RecyclerView.Adapter<AppliancesAdapter.ViewHolder>() {

    private var data: List<SimpleDataModel> = emptyList()

    fun addData(newData: List<SimpleDataModel>) {
        this.data = newData
        notifyDataSetChanged()
    }


    class ViewHolder(var binding: ItemAppliancesBinding,private val listener: AddOnClick) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: SimpleDataModel) {
            binding.name.text = item.name
            binding.phone.text = item.phone
            binding.price.text = item.price
            binding.adress.text = item.address
            Glide.with(binding.root.context)
                .load(item.images.split(",")[0])
                .into(binding.imageView)
            binding.root.setOnClickListener {
                listener.onClick(item)
            }



        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppliancesAdapter.ViewHolder {
        val binding = ItemAppliancesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AppliancesAdapter.ViewHolder(binding, listener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount() = data.size
    }

