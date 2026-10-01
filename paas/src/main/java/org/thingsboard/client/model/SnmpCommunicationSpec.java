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
 * Gets or Sets SnmpCommunicationSpec
 */
public enum SnmpCommunicationSpec {
  
  TELEMETRY_QUERYING("TELEMETRY_QUERYING"),
  
  CLIENT_ATTRIBUTES_QUERYING("CLIENT_ATTRIBUTES_QUERYING"),
  
  SHARED_ATTRIBUTES_SETTING("SHARED_ATTRIBUTES_SETTING"),
  
  TO_DEVICE_RPC_REQUEST("TO_DEVICE_RPC_REQUEST"),
  
  TO_SERVER_RPC_REQUEST("TO_SERVER_RPC_REQUEST");

  private String value;

  SnmpCommunicationSpec(String value) {
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
  public static SnmpCommunicationSpec fromValue(String value) {
    for (SnmpCommunicationSpec b : SnmpCommunicationSpec.values()) {
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

