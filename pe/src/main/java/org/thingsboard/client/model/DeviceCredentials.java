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
import org.thingsboard.client.model.DeviceCredentialsId;
import org.thingsboard.client.model.DeviceCredentialsType;
import org.thingsboard.client.model.DeviceId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the device credentials.
 */
@JsonPropertyOrder({
  DeviceCredentials.JSON_PROPERTY_ID,
  DeviceCredentials.JSON_PROPERTY_CREATED_TIME,
  DeviceCredentials.JSON_PROPERTY_DEVICE_ID,
  DeviceCredentials.JSON_PROPERTY_CREDENTIALS_TYPE,
  DeviceCredentials.JSON_PROPERTY_CREDENTIALS_ID,
  DeviceCredentials.JSON_PROPERTY_CREDENTIALS_VALUE,
  DeviceCredentials.JSON_PROPERTY_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class DeviceCredentials {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private DeviceCredentialsId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_DEVICE_ID = "deviceId";
  @javax.annotation.Nonnull
  private DeviceId deviceId;

  public static final String JSON_PROPERTY_CREDENTIALS_TYPE = "credentialsType";
  @javax.annotation.Nullable
  private DeviceCredentialsType credentialsType;

  public static final String JSON_PROPERTY_CREDENTIALS_ID = "credentialsId";
  @javax.annotation.Nonnull
  private String credentialsId;

  public static final String JSON_PROPERTY_CREDENTIALS_VALUE = "credentialsValue";
  @javax.annotation.Nullable
  private String credentialsValue;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Long version;

  public DeviceCredentials() { 
  }

  @JsonCreator
  public DeviceCredentials(
    @JsonProperty(JSON_PROPERTY_ID) DeviceCredentialsId id
  ) {
  this();
    this.id = id;
  }

  /**
   * The Id is automatically generated during device creation. Use &#39;getDeviceCredentialsByDeviceId&#39; to obtain the id based on device id. Use &#39;updateDeviceCredentials&#39; to update device credentials. 
   * @return id
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DeviceCredentialsId getId() {
    return id;
  }




  public DeviceCredentials createdTime(@javax.annotation.Nullable Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Timestamp of the device credentials creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }


  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedTime(@javax.annotation.Nullable Long createdTime) {
    this.createdTime = createdTime;
  }


  public DeviceCredentials deviceId(@javax.annotation.Nonnull DeviceId deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * JSON object with the device Id.
   * @return deviceId
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_DEVICE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DeviceId getDeviceId() {
    return deviceId;
  }


  @JsonProperty(value = JSON_PROPERTY_DEVICE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeviceId(@javax.annotation.Nonnull DeviceId deviceId) {
    this.deviceId = deviceId;
  }


  public DeviceCredentials credentialsType(@javax.annotation.Nullable DeviceCredentialsType credentialsType) {
    this.credentialsType = credentialsType;
    return this;
  }

  /**
   * Type of the credentials
   * @return credentialsType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREDENTIALS_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceCredentialsType getCredentialsType() {
    return credentialsType;
  }


  @JsonProperty(value = JSON_PROPERTY_CREDENTIALS_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredentialsType(@javax.annotation.Nullable DeviceCredentialsType credentialsType) {
    this.credentialsType = credentialsType;
  }


  public DeviceCredentials credentialsId(@javax.annotation.Nonnull String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  /**
   * Unique Credentials Id per platform instance. Used to lookup credentials from the database. By default, new access token for your device. Depends on the type of the credentials.
   * @return credentialsId
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_CREDENTIALS_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCredentialsId() {
    return credentialsId;
  }


  @JsonProperty(value = JSON_PROPERTY_CREDENTIALS_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCredentialsId(@javax.annotation.Nonnull String credentialsId) {
    this.credentialsId = credentialsId;
  }


  public DeviceCredentials credentialsValue(@javax.annotation.Nullable String credentialsValue) {
    this.credentialsValue = credentialsValue;
    return this;
  }

  /**
   * Value of the credentials. Null in case of ACCESS_TOKEN credentials type. Base64 value in case of X509_CERTIFICATE. Complex object in case of MQTT_BASIC and LWM2M_CREDENTIALS
   * @return credentialsValue
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREDENTIALS_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCredentialsValue() {
    return credentialsValue;
  }


  @JsonProperty(value = JSON_PROPERTY_CREDENTIALS_VALUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredentialsValue(@javax.annotation.Nullable String credentialsValue) {
    this.credentialsValue = credentialsValue;
  }


  public DeviceCredentials version(@javax.annotation.Nullable Long version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@javax.annotation.Nullable Long version) {
    this.version = version;
  }


  /**
   * Return true if this DeviceCredentials object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceCredentials deviceCredentials = (DeviceCredentials) o;
    return Objects.equals(this.id, deviceCredentials.id) &&
        Objects.equals(this.createdTime, deviceCredentials.createdTime) &&
        Objects.equals(this.deviceId, deviceCredentials.deviceId) &&
        Objects.equals(this.credentialsType, deviceCredentials.credentialsType) &&
        Objects.equals(this.credentialsId, deviceCredentials.credentialsId) &&
        Objects.equals(this.credentialsValue, deviceCredentials.credentialsValue) &&
        Objects.equals(this.version, deviceCredentials.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, deviceId, credentialsType, credentialsId, credentialsValue, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceCredentials {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    credentialsType: ").append(toIndentedString(credentialsType)).append("\n");
    sb.append("    credentialsId: ").append(toIndentedString(credentialsId)).append("\n");
    sb.append("    credentialsValue: ").append(toIndentedString(credentialsValue)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(getId().toUrlQueryString(prefix + "id" + suffix));
    }

    // add `createdTime` to the URL query string
    if (getCreatedTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%screatedTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCreatedTime()))));
    }

    // add `deviceId` to the URL query string
    if (getDeviceId() != null) {
      joiner.add(getDeviceId().toUrlQueryString(prefix + "deviceId" + suffix));
    }

    // add `credentialsType` to the URL query string
    if (getCredentialsType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scredentialsType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCredentialsType()))));
    }

    // add `credentialsId` to the URL query string
    if (getCredentialsId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scredentialsId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCredentialsId()))));
    }

    // add `credentialsValue` to the URL query string
    if (getCredentialsValue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scredentialsValue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCredentialsValue()))));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    return joiner.toString();
  }
}

