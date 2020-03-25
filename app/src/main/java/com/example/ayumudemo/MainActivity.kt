package com.example.ayumudemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ayumudemo.MyAdapter.OnItemClickListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager


    var myTextList: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addList()

        viewManager = LinearLayoutManager(this)
        viewAdapter = MyAdapter(myTextList)
        val adapter = MyAdapter(myTextList)

//        viewManager = LinearLayoutManager(this)
//        viewAdapter = MyAdapter(myTextList)

        recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view).apply {

            setHasFixedSize(true)

            layoutManager = viewManager


        }


        recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view).apply {
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            setHasFixedSize(true)
            // use a linear layout manager
            layoutManager = viewManager
            // specify an viewAdapter (see also next example)
            //adapter = viewAdapter
            my_recycler_view.layoutManager = layoutManager
            my_recycler_view.adapter = adapter
            my_recycler_view.setHasFixedSize(true)




            adapter.setOnItemClickListener(object : OnItemClickListener {
                override fun onItemClickListener(view: View, position: Int, clickedText: String) {
                    //val intent = Intent(this@MainActivity, MapsActivity::class.java)
                    //生成したオブジェクトを引数に画面を起動！
                    //startActivity(intent)
                    //Log.d("$clickedText", "です")
                    if ("$clickedText" == "Slider") {
                        val intent = Intent(this@MainActivity, PickerActivity::class.java)
                        startActivity(intent)
                    }
                    if ("$clickedText" == "Map View") {
                        val intent = Intent(this@MainActivity, MapActivity::class.java)
                        startActivity(intent)
                    }
                    if ("$clickedText" == "Play Video") {
                        val intent = Intent(this@MainActivity, VideoActivity::class.java)
                        startActivity(intent)
                    }
                    if ("$clickedText" == "Web View") {
                        val intent = Intent(this@MainActivity, WebViewActivity::class.java)
                        startActivity(intent)
                    }
                    if ("$clickedText" == "View Pager") {
                        val intent = Intent(this@MainActivity, PagerActivity::class.java)
                        startActivity(intent)
                    }

                    if ("$clickedText" == "Form") {
                        val intent = Intent(this@MainActivity, FormActivity::class.java)
                        startActivity(intent)
                    }
                }
            })

        }
    }


    fun addList() {
        myTextList.add("Slider")
        myTextList.add("Map View")
        myTextList.add("Play Video")
        myTextList.add("Web View")
        myTextList.add("View Pager")
        myTextList.add("Form")

    }

}
