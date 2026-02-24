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
import org.thingsboard.client.model.ConvertersInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * IntegrationConvertersInfo
 */
@JsonPropertyOrder({
  IntegrationConvertersInfo.JSON_PROPERTY_UPLINK,
  IntegrationConvertersInfo.JSON_PROPERTY_DOWNLINK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class IntegrationConvertersInfo {
  public static final String JSON_PROPERTY_UPLINK = "uplink";
  @javax.annotation.Nullable
  private ConvertersInfo uplink;

  public static final String JSON_PROPERTY_DOWNLINK = "downlink";
  @javax.annotation.Nullable
  private ConvertersInfo downlink;

  public IntegrationConvertersInfo() { 
  }

  public IntegrationConvertersInfo uplink(@javax.annotation.Nullable ConvertersInfo uplink) {
    this.uplink = uplink;
    return this;
  }

  /**
   * Get uplink
   * @return uplink
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_UPLINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ConvertersInfo getUplink() {
    return uplink;
  }


  @JsonProperty(value = JSON_PROPERTY_UPLINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUplink(@javax.annotation.Nullable ConvertersInfo uplink) {
    this.uplink = uplink;
  }


  public IntegrationConvertersInfo downlink(@javax.annotation.Nullable ConvertersInfo downlink) {
    this.downlink = downlink;
    return this;
  }

  /**
   * Get downlink
   * @return downlink
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DOWNLINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ConvertersInfo getDownlink() {
    return downlink;
  }


  @JsonProperty(value = JSON_PROPERTY_DOWNLINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownlink(@javax.annotation.Nullable ConvertersInfo downlink) {
    this.downlink = downlink;
  }


  /**
   * Return true if this IntegrationConvertersInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationConvertersInfo integrationConvertersInfo = (IntegrationConvertersInfo) o;
    return Objects.equals(this.uplink, integrationConvertersInfo.uplink) &&
        Objects.equals(this.downlink, integrationConvertersInfo.downlink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uplink, downlink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationConvertersInfo {\n");
    sb.append("    uplink: ").append(toIndentedString(uplink)).append("\n");
    sb.append("    downlink: ").append(toIndentedString(downlink)).append("\n");
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

    // add `uplink` to the URL query string
    if (getUplink() != null) {
      joiner.add(getUplink().toUrlQueryString(prefix + "uplink" + suffix));
    }

    // add `downlink` to the URL query string
    if (getDownlink() != null) {
      joiner.add(getDownlink().toUrlQueryString(prefix + "downlink" + suffix));
    }

    return joiner.toString();
  }
}

