package com.example.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var mCtx:Context,var resourses:Int,var items:List<Model>) :ArrayAdapter<Model>(mCtx,resourses,items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val loyoutInflater:LayoutInflater= LayoutInflater.from(mCtx)
        val view:View=loyoutInflater.inflate(resourses,null)

        val imageView:ImageView=view.findViewById(R.id.imageView)
        val titleTextView:TextView=view.findViewById(R.id.textview1)
        val descriptionTextView:TextView=view.findViewById(R.id.textview2)

        var mItem:Model=items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.img))
        titleTextView.text=mItem.title
        descriptionTextView.text=mItem.description

       return view
    }
}