package com.bhaskar.cmpmemeapp.meme_editor.presentation.utils

import android.content.res.Resources
import android.util.TypedValue
import androidx.compose.ui.unit.TextUnit
import org.jetbrains.compose.resources.Resource

actual fun TextUnit.toPx(): Float {
    val metrics = Resources.getSystem().displayMetrics
    return TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_SP,
        this.value,
        metrics
    )
}