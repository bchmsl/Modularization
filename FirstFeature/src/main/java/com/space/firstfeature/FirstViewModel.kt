package com.space.firstfeature

import androidx.lifecycle.ViewModel
import com.space.secondfeatureapi.SecondFragmentNavigator

class FirstViewModel(private val secondFragmentNavigator: SecondFragmentNavigator):ViewModel() {
    fun navigate(){
        secondFragmentNavigator.navigateToSecondFragment(""){""}
    }
}