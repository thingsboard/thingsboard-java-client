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
import org.thingsboard.client.model.ComponentClusteringMode;
import org.thingsboard.client.model.ComponentDescriptorId;
import org.thingsboard.client.model.ComponentScope;
import org.thingsboard.client.model.ComponentType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * ComponentDescriptor
 */
@JsonPropertyOrder({
  ComponentDescriptor.JSON_PROPERTY_ID,
  ComponentDescriptor.JSON_PROPERTY_CREATED_TIME,
  ComponentDescriptor.JSON_PROPERTY_TYPE,
  ComponentDescriptor.JSON_PROPERTY_SCOPE,
  ComponentDescriptor.JSON_PROPERTY_CLUSTERING_MODE,
  ComponentDescriptor.JSON_PROPERTY_NAME,
  ComponentDescriptor.JSON_PROPERTY_CLAZZ,
  ComponentDescriptor.JSON_PROPERTY_CONFIGURATION_VERSION,
  ComponentDescriptor.JSON_PROPERTY_ACTIONS,
  ComponentDescriptor.JSON_PROPERTY_HAS_QUEUE_NAME,
  ComponentDescriptor.JSON_PROPERTY_CONFIGURATION_DESCRIPTOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class ComponentDescriptor {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private ComponentDescriptorId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private ComponentType type;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  @javax.annotation.Nullable
  private ComponentScope scope;

  public static final String JSON_PROPERTY_CLUSTERING_MODE = "clusteringMode";
  @javax.annotation.Nullable
  private ComponentClusteringMode clusteringMode;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_CLAZZ = "clazz";
  @javax.annotation.Nullable
  private String clazz;

  public static final String JSON_PROPERTY_CONFIGURATION_VERSION = "configurationVersion";
  @javax.annotation.Nullable
  private Integer configurationVersion;

  public static final String JSON_PROPERTY_ACTIONS = "actions";
  @javax.annotation.Nullable
  private String actions;

  public static final String JSON_PROPERTY_HAS_QUEUE_NAME = "hasQueueName";
  @javax.annotation.Nullable
  private Boolean hasQueueName;

  public static final String JSON_PROPERTY_CONFIGURATION_DESCRIPTOR = "configurationDescriptor";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode configurationDescriptor = null;

  public ComponentDescriptor() { 
  }

  @JsonCreator
  public ComponentDescriptor(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TYPE) ComponentType type, 
    @JsonProperty(JSON_PROPERTY_SCOPE) ComponentScope scope, 
    @JsonProperty(JSON_PROPERTY_CLUSTERING_MODE) ComponentClusteringMode clusteringMode, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_CLAZZ) String clazz, 
    @JsonProperty(JSON_PROPERTY_CONFIGURATION_VERSION) Integer configurationVersion, 
    @JsonProperty(JSON_PROPERTY_ACTIONS) String actions, 
    @JsonProperty(JSON_PROPERTY_HAS_QUEUE_NAME) Boolean hasQueueName
  ) {
  this();
    this.createdTime = createdTime;
    this.type = type;
    this.scope = scope;
    this.clusteringMode = clusteringMode;
    this.name = name;
    this.clazz = clazz;
    this.configurationVersion = configurationVersion;
    this.actions = actions;
    this.hasQueueName = hasQueueName;
  }

  public ComponentDescriptor id(@javax.annotation.Nullable ComponentDescriptorId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the descriptor Id. Specify existing descriptor id to update the descriptor. Referencing non-existing descriptor Id will cause error. Omit this field to create new descriptor.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ComponentDescriptorId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable ComponentDescriptorId id) {
    this.id = id;
  }


  /**
   * Timestamp of the descriptor creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * Type of the Rule Node
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ComponentType getType() {
    return type;
  }




  /**
   * Scope of the Rule Node. Always set to &#39;TENANT&#39;, since no rule chains on the &#39;SYSTEM&#39; level yet.
   * @return scope
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SCOPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ComponentScope getScope() {
    return scope;
  }




  /**
   * Clustering mode of the RuleNode. This mode represents the ability to start Rule Node in multiple microservices.
   * @return clusteringMode
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CLUSTERING_MODE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ComponentClusteringMode getClusteringMode() {
    return clusteringMode;
  }




  /**
   * Name of the Rule Node. Taken from the @RuleNode annotation.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  /**
   * Full name of the Java class that implements the Rule Engine Node interface.
   * @return clazz
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CLAZZ, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClazz() {
    return clazz;
  }




  /**
   * Rule node configuration version. By default, this value is 0. If the rule node is a versioned node, this value might be greater than 0.
   * @return configurationVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getConfigurationVersion() {
    return configurationVersion;
  }




  /**
   * Rule Node Actions. Deprecated. Always null.
   * @return actions
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getActions() {
    return actions;
  }




  /**
   * Indicates that the RuleNode supports queue name configuration.
   * @return hasQueueName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HAS_QUEUE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasQueueName() {
    return hasQueueName;
  }




  public ComponentDescriptor configurationDescriptor(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode configurationDescriptor) {
    this.configurationDescriptor = configurationDescriptor;
    return this;
  }

  /**
   * Get configurationDescriptor
   * @return configurationDescriptor
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION_DESCRIPTOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getConfigurationDescriptor() {
    return configurationDescriptor;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION_DESCRIPTOR, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigurationDescriptor(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode configurationDescriptor) {
    this.configurationDescriptor = configurationDescriptor;
  }


  /**
   * Return true if this ComponentDescriptor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentDescriptor componentDescriptor = (ComponentDescriptor) o;
    return Objects.equals(this.id, componentDescriptor.id) &&
        Objects.equals(this.createdTime, componentDescriptor.createdTime) &&
        Objects.equals(this.type, componentDescriptor.type) &&
        Objects.equals(this.scope, componentDescriptor.scope) &&
        Objects.equals(this.clusteringMode, componentDescriptor.clusteringMode) &&
        Objects.equals(this.name, componentDescriptor.name) &&
        Objects.equals(this.clazz, componentDescriptor.clazz) &&
        Objects.equals(this.configurationVersion, componentDescriptor.configurationVersion) &&
        Objects.equals(this.actions, componentDescriptor.actions) &&
        Objects.equals(this.hasQueueName, componentDescriptor.hasQueueName) &&
        Objects.equals(this.configurationDescriptor, componentDescriptor.configurationDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, type, scope, clusteringMode, name, clazz, configurationVersion, actions, hasQueueName, configurationDescriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentDescriptor {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    clusteringMode: ").append(toIndentedString(clusteringMode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clazz: ").append(toIndentedString(clazz)).append("\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    hasQueueName: ").append(toIndentedString(hasQueueName)).append("\n");
    sb.append("    configurationDescriptor: ").append(toIndentedString(configurationDescriptor)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(getId().toUrlQueryString(prefix + "id" + suffix));
    }

    // add `createdTime` to the URL query string
    if (getCreatedTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%screatedTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCreatedTime()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `scope` to the URL query string
    if (getScope() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sscope%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getScope()))));
    }

    // add `clusteringMode` to the URL query string
    if (getClusteringMode() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sclusteringMode%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getClusteringMode()))));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `clazz` to the URL query string
    if (getClazz() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sclazz%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getClazz()))));
    }

    // add `configurationVersion` to the URL query string
    if (getConfigurationVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sconfigurationVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConfigurationVersion()))));
    }

    // add `actions` to the URL query string
    if (getActions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sactions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getActions()))));
    }

    // add `hasQueueName` to the URL query string
    if (getHasQueueName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shasQueueName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHasQueueName()))));
    }

    // add `configurationDescriptor` to the URL query string
    if (getConfigurationDescriptor() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sconfigurationDescriptor%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConfigurationDescriptor()))));
    }

    return joiner.toString();
  }
}

