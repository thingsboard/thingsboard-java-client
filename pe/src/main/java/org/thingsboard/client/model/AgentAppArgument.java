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
import org.thingsboard.client.model.AgentAppArgumentFormat;
import org.thingsboard.client.model.AgentAppArgumentSource;
import org.thingsboard.client.model.AgentAppArgumentValueType;
import org.thingsboard.client.model.AttributeScope;
import org.thingsboard.client.model.EntityId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AgentAppArgument
 */
@JsonPropertyOrder({
  AgentAppArgument.JSON_PROPERTY_NAME,
  AgentAppArgument.JSON_PROPERTY_SOURCE_TYPE,
  AgentAppArgument.JSON_PROPERTY_SOURCE_ENTITY_ID,
  AgentAppArgument.JSON_PROPERTY_VALUE_TYPE,
  AgentAppArgument.JSON_PROPERTY_SCOPE,
  AgentAppArgument.JSON_PROPERTY_KEY,
  AgentAppArgument.JSON_PROPERTY_DEFAULT_VALUE,
  AgentAppArgument.JSON_PROPERTY_FORMAT
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AgentAppArgument {
  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public static final String JSON_PROPERTY_SOURCE_TYPE = "sourceType";
  @Nullable
  private AgentAppArgumentSource sourceType;

  public static final String JSON_PROPERTY_SOURCE_ENTITY_ID = "sourceEntityId";
  @Nullable
  private EntityId sourceEntityId;

  public static final String JSON_PROPERTY_VALUE_TYPE = "valueType";
  @Nullable
  private AgentAppArgumentValueType valueType;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  @Nullable
  private AttributeScope scope;

  public static final String JSON_PROPERTY_KEY = "key";
  @Nullable
  private String key;

  public static final String JSON_PROPERTY_DEFAULT_VALUE = "defaultValue";
  @Nullable
  private String defaultValue;

  public static final String JSON_PROPERTY_FORMAT = "format";
  @Nullable
  private AgentAppArgumentFormat format;

  public AgentAppArgument() { 
  }

  public AgentAppArgument name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Argument name, referenced in the compose as ${tb.&lt;name&gt;}.
   * @return name
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@Nullable String name) {
    this.name = name;
  }


  public AgentAppArgument sourceType(@Nullable AgentAppArgumentSource sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Source entity the value is resolved from.
   * @return sourceType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SOURCE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentAppArgumentSource getSourceType() {
    return sourceType;
  }


  @JsonProperty(value = JSON_PROPERTY_SOURCE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceType(@Nullable AgentAppArgumentSource sourceType) {
    this.sourceType = sourceType;
  }


  public AgentAppArgument sourceEntityId(@Nullable EntityId sourceEntityId) {
    this.sourceEntityId = sourceEntityId;
    return this;
  }

  /**
   * Concrete source entity id. Required when sourceType references a specific entity (DEVICE, ASSET, CUSTOMER, EDGE); ignored for the context-derived sources.
   * @return sourceEntityId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SOURCE_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getSourceEntityId() {
    return sourceEntityId;
  }


  @JsonProperty(value = JSON_PROPERTY_SOURCE_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceEntityId(@Nullable EntityId sourceEntityId) {
    this.sourceEntityId = sourceEntityId;
  }


  public AgentAppArgument valueType(@Nullable AgentAppArgumentValueType valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * Whether the value is read from an attribute or the latest telemetry.
   * @return valueType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_VALUE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentAppArgumentValueType getValueType() {
    return valueType;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueType(@Nullable AgentAppArgumentValueType valueType) {
    this.valueType = valueType;
  }


  public AgentAppArgument scope(@Nullable AttributeScope scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Attribute scope. Applicable only when valueType is ATTRIBUTE. Defaults to SERVER_SCOPE.
   * @return scope
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SCOPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AttributeScope getScope() {
    return scope;
  }


  @JsonProperty(value = JSON_PROPERTY_SCOPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScope(@Nullable AttributeScope scope) {
    this.scope = scope;
  }


  public AgentAppArgument key(@Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * Attribute or latest telemetry key to read.
   * @return key
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKey() {
    return key;
  }


  @JsonProperty(value = JSON_PROPERTY_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(@Nullable String key) {
    this.key = key;
  }


  public AgentAppArgument defaultValue(@Nullable String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Optional fallback value used when the source has no value for the key.
   * @return defaultValue
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDefaultValue() {
    return defaultValue;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultValue(@Nullable String defaultValue) {
    this.defaultValue = defaultValue;
  }


  public AgentAppArgument format(@Nullable AgentAppArgumentFormat format) {
    this.format = format;
    return this;
  }

  /**
   * How the resolved value is injected into the compose: STRING (quoted) or JSON (raw, for arrays/objects/numbers when the placeholder is the whole value). Defaults to STRING.
   * @return format
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_FORMAT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentAppArgumentFormat getFormat() {
    return format;
  }


  @JsonProperty(value = JSON_PROPERTY_FORMAT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormat(@Nullable AgentAppArgumentFormat format) {
    this.format = format;
  }


  /**
   * Return true if this AgentAppArgument object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAppArgument agentAppArgument = (AgentAppArgument) o;
    return Objects.equals(this.name, agentAppArgument.name) &&
        Objects.equals(this.sourceType, agentAppArgument.sourceType) &&
        Objects.equals(this.sourceEntityId, agentAppArgument.sourceEntityId) &&
        Objects.equals(this.valueType, agentAppArgument.valueType) &&
        Objects.equals(this.scope, agentAppArgument.scope) &&
        Objects.equals(this.key, agentAppArgument.key) &&
        Objects.equals(this.defaultValue, agentAppArgument.defaultValue) &&
        Objects.equals(this.format, agentAppArgument.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sourceType, sourceEntityId, valueType, scope, key, defaultValue, format);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAppArgument {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    sourceEntityId: ").append(toIndentedString(sourceEntityId)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `sourceType` to the URL query string
    if (getSourceType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssourceType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSourceType()))));
    }

    // add `sourceEntityId` to the URL query string
    if (getSourceEntityId() != null) {
      joiner.add(getSourceEntityId().toUrlQueryString(prefix + "sourceEntityId" + suffix));
    }

    // add `valueType` to the URL query string
    if (getValueType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%svalueType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getValueType()))));
    }

    // add `scope` to the URL query string
    if (getScope() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sscope%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getScope()))));
    }

    // add `key` to the URL query string
    if (getKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%skey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getKey()))));
    }

    // add `defaultValue` to the URL query string
    if (getDefaultValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdefaultValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDefaultValue()))));
    }

    // add `format` to the URL query string
    if (getFormat() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sformat%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFormat()))));
    }

    return joiner.toString();
  }
}

