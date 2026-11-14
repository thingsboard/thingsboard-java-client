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
 * Gets or Sets HousekeeperTaskType
 */
public enum HousekeeperTaskType {
  
  DELETE_ATTRIBUTES("DELETE_ATTRIBUTES"),
  
  DELETE_TELEMETRY("DELETE_TELEMETRY"),
  
  DELETE_LATEST_TS("DELETE_LATEST_TS"),
  
  DELETE_TS_HISTORY("DELETE_TS_HISTORY"),
  
  DELETE_EVENTS("DELETE_EVENTS"),
  
  DELETE_ALARMS("DELETE_ALARMS"),
  
  DELETE_ALARM_COMMENTS("DELETE_ALARM_COMMENTS"),
  
  UNASSIGN_ALARMS("UNASSIGN_ALARMS"),
  
  DELETE_TENANT_ENTITIES("DELETE_TENANT_ENTITIES"),
  
  DELETE_ENTITIES("DELETE_ENTITIES"),
  
  CLEANUP_ENTITIES("CLEANUP_ENTITIES"),
  
  DELETE_CALCULATED_FIELDS("DELETE_CALCULATED_FIELDS"),
  
  DELETE_JOBS("DELETE_JOBS"),
  
  DELETE_AI_USER_DATA("DELETE_AI_USER_DATA"),
  
  DELETE_AI_TENANT_DATA("DELETE_AI_TENANT_DATA");

  private String value;

  HousekeeperTaskType(String value) {
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
  public static HousekeeperTaskType fromValue(String value) {
    for (HousekeeperTaskType b : HousekeeperTaskType.values()) {
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

