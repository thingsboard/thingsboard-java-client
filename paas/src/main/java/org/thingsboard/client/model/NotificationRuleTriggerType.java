// SPDX-FileCopyrightText: Copyright ThingsBoard, Inc.
// SPDX-License-Identifier: Apache-2.0
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
 * Gets or Sets NotificationRuleTriggerType
 */
public enum NotificationRuleTriggerType {
  
  ENTITY_ACTION("ENTITY_ACTION"),
  
  ALARM("ALARM"),
  
  ALARM_COMMENT("ALARM_COMMENT"),
  
  ALARM_ASSIGNMENT("ALARM_ASSIGNMENT"),
  
  DEVICE_ACTIVITY("DEVICE_ACTIVITY"),
  
  RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT("RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT"),
  
  INTEGRATION_LIFECYCLE_EVENT("INTEGRATION_LIFECYCLE_EVENT"),
  
  EDGE_CONNECTION("EDGE_CONNECTION"),
  
  EDGE_COMMUNICATION_FAILURE("EDGE_COMMUNICATION_FAILURE"),
  
  NEW_PLATFORM_VERSION("NEW_PLATFORM_VERSION"),
  
  ENTITIES_LIMIT("ENTITIES_LIMIT"),
  
  API_USAGE_LIMIT("API_USAGE_LIMIT"),
  
  RATE_LIMITS("RATE_LIMITS"),
  
  TASK_PROCESSING_FAILURE("TASK_PROCESSING_FAILURE"),
  
  RESOURCES_SHORTAGE("RESOURCES_SHORTAGE");

  private String value;

  NotificationRuleTriggerType(String value) {
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
  public static NotificationRuleTriggerType fromValue(String value) {
    for (NotificationRuleTriggerType b : NotificationRuleTriggerType.values()) {
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

