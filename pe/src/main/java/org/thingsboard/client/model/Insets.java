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
 * Insets
 */
@JsonPropertyOrder({
  Insets.JSON_PROPERTY_LEFT,
  Insets.JSON_PROPERTY_RIGHT,
  Insets.JSON_PROPERTY_TOP,
  Insets.JSON_PROPERTY_BOTTOM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class Insets {
  public static final String JSON_PROPERTY_LEFT = "left";
  @javax.annotation.Nullable
  private Integer left;

  public static final String JSON_PROPERTY_RIGHT = "right";
  @javax.annotation.Nullable
  private Integer right;

  public static final String JSON_PROPERTY_TOP = "top";
  @javax.annotation.Nullable
  private Integer top;

  public static final String JSON_PROPERTY_BOTTOM = "bottom";
  @javax.annotation.Nullable
  private Integer bottom;

  public Insets() { 
  }

  public Insets left(@javax.annotation.Nullable Integer left) {
    this.left = left;
    return this;
  }

  /**
   * Get left
   * @return left
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LEFT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getLeft() {
    return left;
  }


  @JsonProperty(value = JSON_PROPERTY_LEFT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeft(@javax.annotation.Nullable Integer left) {
    this.left = left;
  }


  public Insets right(@javax.annotation.Nullable Integer right) {
    this.right = right;
    return this;
  }

  /**
   * Get right
   * @return right
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getRight() {
    return right;
  }


  @JsonProperty(value = JSON_PROPERTY_RIGHT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRight(@javax.annotation.Nullable Integer right) {
    this.right = right;
  }


  public Insets top(@javax.annotation.Nullable Integer top) {
    this.top = top;
    return this;
  }

  /**
   * Get top
   * @return top
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getTop() {
    return top;
  }


  @JsonProperty(value = JSON_PROPERTY_TOP, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTop(@javax.annotation.Nullable Integer top) {
    this.top = top;
  }


  public Insets bottom(@javax.annotation.Nullable Integer bottom) {
    this.bottom = bottom;
    return this;
  }

  /**
   * Get bottom
   * @return bottom
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_BOTTOM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getBottom() {
    return bottom;
  }


  @JsonProperty(value = JSON_PROPERTY_BOTTOM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBottom(@javax.annotation.Nullable Integer bottom) {
    this.bottom = bottom;
  }


  /**
   * Return true if this Insets object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Insets insets = (Insets) o;
    return Objects.equals(this.left, insets.left) &&
        Objects.equals(this.right, insets.right) &&
        Objects.equals(this.top, insets.top) &&
        Objects.equals(this.bottom, insets.bottom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, right, top, bottom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Insets {\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
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

    // add `left` to the URL query string
    if (getLeft() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sleft%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLeft()))));
    }

    // add `right` to the URL query string
    if (getRight() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sright%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRight()))));
    }

    // add `top` to the URL query string
    if (getTop() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stop%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTop()))));
    }

    // add `bottom` to the URL query string
    if (getBottom() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbottom%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBottom()))));
    }

    return joiner.toString();
  }
}

