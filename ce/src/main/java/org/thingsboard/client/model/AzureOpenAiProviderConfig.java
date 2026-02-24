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
 * AzureOpenAiProviderConfig
 */
@JsonPropertyOrder({
  AzureOpenAiProviderConfig.JSON_PROPERTY_ENDPOINT,
  AzureOpenAiProviderConfig.JSON_PROPERTY_SERVICE_VERSION,
  AzureOpenAiProviderConfig.JSON_PROPERTY_API_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class AzureOpenAiProviderConfig {
  public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
  @javax.annotation.Nonnull
  private String endpoint;

  public static final String JSON_PROPERTY_SERVICE_VERSION = "serviceVersion";
  @javax.annotation.Nullable
  private String serviceVersion;

  public static final String JSON_PROPERTY_API_KEY = "apiKey";
  @javax.annotation.Nonnull
  private String apiKey;

  public AzureOpenAiProviderConfig() { 
  }

  public AzureOpenAiProviderConfig endpoint(@javax.annotation.Nonnull String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Get endpoint
   * @return endpoint
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ENDPOINT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEndpoint() {
    return endpoint;
  }


  @JsonProperty(value = JSON_PROPERTY_ENDPOINT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndpoint(@javax.annotation.Nonnull String endpoint) {
    this.endpoint = endpoint;
  }


  public AzureOpenAiProviderConfig serviceVersion(@javax.annotation.Nullable String serviceVersion) {
    this.serviceVersion = serviceVersion;
    return this;
  }

  /**
   * Get serviceVersion
   * @return serviceVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SERVICE_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getServiceVersion() {
    return serviceVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_SERVICE_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceVersion(@javax.annotation.Nullable String serviceVersion) {
    this.serviceVersion = serviceVersion;
  }


  public AzureOpenAiProviderConfig apiKey(@javax.annotation.Nonnull String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * Get apiKey
   * @return apiKey
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_API_KEY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getApiKey() {
    return apiKey;
  }


  @JsonProperty(value = JSON_PROPERTY_API_KEY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApiKey(@javax.annotation.Nonnull String apiKey) {
    this.apiKey = apiKey;
  }


  /**
   * Return true if this AzureOpenAiProviderConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureOpenAiProviderConfig azureOpenAiProviderConfig = (AzureOpenAiProviderConfig) o;
    return Objects.equals(this.endpoint, azureOpenAiProviderConfig.endpoint) &&
        Objects.equals(this.serviceVersion, azureOpenAiProviderConfig.serviceVersion) &&
        Objects.equals(this.apiKey, azureOpenAiProviderConfig.apiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoint, serviceVersion, apiKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureOpenAiProviderConfig {\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    serviceVersion: ").append(toIndentedString(serviceVersion)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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

    // add `endpoint` to the URL query string
    if (getEndpoint() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sendpoint%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEndpoint()))));
    }

    // add `serviceVersion` to the URL query string
    if (getServiceVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sserviceVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getServiceVersion()))));
    }

    // add `apiKey` to the URL query string
    if (getApiKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sapiKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getApiKey()))));
    }

    return joiner.toString();
  }
}

