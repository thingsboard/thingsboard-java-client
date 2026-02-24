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
import org.thingsboard.client.model.RuleChainId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * RuleChainConnectionInfo
 */
@JsonPropertyOrder({
  RuleChainConnectionInfo.JSON_PROPERTY_FROM_INDEX,
  RuleChainConnectionInfo.JSON_PROPERTY_TARGET_RULE_CHAIN_ID,
  RuleChainConnectionInfo.JSON_PROPERTY_ADDITIONAL_INFO,
  RuleChainConnectionInfo.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class RuleChainConnectionInfo {
  public static final String JSON_PROPERTY_FROM_INDEX = "fromIndex";
  @javax.annotation.Nonnull
  private Integer fromIndex;

  public static final String JSON_PROPERTY_TARGET_RULE_CHAIN_ID = "targetRuleChainId";
  @javax.annotation.Nonnull
  private RuleChainId targetRuleChainId;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @javax.annotation.Nonnull
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull
  private String type;

  public RuleChainConnectionInfo() { 
  }

  public RuleChainConnectionInfo fromIndex(@javax.annotation.Nonnull Integer fromIndex) {
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


  public RuleChainConnectionInfo targetRuleChainId(@javax.annotation.Nonnull RuleChainId targetRuleChainId) {
    this.targetRuleChainId = targetRuleChainId;
    return this;
  }

  /**
   * JSON object with the Rule Chain Id.
   * @return targetRuleChainId
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TARGET_RULE_CHAIN_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RuleChainId getTargetRuleChainId() {
    return targetRuleChainId;
  }


  @JsonProperty(value = JSON_PROPERTY_TARGET_RULE_CHAIN_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetRuleChainId(@javax.annotation.Nonnull RuleChainId targetRuleChainId) {
    this.targetRuleChainId = targetRuleChainId;
  }


  public RuleChainConnectionInfo additionalInfo(@javax.annotation.Nonnull com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * JSON object with the additional information about the connection.
   * @return additionalInfo
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public com.fasterxml.jackson.databind.JsonNode getAdditionalInfo() {
    return additionalInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAdditionalInfo(@javax.annotation.Nonnull com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public RuleChainConnectionInfo type(@javax.annotation.Nonnull String type) {
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
   * Return true if this RuleChainConnectionInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleChainConnectionInfo ruleChainConnectionInfo = (RuleChainConnectionInfo) o;
    return Objects.equals(this.fromIndex, ruleChainConnectionInfo.fromIndex) &&
        Objects.equals(this.targetRuleChainId, ruleChainConnectionInfo.targetRuleChainId) &&
        Objects.equals(this.additionalInfo, ruleChainConnectionInfo.additionalInfo) &&
        Objects.equals(this.type, ruleChainConnectionInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromIndex, targetRuleChainId, additionalInfo, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleChainConnectionInfo {\n");
    sb.append("    fromIndex: ").append(toIndentedString(fromIndex)).append("\n");
    sb.append("    targetRuleChainId: ").append(toIndentedString(targetRuleChainId)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

    // add `targetRuleChainId` to the URL query string
    if (getTargetRuleChainId() != null) {
      joiner.add(getTargetRuleChainId().toUrlQueryString(prefix + "targetRuleChainId" + suffix));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    return joiner.toString();
  }
}

