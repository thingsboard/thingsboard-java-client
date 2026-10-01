// SPDX-FileCopyrightText: Copyright ThingsBoard, Inc.
// SPDX-License-Identifier: Apache-2.0
package org.thingsboard.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Subscription error code
 */
public enum SubscriptionExceptionErrorCode {
  
  NUMBER_1(new BigDecimal("1")),
  
  NUMBER_2(new BigDecimal("2")),
  
  NUMBER_3(new BigDecimal("3")),
  
  NUMBER_4(new BigDecimal("4")),
  
  NUMBER_5(new BigDecimal("5")),
  
  NUMBER_6(new BigDecimal("6"));

  private BigDecimal value;

  SubscriptionExceptionErrorCode(BigDecimal value) {
    this.value = value;
  }

  @JsonValue
  public BigDecimal getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SubscriptionExceptionErrorCode fromValue(BigDecimal value) {
    for (SubscriptionExceptionErrorCode b : SubscriptionExceptionErrorCode.values()) {
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

