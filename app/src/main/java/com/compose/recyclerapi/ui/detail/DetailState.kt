package com.compose.recyclerapi.ui.detail

import com.compose.recyclerapi.domain.model.Character

data class DetailState(
    val character: Character? = null,
    val isLoading: Boolean = false
)