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
import org.thingsboard.client.model.DynamicValueSourceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * DynamicValueDouble
 */
@JsonPropertyOrder({
  DynamicValueDouble.JSON_PROPERTY_RESOLVED_VALUE,
  DynamicValueDouble.JSON_PROPERTY_SOURCE_TYPE,
  DynamicValueDouble.JSON_PROPERTY_SOURCE_ATTRIBUTE,
  DynamicValueDouble.JSON_PROPERTY_INHERIT
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class DynamicValueDouble {
  public static final String JSON_PROPERTY_RESOLVED_VALUE = "resolvedValue";
  @Nullable
  private Double resolvedValue;

  public static final String JSON_PROPERTY_SOURCE_TYPE = "sourceType";
  @Nullable
  private DynamicValueSourceType sourceType;

  public static final String JSON_PROPERTY_SOURCE_ATTRIBUTE = "sourceAttribute";
  @Nullable
  private String sourceAttribute;

  public static final String JSON_PROPERTY_INHERIT = "inherit";
  @Nullable
  private Boolean inherit;

  public DynamicValueDouble() { 
  }

  public DynamicValueDouble resolvedValue(@Nullable Double resolvedValue) {
    this.resolvedValue = resolvedValue;
    return this;
  }

  /**
   * Get resolvedValue
   * @return resolvedValue
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RESOLVED_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getResolvedValue() {
    return resolvedValue;
  }


  @JsonProperty(value = JSON_PROPERTY_RESOLVED_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResolvedValue(@Nullable Double resolvedValue) {
    this.resolvedValue = resolvedValue;
  }


  public DynamicValueDouble sourceType(@Nullable DynamicValueSourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   * @return sourceType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SOURCE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DynamicValueSourceType getSourceType() {
    return sourceType;
  }


  @JsonProperty(value = JSON_PROPERTY_SOURCE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceType(@Nullable DynamicValueSourceType sourceType) {
    this.sourceType = sourceType;
  }


  public DynamicValueDouble sourceAttribute(@Nullable String sourceAttribute) {
    this.sourceAttribute = sourceAttribute;
    return this;
  }

  /**
   * Get sourceAttribute
   * @return sourceAttribute
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SOURCE_ATTRIBUTE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSourceAttribute() {
    return sourceAttribute;
  }


  @JsonProperty(value = JSON_PROPERTY_SOURCE_ATTRIBUTE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceAttribute(@Nullable String sourceAttribute) {
    this.sourceAttribute = sourceAttribute;
  }


  public DynamicValueDouble inherit(@Nullable Boolean inherit) {
    this.inherit = inherit;
    return this;
  }

  /**
   * Get inherit
   * @return inherit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_INHERIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getInherit() {
    return inherit;
  }


  @JsonProperty(value = JSON_PROPERTY_INHERIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInherit(@Nullable Boolean inherit) {
    this.inherit = inherit;
  }


  /**
   * Return true if this DynamicValueDouble object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicValueDouble dynamicValueDouble = (DynamicValueDouble) o;
    return Objects.equals(this.resolvedValue, dynamicValueDouble.resolvedValue) &&
        Objects.equals(this.sourceType, dynamicValueDouble.sourceType) &&
        Objects.equals(this.sourceAttribute, dynamicValueDouble.sourceAttribute) &&
        Objects.equals(this.inherit, dynamicValueDouble.inherit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolvedValue, sourceType, sourceAttribute, inherit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicValueDouble {\n");
    sb.append("    resolvedValue: ").append(toIndentedString(resolvedValue)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    sourceAttribute: ").append(toIndentedString(sourceAttribute)).append("\n");
    sb.append("    inherit: ").append(toIndentedString(inherit)).append("\n");
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

    // add `resolvedValue` to the URL query string
    if (getResolvedValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sresolvedValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getResolvedValue()))));
    }

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

    return joiner.toString();
  }
}

