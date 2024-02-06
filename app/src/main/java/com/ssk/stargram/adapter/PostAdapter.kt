package com.ssk.stargram.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ssk.stargram.databinding.MainImgBinding

class PostAdapter : RecyclerView.Adapter<PostAdapter.ViewHolder>() {

    inner class ViewHolder(var binding : MainImgBinding) : RecyclerView.ViewHolder(binding.root)

    init {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = MainImgBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}