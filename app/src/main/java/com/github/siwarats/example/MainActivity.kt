package com.github.siwarats.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.siwarats.itemdecoration.stickyheader.StickyHeaderItemDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Adapter Items
    private val objects = arrayListOf<Any>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Mock data
        for (header in 0..100) {
            objects.add("Header - $header")
            for (item in 1..3) {
                objects.add(item)
            }
        }

        //Setup RecyclerView
        rcvMain?.adapter = MainAdapter(objects)
        rcvMain?.layoutManager = LinearLayoutManager(this)
        rcvMain?.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        rcvMain?.addItemDecoration(StickyHeaderItemDecoration())
    }
}
