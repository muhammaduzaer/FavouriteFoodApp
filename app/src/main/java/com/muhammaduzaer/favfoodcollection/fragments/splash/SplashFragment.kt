package com.muhammaduzaer.favfoodcollection.fragments.splash

import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.*
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.muhammaduzaer.favfoodcollection.R
import com.muhammaduzaer.favfoodcollection.databinding.FragmentSplashBinding
import com.muhammaduzaer.favfoodcollection.fragments.base.NonBottomBaseFragment


class SplashFragment : NonBottomBaseFragment() {

    lateinit var bindingSplash: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as? AppCompatActivity)?.window?.statusBarColor =
                ContextCompat.getColor(requireContext(), R.color.primaryDarkColor)

        bindingSplash = FragmentSplashBinding.bind(view)

        val splashAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.anim_splash)

        bindingSplash.textViewAppName.animation = splashAnimation

        splashAnimation.setAnimationListener(object: Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {
                //
            }

            override fun onAnimationEnd(animation: Animation?) {
                Handler(Looper.getMainLooper()).postDelayed({
                    navController.navigate(R.id.action_splashFragment_to_homeFragment)
                }, 1000)
            }

            override fun onAnimationRepeat(animation: Animation?) {
                //
            }

        })
    }

//    override fun onResume() {
//        super.onResume()
//        CoroutineScope(Dispatchers.Main).launch {
//            delay(2000)
//            navController.navigate(R.id.action_splashFragment_to_homeFragment)
//        }
//    }

}