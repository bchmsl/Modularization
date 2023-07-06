package com.space.secondfeatureimpl

import androidx.lifecycle.ViewModel

class SecondViewModel(
    private val secondFeatureRepository: SecondFeatureRepository
) : ViewModel() {
    fun saveScore(score: Int) {
        secondFeatureRepository.saveUserScore(score)
    }
}