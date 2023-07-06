package com.space.modularization

import com.space.firstfeatureimpl.FirstViewModel
import com.space.navigationapi.AppNavigation
import com.space.secondfeatureapi.SecondFragmentNavigator
import com.space.secondfeatureapi.SecondFragmentScore
import com.space.secondfeatureimpl.SecondFeatureRepository
import com.space.secondfeatureimpl.SecondFragmentNavigatorImpl
import com.space.secondfeatureimpl.SecondFragmentScoreImpl
import com.space.secondfeatureimpl.SecondViewModel
import org.koin.dsl.module

val module = module {
    single<SecondFragmentNavigator> { SecondFragmentNavigatorImpl(get()) }
    single<AppNavigation> { AppNavigationImpl(get()) }
    single { FirstViewModel(get(), get()) }
    single { SecondFeatureRepository() }
    single<SecondFragmentScore> { SecondFragmentScoreImpl(get()) }
    single { SecondViewModel(get()) }
}