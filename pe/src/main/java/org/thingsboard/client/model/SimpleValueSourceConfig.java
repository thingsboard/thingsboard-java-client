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
import org.thingsboard.client.model.ValueSourceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * SimpleValueSourceConfig
 */
@JsonPropertyOrder({
  SimpleValueSourceConfig.JSON_PROPERTY_TYPE,
  SimpleValueSourceConfig.JSON_PROPERTY_VALUE,
  SimpleValueSourceConfig.JSON_PROPERTY_LATEST_KEY_TYPE,
  SimpleValueSourceConfig.JSON_PROPERTY_LATEST_KEY,
  SimpleValueSourceConfig.JSON_PROPERTY_ENTITY_KEY_TYPE,
  SimpleValueSourceConfig.JSON_PROPERTY_ENTITY_ALIAS,
  SimpleValueSourceConfig.JSON_PROPERTY_ENTITY_KEY
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class SimpleValueSourceConfig {
  public static final String JSON_PROPERTY_TYPE = "type";
  @Nullable
  private ValueSourceType type;

  public static final String JSON_PROPERTY_VALUE = "value";
  @Nullable
  private Double value;

  public static final String JSON_PROPERTY_LATEST_KEY_TYPE = "latestKeyType";
  @Nullable
  private String latestKeyType;

  public static final String JSON_PROPERTY_LATEST_KEY = "latestKey";
  @Nullable
  private String latestKey;

  public static final String JSON_PROPERTY_ENTITY_KEY_TYPE = "entityKeyType";
  @Nullable
  private String entityKeyType;

  public static final String JSON_PROPERTY_ENTITY_ALIAS = "entityAlias";
  @Nullable
  private String entityAlias;

  public static final String JSON_PROPERTY_ENTITY_KEY = "entityKey";
  @Nullable
  private String entityKey;

  public SimpleValueSourceConfig() { 
  }

  public SimpleValueSourceConfig type(@Nullable ValueSourceType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ValueSourceType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@Nullable ValueSourceType type) {
    this.type = type;
  }


  public SimpleValueSourceConfig value(@Nullable Double value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getValue() {
    return value;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(@Nullable Double value) {
    this.value = value;
  }


  public SimpleValueSourceConfig latestKeyType(@Nullable String latestKeyType) {
    this.latestKeyType = latestKeyType;
    return this;
  }

  /**
   * Get latestKeyType
   * @return latestKeyType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LATEST_KEY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLatestKeyType() {
    return latestKeyType;
  }


  @JsonProperty(value = JSON_PROPERTY_LATEST_KEY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestKeyType(@Nullable String latestKeyType) {
    this.latestKeyType = latestKeyType;
  }


  public SimpleValueSourceConfig latestKey(@Nullable String latestKey) {
    this.latestKey = latestKey;
    return this;
  }

  /**
   * Get latestKey
   * @return latestKey
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LATEST_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLatestKey() {
    return latestKey;
  }


  @JsonProperty(value = JSON_PROPERTY_LATEST_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestKey(@Nullable String latestKey) {
    this.latestKey = latestKey;
  }


  public SimpleValueSourceConfig entityKeyType(@Nullable String entityKeyType) {
    this.entityKeyType = entityKeyType;
    return this;
  }

  /**
   * Get entityKeyType
   * @return entityKeyType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_KEY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEntityKeyType() {
    return entityKeyType;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_KEY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityKeyType(@Nullable String entityKeyType) {
    this.entityKeyType = entityKeyType;
  }


  public SimpleValueSourceConfig entityAlias(@Nullable String entityAlias) {
    this.entityAlias = entityAlias;
    return this;
  }

  /**
   * Get entityAlias
   * @return entityAlias
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_ALIAS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEntityAlias() {
    return entityAlias;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_ALIAS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityAlias(@Nullable String entityAlias) {
    this.entityAlias = entityAlias;
  }


  public SimpleValueSourceConfig entityKey(@Nullable String entityKey) {
    this.entityKey = entityKey;
    return this;
  }

  /**
   * Get entityKey
   * @return entityKey
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEntityKey() {
    return entityKey;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityKey(@Nullable String entityKey) {
    this.entityKey = entityKey;
  }


  /**
   * Return true if this SimpleValueSourceConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleValueSourceConfig simpleValueSourceConfig = (SimpleValueSourceConfig) o;
    return Objects.equals(this.type, simpleValueSourceConfig.type) &&
        Objects.equals(this.value, simpleValueSourceConfig.value) &&
        Objects.equals(this.latestKeyType, simpleValueSourceConfig.latestKeyType) &&
        Objects.equals(this.latestKey, simpleValueSourceConfig.latestKey) &&
        Objects.equals(this.entityKeyType, simpleValueSourceConfig.entityKeyType) &&
        Objects.equals(this.entityAlias, simpleValueSourceConfig.entityAlias) &&
        Objects.equals(this.entityKey, simpleValueSourceConfig.entityKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value, latestKeyType, latestKey, entityKeyType, entityAlias, entityKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleValueSourceConfig {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    latestKeyType: ").append(toIndentedString(latestKeyType)).append("\n");
    sb.append("    latestKey: ").append(toIndentedString(latestKey)).append("\n");
    sb.append("    entityKeyType: ").append(toIndentedString(entityKeyType)).append("\n");
    sb.append("    entityAlias: ").append(toIndentedString(entityAlias)).append("\n");
    sb.append("    entityKey: ").append(toIndentedString(entityKey)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svalue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getValue()))));
    }

    // add `latestKeyType` to the URL query string
    if (getLatestKeyType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slatestKeyType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLatestKeyType()))));
    }

    // add `latestKey` to the URL query string
    if (getLatestKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slatestKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLatestKey()))));
    }

    // add `entityKeyType` to the URL query string
    if (getEntityKeyType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityKeyType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityKeyType()))));
    }

    // add `entityAlias` to the URL query string
    if (getEntityAlias() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityAlias%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityAlias()))));
    }

    // add `entityKey` to the URL query string
    if (getEntityKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityKey()))));
    }

    return joiner.toString();
  }
}

