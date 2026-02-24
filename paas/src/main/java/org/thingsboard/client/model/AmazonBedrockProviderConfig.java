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
 * AmazonBedrockProviderConfig
 */
@JsonPropertyOrder({
  AmazonBedrockProviderConfig.JSON_PROPERTY_REGION,
  AmazonBedrockProviderConfig.JSON_PROPERTY_ACCESS_KEY_ID,
  AmazonBedrockProviderConfig.JSON_PROPERTY_SECRET_ACCESS_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class AmazonBedrockProviderConfig {
  public static final String JSON_PROPERTY_REGION = "region";
  @javax.annotation.Nonnull
  private String region;

  public static final String JSON_PROPERTY_ACCESS_KEY_ID = "accessKeyId";
  @javax.annotation.Nonnull
  private String accessKeyId;

  public static final String JSON_PROPERTY_SECRET_ACCESS_KEY = "secretAccessKey";
  @javax.annotation.Nonnull
  private String secretAccessKey;

  public AmazonBedrockProviderConfig() { 
  }

  public AmazonBedrockProviderConfig region(@javax.annotation.Nonnull String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_REGION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRegion() {
    return region;
  }


  @JsonProperty(value = JSON_PROPERTY_REGION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRegion(@javax.annotation.Nonnull String region) {
    this.region = region;
  }


  public AmazonBedrockProviderConfig accessKeyId(@javax.annotation.Nonnull String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  /**
   * Get accessKeyId
   * @return accessKeyId
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_ACCESS_KEY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccessKeyId() {
    return accessKeyId;
  }


  @JsonProperty(value = JSON_PROPERTY_ACCESS_KEY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccessKeyId(@javax.annotation.Nonnull String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }


  public AmazonBedrockProviderConfig secretAccessKey(@javax.annotation.Nonnull String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

  /**
   * Get secretAccessKey
   * @return secretAccessKey
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_SECRET_ACCESS_KEY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSecretAccessKey() {
    return secretAccessKey;
  }


  @JsonProperty(value = JSON_PROPERTY_SECRET_ACCESS_KEY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSecretAccessKey(@javax.annotation.Nonnull String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }


  /**
   * Return true if this AmazonBedrockProviderConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmazonBedrockProviderConfig amazonBedrockProviderConfig = (AmazonBedrockProviderConfig) o;
    return Objects.equals(this.region, amazonBedrockProviderConfig.region) &&
        Objects.equals(this.accessKeyId, amazonBedrockProviderConfig.accessKeyId) &&
        Objects.equals(this.secretAccessKey, amazonBedrockProviderConfig.secretAccessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, accessKeyId, secretAccessKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmazonBedrockProviderConfig {\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
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

    // add `region` to the URL query string
    if (getRegion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sregion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRegion()))));
    }

    // add `accessKeyId` to the URL query string
    if (getAccessKeyId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saccessKeyId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAccessKeyId()))));
    }

    // add `secretAccessKey` to the URL query string
    if (getSecretAccessKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssecretAccessKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSecretAccessKey()))));
    }

    return joiner.toString();
  }
}

