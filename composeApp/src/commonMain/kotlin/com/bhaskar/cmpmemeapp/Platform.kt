package com.bhaskar.cmpmemeapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform