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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Platform error code
 */
public enum ThingsboardErrorCode {
  
  NUMBER_2(new BigDecimal("2")),
  
  NUMBER_10(new BigDecimal("10")),
  
  NUMBER_11(new BigDecimal("11")),
  
  NUMBER_15(new BigDecimal("15")),
  
  NUMBER_20(new BigDecimal("20")),
  
  NUMBER_30(new BigDecimal("30")),
  
  NUMBER_31(new BigDecimal("31")),
  
  NUMBER_32(new BigDecimal("32")),
  
  NUMBER_33(new BigDecimal("33")),
  
  NUMBER_34(new BigDecimal("34")),
  
  NUMBER_35(new BigDecimal("35")),
  
  NUMBER_40(new BigDecimal("40")),
  
  NUMBER_41(new BigDecimal("41")),
  
  NUMBER_45(new BigDecimal("45")),
  
  NUMBER_46(new BigDecimal("46")),
  
  NUMBER_50(new BigDecimal("50"));

  private BigDecimal value;

  ThingsboardErrorCode(BigDecimal value) {
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
  public static ThingsboardErrorCode fromValue(BigDecimal value) {
    for (ThingsboardErrorCode b : ThingsboardErrorCode.values()) {
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

