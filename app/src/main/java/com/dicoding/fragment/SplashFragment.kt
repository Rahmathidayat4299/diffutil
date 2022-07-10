package com.dicoding.fragment

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.dicoding.githubseconds.R
import com.dicoding.util.ConstValue.SPLASH_SEC


class SplashFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Handler(Looper.myLooper()!!).postDelayed({
            lifecycleScope.launchWhenResumed {
                findNavController().navigate(R.id.action_splashFragment_to_listUserFragment)
            }
        }, SPLASH_SEC)
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }


}