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

package dispatch.test

import dispatch.core.*

/**
 * Resets the singleton [DispatcherProvider] instance to the true default.
 * This default instance delegates to the [Dispatchers][kotlinx.coroutines.Dispatchers] singleton object properties.
 *
 * @see DefaultDispatcherProvider
 * @sample dispatch.test.samples.DefaultDispatcherProviderExtensionSample.defaultDispatcherProviderResetSample
 */
@Suppress("unused")
public fun DefaultDispatcherProvider.reset() {
  set(object : DispatcherProvider {})
}
