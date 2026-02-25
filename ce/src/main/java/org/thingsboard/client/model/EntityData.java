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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.thingsboard.client.model.ComparisonTsValue;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.TsValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * EntityData
 */
@JsonPropertyOrder({
  EntityData.JSON_PROPERTY_ENTITY_ID,
  EntityData.JSON_PROPERTY_LATEST,
  EntityData.JSON_PROPERTY_TIMESERIES,
  EntityData.JSON_PROPERTY_AGG_LATEST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class EntityData {
  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  @javax.annotation.Nullable
  private EntityId entityId;

  public static final String JSON_PROPERTY_LATEST = "latest";
  @javax.annotation.Nullable
  private Map<String, Map<String, TsValue>> latest = new HashMap<>();

  public static final String JSON_PROPERTY_TIMESERIES = "timeseries";
  @javax.annotation.Nullable
  private Map<String, List<TsValue>> timeseries = new HashMap<>();

  public static final String JSON_PROPERTY_AGG_LATEST = "aggLatest";
  @javax.annotation.Nullable
  private Map<String, ComparisonTsValue> aggLatest = new HashMap<>();

  public EntityData() { 
  }

  public EntityData entityId(@javax.annotation.Nullable EntityId entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getEntityId() {
    return entityId;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(@javax.annotation.Nullable EntityId entityId) {
    this.entityId = entityId;
  }


  public EntityData latest(@javax.annotation.Nullable Map<String, Map<String, TsValue>> latest) {
    this.latest = latest;
    return this;
  }

  public EntityData putLatestItem(String key, Map<String, TsValue> latestItem) {
    if (this.latest == null) {
      this.latest = new HashMap<>();
    }
    this.latest.put(key, latestItem);
    return this;
  }

  /**
   * Get latest
   * @return latest
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LATEST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Map<String, TsValue>> getLatest() {
    return latest;
  }


  @JsonProperty(value = JSON_PROPERTY_LATEST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatest(@javax.annotation.Nullable Map<String, Map<String, TsValue>> latest) {
    this.latest = latest;
  }


  public EntityData timeseries(@javax.annotation.Nullable Map<String, List<TsValue>> timeseries) {
    this.timeseries = timeseries;
    return this;
  }

  public EntityData putTimeseriesItem(String key, List<TsValue> timeseriesItem) {
    if (this.timeseries == null) {
      this.timeseries = new HashMap<>();
    }
    this.timeseries.put(key, timeseriesItem);
    return this;
  }

  /**
   * Get timeseries
   * @return timeseries
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TIMESERIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, List<TsValue>> getTimeseries() {
    return timeseries;
  }


  @JsonProperty(value = JSON_PROPERTY_TIMESERIES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeseries(@javax.annotation.Nullable Map<String, List<TsValue>> timeseries) {
    this.timeseries = timeseries;
  }


  public EntityData aggLatest(@javax.annotation.Nullable Map<String, ComparisonTsValue> aggLatest) {
    this.aggLatest = aggLatest;
    return this;
  }

  public EntityData putAggLatestItem(String key, ComparisonTsValue aggLatestItem) {
    if (this.aggLatest == null) {
      this.aggLatest = new HashMap<>();
    }
    this.aggLatest.put(key, aggLatestItem);
    return this;
  }

  /**
   * Get aggLatest
   * @return aggLatest
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AGG_LATEST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, ComparisonTsValue> getAggLatest() {
    return aggLatest;
  }


  @JsonProperty(value = JSON_PROPERTY_AGG_LATEST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAggLatest(@javax.annotation.Nullable Map<String, ComparisonTsValue> aggLatest) {
    this.aggLatest = aggLatest;
  }


  /**
   * Return true if this EntityData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityData entityData = (EntityData) o;
    return Objects.equals(this.entityId, entityData.entityId) &&
        Objects.equals(this.latest, entityData.latest) &&
        Objects.equals(this.timeseries, entityData.timeseries) &&
        Objects.equals(this.aggLatest, entityData.aggLatest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, latest, timeseries, aggLatest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityData {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    timeseries: ").append(toIndentedString(timeseries)).append("\n");
    sb.append("    aggLatest: ").append(toIndentedString(aggLatest)).append("\n");
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

    // add `entityId` to the URL query string
    if (getEntityId() != null) {
      joiner.add(getEntityId().toUrlQueryString(prefix + "entityId" + suffix));
    }

    // add `latest` to the URL query string
    if (getLatest() != null) {
      for (String _key : getLatest().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%slatest%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getLatest().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getLatest().get(_key)))));
      }
    }

    // add `timeseries` to the URL query string
    if (getTimeseries() != null) {
      for (String _key : getTimeseries().keySet()) {
        joiner.add(String.format(java.util.Locale.ROOT, "%stimeseries%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix),
            getTimeseries().get(_key), ApiClient.urlEncode(ApiClient.valueToString(getTimeseries().get(_key)))));
      }
    }

    // add `aggLatest` to the URL query string
    if (getAggLatest() != null) {
      for (String _key : getAggLatest().keySet()) {
        if (getAggLatest().get(_key) != null) {
          joiner.add(getAggLatest().get(_key).toUrlQueryString(String.format(java.util.Locale.ROOT, "%saggLatest%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

