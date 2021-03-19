package com.muhammaduzaer.favfoodcollection.fragments.base

import android.os.Bundle
import android.view.View
import com.muhammaduzaer.favfoodcollection.MainActivity

open class NonBottomBaseFragment : BaseFragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(requireActivity()) {
            if (this is MainActivity) {
                this.hideIncludes()
            }
        }

    }
}