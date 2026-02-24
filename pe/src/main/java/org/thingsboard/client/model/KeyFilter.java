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
import org.thingsboard.client.model.EntityKey;
import org.thingsboard.client.model.EntityKeyValueType;
import org.thingsboard.client.model.KeyFilterPredicate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * KeyFilter
 */
@JsonPropertyOrder({
  KeyFilter.JSON_PROPERTY_KEY,
  KeyFilter.JSON_PROPERTY_VALUE_TYPE,
  KeyFilter.JSON_PROPERTY_PREDICATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class KeyFilter {
  public static final String JSON_PROPERTY_KEY = "key";
  @javax.annotation.Nullable
  private EntityKey key;

  public static final String JSON_PROPERTY_VALUE_TYPE = "valueType";
  @javax.annotation.Nullable
  private EntityKeyValueType valueType;

  public static final String JSON_PROPERTY_PREDICATE = "predicate";
  @javax.annotation.Nullable
  private KeyFilterPredicate predicate;

  public KeyFilter() { 
  }

  public KeyFilter key(@javax.annotation.Nullable EntityKey key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityKey getKey() {
    return key;
  }


  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(@javax.annotation.Nullable EntityKey key) {
    this.key = key;
  }


  public KeyFilter valueType(@javax.annotation.Nullable EntityKeyValueType valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * Get valueType
   * @return valueType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VALUE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityKeyValueType getValueType() {
    return valueType;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueType(@javax.annotation.Nullable EntityKeyValueType valueType) {
    this.valueType = valueType;
  }


  public KeyFilter predicate(@javax.annotation.Nullable KeyFilterPredicate predicate) {
    this.predicate = predicate;
    return this;
  }

  /**
   * Get predicate
   * @return predicate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PREDICATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public KeyFilterPredicate getPredicate() {
    return predicate;
  }


  @JsonProperty(value = JSON_PROPERTY_PREDICATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPredicate(@javax.annotation.Nullable KeyFilterPredicate predicate) {
    this.predicate = predicate;
  }


  /**
   * Return true if this KeyFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyFilter keyFilter = (KeyFilter) o;
    return Objects.equals(this.key, keyFilter.key) &&
        Objects.equals(this.valueType, keyFilter.valueType) &&
        Objects.equals(this.predicate, keyFilter.predicate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, valueType, predicate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyFilter {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    predicate: ").append(toIndentedString(predicate)).append("\n");
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
      joiner.add(getKey().toUrlQueryString(prefix + "key" + suffix));
    }

    // add `valueType` to the URL query string
    if (getValueType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svalueType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getValueType()))));
    }

    // add `predicate` to the URL query string
    if (getPredicate() != null) {
      joiner.add(getPredicate().toUrlQueryString(prefix + "predicate" + suffix));
    }

    return joiner.toString();
  }
}

