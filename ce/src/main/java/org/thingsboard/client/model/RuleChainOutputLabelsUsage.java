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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.thingsboard.client.model.RuleChainId;
import org.thingsboard.client.model.RuleNodeId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * RuleChainOutputLabelsUsage
 */
@JsonPropertyOrder({
  RuleChainOutputLabelsUsage.JSON_PROPERTY_RULE_CHAIN_ID,
  RuleChainOutputLabelsUsage.JSON_PROPERTY_RULE_NODE_ID,
  RuleChainOutputLabelsUsage.JSON_PROPERTY_RULE_CHAIN_NAME,
  RuleChainOutputLabelsUsage.JSON_PROPERTY_RULE_NODE_NAME,
  RuleChainOutputLabelsUsage.JSON_PROPERTY_LABELS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class RuleChainOutputLabelsUsage {
  public static final String JSON_PROPERTY_RULE_CHAIN_ID = "ruleChainId";
  @javax.annotation.Nonnull
  private RuleChainId ruleChainId;

  public static final String JSON_PROPERTY_RULE_NODE_ID = "ruleNodeId";
  @javax.annotation.Nonnull
  private RuleNodeId ruleNodeId;

  public static final String JSON_PROPERTY_RULE_CHAIN_NAME = "ruleChainName";
  @javax.annotation.Nonnull
  private String ruleChainName;

  public static final String JSON_PROPERTY_RULE_NODE_NAME = "ruleNodeName";
  @javax.annotation.Nonnull
  private String ruleNodeName;

  public static final String JSON_PROPERTY_LABELS = "labels";
  @javax.annotation.Nonnull
  private Set<String> labels = new LinkedHashSet<>();

  public RuleChainOutputLabelsUsage() { 
  }

  @JsonCreator
  public RuleChainOutputLabelsUsage(
    @JsonProperty(JSON_PROPERTY_RULE_CHAIN_ID) RuleChainId ruleChainId, 
    @JsonProperty(JSON_PROPERTY_RULE_NODE_ID) RuleNodeId ruleNodeId, 
    @JsonProperty(JSON_PROPERTY_RULE_CHAIN_NAME) String ruleChainName, 
    @JsonProperty(JSON_PROPERTY_RULE_NODE_NAME) String ruleNodeName
  ) {
  this();
    this.ruleChainId = ruleChainId;
    this.ruleNodeId = ruleNodeId;
    this.ruleChainName = ruleChainName;
    this.ruleNodeName = ruleNodeName;
  }

  /**
   * Rule Chain Id
   * @return ruleChainId
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_RULE_CHAIN_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RuleChainId getRuleChainId() {
    return ruleChainId;
  }




  /**
   * Rule Node Id
   * @return ruleNodeId
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_RULE_NODE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RuleNodeId getRuleNodeId() {
    return ruleNodeId;
  }




  /**
   * Rule Chain Name
   * @return ruleChainName
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_RULE_CHAIN_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRuleChainName() {
    return ruleChainName;
  }




  /**
   * Rule Node Name
   * @return ruleNodeName
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_RULE_NODE_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRuleNodeName() {
    return ruleNodeName;
  }




  public RuleChainOutputLabelsUsage labels(@javax.annotation.Nonnull Set<String> labels) {
    this.labels = labels;
    return this;
  }

  public RuleChainOutputLabelsUsage addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new LinkedHashSet<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Output labels
   * @return labels
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_LABELS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Set<String> getLabels() {
    return labels;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_LABELS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLabels(@javax.annotation.Nonnull Set<String> labels) {
    this.labels = labels;
  }


  /**
   * Return true if this RuleChainOutputLabelsUsage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleChainOutputLabelsUsage ruleChainOutputLabelsUsage = (RuleChainOutputLabelsUsage) o;
    return Objects.equals(this.ruleChainId, ruleChainOutputLabelsUsage.ruleChainId) &&
        Objects.equals(this.ruleNodeId, ruleChainOutputLabelsUsage.ruleNodeId) &&
        Objects.equals(this.ruleChainName, ruleChainOutputLabelsUsage.ruleChainName) &&
        Objects.equals(this.ruleNodeName, ruleChainOutputLabelsUsage.ruleNodeName) &&
        Objects.equals(this.labels, ruleChainOutputLabelsUsage.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleChainId, ruleNodeId, ruleChainName, ruleNodeName, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleChainOutputLabelsUsage {\n");
    sb.append("    ruleChainId: ").append(toIndentedString(ruleChainId)).append("\n");
    sb.append("    ruleNodeId: ").append(toIndentedString(ruleNodeId)).append("\n");
    sb.append("    ruleChainName: ").append(toIndentedString(ruleChainName)).append("\n");
    sb.append("    ruleNodeName: ").append(toIndentedString(ruleNodeName)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

    // add `ruleNodeId` to the URL query string
    if (getRuleNodeId() != null) {
      joiner.add(getRuleNodeId().toUrlQueryString(prefix + "ruleNodeId" + suffix));
    }

    // add `ruleChainName` to the URL query string
    if (getRuleChainName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sruleChainName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRuleChainName()))));
    }

    // add `ruleNodeName` to the URL query string
    if (getRuleNodeName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sruleNodeName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRuleNodeName()))));
    }

    // add `labels` to the URL query string
    if (getLabels() != null) {
      int i = 0;
      for (String _item : getLabels()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%slabels%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(_item))));
      }
      i++;
    }

    return joiner.toString();
  }
}

