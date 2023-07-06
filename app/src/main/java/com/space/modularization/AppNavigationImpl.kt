package com.space.modularization

import android.os.Bundle
import androidx.navigation.NavController
import com.space.navigationapi.AppNavigation

class AppNavigationImpl(private val navController: NavController): AppNavigation {
    override fun navigateFirstFeatureToSecondFeature(arg: Bundle) {
        navController.navigate(R.id.action_firstFragment_to_secondFragment)
    }

    override fun navigateUp() {
        navController.navigateUp()
    }
}