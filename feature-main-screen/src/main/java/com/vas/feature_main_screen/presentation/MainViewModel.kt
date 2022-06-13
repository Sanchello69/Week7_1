package com.vas.feature_main_screen.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.vas.core.utils.Resource
import com.vas.feature_main_screen.domain.useCase.GetHeroesListUseCase
import kotlinx.coroutines.Dispatchers

class MainViewModel(private val getHeroesListUseCase: GetHeroesListUseCase) : ViewModel() {

    val heroesList = getHeroesListUseCase.execute()

}