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

@file:Suppress("EXPERIMENTAL_API_USAGE", "UNUSED_ANONYMOUS_PARAMETER")

package dispatch.android.lifecycle.samples

import androidx.fragment.app.Fragment
import dispatch.android.lifecycle.withViewLifecycleScope
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onEach
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(manifest = Config.NONE)
class WithViewLifecycleScopeExtensionSample {

  @Test
  fun withViewLifecycleScopeSample() {

    class MyViewModel {

      val dataFlow = flow<Data> {
        // ...
      }
    }

    class MyFragment : Fragment() {

      val myViewModel = MyViewModel()

      val observerJob = withViewLifecycleScope {
        myViewModel.dataFlow.onEach { data ->
          // ...
        }.launchOnCreate()
      }
    }
  }
}

interface Data
