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
 * Gets or Sets ThresholdLabelPosition
 */
public enum ThresholdLabelPosition {
  
  START("start"),
  
  MIDDLE("middle"),
  
  END("end"),
  
  INSIDE_START("insideStart"),
  
  INSIDE_START_TOP("insideStartTop"),
  
  INSIDE_START_BOTTOM("insideStartBottom"),
  
  INSIDE_MIDDLE("insideMiddle"),
  
  INSIDE_MIDDLE_TOP("insideMiddleTop"),
  
  INSIDE_MIDDLE_BOTTOM("insideMiddleBottom"),
  
  INSIDE_END("insideEnd"),
  
  INSIDE_END_TOP("insideEndTop"),
  
  INSIDE_END_BOTTOM("insideEndBottom");

  private String value;

  ThresholdLabelPosition(String value) {
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
  public static ThresholdLabelPosition fromValue(String value) {
    for (ThresholdLabelPosition b : ThresholdLabelPosition.values()) {
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

