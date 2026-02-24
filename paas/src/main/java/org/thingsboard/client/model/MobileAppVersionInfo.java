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
 * MobileAppVersionInfo
 */
@JsonPropertyOrder({
  MobileAppVersionInfo.JSON_PROPERTY_MIN_VERSION,
  MobileAppVersionInfo.JSON_PROPERTY_MIN_VERSION_RELEASE_NOTES,
  MobileAppVersionInfo.JSON_PROPERTY_LATEST_VERSION,
  MobileAppVersionInfo.JSON_PROPERTY_LATEST_VERSION_RELEASE_NOTES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class MobileAppVersionInfo {
  public static final String JSON_PROPERTY_MIN_VERSION = "minVersion";
  @javax.annotation.Nullable
  private String minVersion;

  public static final String JSON_PROPERTY_MIN_VERSION_RELEASE_NOTES = "minVersionReleaseNotes";
  @javax.annotation.Nullable
  private String minVersionReleaseNotes;

  public static final String JSON_PROPERTY_LATEST_VERSION = "latestVersion";
  @javax.annotation.Nullable
  private String latestVersion;

  public static final String JSON_PROPERTY_LATEST_VERSION_RELEASE_NOTES = "latestVersionReleaseNotes";
  @javax.annotation.Nullable
  private String latestVersionReleaseNotes;

  public MobileAppVersionInfo() { 
  }

  public MobileAppVersionInfo minVersion(@javax.annotation.Nullable String minVersion) {
    this.minVersion = minVersion;
    return this;
  }

  /**
   * Minimum supported version
   * @return minVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MIN_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMinVersion() {
    return minVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_MIN_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinVersion(@javax.annotation.Nullable String minVersion) {
    this.minVersion = minVersion;
  }


  public MobileAppVersionInfo minVersionReleaseNotes(@javax.annotation.Nullable String minVersionReleaseNotes) {
    this.minVersionReleaseNotes = minVersionReleaseNotes;
    return this;
  }

  /**
   * Release notes of minimum supported version
   * @return minVersionReleaseNotes
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MIN_VERSION_RELEASE_NOTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMinVersionReleaseNotes() {
    return minVersionReleaseNotes;
  }


  @JsonProperty(value = JSON_PROPERTY_MIN_VERSION_RELEASE_NOTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinVersionReleaseNotes(@javax.annotation.Nullable String minVersionReleaseNotes) {
    this.minVersionReleaseNotes = minVersionReleaseNotes;
  }


  public MobileAppVersionInfo latestVersion(@javax.annotation.Nullable String latestVersion) {
    this.latestVersion = latestVersion;
    return this;
  }

  /**
   * Latest supported version
   * @return latestVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LATEST_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLatestVersion() {
    return latestVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_LATEST_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestVersion(@javax.annotation.Nullable String latestVersion) {
    this.latestVersion = latestVersion;
  }


  public MobileAppVersionInfo latestVersionReleaseNotes(@javax.annotation.Nullable String latestVersionReleaseNotes) {
    this.latestVersionReleaseNotes = latestVersionReleaseNotes;
    return this;
  }

  /**
   * Release notes of latest supported version
   * @return latestVersionReleaseNotes
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LATEST_VERSION_RELEASE_NOTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLatestVersionReleaseNotes() {
    return latestVersionReleaseNotes;
  }


  @JsonProperty(value = JSON_PROPERTY_LATEST_VERSION_RELEASE_NOTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestVersionReleaseNotes(@javax.annotation.Nullable String latestVersionReleaseNotes) {
    this.latestVersionReleaseNotes = latestVersionReleaseNotes;
  }


  /**
   * Return true if this MobileAppVersionInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileAppVersionInfo mobileAppVersionInfo = (MobileAppVersionInfo) o;
    return Objects.equals(this.minVersion, mobileAppVersionInfo.minVersion) &&
        Objects.equals(this.minVersionReleaseNotes, mobileAppVersionInfo.minVersionReleaseNotes) &&
        Objects.equals(this.latestVersion, mobileAppVersionInfo.latestVersion) &&
        Objects.equals(this.latestVersionReleaseNotes, mobileAppVersionInfo.latestVersionReleaseNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minVersion, minVersionReleaseNotes, latestVersion, latestVersionReleaseNotes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileAppVersionInfo {\n");
    sb.append("    minVersion: ").append(toIndentedString(minVersion)).append("\n");
    sb.append("    minVersionReleaseNotes: ").append(toIndentedString(minVersionReleaseNotes)).append("\n");
    sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
    sb.append("    latestVersionReleaseNotes: ").append(toIndentedString(latestVersionReleaseNotes)).append("\n");
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

    // add `minVersion` to the URL query string
    if (getMinVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sminVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinVersion()))));
    }

    // add `minVersionReleaseNotes` to the URL query string
    if (getMinVersionReleaseNotes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sminVersionReleaseNotes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinVersionReleaseNotes()))));
    }

    // add `latestVersion` to the URL query string
    if (getLatestVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slatestVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLatestVersion()))));
    }

    // add `latestVersionReleaseNotes` to the URL query string
    if (getLatestVersionReleaseNotes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slatestVersionReleaseNotes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLatestVersionReleaseNotes()))));
    }

    return joiner.toString();
  }
}

