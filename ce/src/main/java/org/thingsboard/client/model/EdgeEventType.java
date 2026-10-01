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
  
  AI_MODEL("AI_MODEL"),
  
  API_KEY("API_KEY");

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

