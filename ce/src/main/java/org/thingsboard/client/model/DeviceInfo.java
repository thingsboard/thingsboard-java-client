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
  DeviceInfo.JSON_PROPERTY_CUSTOMER_TITLE,
  DeviceInfo.JSON_PROPERTY_CUSTOMER_IS_PUBLIC,
  DeviceInfo.JSON_PROPERTY_DEVICE_PROFILE_NAME,
  DeviceInfo.JSON_PROPERTY_ACTIVE,
  DeviceInfo.JSON_PROPERTY_ADDITIONAL_INFO,
  DeviceInfo.JSON_PROPERTY_DEVICE_DATA
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class DeviceInfo {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private DeviceId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @Nullable
  private CustomerId customerId;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nonnull
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  @Nullable
  private String type;

  public static final String JSON_PROPERTY_LABEL = "label";
  @Nullable
  private String label;

  public static final String JSON_PROPERTY_DEVICE_PROFILE_ID = "deviceProfileId";
  @Nullable
  private DeviceProfileId deviceProfileId;

  public static final String JSON_PROPERTY_FIRMWARE_ID = "firmwareId";
  @Nullable
  private OtaPackageId firmwareId;

  public static final String JSON_PROPERTY_SOFTWARE_ID = "softwareId";
  @Nullable
  private OtaPackageId softwareId;

  public static final String JSON_PROPERTY_VERSION = "version";
  @Nullable
  private Long version;

  public static final String JSON_PROPERTY_CUSTOMER_TITLE = "customerTitle";
  @Nullable
  private String customerTitle;

  public static final String JSON_PROPERTY_CUSTOMER_IS_PUBLIC = "customerIsPublic";
  @Nullable
  private Boolean customerIsPublic;

  public static final String JSON_PROPERTY_DEVICE_PROFILE_NAME = "deviceProfileName";
  @Nullable
  private String deviceProfileName;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  @Nullable
  private Boolean active;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public static final String JSON_PROPERTY_DEVICE_DATA = "deviceData";
  @Nullable
  private DeviceData deviceData;

  public DeviceInfo() { 
  }

  @JsonCreator
  public DeviceInfo(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TENANT_ID) TenantId tenantId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) CustomerId customerId, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_TITLE) String customerTitle, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_IS_PUBLIC) Boolean customerIsPublic, 
    @JsonProperty(JSON_PROPERTY_DEVICE_PROFILE_NAME) String deviceProfileName, 
    @JsonProperty(JSON_PROPERTY_ACTIVE) Boolean active
  ) {
  this();
    this.createdTime = createdTime;
    this.tenantId = tenantId;
    this.customerId = customerId;
    this.customerTitle = customerTitle;
    this.customerIsPublic = customerIsPublic;
    this.deviceProfileName = deviceProfileName;
    this.active = active;
  }

  public DeviceInfo id(@Nullable DeviceId id) {
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




  public DeviceInfo name(@Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique Device Name in scope of Tenant
   * @return name
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }


  @JsonProperty(value = JSON_PROPERTY_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@Nonnull String name) {
    this.name = name;
  }


  public DeviceInfo type(@Nullable String type) {
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


  public DeviceInfo label(@Nullable String label) {
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


  public DeviceInfo deviceProfileId(@Nullable DeviceProfileId deviceProfileId) {
    this.deviceProfileId = deviceProfileId;
    return this;
  }

  /**
   * JSON object with Device Profile Id. If not provided, the type will be used to determine the profile. If neither deviceProfileId nor type is specified, the default device profile will be used.
   * @return deviceProfileId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DEVICE_PROFILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceProfileId getDeviceProfileId() {
    return deviceProfileId;
  }


  @JsonProperty(value = JSON_PROPERTY_DEVICE_PROFILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceProfileId(@Nullable DeviceProfileId deviceProfileId) {
    this.deviceProfileId = deviceProfileId;
  }


  public DeviceInfo firmwareId(@Nullable OtaPackageId firmwareId) {
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


  public DeviceInfo softwareId(@Nullable OtaPackageId softwareId) {
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


  public DeviceInfo version(@Nullable Long version) {
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
   * Title of the Customer that owns the device.
   * @return customerTitle
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomerTitle() {
    return customerTitle;
  }




  /**
   * Indicates special &#39;Public&#39; Customer that is auto-generated to use the devices on public dashboards.
   * @return customerIsPublic
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_IS_PUBLIC, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCustomerIsPublic() {
    return customerIsPublic;
  }




  /**
   * Name of the corresponding Device Profile.
   * @return deviceProfileName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DEVICE_PROFILE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDeviceProfileName() {
    return deviceProfileName;
  }




  /**
   * Device active flag.
   * @return active
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ACTIVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getActive() {
    return active;
  }




  public DeviceInfo additionalInfo(@Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
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


  public DeviceInfo deviceData(@Nullable DeviceData deviceData) {
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
        Objects.equals(this.customerTitle, deviceInfo.customerTitle) &&
        Objects.equals(this.customerIsPublic, deviceInfo.customerIsPublic) &&
        Objects.equals(this.deviceProfileName, deviceInfo.deviceProfileName) &&
        Objects.equals(this.active, deviceInfo.active) &&
        Objects.equals(this.additionalInfo, deviceInfo.additionalInfo) &&
        Objects.equals(this.deviceData, deviceInfo.deviceData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, customerId, name, type, label, deviceProfileId, firmwareId, softwareId, version, customerTitle, customerIsPublic, deviceProfileName, active, additionalInfo, deviceData);
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
    sb.append("    customerTitle: ").append(toIndentedString(customerTitle)).append("\n");
    sb.append("    customerIsPublic: ").append(toIndentedString(customerIsPublic)).append("\n");
    sb.append("    deviceProfileName: ").append(toIndentedString(deviceProfileName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

    // add `customerTitle` to the URL query string
    if (getCustomerTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomerTitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerTitle()))));
    }

    // add `customerIsPublic` to the URL query string
    if (getCustomerIsPublic() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomerIsPublic%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerIsPublic()))));
    }

    // add `deviceProfileName` to the URL query string
    if (getDeviceProfileName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdeviceProfileName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDeviceProfileName()))));
    }

    // add `active` to the URL query string
    if (getActive() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sactive%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getActive()))));
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

