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
 * OtaPackageData
 */
@JsonPropertyOrder({
  OtaPackageData.JSON_PROPERTY_SHORT,
  OtaPackageData.JSON_PROPERTY_CHAR,
  OtaPackageData.JSON_PROPERTY_INT,
  OtaPackageData.JSON_PROPERTY_LONG,
  OtaPackageData.JSON_PROPERTY_FLOAT,
  OtaPackageData.JSON_PROPERTY_DOUBLE,
  OtaPackageData.JSON_PROPERTY_DIRECT,
  OtaPackageData.JSON_PROPERTY_READ_ONLY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class OtaPackageData {
  public static final String JSON_PROPERTY_SHORT = "short";
  @javax.annotation.Nullable
  private Integer _short;

  public static final String JSON_PROPERTY_CHAR = "char";
  @javax.annotation.Nullable
  private String _char;

  public static final String JSON_PROPERTY_INT = "int";
  @javax.annotation.Nullable
  private Integer _int;

  public static final String JSON_PROPERTY_LONG = "long";
  @javax.annotation.Nullable
  private Long _long;

  public static final String JSON_PROPERTY_FLOAT = "float";
  @javax.annotation.Nullable
  private Float _float;

  public static final String JSON_PROPERTY_DOUBLE = "double";
  @javax.annotation.Nullable
  private Double _double;

  public static final String JSON_PROPERTY_DIRECT = "direct";
  @javax.annotation.Nullable
  private Boolean direct;

  public static final String JSON_PROPERTY_READ_ONLY = "readOnly";
  @javax.annotation.Nullable
  private Boolean readOnly;

  public OtaPackageData() { 
  }

  public OtaPackageData _short(@javax.annotation.Nullable Integer _short) {
    this._short = _short;
    return this;
  }

  /**
   * Get _short
   * @return _short
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHORT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getShort() {
    return _short;
  }


  @JsonProperty(value = JSON_PROPERTY_SHORT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShort(@javax.annotation.Nullable Integer _short) {
    this._short = _short;
  }


  public OtaPackageData _char(@javax.annotation.Nullable String _char) {
    this._char = _char;
    return this;
  }

  /**
   * Get _char
   * @return _char
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChar() {
    return _char;
  }


  @JsonProperty(value = JSON_PROPERTY_CHAR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChar(@javax.annotation.Nullable String _char) {
    this._char = _char;
  }


  public OtaPackageData _int(@javax.annotation.Nullable Integer _int) {
    this._int = _int;
    return this;
  }

  /**
   * Get _int
   * @return _int
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getInt() {
    return _int;
  }


  @JsonProperty(value = JSON_PROPERTY_INT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInt(@javax.annotation.Nullable Integer _int) {
    this._int = _int;
  }


  public OtaPackageData _long(@javax.annotation.Nullable Long _long) {
    this._long = _long;
    return this;
  }

  /**
   * Get _long
   * @return _long
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LONG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLong() {
    return _long;
  }


  @JsonProperty(value = JSON_PROPERTY_LONG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLong(@javax.annotation.Nullable Long _long) {
    this._long = _long;
  }


  public OtaPackageData _float(@javax.annotation.Nullable Float _float) {
    this._float = _float;
    return this;
  }

  /**
   * Get _float
   * @return _float
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FLOAT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Float getFloat() {
    return _float;
  }


  @JsonProperty(value = JSON_PROPERTY_FLOAT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFloat(@javax.annotation.Nullable Float _float) {
    this._float = _float;
  }


  public OtaPackageData _double(@javax.annotation.Nullable Double _double) {
    this._double = _double;
    return this;
  }

  /**
   * Get _double
   * @return _double
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DOUBLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDouble() {
    return _double;
  }


  @JsonProperty(value = JSON_PROPERTY_DOUBLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDouble(@javax.annotation.Nullable Double _double) {
    this._double = _double;
  }


  public OtaPackageData direct(@javax.annotation.Nullable Boolean direct) {
    this.direct = direct;
    return this;
  }

  /**
   * Get direct
   * @return direct
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DIRECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDirect() {
    return direct;
  }


  @JsonProperty(value = JSON_PROPERTY_DIRECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirect(@javax.annotation.Nullable Boolean direct) {
    this.direct = direct;
  }


  public OtaPackageData readOnly(@javax.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * Get readOnly
   * @return readOnly
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_READ_ONLY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getReadOnly() {
    return readOnly;
  }


  @JsonProperty(value = JSON_PROPERTY_READ_ONLY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadOnly(@javax.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
  }


  /**
   * Return true if this OtaPackage_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtaPackageData otaPackageData = (OtaPackageData) o;
    return Objects.equals(this._short, otaPackageData._short) &&
        Objects.equals(this._char, otaPackageData._char) &&
        Objects.equals(this._int, otaPackageData._int) &&
        Objects.equals(this._long, otaPackageData._long) &&
        Objects.equals(this._float, otaPackageData._float) &&
        Objects.equals(this._double, otaPackageData._double) &&
        Objects.equals(this.direct, otaPackageData.direct) &&
        Objects.equals(this.readOnly, otaPackageData.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_short, _char, _int, _long, _float, _double, direct, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtaPackageData {\n");
    sb.append("    _short: ").append(toIndentedString(_short)).append("\n");
    sb.append("    _char: ").append(toIndentedString(_char)).append("\n");
    sb.append("    _int: ").append(toIndentedString(_int)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    direct: ").append(toIndentedString(direct)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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

    // add `short` to the URL query string
    if (getShort() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshort%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShort()))));
    }

    // add `char` to the URL query string
    if (getChar() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schar%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChar()))));
    }

    // add `int` to the URL query string
    if (getInt() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sint%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInt()))));
    }

    // add `long` to the URL query string
    if (getLong() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slong%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLong()))));
    }

    // add `float` to the URL query string
    if (getFloat() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfloat%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFloat()))));
    }

    // add `double` to the URL query string
    if (getDouble() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdouble%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDouble()))));
    }

    // add `direct` to the URL query string
    if (getDirect() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdirect%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDirect()))));
    }

    // add `readOnly` to the URL query string
    if (getReadOnly() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreadOnly%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReadOnly()))));
    }

    return joiner.toString();
  }
}

