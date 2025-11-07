// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // This line tells Gradle where to find the Android Application plugin and its version.
    // The 'apply false' means it's available for modules to use, but isn't applied to the root project itself.
    id("com.android.application") version "8.2.0" apply false

    // Do the same for the Kotlin Android plugin
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}
// Root build file
