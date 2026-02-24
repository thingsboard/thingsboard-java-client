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
import org.thingsboard.client.model.RepositoryAuthMethod;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the Repository Settings.
 */
@JsonPropertyOrder({
  RepositorySettings.JSON_PROPERTY_REPOSITORY_URI,
  RepositorySettings.JSON_PROPERTY_AUTH_METHOD,
  RepositorySettings.JSON_PROPERTY_USERNAME,
  RepositorySettings.JSON_PROPERTY_PASSWORD,
  RepositorySettings.JSON_PROPERTY_PRIVATE_KEY_FILE_NAME,
  RepositorySettings.JSON_PROPERTY_PRIVATE_KEY,
  RepositorySettings.JSON_PROPERTY_PRIVATE_KEY_PASSWORD,
  RepositorySettings.JSON_PROPERTY_DEFAULT_BRANCH,
  RepositorySettings.JSON_PROPERTY_READ_ONLY,
  RepositorySettings.JSON_PROPERTY_SHOW_MERGE_COMMITS,
  RepositorySettings.JSON_PROPERTY_LOCAL_ONLY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class RepositorySettings {
  public static final String JSON_PROPERTY_REPOSITORY_URI = "repositoryUri";
  @javax.annotation.Nullable
  private String repositoryUri;

  public static final String JSON_PROPERTY_AUTH_METHOD = "authMethod";
  @javax.annotation.Nullable
  private RepositoryAuthMethod authMethod;

  public static final String JSON_PROPERTY_USERNAME = "username";
  @javax.annotation.Nullable
  private String username;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @javax.annotation.Nullable
  private String password;

  public static final String JSON_PROPERTY_PRIVATE_KEY_FILE_NAME = "privateKeyFileName";
  @javax.annotation.Nullable
  private String privateKeyFileName;

  public static final String JSON_PROPERTY_PRIVATE_KEY = "privateKey";
  @javax.annotation.Nullable
  private String privateKey;

  public static final String JSON_PROPERTY_PRIVATE_KEY_PASSWORD = "privateKeyPassword";
  @javax.annotation.Nullable
  private String privateKeyPassword;

  public static final String JSON_PROPERTY_DEFAULT_BRANCH = "defaultBranch";
  @javax.annotation.Nullable
  private String defaultBranch;

  public static final String JSON_PROPERTY_READ_ONLY = "readOnly";
  @javax.annotation.Nullable
  private Boolean readOnly;

  public static final String JSON_PROPERTY_SHOW_MERGE_COMMITS = "showMergeCommits";
  @javax.annotation.Nullable
  private Boolean showMergeCommits;

  public static final String JSON_PROPERTY_LOCAL_ONLY = "localOnly";
  @javax.annotation.Nullable
  private Boolean localOnly;

  public RepositorySettings() { 
  }

  public RepositorySettings repositoryUri(@javax.annotation.Nullable String repositoryUri) {
    this.repositoryUri = repositoryUri;
    return this;
  }

  /**
   * Get repositoryUri
   * @return repositoryUri
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REPOSITORY_URI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRepositoryUri() {
    return repositoryUri;
  }


  @JsonProperty(value = JSON_PROPERTY_REPOSITORY_URI, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepositoryUri(@javax.annotation.Nullable String repositoryUri) {
    this.repositoryUri = repositoryUri;
  }


  public RepositorySettings authMethod(@javax.annotation.Nullable RepositoryAuthMethod authMethod) {
    this.authMethod = authMethod;
    return this;
  }

  /**
   * Get authMethod
   * @return authMethod
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AUTH_METHOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RepositoryAuthMethod getAuthMethod() {
    return authMethod;
  }


  @JsonProperty(value = JSON_PROPERTY_AUTH_METHOD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthMethod(@javax.annotation.Nullable RepositoryAuthMethod authMethod) {
    this.authMethod = authMethod;
  }


  public RepositorySettings username(@javax.annotation.Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_USERNAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUsername() {
    return username;
  }


  @JsonProperty(value = JSON_PROPERTY_USERNAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(@javax.annotation.Nullable String username) {
    this.username = username;
  }


  public RepositorySettings password(@javax.annotation.Nullable String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PASSWORD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPassword() {
    return password;
  }


  @JsonProperty(value = JSON_PROPERTY_PASSWORD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = password;
  }


  public RepositorySettings privateKeyFileName(@javax.annotation.Nullable String privateKeyFileName) {
    this.privateKeyFileName = privateKeyFileName;
    return this;
  }

  /**
   * Get privateKeyFileName
   * @return privateKeyFileName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRIVATE_KEY_FILE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrivateKeyFileName() {
    return privateKeyFileName;
  }


  @JsonProperty(value = JSON_PROPERTY_PRIVATE_KEY_FILE_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivateKeyFileName(@javax.annotation.Nullable String privateKeyFileName) {
    this.privateKeyFileName = privateKeyFileName;
  }


  public RepositorySettings privateKey(@javax.annotation.Nullable String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  /**
   * Get privateKey
   * @return privateKey
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRIVATE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrivateKey() {
    return privateKey;
  }


  @JsonProperty(value = JSON_PROPERTY_PRIVATE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivateKey(@javax.annotation.Nullable String privateKey) {
    this.privateKey = privateKey;
  }


  public RepositorySettings privateKeyPassword(@javax.annotation.Nullable String privateKeyPassword) {
    this.privateKeyPassword = privateKeyPassword;
    return this;
  }

  /**
   * Get privateKeyPassword
   * @return privateKeyPassword
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PRIVATE_KEY_PASSWORD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrivateKeyPassword() {
    return privateKeyPassword;
  }


  @JsonProperty(value = JSON_PROPERTY_PRIVATE_KEY_PASSWORD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivateKeyPassword(@javax.annotation.Nullable String privateKeyPassword) {
    this.privateKeyPassword = privateKeyPassword;
  }


  public RepositorySettings defaultBranch(@javax.annotation.Nullable String defaultBranch) {
    this.defaultBranch = defaultBranch;
    return this;
  }

  /**
   * Get defaultBranch
   * @return defaultBranch
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT_BRANCH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDefaultBranch() {
    return defaultBranch;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_BRANCH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultBranch(@javax.annotation.Nullable String defaultBranch) {
    this.defaultBranch = defaultBranch;
  }


  public RepositorySettings readOnly(@javax.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * Get readOnly
   * @return readOnly
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_READ_ONLY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getReadOnly() {
    return readOnly;
  }


  @JsonProperty(value = JSON_PROPERTY_READ_ONLY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadOnly(@javax.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public RepositorySettings showMergeCommits(@javax.annotation.Nullable Boolean showMergeCommits) {
    this.showMergeCommits = showMergeCommits;
    return this;
  }

  /**
   * Get showMergeCommits
   * @return showMergeCommits
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SHOW_MERGE_COMMITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowMergeCommits() {
    return showMergeCommits;
  }


  @JsonProperty(value = JSON_PROPERTY_SHOW_MERGE_COMMITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowMergeCommits(@javax.annotation.Nullable Boolean showMergeCommits) {
    this.showMergeCommits = showMergeCommits;
  }


  public RepositorySettings localOnly(@javax.annotation.Nullable Boolean localOnly) {
    this.localOnly = localOnly;
    return this;
  }

  /**
   * Get localOnly
   * @return localOnly
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LOCAL_ONLY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getLocalOnly() {
    return localOnly;
  }


  @JsonProperty(value = JSON_PROPERTY_LOCAL_ONLY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocalOnly(@javax.annotation.Nullable Boolean localOnly) {
    this.localOnly = localOnly;
  }


  /**
   * Return true if this RepositorySettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositorySettings repositorySettings = (RepositorySettings) o;
    return Objects.equals(this.repositoryUri, repositorySettings.repositoryUri) &&
        Objects.equals(this.authMethod, repositorySettings.authMethod) &&
        Objects.equals(this.username, repositorySettings.username) &&
        Objects.equals(this.password, repositorySettings.password) &&
        Objects.equals(this.privateKeyFileName, repositorySettings.privateKeyFileName) &&
        Objects.equals(this.privateKey, repositorySettings.privateKey) &&
        Objects.equals(this.privateKeyPassword, repositorySettings.privateKeyPassword) &&
        Objects.equals(this.defaultBranch, repositorySettings.defaultBranch) &&
        Objects.equals(this.readOnly, repositorySettings.readOnly) &&
        Objects.equals(this.showMergeCommits, repositorySettings.showMergeCommits) &&
        Objects.equals(this.localOnly, repositorySettings.localOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repositoryUri, authMethod, username, password, privateKeyFileName, privateKey, privateKeyPassword, defaultBranch, readOnly, showMergeCommits, localOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositorySettings {\n");
    sb.append("    repositoryUri: ").append(toIndentedString(repositoryUri)).append("\n");
    sb.append("    authMethod: ").append(toIndentedString(authMethod)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    privateKeyFileName: ").append(toIndentedString(privateKeyFileName)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    privateKeyPassword: ").append(toIndentedString(privateKeyPassword)).append("\n");
    sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    showMergeCommits: ").append(toIndentedString(showMergeCommits)).append("\n");
    sb.append("    localOnly: ").append(toIndentedString(localOnly)).append("\n");
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

    // add `repositoryUri` to the URL query string
    if (getRepositoryUri() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srepositoryUri%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRepositoryUri()))));
    }

    // add `authMethod` to the URL query string
    if (getAuthMethod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sauthMethod%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAuthMethod()))));
    }

    // add `username` to the URL query string
    if (getUsername() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%susername%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUsername()))));
    }

    // add `password` to the URL query string
    if (getPassword() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spassword%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPassword()))));
    }

    // add `privateKeyFileName` to the URL query string
    if (getPrivateKeyFileName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprivateKeyFileName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPrivateKeyFileName()))));
    }

    // add `privateKey` to the URL query string
    if (getPrivateKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprivateKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPrivateKey()))));
    }

    // add `privateKeyPassword` to the URL query string
    if (getPrivateKeyPassword() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sprivateKeyPassword%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPrivateKeyPassword()))));
    }

    // add `defaultBranch` to the URL query string
    if (getDefaultBranch() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdefaultBranch%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDefaultBranch()))));
    }

    // add `readOnly` to the URL query string
    if (getReadOnly() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreadOnly%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReadOnly()))));
    }

    // add `showMergeCommits` to the URL query string
    if (getShowMergeCommits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sshowMergeCommits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getShowMergeCommits()))));
    }

    // add `localOnly` to the URL query string
    if (getLocalOnly() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slocalOnly%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLocalOnly()))));
    }

    return joiner.toString();
  }
}

