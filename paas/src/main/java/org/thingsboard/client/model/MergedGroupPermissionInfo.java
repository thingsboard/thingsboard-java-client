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
import org.thingsboard.client.model.EntityType;
import org.thingsboard.client.model.Operation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * MergedGroupPermissionInfo
 */
@JsonPropertyOrder({
  MergedGroupPermissionInfo.JSON_PROPERTY_ENTITY_TYPE,
  MergedGroupPermissionInfo.JSON_PROPERTY_OPERATIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class MergedGroupPermissionInfo {
  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  @javax.annotation.Nullable
  private EntityType entityType;

  public static final String JSON_PROPERTY_OPERATIONS = "operations";
  @javax.annotation.Nullable
  private Set<Operation> operations = new LinkedHashSet<>();

  public MergedGroupPermissionInfo() { 
  }

  public MergedGroupPermissionInfo entityType(@javax.annotation.Nullable EntityType entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Get entityType
   * @return entityType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityType getEntityType() {
    return entityType;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityType(@javax.annotation.Nullable EntityType entityType) {
    this.entityType = entityType;
  }


  public MergedGroupPermissionInfo operations(@javax.annotation.Nullable Set<Operation> operations) {
    this.operations = operations;
    return this;
  }

  public MergedGroupPermissionInfo addOperationsItem(Operation operationsItem) {
    if (this.operations == null) {
      this.operations = new LinkedHashSet<>();
    }
    this.operations.add(operationsItem);
    return this;
  }

  /**
   * Get operations
   * @return operations
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Set<Operation> getOperations() {
    return operations;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_OPERATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperations(@javax.annotation.Nullable Set<Operation> operations) {
    this.operations = operations;
  }


  /**
   * Return true if this MergedGroupPermissionInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergedGroupPermissionInfo mergedGroupPermissionInfo = (MergedGroupPermissionInfo) o;
    return Objects.equals(this.entityType, mergedGroupPermissionInfo.entityType) &&
        Objects.equals(this.operations, mergedGroupPermissionInfo.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, operations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergedGroupPermissionInfo {\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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

    // add `entityType` to the URL query string
    if (getEntityType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityType()))));
    }

    // add `operations` to the URL query string
    if (getOperations() != null) {
      int i = 0;
      for (Operation _item : getOperations()) {
        if (_item != null) {
          joiner.add(String.format(java.util.Locale.ROOT, "%soperations%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
              ApiClient.urlEncode(ApiClient.valueToString(_item))));
        }
        i++;
      }
    }

    return joiner.toString();
  }
}

