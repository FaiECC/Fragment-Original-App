package sk3a_2190180.fragmentwork06.onboarding.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.fragment_frist_screen.view.*
import kotlinx.android.synthetic.main.fragment_frist_screen.view.nextBtn
import kotlinx.android.synthetic.main.fragment_second_screen.view.*
import sk3a_2190180.fragmentwork06.R

class FristScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_frist_screen, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        view.nextBtn.setOnClickListener{
            viewPager?.currentItem = 1
        }
        return view
    }
}