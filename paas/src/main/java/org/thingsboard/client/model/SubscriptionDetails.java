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
import org.thingsboard.client.model.BillingCustomerId;
import org.thingsboard.client.model.CouponId;
import org.thingsboard.client.model.Discount;
import org.thingsboard.client.model.SubscriptionId;
import org.thingsboard.client.model.SubscriptionItems;
import org.thingsboard.client.model.SubscriptionPlanId;
import org.thingsboard.client.model.TenantId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * SubscriptionDetails
 */
@JsonPropertyOrder({
  SubscriptionDetails.JSON_PROPERTY_ID,
  SubscriptionDetails.JSON_PROPERTY_CREATED_TIME,
  SubscriptionDetails.JSON_PROPERTY_ADDITIONAL_INFO,
  SubscriptionDetails.JSON_PROPERTY_EXTERNAL_ID,
  SubscriptionDetails.JSON_PROPERTY_TENANT_ID,
  SubscriptionDetails.JSON_PROPERTY_BILLING_CUSTOMER_ID,
  SubscriptionDetails.JSON_PROPERTY_SUBSCRIPTION_PLAN_ID,
  SubscriptionDetails.JSON_PROPERTY_CURRENT_PERIOD_START_TS,
  SubscriptionDetails.JSON_PROPERTY_CURRENT_PERIOD_END_TS,
  SubscriptionDetails.JSON_PROPERTY_ACTIVE,
  SubscriptionDetails.JSON_PROPERTY_TRIAL,
  SubscriptionDetails.JSON_PROPERTY_TRIAL_END_TS,
  SubscriptionDetails.JSON_PROPERTY_STATUS,
  SubscriptionDetails.JSON_PROPERTY_LAST_PAID,
  SubscriptionDetails.JSON_PROPERTY_UPCOMING_INVOICE_DATE,
  SubscriptionDetails.JSON_PROPERTY_UPCOMING_INVOICE_AMOUNT_DUE,
  SubscriptionDetails.JSON_PROPERTY_COUPON_ID,
  SubscriptionDetails.JSON_PROPERTY_DISCOUNT_END_DATE,
  SubscriptionDetails.JSON_PROPERTY_SUBSCRIPTION_PLAN_NAME,
  SubscriptionDetails.JSON_PROPERTY_PLAN_HAS_ADDONS,
  SubscriptionDetails.JSON_PROPERTY_PLAN_UI_TYPE,
  SubscriptionDetails.JSON_PROPERTY_PLAN_IS_FREE,
  SubscriptionDetails.JSON_PROPERTY_PLAN_IS_ACTIVE,
  SubscriptionDetails.JSON_PROPERTY_EDGE_COUNT_INCLUDED,
  SubscriptionDetails.JSON_PROPERTY_ITEMS,
  SubscriptionDetails.JSON_PROPERTY_DISCOUNT,
  SubscriptionDetails.JSON_PROPERTY_NAME
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class SubscriptionDetails {
  public static final String JSON_PROPERTY_ID = "id";
  @Nullable
  private SubscriptionId id;

  public static final String JSON_PROPERTY_CREATED_TIME = "createdTime";
  @Nullable
  private Long createdTime;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  @Nullable
  private com.fasterxml.jackson.databind.JsonNode additionalInfo = null;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  @Nullable
  private String externalId;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  @Nullable
  private TenantId tenantId;

  public static final String JSON_PROPERTY_BILLING_CUSTOMER_ID = "billingCustomerId";
  @Nullable
  private BillingCustomerId billingCustomerId;

  public static final String JSON_PROPERTY_SUBSCRIPTION_PLAN_ID = "subscriptionPlanId";
  @Nullable
  private SubscriptionPlanId subscriptionPlanId;

  public static final String JSON_PROPERTY_CURRENT_PERIOD_START_TS = "currentPeriodStartTs";
  @Nullable
  private Long currentPeriodStartTs;

  public static final String JSON_PROPERTY_CURRENT_PERIOD_END_TS = "currentPeriodEndTs";
  @Nullable
  private Long currentPeriodEndTs;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  @Nullable
  private Boolean active;

  public static final String JSON_PROPERTY_TRIAL = "trial";
  @Nullable
  private Boolean trial;

  public static final String JSON_PROPERTY_TRIAL_END_TS = "trialEndTs";
  @Nullable
  private Long trialEndTs;

  public static final String JSON_PROPERTY_STATUS = "status";
  @Nullable
  private String status;

  public static final String JSON_PROPERTY_LAST_PAID = "lastPaid";
  @Nullable
  private Boolean lastPaid;

  public static final String JSON_PROPERTY_UPCOMING_INVOICE_DATE = "upcomingInvoiceDate";
  @Nullable
  private Long upcomingInvoiceDate;

  public static final String JSON_PROPERTY_UPCOMING_INVOICE_AMOUNT_DUE = "upcomingInvoiceAmountDue";
  @Nullable
  private Long upcomingInvoiceAmountDue;

  public static final String JSON_PROPERTY_COUPON_ID = "couponId";
  @Nullable
  private CouponId couponId;

  public static final String JSON_PROPERTY_DISCOUNT_END_DATE = "discountEndDate";
  @Nullable
  private Long discountEndDate;

  public static final String JSON_PROPERTY_SUBSCRIPTION_PLAN_NAME = "subscriptionPlanName";
  @Nullable
  private String subscriptionPlanName;

  public static final String JSON_PROPERTY_PLAN_HAS_ADDONS = "planHasAddons";
  @Nullable
  private Boolean planHasAddons;

  public static final String JSON_PROPERTY_PLAN_UI_TYPE = "planUiType";
  @Nullable
  private String planUiType;

  public static final String JSON_PROPERTY_PLAN_IS_FREE = "planIsFree";
  @Nullable
  private Boolean planIsFree;

  public static final String JSON_PROPERTY_PLAN_IS_ACTIVE = "planIsActive";
  @Nullable
  private Boolean planIsActive;

  public static final String JSON_PROPERTY_EDGE_COUNT_INCLUDED = "edgeCountIncluded";
  @Nullable
  private Long edgeCountIncluded;

  public static final String JSON_PROPERTY_ITEMS = "items";
  @Nullable
  private SubscriptionItems items;

  public static final String JSON_PROPERTY_DISCOUNT = "discount";
  @Nullable
  private Discount discount;

  public static final String JSON_PROPERTY_NAME = "name";
  @Nullable
  private String name;

  public SubscriptionDetails() { 
  }

  @JsonCreator
  public SubscriptionDetails(
    @JsonProperty(JSON_PROPERTY_CREATED_TIME) Long createdTime, 
    @JsonProperty(JSON_PROPERTY_NAME) String name
  ) {
  this();
    this.createdTime = createdTime;
    this.name = name;
  }

  public SubscriptionDetails id(@Nullable SubscriptionId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SubscriptionId getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@Nullable SubscriptionId id) {
    this.id = id;
  }


  /**
   * Entity creation timestamp in milliseconds since Unix epoch
   * @return createdTime
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CREATED_TIME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedTime() {
    return createdTime;
  }




  public SubscriptionDetails additionalInfo(@Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public com.fasterxml.jackson.databind.JsonNode getAdditionalInfo() {
    return additionalInfo;
  }


  @JsonProperty(value = JSON_PROPERTY_ADDITIONAL_INFO, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalInfo(@Nullable com.fasterxml.jackson.databind.JsonNode additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public SubscriptionDetails externalId(@Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalId(@Nullable String externalId) {
    this.externalId = externalId;
  }


  public SubscriptionDetails tenantId(@Nullable TenantId tenantId) {
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


  public SubscriptionDetails billingCustomerId(@Nullable BillingCustomerId billingCustomerId) {
    this.billingCustomerId = billingCustomerId;
    return this;
  }

  /**
   * Get billingCustomerId
   * @return billingCustomerId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BILLING_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BillingCustomerId getBillingCustomerId() {
    return billingCustomerId;
  }


  @JsonProperty(value = JSON_PROPERTY_BILLING_CUSTOMER_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingCustomerId(@Nullable BillingCustomerId billingCustomerId) {
    this.billingCustomerId = billingCustomerId;
  }


  public SubscriptionDetails subscriptionPlanId(@Nullable SubscriptionPlanId subscriptionPlanId) {
    this.subscriptionPlanId = subscriptionPlanId;
    return this;
  }

  /**
   * Get subscriptionPlanId
   * @return subscriptionPlanId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SUBSCRIPTION_PLAN_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SubscriptionPlanId getSubscriptionPlanId() {
    return subscriptionPlanId;
  }


  @JsonProperty(value = JSON_PROPERTY_SUBSCRIPTION_PLAN_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionPlanId(@Nullable SubscriptionPlanId subscriptionPlanId) {
    this.subscriptionPlanId = subscriptionPlanId;
  }


  public SubscriptionDetails currentPeriodStartTs(@Nullable Long currentPeriodStartTs) {
    this.currentPeriodStartTs = currentPeriodStartTs;
    return this;
  }

  /**
   * Get currentPeriodStartTs
   * @return currentPeriodStartTs
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_PERIOD_START_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCurrentPeriodStartTs() {
    return currentPeriodStartTs;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_PERIOD_START_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentPeriodStartTs(@Nullable Long currentPeriodStartTs) {
    this.currentPeriodStartTs = currentPeriodStartTs;
  }


  public SubscriptionDetails currentPeriodEndTs(@Nullable Long currentPeriodEndTs) {
    this.currentPeriodEndTs = currentPeriodEndTs;
    return this;
  }

  /**
   * Get currentPeriodEndTs
   * @return currentPeriodEndTs
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CURRENT_PERIOD_END_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCurrentPeriodEndTs() {
    return currentPeriodEndTs;
  }


  @JsonProperty(value = JSON_PROPERTY_CURRENT_PERIOD_END_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentPeriodEndTs(@Nullable Long currentPeriodEndTs) {
    this.currentPeriodEndTs = currentPeriodEndTs;
  }


  public SubscriptionDetails active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ACTIVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getActive() {
    return active;
  }


  @JsonProperty(value = JSON_PROPERTY_ACTIVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }


  public SubscriptionDetails trial(@Nullable Boolean trial) {
    this.trial = trial;
    return this;
  }

  /**
   * Get trial
   * @return trial
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TRIAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTrial() {
    return trial;
  }


  @JsonProperty(value = JSON_PROPERTY_TRIAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrial(@Nullable Boolean trial) {
    this.trial = trial;
  }


  public SubscriptionDetails trialEndTs(@Nullable Long trialEndTs) {
    this.trialEndTs = trialEndTs;
    return this;
  }

  /**
   * Get trialEndTs
   * @return trialEndTs
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TRIAL_END_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTrialEndTs() {
    return trialEndTs;
  }


  @JsonProperty(value = JSON_PROPERTY_TRIAL_END_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrialEndTs(@Nullable Long trialEndTs) {
    this.trialEndTs = trialEndTs;
  }


  public SubscriptionDetails status(@Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }


  @JsonProperty(value = JSON_PROPERTY_STATUS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@Nullable String status) {
    this.status = status;
  }


  public SubscriptionDetails lastPaid(@Nullable Boolean lastPaid) {
    this.lastPaid = lastPaid;
    return this;
  }

  /**
   * Get lastPaid
   * @return lastPaid
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LAST_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getLastPaid() {
    return lastPaid;
  }


  @JsonProperty(value = JSON_PROPERTY_LAST_PAID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastPaid(@Nullable Boolean lastPaid) {
    this.lastPaid = lastPaid;
  }


  public SubscriptionDetails upcomingInvoiceDate(@Nullable Long upcomingInvoiceDate) {
    this.upcomingInvoiceDate = upcomingInvoiceDate;
    return this;
  }

  /**
   * Get upcomingInvoiceDate
   * @return upcomingInvoiceDate
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_UPCOMING_INVOICE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUpcomingInvoiceDate() {
    return upcomingInvoiceDate;
  }


  @JsonProperty(value = JSON_PROPERTY_UPCOMING_INVOICE_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpcomingInvoiceDate(@Nullable Long upcomingInvoiceDate) {
    this.upcomingInvoiceDate = upcomingInvoiceDate;
  }


  public SubscriptionDetails upcomingInvoiceAmountDue(@Nullable Long upcomingInvoiceAmountDue) {
    this.upcomingInvoiceAmountDue = upcomingInvoiceAmountDue;
    return this;
  }

  /**
   * Get upcomingInvoiceAmountDue
   * @return upcomingInvoiceAmountDue
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_UPCOMING_INVOICE_AMOUNT_DUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUpcomingInvoiceAmountDue() {
    return upcomingInvoiceAmountDue;
  }


  @JsonProperty(value = JSON_PROPERTY_UPCOMING_INVOICE_AMOUNT_DUE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpcomingInvoiceAmountDue(@Nullable Long upcomingInvoiceAmountDue) {
    this.upcomingInvoiceAmountDue = upcomingInvoiceAmountDue;
  }


  public SubscriptionDetails couponId(@Nullable CouponId couponId) {
    this.couponId = couponId;
    return this;
  }

  /**
   * Get couponId
   * @return couponId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_COUPON_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CouponId getCouponId() {
    return couponId;
  }


  @JsonProperty(value = JSON_PROPERTY_COUPON_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCouponId(@Nullable CouponId couponId) {
    this.couponId = couponId;
  }


  public SubscriptionDetails discountEndDate(@Nullable Long discountEndDate) {
    this.discountEndDate = discountEndDate;
    return this;
  }

  /**
   * Get discountEndDate
   * @return discountEndDate
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DISCOUNT_END_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDiscountEndDate() {
    return discountEndDate;
  }


  @JsonProperty(value = JSON_PROPERTY_DISCOUNT_END_DATE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscountEndDate(@Nullable Long discountEndDate) {
    this.discountEndDate = discountEndDate;
  }


  public SubscriptionDetails subscriptionPlanName(@Nullable String subscriptionPlanName) {
    this.subscriptionPlanName = subscriptionPlanName;
    return this;
  }

  /**
   * Get subscriptionPlanName
   * @return subscriptionPlanName
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SUBSCRIPTION_PLAN_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubscriptionPlanName() {
    return subscriptionPlanName;
  }


  @JsonProperty(value = JSON_PROPERTY_SUBSCRIPTION_PLAN_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionPlanName(@Nullable String subscriptionPlanName) {
    this.subscriptionPlanName = subscriptionPlanName;
  }


  public SubscriptionDetails planHasAddons(@Nullable Boolean planHasAddons) {
    this.planHasAddons = planHasAddons;
    return this;
  }

  /**
   * Get planHasAddons
   * @return planHasAddons
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PLAN_HAS_ADDONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPlanHasAddons() {
    return planHasAddons;
  }


  @JsonProperty(value = JSON_PROPERTY_PLAN_HAS_ADDONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanHasAddons(@Nullable Boolean planHasAddons) {
    this.planHasAddons = planHasAddons;
  }


  public SubscriptionDetails planUiType(@Nullable String planUiType) {
    this.planUiType = planUiType;
    return this;
  }

  /**
   * Get planUiType
   * @return planUiType
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PLAN_UI_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPlanUiType() {
    return planUiType;
  }


  @JsonProperty(value = JSON_PROPERTY_PLAN_UI_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanUiType(@Nullable String planUiType) {
    this.planUiType = planUiType;
  }


  public SubscriptionDetails planIsFree(@Nullable Boolean planIsFree) {
    this.planIsFree = planIsFree;
    return this;
  }

  /**
   * Get planIsFree
   * @return planIsFree
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PLAN_IS_FREE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPlanIsFree() {
    return planIsFree;
  }


  @JsonProperty(value = JSON_PROPERTY_PLAN_IS_FREE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanIsFree(@Nullable Boolean planIsFree) {
    this.planIsFree = planIsFree;
  }


  public SubscriptionDetails planIsActive(@Nullable Boolean planIsActive) {
    this.planIsActive = planIsActive;
    return this;
  }

  /**
   * Get planIsActive
   * @return planIsActive
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PLAN_IS_ACTIVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPlanIsActive() {
    return planIsActive;
  }


  @JsonProperty(value = JSON_PROPERTY_PLAN_IS_ACTIVE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanIsActive(@Nullable Boolean planIsActive) {
    this.planIsActive = planIsActive;
  }


  public SubscriptionDetails edgeCountIncluded(@Nullable Long edgeCountIncluded) {
    this.edgeCountIncluded = edgeCountIncluded;
    return this;
  }

  /**
   * Get edgeCountIncluded
   * @return edgeCountIncluded
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EDGE_COUNT_INCLUDED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEdgeCountIncluded() {
    return edgeCountIncluded;
  }


  @JsonProperty(value = JSON_PROPERTY_EDGE_COUNT_INCLUDED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdgeCountIncluded(@Nullable Long edgeCountIncluded) {
    this.edgeCountIncluded = edgeCountIncluded;
  }


  public SubscriptionDetails items(@Nullable SubscriptionItems items) {
    this.items = items;
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SubscriptionItems getItems() {
    return items;
  }


  @JsonProperty(value = JSON_PROPERTY_ITEMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(@Nullable SubscriptionItems items) {
    this.items = items;
  }


  public SubscriptionDetails discount(@Nullable Discount discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Get discount
   * @return discount
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DISCOUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Discount getDiscount() {
    return discount;
  }


  @JsonProperty(value = JSON_PROPERTY_DISCOUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscount(@Nullable Discount discount) {
    this.discount = discount;
  }


  /**
   * Get name
   * @return name
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NAME, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }




  /**
   * Return true if this SubscriptionDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionDetails subscriptionDetails = (SubscriptionDetails) o;
    return Objects.equals(this.id, subscriptionDetails.id) &&
        Objects.equals(this.createdTime, subscriptionDetails.createdTime) &&
        Objects.equals(this.additionalInfo, subscriptionDetails.additionalInfo) &&
        Objects.equals(this.externalId, subscriptionDetails.externalId) &&
        Objects.equals(this.tenantId, subscriptionDetails.tenantId) &&
        Objects.equals(this.billingCustomerId, subscriptionDetails.billingCustomerId) &&
        Objects.equals(this.subscriptionPlanId, subscriptionDetails.subscriptionPlanId) &&
        Objects.equals(this.currentPeriodStartTs, subscriptionDetails.currentPeriodStartTs) &&
        Objects.equals(this.currentPeriodEndTs, subscriptionDetails.currentPeriodEndTs) &&
        Objects.equals(this.active, subscriptionDetails.active) &&
        Objects.equals(this.trial, subscriptionDetails.trial) &&
        Objects.equals(this.trialEndTs, subscriptionDetails.trialEndTs) &&
        Objects.equals(this.status, subscriptionDetails.status) &&
        Objects.equals(this.lastPaid, subscriptionDetails.lastPaid) &&
        Objects.equals(this.upcomingInvoiceDate, subscriptionDetails.upcomingInvoiceDate) &&
        Objects.equals(this.upcomingInvoiceAmountDue, subscriptionDetails.upcomingInvoiceAmountDue) &&
        Objects.equals(this.couponId, subscriptionDetails.couponId) &&
        Objects.equals(this.discountEndDate, subscriptionDetails.discountEndDate) &&
        Objects.equals(this.subscriptionPlanName, subscriptionDetails.subscriptionPlanName) &&
        Objects.equals(this.planHasAddons, subscriptionDetails.planHasAddons) &&
        Objects.equals(this.planUiType, subscriptionDetails.planUiType) &&
        Objects.equals(this.planIsFree, subscriptionDetails.planIsFree) &&
        Objects.equals(this.planIsActive, subscriptionDetails.planIsActive) &&
        Objects.equals(this.edgeCountIncluded, subscriptionDetails.edgeCountIncluded) &&
        Objects.equals(this.items, subscriptionDetails.items) &&
        Objects.equals(this.discount, subscriptionDetails.discount) &&
        Objects.equals(this.name, subscriptionDetails.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, additionalInfo, externalId, tenantId, billingCustomerId, subscriptionPlanId, currentPeriodStartTs, currentPeriodEndTs, active, trial, trialEndTs, status, lastPaid, upcomingInvoiceDate, upcomingInvoiceAmountDue, couponId, discountEndDate, subscriptionPlanName, planHasAddons, planUiType, planIsFree, planIsActive, edgeCountIncluded, items, discount, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    billingCustomerId: ").append(toIndentedString(billingCustomerId)).append("\n");
    sb.append("    subscriptionPlanId: ").append(toIndentedString(subscriptionPlanId)).append("\n");
    sb.append("    currentPeriodStartTs: ").append(toIndentedString(currentPeriodStartTs)).append("\n");
    sb.append("    currentPeriodEndTs: ").append(toIndentedString(currentPeriodEndTs)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    trial: ").append(toIndentedString(trial)).append("\n");
    sb.append("    trialEndTs: ").append(toIndentedString(trialEndTs)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastPaid: ").append(toIndentedString(lastPaid)).append("\n");
    sb.append("    upcomingInvoiceDate: ").append(toIndentedString(upcomingInvoiceDate)).append("\n");
    sb.append("    upcomingInvoiceAmountDue: ").append(toIndentedString(upcomingInvoiceAmountDue)).append("\n");
    sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
    sb.append("    discountEndDate: ").append(toIndentedString(discountEndDate)).append("\n");
    sb.append("    subscriptionPlanName: ").append(toIndentedString(subscriptionPlanName)).append("\n");
    sb.append("    planHasAddons: ").append(toIndentedString(planHasAddons)).append("\n");
    sb.append("    planUiType: ").append(toIndentedString(planUiType)).append("\n");
    sb.append("    planIsFree: ").append(toIndentedString(planIsFree)).append("\n");
    sb.append("    planIsActive: ").append(toIndentedString(planIsActive)).append("\n");
    sb.append("    edgeCountIncluded: ").append(toIndentedString(edgeCountIncluded)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(getId().toUrlQueryString(prefix + "id" + suffix));
    }

    // add `createdTime` to the URL query string
    if (getCreatedTime() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%screatedTime%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCreatedTime()))));
    }

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sadditionalInfo%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAdditionalInfo()))));
    }

    // add `externalId` to the URL query string
    if (getExternalId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sexternalId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getExternalId()))));
    }

    // add `tenantId` to the URL query string
    if (getTenantId() != null) {
      joiner.add(getTenantId().toUrlQueryString(prefix + "tenantId" + suffix));
    }

    // add `billingCustomerId` to the URL query string
    if (getBillingCustomerId() != null) {
      joiner.add(getBillingCustomerId().toUrlQueryString(prefix + "billingCustomerId" + suffix));
    }

    // add `subscriptionPlanId` to the URL query string
    if (getSubscriptionPlanId() != null) {
      joiner.add(getSubscriptionPlanId().toUrlQueryString(prefix + "subscriptionPlanId" + suffix));
    }

    // add `currentPeriodStartTs` to the URL query string
    if (getCurrentPeriodStartTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrentPeriodStartTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentPeriodStartTs()))));
    }

    // add `currentPeriodEndTs` to the URL query string
    if (getCurrentPeriodEndTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrentPeriodEndTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentPeriodEndTs()))));
    }

    // add `active` to the URL query string
    if (getActive() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sactive%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getActive()))));
    }

    // add `trial` to the URL query string
    if (getTrial() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%strial%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTrial()))));
    }

    // add `trialEndTs` to the URL query string
    if (getTrialEndTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%strialEndTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTrialEndTs()))));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sstatus%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getStatus()))));
    }

    // add `lastPaid` to the URL query string
    if (getLastPaid() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slastPaid%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLastPaid()))));
    }

    // add `upcomingInvoiceDate` to the URL query string
    if (getUpcomingInvoiceDate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%supcomingInvoiceDate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUpcomingInvoiceDate()))));
    }

    // add `upcomingInvoiceAmountDue` to the URL query string
    if (getUpcomingInvoiceAmountDue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%supcomingInvoiceAmountDue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUpcomingInvoiceAmountDue()))));
    }

    // add `couponId` to the URL query string
    if (getCouponId() != null) {
      joiner.add(getCouponId().toUrlQueryString(prefix + "couponId" + suffix));
    }

    // add `discountEndDate` to the URL query string
    if (getDiscountEndDate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdiscountEndDate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDiscountEndDate()))));
    }

    // add `subscriptionPlanName` to the URL query string
    if (getSubscriptionPlanName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssubscriptionPlanName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSubscriptionPlanName()))));
    }

    // add `planHasAddons` to the URL query string
    if (getPlanHasAddons() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splanHasAddons%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlanHasAddons()))));
    }

    // add `planUiType` to the URL query string
    if (getPlanUiType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splanUiType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlanUiType()))));
    }

    // add `planIsFree` to the URL query string
    if (getPlanIsFree() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splanIsFree%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlanIsFree()))));
    }

    // add `planIsActive` to the URL query string
    if (getPlanIsActive() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splanIsActive%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlanIsActive()))));
    }

    // add `edgeCountIncluded` to the URL query string
    if (getEdgeCountIncluded() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sedgeCountIncluded%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEdgeCountIncluded()))));
    }

    // add `items` to the URL query string
    if (getItems() != null) {
      joiner.add(getItems().toUrlQueryString(prefix + "items" + suffix));
    }

    // add `discount` to the URL query string
    if (getDiscount() != null) {
      joiner.add(getDiscount().toUrlQueryString(prefix + "discount" + suffix));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    return joiner.toString();
  }
}

