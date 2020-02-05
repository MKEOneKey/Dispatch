/*
 * Copyright (C) 2020 Rick Busarow
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
  id(Plugins.androidApplication)
  id(Plugins.kotlinAndroid)
  id(Plugins.kotlinAndroidExtensions)
}

buildscript {

  repositories {
    mavenCentral()
    google()
    jcenter()
    maven(url = "https://jitpack.io")
  }

}

android {
  compileSdkVersion(Versions.compileSdk)

  defaultConfig {
    minSdkVersion(Versions.minSdk)
    targetSdkVersion(Versions.targetSdk)
    versionCode = 1
    versionName = Versions.versionName

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
}

dependencies {

  implementation(Libs.Androidx.activity)
  implementation(Libs.Androidx.appcompat)
  implementation(Libs.Androidx.constraintLayout)
  implementation(Libs.Androidx.coreKtx)
  implementation(Libs.Androidx.lifecycle)
  implementation(Libs.Androidx.lifecycleExtensions)

  implementation(Libs.JakeWharton.timber)

  implementation(Libs.Kotlin.stdlib)

  implementation(Libs.Kotlinx.Coroutines.android)
  implementation(Libs.Kotlinx.Coroutines.core)

  implementation(project(":core"))
  implementation(project(":android-espresso"))
  implementation(project(":extensions"))
  implementation(project(":android-lifecycle-runtime"))
  implementation(project(":android-lifecycle-viewmodel"))

  testImplementation(Libs.JUnit.jUnit5)
  testImplementation(Libs.KotlinTest.junit5runner)
  testImplementation(Libs.Kotlinx.Coroutines.test)

  testImplementation(project(":core-test"))

  androidTestImplementation(Libs.Androidx.testRunner)
  androidTestImplementation(Libs.Androidx.espresso)
}
