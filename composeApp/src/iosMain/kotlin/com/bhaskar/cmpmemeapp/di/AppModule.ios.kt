package com.bhaskar.cmpmemeapp.di

import com.bhaskar.cmpmemeapp.meme_editor.data.CacheStorageStrategy
import com.bhaskar.cmpmemeapp.meme_editor.data.PlatformMemeExporter
import com.bhaskar.cmpmemeapp.meme_editor.domain.MemeExporter
import com.bhaskar.cmpmemeapp.meme_editor.domain.SaveToStorageStrategy
import com.bhaskar.cmpmemeapp.meme_editor.presentation.utils.PlatformShareSheet
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module

actual val platformAppModule = module {
    factoryOf(::PlatformMemeExporter) bind MemeExporter::class
    factoryOf(::CacheStorageStrategy) bind SaveToStorageStrategy::class
    factoryOf(::PlatformShareSheet)
}