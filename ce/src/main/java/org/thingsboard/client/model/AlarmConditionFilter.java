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
import org.thingsboard.client.model.AlarmConditionFilterKey;
import org.thingsboard.client.model.EntityKeyValueType;
import org.thingsboard.client.model.KeyFilterPredicate;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AlarmConditionFilter
 */
@JsonPropertyOrder({
  AlarmConditionFilter.JSON_PROPERTY_VALUE_TYPE,
  AlarmConditionFilter.JSON_PROPERTY_KEY,
  AlarmConditionFilter.JSON_PROPERTY_PREDICATE,
  AlarmConditionFilter.JSON_PROPERTY_VALUE
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AlarmConditionFilter {
  public static final String JSON_PROPERTY_VALUE_TYPE = "valueType";
  @Nullable
  private EntityKeyValueType valueType;

  public static final String JSON_PROPERTY_KEY = "key";
  @Nullable
  private AlarmConditionFilterKey key;

  public static final String JSON_PROPERTY_PREDICATE = "predicate";
  @Nullable
  private KeyFilterPredicate predicate;

  public static final String JSON_PROPERTY_VALUE = "value";
  private JsonNullable<Object> value = JsonNullable.<Object>of(null);

  public AlarmConditionFilter() { 
  }

  public AlarmConditionFilter valueType(@Nullable EntityKeyValueType valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * String representation of the type of the value
   * @return valueType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_VALUE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityKeyValueType getValueType() {
    return valueType;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueType(@Nullable EntityKeyValueType valueType) {
    this.valueType = valueType;
  }


  public AlarmConditionFilter key(@Nullable AlarmConditionFilterKey key) {
    this.key = key;
    return this;
  }

  /**
   * JSON object for specifying alarm condition by specific key
   * @return key
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AlarmConditionFilterKey getKey() {
    return key;
  }


  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(@Nullable AlarmConditionFilterKey key) {
    this.key = key;
  }


  public AlarmConditionFilter predicate(@Nullable KeyFilterPredicate predicate) {
    this.predicate = predicate;
    return this;
  }

  /**
   * JSON object representing filter condition
   * @return predicate
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PREDICATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public KeyFilterPredicate getPredicate() {
    return predicate;
  }


  @JsonProperty(value = JSON_PROPERTY_PREDICATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPredicate(@Nullable KeyFilterPredicate predicate) {
    this.predicate = predicate;
  }


  public AlarmConditionFilter value(@Nullable Object value) {
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


  /**
   * Return true if this AlarmConditionFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmConditionFilter alarmConditionFilter = (AlarmConditionFilter) o;
    return Objects.equals(this.valueType, alarmConditionFilter.valueType) &&
        Objects.equals(this.key, alarmConditionFilter.key) &&
        Objects.equals(this.predicate, alarmConditionFilter.predicate) &&
        equalsNullable(this.value, alarmConditionFilter.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueType, key, predicate, hashCodeNullable(value));
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
    sb.append("class AlarmConditionFilter {\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    predicate: ").append(toIndentedString(predicate)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

    // add `valueType` to the URL query string
    if (getValueType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svalueType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getValueType()))));
    }

    // add `key` to the URL query string
    if (getKey() != null) {
      joiner.add(getKey().toUrlQueryString(prefix + "key" + suffix));
    }

    // add `predicate` to the URL query string
    if (getPredicate() != null) {
      joiner.add(getPredicate().toUrlQueryString(prefix + "predicate" + suffix));
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svalue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getValue()))));
    }

    return joiner.toString();
  }
}

