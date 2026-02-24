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
 * GoogleVertexAiGeminiProviderConfig
 */
@JsonPropertyOrder({
  GoogleVertexAiGeminiProviderConfig.JSON_PROPERTY_FILE_NAME,
  GoogleVertexAiGeminiProviderConfig.JSON_PROPERTY_PROJECT_ID,
  GoogleVertexAiGeminiProviderConfig.JSON_PROPERTY_LOCATION,
  GoogleVertexAiGeminiProviderConfig.JSON_PROPERTY_SERVICE_ACCOUNT_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class GoogleVertexAiGeminiProviderConfig {
  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  @javax.annotation.Nonnull
  private String fileName;

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  @javax.annotation.Nonnull
  private String projectId;

  public static final String JSON_PROPERTY_LOCATION = "location";
  @javax.annotation.Nonnull
  private String location;

  public static final String JSON_PROPERTY_SERVICE_ACCOUNT_KEY = "serviceAccountKey";
  @javax.annotation.Nonnull
  private String serviceAccountKey;

  public GoogleVertexAiGeminiProviderConfig() { 
  }

  public GoogleVertexAiGeminiProviderConfig fileName(@javax.annotation.Nonnull String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_FILE_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFileName() {
    return fileName;
  }


  @JsonProperty(value = JSON_PROPERTY_FILE_NAME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileName(@javax.annotation.Nonnull String fileName) {
    this.fileName = fileName;
  }


  public GoogleVertexAiGeminiProviderConfig projectId(@javax.annotation.Nonnull String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PROJECT_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProjectId() {
    return projectId;
  }


  @JsonProperty(value = JSON_PROPERTY_PROJECT_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProjectId(@javax.annotation.Nonnull String projectId) {
    this.projectId = projectId;
  }


  public GoogleVertexAiGeminiProviderConfig location(@javax.annotation.Nonnull String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_LOCATION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLocation() {
    return location;
  }


  @JsonProperty(value = JSON_PROPERTY_LOCATION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocation(@javax.annotation.Nonnull String location) {
    this.location = location;
  }


  public GoogleVertexAiGeminiProviderConfig serviceAccountKey(@javax.annotation.Nonnull String serviceAccountKey) {
    this.serviceAccountKey = serviceAccountKey;
    return this;
  }

  /**
   * Get serviceAccountKey
   * @return serviceAccountKey
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SERVICE_ACCOUNT_KEY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getServiceAccountKey() {
    return serviceAccountKey;
  }


  @JsonProperty(value = JSON_PROPERTY_SERVICE_ACCOUNT_KEY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServiceAccountKey(@javax.annotation.Nonnull String serviceAccountKey) {
    this.serviceAccountKey = serviceAccountKey;
  }


  /**
   * Return true if this GoogleVertexAiGeminiProviderConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleVertexAiGeminiProviderConfig googleVertexAiGeminiProviderConfig = (GoogleVertexAiGeminiProviderConfig) o;
    return Objects.equals(this.fileName, googleVertexAiGeminiProviderConfig.fileName) &&
        Objects.equals(this.projectId, googleVertexAiGeminiProviderConfig.projectId) &&
        Objects.equals(this.location, googleVertexAiGeminiProviderConfig.location) &&
        Objects.equals(this.serviceAccountKey, googleVertexAiGeminiProviderConfig.serviceAccountKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, projectId, location, serviceAccountKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleVertexAiGeminiProviderConfig {\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    serviceAccountKey: ").append(toIndentedString(serviceAccountKey)).append("\n");
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

    // add `fileName` to the URL query string
    if (getFileName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfileName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFileName()))));
    }

    // add `projectId` to the URL query string
    if (getProjectId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprojectId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProjectId()))));
    }

    // add `location` to the URL query string
    if (getLocation() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slocation%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLocation()))));
    }

    // add `serviceAccountKey` to the URL query string
    if (getServiceAccountKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sserviceAccountKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getServiceAccountKey()))));
    }

    return joiner.toString();
  }
}

