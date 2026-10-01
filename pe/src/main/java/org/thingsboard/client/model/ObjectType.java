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
  
  ROLE("ROLE"),
  
  ENTITY_GROUP("ENTITY_GROUP"),
  
  DEVICE_GROUP_OTA_PACKAGE("DEVICE_GROUP_OTA_PACKAGE"),
  
  GROUP_PERMISSION("GROUP_PERMISSION"),
  
  BLOB_ENTITY("BLOB_ENTITY"),
  
  SCHEDULER_EVENT("SCHEDULER_EVENT"),
  
  EVENT("EVENT"),
  
  RULE_NODE("RULE_NODE"),
  
  CONVERTER("CONVERTER"),
  
  INTEGRATION("INTEGRATION"),
  
  USER("USER"),
  
  EDGE("EDGE"),
  
  WIDGETS_BUNDLE("WIDGETS_BUNDLE"),
  
  WIDGET_TYPE("WIDGET_TYPE"),
  
  DASHBOARD("DASHBOARD"),
  
  REPORT_TEMPLATE("REPORT_TEMPLATE"),
  
  REPORT("REPORT"),
  
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
  
  WHITE_LABELING("WHITE_LABELING"),
  
  CUSTOM_TRANSLATION("CUSTOM_TRANSLATION"),
  
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

