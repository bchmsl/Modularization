package com.space.secondfeatureapi

interface SecondFragmentNavigator {
    fun navigateToSecondFragment(argument: String, callback: () -> String)
    fun navigateUp()
}