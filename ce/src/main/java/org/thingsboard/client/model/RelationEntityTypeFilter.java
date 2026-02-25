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
import org.thingsboard.client.model.EntityType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * RelationEntityTypeFilter
 */
@JsonPropertyOrder({
  RelationEntityTypeFilter.JSON_PROPERTY_RELATION_TYPE,
  RelationEntityTypeFilter.JSON_PROPERTY_ENTITY_TYPES,
  RelationEntityTypeFilter.JSON_PROPERTY_NEGATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class RelationEntityTypeFilter {
  public static final String JSON_PROPERTY_RELATION_TYPE = "relationType";
  @javax.annotation.Nullable
  private String relationType;

  public static final String JSON_PROPERTY_ENTITY_TYPES = "entityTypes";
  @javax.annotation.Nullable
  private List<EntityType> entityTypes = new ArrayList<>();

  public static final String JSON_PROPERTY_NEGATE = "negate";
  @javax.annotation.Nullable
  private Boolean negate;

  public RelationEntityTypeFilter() { 
  }

  public RelationEntityTypeFilter relationType(@javax.annotation.Nullable String relationType) {
    this.relationType = relationType;
    return this;
  }

  /**
   * Type of the relation between root entity and other entity (e.g. &#39;Contains&#39; or &#39;Manages&#39;).
   * @return relationType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RELATION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRelationType() {
    return relationType;
  }


  @JsonProperty(value = JSON_PROPERTY_RELATION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelationType(@javax.annotation.Nullable String relationType) {
    this.relationType = relationType;
  }


  public RelationEntityTypeFilter entityTypes(@javax.annotation.Nullable List<EntityType> entityTypes) {
    this.entityTypes = entityTypes;
    return this;
  }

  public RelationEntityTypeFilter addEntityTypesItem(EntityType entityTypesItem) {
    if (this.entityTypes == null) {
      this.entityTypes = new ArrayList<>();
    }
    this.entityTypes.add(entityTypesItem);
    return this;
  }

  /**
   * Array of entity types to filter the related entities (e.g. &#39;DEVICE&#39;, &#39;ASSET&#39;).
   * @return entityTypes
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_TYPES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EntityType> getEntityTypes() {
    return entityTypes;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_TYPES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityTypes(@javax.annotation.Nullable List<EntityType> entityTypes) {
    this.entityTypes = entityTypes;
  }


  public RelationEntityTypeFilter negate(@javax.annotation.Nullable Boolean negate) {
    this.negate = negate;
    return this;
  }

  /**
   * Negate relation type between root entity and other entity.
   * @return negate
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NEGATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNegate() {
    return negate;
  }


  @JsonProperty(value = JSON_PROPERTY_NEGATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNegate(@javax.annotation.Nullable Boolean negate) {
    this.negate = negate;
  }


  /**
   * Return true if this RelationEntityTypeFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationEntityTypeFilter relationEntityTypeFilter = (RelationEntityTypeFilter) o;
    return Objects.equals(this.relationType, relationEntityTypeFilter.relationType) &&
        Objects.equals(this.entityTypes, relationEntityTypeFilter.entityTypes) &&
        Objects.equals(this.negate, relationEntityTypeFilter.negate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationType, entityTypes, negate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationEntityTypeFilter {\n");
    sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
    sb.append("    entityTypes: ").append(toIndentedString(entityTypes)).append("\n");
    sb.append("    negate: ").append(toIndentedString(negate)).append("\n");
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

    // add `relationType` to the URL query string
    if (getRelationType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srelationType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRelationType()))));
    }

    // add `entityTypes` to the URL query string
    if (getEntityTypes() != null) {
      for (int i = 0; i < getEntityTypes().size(); i++) {
        if (getEntityTypes().get(i) != null) {
          joiner.add(String.format(java.util.Locale.ROOT, "%sentityTypes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
              ApiClient.urlEncode(ApiClient.valueToString(getEntityTypes().get(i)))));
        }
      }
    }

    // add `negate` to the URL query string
    if (getNegate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snegate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNegate()))));
    }

    return joiner.toString();
  }
}

