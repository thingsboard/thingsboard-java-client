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
import javax.annotation.Nonnull;
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
import org.thingsboard.client.model.CellSettings;
import org.thingsboard.client.model.DataKeySettingsType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ColumnSettings
 */
@JsonPropertyOrder({
  ColumnSettings.JSON_PROPERTY_COLUMN_WIDTH,
  ColumnSettings.JSON_PROPERTY_HEADER,
  ColumnSettings.JSON_PROPERTY_CELL,
  ColumnSettings.JSON_PROPERTY_TYPE
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class ColumnSettings {
  public static final String JSON_PROPERTY_COLUMN_WIDTH = "columnWidth";
  @Nullable
  private String columnWidth;

  public static final String JSON_PROPERTY_HEADER = "header";
  @Nullable
  private CellSettings header;

  public static final String JSON_PROPERTY_CELL = "cell";
  @Nullable
  private CellSettings cell;

  public static final String JSON_PROPERTY_TYPE = "type";
  @Nonnull
  private DataKeySettingsType type;

  public ColumnSettings() { 
  }

  public ColumnSettings columnWidth(@Nullable String columnWidth) {
    this.columnWidth = columnWidth;
    return this;
  }

  /**
   * Get columnWidth
   * @return columnWidth
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_COLUMN_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getColumnWidth() {
    return columnWidth;
  }


  @JsonProperty(value = JSON_PROPERTY_COLUMN_WIDTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColumnWidth(@Nullable String columnWidth) {
    this.columnWidth = columnWidth;
  }


  public ColumnSettings header(@Nullable CellSettings header) {
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
  public CellSettings getHeader() {
    return header;
  }


  @JsonProperty(value = JSON_PROPERTY_HEADER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeader(@Nullable CellSettings header) {
    this.header = header;
  }


  public ColumnSettings cell(@Nullable CellSettings cell) {
    this.cell = cell;
    return this;
  }

  /**
   * Get cell
   * @return cell
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CELL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CellSettings getCell() {
    return cell;
  }


  @JsonProperty(value = JSON_PROPERTY_CELL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCell(@Nullable CellSettings cell) {
    this.cell = cell;
  }


  public ColumnSettings type(@Nonnull DataKeySettingsType type) {
    this.type = type;
    return this;
  }

  /**
   * Data key settings type
   * @return type
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DataKeySettingsType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@Nonnull DataKeySettingsType type) {
    this.type = type;
  }


  /**
   * Return true if this ColumnSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnSettings columnSettings = (ColumnSettings) o;
    return Objects.equals(this.columnWidth, columnSettings.columnWidth) &&
        Objects.equals(this.header, columnSettings.header) &&
        Objects.equals(this.cell, columnSettings.cell) &&
        Objects.equals(this.type, columnSettings.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnWidth, header, cell, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnSettings {\n");
    sb.append("    columnWidth: ").append(toIndentedString(columnWidth)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    cell: ").append(toIndentedString(cell)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // add `columnWidth` to the URL query string
    if (getColumnWidth() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scolumnWidth%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getColumnWidth()))));
    }

    // add `header` to the URL query string
    if (getHeader() != null) {
      joiner.add(getHeader().toUrlQueryString(prefix + "header" + suffix));
    }

    // add `cell` to the URL query string
    if (getCell() != null) {
      joiner.add(getCell().toUrlQueryString(prefix + "cell" + suffix));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    return joiner.toString();
  }
}

