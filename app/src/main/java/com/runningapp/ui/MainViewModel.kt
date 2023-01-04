package com.runningapp.ui

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.runningapp.repositories.RunningRepository

class MainViewModel @ViewModelInject constructor(
    private val runningRepository: RunningRepository
) : ViewModel() {
}