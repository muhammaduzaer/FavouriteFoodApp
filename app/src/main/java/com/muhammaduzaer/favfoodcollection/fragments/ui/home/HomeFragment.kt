package com.muhammaduzaer.favfoodcollection.fragments.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.muhammaduzaer.favfoodcollection.R
import com.muhammaduzaer.favfoodcollection.databinding.FragmentHomeBinding
import com.muhammaduzaer.favfoodcollection.fragments.base.BottomBaseFragment


class HomeFragment : BottomBaseFragment() {

    private lateinit var bindingHomeFragment: FragmentHomeBinding

        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindingHomeFragment = FragmentHomeBinding.bind(view)


        val crashButton = bindingHomeFragment.buttonToCrash

        crashButton.setOnClickListener {
            throw RuntimeException("Test Crash") // Force a crash
        }
    }


}