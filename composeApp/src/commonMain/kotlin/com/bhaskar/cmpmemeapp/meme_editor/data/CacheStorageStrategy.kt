package com.bhaskar.cmpmemeapp.meme_editor.data

import com.bhaskar.cmpmemeapp.meme_editor.domain.SaveToStorageStrategy

expect class CacheStorageStrategy: SaveToStorageStrategy {
    override fun getFilePath(fileName: String): String
}