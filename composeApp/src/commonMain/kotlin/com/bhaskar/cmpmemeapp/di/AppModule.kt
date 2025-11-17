package com.bhaskar.cmpmemeapp.di

import com.bhaskar.cmpmemeapp.meme_editor.presentation.MemeEditorViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    viewModelOf(::MemeEditorViewModel)
}