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
import org.openapitools.jackson.nullable.JsonNullable;
import org.thingsboard.client.model.DataType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TsKvEntry
 */
@JsonPropertyOrder({
  TsKvEntry.JSON_PROPERTY_TS,
  TsKvEntry.JSON_PROPERTY_VALUE,
  TsKvEntry.JSON_PROPERTY_KEY,
  TsKvEntry.JSON_PROPERTY_DOUBLE_VALUE,
  TsKvEntry.JSON_PROPERTY_LONG_VALUE,
  TsKvEntry.JSON_PROPERTY_BOOLEAN_VALUE,
  TsKvEntry.JSON_PROPERTY_VALUE_AS_STRING,
  TsKvEntry.JSON_PROPERTY_DATA_TYPE,
  TsKvEntry.JSON_PROPERTY_JSON_VALUE,
  TsKvEntry.JSON_PROPERTY_STR_VALUE,
  TsKvEntry.JSON_PROPERTY_VERSION
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TsKvEntry {
  public static final String JSON_PROPERTY_TS = "ts";
  @Nullable
  private Long ts;

  public static final String JSON_PROPERTY_VALUE = "value";
  private JsonNullable<Object> value = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_KEY = "key";
  @Nullable
  private String key;

  public static final String JSON_PROPERTY_DOUBLE_VALUE = "doubleValue";
  @Nullable
  private Double doubleValue;

  public static final String JSON_PROPERTY_LONG_VALUE = "longValue";
  @Nullable
  private Long longValue;

  public static final String JSON_PROPERTY_BOOLEAN_VALUE = "booleanValue";
  @Nullable
  private Boolean booleanValue;

  public static final String JSON_PROPERTY_VALUE_AS_STRING = "valueAsString";
  @Nullable
  private String valueAsString;

  public static final String JSON_PROPERTY_DATA_TYPE = "dataType";
  @Nullable
  private DataType dataType;

  public static final String JSON_PROPERTY_JSON_VALUE = "jsonValue";
  @Nullable
  private String jsonValue;

  public static final String JSON_PROPERTY_STR_VALUE = "strValue";
  @Nullable
  private String strValue;

  public static final String JSON_PROPERTY_VERSION = "version";
  @Nullable
  private Long version;

  public TsKvEntry() { 
  }

  public TsKvEntry ts(@Nullable Long ts) {
    this.ts = ts;
    return this;
  }

  /**
   * Get ts
   * @return ts
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTs() {
    return ts;
  }


  @JsonProperty(value = JSON_PROPERTY_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTs(@Nullable Long ts) {
    this.ts = ts;
  }


  public TsKvEntry value(@Nullable Object value) {
    this.value = JsonNullable.<Object>of(value);
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @Nullable
  @JsonIgnore
  public Object getValue() {
        return value.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getValue_JsonNullable() {
    return value;
  }
  
  @JsonProperty(JSON_PROPERTY_VALUE)
  public void setValue_JsonNullable(JsonNullable<Object> value) {
    this.value = value;
  }

  public void setValue(@Nullable Object value) {
    this.value = JsonNullable.<Object>of(value);
  }


  public TsKvEntry key(@Nullable String key) {
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


  public TsKvEntry doubleValue(@Nullable Double doubleValue) {
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


  public TsKvEntry longValue(@Nullable Long longValue) {
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


  public TsKvEntry booleanValue(@Nullable Boolean booleanValue) {
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


  public TsKvEntry valueAsString(@Nullable String valueAsString) {
    this.valueAsString = valueAsString;
    return this;
  }

  /**
   * Get valueAsString
   * @return valueAsString
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_VALUE_AS_STRING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getValueAsString() {
    return valueAsString;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUE_AS_STRING, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueAsString(@Nullable String valueAsString) {
    this.valueAsString = valueAsString;
  }


  public TsKvEntry dataType(@Nullable DataType dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Get dataType
   * @return dataType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DATA_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DataType getDataType() {
    return dataType;
  }


  @JsonProperty(value = JSON_PROPERTY_DATA_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataType(@Nullable DataType dataType) {
    this.dataType = dataType;
  }


  public TsKvEntry jsonValue(@Nullable String jsonValue) {
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


  public TsKvEntry strValue(@Nullable String strValue) {
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


  public TsKvEntry version(@Nullable Long version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@Nullable Long version) {
    this.version = version;
  }


  /**
   * Return true if this TsKvEntry object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TsKvEntry tsKvEntry = (TsKvEntry) o;
    return Objects.equals(this.ts, tsKvEntry.ts) &&
        equalsNullable(this.value, tsKvEntry.value) &&
        Objects.equals(this.key, tsKvEntry.key) &&
        Objects.equals(this.doubleValue, tsKvEntry.doubleValue) &&
        Objects.equals(this.longValue, tsKvEntry.longValue) &&
        Objects.equals(this.booleanValue, tsKvEntry.booleanValue) &&
        Objects.equals(this.valueAsString, tsKvEntry.valueAsString) &&
        Objects.equals(this.dataType, tsKvEntry.dataType) &&
        Objects.equals(this.jsonValue, tsKvEntry.jsonValue) &&
        Objects.equals(this.strValue, tsKvEntry.strValue) &&
        Objects.equals(this.version, tsKvEntry.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ts, hashCodeNullable(value), key, doubleValue, longValue, booleanValue, valueAsString, dataType, jsonValue, strValue, version);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TsKvEntry {\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    doubleValue: ").append(toIndentedString(doubleValue)).append("\n");
    sb.append("    longValue: ").append(toIndentedString(longValue)).append("\n");
    sb.append("    booleanValue: ").append(toIndentedString(booleanValue)).append("\n");
    sb.append("    valueAsString: ").append(toIndentedString(valueAsString)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    jsonValue: ").append(toIndentedString(jsonValue)).append("\n");
    sb.append("    strValue: ").append(toIndentedString(strValue)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

    // add `key` to the URL query string
    if (getKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%skey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getKey()))));
    }

    // add `doubleValue` to the URL query string
    if (getDoubleValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdoubleValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDoubleValue()))));
    }

    // add `longValue` to the URL query string
    if (getLongValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slongValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLongValue()))));
    }

    // add `booleanValue` to the URL query string
    if (getBooleanValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sbooleanValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBooleanValue()))));
    }

    // add `valueAsString` to the URL query string
    if (getValueAsString() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svalueAsString%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getValueAsString()))));
    }

    // add `dataType` to the URL query string
    if (getDataType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdataType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDataType()))));
    }

    // add `jsonValue` to the URL query string
    if (getJsonValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sjsonValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getJsonValue()))));
    }

    // add `strValue` to the URL query string
    if (getStrValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstrValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStrValue()))));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    return joiner.toString();
  }
}

