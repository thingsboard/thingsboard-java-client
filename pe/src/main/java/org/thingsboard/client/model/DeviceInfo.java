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
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.DeviceData;
import org.thingsboard.client.model.DeviceId;
import org.thingsboard.client.model.DeviceProfileId;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.EntityInfo;
import org.thingsboard.client.model.OtaPackageId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * DeviceInfo
 */
@JsonPropertyOrder({
  DeviceInfo.JSON_PROPERTY_ID,
  DeviceInfo.JSON_PROPERTY_CREATED_TIME,
  DeviceInfo.JSON_PROPERTY_TENANT_ID,
  DeviceInfo.JSON_PROPERTY_CUSTOMER_ID,
  DeviceInfo.JSON_PROPERTY_NAME,
  DeviceInfo.JSON_PROPERTY_TYPE,
  DeviceInfo.JSON_PROPERTY_LABEL,
  DeviceInfo.JSON_PROPERTY_DEVICE_PROFILE_ID,
  DeviceInfo.JSON_PROPERTY_FIRMWARE_ID,
  DeviceInfo.JSON_PROPERTY_SOFTWARE_ID,
  DeviceInfo.JSON_PROPERTY_VERSION,
  DeviceInfo.JSON_PROPERTY_OWNER_NAME,
  DeviceInfo.JSON_PROPERTY_GROUPS,
  DeviceInfo.JSON_PROPERTY_ACTIVE,
  DeviceInfo.JSON_PROPERTY_OWNER_ID,
  DeviceInfo.JSON_PROPERTY_ADDITIONAL_INFO,
  DeviceInfo.JSON_PROPERTY_DEVICE_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class DeviceInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private DeviceId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private String type;

  public static final String JSON_PROPERTY_LABEL = "label";
  @javax.annotation.Nullable
  private String label;

  public static final String JSON_PROPERTY_DEVICE_PROFILE_ID = "deviceProfileId";
  @javax.annotation.Nonnull
  private DeviceProfileId deviceProfileId;

  public static final String JSON_PROPERTY_FIRMWARE_ID = "firmwareId";
  @javax.annotation.Nullable
  private OtaPackageId firmwareId;

  public static final String JSON_PROPERTY_SOFTWARE_ID = "softwareId";
  @javax.annotation.Nullable
  private OtaPackageId softwareId;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Long version;

  public static final String JSON_PROPERTY_OWNER_NAME = "ownerName";
  @javax.annotation.Nullable
  private String ownerName;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  @javax.annotation.Nullable
  private List<EntityInfo> groups = new ArrayList<>();

  public static final String JSON_PROPERTY_ACTIVE = "active";
  @javax.annotation.Nullable
  private Boolean active;

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  @javax.annotation.Nullable
  private EntityId ownerId;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public static final String JSON_PROPERTY_DEVICE_DATA = "deviceData";
  @javax.annotation.Nullable
  private DeviceData deviceData;

  public DeviceInfo() { 
  }

  @JsonCreator
  public DeviceInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) CustomerId customerId, 
    @JsonProperty(JSON_PROPERTY_OWNER_NAME) String ownerName, 
    @JsonProperty(JSON_PROPERTY_ACTIVE) Boolean active, 
    @JsonProperty(JSON_PROPERTY_OWNER_ID) EntityId ownerId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.customerId = customerId;
    this.ownerName = ownerName;
    this.active = active;
    this.ownerId = ownerId;
  }

  public DeviceInfo id(@javax.annotation.Nullable DeviceId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Device Id. Specify this field to update the Device. Referencing non-existing Device Id will cause error. Omit this field to create new Device.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable DeviceId id) {
    this.id = id;
  }


  /**
   * Timestamp of the device creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  /**
   * JSON object with Tenant Id. Use &#39;assignDeviceToTenant&#39; to change the Tenant Id.
   * @return tenantId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  /**
   * JSON object with Customer Id. Use &#39;assignDeviceToCustomer&#39; to change the Customer Id.
   * @return customerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }




  public DeviceInfo name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique Device Name in scope of Tenant
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


  public DeviceInfo type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Device Profile Name
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public DeviceInfo label(@javax.annotation.Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * Label that may be used in widgets
   * @return label
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLabel() {
    return label;
  }


  @JsonProperty(value = JSON_PROPERTY_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(@javax.annotation.Nullable String label) {
    this.label = label;
  }


  public DeviceInfo deviceProfileId(@javax.annotation.Nonnull DeviceProfileId deviceProfileId) {
    this.deviceProfileId = deviceProfileId;
    return this;
  }

  /**
   * JSON object with Device Profile Id.
   * @return deviceProfileId
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_DEVICE_PROFILE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DeviceProfileId getDeviceProfileId() {
    return deviceProfileId;
  }


  @JsonProperty(value = JSON_PROPERTY_DEVICE_PROFILE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeviceProfileId(@javax.annotation.Nonnull DeviceProfileId deviceProfileId) {
    this.deviceProfileId = deviceProfileId;
  }


  public DeviceInfo firmwareId(@javax.annotation.Nullable OtaPackageId firmwareId) {
    this.firmwareId = firmwareId;
    return this;
  }

  /**
   * JSON object with Ota Package Id.
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


  public DeviceInfo softwareId(@javax.annotation.Nullable OtaPackageId softwareId) {
    this.softwareId = softwareId;
    return this;
  }

  /**
   * JSON object with Ota Package Id.
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


  public DeviceInfo version(@javax.annotation.Nullable Long version) {
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
   * Owner name
   * @return ownerName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OWNER_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOwnerName() {
    return ownerName;
  }




  public DeviceInfo groups(@javax.annotation.Nullable List<EntityInfo> groups) {
    this.groups = groups;
    return this;
  }

  public DeviceInfo addGroupsItem(EntityInfo groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Groups
   * @return groups
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GROUPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EntityInfo> getGroups() {
    return groups;
  }


  @JsonProperty(value = JSON_PROPERTY_GROUPS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroups(@javax.annotation.Nullable List<EntityInfo> groups) {
    this.groups = groups;
  }


  /**
   * Device active flag.
   * @return active
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ACTIVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getActive() {
    return active;
  }




  /**
   * JSON object with Customer or Tenant Id
   * @return ownerId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getOwnerId() {
    return ownerId;
  }




  public DeviceInfo additionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional parameters of the device
   * @return additionalInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getAdditionalInfo() {
    return additionalInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public DeviceInfo deviceData(@javax.annotation.Nullable DeviceData deviceData) {
    this.deviceData = deviceData;
    return this;
  }

  /**
   * JSON object with content specific to type of transport in the device profile.
   * @return deviceData
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEVICE_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceData getDeviceData() {
    return deviceData;
  }


  @JsonProperty(value = JSON_PROPERTY_DEVICE_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceData(@javax.annotation.Nullable DeviceData deviceData) {
    this.deviceData = deviceData;
  }


  /**
   * Return true if this DeviceInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceInfo deviceInfo = (DeviceInfo) o;
    return Objects.equals(this.id, deviceInfo.id) &&
        Objects.equals(this.createdTime, deviceInfo.createdTime) &&
        Objects.equals(this.tenantId, deviceInfo.tenantId) &&
        Objects.equals(this.customerId, deviceInfo.customerId) &&
        Objects.equals(this.name, deviceInfo.name) &&
        Objects.equals(this.type, deviceInfo.type) &&
        Objects.equals(this.label, deviceInfo.label) &&
        Objects.equals(this.deviceProfileId, deviceInfo.deviceProfileId) &&
        Objects.equals(this.firmwareId, deviceInfo.firmwareId) &&
        Objects.equals(this.softwareId, deviceInfo.softwareId) &&
        Objects.equals(this.version, deviceInfo.version) &&
        Objects.equals(this.ownerName, deviceInfo.ownerName) &&
        Objects.equals(this.groups, deviceInfo.groups) &&
        Objects.equals(this.active, deviceInfo.active) &&
        Objects.equals(this.ownerId, deviceInfo.ownerId) &&
        Objects.equals(this.additionalInfo, deviceInfo.additionalInfo) &&
        Objects.equals(this.deviceData, deviceInfo.deviceData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, customerId, name, type, label, deviceProfileId, firmwareId, softwareId, version, ownerName, groups, active, ownerId, additionalInfo, deviceData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    deviceProfileId: ").append(toIndentedString(deviceProfileId)).append("\n");
    sb.append("    firmwareId: ").append(toIndentedString(firmwareId)).append("\n");
    sb.append("    softwareId: ").append(toIndentedString(softwareId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    deviceData: ").append(toIndentedString(deviceData)).append("\n");
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

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      joiner.add(getCustomerId().toUrlQueryString(prefix + "customerId" + suffix));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `label` to the URL query string
    if (getLabel() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slabel%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLabel()))));
    }

    // add `deviceProfileId` to the URL query string
    if (getDeviceProfileId() != null) {
      joiner.add(getDeviceProfileId().toUrlQueryString(prefix + "deviceProfileId" + suffix));
    }

    // add `firmwareId` to the URL query string
    if (getFirmwareId() != null) {
      joiner.add(getFirmwareId().toUrlQueryString(prefix + "firmwareId" + suffix));
    }

    // add `softwareId` to the URL query string
    if (getSoftwareId() != null) {
      joiner.add(getSoftwareId().toUrlQueryString(prefix + "softwareId" + suffix));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `ownerName` to the URL query string
    if (getOwnerName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sownerName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOwnerName()))));
    }

    // add `groups` to the URL query string
    if (getGroups() != null) {
      for (int i = 0; i < getGroups().size(); i++) {
        if (getGroups().get(i) != null) {
          joiner.add(getGroups().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sgroups%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `active` to the URL query string
    if (getActive() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sactive%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getActive()))));
    }

    // add `ownerId` to the URL query string
    if (getOwnerId() != null) {
      joiner.add(getOwnerId().toUrlQueryString(prefix + "ownerId" + suffix));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    // add `deviceData` to the URL query string
    if (getDeviceData() != null) {
      joiner.add(getDeviceData().toUrlQueryString(prefix + "deviceData" + suffix));
    }

    return joiner.toString();
  }
}

