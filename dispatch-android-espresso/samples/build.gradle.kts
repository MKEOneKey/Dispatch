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
}

dependencies {
  implementation(libs.kotlinx.coroutines.jvm)

  implementation(projects.dispatchCore)

  testImplementation(libs.androidx.test.espresso.core)
  testImplementation(libs.androidx.test.runner)
  testImplementation(libs.junit.junit4)
  testImplementation(libs.kotest.assertions)
  testImplementation(libs.kotest.properties)
  testImplementation(libs.kotest.runner)
  testImplementation(libs.kotlin.test.common)
  testImplementation(libs.kotlin.test.core)
  testImplementation(libs.kotlinx.coroutines.core)
  testImplementation(libs.kotlinx.coroutines.test)
  testImplementation(libs.robolectric)

  testImplementation(projects.dispatchAndroidEspresso)
  testImplementation(projects.dispatchAndroidLifecycleExtensions)
  testImplementation(projects.dispatchAndroidViewmodel)
  testImplementation(projects.dispatchInternalTest)
}
