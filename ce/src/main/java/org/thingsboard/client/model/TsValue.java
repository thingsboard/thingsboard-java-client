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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TsValue
 */
@JsonPropertyOrder({
  TsValue.JSON_PROPERTY_TS,
  TsValue.JSON_PROPERTY_VALUE,
  TsValue.JSON_PROPERTY_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class TsValue {
  public static final String JSON_PROPERTY_TS = "ts";
  @javax.annotation.Nullable
  private Long ts;

  public static final String JSON_PROPERTY_VALUE = "value";
  @javax.annotation.Nullable
  private String value;

  public static final String JSON_PROPERTY_COUNT = "count";
  @javax.annotation.Nullable
  private Long count;

  public TsValue() { 
  }

  public TsValue ts(@javax.annotation.Nullable Long ts) {
    this.ts = ts;
    return this;
  }

  /**
   * Get ts
   * @return ts
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTs() {
    return ts;
  }


  @JsonProperty(value = JSON_PROPERTY_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTs(@javax.annotation.Nullable Long ts) {
    this.ts = ts;
  }


  public TsValue value(@javax.annotation.Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getValue() {
    return value;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(@javax.annotation.Nullable String value) {
    this.value = value;
  }


  public TsValue count(@javax.annotation.Nullable Long count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCount() {
    return count;
  }


  @JsonProperty(value = JSON_PROPERTY_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(@javax.annotation.Nullable Long count) {
    this.count = count;
  }


  /**
   * Return true if this TsValue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TsValue tsValue = (TsValue) o;
    return Objects.equals(this.ts, tsValue.ts) &&
        Objects.equals(this.value, tsValue.value) &&
        Objects.equals(this.count, tsValue.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ts, value, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TsValue {\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

    // add `ts` to the URL query string
    if (getTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sts%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTs()))));
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svalue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getValue()))));
    }

    // add `count` to the URL query string
    if (getCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCount()))));
    }

    return joiner.toString();
  }
}

