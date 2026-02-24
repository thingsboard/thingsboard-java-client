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
import org.thingsboard.client.model.DynamicValueSourceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * DynamicValueBoolean
 */
@JsonPropertyOrder({
  DynamicValueBoolean.JSON_PROPERTY_SOURCE_TYPE,
  DynamicValueBoolean.JSON_PROPERTY_SOURCE_ATTRIBUTE,
  DynamicValueBoolean.JSON_PROPERTY_INHERIT,
  DynamicValueBoolean.JSON_PROPERTY_RESOLVED_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class DynamicValueBoolean {
  public static final String JSON_PROPERTY_SOURCE_TYPE = "sourceType";
  @javax.annotation.Nullable
  private DynamicValueSourceType sourceType;

  public static final String JSON_PROPERTY_SOURCE_ATTRIBUTE = "sourceAttribute";
  @javax.annotation.Nullable
  private String sourceAttribute;

  public static final String JSON_PROPERTY_INHERIT = "inherit";
  @javax.annotation.Nullable
  private Boolean inherit;

  public static final String JSON_PROPERTY_RESOLVED_VALUE = "resolvedValue";
  @javax.annotation.Nullable
  private Boolean resolvedValue;

  public DynamicValueBoolean() { 
  }

  public DynamicValueBoolean sourceType(@javax.annotation.Nullable DynamicValueSourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   * @return sourceType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SOURCE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DynamicValueSourceType getSourceType() {
    return sourceType;
  }


  @JsonProperty(value = JSON_PROPERTY_SOURCE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceType(@javax.annotation.Nullable DynamicValueSourceType sourceType) {
    this.sourceType = sourceType;
  }


  public DynamicValueBoolean sourceAttribute(@javax.annotation.Nullable String sourceAttribute) {
    this.sourceAttribute = sourceAttribute;
    return this;
  }

  /**
   * Get sourceAttribute
   * @return sourceAttribute
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SOURCE_ATTRIBUTE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSourceAttribute() {
    return sourceAttribute;
  }


  @JsonProperty(value = JSON_PROPERTY_SOURCE_ATTRIBUTE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceAttribute(@javax.annotation.Nullable String sourceAttribute) {
    this.sourceAttribute = sourceAttribute;
  }


  public DynamicValueBoolean inherit(@javax.annotation.Nullable Boolean inherit) {
    this.inherit = inherit;
    return this;
  }

  /**
   * Get inherit
   * @return inherit
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INHERIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getInherit() {
    return inherit;
  }


  @JsonProperty(value = JSON_PROPERTY_INHERIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInherit(@javax.annotation.Nullable Boolean inherit) {
    this.inherit = inherit;
  }


  public DynamicValueBoolean resolvedValue(@javax.annotation.Nullable Boolean resolvedValue) {
    this.resolvedValue = resolvedValue;
    return this;
  }

  /**
   * Get resolvedValue
   * @return resolvedValue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RESOLVED_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getResolvedValue() {
    return resolvedValue;
  }


  @JsonProperty(value = JSON_PROPERTY_RESOLVED_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResolvedValue(@javax.annotation.Nullable Boolean resolvedValue) {
    this.resolvedValue = resolvedValue;
  }


  /**
   * Return true if this DynamicValueBoolean object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicValueBoolean dynamicValueBoolean = (DynamicValueBoolean) o;
    return Objects.equals(this.sourceType, dynamicValueBoolean.sourceType) &&
        Objects.equals(this.sourceAttribute, dynamicValueBoolean.sourceAttribute) &&
        Objects.equals(this.inherit, dynamicValueBoolean.inherit) &&
        Objects.equals(this.resolvedValue, dynamicValueBoolean.resolvedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, sourceAttribute, inherit, resolvedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicValueBoolean {\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    sourceAttribute: ").append(toIndentedString(sourceAttribute)).append("\n");
    sb.append("    inherit: ").append(toIndentedString(inherit)).append("\n");
    sb.append("    resolvedValue: ").append(toIndentedString(resolvedValue)).append("\n");
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

    // add `sourceType` to the URL query string
    if (getSourceType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssourceType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSourceType()))));
    }

    // add `sourceAttribute` to the URL query string
    if (getSourceAttribute() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssourceAttribute%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSourceAttribute()))));
    }

    // add `inherit` to the URL query string
    if (getInherit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinherit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInherit()))));
    }

    // add `resolvedValue` to the URL query string
    if (getResolvedValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sresolvedValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getResolvedValue()))));
    }

    return joiner.toString();
  }
}

