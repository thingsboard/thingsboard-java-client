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
import org.thingsboard.client.model.AlarmFilterConfig;
import org.thingsboard.client.model.DataKey;
import org.thingsboard.client.model.DataSourceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * DataSource
 */
@JsonPropertyOrder({
  DataSource.JSON_PROPERTY_TYPE,
  DataSource.JSON_PROPERTY_DEVICE_ID,
  DataSource.JSON_PROPERTY_ENTITY_ALIAS_ID,
  DataSource.JSON_PROPERTY_FILTER_ID,
  DataSource.JSON_PROPERTY_DATA_KEYS,
  DataSource.JSON_PROPERTY_LATEST_DATA_KEYS,
  DataSource.JSON_PROPERTY_ALARM_FILTER_CONFIG
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class DataSource {
  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private DataSourceType type;

  public static final String JSON_PROPERTY_DEVICE_ID = "deviceId";
  @javax.annotation.Nullable
  private String deviceId;

  public static final String JSON_PROPERTY_ENTITY_ALIAS_ID = "entityAliasId";
  @javax.annotation.Nullable
  private String entityAliasId;

  public static final String JSON_PROPERTY_FILTER_ID = "filterId";
  @javax.annotation.Nullable
  private String filterId;

  public static final String JSON_PROPERTY_DATA_KEYS = "dataKeys";
  @javax.annotation.Nullable
  private List<DataKey> dataKeys = new ArrayList<>();

  public static final String JSON_PROPERTY_LATEST_DATA_KEYS = "latestDataKeys";
  @javax.annotation.Nullable
  private List<DataKey> latestDataKeys = new ArrayList<>();

  public static final String JSON_PROPERTY_ALARM_FILTER_CONFIG = "alarmFilterConfig";
  @javax.annotation.Nullable
  private AlarmFilterConfig alarmFilterConfig;

  public DataSource() { 
  }

  public DataSource type(@javax.annotation.Nullable DataSourceType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DataSourceType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable DataSourceType type) {
    this.type = type;
  }


  public DataSource deviceId(@javax.annotation.Nullable String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Get deviceId
   * @return deviceId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEVICE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDeviceId() {
    return deviceId;
  }


  @JsonProperty(value = JSON_PROPERTY_DEVICE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceId(@javax.annotation.Nullable String deviceId) {
    this.deviceId = deviceId;
  }


  public DataSource entityAliasId(@javax.annotation.Nullable String entityAliasId) {
    this.entityAliasId = entityAliasId;
    return this;
  }

  /**
   * Get entityAliasId
   * @return entityAliasId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ENTITY_ALIAS_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEntityAliasId() {
    return entityAliasId;
  }


  @JsonProperty(value = JSON_PROPERTY_ENTITY_ALIAS_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityAliasId(@javax.annotation.Nullable String entityAliasId) {
    this.entityAliasId = entityAliasId;
  }


  public DataSource filterId(@javax.annotation.Nullable String filterId) {
    this.filterId = filterId;
    return this;
  }

  /**
   * Get filterId
   * @return filterId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FILTER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilterId() {
    return filterId;
  }


  @JsonProperty(value = JSON_PROPERTY_FILTER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilterId(@javax.annotation.Nullable String filterId) {
    this.filterId = filterId;
  }


  public DataSource dataKeys(@javax.annotation.Nullable List<DataKey> dataKeys) {
    this.dataKeys = dataKeys;
    return this;
  }

  public DataSource addDataKeysItem(DataKey dataKeysItem) {
    if (this.dataKeys == null) {
      this.dataKeys = new ArrayList<>();
    }
    this.dataKeys.add(dataKeysItem);
    return this;
  }

  /**
   * Get dataKeys
   * @return dataKeys
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DATA_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DataKey> getDataKeys() {
    return dataKeys;
  }


  @JsonProperty(value = JSON_PROPERTY_DATA_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataKeys(@javax.annotation.Nullable List<DataKey> dataKeys) {
    this.dataKeys = dataKeys;
  }


  public DataSource latestDataKeys(@javax.annotation.Nullable List<DataKey> latestDataKeys) {
    this.latestDataKeys = latestDataKeys;
    return this;
  }

  public DataSource addLatestDataKeysItem(DataKey latestDataKeysItem) {
    if (this.latestDataKeys == null) {
      this.latestDataKeys = new ArrayList<>();
    }
    this.latestDataKeys.add(latestDataKeysItem);
    return this;
  }

  /**
   * Get latestDataKeys
   * @return latestDataKeys
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LATEST_DATA_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DataKey> getLatestDataKeys() {
    return latestDataKeys;
  }


  @JsonProperty(value = JSON_PROPERTY_LATEST_DATA_KEYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestDataKeys(@javax.annotation.Nullable List<DataKey> latestDataKeys) {
    this.latestDataKeys = latestDataKeys;
  }


  public DataSource alarmFilterConfig(@javax.annotation.Nullable AlarmFilterConfig alarmFilterConfig) {
    this.alarmFilterConfig = alarmFilterConfig;
    return this;
  }

  /**
   * Get alarmFilterConfig
   * @return alarmFilterConfig
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ALARM_FILTER_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AlarmFilterConfig getAlarmFilterConfig() {
    return alarmFilterConfig;
  }


  @JsonProperty(value = JSON_PROPERTY_ALARM_FILTER_CONFIG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlarmFilterConfig(@javax.annotation.Nullable AlarmFilterConfig alarmFilterConfig) {
    this.alarmFilterConfig = alarmFilterConfig;
  }


  /**
   * Return true if this DataSource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSource dataSource = (DataSource) o;
    return Objects.equals(this.type, dataSource.type) &&
        Objects.equals(this.deviceId, dataSource.deviceId) &&
        Objects.equals(this.entityAliasId, dataSource.entityAliasId) &&
        Objects.equals(this.filterId, dataSource.filterId) &&
        Objects.equals(this.dataKeys, dataSource.dataKeys) &&
        Objects.equals(this.latestDataKeys, dataSource.latestDataKeys) &&
        Objects.equals(this.alarmFilterConfig, dataSource.alarmFilterConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, deviceId, entityAliasId, filterId, dataKeys, latestDataKeys, alarmFilterConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSource {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    entityAliasId: ").append(toIndentedString(entityAliasId)).append("\n");
    sb.append("    filterId: ").append(toIndentedString(filterId)).append("\n");
    sb.append("    dataKeys: ").append(toIndentedString(dataKeys)).append("\n");
    sb.append("    latestDataKeys: ").append(toIndentedString(latestDataKeys)).append("\n");
    sb.append("    alarmFilterConfig: ").append(toIndentedString(alarmFilterConfig)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `deviceId` to the URL query string
    if (getDeviceId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdeviceId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDeviceId()))));
    }

    // add `entityAliasId` to the URL query string
    if (getEntityAliasId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sentityAliasId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEntityAliasId()))));
    }

    // add `filterId` to the URL query string
    if (getFilterId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfilterId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFilterId()))));
    }

    // add `dataKeys` to the URL query string
    if (getDataKeys() != null) {
      for (int i = 0; i < getDataKeys().size(); i++) {
        if (getDataKeys().get(i) != null) {
          joiner.add(getDataKeys().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sdataKeys%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `latestDataKeys` to the URL query string
    if (getLatestDataKeys() != null) {
      for (int i = 0; i < getLatestDataKeys().size(); i++) {
        if (getLatestDataKeys().get(i) != null) {
          joiner.add(getLatestDataKeys().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%slatestDataKeys%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `alarmFilterConfig` to the URL query string
    if (getAlarmFilterConfig() != null) {
      joiner.add(getAlarmFilterConfig().toUrlQueryString(prefix + "alarmFilterConfig" + suffix));
    }

    return joiner.toString();
  }
}

