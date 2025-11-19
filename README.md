# CMP Meme Generator 📱🎨

A cross-platform mobile application for creating memes, built to demonstrate the power of **Kotlin Multiplatform (KMP)** and **Compose Multiplatform (CMP)**.

This project allows users to select templates, add customizable text, drag/rotate/resize elements, and export the final result to their device's gallery. It targets **Android**, **iOS**, and **Desktop (JVM)** from a single codebase.

## 🚀 Features

*   **Cross-Platform UI:** 100% shared UI code between Android, iOS, and Desktop using Compose Multiplatform.
*   **Meme Editor:**
    *   Add multiple text boxes.
    *   Drag, scale, and rotate text with gestures.
    *   Double-tap to edit text content.
    *   "Impact" font styling (white fill with black stroke).
*   **Exporting:**
    *   Platform-specific implementations to render the Compose UI to an image file (Bitmap/UIImage).
    *   Saves directly to the device gallery/filesystem.
    *   Share sheet integration.

## 🛠️ Tech Stack

*   **Language:** [Kotlin](https://kotlinlang.org/)
*   **UI Framework:** [Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/) (Jetpack Compose)
*   **Architecture:** MVI (Model-View-Intent)
*   **Dependency Injection:** [Koin](https://insert-koin.io/)
*   **Image Loading:** Resource loading via Compose Multiplatform Resources.
*   **State Management:** Kotlin Coroutines & StateFlow.

## 📂 Project Structure

*   **`composeApp`**: The main module containing shared code.
    *   `commonMain`: Shared business logic, UI components, ViewModels, and domain models.
    *   `androidMain`: Android-specific implementations (e.g., file saving, intents).
    *   `iosMain`: iOS-specific implementations (e.g., `UIImage` rendering, interaction with UIKit).
    *   `jvmMain`: Desktop-specific implementations. (not yet implemented)
*   **`iosApp`**: The entry point for the iOS application (Xcode project wrapper).


## 🎓 Learning Resources & Credit

This project is a learning initiative based on the excellent tutorial by **Philipp Lackner**. It serves as a practical example of handling platform-specific APIs (like graphics rendering) within a unified KMP architecture.

*   **Original Tutorial:** [Build a Compose Multiplatform Meme Creator App With Clean Code & MVI - Philipp Lackner](https://youtu.be/dveR4xWid4Q?si=hT9XKbdAntpb-j1r)
*   **Compose Multiplatform:** [Official Documentation](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-create-first-app.html)

## 📄 License

This project is for educational purposes.
