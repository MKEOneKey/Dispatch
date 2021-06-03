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

@file:JvmName("Flow")

package dispatch.core

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

/**
 * Extracts the [DispatcherProvider] from the `coroutineContext` of the *collector* coroutine,
 * then uses its [DispatcherProvider.io] property to call `flowOn(theDispatcher)`,
 * and returns the result.
 *
 * @sample samples.FlowOnSample.flowOnIOSample
 * @see flowOn
 */
@ExperimentalCoroutinesApi
public fun <T> Flow<T>.flowOnIO(): Flow<T> = flow {
  flowOn(currentCoroutineContext().dispatcherProvider.io)
    .collect { emit(it) }
}
