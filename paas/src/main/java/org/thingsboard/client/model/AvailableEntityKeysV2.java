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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.thingsboard.client.model.EntityType;
import org.thingsboard.client.model.KeyInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Contains unique time series and attribute key names discovered from entities matching a query, optionally including a sample value for each key.
 */
@JsonPropertyOrder({
  AvailableEntityKeysV2.JSON_PROPERTY_ENTITY_TYPES,
  AvailableEntityKeysV2.JSON_PROPERTY_TIMESERIES,
  AvailableEntityKeysV2.JSON_PROPERTY_ATTRIBUTES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class AvailableEntityKeysV2 {
  public static final String JSON_PROPERTY_ENTITY_TYPES = "entityTypes";
  @javax.annotation.Nonnull
  private Set<EntityType> entityTypes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_TIMESERIES = "timeseries";
  @javax.annotation.Nullable
  private List<KeyInfo> timeseries = new ArrayList<>();

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  @javax.annotation.Nullable
  private Map<String, List<KeyInfo>> attributes = new HashMap<>();

  public AvailableEntityKeysV2() { 
  }

  public AvailableEntityKeysV2 entityTypes(@javax.annotation.Nonnull Set<EntityType> entityTypes) {
    this.entityTypes = entityTypes;
    return this;
  }

  public AvailableEntityKeysV2 addEntityTypesItem(EntityType entityTypesItem) {
    if (this.entityTypes == null) {
      this.entityTypes = new LinkedHashSet<>();
    }
    this.entityTypes.add(entityTypesItem);
    return this;
  }

  /**
   * Set of entity types found among the matched entities.
   * @return entityTypes
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ENTITY_TYPES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Set<EntityType> getEntityTypes() {
    return entityTypes;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_ENTITY_TYPES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityTypes(@javax.annotation.Nonnull Set<EntityType> entityTypes) {
    this.entityTypes = entityTypes;
  }


  public AvailableEntityKeysV2 timeseries(@javax.annotation.Nullable List<KeyInfo> timeseries) {
    this.timeseries = timeseries;
    return this;
  }

  public AvailableEntityKeysV2 addTimeseriesItem(KeyInfo timeseriesItem) {
    if (this.timeseries == null) {
      this.timeseries = new ArrayList<>();
    }
    this.timeseries.add(timeseriesItem);
    return this;
  }

  /**
   * Get timeseries
   * @return timeseries
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TIMESERIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<KeyInfo> getTimeseries() {
    return timeseries;
  }


  @JsonProperty(value = JSON_PROPERTY_TIMESERIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeseries(@javax.annotation.Nullable List<KeyInfo> timeseries) {
    this.timeseries = timeseries;
  }


  public AvailableEntityKeysV2 attributes(@javax.annotation.Nullable Map<String, List<KeyInfo>> attributes) {
    this.attributes = attributes;
    return this;
  }

  public AvailableEntityKeysV2 putAttributesItem(String key, List<KeyInfo> attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Map of attribute scope to the list of unique attribute keys available on the matched entities. Only scopes supported by the matched entity types are included. Omitted when attribute keys were not requested or when none of the requested scopes apply to the matched entity types.
   * @return attributes
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ATTRIBUTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, List<KeyInfo>> getAttributes() {
    return attributes;
  }


  @JsonProperty(value = JSON_PROPERTY_ATTRIBUTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributes(@javax.annotation.Nullable Map<String, List<KeyInfo>> attributes) {
    this.attributes = attributes;
  }


  /**
   * Return true if this AvailableEntityKeysV2 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableEntityKeysV2 availableEntityKeysV2 = (AvailableEntityKeysV2) o;
    return Objects.equals(this.entityTypes, availableEntityKeysV2.entityTypes) &&
        Objects.equals(this.timeseries, availableEntityKeysV2.timeseries) &&
        Objects.equals(this.attributes, availableEntityKeysV2.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityTypes, timeseries, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableEntityKeysV2 {\n");
    sb.append("    entityTypes: ").append(toIndentedString(entityTypes)).append("\n");
    sb.append("    timeseries: ").append(toIndentedString(timeseries)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

    // add `entityTypes` to the URL query string
    if (getEntityTypes() != null) {
      int i = 0;
      for (EntityType _item : getEntityTypes()) {
        if (_item != null) {
          joiner.add(String.format(java.util.Locale.ROOT, "%sentityTypes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
              ApiClient.urlEncode(ApiClient.valueToString(_item))));
        }
        i++;
      }
    }

    // add `timeseries` to the URL query string
    if (getTimeseries() != null) {
      for (int i = 0; i < getTimeseries().size(); i++) {
        if (getTimeseries().get(i) != null) {
          joiner.add(getTimeseries().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%stimeseries%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `attributes` to the URL query string
    if (getAttributes() != null) {
      for (String _key : getAttributes().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sattributes%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getAttributes().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getAttributes().get(_key)))));
      }
    }

    return joiner.toString();
  }
}

