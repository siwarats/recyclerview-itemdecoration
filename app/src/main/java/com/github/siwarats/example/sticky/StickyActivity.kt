package com.github.siwarats.example.sticky

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.github.siwarats.example.R
import com.github.siwarats.itemdecoration.stickyheader.StickyHeaderItemDecoration
import kotlinx.android.synthetic.main.activity_sticky.*

class StickyActivity : AppCompatActivity() {

    //Adapter Items
    private val objects = arrayListOf<Any>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sticky)

        //Mock data
        for (header in 0..100) {
            objects.add("Header - $header")
            for (item in 1..3) {
                objects.add(item)
            }
        }

        //Setup RecyclerView
        rcvSticky?.adapter = StickyAdapter(objects)
        rcvSticky?.layoutManager = LinearLayoutManager(this)
        rcvSticky?.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        rcvSticky?.addItemDecoration(StickyHeaderItemDecoration())
    }
}
