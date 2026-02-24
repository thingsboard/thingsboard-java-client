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
 * Gets or Sets EdgeEventType
 */
public enum EdgeEventType {
  
  DASHBOARD("DASHBOARD"),
  
  ASSET("ASSET"),
  
  DEVICE("DEVICE"),
  
  DEVICE_PROFILE("DEVICE_PROFILE"),
  
  ASSET_PROFILE("ASSET_PROFILE"),
  
  ENTITY_VIEW("ENTITY_VIEW"),
  
  ALARM("ALARM"),
  
  ALARM_COMMENT("ALARM_COMMENT"),
  
  RULE_CHAIN("RULE_CHAIN"),
  
  RULE_CHAIN_METADATA("RULE_CHAIN_METADATA"),
  
  EDGE("EDGE"),
  
  USER("USER"),
  
  CUSTOMER("CUSTOMER"),
  
  RELATION("RELATION"),
  
  TENANT("TENANT"),
  
  TENANT_PROFILE("TENANT_PROFILE"),
  
  WIDGETS_BUNDLE("WIDGETS_BUNDLE"),
  
  WIDGET_TYPE("WIDGET_TYPE"),
  
  ADMIN_SETTINGS("ADMIN_SETTINGS"),
  
  OTA_PACKAGE("OTA_PACKAGE"),
  
  QUEUE("QUEUE"),
  
  NOTIFICATION_RULE("NOTIFICATION_RULE"),
  
  NOTIFICATION_TARGET("NOTIFICATION_TARGET"),
  
  NOTIFICATION_TEMPLATE("NOTIFICATION_TEMPLATE"),
  
  TB_RESOURCE("TB_RESOURCE"),
  
  OAUTH2_CLIENT("OAUTH2_CLIENT"),
  
  DOMAIN("DOMAIN"),
  
  CALCULATED_FIELD("CALCULATED_FIELD"),
  
  AI_MODEL("AI_MODEL");

  private String value;

  EdgeEventType(String value) {
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
  public static EdgeEventType fromValue(String value) {
    for (EdgeEventType b : EdgeEventType.values()) {
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

