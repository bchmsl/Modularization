package com.space.secondfeatureimpl

import com.space.navigationapi.AppNavigation
import com.space.secondfeatureapi.SecondFragmentNavigator

class SecondFragmentNavigatorImpl(private val appNavigator: AppNavigation): SecondFragmentNavigator {
    override fun navigateToSecondFragment(argument: String, callback: () -> String) {
        appNavigator.navigateFirstFeatureToSecondFeature()
    }

    override fun navigateUp() {
        appNavigator.navigateUp()
    }
}