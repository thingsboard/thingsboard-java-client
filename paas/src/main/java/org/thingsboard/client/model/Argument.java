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
import org.thingsboard.client.model.CfArgumentDynamicSourceConfiguration;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.ReferencedEntityKey;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Argument
 */
@JsonPropertyOrder({
  Argument.JSON_PROPERTY_REF_ENTITY_ID,
  Argument.JSON_PROPERTY_REF_DYNAMIC_SOURCE_CONFIGURATION,
  Argument.JSON_PROPERTY_REF_ENTITY_KEY,
  Argument.JSON_PROPERTY_DEFAULT_VALUE,
  Argument.JSON_PROPERTY_LIMIT,
  Argument.JSON_PROPERTY_TIME_WINDOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class Argument {
  public static final String JSON_PROPERTY_REF_ENTITY_ID = "refEntityId";
  @javax.annotation.Nullable
  private EntityId refEntityId;

  public static final String JSON_PROPERTY_REF_DYNAMIC_SOURCE_CONFIGURATION = "refDynamicSourceConfiguration";
  @javax.annotation.Nullable
  private CfArgumentDynamicSourceConfiguration refDynamicSourceConfiguration;

  public static final String JSON_PROPERTY_REF_ENTITY_KEY = "refEntityKey";
  @javax.annotation.Nullable
  private ReferencedEntityKey refEntityKey;

  public static final String JSON_PROPERTY_DEFAULT_VALUE = "defaultValue";
  @javax.annotation.Nullable
  private String defaultValue;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  @javax.annotation.Nullable
  private Integer limit;

  public static final String JSON_PROPERTY_TIME_WINDOW = "timeWindow";
  @javax.annotation.Nullable
  private Long timeWindow;

  public Argument() { 
  }

  public Argument refEntityId(@javax.annotation.Nullable EntityId refEntityId) {
    this.refEntityId = refEntityId;
    return this;
  }

  /**
   * Get refEntityId
   * @return refEntityId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REF_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getRefEntityId() {
    return refEntityId;
  }


  @JsonProperty(value = JSON_PROPERTY_REF_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefEntityId(@javax.annotation.Nullable EntityId refEntityId) {
    this.refEntityId = refEntityId;
  }


  public Argument refDynamicSourceConfiguration(@javax.annotation.Nullable CfArgumentDynamicSourceConfiguration refDynamicSourceConfiguration) {
    this.refDynamicSourceConfiguration = refDynamicSourceConfiguration;
    return this;
  }

  /**
   * Get refDynamicSourceConfiguration
   * @return refDynamicSourceConfiguration
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REF_DYNAMIC_SOURCE_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CfArgumentDynamicSourceConfiguration getRefDynamicSourceConfiguration() {
    return refDynamicSourceConfiguration;
  }


  @JsonProperty(value = JSON_PROPERTY_REF_DYNAMIC_SOURCE_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefDynamicSourceConfiguration(@javax.annotation.Nullable CfArgumentDynamicSourceConfiguration refDynamicSourceConfiguration) {
    this.refDynamicSourceConfiguration = refDynamicSourceConfiguration;
  }


  public Argument refEntityKey(@javax.annotation.Nullable ReferencedEntityKey refEntityKey) {
    this.refEntityKey = refEntityKey;
    return this;
  }

  /**
   * Get refEntityKey
   * @return refEntityKey
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REF_ENTITY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ReferencedEntityKey getRefEntityKey() {
    return refEntityKey;
  }


  @JsonProperty(value = JSON_PROPERTY_REF_ENTITY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefEntityKey(@javax.annotation.Nullable ReferencedEntityKey refEntityKey) {
    this.refEntityKey = refEntityKey;
  }


  public Argument defaultValue(@javax.annotation.Nullable String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Get defaultValue
   * @return defaultValue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDefaultValue() {
    return defaultValue;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultValue(@javax.annotation.Nullable String defaultValue) {
    this.defaultValue = defaultValue;
  }


  public Argument limit(@javax.annotation.Nullable Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(value = JSON_PROPERTY_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(@javax.annotation.Nullable Integer limit) {
    this.limit = limit;
  }


  public Argument timeWindow(@javax.annotation.Nullable Long timeWindow) {
    this.timeWindow = timeWindow;
    return this;
  }

  /**
   * Get timeWindow
   * @return timeWindow
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TIME_WINDOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimeWindow() {
    return timeWindow;
  }


  @JsonProperty(value = JSON_PROPERTY_TIME_WINDOW, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeWindow(@javax.annotation.Nullable Long timeWindow) {
    this.timeWindow = timeWindow;
  }


  /**
   * Return true if this Argument object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Argument argument = (Argument) o;
    return Objects.equals(this.refEntityId, argument.refEntityId) &&
        Objects.equals(this.refDynamicSourceConfiguration, argument.refDynamicSourceConfiguration) &&
        Objects.equals(this.refEntityKey, argument.refEntityKey) &&
        Objects.equals(this.defaultValue, argument.defaultValue) &&
        Objects.equals(this.limit, argument.limit) &&
        Objects.equals(this.timeWindow, argument.timeWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refEntityId, refDynamicSourceConfiguration, refEntityKey, defaultValue, limit, timeWindow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Argument {\n");
    sb.append("    refEntityId: ").append(toIndentedString(refEntityId)).append("\n");
    sb.append("    refDynamicSourceConfiguration: ").append(toIndentedString(refDynamicSourceConfiguration)).append("\n");
    sb.append("    refEntityKey: ").append(toIndentedString(refEntityKey)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    timeWindow: ").append(toIndentedString(timeWindow)).append("\n");
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

    // add `refEntityId` to the URL query string
    if (getRefEntityId() != null) {
      joiner.add(getRefEntityId().toUrlQueryString(prefix + "refEntityId" + suffix));
    }

    // add `refDynamicSourceConfiguration` to the URL query string
    if (getRefDynamicSourceConfiguration() != null) {
      joiner.add(getRefDynamicSourceConfiguration().toUrlQueryString(prefix + "refDynamicSourceConfiguration" + suffix));
    }

    // add `refEntityKey` to the URL query string
    if (getRefEntityKey() != null) {
      joiner.add(getRefEntityKey().toUrlQueryString(prefix + "refEntityKey" + suffix));
    }

    // add `defaultValue` to the URL query string
    if (getDefaultValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdefaultValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDefaultValue()))));
    }

    // add `limit` to the URL query string
    if (getLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLimit()))));
    }

    // add `timeWindow` to the URL query string
    if (getTimeWindow() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stimeWindow%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTimeWindow()))));
    }

    return joiner.toString();
  }
}

