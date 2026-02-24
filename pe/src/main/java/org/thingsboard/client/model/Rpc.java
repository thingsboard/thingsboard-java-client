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
import org.thingsboard.client.model.DeviceId;
import org.thingsboard.client.model.RpcId;
import org.thingsboard.client.model.RpcStatus;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Rpc
 */
@JsonPropertyOrder({
  Rpc.JSON_PROPERTY_ID,
  Rpc.JSON_PROPERTY_CREATED_TIME,
  Rpc.JSON_PROPERTY_TENANT_ID,
  Rpc.JSON_PROPERTY_DEVICE_ID,
  Rpc.JSON_PROPERTY_EXPIRATION_TIME,
  Rpc.JSON_PROPERTY_REQUEST,
  Rpc.JSON_PROPERTY_RESPONSE,
  Rpc.JSON_PROPERTY_STATUS,
  Rpc.JSON_PROPERTY_ADDITIONAL_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class Rpc {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private RpcId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_DEVICE_ID = "deviceId";
  @javax.annotation.Nullable
  private DeviceId deviceId;

  public static final String JSON_PROPERTY_EXPIRATION_TIME = "expirationTime";
  @javax.annotation.Nullable
  private Long expirationTime;

  public static final String JSON_PROPERTY_REQUEST = "request";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode request;

  public static final String JSON_PROPERTY_RESPONSE = "response";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode response;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nullable
  private RpcStatus status;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public Rpc() { 
  }

  @JsonCreator
  public Rpc(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_DEVICE_ID) DeviceId deviceId, 
    @JsonProperty(JSON_PROPERTY_EXPIRATION_TIME) Long expirationTime, 
    @JsonProperty(JSON_PROPERTY_REQUEST) com.fasterxml.jackson.databind.JsonNode request, 
    @JsonProperty(JSON_PROPERTY_RESPONSE) com.fasterxml.jackson.databind.JsonNode response, 
    @JsonProperty(JSON_PROPERTY_STATUS) RpcStatus status, 
    @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFO) com.fasterxml.jackson.databind.JsonNode additionalInfo
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.deviceId = deviceId;
    this.expirationTime = expirationTime;
    this.request = request;
    this.response = response;
    this.status = status;
    this.additionalInfo = additionalInfo;
  }

  public Rpc id(@javax.annotation.Nullable RpcId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the rpc Id. Referencing non-existing rpc Id will cause error.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RpcId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable RpcId id) {
    this.id = id;
  }


  /**
   * Timestamp of the rpc creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with Tenant Id.
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  /**
   * JSON object with Device Id.
   * @return deviceId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEVICE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceId getDeviceId() {
    return deviceId;
  }




  /**
   * Expiration time of the request.
   * @return expirationTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EXPIRATION_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExpirationTime() {
    return expirationTime;
  }




  /**
   * The request body that will be used to send message to device.
   * @return request
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REQUEST, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getRequest() {
    return request;
  }




  /**
   * The response from the device.
   * @return response
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RESPONSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getResponse() {
    return response;
  }




  /**
   * The current status of the RPC call.
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RpcStatus getStatus() {
    return status;
  }




  /**
   * Additional info used in the rule engine to process the updates to the RPC state.
   * @return additionalInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getAdditionalInfo() {
    return additionalInfo;
  }




  /**
   * Return true if this Rpc object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rpc rpc = (Rpc) o;
    return Objects.equals(this.id, rpc.id) &&
        Objects.equals(this.createdTime, rpc.createdTime) &&
        Objects.equals(this.tenantId, rpc.tenantId) &&
        Objects.equals(this.deviceId, rpc.deviceId) &&
        Objects.equals(this.expirationTime, rpc.expirationTime) &&
        Objects.equals(this.request, rpc.request) &&
        Objects.equals(this.response, rpc.response) &&
        Objects.equals(this.status, rpc.status) &&
        Objects.equals(this.additionalInfo, rpc.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, deviceId, expirationTime, request, response, status, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rpc {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    // add `deviceId` to the URL query string
    if (getDeviceId() != null) {
      joiner.add(getDeviceId().toUrlQueryString(prefix + "deviceId" + suffix));
    }

    // add `expirationTime` to the URL query string
    if (getExpirationTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexpirationTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExpirationTime()))));
    }

    // add `request` to the URL query string
    if (getRequest() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srequest%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRequest()))));
    }

    // add `response` to the URL query string
    if (getResponse() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sresponse%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getResponse()))));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    return joiner.toString();
  }
}

