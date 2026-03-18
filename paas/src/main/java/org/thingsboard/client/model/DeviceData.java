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
import java.util.Arrays;
import org.thingsboard.client.model.DeviceConfiguration;
import org.thingsboard.client.model.DeviceTransportConfiguration;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * DeviceData
 */
@JsonPropertyOrder({
  DeviceData.JSON_PROPERTY_CONFIGURATION,
  DeviceData.JSON_PROPERTY_TRANSPORT_CONFIGURATION
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class DeviceData {
  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  @Nullable
  private DeviceConfiguration _configuration;

  public static final String JSON_PROPERTY_TRANSPORT_CONFIGURATION = "transportConfiguration";
  @Nullable
  private DeviceTransportConfiguration transportConfiguration;

  public DeviceData() { 
  }

  public DeviceData _configuration(@Nullable DeviceConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * Device configuration for device profile type. DEFAULT is only supported value for now
   * @return _configuration
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceConfiguration getConfiguration() {
    return _configuration;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguration(@Nullable DeviceConfiguration _configuration) {
    this._configuration = _configuration;
  }


  public DeviceData transportConfiguration(@Nullable DeviceTransportConfiguration transportConfiguration) {
    this.transportConfiguration = transportConfiguration;
    return this;
  }

  /**
   * Device transport configuration used to connect the device
   * @return transportConfiguration
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceTransportConfiguration getTransportConfiguration() {
    return transportConfiguration;
  }


  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportConfiguration(@Nullable DeviceTransportConfiguration transportConfiguration) {
    this.transportConfiguration = transportConfiguration;
  }


  /**
   * Return true if this DeviceData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceData deviceData = (DeviceData) o;
    return Objects.equals(this._configuration, deviceData._configuration) &&
        Objects.equals(this.transportConfiguration, deviceData.transportConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, transportConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceData {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    transportConfiguration: ").append(toIndentedString(transportConfiguration)).append("\n");
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

    return joiner.toString();
  }
}

