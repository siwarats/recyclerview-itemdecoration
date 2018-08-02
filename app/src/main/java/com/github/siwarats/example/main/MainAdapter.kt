package com.github.siwarats.example.main

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class MainAdapter(private val items: MutableList<String>)
    : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    var onItemClick = { _: Int -> }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return LayoutInflater.from(parent.context)
                .inflate(android.R.layout.simple_list_item_1, parent, false)
                .let { ViewHolder(it) }
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        items[position].also { holder.text1?.text = it }
    }

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val text1 = v.findViewById<TextView?>(android.R.id.text1)

        init {
            v.setOnClickListener {
                adapterPosition.also {
                    if (it != RecyclerView.NO_POSITION) {
                        onItemClick(it)
                    }
                }
            }
        }
    }
}