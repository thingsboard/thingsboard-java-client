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
import org.thingsboard.client.model.DashboardId;
import org.thingsboard.client.model.DeviceProfileType;
import org.thingsboard.client.model.DeviceTransportType;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * DeviceProfileInfo
 */
@JsonPropertyOrder({
  DeviceProfileInfo.JSON_PROPERTY_ID,
  DeviceProfileInfo.JSON_PROPERTY_NAME,
  DeviceProfileInfo.JSON_PROPERTY_IMAGE,
  DeviceProfileInfo.JSON_PROPERTY_DEFAULT_DASHBOARD_ID,
  DeviceProfileInfo.JSON_PROPERTY_TYPE,
  DeviceProfileInfo.JSON_PROPERTY_TRANSPORT_TYPE,
  DeviceProfileInfo.JSON_PROPERTY_TENANT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class DeviceProfileInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private EntityId id;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_IMAGE = "image";
  @javax.annotation.Nullable
  private String image;

  public static final String JSON_PROPERTY_DEFAULT_DASHBOARD_ID = "defaultDashboardId";
  @javax.annotation.Nullable
  private DashboardId defaultDashboardId;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private DeviceProfileType type;

  public static final String JSON_PROPERTY_TRANSPORT_TYPE = "transportType";
  @javax.annotation.Nullable
  private DeviceTransportType transportType;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public DeviceProfileInfo() { 
  }

  public DeviceProfileInfo id(@javax.annotation.Nullable EntityId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the entity Id. 
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable EntityId id) {
    this.id = id;
  }


  public DeviceProfileInfo name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Entity Name
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public DeviceProfileInfo image(@javax.annotation.Nullable String image) {
    this.image = image;
    return this;
  }

  /**
   * Either URL or Base64 data of the icon. Used in the mobile application to visualize set of device profiles in the grid view. 
   * @return image
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getImage() {
    return image;
  }


  @JsonProperty(value = JSON_PROPERTY_IMAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImage(@javax.annotation.Nullable String image) {
    this.image = image;
  }


  public DeviceProfileInfo defaultDashboardId(@javax.annotation.Nullable DashboardId defaultDashboardId) {
    this.defaultDashboardId = defaultDashboardId;
    return this;
  }

  /**
   * Reference to the dashboard. Used in the mobile application to open the default dashboard when user navigates to device details.
   * @return defaultDashboardId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT_DASHBOARD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardId getDefaultDashboardId() {
    return defaultDashboardId;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_DASHBOARD_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultDashboardId(@javax.annotation.Nullable DashboardId defaultDashboardId) {
    this.defaultDashboardId = defaultDashboardId;
  }


  public DeviceProfileInfo type(@javax.annotation.Nullable DeviceProfileType type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the profile. Always &#39;DEFAULT&#39; for now. Reserved for future use.
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceProfileType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable DeviceProfileType type) {
    this.type = type;
  }


  public DeviceProfileInfo transportType(@javax.annotation.Nullable DeviceTransportType transportType) {
    this.transportType = transportType;
    return this;
  }

  /**
   * Type of the transport used to connect the device. Default transport supports HTTP, CoAP and MQTT.
   * @return transportType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceTransportType getTransportType() {
    return transportType;
  }


  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportType(@javax.annotation.Nullable DeviceTransportType transportType) {
    this.transportType = transportType;
  }


  public DeviceProfileInfo tenantId(@javax.annotation.Nullable TenantId tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Tenant id.
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(@javax.annotation.Nullable TenantId tenantId) {
    this.tenantId = tenantId;
  }


  /**
   * Return true if this DeviceProfileInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceProfileInfo deviceProfileInfo = (DeviceProfileInfo) o;
    return Objects.equals(this.id, deviceProfileInfo.id) &&
        Objects.equals(this.name, deviceProfileInfo.name) &&
        Objects.equals(this.image, deviceProfileInfo.image) &&
        Objects.equals(this.defaultDashboardId, deviceProfileInfo.defaultDashboardId) &&
        Objects.equals(this.type, deviceProfileInfo.type) &&
        Objects.equals(this.transportType, deviceProfileInfo.transportType) &&
        Objects.equals(this.tenantId, deviceProfileInfo.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, image, defaultDashboardId, type, transportType, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceProfileInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    defaultDashboardId: ").append(toIndentedString(defaultDashboardId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    transportType: ").append(toIndentedString(transportType)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `image` to the URL query string
    if (getImage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%simage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getImage()))));
    }

    // add `defaultDashboardId` to the URL query string
    if (getDefaultDashboardId() != null) {
      joiner.add(getDefaultDashboardId().toUrlQueryString(prefix + "defaultDashboardId" + suffix));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `transportType` to the URL query string
    if (getTransportType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stransportType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransportType()))));
    }

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    return joiner.toString();
  }
}

