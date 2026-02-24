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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * SystemInfoData
 */
@JsonPropertyOrder({
  SystemInfoData.JSON_PROPERTY_SERVICE_ID,
  SystemInfoData.JSON_PROPERTY_SERVICE_TYPE,
  SystemInfoData.JSON_PROPERTY_CPU_USAGE,
  SystemInfoData.JSON_PROPERTY_CPU_COUNT,
  SystemInfoData.JSON_PROPERTY_MEMORY_USAGE,
  SystemInfoData.JSON_PROPERTY_TOTAL_MEMORY,
  SystemInfoData.JSON_PROPERTY_DISC_USAGE,
  SystemInfoData.JSON_PROPERTY_TOTAL_DISC_SPACE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:55.932789+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class SystemInfoData {
  public static final String JSON_PROPERTY_SERVICE_ID = "serviceId";
  @javax.annotation.Nullable
  private String serviceId;

  public static final String JSON_PROPERTY_SERVICE_TYPE = "serviceType";
  @javax.annotation.Nullable
  private String serviceType;

  public static final String JSON_PROPERTY_CPU_USAGE = "cpuUsage";
  @javax.annotation.Nullable
  private Long cpuUsage;

  public static final String JSON_PROPERTY_CPU_COUNT = "cpuCount";
  @javax.annotation.Nullable
  private Long cpuCount;

  public static final String JSON_PROPERTY_MEMORY_USAGE = "memoryUsage";
  @javax.annotation.Nullable
  private Long memoryUsage;

  public static final String JSON_PROPERTY_TOTAL_MEMORY = "totalMemory";
  @javax.annotation.Nullable
  private Long totalMemory;

  public static final String JSON_PROPERTY_DISC_USAGE = "discUsage";
  @javax.annotation.Nullable
  private Long discUsage;

  public static final String JSON_PROPERTY_TOTAL_DISC_SPACE = "totalDiscSpace";
  @javax.annotation.Nullable
  private Long totalDiscSpace;

  public SystemInfoData() { 
  }

  public SystemInfoData serviceId(@javax.annotation.Nullable String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Service Id.
   * @return serviceId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SERVICE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getServiceId() {
    return serviceId;
  }


  @JsonProperty(value = JSON_PROPERTY_SERVICE_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceId(@javax.annotation.Nullable String serviceId) {
    this.serviceId = serviceId;
  }


  public SystemInfoData serviceType(@javax.annotation.Nullable String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Service type.
   * @return serviceType
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SERVICE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getServiceType() {
    return serviceType;
  }


  @JsonProperty(value = JSON_PROPERTY_SERVICE_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceType(@javax.annotation.Nullable String serviceType) {
    this.serviceType = serviceType;
  }


  public SystemInfoData cpuUsage(@javax.annotation.Nullable Long cpuUsage) {
    this.cpuUsage = cpuUsage;
    return this;
  }

  /**
   * CPU usage, in percent.
   * @return cpuUsage
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CPU_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCpuUsage() {
    return cpuUsage;
  }


  @JsonProperty(value = JSON_PROPERTY_CPU_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpuUsage(@javax.annotation.Nullable Long cpuUsage) {
    this.cpuUsage = cpuUsage;
  }


  public SystemInfoData cpuCount(@javax.annotation.Nullable Long cpuCount) {
    this.cpuCount = cpuCount;
    return this;
  }

  /**
   * Total CPU usage.
   * @return cpuCount
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CPU_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCpuCount() {
    return cpuCount;
  }


  @JsonProperty(value = JSON_PROPERTY_CPU_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpuCount(@javax.annotation.Nullable Long cpuCount) {
    this.cpuCount = cpuCount;
  }


  public SystemInfoData memoryUsage(@javax.annotation.Nullable Long memoryUsage) {
    this.memoryUsage = memoryUsage;
    return this;
  }

  /**
   * Memory usage, in percent.
   * @return memoryUsage
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MEMORY_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMemoryUsage() {
    return memoryUsage;
  }


  @JsonProperty(value = JSON_PROPERTY_MEMORY_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemoryUsage(@javax.annotation.Nullable Long memoryUsage) {
    this.memoryUsage = memoryUsage;
  }


  public SystemInfoData totalMemory(@javax.annotation.Nullable Long totalMemory) {
    this.totalMemory = totalMemory;
    return this;
  }

  /**
   * Total memory in bytes.
   * @return totalMemory
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_MEMORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalMemory() {
    return totalMemory;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_MEMORY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalMemory(@javax.annotation.Nullable Long totalMemory) {
    this.totalMemory = totalMemory;
  }


  public SystemInfoData discUsage(@javax.annotation.Nullable Long discUsage) {
    this.discUsage = discUsage;
    return this;
  }

  /**
   * Disk usage, in percent.
   * @return discUsage
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DISC_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDiscUsage() {
    return discUsage;
  }


  @JsonProperty(value = JSON_PROPERTY_DISC_USAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscUsage(@javax.annotation.Nullable Long discUsage) {
    this.discUsage = discUsage;
  }


  public SystemInfoData totalDiscSpace(@javax.annotation.Nullable Long totalDiscSpace) {
    this.totalDiscSpace = totalDiscSpace;
    return this;
  }

  /**
   * Total disc space in bytes.
   * @return totalDiscSpace
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TOTAL_DISC_SPACE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalDiscSpace() {
    return totalDiscSpace;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_DISC_SPACE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalDiscSpace(@javax.annotation.Nullable Long totalDiscSpace) {
    this.totalDiscSpace = totalDiscSpace;
  }


  /**
   * Return true if this SystemInfoData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemInfoData systemInfoData = (SystemInfoData) o;
    return Objects.equals(this.serviceId, systemInfoData.serviceId) &&
        Objects.equals(this.serviceType, systemInfoData.serviceType) &&
        Objects.equals(this.cpuUsage, systemInfoData.cpuUsage) &&
        Objects.equals(this.cpuCount, systemInfoData.cpuCount) &&
        Objects.equals(this.memoryUsage, systemInfoData.memoryUsage) &&
        Objects.equals(this.totalMemory, systemInfoData.totalMemory) &&
        Objects.equals(this.discUsage, systemInfoData.discUsage) &&
        Objects.equals(this.totalDiscSpace, systemInfoData.totalDiscSpace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, serviceType, cpuUsage, cpuCount, memoryUsage, totalMemory, discUsage, totalDiscSpace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemInfoData {\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
    sb.append("    cpuCount: ").append(toIndentedString(cpuCount)).append("\n");
    sb.append("    memoryUsage: ").append(toIndentedString(memoryUsage)).append("\n");
    sb.append("    totalMemory: ").append(toIndentedString(totalMemory)).append("\n");
    sb.append("    discUsage: ").append(toIndentedString(discUsage)).append("\n");
    sb.append("    totalDiscSpace: ").append(toIndentedString(totalDiscSpace)).append("\n");
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

    // add `serviceId` to the URL query string
    if (getServiceId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sserviceId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getServiceId()))));
    }

    // add `serviceType` to the URL query string
    if (getServiceType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sserviceType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getServiceType()))));
    }

    // add `cpuUsage` to the URL query string
    if (getCpuUsage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scpuUsage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCpuUsage()))));
    }

    // add `cpuCount` to the URL query string
    if (getCpuCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scpuCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCpuCount()))));
    }

    // add `memoryUsage` to the URL query string
    if (getMemoryUsage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smemoryUsage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMemoryUsage()))));
    }

    // add `totalMemory` to the URL query string
    if (getTotalMemory() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotalMemory%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalMemory()))));
    }

    // add `discUsage` to the URL query string
    if (getDiscUsage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdiscUsage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDiscUsage()))));
    }

    // add `totalDiscSpace` to the URL query string
    if (getTotalDiscSpace() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotalDiscSpace%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalDiscSpace()))));
    }

    return joiner.toString();
  }
}

