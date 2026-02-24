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
import org.thingsboard.client.model.UserPasswordPolicy;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * A JSON value representing the Security Settings.
 */
@JsonPropertyOrder({
  SecuritySettings.JSON_PROPERTY_PASSWORD_POLICY,
  SecuritySettings.JSON_PROPERTY_MAX_FAILED_LOGIN_ATTEMPTS,
  SecuritySettings.JSON_PROPERTY_USER_LOCKOUT_NOTIFICATION_EMAIL,
  SecuritySettings.JSON_PROPERTY_MOBILE_SECRET_KEY_LENGTH,
  SecuritySettings.JSON_PROPERTY_USER_ACTIVATION_TOKEN_TTL,
  SecuritySettings.JSON_PROPERTY_PASSWORD_RESET_TOKEN_TTL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class SecuritySettings {
  public static final String JSON_PROPERTY_PASSWORD_POLICY = "passwordPolicy";
  @javax.annotation.Nullable
  private UserPasswordPolicy passwordPolicy;

  public static final String JSON_PROPERTY_MAX_FAILED_LOGIN_ATTEMPTS = "maxFailedLoginAttempts";
  @javax.annotation.Nullable
  private Integer maxFailedLoginAttempts;

  public static final String JSON_PROPERTY_USER_LOCKOUT_NOTIFICATION_EMAIL = "userLockoutNotificationEmail";
  @javax.annotation.Nullable
  private String userLockoutNotificationEmail;

  public static final String JSON_PROPERTY_MOBILE_SECRET_KEY_LENGTH = "mobileSecretKeyLength";
  @javax.annotation.Nullable
  private Integer mobileSecretKeyLength;

  public static final String JSON_PROPERTY_USER_ACTIVATION_TOKEN_TTL = "userActivationTokenTtl";
  @javax.annotation.Nonnull
  private Integer userActivationTokenTtl;

  public static final String JSON_PROPERTY_PASSWORD_RESET_TOKEN_TTL = "passwordResetTokenTtl";
  @javax.annotation.Nonnull
  private Integer passwordResetTokenTtl;

  public SecuritySettings() { 
  }

  public SecuritySettings passwordPolicy(@javax.annotation.Nullable UserPasswordPolicy passwordPolicy) {
    this.passwordPolicy = passwordPolicy;
    return this;
  }

  /**
   * The user password policy object.
   * @return passwordPolicy
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PASSWORD_POLICY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UserPasswordPolicy getPasswordPolicy() {
    return passwordPolicy;
  }


  @JsonProperty(value = JSON_PROPERTY_PASSWORD_POLICY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPasswordPolicy(@javax.annotation.Nullable UserPasswordPolicy passwordPolicy) {
    this.passwordPolicy = passwordPolicy;
  }


  public SecuritySettings maxFailedLoginAttempts(@javax.annotation.Nullable Integer maxFailedLoginAttempts) {
    this.maxFailedLoginAttempts = maxFailedLoginAttempts;
    return this;
  }

  /**
   * Maximum number of failed login attempts allowed before user account is locked.
   * @return maxFailedLoginAttempts
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_FAILED_LOGIN_ATTEMPTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMaxFailedLoginAttempts() {
    return maxFailedLoginAttempts;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_FAILED_LOGIN_ATTEMPTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxFailedLoginAttempts(@javax.annotation.Nullable Integer maxFailedLoginAttempts) {
    this.maxFailedLoginAttempts = maxFailedLoginAttempts;
  }


  public SecuritySettings userLockoutNotificationEmail(@javax.annotation.Nullable String userLockoutNotificationEmail) {
    this.userLockoutNotificationEmail = userLockoutNotificationEmail;
    return this;
  }

  /**
   * Email to use for notifications about locked users.
   * @return userLockoutNotificationEmail
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_USER_LOCKOUT_NOTIFICATION_EMAIL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUserLockoutNotificationEmail() {
    return userLockoutNotificationEmail;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_LOCKOUT_NOTIFICATION_EMAIL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserLockoutNotificationEmail(@javax.annotation.Nullable String userLockoutNotificationEmail) {
    this.userLockoutNotificationEmail = userLockoutNotificationEmail;
  }


  public SecuritySettings mobileSecretKeyLength(@javax.annotation.Nullable Integer mobileSecretKeyLength) {
    this.mobileSecretKeyLength = mobileSecretKeyLength;
    return this;
  }

  /**
   * Mobile secret key length
   * @return mobileSecretKeyLength
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MOBILE_SECRET_KEY_LENGTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMobileSecretKeyLength() {
    return mobileSecretKeyLength;
  }


  @JsonProperty(value = JSON_PROPERTY_MOBILE_SECRET_KEY_LENGTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileSecretKeyLength(@javax.annotation.Nullable Integer mobileSecretKeyLength) {
    this.mobileSecretKeyLength = mobileSecretKeyLength;
  }


  public SecuritySettings userActivationTokenTtl(@javax.annotation.Nonnull Integer userActivationTokenTtl) {
    this.userActivationTokenTtl = userActivationTokenTtl;
    return this;
  }

  /**
   * TTL in hours for user activation link
   * minimum: 1
   * maximum: 24
   * @return userActivationTokenTtl
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_USER_ACTIVATION_TOKEN_TTL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getUserActivationTokenTtl() {
    return userActivationTokenTtl;
  }


  @JsonProperty(value = JSON_PROPERTY_USER_ACTIVATION_TOKEN_TTL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserActivationTokenTtl(@javax.annotation.Nonnull Integer userActivationTokenTtl) {
    this.userActivationTokenTtl = userActivationTokenTtl;
  }


  public SecuritySettings passwordResetTokenTtl(@javax.annotation.Nonnull Integer passwordResetTokenTtl) {
    this.passwordResetTokenTtl = passwordResetTokenTtl;
    return this;
  }

  /**
   * TTL in hours for password reset link
   * minimum: 1
   * maximum: 24
   * @return passwordResetTokenTtl
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_PASSWORD_RESET_TOKEN_TTL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getPasswordResetTokenTtl() {
    return passwordResetTokenTtl;
  }


  @JsonProperty(value = JSON_PROPERTY_PASSWORD_RESET_TOKEN_TTL, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPasswordResetTokenTtl(@javax.annotation.Nonnull Integer passwordResetTokenTtl) {
    this.passwordResetTokenTtl = passwordResetTokenTtl;
  }


  /**
   * Return true if this SecuritySettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritySettings securitySettings = (SecuritySettings) o;
    return Objects.equals(this.passwordPolicy, securitySettings.passwordPolicy) &&
        Objects.equals(this.maxFailedLoginAttempts, securitySettings.maxFailedLoginAttempts) &&
        Objects.equals(this.userLockoutNotificationEmail, securitySettings.userLockoutNotificationEmail) &&
        Objects.equals(this.mobileSecretKeyLength, securitySettings.mobileSecretKeyLength) &&
        Objects.equals(this.userActivationTokenTtl, securitySettings.userActivationTokenTtl) &&
        Objects.equals(this.passwordResetTokenTtl, securitySettings.passwordResetTokenTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordPolicy, maxFailedLoginAttempts, userLockoutNotificationEmail, mobileSecretKeyLength, userActivationTokenTtl, passwordResetTokenTtl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritySettings {\n");
    sb.append("    passwordPolicy: ").append(toIndentedString(passwordPolicy)).append("\n");
    sb.append("    maxFailedLoginAttempts: ").append(toIndentedString(maxFailedLoginAttempts)).append("\n");
    sb.append("    userLockoutNotificationEmail: ").append(toIndentedString(userLockoutNotificationEmail)).append("\n");
    sb.append("    mobileSecretKeyLength: ").append(toIndentedString(mobileSecretKeyLength)).append("\n");
    sb.append("    userActivationTokenTtl: ").append(toIndentedString(userActivationTokenTtl)).append("\n");
    sb.append("    passwordResetTokenTtl: ").append(toIndentedString(passwordResetTokenTtl)).append("\n");
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

    // add `passwordPolicy` to the URL query string
    if (getPasswordPolicy() != null) {
      joiner.add(getPasswordPolicy().toUrlQueryString(prefix + "passwordPolicy" + suffix));
    }

    // add `maxFailedLoginAttempts` to the URL query string
    if (getMaxFailedLoginAttempts() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxFailedLoginAttempts%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxFailedLoginAttempts()))));
    }

    // add `userLockoutNotificationEmail` to the URL query string
    if (getUserLockoutNotificationEmail() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suserLockoutNotificationEmail%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUserLockoutNotificationEmail()))));
    }

    // add `mobileSecretKeyLength` to the URL query string
    if (getMobileSecretKeyLength() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smobileSecretKeyLength%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMobileSecretKeyLength()))));
    }

    // add `userActivationTokenTtl` to the URL query string
    if (getUserActivationTokenTtl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suserActivationTokenTtl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUserActivationTokenTtl()))));
    }

    // add `passwordResetTokenTtl` to the URL query string
    if (getPasswordResetTokenTtl() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spasswordResetTokenTtl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPasswordResetTokenTtl()))));
    }

    return joiner.toString();
  }
}

