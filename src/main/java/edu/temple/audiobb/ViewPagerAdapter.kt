package edu.temple.audiobb

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter : FragmentStateAdapter{

    lateinit var array_list : ArrayList<Fragment>

    class ViewPagerAdapter(val fm : FragmentManager, val lifecycle : Lifecycle)
    {
        super(fm, lifecycle)
    }

    fun addFragment(frag : Fragment)
    {
        array_list.add(frag)
    }

    override fun getItemCount()
    {
        return array_list.size()
    }

    override fun createFragment(position: Int): Fragment {
        return array_list.get(position)
    }

}