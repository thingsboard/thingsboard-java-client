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
 * UserActivationLink
 */
@JsonPropertyOrder({
  UserActivationLink.JSON_PROPERTY_VALUE,
  UserActivationLink.JSON_PROPERTY_TTL_MS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class UserActivationLink {
  public static final String JSON_PROPERTY_VALUE = "value";
  @javax.annotation.Nullable
  private String value;

  public static final String JSON_PROPERTY_TTL_MS = "ttlMs";
  @javax.annotation.Nullable
  private Long ttlMs;

  public UserActivationLink() { 
  }

  public UserActivationLink value(@javax.annotation.Nullable String value) {
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


  public UserActivationLink ttlMs(@javax.annotation.Nullable Long ttlMs) {
    this.ttlMs = ttlMs;
    return this;
  }

  /**
   * Get ttlMs
   * @return ttlMs
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TTL_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTtlMs() {
    return ttlMs;
  }


  @JsonProperty(value = JSON_PROPERTY_TTL_MS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTtlMs(@javax.annotation.Nullable Long ttlMs) {
    this.ttlMs = ttlMs;
  }


  /**
   * Return true if this UserActivationLink object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserActivationLink userActivationLink = (UserActivationLink) o;
    return Objects.equals(this.value, userActivationLink.value) &&
        Objects.equals(this.ttlMs, userActivationLink.ttlMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, ttlMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActivationLink {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    ttlMs: ").append(toIndentedString(ttlMs)).append("\n");
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

    // add `value` to the URL query string
    if (getValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svalue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getValue()))));
    }

    // add `ttlMs` to the URL query string
    if (getTtlMs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sttlMs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTtlMs()))));
    }

    return joiner.toString();
  }
}

