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
 * Gets or Sets BulkImportColumnType
 */
public enum BulkImportColumnType {
  
  NAME("NAME"),
  
  TYPE("TYPE"),
  
  LABEL("LABEL"),
  
  SHARED_ATTRIBUTE("SHARED_ATTRIBUTE"),
  
  SERVER_ATTRIBUTE("SERVER_ATTRIBUTE"),
  
  TIMESERIES("TIMESERIES"),
  
  ACCESS_TOKEN("ACCESS_TOKEN"),
  
  X509("X509"),
  
  MQTT_CLIENT_ID("MQTT_CLIENT_ID"),
  
  MQTT_USER_NAME("MQTT_USER_NAME"),
  
  MQTT_PASSWORD("MQTT_PASSWORD"),
  
  LWM2_M_CLIENT_ENDPOINT("LWM2M_CLIENT_ENDPOINT"),
  
  LWM2_M_CLIENT_SECURITY_CONFIG_MODE("LWM2M_CLIENT_SECURITY_CONFIG_MODE"),
  
  LWM2_M_CLIENT_IDENTITY("LWM2M_CLIENT_IDENTITY"),
  
  LWM2_M_CLIENT_KEY("LWM2M_CLIENT_KEY"),
  
  LWM2_M_CLIENT_CERT("LWM2M_CLIENT_CERT"),
  
  LWM2_M_BOOTSTRAP_SERVER_SECURITY_MODE("LWM2M_BOOTSTRAP_SERVER_SECURITY_MODE"),
  
  LWM2_M_BOOTSTRAP_SERVER_PUBLIC_KEY_OR_ID("LWM2M_BOOTSTRAP_SERVER_PUBLIC_KEY_OR_ID"),
  
  LWM2_M_BOOTSTRAP_SERVER_SECRET_KEY("LWM2M_BOOTSTRAP_SERVER_SECRET_KEY"),
  
  LWM2_M_SERVER_SECURITY_MODE("LWM2M_SERVER_SECURITY_MODE"),
  
  LWM2_M_SERVER_CLIENT_PUBLIC_KEY_OR_ID("LWM2M_SERVER_CLIENT_PUBLIC_KEY_OR_ID"),
  
  LWM2_M_SERVER_CLIENT_SECRET_KEY("LWM2M_SERVER_CLIENT_SECRET_KEY"),
  
  SNMP_HOST("SNMP_HOST"),
  
  SNMP_PORT("SNMP_PORT"),
  
  SNMP_VERSION("SNMP_VERSION"),
  
  SNMP_COMMUNITY_STRING("SNMP_COMMUNITY_STRING"),
  
  IS_GATEWAY("IS_GATEWAY"),
  
  DESCRIPTION("DESCRIPTION"),
  
  ROUTING_KEY("ROUTING_KEY"),
  
  SECRET("SECRET");

  private String value;

  BulkImportColumnType(String value) {
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
  public static BulkImportColumnType fromValue(String value) {
    for (BulkImportColumnType b : BulkImportColumnType.values()) {
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

