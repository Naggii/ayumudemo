package com.example.ayumudemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ayumudemo.R.layout.list_item as list_item

class MyAdapter(private val myTextList: ArrayList<String>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    private lateinit var listener: OnItemClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
        val textView = LayoutInflater.from(parent.context)
            .inflate(list_item, parent, false) as TextView
        return ViewHolder(textView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = myTextList[position]
        holder.textView.setOnClickListener {
            listener.onItemClickListener(it, position, myTextList[position])
        }
    }

    override fun getItemCount() = myTextList.size

    //interface
    interface OnItemClickListener {
        fun onItemClickListener(view: View, position: Int, clickedText: String)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }


}



