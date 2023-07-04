package com.space.secondfeatureimpl

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.space.secondfeatureapi.SecondFragmentNavigator
import com.space.secondfeatureimpl.databinding.FragmentSecondBinding
import org.koin.android.ext.android.inject

class SecondFragment : Fragment() {
    private val secondFragmentNavigator by inject<SecondFragmentNavigator>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        val binding = FragmentSecondBinding.inflate(inflater, container, false)
        binding.btn.setOnClickListener {
            secondFragmentNavigator.navigateUp()
        }
        return binding.root
    }

}