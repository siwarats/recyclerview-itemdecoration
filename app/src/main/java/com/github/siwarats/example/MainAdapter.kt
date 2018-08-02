package com.github.siwarats.example

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.siwarats.itemdecoration.stickyheader.StickyViewHolder
import kotlinx.android.synthetic.main.listitem_item.view.*

class MainAdapter(private val objects: ArrayList<Any>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = objects[position]
        if (holder is HeaderViewHolder && item is String) {
            holder.tv?.text = item
        } else if (holder is ViewHolder && item is Int) {
            holder.tv?.text = "$item"
        }
    }

    override fun getItemCount() = objects.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == 0) {
            HeaderViewHolder(LayoutInflater.from(parent.context)
                    .inflate(R.layout.listitem_header, parent, false))
        } else {
            ViewHolder(LayoutInflater.from(parent.context)
                    .inflate(R.layout.listitem_item, parent, false))
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (objects[position] is Int) 1 else 0
    }

    inner class HeaderViewHolder(v: View) : StickyViewHolder(v) {
        val tv = v.tv
    }

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val tv = v.tv
    }
}