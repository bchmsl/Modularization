package com.space.secondfeatureimpl

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.space.secondfeatureapi.SecondFragmentNavigator
import com.space.secondfeatureimpl.databinding.FragmentSecondBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModelForClass

class SecondFragment : Fragment() {
    private val secondFragmentNavigator by inject<SecondFragmentNavigator>()
    private val vm: SecondViewModel by viewModelForClass(SecondViewModel::class)
    private val args = arguments
    private lateinit var binding: FragmentSecondBinding
    val flow = MutableStateFlow(true)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = args?.getString("argument") ?: ""
        binding.et.setText(text)
        binding.btn.setOnClickListener {
            vm.saveScore(binding.et.text.toString().toInt())
            secondFragmentNavigator.navigateUp()
        }
    }

    fun collect(){

    }
}


