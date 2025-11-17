package com.bhaskar.cmpmemeapp.core.presentation

import cmpmemeapp.composeapp.generated.resources.Res
import cmpmemeapp.composeapp.generated.resources.allDrawableResources
import org.jetbrains.compose.resources.DrawableResource

data class MemeTemplate(
    val id: String,
    val drawable: DrawableResource
)

val memeTemplates = Res
    .allDrawableResources
    .filterKeys { it.startsWith("Meme_".lowercase()) }
    .map { ( key, value )->
        MemeTemplate(
            id = key,
            drawable = value
        )
    }
