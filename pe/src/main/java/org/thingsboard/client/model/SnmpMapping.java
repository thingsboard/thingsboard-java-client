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
import org.thingsboard.client.model.DataType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * SnmpMapping
 */
@JsonPropertyOrder({
  SnmpMapping.JSON_PROPERTY_OID,
  SnmpMapping.JSON_PROPERTY_KEY,
  SnmpMapping.JSON_PROPERTY_DATA_TYPE
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class SnmpMapping {
  public static final String JSON_PROPERTY_OID = "oid";
  @Nullable
  private String oid;

  public static final String JSON_PROPERTY_KEY = "key";
  @Nullable
  private String key;

  public static final String JSON_PROPERTY_DATA_TYPE = "dataType";
  @Nullable
  private DataType dataType;

  public SnmpMapping() { 
  }

  public SnmpMapping oid(@Nullable String oid) {
    this.oid = oid;
    return this;
  }

  /**
   * Get oid
   * @return oid
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_OID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOid() {
    return oid;
  }


  @JsonProperty(value = JSON_PROPERTY_OID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOid(@Nullable String oid) {
    this.oid = oid;
  }


  public SnmpMapping key(@Nullable String key) {
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


  public SnmpMapping dataType(@Nullable DataType dataType) {
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


  /**
   * Return true if this SnmpMapping object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnmpMapping snmpMapping = (SnmpMapping) o;
    return Objects.equals(this.oid, snmpMapping.oid) &&
        Objects.equals(this.key, snmpMapping.key) &&
        Objects.equals(this.dataType, snmpMapping.dataType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oid, key, dataType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnmpMapping {\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
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

    // add `oid` to the URL query string
    if (getOid() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOid()))));
    }

    // add `key` to the URL query string
    if (getKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%skey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getKey()))));
    }

    // add `dataType` to the URL query string
    if (getDataType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdataType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDataType()))));
    }

    return joiner.toString();
  }
}

