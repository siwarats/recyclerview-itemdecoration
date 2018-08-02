package com.github.siwarats.example.main

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.github.siwarats.example.R
import com.github.siwarats.example.sticky.StickyActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val menus = arrayListOf(
            "StickyHeaderItemDecoration"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcvMain?.adapter = MainAdapter(menus)
                .apply {
                    onItemClick = {
                        when (it) {
                            0 -> Intent(this@MainActivity, StickyActivity::class.java)
                                    .also { startActivity(it) }
                        }
                    }
                }
        rcvMain?.layoutManager = LinearLayoutManager(this)
        rcvMain?.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }
}
