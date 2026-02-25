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
import org.thingsboard.client.model.EntityType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * OtaPackageId
 */
@JsonPropertyOrder({
  OtaPackageId.JSON_PROPERTY_ID,
  OtaPackageId.JSON_PROPERTY_ENTITY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class OtaPackageId {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private UUID id;

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  @javax.annotation.Nonnull
  private EntityType entityType;

  public OtaPackageId() { 
  }

  public OtaPackageId id(@javax.annotation.Nonnull UUID id) {
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


  public OtaPackageId entityType(@javax.annotation.Nonnull EntityType entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * string
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


  /**
   * Return true if this OtaPackageId object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtaPackageId otaPackageId = (OtaPackageId) o;
    return Objects.equals(this.id, otaPackageId.id) &&
        Objects.equals(this.entityType, otaPackageId.entityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, entityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtaPackageId {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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
      joiner.add(String.format(java.util.Locale.ROOT, "%sid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getId()))));
    }

    // add `entityType` to the URL query string
    if (getEntityType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityType()))));
    }

    return joiner.toString();
  }
}

