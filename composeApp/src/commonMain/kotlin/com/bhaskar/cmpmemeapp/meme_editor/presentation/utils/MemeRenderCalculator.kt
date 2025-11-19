package com.bhaskar.cmpmemeapp.meme_editor.presentation.utils

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.unit.IntSize
import com.bhaskar.cmpmemeapp.meme_editor.presentation.MemeText
import kotlin.math.roundToInt

class MemeRenderCalculator(
    private val density: Float
) {

    companion object {
        private const val TEXT_PADDING_DP = 8f
        private const val STROKE_PADDING_DP = 3f
    }

    fun calculateScaleFactors(
        bitmapWidth: Int,
        bitmapHeight: Int,
        templateSize: IntSize,
    ): ScaleFactors {
        val scaleX = if(templateSize.width > 0) bitmapWidth.toFloat() / templateSize.width else 1f
        val scaleY = if(templateSize.height > 0) bitmapHeight.toFloat() / templateSize.height else 1f

        val bitmapScale = (scaleX + scaleY) / 2

        return ScaleFactors(
            scaleX = scaleX,
            scaleY = scaleY,
            bitmapScale = bitmapScale
        )
    }

    fun calculateScaledMemeText(
        memeText: MemeText,
        scaledFactors: ScaleFactors,
        templateSize: IntSize
    ): ScaledMemeText {
        val (scaleX, scaleY, bitmapScale) = scaledFactors

        val scaledOffset = Offset(
            x = (memeText.offsetRatioX * templateSize.width) * scaleX,
            y = (memeText.offsetRatioY * templateSize.height) * scaleY
        )

        val textPaddingPx = TEXT_PADDING_DP * density
        val textPaddingBitmapX = textPaddingPx * scaleX
        val textPaddingBitmapY = textPaddingPx * scaleY

        val scaledFontSize = memeText.fontSize * bitmapScale

        val strokeWidth = STROKE_PADDING_DP * density

        val paddingDp = TEXT_PADDING_DP * 2
        val paddingPx = paddingDp * density
        val constrainWidth = ((templateSize.width / memeText.scale) * scaleX - paddingPx * scaleX)
            .roundToInt()
            .coerceAtLeast(1)

        return ScaledMemeText(
            text = memeText.text,
            scaledOffset = scaledOffset,
            scaledFontSizePx = scaledFontSize.toPx(),
            strokeWidth = strokeWidth,
            constraintWidth = constrainWidth,
            textPaddingX = textPaddingBitmapX,
            textPaddingY = textPaddingBitmapY,
            rotation = memeText.rotation,
            scale = memeText.scale,
            originalText = memeText
        )

    }

}

data class ScaleFactors(
    val scaleX: Float,
    val scaleY: Float,
    val bitmapScale: Float
)