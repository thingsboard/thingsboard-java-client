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
 * Gets or Sets QuickTimeInterval
 */
public enum QuickTimeInterval {
  
  YESTERDAY("YESTERDAY"),
  
  DAY_BEFORE_YESTERDAY("DAY_BEFORE_YESTERDAY"),
  
  THIS_DAY_LAST_WEEK("THIS_DAY_LAST_WEEK"),
  
  PREVIOUS_WEEK("PREVIOUS_WEEK"),
  
  PREVIOUS_WEEK_ISO("PREVIOUS_WEEK_ISO"),
  
  PREVIOUS_MONTH("PREVIOUS_MONTH"),
  
  PREVIOUS_QUARTER("PREVIOUS_QUARTER"),
  
  PREVIOUS_HALF_YEAR("PREVIOUS_HALF_YEAR"),
  
  PREVIOUS_YEAR("PREVIOUS_YEAR"),
  
  CURRENT_HOUR("CURRENT_HOUR"),
  
  CURRENT_DAY("CURRENT_DAY"),
  
  CURRENT_DAY_SO_FAR("CURRENT_DAY_SO_FAR"),
  
  CURRENT_WEEK("CURRENT_WEEK"),
  
  CURRENT_WEEK_ISO("CURRENT_WEEK_ISO"),
  
  CURRENT_WEEK_SO_FAR("CURRENT_WEEK_SO_FAR"),
  
  CURRENT_WEEK_ISO_SO_FAR("CURRENT_WEEK_ISO_SO_FAR"),
  
  CURRENT_MONTH("CURRENT_MONTH"),
  
  CURRENT_MONTH_SO_FAR("CURRENT_MONTH_SO_FAR"),
  
  CURRENT_QUARTER("CURRENT_QUARTER"),
  
  CURRENT_QUARTER_SO_FAR("CURRENT_QUARTER_SO_FAR"),
  
  CURRENT_HALF_YEAR("CURRENT_HALF_YEAR"),
  
  CURRENT_HALF_YEAR_SO_FAR("CURRENT_HALF_YEAR_SO_FAR"),
  
  CURRENT_YEAR("CURRENT_YEAR"),
  
  CURRENT_YEAR_SO_FAR("CURRENT_YEAR_SO_FAR");

  private String value;

  QuickTimeInterval(String value) {
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
  public static QuickTimeInterval fromValue(String value) {
    for (QuickTimeInterval b : QuickTimeInterval.values()) {
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

