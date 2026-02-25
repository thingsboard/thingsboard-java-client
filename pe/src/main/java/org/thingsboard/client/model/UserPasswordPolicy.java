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
 * UserPasswordPolicy
 */
@JsonPropertyOrder({
  UserPasswordPolicy.JSON_PROPERTY_MINIMUM_LENGTH,
  UserPasswordPolicy.JSON_PROPERTY_MAXIMUM_LENGTH,
  UserPasswordPolicy.JSON_PROPERTY_MINIMUM_UPPERCASE_LETTERS,
  UserPasswordPolicy.JSON_PROPERTY_MINIMUM_LOWERCASE_LETTERS,
  UserPasswordPolicy.JSON_PROPERTY_MINIMUM_DIGITS,
  UserPasswordPolicy.JSON_PROPERTY_MINIMUM_SPECIAL_CHARACTERS,
  UserPasswordPolicy.JSON_PROPERTY_ALLOW_WHITESPACES,
  UserPasswordPolicy.JSON_PROPERTY_FORCE_USER_TO_RESET_PASSWORD_IF_NOT_VALID,
  UserPasswordPolicy.JSON_PROPERTY_PASSWORD_EXPIRATION_PERIOD_DAYS,
  UserPasswordPolicy.JSON_PROPERTY_PASSWORD_REUSE_FREQUENCY_DAYS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class UserPasswordPolicy {
  public static final String JSON_PROPERTY_MINIMUM_LENGTH = "minimumLength";
  @javax.annotation.Nullable
  private Integer minimumLength;

  public static final String JSON_PROPERTY_MAXIMUM_LENGTH = "maximumLength";
  @javax.annotation.Nullable
  private Integer maximumLength;

  public static final String JSON_PROPERTY_MINIMUM_UPPERCASE_LETTERS = "minimumUppercaseLetters";
  @javax.annotation.Nullable
  private Integer minimumUppercaseLetters;

  public static final String JSON_PROPERTY_MINIMUM_LOWERCASE_LETTERS = "minimumLowercaseLetters";
  @javax.annotation.Nullable
  private Integer minimumLowercaseLetters;

  public static final String JSON_PROPERTY_MINIMUM_DIGITS = "minimumDigits";
  @javax.annotation.Nullable
  private Integer minimumDigits;

  public static final String JSON_PROPERTY_MINIMUM_SPECIAL_CHARACTERS = "minimumSpecialCharacters";
  @javax.annotation.Nullable
  private Integer minimumSpecialCharacters;

  public static final String JSON_PROPERTY_ALLOW_WHITESPACES = "allowWhitespaces";
  @javax.annotation.Nullable
  private Boolean allowWhitespaces;

  public static final String JSON_PROPERTY_FORCE_USER_TO_RESET_PASSWORD_IF_NOT_VALID = "forceUserToResetPasswordIfNotValid";
  @javax.annotation.Nullable
  private Boolean forceUserToResetPasswordIfNotValid;

  public static final String JSON_PROPERTY_PASSWORD_EXPIRATION_PERIOD_DAYS = "passwordExpirationPeriodDays";
  @javax.annotation.Nullable
  private Integer passwordExpirationPeriodDays;

  public static final String JSON_PROPERTY_PASSWORD_REUSE_FREQUENCY_DAYS = "passwordReuseFrequencyDays";
  @javax.annotation.Nullable
  private Integer passwordReuseFrequencyDays;

  public UserPasswordPolicy() { 
  }

  public UserPasswordPolicy minimumLength(@javax.annotation.Nullable Integer minimumLength) {
    this.minimumLength = minimumLength;
    return this;
  }

  /**
   * Minimum number of symbols in the password.
   * @return minimumLength
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MINIMUM_LENGTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMinimumLength() {
    return minimumLength;
  }


  @JsonProperty(value = JSON_PROPERTY_MINIMUM_LENGTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimumLength(@javax.annotation.Nullable Integer minimumLength) {
    this.minimumLength = minimumLength;
  }


  public UserPasswordPolicy maximumLength(@javax.annotation.Nullable Integer maximumLength) {
    this.maximumLength = maximumLength;
    return this;
  }

  /**
   * Maximum number of symbols in the password.
   * @return maximumLength
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAXIMUM_LENGTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMaximumLength() {
    return maximumLength;
  }


  @JsonProperty(value = JSON_PROPERTY_MAXIMUM_LENGTH, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximumLength(@javax.annotation.Nullable Integer maximumLength) {
    this.maximumLength = maximumLength;
  }


  public UserPasswordPolicy minimumUppercaseLetters(@javax.annotation.Nullable Integer minimumUppercaseLetters) {
    this.minimumUppercaseLetters = minimumUppercaseLetters;
    return this;
  }

  /**
   * Minimum number of uppercase letters in the password.
   * @return minimumUppercaseLetters
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MINIMUM_UPPERCASE_LETTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMinimumUppercaseLetters() {
    return minimumUppercaseLetters;
  }


  @JsonProperty(value = JSON_PROPERTY_MINIMUM_UPPERCASE_LETTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimumUppercaseLetters(@javax.annotation.Nullable Integer minimumUppercaseLetters) {
    this.minimumUppercaseLetters = minimumUppercaseLetters;
  }


  public UserPasswordPolicy minimumLowercaseLetters(@javax.annotation.Nullable Integer minimumLowercaseLetters) {
    this.minimumLowercaseLetters = minimumLowercaseLetters;
    return this;
  }

  /**
   * Minimum number of lowercase letters in the password.
   * @return minimumLowercaseLetters
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MINIMUM_LOWERCASE_LETTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMinimumLowercaseLetters() {
    return minimumLowercaseLetters;
  }


  @JsonProperty(value = JSON_PROPERTY_MINIMUM_LOWERCASE_LETTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimumLowercaseLetters(@javax.annotation.Nullable Integer minimumLowercaseLetters) {
    this.minimumLowercaseLetters = minimumLowercaseLetters;
  }


  public UserPasswordPolicy minimumDigits(@javax.annotation.Nullable Integer minimumDigits) {
    this.minimumDigits = minimumDigits;
    return this;
  }

  /**
   * Minimum number of digits in the password.
   * @return minimumDigits
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MINIMUM_DIGITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMinimumDigits() {
    return minimumDigits;
  }


  @JsonProperty(value = JSON_PROPERTY_MINIMUM_DIGITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimumDigits(@javax.annotation.Nullable Integer minimumDigits) {
    this.minimumDigits = minimumDigits;
  }


  public UserPasswordPolicy minimumSpecialCharacters(@javax.annotation.Nullable Integer minimumSpecialCharacters) {
    this.minimumSpecialCharacters = minimumSpecialCharacters;
    return this;
  }

  /**
   * Minimum number of special in the password.
   * @return minimumSpecialCharacters
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MINIMUM_SPECIAL_CHARACTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMinimumSpecialCharacters() {
    return minimumSpecialCharacters;
  }


  @JsonProperty(value = JSON_PROPERTY_MINIMUM_SPECIAL_CHARACTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimumSpecialCharacters(@javax.annotation.Nullable Integer minimumSpecialCharacters) {
    this.minimumSpecialCharacters = minimumSpecialCharacters;
  }


  public UserPasswordPolicy allowWhitespaces(@javax.annotation.Nullable Boolean allowWhitespaces) {
    this.allowWhitespaces = allowWhitespaces;
    return this;
  }

  /**
   * Allow whitespaces
   * @return allowWhitespaces
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ALLOW_WHITESPACES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllowWhitespaces() {
    return allowWhitespaces;
  }


  @JsonProperty(value = JSON_PROPERTY_ALLOW_WHITESPACES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowWhitespaces(@javax.annotation.Nullable Boolean allowWhitespaces) {
    this.allowWhitespaces = allowWhitespaces;
  }


  public UserPasswordPolicy forceUserToResetPasswordIfNotValid(@javax.annotation.Nullable Boolean forceUserToResetPasswordIfNotValid) {
    this.forceUserToResetPasswordIfNotValid = forceUserToResetPasswordIfNotValid;
    return this;
  }

  /**
   * Force user to update password if existing one does not pass validation
   * @return forceUserToResetPasswordIfNotValid
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FORCE_USER_TO_RESET_PASSWORD_IF_NOT_VALID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getForceUserToResetPasswordIfNotValid() {
    return forceUserToResetPasswordIfNotValid;
  }


  @JsonProperty(value = JSON_PROPERTY_FORCE_USER_TO_RESET_PASSWORD_IF_NOT_VALID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForceUserToResetPasswordIfNotValid(@javax.annotation.Nullable Boolean forceUserToResetPasswordIfNotValid) {
    this.forceUserToResetPasswordIfNotValid = forceUserToResetPasswordIfNotValid;
  }


  public UserPasswordPolicy passwordExpirationPeriodDays(@javax.annotation.Nullable Integer passwordExpirationPeriodDays) {
    this.passwordExpirationPeriodDays = passwordExpirationPeriodDays;
    return this;
  }

  /**
   * Password expiration period (days). Force expiration of the password.
   * @return passwordExpirationPeriodDays
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PASSWORD_EXPIRATION_PERIOD_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPasswordExpirationPeriodDays() {
    return passwordExpirationPeriodDays;
  }


  @JsonProperty(value = JSON_PROPERTY_PASSWORD_EXPIRATION_PERIOD_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPasswordExpirationPeriodDays(@javax.annotation.Nullable Integer passwordExpirationPeriodDays) {
    this.passwordExpirationPeriodDays = passwordExpirationPeriodDays;
  }


  public UserPasswordPolicy passwordReuseFrequencyDays(@javax.annotation.Nullable Integer passwordReuseFrequencyDays) {
    this.passwordReuseFrequencyDays = passwordReuseFrequencyDays;
    return this;
  }

  /**
   * Password reuse frequency (days). Disallow to use the same password for the defined number of days
   * @return passwordReuseFrequencyDays
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_PASSWORD_REUSE_FREQUENCY_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPasswordReuseFrequencyDays() {
    return passwordReuseFrequencyDays;
  }


  @JsonProperty(value = JSON_PROPERTY_PASSWORD_REUSE_FREQUENCY_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPasswordReuseFrequencyDays(@javax.annotation.Nullable Integer passwordReuseFrequencyDays) {
    this.passwordReuseFrequencyDays = passwordReuseFrequencyDays;
  }


  /**
   * Return true if this UserPasswordPolicy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPasswordPolicy userPasswordPolicy = (UserPasswordPolicy) o;
    return Objects.equals(this.minimumLength, userPasswordPolicy.minimumLength) &&
        Objects.equals(this.maximumLength, userPasswordPolicy.maximumLength) &&
        Objects.equals(this.minimumUppercaseLetters, userPasswordPolicy.minimumUppercaseLetters) &&
        Objects.equals(this.minimumLowercaseLetters, userPasswordPolicy.minimumLowercaseLetters) &&
        Objects.equals(this.minimumDigits, userPasswordPolicy.minimumDigits) &&
        Objects.equals(this.minimumSpecialCharacters, userPasswordPolicy.minimumSpecialCharacters) &&
        Objects.equals(this.allowWhitespaces, userPasswordPolicy.allowWhitespaces) &&
        Objects.equals(this.forceUserToResetPasswordIfNotValid, userPasswordPolicy.forceUserToResetPasswordIfNotValid) &&
        Objects.equals(this.passwordExpirationPeriodDays, userPasswordPolicy.passwordExpirationPeriodDays) &&
        Objects.equals(this.passwordReuseFrequencyDays, userPasswordPolicy.passwordReuseFrequencyDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumLength, maximumLength, minimumUppercaseLetters, minimumLowercaseLetters, minimumDigits, minimumSpecialCharacters, allowWhitespaces, forceUserToResetPasswordIfNotValid, passwordExpirationPeriodDays, passwordReuseFrequencyDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPasswordPolicy {\n");
    sb.append("    minimumLength: ").append(toIndentedString(minimumLength)).append("\n");
    sb.append("    maximumLength: ").append(toIndentedString(maximumLength)).append("\n");
    sb.append("    minimumUppercaseLetters: ").append(toIndentedString(minimumUppercaseLetters)).append("\n");
    sb.append("    minimumLowercaseLetters: ").append(toIndentedString(minimumLowercaseLetters)).append("\n");
    sb.append("    minimumDigits: ").append(toIndentedString(minimumDigits)).append("\n");
    sb.append("    minimumSpecialCharacters: ").append(toIndentedString(minimumSpecialCharacters)).append("\n");
    sb.append("    allowWhitespaces: ").append(toIndentedString(allowWhitespaces)).append("\n");
    sb.append("    forceUserToResetPasswordIfNotValid: ").append(toIndentedString(forceUserToResetPasswordIfNotValid)).append("\n");
    sb.append("    passwordExpirationPeriodDays: ").append(toIndentedString(passwordExpirationPeriodDays)).append("\n");
    sb.append("    passwordReuseFrequencyDays: ").append(toIndentedString(passwordReuseFrequencyDays)).append("\n");
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

    // add `minimumLength` to the URL query string
    if (getMinimumLength() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sminimumLength%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinimumLength()))));
    }

    // add `maximumLength` to the URL query string
    if (getMaximumLength() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaximumLength%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaximumLength()))));
    }

    // add `minimumUppercaseLetters` to the URL query string
    if (getMinimumUppercaseLetters() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sminimumUppercaseLetters%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinimumUppercaseLetters()))));
    }

    // add `minimumLowercaseLetters` to the URL query string
    if (getMinimumLowercaseLetters() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sminimumLowercaseLetters%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinimumLowercaseLetters()))));
    }

    // add `minimumDigits` to the URL query string
    if (getMinimumDigits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sminimumDigits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinimumDigits()))));
    }

    // add `minimumSpecialCharacters` to the URL query string
    if (getMinimumSpecialCharacters() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sminimumSpecialCharacters%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinimumSpecialCharacters()))));
    }

    // add `allowWhitespaces` to the URL query string
    if (getAllowWhitespaces() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sallowWhitespaces%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAllowWhitespaces()))));
    }

    // add `forceUserToResetPasswordIfNotValid` to the URL query string
    if (getForceUserToResetPasswordIfNotValid() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sforceUserToResetPasswordIfNotValid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getForceUserToResetPasswordIfNotValid()))));
    }

    // add `passwordExpirationPeriodDays` to the URL query string
    if (getPasswordExpirationPeriodDays() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spasswordExpirationPeriodDays%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPasswordExpirationPeriodDays()))));
    }

    // add `passwordReuseFrequencyDays` to the URL query string
    if (getPasswordReuseFrequencyDays() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spasswordReuseFrequencyDays%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPasswordReuseFrequencyDays()))));
    }

    return joiner.toString();
  }
}

