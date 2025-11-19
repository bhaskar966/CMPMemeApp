package com.bhaskar.cmpmemeapp.meme_editor.presentation.utils

import platform.Foundation.NSURL
import platform.UIKit.UIActivityViewController
import platform.UIKit.UIApplication

actual class PlatformShareSheet {
    actual fun shareFile(filePath: String) {

        val fileUrl = NSURL.fileURLWithPath(filePath)

        val itemsToShare = listOf(fileUrl)

        val activityViewCalculator = UIActivityViewController(
            activityItems = itemsToShare,
            applicationActivities = null
        )

        val rootViewController = UIApplication.sharedApplication.keyWindow?.rootViewController
            ?: throw IllegalStateException("Root view controller not found")

        rootViewController.presentViewController(
            viewControllerToPresent = activityViewCalculator,
            animated = true,
            completion = null
        )
    }
}