/*
 * Copyright 2018 Confluent Inc.
 *
 * Licensed under the Confluent Community License (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 *
 * http://www.confluent.io/confluent-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.confluent.connect.jdbc.util;

import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.errors.SchemaBuilderException;

public abstract class SchemaBuilderUtils {

  public static SchemaBuilder defaultValue(SchemaBuilder builder, Object defaultValue) {
    try {
      return builder.defaultValue(defaultValue);
    } catch (SchemaBuilderException ignored) {
      return builder;
    }
  }
}
