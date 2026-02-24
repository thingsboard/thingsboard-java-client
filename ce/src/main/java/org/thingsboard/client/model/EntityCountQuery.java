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
import org.thingsboard.client.model.EntityFilter;
import org.thingsboard.client.model.KeyFilter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the entity count query. See API call notes above for more details.
 */
@JsonPropertyOrder({
  EntityCountQuery.JSON_PROPERTY_ENTITY_FILTER,
  EntityCountQuery.JSON_PROPERTY_KEY_FILTERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class EntityCountQuery {
  public static final String JSON_PROPERTY_ENTITY_FILTER = "entityFilter";
  @javax.annotation.Nullable
  private EntityFilter entityFilter;

  public static final String JSON_PROPERTY_KEY_FILTERS = "keyFilters";
  @javax.annotation.Nullable
  private List<KeyFilter> keyFilters = new ArrayList<>();

  public EntityCountQuery() { 
  }

  public EntityCountQuery entityFilter(@javax.annotation.Nullable EntityFilter entityFilter) {
    this.entityFilter = entityFilter;
    return this;
  }

  /**
   * Get entityFilter
   * @return entityFilter
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_FILTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityFilter getEntityFilter() {
    return entityFilter;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_FILTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityFilter(@javax.annotation.Nullable EntityFilter entityFilter) {
    this.entityFilter = entityFilter;
  }


  public EntityCountQuery keyFilters(@javax.annotation.Nullable List<KeyFilter> keyFilters) {
    this.keyFilters = keyFilters;
    return this;
  }

  public EntityCountQuery addKeyFiltersItem(KeyFilter keyFiltersItem) {
    if (this.keyFilters == null) {
      this.keyFilters = new ArrayList<>();
    }
    this.keyFilters.add(keyFiltersItem);
    return this;
  }

  /**
   * Get keyFilters
   * @return keyFilters
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_KEY_FILTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<KeyFilter> getKeyFilters() {
    return keyFilters;
  }


  @JsonProperty(value = JSON_PROPERTY_KEY_FILTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyFilters(@javax.annotation.Nullable List<KeyFilter> keyFilters) {
    this.keyFilters = keyFilters;
  }


  /**
   * Return true if this EntityCountQuery object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityCountQuery entityCountQuery = (EntityCountQuery) o;
    return Objects.equals(this.entityFilter, entityCountQuery.entityFilter) &&
        Objects.equals(this.keyFilters, entityCountQuery.keyFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityFilter, keyFilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityCountQuery {\n");
    sb.append("    entityFilter: ").append(toIndentedString(entityFilter)).append("\n");
    sb.append("    keyFilters: ").append(toIndentedString(keyFilters)).append("\n");
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

    // add `entityFilter` to the URL query string
    if (getEntityFilter() != null) {
      joiner.add(getEntityFilter().toUrlQueryString(prefix + "entityFilter" + suffix));
    }

    // add `keyFilters` to the URL query string
    if (getKeyFilters() != null) {
      for (int i = 0; i < getKeyFilters().size(); i++) {
        if (getKeyFilters().get(i) != null) {
          joiner.add(getKeyFilters().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%skeyFilters%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

