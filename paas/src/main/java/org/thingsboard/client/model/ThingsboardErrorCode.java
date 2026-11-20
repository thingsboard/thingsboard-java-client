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
 * Platform error code
 */
public enum ThingsboardErrorCode {
  
  NUMBER_2(2),
  
  NUMBER_10(10),
  
  NUMBER_11(11),
  
  NUMBER_15(15),
  
  NUMBER_20(20),
  
  NUMBER_30(30),
  
  NUMBER_31(31),
  
  NUMBER_32(32),
  
  NUMBER_33(33),
  
  NUMBER_34(34),
  
  NUMBER_35(35),
  
  NUMBER_40(40),
  
  NUMBER_41(41),
  
  NUMBER_45(45),
  
  NUMBER_46(46),
  
  NUMBER_50(50);

  private Integer value;

  ThingsboardErrorCode(Integer value) {
    this.value = value;
  }

  @JsonValue
  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ThingsboardErrorCode fromValue(Integer value) {
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

