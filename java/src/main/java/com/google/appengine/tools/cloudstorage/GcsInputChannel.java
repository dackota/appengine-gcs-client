/*
 * Copyright 2013 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.appengine.tools.cloudstorage;

import java.io.Serializable;
import java.nio.channels.ReadableByteChannel;

/**
 * A readable byte channel for reading data to Google Cloud Storage.
 *
 *  Implementations of this class may buffer data internally to reduce remote calls.
 *
 *  This class is @{link Serializable}, which allows for reading part of a file, serializing the
 * GcsInputChannel deserializing it, and continuing to read from the same file from the same
 * position.
 */
public interface GcsInputChannel extends ReadableByteChannel, Serializable {

  /**
   * Overridden to remove IOException.
   *
   * @see java.nio.channels.Channel#close()
   */
  @Override
  void close();
}
