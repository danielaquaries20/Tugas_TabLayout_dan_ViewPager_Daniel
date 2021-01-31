package com.example.tugastablayoutdanviewpagerdaniel.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tugastablayoutdanviewpagerdaniel.ui.fragment.CarFragment
import com.example.tugastablayoutdanviewpagerdaniel.ui.fragment.KulinerFragment

class TabAdapter(fm: FragmentManager) : FragmentPagerAdapter(
    fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    private val pages = listOf(
        CarFragment(),
        KulinerFragment()
    )

    override fun getCount(): Int {
        return pages.size
    }

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 ->"Mobil"
            1 ->"Kuliner"
            else->"No Data"
        }
    }
}