/**
 * Copyright © 2026-2026 ThingsBoard, Inc.
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
package org.thingsboard.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ApiUsageRecordKey
 */
public enum ApiUsageRecordKey {
  
  TRANSPORT_MSG_COUNT("TRANSPORT_MSG_COUNT"),
  
  TRANSPORT_DP_COUNT("TRANSPORT_DP_COUNT"),
  
  STORAGE_DP_COUNT("STORAGE_DP_COUNT"),
  
  RE_EXEC_COUNT("RE_EXEC_COUNT"),
  
  JS_EXEC_COUNT("JS_EXEC_COUNT"),
  
  TBEL_EXEC_COUNT("TBEL_EXEC_COUNT"),
  
  EMAIL_EXEC_COUNT("EMAIL_EXEC_COUNT"),
  
  SMS_EXEC_COUNT("SMS_EXEC_COUNT"),
  
  CREATED_ALARMS_COUNT("CREATED_ALARMS_COUNT"),
  
  ACTIVE_DEVICES("ACTIVE_DEVICES"),
  
  INACTIVE_DEVICES("INACTIVE_DEVICES"),
  
  GENERATED_REPORTS_COUNT("GENERATED_REPORTS_COUNT"),
  
  AI_CREDITS_COUNT("AI_CREDITS_COUNT");

  private String value;

  ApiUsageRecordKey(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ApiUsageRecordKey fromValue(String value) {
    for (ApiUsageRecordKey b : ApiUsageRecordKey.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format(java.util.Locale.ROOT, "%s=%s", prefix, this.toString());
  }

}

