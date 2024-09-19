package com.nkee.daggerhilt

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nkee.daggerhilt.domain.repository.MyRepository
import dagger.Lazy
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: Lazy<MyRepository>
) : ViewModel() {
    init {
        viewModelScope.launch { repository.get().doNetCall() }
    }
}