package com.space.modularization

import com.space.firstfeature.FirstViewModel
import com.space.navigationapi.AppNavigation
import com.space.secondfeatureapi.SecondFragmentNavigator
import com.space.secondfeatureimpl.SecondFragmentNavigatorImpl
import org.koin.dsl.module

val module = module {
    single<SecondFragmentNavigator> { SecondFragmentNavigatorImpl(get()) }
    single<AppNavigation> { AppNavigationImpl(get()) }
    single{FirstViewModel(get())}
}
