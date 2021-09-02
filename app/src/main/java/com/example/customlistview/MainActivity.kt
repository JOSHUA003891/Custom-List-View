package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView=findViewById<ListView>(R.id.custom_Listview)
        var list= mutableListOf<Model>()

       //adding images
       list.add(Model("Facebook","facebook description",R.drawable.fb))
        list.add(Model("Whatsapp","whatsapp description", R.drawable.watsapp))
        list.add(Model("Youtube","Youtube description",R.drawable.youtube))
        list.add(Model("Twitter","Twitter description",R.drawable.twitter))
        list.add(Model("Instagram","Instagram description",R.drawable.ig))
        list.add(Model("Google","Google description",R.drawable.google))

        listView.adapter=MyAdapter(mCtx = this,R.layout.row,list)

        listView.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->
            if (position==0){
                Toast.makeText(this@MainActivity,"You Have Clicked On Facebook!",Toast.LENGTH_SHORT).show()
            }
            if (position==1){
                Toast.makeText(this@MainActivity,"You Have Clicked On Whatsapp!",Toast.LENGTH_SHORT).show()
            }
            if (position==2){
                Toast.makeText(this@MainActivity,"You Have Clicked On Youtube!",Toast.LENGTH_SHORT).show()
            }
            if (position==3){
                Toast.makeText(this@MainActivity,"You Have Clicked On Twitter!",Toast.LENGTH_SHORT).show()
            }
            if (position==4){
                Toast.makeText(this@MainActivity,"You Have Clicked On Instagram!",Toast.LENGTH_SHORT).show()
            }
            if (position==5){
                Toast.makeText(this@MainActivity,"You Have Clicked On Google!",Toast.LENGTH_SHORT).show()
            }
        }


    }
}