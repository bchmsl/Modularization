package com.space.secondfeatureimpl

import android.os.Bundle
import com.space.navigationapi.AppNavigation
import com.space.secondfeatureapi.SecondFragmentNavigator
import com.space.secondfeatureapi.SecondFragmentScore

class SecondFragmentNavigatorImpl(private val appNavigator: AppNavigation): SecondFragmentNavigator {
    override fun navigateToSecondFragment(argument: Bundle) {
        appNavigator.navigateFirstFeatureToSecondFeature(argument)
    }

    override fun navigateUp() {
        appNavigator.navigateUp()
    }
}





class SecondFragmentScoreImpl(private val secondFeatureRepository: SecondFeatureRepository): SecondFragmentScore{
    override fun getScore(): Int? {
        return secondFeatureRepository.getUserScore()
    }
}