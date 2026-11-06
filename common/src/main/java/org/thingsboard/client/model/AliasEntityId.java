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

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.thingsboard.client.ApiClient;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.UUID;

/**
 * Entity ID used by entity filters: either an entity of a given {@link EntityType}, or an alias
 * ({@link AliasEntityType}) that the server resolves for the current user.
 * <p>
 * Hand-written: it replaces the generated model (see generate-client.sh). The server writes both
 * kinds in one {@code entityType} field, e.g. {@code {"entityType": "DEVICE", "id": "..."}} or
 * {@code {"entityType": "CURRENT_USER"}}, so the spec documents {@code entityType} as a string.
 * This class keeps the typed accessors of earlier client versions on top of that field.
 */
@JsonPropertyOrder({
  AliasEntityId.JSON_PROPERTY_ENTITY_TYPE,
  AliasEntityId.JSON_PROPERTY_ID
})
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE,
    getterVisibility = JsonAutoDetect.Visibility.NONE,
    isGetterVisibility = JsonAutoDetect.Visibility.NONE,
    setterVisibility = JsonAutoDetect.Visibility.NONE)
public class AliasEntityId {
  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  @JsonProperty(value = JSON_PROPERTY_ENTITY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  private String entityType;

  /**
   * @deprecated The server never writes {@code aliasEntityType}; an alias is sent in {@code entityType}.
   */
  @Deprecated
  public static final String JSON_PROPERTY_ALIAS_ENTITY_TYPE = "aliasEntityType";

  public static final String JSON_PROPERTY_ID = "id";
  // Omitted when null: the server rejects "id": null for an alias.
  @JsonProperty(value = JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.NON_NULL)
  private UUID id;

  public AliasEntityId() {
  }

  /**
   * Sets the entity type of an entity ID; {@link #id(UUID)} is required with it.
   */
  public AliasEntityId entityType(@Nullable EntityType entityType) {
    setEntityType(entityType);
    return this;
  }

  /**
   * @return the entity type, or {@code null} if this is an alias
   */
  @Nullable
  public EntityType getEntityType() {
    if (entityType != null) {
      for (EntityType type : EntityType.values()) {
        if (type.getValue().equals(entityType)) {
          return type;
        }
      }
    }
    return null;
  }

  public void setEntityType(@Nullable EntityType entityType) {
    this.entityType = entityType != null ? entityType.getValue() : null;
  }

  /**
   * Sets an alias that the server resolves for the current user; the ID is optional.
   */
  public AliasEntityId aliasEntityType(@Nullable AliasEntityType aliasEntityType) {
    setAliasEntityType(aliasEntityType);
    return this;
  }

  /**
   * @return the alias, or {@code null} if this is an entity ID
   */
  @Nullable
  public AliasEntityType getAliasEntityType() {
    if (entityType != null) {
      for (AliasEntityType type : AliasEntityType.values()) {
        if (type.getValue().equals(entityType)) {
          return type;
        }
      }
    }
    return null;
  }

  public void setAliasEntityType(@Nullable AliasEntityType aliasEntityType) {
    this.entityType = aliasEntityType != null ? aliasEntityType.getValue() : null;
  }

  /**
   * Sets the raw {@code entityType} value: an {@link EntityType} or {@link AliasEntityType} name.
   */
  public AliasEntityId entityTypeValue(@Nullable String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * @return the raw {@code entityType} value as the server sent it
   */
  @Nullable
  public String getEntityTypeValue() {
    return entityType;
  }

  public AliasEntityId id(@Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the entity, time-based UUID v1; required for an entity ID, optional for an alias.
   * @return id
   */
  @Nullable
  public UUID getId() {
    return id;
  }

  public void setId(@Nullable UUID id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AliasEntityId aliasEntityId = (AliasEntityId) o;
    return Objects.equals(this.entityType, aliasEntityId.entityType) &&
        Objects.equals(this.id, aliasEntityId.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, id);
  }

  @Override
  public String toString() {
    return "class AliasEntityId {\n" +
        "    entityType: " + entityType + "\n" +
        "    id: " + id + "\n" +
        "}";
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
    if (prefix == null) {
      prefix = "";
    } else {
      prefix = prefix + "[";
      suffix = "]";
    }
    StringJoiner joiner = new StringJoiner("&");
    if (entityType != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityType%s=%s", prefix, suffix, ApiClient.urlEncode(entityType)));
    }
    if (id != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(id))));
    }
    return joiner.toString();
  }
}
