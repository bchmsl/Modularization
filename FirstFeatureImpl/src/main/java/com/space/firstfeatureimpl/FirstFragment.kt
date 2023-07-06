package com.space.firstfeatureimpl

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.space.firstfeature.databinding.FragmentFirstBinding
import org.koin.androidx.viewmodel.ext.android.viewModelForClass

class FirstFragment : Fragment() {
    private val vm: FirstViewModel by viewModelForClass(FirstViewModel::class)
    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btn.setOnClickListener {
            vm.navigate(binding.et.text.toString())
        }
    }

    override fun onResume() {
        super.onResume()
        binding.et.setText(vm.getSecondScore().toString())
    }
}