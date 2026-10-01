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
 * Gets or Sets ReportComponentType
 */
public enum ReportComponentType {
  
  HEADING("HEADING"),
  
  RICH_TEXT("RICH_TEXT"),
  
  ENTITY_TABLE("ENTITY_TABLE"),
  
  TIME_SERIES_TABLE("TIME_SERIES_TABLE"),
  
  ALARM_TABLE("ALARM_TABLE"),
  
  TIME_SERIES_CHART("TIME_SERIES_CHART"),
  
  LATEST_CHART("LATEST_CHART"),
  
  DASHBOARD("DASHBOARD"),
  
  IMAGE("IMAGE"),
  
  SUB_REPORT("SUB_REPORT"),
  
  PAGE_BREAK("PAGE_BREAK"),
  
  ERROR("ERROR"),
  
  DIVIDER("DIVIDER"),
  
  SPLIT_VIEW("SPLIT_VIEW");

  private String value;

  ReportComponentType(String value) {
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
  public static ReportComponentType fromValue(String value) {
    for (ReportComponentType b : ReportComponentType.values()) {
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

