package com.space.firstfeatureimpl

import android.os.Bundle
import androidx.lifecycle.ViewModel
import com.space.secondfeatureapi.SecondFragmentNavigator
import com.space.secondfeatureapi.SecondFragmentScore

class FirstViewModel(private val secondFragmentNavigator: SecondFragmentNavigator, private val secondFragmentScore: SecondFragmentScore):ViewModel() {
    fun navigate(argument: String){
        val bundle = Bundle()
        bundle.putString("argument", argument)
        secondFragmentNavigator.navigateToSecondFragment(bundle)
    }

    fun getSecondScore(): Int? {
        return secondFragmentScore.getScore()
    }
}