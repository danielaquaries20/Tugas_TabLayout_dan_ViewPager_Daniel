package com.example.tugastablayoutdanviewpagerdaniel.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugastablayoutdanviewpagerdaniel.R
import com.example.tugastablayoutdanviewpagerdaniel.adapter.TabAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager.adapter = TabAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(viewPager)
    }
}