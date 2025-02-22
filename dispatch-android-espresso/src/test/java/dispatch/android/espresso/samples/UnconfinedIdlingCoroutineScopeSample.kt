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

package dispatch.android.espresso.samples

import dispatch.android.espresso.UnconfinedIdlingCoroutineScope
import dispatch.android.espresso.registerAllIdlingResources
import dispatch.internal.test.Sample
import kotlinx.coroutines.Job
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class UnconfinedIdlingCoroutineScopeSample {

  @Sample
  fun createNoArgUnconfinedIdlingCoroutineScope() {

    val scope = UnconfinedIdlingCoroutineScope()

    scope.idlingDispatcherProvider.registerAllIdlingResources()
  }

  @Sample
  fun createCustomUnconfinedIdlingCoroutineScope() {

    val scope = UnconfinedIdlingCoroutineScope(
      job = Job(),
      dispatcherProvider = SomeCustomIdlingDispatcherProvider()
    )

    scope.idlingDispatcherProvider.registerAllIdlingResources()
  }
}
