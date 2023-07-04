package com.space.modularization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.space.modularization.databinding.ActivityMainBinding
import org.koin.android.ext.android.getKoin
import org.koin.dsl.module

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val activityModule = module {
            single<NavController> { findNavController(R.id.nav_host_fragment) }
        }
        getKoin().loadModules(listOf(activityModule))
    }
}