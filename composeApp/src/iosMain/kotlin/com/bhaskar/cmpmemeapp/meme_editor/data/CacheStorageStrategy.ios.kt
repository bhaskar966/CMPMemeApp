package com.bhaskar.cmpmemeapp.meme_editor.data

import com.bhaskar.cmpmemeapp.meme_editor.domain.SaveToStorageStrategy
import platform.Foundation.NSCachesDirectory
import platform.Foundation.NSSearchPathForDirectoriesInDomains
import platform.Foundation.NSUserDomainMask

actual class CacheStorageStrategy : SaveToStorageStrategy {
    actual override fun getFilePath(fileName: String): String {
        val cacheDir = NSSearchPathForDirectoriesInDomains(
            NSCachesDirectory,
            NSUserDomainMask,
            true
        ).firstOrNull() as? String ?: throw IllegalStateException("Cant not find cache directory")

        return "$cacheDir/$fileName"
    }
}