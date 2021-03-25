package com.muhammaduzaer.favfoodcollection.fragments.home.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.muhammaduzaer.favfoodcollection.R
import com.muhammaduzaer.favfoodcollection.databinding.FragmentHomeBinding
import com.muhammaduzaer.favfoodcollection.fragments.base.BottomBaseFragment
import com.muhammaduzaer.favfoodcollection.fragments.home.viewmodel.HomeViewModel
import java.util.*


class HomeFragment : BottomBaseFragment() {

    private lateinit var bindingHomeFragment: FragmentHomeBinding
    private lateinit var homeViewModel: HomeViewModel

        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

            homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
            val root = inflater.inflate(R.layout.fragment_home, container, false)
            val textView: TextView = root.findViewById(R.id.textViewHome)
            homeViewModel.text.observe(viewLifecycleOwner, {
                textView.text = it
            })

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as? AppCompatActivity)?.window?.statusBarColor =
            ContextCompat.getColor(requireContext(), R.color.white)
    }


}