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
import javax.annotation.Nonnull;
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
import org.thingsboard.client.model.CustomerId;
import org.thingsboard.client.model.DeviceData;
import org.thingsboard.client.model.DeviceId;
import org.thingsboard.client.model.DeviceProfileId;
import org.thingsboard.client.model.EntityId;
import org.thingsboard.client.model.OtaPackageId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Device
 */
@JsonPropertyOrder({
  Device.JSON_PROPERTY_ID,
  Device.JSON_PROPERTY_CREATED_TIME,
  Device.JSON_PROPERTY_ADDITIONAL_INFO,
  Device.JSON_PROPERTY_TENANT_ID,
  Device.JSON_PROPERTY_CUSTOMER_ID,
  Device.JSON_PROPERTY_NAME,
  Device.JSON_PROPERTY_TYPE,
  Device.JSON_PROPERTY_LABEL,
  Device.JSON_PROPERTY_DEVICE_PROFILE_ID,
  Device.JSON_PROPERTY_DEVICE_DATA,
  Device.JSON_PROPERTY_FIRMWARE_ID,
  Device.JSON_PROPERTY_SOFTWARE_ID,
  Device.JSON_PROPERTY_VERSION,
  Device.JSON_PROPERTY_OWNER_ID
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class Device {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private DeviceId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  @Nullable
  private String type;

  public static final String JSON_PROPERTY_LABEL = "label";
  @Nullable
  private String label;

  public static final String JSON_PROPERTY_DEVICE_PROFILE_ID = "deviceProfileId";
  @Nonnull
  private DeviceProfileId deviceProfileId;

  public static final String JSON_PROPERTY_DEVICE_DATA = "deviceData";
  @Nullable
  private DeviceData deviceData;

  public static final String JSON_PROPERTY_FIRMWARE_ID = "firmwareId";
  @Nullable
  private OtaPackageId firmwareId;

  public static final String JSON_PROPERTY_SOFTWARE_ID = "softwareId";
  @Nullable
  private OtaPackageId softwareId;

  public static final String JSON_PROPERTY_VERSION = "version";
  @Nullable
  private Long version;

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  @Nullable
  private EntityId ownerId;

  public Device() { 
  }

  @JsonCreator
  public Device(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) CustomerId customerId, 
    @JsonProperty(JSON_PROPERTY_OWNER_ID) EntityId ownerId
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.customerId = customerId;
    this.ownerId = ownerId;
  }

  public Device id(@Nullable DeviceId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the Device Id. Specify this field to update the Device. Referencing non-existing Device Id will cause error. Omit this field to create new Device.
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable DeviceId id) {
    this.id = id;
  }


  /**
   * Timestamp of the device creation, in milliseconds
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public Device additionalInfo(@Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Additional parameters of the device. May include: &#39;gateway&#39; (boolean, whether the device is a gateway), &#39;description&#39; (string), &#39;lastConnectedGateway&#39; (string, UUID of the last gateway that connected this device).
   * @return additionalInfo
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getAdditionalInfo() {
    return additionalInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalInfo(@Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  /**
   * JSON object with Tenant Id. Use &#39;assignDeviceToTenant&#39; to change the Tenant Id.
   * @return tenantId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }




  /**
   * JSON object with Customer Id. Use &#39;assignDeviceToCustomer&#39; to change the Customer Id.
   * @return customerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomerId getCustomerId() {
    return customerId;
  }




  public Device name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique Device Name in scope of Tenant
   * @return name
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@Nullable String name) {
    this.name = name;
  }


  public Device type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Device Profile Name
   * @return type
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@Nullable String type) {
    this.type = type;
  }


  public Device label(@Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * Label that may be used in widgets
   * @return label
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLabel() {
    return label;
  }


  @JsonProperty(value = JSON_PROPERTY_LABEL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(@Nullable String label) {
    this.label = label;
  }


  public Device deviceProfileId(@Nonnull DeviceProfileId deviceProfileId) {
    this.deviceProfileId = deviceProfileId;
    return this;
  }

  /**
   * JSON object with Device Profile Id.
   * @return deviceProfileId
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_DEVICE_PROFILE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DeviceProfileId getDeviceProfileId() {
    return deviceProfileId;
  }


  @JsonProperty(value = JSON_PROPERTY_DEVICE_PROFILE_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeviceProfileId(@Nonnull DeviceProfileId deviceProfileId) {
    this.deviceProfileId = deviceProfileId;
  }


  public Device deviceData(@Nullable DeviceData deviceData) {
    this.deviceData = deviceData;
    return this;
  }

  /**
   * JSON object with content specific to type of transport in the device profile.
   * @return deviceData
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DEVICE_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceData getDeviceData() {
    return deviceData;
  }


  @JsonProperty(value = JSON_PROPERTY_DEVICE_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceData(@Nullable DeviceData deviceData) {
    this.deviceData = deviceData;
  }


  public Device firmwareId(@Nullable OtaPackageId firmwareId) {
    this.firmwareId = firmwareId;
    return this;
  }

  /**
   * JSON object with Ota Package Id.
   * @return firmwareId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_FIRMWARE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OtaPackageId getFirmwareId() {
    return firmwareId;
  }


  @JsonProperty(value = JSON_PROPERTY_FIRMWARE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirmwareId(@Nullable OtaPackageId firmwareId) {
    this.firmwareId = firmwareId;
  }


  public Device softwareId(@Nullable OtaPackageId softwareId) {
    this.softwareId = softwareId;
    return this;
  }

  /**
   * JSON object with Ota Package Id.
   * @return softwareId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SOFTWARE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OtaPackageId getSoftwareId() {
    return softwareId;
  }


  @JsonProperty(value = JSON_PROPERTY_SOFTWARE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoftwareId(@Nullable OtaPackageId softwareId) {
    this.softwareId = softwareId;
  }


  public Device version(@Nullable Long version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@Nullable Long version) {
    this.version = version;
  }


  /**
   * JSON object with Customer or Tenant Id
   * @return ownerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_OWNER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityId getOwnerId() {
    return ownerId;
  }




  /**
   * Return true if this Device object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Device device = (Device) o;
    return Objects.equals(this.id, device.id) &&
        Objects.equals(this.createdTime, device.createdTime) &&
        Objects.equals(this.additionalInfo, device.additionalInfo) &&
        Objects.equals(this.tenantId, device.tenantId) &&
        Objects.equals(this.customerId, device.customerId) &&
        Objects.equals(this.name, device.name) &&
        Objects.equals(this.type, device.type) &&
        Objects.equals(this.label, device.label) &&
        Objects.equals(this.deviceProfileId, device.deviceProfileId) &&
        Objects.equals(this.deviceData, device.deviceData) &&
        Objects.equals(this.firmwareId, device.firmwareId) &&
        Objects.equals(this.softwareId, device.softwareId) &&
        Objects.equals(this.version, device.version) &&
        Objects.equals(this.ownerId, device.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, additionalInfo, tenantId, customerId, name, type, label, deviceProfileId, deviceData, firmwareId, softwareId, version, ownerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    deviceProfileId: ").append(toIndentedString(deviceProfileId)).append("\n");
    sb.append("    deviceData: ").append(toIndentedString(deviceData)).append("\n");
    sb.append("    firmwareId: ").append(toIndentedString(firmwareId)).append("\n");
    sb.append("    softwareId: ").append(toIndentedString(softwareId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
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

    // add `deviceData` to the URL query string
    if (getDeviceData() != null) {
      joiner.add(getDeviceData().toUrlQueryString(prefix + "deviceData" + suffix));
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

    // add `ownerId` to the URL query string
    if (getOwnerId() != null) {
      joiner.add(getOwnerId().toUrlQueryString(prefix + "ownerId" + suffix));
    }

    return joiner.toString();
  }
}

