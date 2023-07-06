package com.space.secondfeatureapi

import android.os.Bundle

interface SecondFragmentNavigator {
    fun navigateToSecondFragment(argument: Bundle)
    fun navigateUp()
}


interface SecondFragmentScore{
    fun  getScore(): Int?
}