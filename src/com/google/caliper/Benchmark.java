/*
 * Copyright (C) 2009 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.caliper;

public abstract class Benchmark {

  /**
   * Runs the benchmark through {@code trials} iterations.
   *
   * @return any object or null. Benchmark implementors may keep an accumulating
   *      value to prevent the runtime from optimizing away the code under test.
   *      Such an accumulator value can be returned here.
   */
  public abstract Object run(int trials) throws Exception;

  @Override public String toString() {
    return getClass().getSimpleName();
  }
}
