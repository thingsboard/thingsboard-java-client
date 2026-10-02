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
import javax.annotation.Nonnull;
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
import org.openapitools.jackson.nullable.JsonNullable;
import org.thingsboard.client.model.TwoFaProviderConfig;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * Settings value
 */
@JsonPropertyOrder({
  PlatformTwoFaSettings.JSON_PROPERTY_USE_SYSTEM_TWO_FACTOR_AUTH_SETTINGS,
  PlatformTwoFaSettings.JSON_PROPERTY_PROVIDERS,
  PlatformTwoFaSettings.JSON_PROPERTY_MIN_VERIFICATION_CODE_SEND_PERIOD,
  PlatformTwoFaSettings.JSON_PROPERTY_VERIFICATION_CODE_CHECK_RATE_LIMIT,
  PlatformTwoFaSettings.JSON_PROPERTY_MAX_VERIFICATION_FAILURES_BEFORE_USER_LOCKOUT,
  PlatformTwoFaSettings.JSON_PROPERTY_TOTAL_ALLOWED_TIME_FOR_VERIFICATION,
  PlatformTwoFaSettings.JSON_PROPERTY_ENFORCE_TWO_FA,
  PlatformTwoFaSettings.JSON_PROPERTY_ENFORCED_USERS_FILTER
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class PlatformTwoFaSettings {
  public static final String JSON_PROPERTY_USE_SYSTEM_TWO_FACTOR_AUTH_SETTINGS = "useSystemTwoFactorAuthSettings";
  @Nullable
  private Boolean useSystemTwoFactorAuthSettings;

  public static final String JSON_PROPERTY_PROVIDERS = "providers";
  @Nonnull
  private List<TwoFaProviderConfig> providers = new ArrayList<>();

  public static final String JSON_PROPERTY_MIN_VERIFICATION_CODE_SEND_PERIOD = "minVerificationCodeSendPeriod";
  @Nonnull
  private Integer minVerificationCodeSendPeriod;

  public static final String JSON_PROPERTY_VERIFICATION_CODE_CHECK_RATE_LIMIT = "verificationCodeCheckRateLimit";
  @Nullable
  private String verificationCodeCheckRateLimit;

  public static final String JSON_PROPERTY_MAX_VERIFICATION_FAILURES_BEFORE_USER_LOCKOUT = "maxVerificationFailuresBeforeUserLockout";
  @Nullable
  private Integer maxVerificationFailuresBeforeUserLockout;

  public static final String JSON_PROPERTY_TOTAL_ALLOWED_TIME_FOR_VERIFICATION = "totalAllowedTimeForVerification";
  @Nonnull
  private Integer totalAllowedTimeForVerification;

  public static final String JSON_PROPERTY_ENFORCE_TWO_FA = "enforceTwoFa";
  @Nullable
  private Boolean enforceTwoFa;

  public static final String JSON_PROPERTY_ENFORCED_USERS_FILTER = "enforcedUsersFilter";
  private JsonNullable<Object> enforcedUsersFilter = JsonNullable.<Object>of(null);

  public PlatformTwoFaSettings() { 
  }

  public PlatformTwoFaSettings useSystemTwoFactorAuthSettings(@Nullable Boolean useSystemTwoFactorAuthSettings) {
    this.useSystemTwoFactorAuthSettings = useSystemTwoFactorAuthSettings;
    return this;
  }

  /**
   * Get useSystemTwoFactorAuthSettings
   * @return useSystemTwoFactorAuthSettings
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_USE_SYSTEM_TWO_FACTOR_AUTH_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUseSystemTwoFactorAuthSettings() {
    return useSystemTwoFactorAuthSettings;
  }


  @JsonProperty(value = JSON_PROPERTY_USE_SYSTEM_TWO_FACTOR_AUTH_SETTINGS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseSystemTwoFactorAuthSettings(@Nullable Boolean useSystemTwoFactorAuthSettings) {
    this.useSystemTwoFactorAuthSettings = useSystemTwoFactorAuthSettings;
  }


  public PlatformTwoFaSettings providers(@Nonnull List<TwoFaProviderConfig> providers) {
    this.providers = providers;
    return this;
  }

  public PlatformTwoFaSettings addProvidersItem(TwoFaProviderConfig providersItem) {
    if (this.providers == null) {
      this.providers = new ArrayList<>();
    }
    this.providers.add(providersItem);
    return this;
  }

  /**
   * Get providers
   * @return providers
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_PROVIDERS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TwoFaProviderConfig> getProviders() {
    return providers;
  }


  @JsonProperty(value = JSON_PROPERTY_PROVIDERS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProviders(@Nonnull List<TwoFaProviderConfig> providers) {
    this.providers = providers;
  }


  public PlatformTwoFaSettings minVerificationCodeSendPeriod(@Nonnull Integer minVerificationCodeSendPeriod) {
    this.minVerificationCodeSendPeriod = minVerificationCodeSendPeriod;
    return this;
  }

  /**
   * Get minVerificationCodeSendPeriod
   * minimum: 5
   * @return minVerificationCodeSendPeriod
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_MIN_VERIFICATION_CODE_SEND_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getMinVerificationCodeSendPeriod() {
    return minVerificationCodeSendPeriod;
  }


  @JsonProperty(value = JSON_PROPERTY_MIN_VERIFICATION_CODE_SEND_PERIOD, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMinVerificationCodeSendPeriod(@Nonnull Integer minVerificationCodeSendPeriod) {
    this.minVerificationCodeSendPeriod = minVerificationCodeSendPeriod;
  }


  public PlatformTwoFaSettings verificationCodeCheckRateLimit(@Nullable String verificationCodeCheckRateLimit) {
    this.verificationCodeCheckRateLimit = verificationCodeCheckRateLimit;
    return this;
  }

  /**
   * Get verificationCodeCheckRateLimit
   * @return verificationCodeCheckRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_VERIFICATION_CODE_CHECK_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVerificationCodeCheckRateLimit() {
    return verificationCodeCheckRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_VERIFICATION_CODE_CHECK_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerificationCodeCheckRateLimit(@Nullable String verificationCodeCheckRateLimit) {
    this.verificationCodeCheckRateLimit = verificationCodeCheckRateLimit;
  }


  public PlatformTwoFaSettings maxVerificationFailuresBeforeUserLockout(@Nullable Integer maxVerificationFailuresBeforeUserLockout) {
    this.maxVerificationFailuresBeforeUserLockout = maxVerificationFailuresBeforeUserLockout;
    return this;
  }

  /**
   * Get maxVerificationFailuresBeforeUserLockout
   * minimum: 0
   * @return maxVerificationFailuresBeforeUserLockout
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_VERIFICATION_FAILURES_BEFORE_USER_LOCKOUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMaxVerificationFailuresBeforeUserLockout() {
    return maxVerificationFailuresBeforeUserLockout;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_VERIFICATION_FAILURES_BEFORE_USER_LOCKOUT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxVerificationFailuresBeforeUserLockout(@Nullable Integer maxVerificationFailuresBeforeUserLockout) {
    this.maxVerificationFailuresBeforeUserLockout = maxVerificationFailuresBeforeUserLockout;
  }


  public PlatformTwoFaSettings totalAllowedTimeForVerification(@Nonnull Integer totalAllowedTimeForVerification) {
    this.totalAllowedTimeForVerification = totalAllowedTimeForVerification;
    return this;
  }

  /**
   * Get totalAllowedTimeForVerification
   * minimum: 60
   * @return totalAllowedTimeForVerification
   */
  @Nonnull
  @JsonProperty(value = JSON_PROPERTY_TOTAL_ALLOWED_TIME_FOR_VERIFICATION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getTotalAllowedTimeForVerification() {
    return totalAllowedTimeForVerification;
  }


  @JsonProperty(value = JSON_PROPERTY_TOTAL_ALLOWED_TIME_FOR_VERIFICATION, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalAllowedTimeForVerification(@Nonnull Integer totalAllowedTimeForVerification) {
    this.totalAllowedTimeForVerification = totalAllowedTimeForVerification;
  }


  public PlatformTwoFaSettings enforceTwoFa(@Nullable Boolean enforceTwoFa) {
    this.enforceTwoFa = enforceTwoFa;
    return this;
  }

  /**
   * Get enforceTwoFa
   * @return enforceTwoFa
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ENFORCE_TWO_FA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnforceTwoFa() {
    return enforceTwoFa;
  }


  @JsonProperty(value = JSON_PROPERTY_ENFORCE_TWO_FA, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnforceTwoFa(@Nullable Boolean enforceTwoFa) {
    this.enforceTwoFa = enforceTwoFa;
  }


  public PlatformTwoFaSettings enforcedUsersFilter(@Nullable Object enforcedUsersFilter) {
    this.enforcedUsersFilter = JsonNullable.<Object>of(enforcedUsersFilter);
    return this;
  }

  /**
   * Get enforcedUsersFilter
   * @return enforcedUsersFilter
   */
  @Nullable
  @JsonIgnore
  public Object getEnforcedUsersFilter() {
        return enforcedUsersFilter.orElse(null);
  }

  @JsonProperty(value = JSON_PROPERTY_ENFORCED_USERS_FILTER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getEnforcedUsersFilter_JsonNullable() {
    return enforcedUsersFilter;
  }
  
  @JsonProperty(JSON_PROPERTY_ENFORCED_USERS_FILTER)
  public void setEnforcedUsersFilter_JsonNullable(JsonNullable<Object> enforcedUsersFilter) {
    this.enforcedUsersFilter = enforcedUsersFilter;
  }

  public void setEnforcedUsersFilter(@Nullable Object enforcedUsersFilter) {
    this.enforcedUsersFilter = JsonNullable.<Object>of(enforcedUsersFilter);
  }


  /**
   * Return true if this PlatformTwoFaSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatformTwoFaSettings platformTwoFaSettings = (PlatformTwoFaSettings) o;
    return Objects.equals(this.useSystemTwoFactorAuthSettings, platformTwoFaSettings.useSystemTwoFactorAuthSettings) &&
        Objects.equals(this.providers, platformTwoFaSettings.providers) &&
        Objects.equals(this.minVerificationCodeSendPeriod, platformTwoFaSettings.minVerificationCodeSendPeriod) &&
        Objects.equals(this.verificationCodeCheckRateLimit, platformTwoFaSettings.verificationCodeCheckRateLimit) &&
        Objects.equals(this.maxVerificationFailuresBeforeUserLockout, platformTwoFaSettings.maxVerificationFailuresBeforeUserLockout) &&
        Objects.equals(this.totalAllowedTimeForVerification, platformTwoFaSettings.totalAllowedTimeForVerification) &&
        Objects.equals(this.enforceTwoFa, platformTwoFaSettings.enforceTwoFa) &&
        equalsNullable(this.enforcedUsersFilter, platformTwoFaSettings.enforcedUsersFilter);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(useSystemTwoFactorAuthSettings, providers, minVerificationCodeSendPeriod, verificationCodeCheckRateLimit, maxVerificationFailuresBeforeUserLockout, totalAllowedTimeForVerification, enforceTwoFa, hashCodeNullable(enforcedUsersFilter));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformTwoFaSettings {\n");
    sb.append("    useSystemTwoFactorAuthSettings: ").append(toIndentedString(useSystemTwoFactorAuthSettings)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    minVerificationCodeSendPeriod: ").append(toIndentedString(minVerificationCodeSendPeriod)).append("\n");
    sb.append("    verificationCodeCheckRateLimit: ").append(toIndentedString(verificationCodeCheckRateLimit)).append("\n");
    sb.append("    maxVerificationFailuresBeforeUserLockout: ").append(toIndentedString(maxVerificationFailuresBeforeUserLockout)).append("\n");
    sb.append("    totalAllowedTimeForVerification: ").append(toIndentedString(totalAllowedTimeForVerification)).append("\n");
    sb.append("    enforceTwoFa: ").append(toIndentedString(enforceTwoFa)).append("\n");
    sb.append("    enforcedUsersFilter: ").append(toIndentedString(enforcedUsersFilter)).append("\n");
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

    // add `useSystemTwoFactorAuthSettings` to the URL query string
    if (getUseSystemTwoFactorAuthSettings() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%suseSystemTwoFactorAuthSettings%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUseSystemTwoFactorAuthSettings()))));
    }

    // add `providers` to the URL query string
    if (getProviders() != null) {
      for (int i = 0; i < getProviders().size(); i++) {
        if (getProviders().get(i) != null) {
          joiner.add(getProviders().get(i).toUrlQueryString(String.format(java.util.Locale.ROOT, "%sproviders%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format(java.util.Locale.ROOT, "%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `minVerificationCodeSendPeriod` to the URL query string
    if (getMinVerificationCodeSendPeriod() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sminVerificationCodeSendPeriod%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinVerificationCodeSendPeriod()))));
    }

    // add `verificationCodeCheckRateLimit` to the URL query string
    if (getVerificationCodeCheckRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sverificationCodeCheckRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getVerificationCodeCheckRateLimit()))));
    }

    // add `maxVerificationFailuresBeforeUserLockout` to the URL query string
    if (getMaxVerificationFailuresBeforeUserLockout() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxVerificationFailuresBeforeUserLockout%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxVerificationFailuresBeforeUserLockout()))));
    }

    // add `totalAllowedTimeForVerification` to the URL query string
    if (getTotalAllowedTimeForVerification() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stotalAllowedTimeForVerification%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTotalAllowedTimeForVerification()))));
    }

    // add `enforceTwoFa` to the URL query string
    if (getEnforceTwoFa() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%senforceTwoFa%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEnforceTwoFa()))));
    }

    // add `enforcedUsersFilter` to the URL query string
    if (getEnforcedUsersFilter() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%senforcedUsersFilter%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEnforcedUsersFilter()))));
    }

    return joiner.toString();
  }
}

