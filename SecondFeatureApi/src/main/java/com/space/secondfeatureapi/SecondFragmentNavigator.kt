package com.space.secondfeatureapi

import androidx.annotation.IdRes
import androidx.navigation.NavDirections

interface SecondFragmentNavigator {
    fun navigateToSecondFragment(argument: String, callback: () -> String)
}