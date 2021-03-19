package com.muhammaduzaer.favfoodcollection.fragments.ui.splash

import android.os.Build
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import com.muhammaduzaer.favfoodcollection.R
import com.muhammaduzaer.favfoodcollection.fragments.base.NonBottomBaseFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class SplashFragment : NonBottomBaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            (activity as? AppCompatActivity)?.window?.insetsController?.hide(WindowInsets.Type.statusBars())
        }

    }

    override fun onResume() {
        super.onResume()
        CoroutineScope(Dispatchers.Main).launch {
            delay(1500)
            navController.navigate(R.id.action_splashFragment_to_homeFragment)
        }
    }

}