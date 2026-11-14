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
import java.util.Arrays;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * SubscriptionRenewalReminder
 */
@JsonPropertyOrder({
  SubscriptionRenewalReminder.JSON_PROPERTY_TENANT_ID,
  SubscriptionRenewalReminder.JSON_PROPERTY_EMAIL,
  SubscriptionRenewalReminder.JSON_PROPERTY_RENEWAL_TS,
  SubscriptionRenewalReminder.JSON_PROPERTY_PLAN_NAME,
  SubscriptionRenewalReminder.JSON_PROPERTY_PAID_PLAN,
  SubscriptionRenewalReminder.JSON_PROPERTY_AMOUNT_DUE,
  SubscriptionRenewalReminder.JSON_PROPERTY_CURRENCY
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class SubscriptionRenewalReminder {
  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_EMAIL = "email";
  @Nullable
  private String email;

  public static final String JSON_PROPERTY_RENEWAL_TS = "renewalTs";
  @Nullable
  private Long renewalTs;

  public static final String JSON_PROPERTY_PLAN_NAME = "planName";
  @Nullable
  private String planName;

  public static final String JSON_PROPERTY_PAID_PLAN = "paidPlan";
  @Nullable
  private Boolean paidPlan;

  public static final String JSON_PROPERTY_AMOUNT_DUE = "amountDue";
  @Nullable
  private Long amountDue;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @Nullable
  private String currency;

  public SubscriptionRenewalReminder() { 
  }

  public SubscriptionRenewalReminder tenantId(@Nullable TenantId tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TenantId getTenantId() {
    return tenantId;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(@Nullable TenantId tenantId) {
    this.tenantId = tenantId;
  }


  public SubscriptionRenewalReminder email(@Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmail() {
    return email;
  }


  @JsonProperty(value = JSON_PROPERTY_EMAIL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(@Nullable String email) {
    this.email = email;
  }


  public SubscriptionRenewalReminder renewalTs(@Nullable Long renewalTs) {
    this.renewalTs = renewalTs;
    return this;
  }

  /**
   * Get renewalTs
   * @return renewalTs
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RENEWAL_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRenewalTs() {
    return renewalTs;
  }


  @JsonProperty(value = JSON_PROPERTY_RENEWAL_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRenewalTs(@Nullable Long renewalTs) {
    this.renewalTs = renewalTs;
  }


  public SubscriptionRenewalReminder planName(@Nullable String planName) {
    this.planName = planName;
    return this;
  }

  /**
   * Get planName
   * @return planName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PLAN_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPlanName() {
    return planName;
  }


  @JsonProperty(value = JSON_PROPERTY_PLAN_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanName(@Nullable String planName) {
    this.planName = planName;
  }


  public SubscriptionRenewalReminder paidPlan(@Nullable Boolean paidPlan) {
    this.paidPlan = paidPlan;
    return this;
  }

  /**
   * Get paidPlan
   * @return paidPlan
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PAID_PLAN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPaidPlan() {
    return paidPlan;
  }


  @JsonProperty(value = JSON_PROPERTY_PAID_PLAN, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaidPlan(@Nullable Boolean paidPlan) {
    this.paidPlan = paidPlan;
  }


  public SubscriptionRenewalReminder amountDue(@Nullable Long amountDue) {
    this.amountDue = amountDue;
    return this;
  }

  /**
   * Get amountDue
   * @return amountDue
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_AMOUNT_DUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAmountDue() {
    return amountDue;
  }


  @JsonProperty(value = JSON_PROPERTY_AMOUNT_DUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountDue(@Nullable Long amountDue) {
    this.amountDue = amountDue;
  }


  public SubscriptionRenewalReminder currency(@Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENCY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCurrency() {
    return currency;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENCY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(@Nullable String currency) {
    this.currency = currency;
  }


  /**
   * Return true if this SubscriptionRenewalReminder object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionRenewalReminder subscriptionRenewalReminder = (SubscriptionRenewalReminder) o;
    return Objects.equals(this.tenantId, subscriptionRenewalReminder.tenantId) &&
        Objects.equals(this.email, subscriptionRenewalReminder.email) &&
        Objects.equals(this.renewalTs, subscriptionRenewalReminder.renewalTs) &&
        Objects.equals(this.planName, subscriptionRenewalReminder.planName) &&
        Objects.equals(this.paidPlan, subscriptionRenewalReminder.paidPlan) &&
        Objects.equals(this.amountDue, subscriptionRenewalReminder.amountDue) &&
        Objects.equals(this.currency, subscriptionRenewalReminder.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, email, renewalTs, planName, paidPlan, amountDue, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionRenewalReminder {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    renewalTs: ").append(toIndentedString(renewalTs)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    paidPlan: ").append(toIndentedString(paidPlan)).append("\n");
    sb.append("    amountDue: ").append(toIndentedString(amountDue)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%semail%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEmail()))));
    }

    // add `renewalTs` to the URL query string
    if (getRenewalTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srenewalTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRenewalTs()))));
    }

    // add `planName` to the URL query string
    if (getPlanName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splanName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlanName()))));
    }

    // add `paidPlan` to the URL query string
    if (getPaidPlan() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%spaidPlan%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPaidPlan()))));
    }

    // add `amountDue` to the URL query string
    if (getAmountDue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%samountDue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAmountDue()))));
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrency%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrency()))));
    }

    return joiner.toString();
  }
}

