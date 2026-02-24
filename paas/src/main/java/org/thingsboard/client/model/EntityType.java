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
 * Gets or Sets EntityType
 */
public enum EntityType {
  
  TENANT("TENANT"),
  
  CUSTOMER("CUSTOMER"),
  
  USER("USER"),
  
  DASHBOARD("DASHBOARD"),
  
  ASSET("ASSET"),
  
  DEVICE("DEVICE"),
  
  ALARM("ALARM"),
  
  ENTITY_GROUP("ENTITY_GROUP"),
  
  CONVERTER("CONVERTER"),
  
  INTEGRATION("INTEGRATION"),
  
  RULE_CHAIN("RULE_CHAIN"),
  
  RULE_NODE("RULE_NODE"),
  
  SCHEDULER_EVENT("SCHEDULER_EVENT"),
  
  BLOB_ENTITY("BLOB_ENTITY"),
  
  REPORT_TEMPLATE("REPORT_TEMPLATE"),
  
  REPORT("REPORT"),
  
  ENTITY_VIEW("ENTITY_VIEW"),
  
  WIDGETS_BUNDLE("WIDGETS_BUNDLE"),
  
  WIDGET_TYPE("WIDGET_TYPE"),
  
  ROLE("ROLE"),
  
  GROUP_PERMISSION("GROUP_PERMISSION"),
  
  TENANT_PROFILE("TENANT_PROFILE"),
  
  DEVICE_PROFILE("DEVICE_PROFILE"),
  
  ASSET_PROFILE("ASSET_PROFILE"),
  
  API_USAGE_STATE("API_USAGE_STATE"),
  
  TB_RESOURCE("TB_RESOURCE"),
  
  OTA_PACKAGE("OTA_PACKAGE"),
  
  EDGE("EDGE"),
  
  RPC("RPC"),
  
  QUEUE("QUEUE"),
  
  NOTIFICATION_TARGET("NOTIFICATION_TARGET"),
  
  NOTIFICATION_TEMPLATE("NOTIFICATION_TEMPLATE"),
  
  NOTIFICATION_REQUEST("NOTIFICATION_REQUEST"),
  
  NOTIFICATION("NOTIFICATION"),
  
  NOTIFICATION_RULE("NOTIFICATION_RULE"),
  
  QUEUE_STATS("QUEUE_STATS"),
  
  OAUTH2_CLIENT("OAUTH2_CLIENT"),
  
  DOMAIN("DOMAIN"),
  
  MOBILE_APP("MOBILE_APP"),
  
  MOBILE_APP_BUNDLE("MOBILE_APP_BUNDLE"),
  
  CALCULATED_FIELD("CALCULATED_FIELD"),
  
  JOB("JOB"),
  
  SECRET("SECRET"),
  
  ADMIN_SETTINGS("ADMIN_SETTINGS"),
  
  AI_MODEL("AI_MODEL"),
  
  API_KEY("API_KEY"),
  
  BILLING_CUSTOMER("BILLING_CUSTOMER"),
  
  SUBSCRIPTION_PLAN("SUBSCRIPTION_PLAN"),
  
  SUBSCRIPTION("SUBSCRIPTION"),
  
  COUPON("COUPON"),
  
  PRODUCT("PRODUCT"),
  
  SUBSCRIPTION_ADDON("SUBSCRIPTION_ADDON");

  private String value;

  EntityType(String value) {
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
  public static EntityType fromValue(String value) {
    for (EntityType b : EntityType.values()) {
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

