package com.omgea.thakhinyargyifan.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {

    private val _event = MutableSharedFlow<NewsEvent>()
    val event get()= _event.asSharedFlow()

    fun onItemClick(index : String){
        viewModelScope.launch {
            _event.emit(NewsEvent.NewsItemClickEvent(index = index))
        }

    }
}