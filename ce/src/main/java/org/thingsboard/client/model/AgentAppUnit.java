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
import org.thingsboard.client.model.AgentAppUnitId;
import org.thingsboard.client.model.AgentAppUnitType;
import org.thingsboard.client.model.AgentApplicationId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AgentAppUnit
 */
@JsonPropertyOrder({
  AgentAppUnit.JSON_PROPERTY_ID,
  AgentAppUnit.JSON_PROPERTY_CREATED_TIME,
  AgentAppUnit.JSON_PROPERTY_TENANT_ID,
  AgentAppUnit.JSON_PROPERTY_AGENT_APPLICATION_ID,
  AgentAppUnit.JSON_PROPERTY_IDENTIFIER,
  AgentAppUnit.JSON_PROPERTY_TYPE
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AgentAppUnit {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private AgentAppUnitId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nonnull
  private TenantId tenantId;

  public static final String JSON_PROPERTY_AGENT_APPLICATION_ID = "agentApplicationId";
  @Nonnull
  private AgentApplicationId agentApplicationId;

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  @Nonnull
  private String identifier;

  public static final String JSON_PROPERTY_TYPE = "type";
  @Nonnull
  private AgentAppUnitType type;

  public AgentAppUnit() { 
  }

  @JsonCreator
  public AgentAppUnit(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime
  ) {
  this();
    this.createdTime = createdTime;
  }

  public AgentAppUnit id(@Nullable AgentAppUnitId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Agent App Unit Id.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AgentAppUnitId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable AgentAppUnitId id) {
    this.id = id;
  }


  /**
   * Timestamp of the agent app unit creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public AgentAppUnit tenantId(@Nonnull TenantId tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Tenant this unit belongs to
   * @return tenantId
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TenantId getTenantId() {
    return tenantId;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTenantId(@Nonnull TenantId tenantId) {
    this.tenantId = tenantId;
  }


  public AgentAppUnit agentApplicationId(@Nonnull AgentApplicationId agentApplicationId) {
    this.agentApplicationId = agentApplicationId;
    return this;
  }

  /**
   * Agent application this unit belongs to
   * @return agentApplicationId
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_AGENT_APPLICATION_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AgentApplicationId getAgentApplicationId() {
    return agentApplicationId;
  }


  @JsonProperty(value = JSON_PROPERTY_AGENT_APPLICATION_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAgentApplicationId(@Nonnull AgentApplicationId agentApplicationId) {
    this.agentApplicationId = agentApplicationId;
  }


  public AgentAppUnit identifier(@Nonnull String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Unit identifier
   * @return identifier
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_IDENTIFIER, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIdentifier() {
    return identifier;
  }


  @JsonProperty(value = JSON_PROPERTY_IDENTIFIER, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIdentifier(@Nonnull String identifier) {
    this.identifier = identifier;
  }


  public AgentAppUnit type(@Nonnull AgentAppUnitType type) {
    this.type = type;
    return this;
  }

  /**
   * Unit type
   * @return type
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AgentAppUnitType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@Nonnull AgentAppUnitType type) {
    this.type = type;
  }


  /**
   * Return true if this AgentAppUnit object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAppUnit agentAppUnit = (AgentAppUnit) o;
    return Objects.equals(this.id, agentAppUnit.id) &&
        Objects.equals(this.createdTime, agentAppUnit.createdTime) &&
        Objects.equals(this.tenantId, agentAppUnit.tenantId) &&
        Objects.equals(this.agentApplicationId, agentAppUnit.agentApplicationId) &&
        Objects.equals(this.identifier, agentAppUnit.identifier) &&
        Objects.equals(this.type, agentAppUnit.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, agentApplicationId, identifier, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAppUnit {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    agentApplicationId: ").append(toIndentedString(agentApplicationId)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(getId().toUrlQueryString(prefix + "id" + suffix));
    }

    // add `createdTime` to the URL query string
    if (getCreatedTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%screatedTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCreatedTime()))));
    }

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    // add `agentApplicationId` to the URL query string
    if (getAgentApplicationId() != null) {
      joiner.add(getAgentApplicationId().toUrlQueryString(prefix + "agentApplicationId" + suffix));
    }

    // add `identifier` to the URL query string
    if (getIdentifier() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sidentifier%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIdentifier()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    return joiner.toString();
  }
}

