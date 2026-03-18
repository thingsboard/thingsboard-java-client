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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.thingsboard.client.model.AlarmDataPageLink;
import org.thingsboard.client.model.EntityFilter;
import org.thingsboard.client.model.EntityKey;
import org.thingsboard.client.model.KeyFilter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the alarm data query. See API call notes above for more details.
 */
@JsonPropertyOrder({
  AlarmDataQuery.JSON_PROPERTY_ENTITY_FILTER,
  AlarmDataQuery.JSON_PROPERTY_KEY_FILTERS,
  AlarmDataQuery.JSON_PROPERTY_PAGE_LINK,
  AlarmDataQuery.JSON_PROPERTY_ENTITY_FIELDS,
  AlarmDataQuery.JSON_PROPERTY_LATEST_VALUES,
  AlarmDataQuery.JSON_PROPERTY_ALARM_FIELDS
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class AlarmDataQuery {
  public static final String JSON_PROPERTY_ENTITY_FILTER = "entityFilter";
  @Nullable
  private EntityFilter entityFilter;

  public static final String JSON_PROPERTY_KEY_FILTERS = "keyFilters";
  @Nullable
  private List<KeyFilter> keyFilters = new ArrayList<>();

  public static final String JSON_PROPERTY_PAGE_LINK = "pageLink";
  @Nullable
  private AlarmDataPageLink pageLink;

  public static final String JSON_PROPERTY_ENTITY_FIELDS = "entityFields";
  @Nullable
  private List<EntityKey> entityFields = new ArrayList<>();

  public static final String JSON_PROPERTY_LATEST_VALUES = "latestValues";
  @Nullable
  private List<EntityKey> latestValues = new ArrayList<>();

  public static final String JSON_PROPERTY_ALARM_FIELDS = "alarmFields";
  @Nullable
  private List<EntityKey> alarmFields = new ArrayList<>();

  public AlarmDataQuery() { 
  }

  public AlarmDataQuery entityFilter(@Nullable EntityFilter entityFilter) {
    this.entityFilter = entityFilter;
    return this;
  }

  /**
   * Get entityFilter
   * @return entityFilter
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_FILTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityFilter getEntityFilter() {
    return entityFilter;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_FILTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityFilter(@Nullable EntityFilter entityFilter) {
    this.entityFilter = entityFilter;
  }


  public AlarmDataQuery keyFilters(@Nullable List<KeyFilter> keyFilters) {
    this.keyFilters = keyFilters;
    return this;
  }

  public AlarmDataQuery addKeyFiltersItem(KeyFilter keyFiltersItem) {
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
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_KEY_FILTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<KeyFilter> getKeyFilters() {
    return keyFilters;
  }


  @JsonProperty(value = JSON_PROPERTY_KEY_FILTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyFilters(@Nullable List<KeyFilter> keyFilters) {
    this.keyFilters = keyFilters;
  }


  public AlarmDataQuery pageLink(@Nullable AlarmDataPageLink pageLink) {
    this.pageLink = pageLink;
    return this;
  }

  /**
   * Get pageLink
   * @return pageLink
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PAGE_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AlarmDataPageLink getPageLink() {
    return pageLink;
  }


  @JsonProperty(value = JSON_PROPERTY_PAGE_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageLink(@Nullable AlarmDataPageLink pageLink) {
    this.pageLink = pageLink;
  }


  public AlarmDataQuery entityFields(@Nullable List<EntityKey> entityFields) {
    this.entityFields = entityFields;
    return this;
  }

  public AlarmDataQuery addEntityFieldsItem(EntityKey entityFieldsItem) {
    if (this.entityFields == null) {
      this.entityFields = new ArrayList<>();
    }
    this.entityFields.add(entityFieldsItem);
    return this;
  }

  /**
   * Get entityFields
   * @return entityFields
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EntityKey> getEntityFields() {
    return entityFields;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityFields(@Nullable List<EntityKey> entityFields) {
    this.entityFields = entityFields;
  }


  public AlarmDataQuery latestValues(@Nullable List<EntityKey> latestValues) {
    this.latestValues = latestValues;
    return this;
  }

  public AlarmDataQuery addLatestValuesItem(EntityKey latestValuesItem) {
    if (this.latestValues == null) {
      this.latestValues = new ArrayList<>();
    }
    this.latestValues.add(latestValuesItem);
    return this;
  }

  /**
   * Get latestValues
   * @return latestValues
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LATEST_VALUES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EntityKey> getLatestValues() {
    return latestValues;
  }


  @JsonProperty(value = JSON_PROPERTY_LATEST_VALUES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestValues(@Nullable List<EntityKey> latestValues) {
    this.latestValues = latestValues;
  }


  public AlarmDataQuery alarmFields(@Nullable List<EntityKey> alarmFields) {
    this.alarmFields = alarmFields;
    return this;
  }

  public AlarmDataQuery addAlarmFieldsItem(EntityKey alarmFieldsItem) {
    if (this.alarmFields == null) {
      this.alarmFields = new ArrayList<>();
    }
    this.alarmFields.add(alarmFieldsItem);
    return this;
  }

  /**
   * Get alarmFields
   * @return alarmFields
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ALARM_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EntityKey> getAlarmFields() {
    return alarmFields;
  }


  @JsonProperty(value = JSON_PROPERTY_ALARM_FIELDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlarmFields(@Nullable List<EntityKey> alarmFields) {
    this.alarmFields = alarmFields;
  }


  /**
   * Return true if this AlarmDataQuery object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmDataQuery alarmDataQuery = (AlarmDataQuery) o;
    return Objects.equals(this.entityFilter, alarmDataQuery.entityFilter) &&
        Objects.equals(this.keyFilters, alarmDataQuery.keyFilters) &&
        Objects.equals(this.pageLink, alarmDataQuery.pageLink) &&
        Objects.equals(this.entityFields, alarmDataQuery.entityFields) &&
        Objects.equals(this.latestValues, alarmDataQuery.latestValues) &&
        Objects.equals(this.alarmFields, alarmDataQuery.alarmFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityFilter, keyFilters, pageLink, entityFields, latestValues, alarmFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmDataQuery {\n");
    sb.append("    entityFilter: ").append(toIndentedString(entityFilter)).append("\n");
    sb.append("    keyFilters: ").append(toIndentedString(keyFilters)).append("\n");
    sb.append("    pageLink: ").append(toIndentedString(pageLink)).append("\n");
    sb.append("    entityFields: ").append(toIndentedString(entityFields)).append("\n");
    sb.append("    latestValues: ").append(toIndentedString(latestValues)).append("\n");
    sb.append("    alarmFields: ").append(toIndentedString(alarmFields)).append("\n");
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

    // add `pageLink` to the URL query string
    if (getPageLink() != null) {
      joiner.add(getPageLink().toUrlQueryString(prefix + "pageLink" + suffix));
    }

    // add `entityFields` to the URL query string
    if (getEntityFields() != null) {
      for (int i = 0; i < getEntityFields().size(); i++) {
        if (getEntityFields().get(i) != null) {
          joiner.add(getEntityFields().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sentityFields%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `latestValues` to the URL query string
    if (getLatestValues() != null) {
      for (int i = 0; i < getLatestValues().size(); i++) {
        if (getLatestValues().get(i) != null) {
          joiner.add(getLatestValues().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%slatestValues%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `alarmFields` to the URL query string
    if (getAlarmFields() != null) {
      for (int i = 0; i < getAlarmFields().size(); i++) {
        if (getAlarmFields().get(i) != null) {
          joiner.add(getAlarmFields().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%salarmFields%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

