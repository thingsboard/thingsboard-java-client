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
import org.thingsboard.client.model.NodeConnectionInfo;
import org.thingsboard.client.model.RuleChainConnectionInfo;
import org.thingsboard.client.model.RuleChainId;
import org.thingsboard.client.model.RuleNode;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the rule chain metadata.
 */
@JsonPropertyOrder({
  RuleChainMetaData.JSON_PROPERTY_RULE_CHAIN_ID,
  RuleChainMetaData.JSON_PROPERTY_VERSION,
  RuleChainMetaData.JSON_PROPERTY_FIRST_NODE_INDEX,
  RuleChainMetaData.JSON_PROPERTY_NODES,
  RuleChainMetaData.JSON_PROPERTY_CONNECTIONS,
  RuleChainMetaData.JSON_PROPERTY_RULE_CHAIN_CONNECTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class RuleChainMetaData {
  public static final String JSON_PROPERTY_RULE_CHAIN_ID = "ruleChainId";
  @javax.annotation.Nonnull
  private RuleChainId ruleChainId;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Long version;

  public static final String JSON_PROPERTY_FIRST_NODE_INDEX = "firstNodeIndex";
  @javax.annotation.Nonnull
  private Integer firstNodeIndex;

  public static final String JSON_PROPERTY_NODES = "nodes";
  @javax.annotation.Nonnull
  private List<RuleNode> nodes = new ArrayList<>();

  public static final String JSON_PROPERTY_CONNECTIONS = "connections";
  @javax.annotation.Nonnull
  private List<NodeConnectionInfo> connections = new ArrayList<>();

  public static final String JSON_PROPERTY_RULE_CHAIN_CONNECTIONS = "ruleChainConnections";
  @javax.annotation.Nonnull
  private List<RuleChainConnectionInfo> ruleChainConnections = new ArrayList<>();

  public RuleChainMetaData() { 
  }

  @JsonCreator
  public RuleChainMetaData(
    @JsonProperty(JSON_PROPERTY_RULE_CHAIN_ID) RuleChainId ruleChainId
  ) {
  this();
    this.ruleChainId = ruleChainId;
  }

  /**
   * JSON object with Rule Chain Id.
   * @return ruleChainId
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_RULE_CHAIN_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RuleChainId getRuleChainId() {
    return ruleChainId;
  }




  public RuleChainMetaData version(@javax.annotation.Nullable Long version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the Rule Chain
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@javax.annotation.Nullable Long version) {
    this.version = version;
  }


  public RuleChainMetaData firstNodeIndex(@javax.annotation.Nonnull Integer firstNodeIndex) {
    this.firstNodeIndex = firstNodeIndex;
    return this;
  }

  /**
   * Index of the first rule node in the &#39;nodes&#39; list
   * @return firstNodeIndex
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FIRST_NODE_INDEX, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getFirstNodeIndex() {
    return firstNodeIndex;
  }


  @JsonProperty(value = JSON_PROPERTY_FIRST_NODE_INDEX, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFirstNodeIndex(@javax.annotation.Nonnull Integer firstNodeIndex) {
    this.firstNodeIndex = firstNodeIndex;
  }


  public RuleChainMetaData nodes(@javax.annotation.Nonnull List<RuleNode> nodes) {
    this.nodes = nodes;
    return this;
  }

  public RuleChainMetaData addNodesItem(RuleNode nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

  /**
   * List of rule node JSON objects
   * @return nodes
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_NODES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<RuleNode> getNodes() {
    return nodes;
  }


  @JsonProperty(value = JSON_PROPERTY_NODES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNodes(@javax.annotation.Nonnull List<RuleNode> nodes) {
    this.nodes = nodes;
  }


  public RuleChainMetaData connections(@javax.annotation.Nonnull List<NodeConnectionInfo> connections) {
    this.connections = connections;
    return this;
  }

  public RuleChainMetaData addConnectionsItem(NodeConnectionInfo connectionsItem) {
    if (this.connections == null) {
      this.connections = new ArrayList<>();
    }
    this.connections.add(connectionsItem);
    return this;
  }

  /**
   * List of JSON objects that represent connections between rule nodes
   * @return connections
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CONNECTIONS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<NodeConnectionInfo> getConnections() {
    return connections;
  }


  @JsonProperty(value = JSON_PROPERTY_CONNECTIONS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnections(@javax.annotation.Nonnull List<NodeConnectionInfo> connections) {
    this.connections = connections;
  }


  public RuleChainMetaData ruleChainConnections(@javax.annotation.Nonnull List<RuleChainConnectionInfo> ruleChainConnections) {
    this.ruleChainConnections = ruleChainConnections;
    return this;
  }

  public RuleChainMetaData addRuleChainConnectionsItem(RuleChainConnectionInfo ruleChainConnectionsItem) {
    if (this.ruleChainConnections == null) {
      this.ruleChainConnections = new ArrayList<>();
    }
    this.ruleChainConnections.add(ruleChainConnectionsItem);
    return this;
  }

  /**
   * List of JSON objects that represent connections between rule nodes and other rule chains.
   * @return ruleChainConnections
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_RULE_CHAIN_CONNECTIONS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<RuleChainConnectionInfo> getRuleChainConnections() {
    return ruleChainConnections;
  }


  @JsonProperty(value = JSON_PROPERTY_RULE_CHAIN_CONNECTIONS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRuleChainConnections(@javax.annotation.Nonnull List<RuleChainConnectionInfo> ruleChainConnections) {
    this.ruleChainConnections = ruleChainConnections;
  }


  /**
   * Return true if this RuleChainMetaData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleChainMetaData ruleChainMetaData = (RuleChainMetaData) o;
    return Objects.equals(this.ruleChainId, ruleChainMetaData.ruleChainId) &&
        Objects.equals(this.version, ruleChainMetaData.version) &&
        Objects.equals(this.firstNodeIndex, ruleChainMetaData.firstNodeIndex) &&
        Objects.equals(this.nodes, ruleChainMetaData.nodes) &&
        Objects.equals(this.connections, ruleChainMetaData.connections) &&
        Objects.equals(this.ruleChainConnections, ruleChainMetaData.ruleChainConnections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleChainId, version, firstNodeIndex, nodes, connections, ruleChainConnections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleChainMetaData {\n");
    sb.append("    ruleChainId: ").append(toIndentedString(ruleChainId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    firstNodeIndex: ").append(toIndentedString(firstNodeIndex)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    ruleChainConnections: ").append(toIndentedString(ruleChainConnections)).append("\n");
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `firstNodeIndex` to the URL query string
    if (getFirstNodeIndex() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfirstNodeIndex%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFirstNodeIndex()))));
    }

    // add `nodes` to the URL query string
    if (getNodes() != null) {
      for (int i = 0; i < getNodes().size(); i++) {
        if (getNodes().get(i) != null) {
          joiner.add(getNodes().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%snodes%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `connections` to the URL query string
    if (getConnections() != null) {
      for (int i = 0; i < getConnections().size(); i++) {
        if (getConnections().get(i) != null) {
          joiner.add(getConnections().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sconnections%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `ruleChainConnections` to the URL query string
    if (getRuleChainConnections() != null) {
      for (int i = 0; i < getRuleChainConnections().size(); i++) {
        if (getRuleChainConnections().get(i) != null) {
          joiner.add(getRuleChainConnections().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sruleChainConnections%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

