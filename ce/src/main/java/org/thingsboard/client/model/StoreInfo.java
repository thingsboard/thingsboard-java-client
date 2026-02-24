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
 * StoreInfo
 */
@JsonPropertyOrder({
  StoreInfo.JSON_PROPERTY_APP_ID,
  StoreInfo.JSON_PROPERTY_SHA256_CERT_FINGERPRINTS,
  StoreInfo.JSON_PROPERTY_STORE_LINK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class StoreInfo {
  public static final String JSON_PROPERTY_APP_ID = "appId";
  @javax.annotation.Nullable
  private String appId;

  public static final String JSON_PROPERTY_SHA256_CERT_FINGERPRINTS = "sha256CertFingerprints";
  @javax.annotation.Nullable
  private String sha256CertFingerprints;

  public static final String JSON_PROPERTY_STORE_LINK = "storeLink";
  @javax.annotation.Nullable
  private String storeLink;

  public StoreInfo() { 
  }

  public StoreInfo appId(@javax.annotation.Nullable String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * Get appId
   * @return appId
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_APP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAppId() {
    return appId;
  }


  @JsonProperty(value = JSON_PROPERTY_APP_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppId(@javax.annotation.Nullable String appId) {
    this.appId = appId;
  }


  public StoreInfo sha256CertFingerprints(@javax.annotation.Nullable String sha256CertFingerprints) {
    this.sha256CertFingerprints = sha256CertFingerprints;
    return this;
  }

  /**
   * Get sha256CertFingerprints
   * @return sha256CertFingerprints
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHA256_CERT_FINGERPRINTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSha256CertFingerprints() {
    return sha256CertFingerprints;
  }


  @JsonProperty(value = JSON_PROPERTY_SHA256_CERT_FINGERPRINTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSha256CertFingerprints(@javax.annotation.Nullable String sha256CertFingerprints) {
    this.sha256CertFingerprints = sha256CertFingerprints;
  }


  public StoreInfo storeLink(@javax.annotation.Nullable String storeLink) {
    this.storeLink = storeLink;
    return this;
  }

  /**
   * Get storeLink
   * @return storeLink
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_STORE_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStoreLink() {
    return storeLink;
  }


  @JsonProperty(value = JSON_PROPERTY_STORE_LINK, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreLink(@javax.annotation.Nullable String storeLink) {
    this.storeLink = storeLink;
  }


  /**
   * Return true if this StoreInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreInfo storeInfo = (StoreInfo) o;
    return Objects.equals(this.appId, storeInfo.appId) &&
        Objects.equals(this.sha256CertFingerprints, storeInfo.sha256CertFingerprints) &&
        Objects.equals(this.storeLink, storeInfo.storeLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, sha256CertFingerprints, storeLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreInfo {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    sha256CertFingerprints: ").append(toIndentedString(sha256CertFingerprints)).append("\n");
    sb.append("    storeLink: ").append(toIndentedString(storeLink)).append("\n");
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

    // add `appId` to the URL query string
    if (getAppId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sappId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAppId()))));
    }

    // add `sha256CertFingerprints` to the URL query string
    if (getSha256CertFingerprints() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssha256CertFingerprints%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSha256CertFingerprints()))));
    }

    // add `storeLink` to the URL query string
    if (getStoreLink() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstoreLink%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStoreLink()))));
    }

    return joiner.toString();
  }
}

