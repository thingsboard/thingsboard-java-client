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
import org.thingsboard.client.model.TenantNameStrategyType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * OAuth2BasicMapperConfig
 */
@JsonPropertyOrder({
  OAuth2BasicMapperConfig.JSON_PROPERTY_EMAIL_ATTRIBUTE_KEY,
  OAuth2BasicMapperConfig.JSON_PROPERTY_FIRST_NAME_ATTRIBUTE_KEY,
  OAuth2BasicMapperConfig.JSON_PROPERTY_LAST_NAME_ATTRIBUTE_KEY,
  OAuth2BasicMapperConfig.JSON_PROPERTY_TENANT_NAME_STRATEGY,
  OAuth2BasicMapperConfig.JSON_PROPERTY_TENANT_NAME_PATTERN,
  OAuth2BasicMapperConfig.JSON_PROPERTY_CUSTOMER_NAME_PATTERN,
  OAuth2BasicMapperConfig.JSON_PROPERTY_DEFAULT_DASHBOARD_NAME,
  OAuth2BasicMapperConfig.JSON_PROPERTY_ALWAYS_FULL_SCREEN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:17:50.774971+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class OAuth2BasicMapperConfig {
  public static final String JSON_PROPERTY_EMAIL_ATTRIBUTE_KEY = "emailAttributeKey";
  @javax.annotation.Nullable
  private String emailAttributeKey;

  public static final String JSON_PROPERTY_FIRST_NAME_ATTRIBUTE_KEY = "firstNameAttributeKey";
  @javax.annotation.Nullable
  private String firstNameAttributeKey;

  public static final String JSON_PROPERTY_LAST_NAME_ATTRIBUTE_KEY = "lastNameAttributeKey";
  @javax.annotation.Nullable
  private String lastNameAttributeKey;

  public static final String JSON_PROPERTY_TENANT_NAME_STRATEGY = "tenantNameStrategy";
  @javax.annotation.Nonnull
  private TenantNameStrategyType tenantNameStrategy;

  public static final String JSON_PROPERTY_TENANT_NAME_PATTERN = "tenantNamePattern";
  @javax.annotation.Nullable
  private String tenantNamePattern;

  public static final String JSON_PROPERTY_CUSTOMER_NAME_PATTERN = "customerNamePattern";
  @javax.annotation.Nullable
  private String customerNamePattern;

  public static final String JSON_PROPERTY_DEFAULT_DASHBOARD_NAME = "defaultDashboardName";
  @javax.annotation.Nullable
  private String defaultDashboardName;

  public static final String JSON_PROPERTY_ALWAYS_FULL_SCREEN = "alwaysFullScreen";
  @javax.annotation.Nullable
  private Boolean alwaysFullScreen;

  public OAuth2BasicMapperConfig() { 
  }

  public OAuth2BasicMapperConfig emailAttributeKey(@javax.annotation.Nullable String emailAttributeKey) {
    this.emailAttributeKey = emailAttributeKey;
    return this;
  }

  /**
   * Email attribute key of OAuth2 principal attributes. Must be specified for BASIC mapper type and cannot be specified for GITHUB type
   * @return emailAttributeKey
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EMAIL_ATTRIBUTE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmailAttributeKey() {
    return emailAttributeKey;
  }


  @JsonProperty(value = JSON_PROPERTY_EMAIL_ATTRIBUTE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailAttributeKey(@javax.annotation.Nullable String emailAttributeKey) {
    this.emailAttributeKey = emailAttributeKey;
  }


  public OAuth2BasicMapperConfig firstNameAttributeKey(@javax.annotation.Nullable String firstNameAttributeKey) {
    this.firstNameAttributeKey = firstNameAttributeKey;
    return this;
  }

  /**
   * First name attribute key
   * @return firstNameAttributeKey
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_FIRST_NAME_ATTRIBUTE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFirstNameAttributeKey() {
    return firstNameAttributeKey;
  }


  @JsonProperty(value = JSON_PROPERTY_FIRST_NAME_ATTRIBUTE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstNameAttributeKey(@javax.annotation.Nullable String firstNameAttributeKey) {
    this.firstNameAttributeKey = firstNameAttributeKey;
  }


  public OAuth2BasicMapperConfig lastNameAttributeKey(@javax.annotation.Nullable String lastNameAttributeKey) {
    this.lastNameAttributeKey = lastNameAttributeKey;
    return this;
  }

  /**
   * Last name attribute key
   * @return lastNameAttributeKey
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_LAST_NAME_ATTRIBUTE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastNameAttributeKey() {
    return lastNameAttributeKey;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_NAME_ATTRIBUTE_KEY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastNameAttributeKey(@javax.annotation.Nullable String lastNameAttributeKey) {
    this.lastNameAttributeKey = lastNameAttributeKey;
  }


  public OAuth2BasicMapperConfig tenantNameStrategy(@javax.annotation.Nonnull TenantNameStrategyType tenantNameStrategy) {
    this.tenantNameStrategy = tenantNameStrategy;
    return this;
  }

  /**
   * Tenant naming strategy. For DOMAIN type, domain for tenant name will be taken from the email (substring before &#39;@&#39;)
   * @return tenantNameStrategy
   */
  @javax.annotation.Nonnull
  @JsonProperty(value = JSON_PROPERTY_TENANT_NAME_STRATEGY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TenantNameStrategyType getTenantNameStrategy() {
    return tenantNameStrategy;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_NAME_STRATEGY, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTenantNameStrategy(@javax.annotation.Nonnull TenantNameStrategyType tenantNameStrategy) {
    this.tenantNameStrategy = tenantNameStrategy;
  }


  public OAuth2BasicMapperConfig tenantNamePattern(@javax.annotation.Nullable String tenantNamePattern) {
    this.tenantNamePattern = tenantNamePattern;
    return this;
  }

  /**
   * Tenant name pattern for CUSTOM naming strategy. OAuth2 attributes in the pattern can be used by enclosing attribute key in &#39;%{&#39; and &#39;}&#39;
   * @return tenantNamePattern
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_NAME_PATTERN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTenantNamePattern() {
    return tenantNamePattern;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_NAME_PATTERN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantNamePattern(@javax.annotation.Nullable String tenantNamePattern) {
    this.tenantNamePattern = tenantNamePattern;
  }


  public OAuth2BasicMapperConfig customerNamePattern(@javax.annotation.Nullable String customerNamePattern) {
    this.customerNamePattern = customerNamePattern;
    return this;
  }

  /**
   * Customer name pattern. When creating a user on the first OAuth2 log in, if specified, customer name will be used to create or find existing customer in the platform and assign customerId to the user
   * @return customerNamePattern
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_NAME_PATTERN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomerNamePattern() {
    return customerNamePattern;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_NAME_PATTERN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerNamePattern(@javax.annotation.Nullable String customerNamePattern) {
    this.customerNamePattern = customerNamePattern;
  }


  public OAuth2BasicMapperConfig defaultDashboardName(@javax.annotation.Nullable String defaultDashboardName) {
    this.defaultDashboardName = defaultDashboardName;
    return this;
  }

  /**
   * Name of the tenant&#39;s dashboard to set as default dashboard for newly created user
   * @return defaultDashboardName
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT_DASHBOARD_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDefaultDashboardName() {
    return defaultDashboardName;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_DASHBOARD_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultDashboardName(@javax.annotation.Nullable String defaultDashboardName) {
    this.defaultDashboardName = defaultDashboardName;
  }


  public OAuth2BasicMapperConfig alwaysFullScreen(@javax.annotation.Nullable Boolean alwaysFullScreen) {
    this.alwaysFullScreen = alwaysFullScreen;
    return this;
  }

  /**
   * Whether default dashboard should be open in full screen
   * @return alwaysFullScreen
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ALWAYS_FULL_SCREEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAlwaysFullScreen() {
    return alwaysFullScreen;
  }


  @JsonProperty(value = JSON_PROPERTY_ALWAYS_FULL_SCREEN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlwaysFullScreen(@javax.annotation.Nullable Boolean alwaysFullScreen) {
    this.alwaysFullScreen = alwaysFullScreen;
  }


  /**
   * Return true if this OAuth2BasicMapperConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2BasicMapperConfig oauth2BasicMapperConfig = (OAuth2BasicMapperConfig) o;
    return Objects.equals(this.emailAttributeKey, oauth2BasicMapperConfig.emailAttributeKey) &&
        Objects.equals(this.firstNameAttributeKey, oauth2BasicMapperConfig.firstNameAttributeKey) &&
        Objects.equals(this.lastNameAttributeKey, oauth2BasicMapperConfig.lastNameAttributeKey) &&
        Objects.equals(this.tenantNameStrategy, oauth2BasicMapperConfig.tenantNameStrategy) &&
        Objects.equals(this.tenantNamePattern, oauth2BasicMapperConfig.tenantNamePattern) &&
        Objects.equals(this.customerNamePattern, oauth2BasicMapperConfig.customerNamePattern) &&
        Objects.equals(this.defaultDashboardName, oauth2BasicMapperConfig.defaultDashboardName) &&
        Objects.equals(this.alwaysFullScreen, oauth2BasicMapperConfig.alwaysFullScreen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAttributeKey, firstNameAttributeKey, lastNameAttributeKey, tenantNameStrategy, tenantNamePattern, customerNamePattern, defaultDashboardName, alwaysFullScreen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2BasicMapperConfig {\n");
    sb.append("    emailAttributeKey: ").append(toIndentedString(emailAttributeKey)).append("\n");
    sb.append("    firstNameAttributeKey: ").append(toIndentedString(firstNameAttributeKey)).append("\n");
    sb.append("    lastNameAttributeKey: ").append(toIndentedString(lastNameAttributeKey)).append("\n");
    sb.append("    tenantNameStrategy: ").append(toIndentedString(tenantNameStrategy)).append("\n");
    sb.append("    tenantNamePattern: ").append(toIndentedString(tenantNamePattern)).append("\n");
    sb.append("    customerNamePattern: ").append(toIndentedString(customerNamePattern)).append("\n");
    sb.append("    defaultDashboardName: ").append(toIndentedString(defaultDashboardName)).append("\n");
    sb.append("    alwaysFullScreen: ").append(toIndentedString(alwaysFullScreen)).append("\n");
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

    // add `emailAttributeKey` to the URL query string
    if (getEmailAttributeKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%semailAttributeKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEmailAttributeKey()))));
    }

    // add `firstNameAttributeKey` to the URL query string
    if (getFirstNameAttributeKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sfirstNameAttributeKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFirstNameAttributeKey()))));
    }

    // add `lastNameAttributeKey` to the URL query string
    if (getLastNameAttributeKey() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slastNameAttributeKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastNameAttributeKey()))));
    }

    // add `tenantNameStrategy` to the URL query string
    if (getTenantNameStrategy() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stenantNameStrategy%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTenantNameStrategy()))));
    }

    // add `tenantNamePattern` to the URL query string
    if (getTenantNamePattern() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stenantNamePattern%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTenantNamePattern()))));
    }

    // add `customerNamePattern` to the URL query string
    if (getCustomerNamePattern() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomerNamePattern%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerNamePattern()))));
    }

    // add `defaultDashboardName` to the URL query string
    if (getDefaultDashboardName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdefaultDashboardName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDefaultDashboardName()))));
    }

    // add `alwaysFullScreen` to the URL query string
    if (getAlwaysFullScreen() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%salwaysFullScreen%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAlwaysFullScreen()))));
    }

    return joiner.toString();
  }
}

