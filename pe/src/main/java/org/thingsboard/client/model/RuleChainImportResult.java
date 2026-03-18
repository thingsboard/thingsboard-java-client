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
import org.thingsboard.client.model.RuleChainId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * RuleChainImportResult
 */
@JsonPropertyOrder({
  RuleChainImportResult.JSON_PROPERTY_RULE_CHAIN_ID,
  RuleChainImportResult.JSON_PROPERTY_RULE_CHAIN_NAME,
  RuleChainImportResult.JSON_PROPERTY_UPDATED,
  RuleChainImportResult.JSON_PROPERTY_ERROR
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class RuleChainImportResult {
  public static final String JSON_PROPERTY_RULE_CHAIN_ID = "ruleChainId";
  @Nullable
  private RuleChainId ruleChainId;

  public static final String JSON_PROPERTY_RULE_CHAIN_NAME = "ruleChainName";
  @Nullable
  private String ruleChainName;

  public static final String JSON_PROPERTY_UPDATED = "updated";
  @Nullable
  private Boolean updated;

  public static final String JSON_PROPERTY_ERROR = "error";
  @Nullable
  private String error;

  public RuleChainImportResult() { 
  }

  public RuleChainImportResult ruleChainId(@Nullable RuleChainId ruleChainId) {
    this.ruleChainId = ruleChainId;
    return this;
  }

  /**
   * Get ruleChainId
   * @return ruleChainId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RULE_CHAIN_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RuleChainId getRuleChainId() {
    return ruleChainId;
  }


  @JsonProperty(value = JSON_PROPERTY_RULE_CHAIN_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleChainId(@Nullable RuleChainId ruleChainId) {
    this.ruleChainId = ruleChainId;
  }


  public RuleChainImportResult ruleChainName(@Nullable String ruleChainName) {
    this.ruleChainName = ruleChainName;
    return this;
  }

  /**
   * Get ruleChainName
   * @return ruleChainName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RULE_CHAIN_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRuleChainName() {
    return ruleChainName;
  }


  @JsonProperty(value = JSON_PROPERTY_RULE_CHAIN_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleChainName(@Nullable String ruleChainName) {
    this.ruleChainName = ruleChainName;
  }


  public RuleChainImportResult updated(@Nullable Boolean updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_UPDATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUpdated() {
    return updated;
  }


  @JsonProperty(value = JSON_PROPERTY_UPDATED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdated(@Nullable Boolean updated) {
    this.updated = updated;
  }


  public RuleChainImportResult error(@Nullable String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ERROR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getError() {
    return error;
  }


  @JsonProperty(value = JSON_PROPERTY_ERROR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(@Nullable String error) {
    this.error = error;
  }


  /**
   * Return true if this RuleChainImportResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleChainImportResult ruleChainImportResult = (RuleChainImportResult) o;
    return Objects.equals(this.ruleChainId, ruleChainImportResult.ruleChainId) &&
        Objects.equals(this.ruleChainName, ruleChainImportResult.ruleChainName) &&
        Objects.equals(this.updated, ruleChainImportResult.updated) &&
        Objects.equals(this.error, ruleChainImportResult.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleChainId, ruleChainName, updated, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleChainImportResult {\n");
    sb.append("    ruleChainId: ").append(toIndentedString(ruleChainId)).append("\n");
    sb.append("    ruleChainName: ").append(toIndentedString(ruleChainName)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

    // add `ruleChainId` to the URL query string
    if (getRuleChainId() != null) {
      joiner.add(getRuleChainId().toUrlQueryString(prefix + "ruleChainId" + suffix));
    }

    // add `ruleChainName` to the URL query string
    if (getRuleChainName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sruleChainName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRuleChainName()))));
    }

    // add `updated` to the URL query string
    if (getUpdated() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%supdated%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUpdated()))));
    }

    // add `error` to the URL query string
    if (getError() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%serror%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getError()))));
    }

    return joiner.toString();
  }
}

