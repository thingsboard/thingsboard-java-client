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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.thingsboard.client.model.ColumnMapping;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Mapping
 */
@JsonPropertyOrder({
  Mapping.JSON_PROPERTY_COLUMNS,
  Mapping.JSON_PROPERTY_DELIMITER,
  Mapping.JSON_PROPERTY_UPDATE,
  Mapping.JSON_PROPERTY_HEADER
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class Mapping {
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  @Nullable
  private List<ColumnMapping> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_DELIMITER = "delimiter";
  @Nullable
  private String delimiter;

  public static final String JSON_PROPERTY_UPDATE = "update";
  @Nullable
  private Boolean update;

  public static final String JSON_PROPERTY_HEADER = "header";
  @Nullable
  private Boolean header;

  public Mapping() { 
  }

  public Mapping columns(@Nullable List<ColumnMapping> columns) {
    this.columns = columns;
    return this;
  }

  public Mapping addColumnsItem(ColumnMapping columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * Get columns
   * @return columns
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_COLUMNS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ColumnMapping> getColumns() {
    return columns;
  }


  @JsonProperty(value = JSON_PROPERTY_COLUMNS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColumns(@Nullable List<ColumnMapping> columns) {
    this.columns = columns;
  }


  public Mapping delimiter(@Nullable String delimiter) {
    this.delimiter = delimiter;
    return this;
  }

  /**
   * Get delimiter
   * @return delimiter
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DELIMITER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDelimiter() {
    return delimiter;
  }


  @JsonProperty(value = JSON_PROPERTY_DELIMITER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelimiter(@Nullable String delimiter) {
    this.delimiter = delimiter;
  }


  public Mapping update(@Nullable Boolean update) {
    this.update = update;
    return this;
  }

  /**
   * Get update
   * @return update
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_UPDATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUpdate() {
    return update;
  }


  @JsonProperty(value = JSON_PROPERTY_UPDATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdate(@Nullable Boolean update) {
    this.update = update;
  }


  public Mapping header(@Nullable Boolean header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_HEADER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHeader() {
    return header;
  }


  @JsonProperty(value = JSON_PROPERTY_HEADER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeader(@Nullable Boolean header) {
    this.header = header;
  }


  /**
   * Return true if this Mapping object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mapping mapping = (Mapping) o;
    return Objects.equals(this.columns, mapping.columns) &&
        Objects.equals(this.delimiter, mapping.delimiter) &&
        Objects.equals(this.update, mapping.update) &&
        Objects.equals(this.header, mapping.header);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, delimiter, update, header);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mapping {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
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

    // add `columns` to the URL query string
    if (getColumns() != null) {
      for (int i = 0; i < getColumns().size(); i++) {
        if (getColumns().get(i) != null) {
          joiner.add(getColumns().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%scolumns%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `delimiter` to the URL query string
    if (getDelimiter() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdelimiter%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDelimiter()))));
    }

    // add `update` to the URL query string
    if (getUpdate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%supdate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUpdate()))));
    }

    // add `header` to the URL query string
    if (getHeader() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sheader%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHeader()))));
    }

    return joiner.toString();
  }
}

