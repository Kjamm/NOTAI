plugins {
    id("iguana.android.library")
    id("iguana.android.compose")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.iguana.ui"
}

dependencies {
    implementation(libs.androidx.appcompat)
}