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
 * Gets or Sets ProcessingStrategyType
 */
public enum ProcessingStrategyType {
  
  SKIP_ALL_FAILURES("SKIP_ALL_FAILURES"),
  
  SKIP_ALL_FAILURES_AND_TIMED_OUT("SKIP_ALL_FAILURES_AND_TIMED_OUT"),
  
  RETRY_ALL("RETRY_ALL"),
  
  RETRY_FAILED("RETRY_FAILED"),
  
  RETRY_TIMED_OUT("RETRY_TIMED_OUT"),
  
  RETRY_FAILED_AND_TIMED_OUT("RETRY_FAILED_AND_TIMED_OUT");

  private String value;

  ProcessingStrategyType(String value) {
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
  public static ProcessingStrategyType fromValue(String value) {
    for (ProcessingStrategyType b : ProcessingStrategyType.values()) {
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

