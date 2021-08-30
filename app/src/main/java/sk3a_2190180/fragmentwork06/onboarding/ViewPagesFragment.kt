package sk3a_2190180.fragmentwork06.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_view_pages.view.*
import sk3a_2190180.fragmentwork06.R
import sk3a_2190180.fragmentwork06.onboarding.screen.FristScreen
import sk3a_2190180.fragmentwork06.onboarding.screen.SecondScreen
import sk3a_2190180.fragmentwork06.onboarding.screen.ThirdScreen

class ViewPagesFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pages, container, false)

        val fragmentList = arrayListOf<Fragment>(FristScreen(), SecondScreen())

        val adapter = ViewPagerAdapter(fragmentList,requireActivity().supportFragmentManager,lifecycle)

        view.viewPager.adapter = adapter
        return view
    }

}