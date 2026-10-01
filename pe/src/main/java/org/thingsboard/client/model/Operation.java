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
 * Gets or Sets Operation
 */
public enum Operation {
  
  ALL("ALL"),
  
  CREATE("CREATE"),
  
  READ("READ"),
  
  WRITE("WRITE"),
  
  DELETE("DELETE"),
  
  RPC_CALL("RPC_CALL"),
  
  READ_CREDENTIALS("READ_CREDENTIALS"),
  
  WRITE_CREDENTIALS("WRITE_CREDENTIALS"),
  
  READ_ATTRIBUTES("READ_ATTRIBUTES"),
  
  WRITE_ATTRIBUTES("WRITE_ATTRIBUTES"),
  
  READ_TELEMETRY("READ_TELEMETRY"),
  
  WRITE_TELEMETRY("WRITE_TELEMETRY"),
  
  ADD_TO_GROUP("ADD_TO_GROUP"),
  
  REMOVE_FROM_GROUP("REMOVE_FROM_GROUP"),
  
  CHANGE_OWNER("CHANGE_OWNER"),
  
  IMPERSONATE("IMPERSONATE"),
  
  CLAIM_DEVICES("CLAIM_DEVICES"),
  
  SHARE_GROUP("SHARE_GROUP"),
  
  ASSIGN_TO_TENANT("ASSIGN_TO_TENANT"),
  
  READ_CALCULATED_FIELD("READ_CALCULATED_FIELD"),
  
  WRITE_CALCULATED_FIELD("WRITE_CALCULATED_FIELD");

  private String value;

  Operation(String value) {
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
  public static Operation fromValue(String value) {
    for (Operation b : Operation.values()) {
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

