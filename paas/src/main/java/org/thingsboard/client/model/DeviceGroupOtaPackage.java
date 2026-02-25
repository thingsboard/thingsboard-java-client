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
import java.util.UUID;
import org.thingsboard.client.model.EntityGroupId;
import org.thingsboard.client.model.OtaPackageId;
import org.thingsboard.client.model.OtaPackageType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * DeviceGroupOtaPackage
 */
@JsonPropertyOrder({
  DeviceGroupOtaPackage.JSON_PROPERTY_ID,
  DeviceGroupOtaPackage.JSON_PROPERTY_GROUP_ID,
  DeviceGroupOtaPackage.JSON_PROPERTY_OTA_PACKAGE_TYPE,
  DeviceGroupOtaPackage.JSON_PROPERTY_OTA_PACKAGE_ID,
  DeviceGroupOtaPackage.JSON_PROPERTY_OTA_PACKAGE_UPDATE_TIME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class DeviceGroupOtaPackage {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private UUID id;

  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  @javax.annotation.Nullable
  private EntityGroupId groupId;

  public static final String JSON_PROPERTY_OTA_PACKAGE_TYPE = "otaPackageType";
  @javax.annotation.Nullable
  private OtaPackageType otaPackageType;

  public static final String JSON_PROPERTY_OTA_PACKAGE_ID = "otaPackageId";
  @javax.annotation.Nullable
  private OtaPackageId otaPackageId;

  public static final String JSON_PROPERTY_OTA_PACKAGE_UPDATE_TIME = "otaPackageUpdateTime";
  @javax.annotation.Nullable
  private Long otaPackageUpdateTime;

  public DeviceGroupOtaPackage() { 
  }

  public DeviceGroupOtaPackage id(@javax.annotation.Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }


  public DeviceGroupOtaPackage groupId(@javax.annotation.Nullable EntityGroupId groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_GROUP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityGroupId getGroupId() {
    return groupId;
  }


  @JsonProperty(value = JSON_PROPERTY_GROUP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupId(@javax.annotation.Nullable EntityGroupId groupId) {
    this.groupId = groupId;
  }


  public DeviceGroupOtaPackage otaPackageType(@javax.annotation.Nullable OtaPackageType otaPackageType) {
    this.otaPackageType = otaPackageType;
    return this;
  }

  /**
   * Get otaPackageType
   * @return otaPackageType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTA_PACKAGE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OtaPackageType getOtaPackageType() {
    return otaPackageType;
  }


  @JsonProperty(value = JSON_PROPERTY_OTA_PACKAGE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtaPackageType(@javax.annotation.Nullable OtaPackageType otaPackageType) {
    this.otaPackageType = otaPackageType;
  }


  public DeviceGroupOtaPackage otaPackageId(@javax.annotation.Nullable OtaPackageId otaPackageId) {
    this.otaPackageId = otaPackageId;
    return this;
  }

  /**
   * Get otaPackageId
   * @return otaPackageId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTA_PACKAGE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OtaPackageId getOtaPackageId() {
    return otaPackageId;
  }


  @JsonProperty(value = JSON_PROPERTY_OTA_PACKAGE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtaPackageId(@javax.annotation.Nullable OtaPackageId otaPackageId) {
    this.otaPackageId = otaPackageId;
  }


  public DeviceGroupOtaPackage otaPackageUpdateTime(@javax.annotation.Nullable Long otaPackageUpdateTime) {
    this.otaPackageUpdateTime = otaPackageUpdateTime;
    return this;
  }

  /**
   * Get otaPackageUpdateTime
   * @return otaPackageUpdateTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_OTA_PACKAGE_UPDATE_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOtaPackageUpdateTime() {
    return otaPackageUpdateTime;
  }


  @JsonProperty(value = JSON_PROPERTY_OTA_PACKAGE_UPDATE_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtaPackageUpdateTime(@javax.annotation.Nullable Long otaPackageUpdateTime) {
    this.otaPackageUpdateTime = otaPackageUpdateTime;
  }


  /**
   * Return true if this DeviceGroupOtaPackage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceGroupOtaPackage deviceGroupOtaPackage = (DeviceGroupOtaPackage) o;
    return Objects.equals(this.id, deviceGroupOtaPackage.id) &&
        Objects.equals(this.groupId, deviceGroupOtaPackage.groupId) &&
        Objects.equals(this.otaPackageType, deviceGroupOtaPackage.otaPackageType) &&
        Objects.equals(this.otaPackageId, deviceGroupOtaPackage.otaPackageId) &&
        Objects.equals(this.otaPackageUpdateTime, deviceGroupOtaPackage.otaPackageUpdateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, otaPackageType, otaPackageId, otaPackageUpdateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceGroupOtaPackage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    otaPackageType: ").append(toIndentedString(otaPackageType)).append("\n");
    sb.append("    otaPackageId: ").append(toIndentedString(otaPackageId)).append("\n");
    sb.append("    otaPackageUpdateTime: ").append(toIndentedString(otaPackageUpdateTime)).append("\n");
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
      joiner.add(String.format(java.util.Locale.ROOT, "%sid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getId()))));
    }

    // add `groupId` to the URL query string
    if (getGroupId() != null) {
      joiner.add(getGroupId().toUrlQueryString(prefix + "groupId" + suffix));
    }

    // add `otaPackageType` to the URL query string
    if (getOtaPackageType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sotaPackageType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtaPackageType()))));
    }

    // add `otaPackageId` to the URL query string
    if (getOtaPackageId() != null) {
      joiner.add(getOtaPackageId().toUrlQueryString(prefix + "otaPackageId" + suffix));
    }

    // add `otaPackageUpdateTime` to the URL query string
    if (getOtaPackageUpdateTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sotaPackageUpdateTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOtaPackageUpdateTime()))));
    }

    return joiner.toString();
  }
}

