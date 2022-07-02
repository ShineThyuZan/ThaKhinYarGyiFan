package com.omgea.thakhinyargyifan.ui

sealed class NewsEvent {
    data class NewsItemClickEvent(var index : String) : NewsEvent()
}
