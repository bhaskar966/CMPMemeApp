package com.bhaskar.cmpmemeapp.meme_editor.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn

class MemeEditorViewModel: ViewModel() {

    private var hasLoadedInitialData = false

    private val _state = MutableStateFlow(MemeEditorState())
    val state = _state
        .onStart {
            if(!hasLoadedInitialData){
                hasLoadedInitialData = true
            }
        }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000L),
            initialValue = MemeEditorState()
        )


    fun onAction(action: MemeEditorAction){
        when(action){
            MemeEditorAction.OnAddTextClick -> TODO()
            MemeEditorAction.OnConfirmLeaveWithOutSaving -> TODO()
            is MemeEditorAction.OnContainerSizeChange -> TODO()
            is MemeEditorAction.OnDeleteMemeTextClick -> TODO()
            MemeEditorAction.OnDismissLeaveWithoutSaving -> TODO()
            is MemeEditorAction.OnEditMemeText -> TODO()
            MemeEditorAction.OnGobackClick -> TODO()
            is MemeEditorAction.OnMemeTextChange -> TODO()
            is MemeEditorAction.OnMemeTextTransformChange -> TODO()
            is MemeEditorAction.OnSaveMemeClick -> TODO()
            is MemeEditorAction.OnSelectedMemeText -> TODO()
            MemeEditorAction.OnTapOutsideSelectedText -> TODO()
        }
    }
}