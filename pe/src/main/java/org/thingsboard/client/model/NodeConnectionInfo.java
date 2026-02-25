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
 * NodeConnectionInfo
 */
@JsonPropertyOrder({
  NodeConnectionInfo.JSON_PROPERTY_FROM_INDEX,
  NodeConnectionInfo.JSON_PROPERTY_TO_INDEX,
  NodeConnectionInfo.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class NodeConnectionInfo {
  public static final String JSON_PROPERTY_FROM_INDEX = "fromIndex";
  @javax.annotation.Nonnull
  private Integer fromIndex;

  public static final String JSON_PROPERTY_TO_INDEX = "toIndex";
  @javax.annotation.Nonnull
  private Integer toIndex;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull
  private String type;

  public NodeConnectionInfo() { 
  }

  public NodeConnectionInfo fromIndex(@javax.annotation.Nonnull Integer fromIndex) {
    this.fromIndex = fromIndex;
    return this;
  }

  /**
   * Index of rule node in the &#39;nodes&#39; array of the RuleChainMetaData. Indicates the &#39;from&#39; part of the connection.
   * @return fromIndex
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FROM_INDEX, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getFromIndex() {
    return fromIndex;
  }


  @JsonProperty(value = JSON_PROPERTY_FROM_INDEX, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFromIndex(@javax.annotation.Nonnull Integer fromIndex) {
    this.fromIndex = fromIndex;
  }


  public NodeConnectionInfo toIndex(@javax.annotation.Nonnull Integer toIndex) {
    this.toIndex = toIndex;
    return this;
  }

  /**
   * Index of rule node in the &#39;nodes&#39; array of the RuleChainMetaData. Indicates the &#39;to&#39; part of the connection.
   * @return toIndex
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TO_INDEX, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getToIndex() {
    return toIndex;
  }


  @JsonProperty(value = JSON_PROPERTY_TO_INDEX, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToIndex(@javax.annotation.Nonnull Integer toIndex) {
    this.toIndex = toIndex;
  }


  public NodeConnectionInfo type(@javax.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the relation. Typically indicated the result of processing by the &#39;from&#39; rule node. For example, &#39;Success&#39; or &#39;Failure&#39;
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull String type) {
    this.type = type;
  }


  /**
   * Return true if this NodeConnectionInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeConnectionInfo nodeConnectionInfo = (NodeConnectionInfo) o;
    return Objects.equals(this.fromIndex, nodeConnectionInfo.fromIndex) &&
        Objects.equals(this.toIndex, nodeConnectionInfo.toIndex) &&
        Objects.equals(this.type, nodeConnectionInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromIndex, toIndex, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeConnectionInfo {\n");
    sb.append("    fromIndex: ").append(toIndentedString(fromIndex)).append("\n");
    sb.append("    toIndex: ").append(toIndentedString(toIndex)).append("\n");
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

    // add `fromIndex` to the URL query string
    if (getFromIndex() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfromIndex%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFromIndex()))));
    }

    // add `toIndex` to the URL query string
    if (getToIndex() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stoIndex%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getToIndex()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    return joiner.toString();
  }
}

