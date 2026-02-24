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
import org.thingsboard.client.model.DeviceProfileAlarm;
import org.thingsboard.client.model.DeviceProfileConfiguration;
import org.thingsboard.client.model.DeviceProfileProvisionConfiguration;
import org.thingsboard.client.model.DeviceProfileTransportConfiguration;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * DeviceProfileData
 */
@JsonPropertyOrder({
  DeviceProfileData.JSON_PROPERTY_CONFIGURATION,
  DeviceProfileData.JSON_PROPERTY_TRANSPORT_CONFIGURATION,
  DeviceProfileData.JSON_PROPERTY_PROVISION_CONFIGURATION,
  DeviceProfileData.JSON_PROPERTY_ALARMS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class DeviceProfileData {
  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  @javax.annotation.Nullable
  private DeviceProfileConfiguration _configuration;

  public static final String JSON_PROPERTY_TRANSPORT_CONFIGURATION = "transportConfiguration";
  @javax.annotation.Nullable
  private DeviceProfileTransportConfiguration transportConfiguration;

  public static final String JSON_PROPERTY_PROVISION_CONFIGURATION = "provisionConfiguration";
  @javax.annotation.Nullable
  private DeviceProfileProvisionConfiguration provisionConfiguration;

  public static final String JSON_PROPERTY_ALARMS = "alarms";
  @javax.annotation.Nullable
  private List<DeviceProfileAlarm> alarms = new ArrayList<>();

  public DeviceProfileData() { 
  }

  public DeviceProfileData _configuration(@javax.annotation.Nullable DeviceProfileConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * JSON object of device profile configuration
   * @return _configuration
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceProfileConfiguration getConfiguration() {
    return _configuration;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguration(@javax.annotation.Nullable DeviceProfileConfiguration _configuration) {
    this._configuration = _configuration;
  }


  public DeviceProfileData transportConfiguration(@javax.annotation.Nullable DeviceProfileTransportConfiguration transportConfiguration) {
    this.transportConfiguration = transportConfiguration;
    return this;
  }

  /**
   * JSON object of device profile transport configuration
   * @return transportConfiguration
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceProfileTransportConfiguration getTransportConfiguration() {
    return transportConfiguration;
  }


  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportConfiguration(@javax.annotation.Nullable DeviceProfileTransportConfiguration transportConfiguration) {
    this.transportConfiguration = transportConfiguration;
  }


  public DeviceProfileData provisionConfiguration(@javax.annotation.Nullable DeviceProfileProvisionConfiguration provisionConfiguration) {
    this.provisionConfiguration = provisionConfiguration;
    return this;
  }

  /**
   * JSON object of provisioning strategy type per device profile
   * @return provisionConfiguration
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROVISION_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceProfileProvisionConfiguration getProvisionConfiguration() {
    return provisionConfiguration;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVISION_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvisionConfiguration(@javax.annotation.Nullable DeviceProfileProvisionConfiguration provisionConfiguration) {
    this.provisionConfiguration = provisionConfiguration;
  }


  public DeviceProfileData alarms(@javax.annotation.Nullable List<DeviceProfileAlarm> alarms) {
    this.alarms = alarms;
    return this;
  }

  public DeviceProfileData addAlarmsItem(DeviceProfileAlarm alarmsItem) {
    if (this.alarms == null) {
      this.alarms = new ArrayList<>();
    }
    this.alarms.add(alarmsItem);
    return this;
  }

  /**
   * Get alarms
   * @return alarms
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ALARMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DeviceProfileAlarm> getAlarms() {
    return alarms;
  }


  @JsonProperty(value = JSON_PROPERTY_ALARMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlarms(@javax.annotation.Nullable List<DeviceProfileAlarm> alarms) {
    this.alarms = alarms;
  }


  /**
   * Return true if this DeviceProfileData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceProfileData deviceProfileData = (DeviceProfileData) o;
    return Objects.equals(this._configuration, deviceProfileData._configuration) &&
        Objects.equals(this.transportConfiguration, deviceProfileData.transportConfiguration) &&
        Objects.equals(this.provisionConfiguration, deviceProfileData.provisionConfiguration) &&
        Objects.equals(this.alarms, deviceProfileData.alarms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, transportConfiguration, provisionConfiguration, alarms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceProfileData {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    transportConfiguration: ").append(toIndentedString(transportConfiguration)).append("\n");
    sb.append("    provisionConfiguration: ").append(toIndentedString(provisionConfiguration)).append("\n");
    sb.append("    alarms: ").append(toIndentedString(alarms)).append("\n");
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

    // add `configuration` to the URL query string
    if (getConfiguration() != null) {
      joiner.add(getConfiguration().toUrlQueryString(prefix + "configuration" + suffix));
    }

    // add `transportConfiguration` to the URL query string
    if (getTransportConfiguration() != null) {
      joiner.add(getTransportConfiguration().toUrlQueryString(prefix + "transportConfiguration" + suffix));
    }

    // add `provisionConfiguration` to the URL query string
    if (getProvisionConfiguration() != null) {
      joiner.add(getProvisionConfiguration().toUrlQueryString(prefix + "provisionConfiguration" + suffix));
    }

    // add `alarms` to the URL query string
    if (getAlarms() != null) {
      for (int i = 0; i < getAlarms().size(); i++) {
        if (getAlarms().get(i) != null) {
          joiner.add(getAlarms().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%salarms%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

