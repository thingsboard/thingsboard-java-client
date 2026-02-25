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
import org.thingsboard.client.model.RelationEntityTypeFilter;
import org.thingsboard.client.model.RelationsSearchParameters;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the entity relations query object.
 */
@JsonPropertyOrder({
  EntityRelationsQuery.JSON_PROPERTY_PARAMETERS,
  EntityRelationsQuery.JSON_PROPERTY_FILTERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class EntityRelationsQuery {
  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  @javax.annotation.Nullable
  private RelationsSearchParameters parameters;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  @javax.annotation.Nullable
  private List<RelationEntityTypeFilter> filters = new ArrayList<>();

  public EntityRelationsQuery() { 
  }

  public EntityRelationsQuery parameters(@javax.annotation.Nullable RelationsSearchParameters parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Main search parameters.
   * @return parameters
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PARAMETERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationsSearchParameters getParameters() {
    return parameters;
  }


  @JsonProperty(value = JSON_PROPERTY_PARAMETERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameters(@javax.annotation.Nullable RelationsSearchParameters parameters) {
    this.parameters = parameters;
  }


  public EntityRelationsQuery filters(@javax.annotation.Nullable List<RelationEntityTypeFilter> filters) {
    this.filters = filters;
    return this;
  }

  public EntityRelationsQuery addFiltersItem(RelationEntityTypeFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Main filters.
   * @return filters
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FILTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RelationEntityTypeFilter> getFilters() {
    return filters;
  }


  @JsonProperty(value = JSON_PROPERTY_FILTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilters(@javax.annotation.Nullable List<RelationEntityTypeFilter> filters) {
    this.filters = filters;
  }


  /**
   * Return true if this EntityRelationsQuery object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityRelationsQuery entityRelationsQuery = (EntityRelationsQuery) o;
    return Objects.equals(this.parameters, entityRelationsQuery.parameters) &&
        Objects.equals(this.filters, entityRelationsQuery.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityRelationsQuery {\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

    // add `parameters` to the URL query string
    if (getParameters() != null) {
      joiner.add(getParameters().toUrlQueryString(prefix + "parameters" + suffix));
    }

    // add `filters` to the URL query string
    if (getFilters() != null) {
      for (int i = 0; i < getFilters().size(); i++) {
        if (getFilters().get(i) != null) {
          joiner.add(getFilters().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sfilters%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

