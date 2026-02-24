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
 * Gets or Sets NotificationType
 */
public enum NotificationType {
  
  GENERAL("GENERAL"),
  
  ALARM("ALARM"),
  
  DEVICE_ACTIVITY("DEVICE_ACTIVITY"),
  
  ENTITY_ACTION("ENTITY_ACTION"),
  
  ALARM_COMMENT("ALARM_COMMENT"),
  
  RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT("RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT"),
  
  ALARM_ASSIGNMENT("ALARM_ASSIGNMENT"),
  
  NEW_PLATFORM_VERSION("NEW_PLATFORM_VERSION"),
  
  ENTITIES_LIMIT("ENTITIES_LIMIT"),
  
  ENTITIES_LIMIT_INCREASE_REQUEST("ENTITIES_LIMIT_INCREASE_REQUEST"),
  
  ADDON_ACCESS_ERROR("ADDON_ACCESS_ERROR"),
  
  API_USAGE_LIMIT("API_USAGE_LIMIT"),
  
  RULE_NODE("RULE_NODE"),
  
  INTEGRATION_LIFECYCLE_EVENT("INTEGRATION_LIFECYCLE_EVENT"),
  
  RATE_LIMITS("RATE_LIMITS"),
  
  EDGE_CONNECTION("EDGE_CONNECTION"),
  
  EDGE_COMMUNICATION_FAILURE("EDGE_COMMUNICATION_FAILURE"),
  
  TASK_PROCESSING_FAILURE("TASK_PROCESSING_FAILURE"),
  
  RESOURCES_SHORTAGE("RESOURCES_SHORTAGE"),
  
  USER_ACTIVATED("USER_ACTIVATED"),
  
  USER_REGISTERED("USER_REGISTERED"),
  
  REPORT_GENERATED("REPORT_GENERATED");

  private String value;

  NotificationType(String value) {
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
  public static NotificationType fromValue(String value) {
    for (NotificationType b : NotificationType.values()) {
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

