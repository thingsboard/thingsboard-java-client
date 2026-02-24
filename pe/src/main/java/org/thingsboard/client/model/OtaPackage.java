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
import org.thingsboard.client.model.ChecksumAlgorithm;
import org.thingsboard.client.model.DeviceProfileId;
import org.thingsboard.client.model.OtaPackageData;
import org.thingsboard.client.model.OtaPackageId;
import org.thingsboard.client.model.OtaPackageType;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * OtaPackage
 */
@JsonPropertyOrder({
  OtaPackage.JSON_PROPERTY_ID,
  OtaPackage.JSON_PROPERTY_CREATED_TIME,
  OtaPackage.JSON_PROPERTY_TENANT_ID,
  OtaPackage.JSON_PROPERTY_DEVICE_PROFILE_ID,
  OtaPackage.JSON_PROPERTY_TYPE,
  OtaPackage.JSON_PROPERTY_TITLE,
  OtaPackage.JSON_PROPERTY_VERSION,
  OtaPackage.JSON_PROPERTY_TAG,
  OtaPackage.JSON_PROPERTY_URL,
  OtaPackage.JSON_PROPERTY_HAS_DATA,
  OtaPackage.JSON_PROPERTY_FILE_NAME,
  OtaPackage.JSON_PROPERTY_CONTENT_TYPE,
  OtaPackage.JSON_PROPERTY_CHECKSUM_ALGORITHM,
  OtaPackage.JSON_PROPERTY_CHECKSUM,
  OtaPackage.JSON_PROPERTY_DATA_SIZE,
  OtaPackage.JSON_PROPERTY_DATA,
  OtaPackage.JSON_PROPERTY_NAME,
  OtaPackage.JSON_PROPERTY_ADDITIONAL_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class OtaPackage {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private OtaPackageId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @javax.annotation.Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @javax.annotation.Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_DEVICE_PROFILE_ID = "deviceProfileId";
  @javax.annotation.Nullable
  private DeviceProfileId deviceProfileId;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private OtaPackageType type;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private String version;

  public static final String JSON_PROPERTY_TAG = "tag";
  @javax.annotation.Nullable
  private String tag;

  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable
  private String url;

  public static final String JSON_PROPERTY_HAS_DATA = "hasData";
  @javax.annotation.Nullable
  private Boolean hasData;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  @javax.annotation.Nullable
  private String fileName;

  public static final String JSON_PROPERTY_CONTENT_TYPE = "contentType";
  @javax.annotation.Nullable
  private String contentType;

  public static final String JSON_PROPERTY_CHECKSUM_ALGORITHM = "checksumAlgorithm";
  @javax.annotation.Nullable
  private ChecksumAlgorithm checksumAlgorithm;

  public static final String JSON_PROPERTY_CHECKSUM = "checksum";
  @javax.annotation.Nullable
  private String checksum;

  public static final String JSON_PROPERTY_DATA_SIZE = "dataSize";
  @javax.annotation.Nullable
  private Long dataSize;

  public static final String JSON_PROPERTY_DATA = "data";
  @javax.annotation.Nullable
  private OtaPackageData data;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @javax.annotation.Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo;

  public OtaPackage() { 
  }

  @JsonCreator
  public OtaPackage(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_TAG) String tag, 
    @JsonProperty(JSON_PROPERTY_HAS_DATA) Boolean hasData, 
    @JsonProperty(JSON_PROPERTY_DATA_SIZE) Long dataSize, 
    @JsonProperty(JSON_PROPERTY_NAME) String name
  ) {
  this();
    this.createdTime = createdTime;
    this.tag = tag;
    this.hasData = hasData;
    this.dataSize = dataSize;
    this.name = name;
  }

  public OtaPackage id(@javax.annotation.Nullable OtaPackageId id) {
    this.id = id;
    return this;
  }

  /**
   * JSON object with the ota package Id. Specify existing ota package Id to update the ota package. Referencing non-existing ota package id will cause error. Omit this field to create new ota package.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OtaPackageId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable OtaPackageId id) {
    this.id = id;
  }


  /**
   * Timestamp of the ota package creation, in milliseconds
   * @return createdTime
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public OtaPackage tenantId(@javax.annotation.Nullable TenantId tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * JSON object with Tenant Id. Tenant Id of the ota package can&#39;t be changed.
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


  public OtaPackage deviceProfileId(@javax.annotation.Nullable DeviceProfileId deviceProfileId) {
    this.deviceProfileId = deviceProfileId;
    return this;
  }

  /**
   * JSON object with Device Profile Id. Device Profile Id of the ota package can&#39;t be changed.
   * @return deviceProfileId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEVICE_PROFILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceProfileId getDeviceProfileId() {
    return deviceProfileId;
  }


  @JsonProperty(value = JSON_PROPERTY_DEVICE_PROFILE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceProfileId(@javax.annotation.Nullable DeviceProfileId deviceProfileId) {
    this.deviceProfileId = deviceProfileId;
  }


  public OtaPackage type(@javax.annotation.Nullable OtaPackageType type) {
    this.type = type;
    return this;
  }

  /**
   * OTA Package type.
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OtaPackageType getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable OtaPackageType type) {
    this.type = type;
  }


  public OtaPackage title(@javax.annotation.Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * OTA Package title.
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }


  @JsonProperty(value = JSON_PROPERTY_TITLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(@javax.annotation.Nullable String title) {
    this.title = title;
  }


  public OtaPackage version(@javax.annotation.Nullable String version) {
    this.version = version;
    return this;
  }

  /**
   * OTA Package version.
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVersion() {
    return version;
  }


  @JsonProperty(value = JSON_PROPERTY_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@javax.annotation.Nullable String version) {
    this.version = version;
  }


  /**
   * OTA Package tag.
   * @return tag
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TAG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTag() {
    return tag;
  }




  public OtaPackage url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * OTA Package url.
   * @return url
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }


  @JsonProperty(value = JSON_PROPERTY_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
  }


  /**
   * Indicates OTA Package &#39;has data&#39;. Field is returned from DB (&#39;true&#39; if data exists or url is set).  If OTA Package &#39;has data&#39; is &#39;false&#39; we can not assign the OTA Package to the Device or Device Profile.
   * @return hasData
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_HAS_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasData() {
    return hasData;
  }




  public OtaPackage fileName(@javax.annotation.Nullable String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * OTA Package file name.
   * @return fileName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FILE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFileName() {
    return fileName;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(@javax.annotation.Nullable String fileName) {
    this.fileName = fileName;
  }


  public OtaPackage contentType(@javax.annotation.Nullable String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * OTA Package content type.
   * @return contentType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONTENT_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getContentType() {
    return contentType;
  }


  @JsonProperty(value = JSON_PROPERTY_CONTENT_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentType(@javax.annotation.Nullable String contentType) {
    this.contentType = contentType;
  }


  public OtaPackage checksumAlgorithm(@javax.annotation.Nullable ChecksumAlgorithm checksumAlgorithm) {
    this.checksumAlgorithm = checksumAlgorithm;
    return this;
  }

  /**
   * OTA Package checksum algorithm.
   * @return checksumAlgorithm
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHECKSUM_ALGORITHM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChecksumAlgorithm getChecksumAlgorithm() {
    return checksumAlgorithm;
  }


  @JsonProperty(value = JSON_PROPERTY_CHECKSUM_ALGORITHM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChecksumAlgorithm(@javax.annotation.Nullable ChecksumAlgorithm checksumAlgorithm) {
    this.checksumAlgorithm = checksumAlgorithm;
  }


  public OtaPackage checksum(@javax.annotation.Nullable String checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * OTA Package checksum.
   * @return checksum
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CHECKSUM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChecksum() {
    return checksum;
  }


  @JsonProperty(value = JSON_PROPERTY_CHECKSUM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChecksum(@javax.annotation.Nullable String checksum) {
    this.checksum = checksum;
  }


  /**
   * OTA Package data size.
   * @return dataSize
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DATA_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDataSize() {
    return dataSize;
  }




  public OtaPackage data(@javax.annotation.Nullable OtaPackageData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OtaPackageData getData() {
    return data;
  }


  @JsonProperty(value = JSON_PROPERTY_DATA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(@javax.annotation.Nullable OtaPackageData data) {
    this.data = data;
  }


  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  public OtaPackage additionalInfo(@javax.annotation.Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * OTA Package description.
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


  /**
   * Return true if this OtaPackage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtaPackage otaPackage = (OtaPackage) o;
    return Objects.equals(this.id, otaPackage.id) &&
        Objects.equals(this.createdTime, otaPackage.createdTime) &&
        Objects.equals(this.tenantId, otaPackage.tenantId) &&
        Objects.equals(this.deviceProfileId, otaPackage.deviceProfileId) &&
        Objects.equals(this.type, otaPackage.type) &&
        Objects.equals(this.title, otaPackage.title) &&
        Objects.equals(this.version, otaPackage.version) &&
        Objects.equals(this.tag, otaPackage.tag) &&
        Objects.equals(this.url, otaPackage.url) &&
        Objects.equals(this.hasData, otaPackage.hasData) &&
        Objects.equals(this.fileName, otaPackage.fileName) &&
        Objects.equals(this.contentType, otaPackage.contentType) &&
        Objects.equals(this.checksumAlgorithm, otaPackage.checksumAlgorithm) &&
        Objects.equals(this.checksum, otaPackage.checksum) &&
        Objects.equals(this.dataSize, otaPackage.dataSize) &&
        Objects.equals(this.data, otaPackage.data) &&
        Objects.equals(this.name, otaPackage.name) &&
        Objects.equals(this.additionalInfo, otaPackage.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, tenantId, deviceProfileId, type, title, version, tag, url, hasData, fileName, contentType, checksumAlgorithm, checksum, dataSize, data, name, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtaPackage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    deviceProfileId: ").append(toIndentedString(deviceProfileId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    hasData: ").append(toIndentedString(hasData)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    checksumAlgorithm: ").append(toIndentedString(checksumAlgorithm)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    dataSize: ").append(toIndentedString(dataSize)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

    // add `deviceProfileId` to the URL query string
    if (getDeviceProfileId() != null) {
      joiner.add(getDeviceProfileId().toUrlQueryString(prefix + "deviceProfileId" + suffix));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sversion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVersion()))));
    }

    // add `tag` to the URL query string
    if (getTag() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stag%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTag()))));
    }

    // add `url` to the URL query string
    if (getUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%surl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUrl()))));
    }

    // add `hasData` to the URL query string
    if (getHasData() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%shasData%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getHasData()))));
    }

    // add `fileName` to the URL query string
    if (getFileName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfileName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFileName()))));
    }

    // add `contentType` to the URL query string
    if (getContentType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scontentType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getContentType()))));
    }

    // add `checksumAlgorithm` to the URL query string
    if (getChecksumAlgorithm() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schecksumAlgorithm%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChecksumAlgorithm()))));
    }

    // add `checksum` to the URL query string
    if (getChecksum() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%schecksum%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getChecksum()))));
    }

    // add `dataSize` to the URL query string
    if (getDataSize() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdataSize%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDataSize()))));
    }

    // add `data` to the URL query string
    if (getData() != null) {
      joiner.add(getData().toUrlQueryString(prefix + "data" + suffix));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    return joiner.toString();
  }
}

