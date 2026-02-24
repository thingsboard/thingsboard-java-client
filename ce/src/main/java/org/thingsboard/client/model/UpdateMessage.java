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
 * UpdateMessage
 */
@JsonPropertyOrder({
  UpdateMessage.JSON_PROPERTY_UPDATE_AVAILABLE,
  UpdateMessage.JSON_PROPERTY_CURRENT_VERSION,
  UpdateMessage.JSON_PROPERTY_LATEST_VERSION,
  UpdateMessage.JSON_PROPERTY_UPGRADE_INSTRUCTIONS_URL,
  UpdateMessage.JSON_PROPERTY_CURRENT_VERSION_RELEASE_NOTES_URL,
  UpdateMessage.JSON_PROPERTY_LATEST_VERSION_RELEASE_NOTES_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class UpdateMessage {
  public static final String JSON_PROPERTY_UPDATE_AVAILABLE = "updateAvailable";
  @javax.annotation.Nullable
  private Boolean updateAvailable;

  public static final String JSON_PROPERTY_CURRENT_VERSION = "currentVersion";
  @javax.annotation.Nullable
  private String currentVersion;

  public static final String JSON_PROPERTY_LATEST_VERSION = "latestVersion";
  @javax.annotation.Nullable
  private String latestVersion;

  public static final String JSON_PROPERTY_UPGRADE_INSTRUCTIONS_URL = "upgradeInstructionsUrl";
  @javax.annotation.Nullable
  private String upgradeInstructionsUrl;

  public static final String JSON_PROPERTY_CURRENT_VERSION_RELEASE_NOTES_URL = "currentVersionReleaseNotesUrl";
  @javax.annotation.Nullable
  private String currentVersionReleaseNotesUrl;

  public static final String JSON_PROPERTY_LATEST_VERSION_RELEASE_NOTES_URL = "latestVersionReleaseNotesUrl";
  @javax.annotation.Nullable
  private String latestVersionReleaseNotesUrl;

  public UpdateMessage() { 
  }

  public UpdateMessage updateAvailable(@javax.annotation.Nullable Boolean updateAvailable) {
    this.updateAvailable = updateAvailable;
    return this;
  }

  /**
   * &#39;True&#39; if new platform update is available.
   * @return updateAvailable
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_UPDATE_AVAILABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUpdateAvailable() {
    return updateAvailable;
  }


  @JsonProperty(value = JSON_PROPERTY_UPDATE_AVAILABLE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateAvailable(@javax.annotation.Nullable Boolean updateAvailable) {
    this.updateAvailable = updateAvailable;
  }


  public UpdateMessage currentVersion(@javax.annotation.Nullable String currentVersion) {
    this.currentVersion = currentVersion;
    return this;
  }

  /**
   * Current ThingsBoard version.
   * @return currentVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCurrentVersion() {
    return currentVersion;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_VERSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentVersion(@javax.annotation.Nullable String currentVersion) {
    this.currentVersion = currentVersion;
  }


  public UpdateMessage latestVersion(@javax.annotation.Nullable String latestVersion) {
    this.latestVersion = latestVersion;
    return this;
  }

  /**
   * Latest ThingsBoard version.
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


  public UpdateMessage upgradeInstructionsUrl(@javax.annotation.Nullable String upgradeInstructionsUrl) {
    this.upgradeInstructionsUrl = upgradeInstructionsUrl;
    return this;
  }

  /**
   * Upgrade instructions URL.
   * @return upgradeInstructionsUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_UPGRADE_INSTRUCTIONS_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUpgradeInstructionsUrl() {
    return upgradeInstructionsUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_UPGRADE_INSTRUCTIONS_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpgradeInstructionsUrl(@javax.annotation.Nullable String upgradeInstructionsUrl) {
    this.upgradeInstructionsUrl = upgradeInstructionsUrl;
  }


  public UpdateMessage currentVersionReleaseNotesUrl(@javax.annotation.Nullable String currentVersionReleaseNotesUrl) {
    this.currentVersionReleaseNotesUrl = currentVersionReleaseNotesUrl;
    return this;
  }

  /**
   * Current ThingsBoard version release notes URL.
   * @return currentVersionReleaseNotesUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_VERSION_RELEASE_NOTES_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCurrentVersionReleaseNotesUrl() {
    return currentVersionReleaseNotesUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_VERSION_RELEASE_NOTES_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentVersionReleaseNotesUrl(@javax.annotation.Nullable String currentVersionReleaseNotesUrl) {
    this.currentVersionReleaseNotesUrl = currentVersionReleaseNotesUrl;
  }


  public UpdateMessage latestVersionReleaseNotesUrl(@javax.annotation.Nullable String latestVersionReleaseNotesUrl) {
    this.latestVersionReleaseNotesUrl = latestVersionReleaseNotesUrl;
    return this;
  }

  /**
   * Latest ThingsBoard version release notes URL.
   * @return latestVersionReleaseNotesUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LATEST_VERSION_RELEASE_NOTES_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLatestVersionReleaseNotesUrl() {
    return latestVersionReleaseNotesUrl;
  }


  @JsonProperty(value = JSON_PROPERTY_LATEST_VERSION_RELEASE_NOTES_URL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestVersionReleaseNotesUrl(@javax.annotation.Nullable String latestVersionReleaseNotesUrl) {
    this.latestVersionReleaseNotesUrl = latestVersionReleaseNotesUrl;
  }


  /**
   * Return true if this UpdateMessage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMessage updateMessage = (UpdateMessage) o;
    return Objects.equals(this.updateAvailable, updateMessage.updateAvailable) &&
        Objects.equals(this.currentVersion, updateMessage.currentVersion) &&
        Objects.equals(this.latestVersion, updateMessage.latestVersion) &&
        Objects.equals(this.upgradeInstructionsUrl, updateMessage.upgradeInstructionsUrl) &&
        Objects.equals(this.currentVersionReleaseNotesUrl, updateMessage.currentVersionReleaseNotesUrl) &&
        Objects.equals(this.latestVersionReleaseNotesUrl, updateMessage.latestVersionReleaseNotesUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateAvailable, currentVersion, latestVersion, upgradeInstructionsUrl, currentVersionReleaseNotesUrl, latestVersionReleaseNotesUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMessage {\n");
    sb.append("    updateAvailable: ").append(toIndentedString(updateAvailable)).append("\n");
    sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
    sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
    sb.append("    upgradeInstructionsUrl: ").append(toIndentedString(upgradeInstructionsUrl)).append("\n");
    sb.append("    currentVersionReleaseNotesUrl: ").append(toIndentedString(currentVersionReleaseNotesUrl)).append("\n");
    sb.append("    latestVersionReleaseNotesUrl: ").append(toIndentedString(latestVersionReleaseNotesUrl)).append("\n");
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

    // add `updateAvailable` to the URL query string
    if (getUpdateAvailable() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%supdateAvailable%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUpdateAvailable()))));
    }

    // add `currentVersion` to the URL query string
    if (getCurrentVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrentVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentVersion()))));
    }

    // add `latestVersion` to the URL query string
    if (getLatestVersion() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slatestVersion%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLatestVersion()))));
    }

    // add `upgradeInstructionsUrl` to the URL query string
    if (getUpgradeInstructionsUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%supgradeInstructionsUrl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUpgradeInstructionsUrl()))));
    }

    // add `currentVersionReleaseNotesUrl` to the URL query string
    if (getCurrentVersionReleaseNotesUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrentVersionReleaseNotesUrl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentVersionReleaseNotesUrl()))));
    }

    // add `latestVersionReleaseNotesUrl` to the URL query string
    if (getLatestVersionReleaseNotesUrl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slatestVersionReleaseNotesUrl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLatestVersionReleaseNotesUrl()))));
    }

    return joiner.toString();
  }
}

