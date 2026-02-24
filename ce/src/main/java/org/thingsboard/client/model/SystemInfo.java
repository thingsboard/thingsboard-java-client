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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.thingsboard.client.model.SystemInfoData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * SystemInfo
 */
@JsonPropertyOrder({
  SystemInfo.JSON_PROPERTY_SYSTEM_DATA,
  SystemInfo.JSON_PROPERTY_MONOLITH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class SystemInfo {
  public static final String JSON_PROPERTY_SYSTEM_DATA = "systemData";
  @javax.annotation.Nullable
  private List<SystemInfoData> systemData = new ArrayList<>();

  public static final String JSON_PROPERTY_MONOLITH = "monolith";
  @javax.annotation.Nullable
  private Boolean monolith;

  public SystemInfo() { 
  }

  public SystemInfo systemData(@javax.annotation.Nullable List<SystemInfoData> systemData) {
    this.systemData = systemData;
    return this;
  }

  public SystemInfo addSystemDataItem(SystemInfoData systemDataItem) {
    if (this.systemData == null) {
      this.systemData = new ArrayList<>();
    }
    this.systemData.add(systemDataItem);
    return this;
  }

  /**
   * System data.
   * @return systemData
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SYSTEM_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SystemInfoData> getSystemData() {
    return systemData;
  }


  @JsonProperty(value = JSON_PROPERTY_SYSTEM_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystemData(@javax.annotation.Nullable List<SystemInfoData> systemData) {
    this.systemData = systemData;
  }


  public SystemInfo monolith(@javax.annotation.Nullable Boolean monolith) {
    this.monolith = monolith;
    return this;
  }

  /**
   * Get monolith
   * @return monolith
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MONOLITH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMonolith() {
    return monolith;
  }


  @JsonProperty(value = JSON_PROPERTY_MONOLITH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonolith(@javax.annotation.Nullable Boolean monolith) {
    this.monolith = monolith;
  }


  /**
   * Return true if this SystemInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemInfo systemInfo = (SystemInfo) o;
    return Objects.equals(this.systemData, systemInfo.systemData) &&
        Objects.equals(this.monolith, systemInfo.monolith);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemData, monolith);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemInfo {\n");
    sb.append("    systemData: ").append(toIndentedString(systemData)).append("\n");
    sb.append("    monolith: ").append(toIndentedString(monolith)).append("\n");
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

    // add `systemData` to the URL query string
    if (getSystemData() != null) {
      for (int i = 0; i < getSystemData().size(); i++) {
        if (getSystemData().get(i) != null) {
          joiner.add(getSystemData().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%ssystemData%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `monolith` to the URL query string
    if (getMonolith() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smonolith%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMonolith()))));
    }

    return joiner.toString();
  }
}

