package com.space.modularization

import androidx.navigation.NavController
import com.space.navigationapi.AppNavigation

class AppNavigationImpl(private val navController: NavController): AppNavigation {
    override fun navigateFirstFeatureToSecondFeature() {
        navController.navigate(R.id.action_firstFragment_to_secondFragment)
    }
}