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
import org.thingsboard.client.model.DeviceProfileData;
import org.thingsboard.client.model.DeviceProfileId;
import org.thingsboard.client.model.DeviceProfileProvisionType;
import org.thingsboard.client.model.DeviceProfileType;
import org.thingsboard.client.model.DeviceTransportType;
import org.thingsboard.client.model.OtaPackageId;
import org.thingsboard.client.model.RuleChainId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the device profile.
 */
@JsonPropertyOrder({
  DeviceProfile.JSON_PROPERTY_ID,
  DeviceProfile.JSON_PROPERTY_CREATED_TIME,
  DeviceProfile.JSON_PROPERTY_TENANT_ID,
  DeviceProfile.JSON_PROPERTY_NAME,
  DeviceProfile.JSON_PROPERTY_DESCRIPTION,
  DeviceProfile.JSON_PROPERTY_IMAGE,
  DeviceProfile.JSON_PROPERTY_TYPE,
  DeviceProfile.JSON_PROPERTY_TRANSPORT_TYPE,
  DeviceProfile.JSON_PROPERTY_PROVISION_TYPE,
  DeviceProfile.JSON_PROPERTY_DEFAULT_RULE_CHAIN_ID,
  DeviceProfile.JSON_PROPERTY_DEFAULT_DASHBOARD_ID,
  DeviceProfile.JSON_PROPERTY_DEFAULT_QUEUE_NAME,
  DeviceProfile.JSON_PROPERTY_PROVISION_DEVICE_KEY,
  DeviceProfile.JSON_PROPERTY_FIRMWARE_ID,
  DeviceProfile.JSON_PROPERTY_SOFTWARE_ID,
  DeviceProfile.JSON_PROPERTY_DEFAULT_EDGE_RULE_CHAIN_ID,
  DeviceProfile.JSON_PROPERTY_VERSION,
  DeviceProfile.JSON_PROPERTY_DEFAULT,
  DeviceProfile.JSON_PROPERTY_PROFILE_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class DeviceProfile {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private DeviceProfileId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_IMAGE = "image";
  @javax.annotation.Nullable
  private String image;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private DeviceProfileType type;

  public static final String JSON_PROPERTY_TRANSPORT_TYPE = "transportType";
  @javax.annotation.Nullable
  private DeviceTransportType transportType;

  public static final String JSON_PROPERTY_PROVISION_TYPE = "provisionType";
  @javax.annotation.Nullable
  private DeviceProfileProvisionType provisionType;

  public static final String JSON_PROPERTY_DEFAULT_RULE_CHAIN_ID = "defaultRuleChainId";
  @javax.annotation.Nullable
  private RuleChainId defaultRuleChainId;

  public static final String JSON_PROPERTY_DEFAULT_DASHBOARD_ID = "defaultDashboardId";
  @javax.annotation.Nullable
  private DashboardId defaultDashboardId;

  public static final String JSON_PROPERTY_DEFAULT_QUEUE_NAME = "defaultQueueName";
  @javax.annotation.Nullable
  private String defaultQueueName;

  public static final String JSON_PROPERTY_PROVISION_DEVICE_KEY = "provisionDeviceKey";
  @javax.annotation.Nullable
  private String provisionDeviceKey;

  public static final String JSON_PROPERTY_FIRMWARE_ID = "firmwareId";
  @javax.annotation.Nullable
  private OtaPackageId firmwareId;

  public static final String JSON_PROPERTY_SOFTWARE_ID = "softwareId";
  @javax.annotation.Nullable
  private OtaPackageId softwareId;

  public static final String JSON_PROPERTY_DEFAULT_EDGE_RULE_CHAIN_ID = "defaultEdgeRuleChainId";
  @javax.annotation.Nullable
  private RuleChainId defaultEdgeRuleChainId;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Long version;

  public static final String JSON_PROPERTY_DEFAULT = "default";
  @javax.annotation.Nullable
  private Boolean _default;

  public static final String JSON_PROPERTY_PROFILE_DATA = "profileData";
  @javax.annotation.Nullable
  private DeviceProfileData profileData;

  public DeviceProfile() { 
  }

  @JsonCreator
  public DeviceProfile(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
  }

  public DeviceProfile id(@javax.annotation.Nullable DeviceProfileId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the device profile Id. Specify this field to update the device profile. Referencing non-existing device profile Id will cause error. Omit this field to create new device profile.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceProfileId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable DeviceProfileId id) {
    this.id = id;
  }


  /**
   * Timestamp of the profile creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with Tenant Id that owns the profile.
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  public DeviceProfile name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique Device Profile Name in scope of Tenant.
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


  public DeviceProfile description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Device Profile description. 
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }


  @JsonProperty(value = JSON_PROPERTY_DESCRIPTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public DeviceProfile image(@javax.annotation.Nullable String image) {
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


  public DeviceProfile type(@javax.annotation.Nullable DeviceProfileType type) {
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


  public DeviceProfile transportType(@javax.annotation.Nullable DeviceTransportType transportType) {
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


  public DeviceProfile provisionType(@javax.annotation.Nullable DeviceProfileProvisionType provisionType) {
    this.provisionType = provisionType;
    return this;
  }

  /**
   * Provisioning strategy.
   * @return provisionType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROVISION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceProfileProvisionType getProvisionType() {
    return provisionType;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVISION_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvisionType(@javax.annotation.Nullable DeviceProfileProvisionType provisionType) {
    this.provisionType = provisionType;
  }


  public DeviceProfile defaultRuleChainId(@javax.annotation.Nullable RuleChainId defaultRuleChainId) {
    this.defaultRuleChainId = defaultRuleChainId;
    return this;
  }

  /**
   * Reference to the rule chain. If present, the specified rule chain will be used to process all messages related to device, including telemetry, attribute updates, etc. Otherwise, the root rule chain will be used to process those messages.
   * @return defaultRuleChainId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT_RULE_CHAIN_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RuleChainId getDefaultRuleChainId() {
    return defaultRuleChainId;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_RULE_CHAIN_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultRuleChainId(@javax.annotation.Nullable RuleChainId defaultRuleChainId) {
    this.defaultRuleChainId = defaultRuleChainId;
  }


  public DeviceProfile defaultDashboardId(@javax.annotation.Nullable DashboardId defaultDashboardId) {
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


  public DeviceProfile defaultQueueName(@javax.annotation.Nullable String defaultQueueName) {
    this.defaultQueueName = defaultQueueName;
    return this;
  }

  /**
   * Rule engine queue name. If present, the specified queue will be used to store all unprocessed messages related to device, including telemetry, attribute updates, etc. Otherwise, the &#39;Main&#39; queue will be used to store those messages.
   * @return defaultQueueName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT_QUEUE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDefaultQueueName() {
    return defaultQueueName;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_QUEUE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultQueueName(@javax.annotation.Nullable String defaultQueueName) {
    this.defaultQueueName = defaultQueueName;
  }


  public DeviceProfile provisionDeviceKey(@javax.annotation.Nullable String provisionDeviceKey) {
    this.provisionDeviceKey = provisionDeviceKey;
    return this;
  }

  /**
   * Unique provisioning key used by &#39;Device Provisioning&#39; feature.
   * @return provisionDeviceKey
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROVISION_DEVICE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProvisionDeviceKey() {
    return provisionDeviceKey;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVISION_DEVICE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvisionDeviceKey(@javax.annotation.Nullable String provisionDeviceKey) {
    this.provisionDeviceKey = provisionDeviceKey;
  }


  public DeviceProfile firmwareId(@javax.annotation.Nullable OtaPackageId firmwareId) {
    this.firmwareId = firmwareId;
    return this;
  }

  /**
   * Reference to the firmware OTA package. If present, the specified package will be used as default device firmware. 
   * @return firmwareId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FIRMWARE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OtaPackageId getFirmwareId() {
    return firmwareId;
  }


  @JsonProperty(value = JSON_PROPERTY_FIRMWARE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirmwareId(@javax.annotation.Nullable OtaPackageId firmwareId) {
    this.firmwareId = firmwareId;
  }


  public DeviceProfile softwareId(@javax.annotation.Nullable OtaPackageId softwareId) {
    this.softwareId = softwareId;
    return this;
  }

  /**
   * Reference to the software OTA package. If present, the specified package will be used as default device software. 
   * @return softwareId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SOFTWARE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OtaPackageId getSoftwareId() {
    return softwareId;
  }


  @JsonProperty(value = JSON_PROPERTY_SOFTWARE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoftwareId(@javax.annotation.Nullable OtaPackageId softwareId) {
    this.softwareId = softwareId;
  }


  public DeviceProfile defaultEdgeRuleChainId(@javax.annotation.Nullable RuleChainId defaultEdgeRuleChainId) {
    this.defaultEdgeRuleChainId = defaultEdgeRuleChainId;
    return this;
  }

  /**
   * Reference to the edge rule chain. If present, the specified edge rule chain will be used on the edge to process all messages related to device, including telemetry, attribute updates, etc. Otherwise, the edge root rule chain will be used to process those messages.
   * @return defaultEdgeRuleChainId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT_EDGE_RULE_CHAIN_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RuleChainId getDefaultEdgeRuleChainId() {
    return defaultEdgeRuleChainId;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_EDGE_RULE_CHAIN_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultEdgeRuleChainId(@javax.annotation.Nullable RuleChainId defaultEdgeRuleChainId) {
    this.defaultEdgeRuleChainId = defaultEdgeRuleChainId;
  }


  public DeviceProfile version(@javax.annotation.Nullable Long version) {
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


  public DeviceProfile _default(@javax.annotation.Nullable Boolean _default) {
    this._default = _default;
    return this;
  }

  /**
   * Used to mark the default profile. Default profile is used when the device profile is not specified during device creation.
   * @return _default
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDefault() {
    return _default;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefault(@javax.annotation.Nullable Boolean _default) {
    this._default = _default;
  }


  public DeviceProfile profileData(@javax.annotation.Nullable DeviceProfileData profileData) {
    this.profileData = profileData;
    return this;
  }

  /**
   * Complex JSON object that includes addition device profile configuration (transport, alarm rules, etc).
   * @return profileData
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PROFILE_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceProfileData getProfileData() {
    return profileData;
  }


  @JsonProperty(value = JSON_PROPERTY_PROFILE_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfileData(@javax.annotation.Nullable DeviceProfileData profileData) {
    this.profileData = profileData;
  }


  /**
   * Return true if this DeviceProfile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceProfile deviceProfile = (DeviceProfile) o;
    return Objects.equals(this.id, deviceProfile.id) &&
        Objects.equals(this.createdTime, deviceProfile.createdTime) &&
        Objects.equals(this.tenantId, deviceProfile.tenantId) &&
        Objects.equals(this.name, deviceProfile.name) &&
        Objects.equals(this.description, deviceProfile.description) &&
        Objects.equals(this.image, deviceProfile.image) &&
        Objects.equals(this.type, deviceProfile.type) &&
        Objects.equals(this.transportType, deviceProfile.transportType) &&
        Objects.equals(this.provisionType, deviceProfile.provisionType) &&
        Objects.equals(this.defaultRuleChainId, deviceProfile.defaultRuleChainId) &&
        Objects.equals(this.defaultDashboardId, deviceProfile.defaultDashboardId) &&
        Objects.equals(this.defaultQueueName, deviceProfile.defaultQueueName) &&
        Objects.equals(this.provisionDeviceKey, deviceProfile.provisionDeviceKey) &&
        Objects.equals(this.firmwareId, deviceProfile.firmwareId) &&
        Objects.equals(this.softwareId, deviceProfile.softwareId) &&
        Objects.equals(this.defaultEdgeRuleChainId, deviceProfile.defaultEdgeRuleChainId) &&
        Objects.equals(this.version, deviceProfile.version) &&
        Objects.equals(this._default, deviceProfile._default) &&
        Objects.equals(this.profileData, deviceProfile.profileData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, name, description, image, type, transportType, provisionType, defaultRuleChainId, defaultDashboardId, defaultQueueName, provisionDeviceKey, firmwareId, softwareId, defaultEdgeRuleChainId, version, _default, profileData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceProfile {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    transportType: ").append(toIndentedString(transportType)).append("\n");
    sb.append("    provisionType: ").append(toIndentedString(provisionType)).append("\n");
    sb.append("    defaultRuleChainId: ").append(toIndentedString(defaultRuleChainId)).append("\n");
    sb.append("    defaultDashboardId: ").append(toIndentedString(defaultDashboardId)).append("\n");
    sb.append("    defaultQueueName: ").append(toIndentedString(defaultQueueName)).append("\n");
    sb.append("    provisionDeviceKey: ").append(toIndentedString(provisionDeviceKey)).append("\n");
    sb.append("    firmwareId: ").append(toIndentedString(firmwareId)).append("\n");
    sb.append("    softwareId: ").append(toIndentedString(softwareId)).append("\n");
    sb.append("    defaultEdgeRuleChainId: ").append(toIndentedString(defaultEdgeRuleChainId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    profileData: ").append(toIndentedString(profileData)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdescription%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescription()))));
    }

    // add `image` to the URL query string
    if (getImage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%simage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getImage()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `transportType` to the URL query string
    if (getTransportType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stransportType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransportType()))));
    }

    // add `provisionType` to the URL query string
    if (getProvisionType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprovisionType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProvisionType()))));
    }

    // add `defaultRuleChainId` to the URL query string
    if (getDefaultRuleChainId() != null) {
      joiner.add(getDefaultRuleChainId().toUrlQueryString(prefix + "defaultRuleChainId" + suffix));
    }

    // add `defaultDashboardId` to the URL query string
    if (getDefaultDashboardId() != null) {
      joiner.add(getDefaultDashboardId().toUrlQueryString(prefix + "defaultDashboardId" + suffix));
    }

    // add `defaultQueueName` to the URL query string
    if (getDefaultQueueName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdefaultQueueName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDefaultQueueName()))));
    }

    // add `provisionDeviceKey` to the URL query string
    if (getProvisionDeviceKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprovisionDeviceKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProvisionDeviceKey()))));
    }

    // add `firmwareId` to the URL query string
    if (getFirmwareId() != null) {
      joiner.add(getFirmwareId().toUrlQueryString(prefix + "firmwareId" + suffix));
    }

    // add `softwareId` to the URL query string
    if (getSoftwareId() != null) {
      joiner.add(getSoftwareId().toUrlQueryString(prefix + "softwareId" + suffix));
    }

    // add `defaultEdgeRuleChainId` to the URL query string
    if (getDefaultEdgeRuleChainId() != null) {
      joiner.add(getDefaultEdgeRuleChainId().toUrlQueryString(prefix + "defaultEdgeRuleChainId" + suffix));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `default` to the URL query string
    if (getDefault() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdefault%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDefault()))));
    }

    // add `profileData` to the URL query string
    if (getProfileData() != null) {
      joiner.add(getProfileData().toUrlQueryString(prefix + "profileData" + suffix));
    }

    return joiner.toString();
  }
}

