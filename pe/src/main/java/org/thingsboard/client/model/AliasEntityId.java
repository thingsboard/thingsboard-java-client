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
import java.util.UUID;
import org.thingsboard.client.model.AliasEntityType;
import org.thingsboard.client.model.EntityType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * AliasEntityId
 */
@JsonPropertyOrder({
  AliasEntityId.JSON_PROPERTY_ALIAS_ENTITY_TYPE,
  AliasEntityId.JSON_PROPERTY_ENTITY_TYPE,
  AliasEntityId.JSON_PROPERTY_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AliasEntityId {
  public static final String JSON_PROPERTY_ALIAS_ENTITY_TYPE = "aliasEntityType";
  @javax.annotation.Nullable
  private AliasEntityType aliasEntityType;

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  @javax.annotation.Nonnull
  private EntityType entityType;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private UUID id;

  public AliasEntityId() { 
  }

  public AliasEntityId aliasEntityType(@javax.annotation.Nullable AliasEntityType aliasEntityType) {
    this.aliasEntityType = aliasEntityType;
    return this;
  }

  /**
   * Get aliasEntityType
   * @return aliasEntityType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ALIAS_ENTITY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AliasEntityType getAliasEntityType() {
    return aliasEntityType;
  }


  @JsonProperty(value = JSON_PROPERTY_ALIAS_ENTITY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAliasEntityType(@javax.annotation.Nullable AliasEntityType aliasEntityType) {
    this.aliasEntityType = aliasEntityType;
  }


  public AliasEntityId entityType(@javax.annotation.Nonnull EntityType entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Get entityType
   * @return entityType
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ENTITY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EntityType getEntityType() {
    return entityType;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityType(@javax.annotation.Nonnull EntityType entityType) {
    this.entityType = entityType;
  }


  public AliasEntityId id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the entity, time-based UUID v1
   * @return id
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  /**
   * Return true if this AliasEntityId object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AliasEntityId aliasEntityId = (AliasEntityId) o;
    return Objects.equals(this.aliasEntityType, aliasEntityId.aliasEntityType) &&
        Objects.equals(this.entityType, aliasEntityId.entityType) &&
        Objects.equals(this.id, aliasEntityId.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliasEntityType, entityType, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AliasEntityId {\n");
    sb.append("    aliasEntityType: ").append(toIndentedString(aliasEntityType)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

    // add `aliasEntityType` to the URL query string
    if (getAliasEntityType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saliasEntityType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAliasEntityType()))));
    }

    // add `entityType` to the URL query string
    if (getEntityType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityType()))));
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getId()))));
    }

    return joiner.toString();
  }
}

