package com.bhaskar.cmpmemeapp.meme_editor.presentation

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.unit.IntSize
import com.bhaskar.cmpmemeapp.core.presentation.MemeTemplate

sealed interface MemeEditorAction {
    data object OnGobackClick: MemeEditorAction
    data object OnConfirmLeaveWithOutSaving: MemeEditorAction
    data object OnDismissLeaveWithoutSaving: MemeEditorAction

    data class OnSaveMemeClick(val memeTemplate: MemeTemplate): MemeEditorAction
    data object OnTapOutsideSelectedText: MemeEditorAction

    data object OnAddTextClick: MemeEditorAction
    data class OnSelectedMemeText(val id: String): MemeEditorAction
    data class OnEditMemeText(val id: String): MemeEditorAction
    data class OnMemeTextChange(val id: String, val text: String): MemeEditorAction
    data class OnDeleteMemeTextClick(val id: String): MemeEditorAction

    data class OnMemeTextTransformChange(
        val id: String,
        val offset: Offset,
        val rotation: Float,
        val scale: Float
    ): MemeEditorAction

    data class OnContainerSizeChange(val size: IntSize): MemeEditorAction

}