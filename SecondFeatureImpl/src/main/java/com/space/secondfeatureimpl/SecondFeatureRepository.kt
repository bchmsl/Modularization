package com.space.secondfeatureimpl

import androidx.lifecycle.MutableLiveData

class SecondFeatureRepository {
    var userScore = MutableLiveData(0)
    fun saveUserScore(score: Int){
        userScore.postValue(score)
    }
    fun getUserScore() = userScore.value
}