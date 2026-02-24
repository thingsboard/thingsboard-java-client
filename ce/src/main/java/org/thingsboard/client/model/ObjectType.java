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
 * Gets or Sets ObjectType
 */
public enum ObjectType {
  
  TENANT("TENANT"),
  
  TENANT_PROFILE("TENANT_PROFILE"),
  
  CUSTOMER("CUSTOMER"),
  
  QUEUE("QUEUE"),
  
  RPC("RPC"),
  
  RULE_CHAIN("RULE_CHAIN"),
  
  OTA_PACKAGE("OTA_PACKAGE"),
  
  RESOURCE("RESOURCE"),
  
  EVENT("EVENT"),
  
  RULE_NODE("RULE_NODE"),
  
  USER("USER"),
  
  EDGE("EDGE"),
  
  WIDGETS_BUNDLE("WIDGETS_BUNDLE"),
  
  WIDGET_TYPE("WIDGET_TYPE"),
  
  DASHBOARD("DASHBOARD"),
  
  DEVICE_PROFILE("DEVICE_PROFILE"),
  
  DEVICE("DEVICE"),
  
  DEVICE_CREDENTIALS("DEVICE_CREDENTIALS"),
  
  ASSET_PROFILE("ASSET_PROFILE"),
  
  ASSET("ASSET"),
  
  ENTITY_VIEW("ENTITY_VIEW"),
  
  ALARM("ALARM"),
  
  ENTITY_ALARM("ENTITY_ALARM"),
  
  OAUTH2_CLIENT("OAUTH2_CLIENT"),
  
  OAUTH2_DOMAIN("OAUTH2_DOMAIN"),
  
  OAUTH2_MOBILE("OAUTH2_MOBILE"),
  
  USER_SETTINGS("USER_SETTINGS"),
  
  NOTIFICATION_TARGET("NOTIFICATION_TARGET"),
  
  NOTIFICATION_TEMPLATE("NOTIFICATION_TEMPLATE"),
  
  NOTIFICATION_RULE("NOTIFICATION_RULE"),
  
  ALARM_COMMENT("ALARM_COMMENT"),
  
  API_USAGE_STATE("API_USAGE_STATE"),
  
  QUEUE_STATS("QUEUE_STATS"),
  
  AUDIT_LOG("AUDIT_LOG"),
  
  RELATION("RELATION"),
  
  ATTRIBUTE_KV("ATTRIBUTE_KV"),
  
  LATEST_TS_KV("LATEST_TS_KV");

  private String value;

  ObjectType(String value) {
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
  public static ObjectType fromValue(String value) {
    for (ObjectType b : ObjectType.values()) {
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

