/*
 * Copyright (C) 2021 Rick Busarow
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
  androidLibrary
  id("com.vanniktech.maven.publish")
  id("org.jetbrains.dokka")
}

dependencies {

  api(libs.androidx.test.espresso.idlingResource)
  api(libs.junit.junit4)
  api(libs.kotlinx.coroutines.core)
  api(libs.kotlinx.coroutines.jvm)

  api(projects.dispatchCore)

  implementation(libs.kotlinx.coroutines.android)

  testImplementation(libs.kotest.assertions)
  testImplementation(libs.kotest.runner)
  testImplementation(libs.mockk)
  testImplementation(libs.robolectric)

  testImplementation(projects.dispatchAndroidLifecycleExtensions)
  testImplementation(projects.dispatchAndroidViewmodel)
  testImplementation(projects.dispatchInternalTest)
}
