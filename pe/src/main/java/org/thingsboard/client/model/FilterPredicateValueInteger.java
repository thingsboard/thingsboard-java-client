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

import javax.annotation.Generated;
import javax.annotation.Nullable;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.thingsboard.client.model.DynamicValueInteger;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * FilterPredicateValueInteger
 */
@JsonPropertyOrder({
  FilterPredicateValueInteger.JSON_PROPERTY_DEFAULT_VALUE,
  FilterPredicateValueInteger.JSON_PROPERTY_USER_VALUE,
  FilterPredicateValueInteger.JSON_PROPERTY_DYNAMIC_VALUE
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class FilterPredicateValueInteger {
  public static final String JSON_PROPERTY_DEFAULT_VALUE = "defaultValue";
  @Nullable
  private Integer defaultValue;

  public static final String JSON_PROPERTY_USER_VALUE = "userValue";
  @Nullable
  private Integer userValue;

  public static final String JSON_PROPERTY_DYNAMIC_VALUE = "dynamicValue";
  @Nullable
  private DynamicValueInteger dynamicValue;

  public FilterPredicateValueInteger() { 
  }

  public FilterPredicateValueInteger defaultValue(@Nullable Integer defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Get defaultValue
   * @return defaultValue
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getDefaultValue() {
    return defaultValue;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultValue(@Nullable Integer defaultValue) {
    this.defaultValue = defaultValue;
  }


  public FilterPredicateValueInteger userValue(@Nullable Integer userValue) {
    this.userValue = userValue;
    return this;
  }

  /**
   * Get userValue
   * @return userValue
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_USER_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getUserValue() {
    return userValue;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserValue(@Nullable Integer userValue) {
    this.userValue = userValue;
  }


  public FilterPredicateValueInteger dynamicValue(@Nullable DynamicValueInteger dynamicValue) {
    this.dynamicValue = dynamicValue;
    return this;
  }

  /**
   * Get dynamicValue
   * @return dynamicValue
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DYNAMIC_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DynamicValueInteger getDynamicValue() {
    return dynamicValue;
  }


  @JsonProperty(value = JSON_PROPERTY_DYNAMIC_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDynamicValue(@Nullable DynamicValueInteger dynamicValue) {
    this.dynamicValue = dynamicValue;
  }


  /**
   * Return true if this FilterPredicateValueInteger object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterPredicateValueInteger filterPredicateValueInteger = (FilterPredicateValueInteger) o;
    return Objects.equals(this.defaultValue, filterPredicateValueInteger.defaultValue) &&
        Objects.equals(this.userValue, filterPredicateValueInteger.userValue) &&
        Objects.equals(this.dynamicValue, filterPredicateValueInteger.dynamicValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, userValue, dynamicValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterPredicateValueInteger {\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    userValue: ").append(toIndentedString(userValue)).append("\n");
    sb.append("    dynamicValue: ").append(toIndentedString(dynamicValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `defaultValue` to the URL query string
    if (getDefaultValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdefaultValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDefaultValue()))));
    }

    // add `userValue` to the URL query string
    if (getUserValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suserValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUserValue()))));
    }

    // add `dynamicValue` to the URL query string
    if (getDynamicValue() != null) {
      joiner.add(getDynamicValue().toUrlQueryString(prefix + "dynamicValue" + suffix));
    }

    return joiner.toString();
  }
}

