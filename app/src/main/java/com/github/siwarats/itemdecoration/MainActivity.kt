package com.github.siwarats.itemdecoration

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.github.siwarats.itemdecoration.stickyheader.StickyHeaderItemDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val objects = arrayListOf<Any>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (header in 0..100) {
            objects.add("Header - $header")
            for (item in 1..3) {
                objects.add(item)
            }
        }

        rcvMain?.adapter = MainAdapter(objects)
        rcvMain?.layoutManager = LinearLayoutManager(this)
        rcvMain?.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        rcvMain?.addItemDecoration(StickyHeaderItemDecoration())
    }
}
