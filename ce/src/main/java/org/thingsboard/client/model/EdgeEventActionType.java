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
 * Gets or Sets EdgeEventActionType
 */
public enum EdgeEventActionType {
  
  ADDED("ADDED"),
  
  UPDATED("UPDATED"),
  
  DELETED("DELETED"),
  
  POST_ATTRIBUTES("POST_ATTRIBUTES"),
  
  ATTRIBUTES_UPDATED("ATTRIBUTES_UPDATED"),
  
  ATTRIBUTES_DELETED("ATTRIBUTES_DELETED"),
  
  TIMESERIES_UPDATED("TIMESERIES_UPDATED"),
  
  CREDENTIALS_UPDATED("CREDENTIALS_UPDATED"),
  
  RELATION_ADD_OR_UPDATE("RELATION_ADD_OR_UPDATE"),
  
  RELATION_DELETED("RELATION_DELETED"),
  
  RPC_CALL("RPC_CALL"),
  
  ALARM_ACK("ALARM_ACK"),
  
  ALARM_CLEAR("ALARM_CLEAR"),
  
  ALARM_DELETE("ALARM_DELETE"),
  
  ALARM_ASSIGNED("ALARM_ASSIGNED"),
  
  ALARM_UNASSIGNED("ALARM_UNASSIGNED"),
  
  ADDED_COMMENT("ADDED_COMMENT"),
  
  UPDATED_COMMENT("UPDATED_COMMENT"),
  
  DELETED_COMMENT("DELETED_COMMENT"),
  
  ASSIGNED_TO_EDGE("ASSIGNED_TO_EDGE"),
  
  UNASSIGNED_FROM_EDGE("UNASSIGNED_FROM_EDGE"),
  
  CREDENTIALS_REQUEST("CREDENTIALS_REQUEST"),
  
  ADDED_TO_ENTITY_GROUP("ADDED_TO_ENTITY_GROUP"),
  
  REMOVED_FROM_ENTITY_GROUP("REMOVED_FROM_ENTITY_GROUP"),
  
  CHANGE_OWNER("CHANGE_OWNER"),
  
  ENTITY_MERGE_REQUEST("ENTITY_MERGE_REQUEST");

  private String value;

  EdgeEventActionType(String value) {
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
  public static EdgeEventActionType fromValue(String value) {
    for (EdgeEventActionType b : EdgeEventActionType.values()) {
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

