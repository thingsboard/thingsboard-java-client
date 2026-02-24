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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Contains unique time series and attribute key names discovered from entities matching a query. Used primarily for UI hints such as autocomplete suggestions.
 */
@JsonPropertyOrder({
  AvailableEntityKeys.JSON_PROPERTY_ENTITY_TYPES,
  AvailableEntityKeys.JSON_PROPERTY_TIMESERIES,
  AvailableEntityKeys.JSON_PROPERTY_ATTRIBUTE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class AvailableEntityKeys {
  public static final String JSON_PROPERTY_ENTITY_TYPES = "entityTypes";
  @javax.annotation.Nonnull
  private Set<EntityType> entityTypes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_TIMESERIES = "timeseries";
  @javax.annotation.Nonnull
  private Set<String> timeseries = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ATTRIBUTE = "attribute";
  @javax.annotation.Nonnull
  private Set<String> attribute = new LinkedHashSet<>();

  public AvailableEntityKeys() { 
  }

  public AvailableEntityKeys entityTypes(@javax.annotation.Nonnull Set<EntityType> entityTypes) {
    this.entityTypes = entityTypes;
    return this;
  }

  public AvailableEntityKeys addEntityTypesItem(EntityType entityTypesItem) {
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


  public AvailableEntityKeys timeseries(@javax.annotation.Nonnull Set<String> timeseries) {
    this.timeseries = timeseries;
    return this;
  }

  public AvailableEntityKeys addTimeseriesItem(String timeseriesItem) {
    if (this.timeseries == null) {
      this.timeseries = new LinkedHashSet<>();
    }
    this.timeseries.add(timeseriesItem);
    return this;
  }

  /**
   * Get timeseries
   * @return timeseries
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TIMESERIES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Set<String> getTimeseries() {
    return timeseries;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_TIMESERIES, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimeseries(@javax.annotation.Nonnull Set<String> timeseries) {
    this.timeseries = timeseries;
  }


  public AvailableEntityKeys attribute(@javax.annotation.Nonnull Set<String> attribute) {
    this.attribute = attribute;
    return this;
  }

  public AvailableEntityKeys addAttributeItem(String attributeItem) {
    if (this.attribute == null) {
      this.attribute = new LinkedHashSet<>();
    }
    this.attribute.add(attributeItem);
    return this;
  }

  /**
   * Get attribute
   * @return attribute
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ATTRIBUTE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Set<String> getAttribute() {
    return attribute;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_ATTRIBUTE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAttribute(@javax.annotation.Nonnull Set<String> attribute) {
    this.attribute = attribute;
  }


  /**
   * Return true if this AvailableEntityKeys object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableEntityKeys availableEntityKeys = (AvailableEntityKeys) o;
    return Objects.equals(this.entityTypes, availableEntityKeys.entityTypes) &&
        Objects.equals(this.timeseries, availableEntityKeys.timeseries) &&
        Objects.equals(this.attribute, availableEntityKeys.attribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityTypes, timeseries, attribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableEntityKeys {\n");
    sb.append("    entityTypes: ").append(toIndentedString(entityTypes)).append("\n");
    sb.append("    timeseries: ").append(toIndentedString(timeseries)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
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
      int i = 0;
      for (String _item : getTimeseries()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%stimeseries%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(_item))));
      }
      i++;
    }

    // add `attribute` to the URL query string
    if (getAttribute() != null) {
      int i = 0;
      for (String _item : getAttribute()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%sattribute%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix),
            ApiClient.urlEncode(ApiClient.valueToString(_item))));
      }
      i++;
    }

    return joiner.toString();
  }
}

