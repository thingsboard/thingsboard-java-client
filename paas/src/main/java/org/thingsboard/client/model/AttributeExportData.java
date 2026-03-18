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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AttributeExportData
 */
@JsonPropertyOrder({
  AttributeExportData.JSON_PROPERTY_KEY,
  AttributeExportData.JSON_PROPERTY_LAST_UPDATE_TS,
  AttributeExportData.JSON_PROPERTY_BOOLEAN_VALUE,
  AttributeExportData.JSON_PROPERTY_STR_VALUE,
  AttributeExportData.JSON_PROPERTY_LONG_VALUE,
  AttributeExportData.JSON_PROPERTY_DOUBLE_VALUE,
  AttributeExportData.JSON_PROPERTY_JSON_VALUE
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AttributeExportData {
  public static final String JSON_PROPERTY_KEY = "key";
  @Nullable
  private String key;

  public static final String JSON_PROPERTY_LAST_UPDATE_TS = "lastUpdateTs";
  @Nullable
  private Long lastUpdateTs;

  public static final String JSON_PROPERTY_BOOLEAN_VALUE = "booleanValue";
  @Nullable
  private Boolean booleanValue;

  public static final String JSON_PROPERTY_STR_VALUE = "strValue";
  @Nullable
  private String strValue;

  public static final String JSON_PROPERTY_LONG_VALUE = "longValue";
  @Nullable
  private Long longValue;

  public static final String JSON_PROPERTY_DOUBLE_VALUE = "doubleValue";
  @Nullable
  private Double doubleValue;

  public static final String JSON_PROPERTY_JSON_VALUE = "jsonValue";
  @Nullable
  private String jsonValue;

  public AttributeExportData() { 
  }

  public AttributeExportData key(@Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKey() {
    return key;
  }


  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(@Nullable String key) {
    this.key = key;
  }


  public AttributeExportData lastUpdateTs(@Nullable Long lastUpdateTs) {
    this.lastUpdateTs = lastUpdateTs;
    return this;
  }

  /**
   * Get lastUpdateTs
   * @return lastUpdateTs
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LAST_UPDATE_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLastUpdateTs() {
    return lastUpdateTs;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_UPDATE_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdateTs(@Nullable Long lastUpdateTs) {
    this.lastUpdateTs = lastUpdateTs;
  }


  public AttributeExportData booleanValue(@Nullable Boolean booleanValue) {
    this.booleanValue = booleanValue;
    return this;
  }

  /**
   * Get booleanValue
   * @return booleanValue
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BOOLEAN_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getBooleanValue() {
    return booleanValue;
  }


  @JsonProperty(value = JSON_PROPERTY_BOOLEAN_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBooleanValue(@Nullable Boolean booleanValue) {
    this.booleanValue = booleanValue;
  }


  public AttributeExportData strValue(@Nullable String strValue) {
    this.strValue = strValue;
    return this;
  }

  /**
   * Get strValue
   * @return strValue
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_STR_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStrValue() {
    return strValue;
  }


  @JsonProperty(value = JSON_PROPERTY_STR_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrValue(@Nullable String strValue) {
    this.strValue = strValue;
  }


  public AttributeExportData longValue(@Nullable Long longValue) {
    this.longValue = longValue;
    return this;
  }

  /**
   * Get longValue
   * @return longValue
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LONG_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLongValue() {
    return longValue;
  }


  @JsonProperty(value = JSON_PROPERTY_LONG_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongValue(@Nullable Long longValue) {
    this.longValue = longValue;
  }


  public AttributeExportData doubleValue(@Nullable Double doubleValue) {
    this.doubleValue = doubleValue;
    return this;
  }

  /**
   * Get doubleValue
   * @return doubleValue
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DOUBLE_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDoubleValue() {
    return doubleValue;
  }


  @JsonProperty(value = JSON_PROPERTY_DOUBLE_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDoubleValue(@Nullable Double doubleValue) {
    this.doubleValue = doubleValue;
  }


  public AttributeExportData jsonValue(@Nullable String jsonValue) {
    this.jsonValue = jsonValue;
    return this;
  }

  /**
   * Get jsonValue
   * @return jsonValue
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_JSON_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getJsonValue() {
    return jsonValue;
  }


  @JsonProperty(value = JSON_PROPERTY_JSON_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJsonValue(@Nullable String jsonValue) {
    this.jsonValue = jsonValue;
  }


  /**
   * Return true if this AttributeExportData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeExportData attributeExportData = (AttributeExportData) o;
    return Objects.equals(this.key, attributeExportData.key) &&
        Objects.equals(this.lastUpdateTs, attributeExportData.lastUpdateTs) &&
        Objects.equals(this.booleanValue, attributeExportData.booleanValue) &&
        Objects.equals(this.strValue, attributeExportData.strValue) &&
        Objects.equals(this.longValue, attributeExportData.longValue) &&
        Objects.equals(this.doubleValue, attributeExportData.doubleValue) &&
        Objects.equals(this.jsonValue, attributeExportData.jsonValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, lastUpdateTs, booleanValue, strValue, longValue, doubleValue, jsonValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeExportData {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    lastUpdateTs: ").append(toIndentedString(lastUpdateTs)).append("\n");
    sb.append("    booleanValue: ").append(toIndentedString(booleanValue)).append("\n");
    sb.append("    strValue: ").append(toIndentedString(strValue)).append("\n");
    sb.append("    longValue: ").append(toIndentedString(longValue)).append("\n");
    sb.append("    doubleValue: ").append(toIndentedString(doubleValue)).append("\n");
    sb.append("    jsonValue: ").append(toIndentedString(jsonValue)).append("\n");
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

    // add `key` to the URL query string
    if (getKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%skey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getKey()))));
    }

    // add `lastUpdateTs` to the URL query string
    if (getLastUpdateTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slastUpdateTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastUpdateTs()))));
    }

    // add `booleanValue` to the URL query string
    if (getBooleanValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbooleanValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBooleanValue()))));
    }

    // add `strValue` to the URL query string
    if (getStrValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstrValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStrValue()))));
    }

    // add `longValue` to the URL query string
    if (getLongValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slongValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLongValue()))));
    }

    // add `doubleValue` to the URL query string
    if (getDoubleValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdoubleValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDoubleValue()))));
    }

    // add `jsonValue` to the URL query string
    if (getJsonValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sjsonValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getJsonValue()))));
    }

    return joiner.toString();
  }
}

