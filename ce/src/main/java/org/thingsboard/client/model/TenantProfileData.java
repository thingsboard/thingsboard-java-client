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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.thingsboard.client.model.TenantProfileConfiguration;
import org.thingsboard.client.model.TenantProfileQueueConfiguration;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * TenantProfileData
 */
@JsonPropertyOrder({
  TenantProfileData.JSON_PROPERTY_CONFIGURATION,
  TenantProfileData.JSON_PROPERTY_QUEUE_CONFIGURATION
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TenantProfileData {
  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  @Nullable
  private TenantProfileConfiguration _configuration;

  public static final String JSON_PROPERTY_QUEUE_CONFIGURATION = "queueConfiguration";
  @Nullable
  private List<TenantProfileQueueConfiguration> queueConfiguration = new ArrayList<>();

  public TenantProfileData() { 
  }

  public TenantProfileData _configuration(@Nullable TenantProfileConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * Complex JSON object that contains profile settings: max devices, max assets, rate limits, etc.
   * @return _configuration
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantProfileConfiguration getConfiguration() {
    return _configuration;
  }


  @JsonProperty(value = JSON_PROPERTY_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguration(@Nullable TenantProfileConfiguration _configuration) {
    this._configuration = _configuration;
  }


  public TenantProfileData queueConfiguration(@Nullable List<TenantProfileQueueConfiguration> queueConfiguration) {
    this.queueConfiguration = queueConfiguration;
    return this;
  }

  public TenantProfileData addQueueConfigurationItem(TenantProfileQueueConfiguration queueConfigurationItem) {
    if (this.queueConfiguration == null) {
      this.queueConfiguration = new ArrayList<>();
    }
    this.queueConfiguration.add(queueConfigurationItem);
    return this;
  }

  /**
   * JSON array of queue configuration per tenant profile
   * @return queueConfiguration
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_QUEUE_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TenantProfileQueueConfiguration> getQueueConfiguration() {
    return queueConfiguration;
  }


  @JsonProperty(value = JSON_PROPERTY_QUEUE_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueueConfiguration(@Nullable List<TenantProfileQueueConfiguration> queueConfiguration) {
    this.queueConfiguration = queueConfiguration;
  }


  /**
   * Return true if this TenantProfileData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantProfileData tenantProfileData = (TenantProfileData) o;
    return Objects.equals(this._configuration, tenantProfileData._configuration) &&
        Objects.equals(this.queueConfiguration, tenantProfileData.queueConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, queueConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantProfileData {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    queueConfiguration: ").append(toIndentedString(queueConfiguration)).append("\n");
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

    // add `configuration` to the URL query string
    if (getConfiguration() != null) {
      joiner.add(getConfiguration().toUrlQueryString(prefix + "configuration" + suffix));
    }

    // add `queueConfiguration` to the URL query string
    if (getQueueConfiguration() != null) {
      for (int i = 0; i < getQueueConfiguration().size(); i++) {
        if (getQueueConfiguration().get(i) != null) {
          joiner.add(getQueueConfiguration().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%squeueConfiguration%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

