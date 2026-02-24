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
import org.thingsboard.client.model.Device;
import org.thingsboard.client.model.DeviceCredentials;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * The JSON object with device and credentials. See method description above for example.
 */
@JsonPropertyOrder({
  SaveDeviceWithCredentialsRequest.JSON_PROPERTY_DEVICE,
  SaveDeviceWithCredentialsRequest.JSON_PROPERTY_CREDENTIALS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class SaveDeviceWithCredentialsRequest {
  public static final String JSON_PROPERTY_DEVICE = "device";
  @javax.annotation.Nonnull
  private Device device;

  public static final String JSON_PROPERTY_CREDENTIALS = "credentials";
  @javax.annotation.Nonnull
  private DeviceCredentials credentials;

  public SaveDeviceWithCredentialsRequest() { 
  }

  public SaveDeviceWithCredentialsRequest device(@javax.annotation.Nonnull Device device) {
    this.device = device;
    return this;
  }

  /**
   * The JSON with device entity.
   * @return device
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_DEVICE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Device getDevice() {
    return device;
  }


  @JsonProperty(value = JSON_PROPERTY_DEVICE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDevice(@javax.annotation.Nonnull Device device) {
    this.device = device;
  }


  public SaveDeviceWithCredentialsRequest credentials(@javax.annotation.Nonnull DeviceCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

  /**
   * The JSON with credentials entity.
   * @return credentials
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CREDENTIALS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DeviceCredentials getCredentials() {
    return credentials;
  }


  @JsonProperty(value = JSON_PROPERTY_CREDENTIALS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCredentials(@javax.annotation.Nonnull DeviceCredentials credentials) {
    this.credentials = credentials;
  }


  /**
   * Return true if this SaveDeviceWithCredentialsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveDeviceWithCredentialsRequest saveDeviceWithCredentialsRequest = (SaveDeviceWithCredentialsRequest) o;
    return Objects.equals(this.device, saveDeviceWithCredentialsRequest.device) &&
        Objects.equals(this.credentials, saveDeviceWithCredentialsRequest.credentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, credentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveDeviceWithCredentialsRequest {\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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

    // add `device` to the URL query string
    if (getDevice() != null) {
      joiner.add(getDevice().toUrlQueryString(prefix + "device" + suffix));
    }

    // add `credentials` to the URL query string
    if (getCredentials() != null) {
      joiner.add(getCredentials().toUrlQueryString(prefix + "credentials" + suffix));
    }

    return joiner.toString();
  }
}

