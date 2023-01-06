package com.runningapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.runningapp.db.Run
import com.runningapp.repositories.RunningRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val runningRepository: RunningRepository
) : ViewModel() {

    fun insertRun(run: Run) = viewModelScope.launch {
        runningRepository.insertRun(run)
    }
}