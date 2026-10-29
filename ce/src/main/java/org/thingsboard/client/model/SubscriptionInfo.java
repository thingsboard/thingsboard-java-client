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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.ApiClient;
/**
 * SubscriptionInfo
 */
@JsonPropertyOrder({
  SubscriptionInfo.JSON_PROPERTY_SUBSCRIPTION_ID,
  SubscriptionInfo.JSON_PROPERTY_SUBSCRIPTION_PLAN_NAME,
  SubscriptionInfo.JSON_PROPERTY_PLAN_UI_TYPE,
  SubscriptionInfo.JSON_PROPERTY_CURRENT_PERIOD_START_TS,
  SubscriptionInfo.JSON_PROPERTY_CURRENT_PERIOD_END_TS,
  SubscriptionInfo.JSON_PROPERTY_END_TS,
  SubscriptionInfo.JSON_PROPERTY_UPCOMING_INVOICE_DATE,
  SubscriptionInfo.JSON_PROPERTY_UPCOMING_INVOICE_AMOUNT_DUE,
  SubscriptionInfo.JSON_PROPERTY_PLAN_EXTRA_DEVICE_ENABLED,
  SubscriptionInfo.JSON_PROPERTY_PLAN_EDGE_ENABLED,
  SubscriptionInfo.JSON_PROPERTY_PLAN_EXTRA_EDGE_ENABLED,
  SubscriptionInfo.JSON_PROPERTY_PLAN_TRENDZ_ENABLED,
  SubscriptionInfo.JSON_PROPERTY_PLAN_EXTRA_AI_CREDITS_ENABLED,
  SubscriptionInfo.JSON_PROPERTY_PLAN_EXTRA_INSTANCE_ENABLED,
  SubscriptionInfo.JSON_PROPERTY_PLAN_EXTRA_AGENT_ENABLED,
  SubscriptionInfo.JSON_PROPERTY_DATA_TS,
  SubscriptionInfo.JSON_PROPERTY_LICENSE_SERVER_ENDPOINT,
  SubscriptionInfo.JSON_PROPERTY_MAX_DEVICES,
  SubscriptionInfo.JSON_PROPERTY_MAX_ASSETS,
  SubscriptionInfo.JSON_PROPERTY_MAX_EDGES,
  SubscriptionInfo.JSON_PROPERTY_MAX_AGENTS,
  SubscriptionInfo.JSON_PROPERTY_MAX_INSTANCES,
  SubscriptionInfo.JSON_PROPERTY_MAX_AI_CREDITS,
  SubscriptionInfo.JSON_PROPERTY_WHITE_LABELING_ENABLED,
  SubscriptionInfo.JSON_PROPERTY_EDGE_ENABLED,
  SubscriptionInfo.JSON_PROPERTY_TRENDZ_ENABLED,
  SubscriptionInfo.JSON_PROPERTY_DEVELOPMENT,
  SubscriptionInfo.JSON_PROPERTY_NON_PRODUCTION,
  SubscriptionInfo.JSON_PROPERTY_DEVICES_COUNT,
  SubscriptionInfo.JSON_PROPERTY_ASSETS_COUNT,
  SubscriptionInfo.JSON_PROPERTY_EDGES_COUNT,
  SubscriptionInfo.JSON_PROPERTY_AGENTS_COUNT,
  SubscriptionInfo.JSON_PROPERTY_INSTANCES_COUNT,
  SubscriptionInfo.JSON_PROPERTY_USED_AI_CREDITS,
  SubscriptionInfo.JSON_PROPERTY_COMMUNITY_GRANT_LICENSE,
  SubscriptionInfo.JSON_PROPERTY_OFFLINE,
  SubscriptionInfo.JSON_PROPERTY_PERPETUAL
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class SubscriptionInfo {
  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  @Nullable
  private String subscriptionId;

  public static final String JSON_PROPERTY_SUBSCRIPTION_PLAN_NAME = "subscriptionPlanName";
  @Nullable
  private String subscriptionPlanName;

  public static final String JSON_PROPERTY_PLAN_UI_TYPE = "planUiType";
  @Nullable
  private String planUiType;

  public static final String JSON_PROPERTY_CURRENT_PERIOD_START_TS = "currentPeriodStartTs";
  @Nullable
  private Long currentPeriodStartTs;

  public static final String JSON_PROPERTY_CURRENT_PERIOD_END_TS = "currentPeriodEndTs";
  @Nullable
  private Long currentPeriodEndTs;

  public static final String JSON_PROPERTY_END_TS = "endTs";
  @Nullable
  private Long endTs;

  public static final String JSON_PROPERTY_UPCOMING_INVOICE_DATE = "upcomingInvoiceDate";
  @Nullable
  private Long upcomingInvoiceDate;

  public static final String JSON_PROPERTY_UPCOMING_INVOICE_AMOUNT_DUE = "upcomingInvoiceAmountDue";
  @Nullable
  private Long upcomingInvoiceAmountDue;

  public static final String JSON_PROPERTY_PLAN_EXTRA_DEVICE_ENABLED = "planExtraDeviceEnabled";
  @Nullable
  private Boolean planExtraDeviceEnabled;

  public static final String JSON_PROPERTY_PLAN_EDGE_ENABLED = "planEdgeEnabled";
  @Nullable
  private Boolean planEdgeEnabled;

  public static final String JSON_PROPERTY_PLAN_EXTRA_EDGE_ENABLED = "planExtraEdgeEnabled";
  @Nullable
  private Boolean planExtraEdgeEnabled;

  public static final String JSON_PROPERTY_PLAN_TRENDZ_ENABLED = "planTrendzEnabled";
  @Nullable
  private Boolean planTrendzEnabled;

  public static final String JSON_PROPERTY_PLAN_EXTRA_AI_CREDITS_ENABLED = "planExtraAiCreditsEnabled";
  @Nullable
  private Boolean planExtraAiCreditsEnabled;

  public static final String JSON_PROPERTY_PLAN_EXTRA_INSTANCE_ENABLED = "planExtraInstanceEnabled";
  @Nullable
  private Boolean planExtraInstanceEnabled;

  public static final String JSON_PROPERTY_PLAN_EXTRA_AGENT_ENABLED = "planExtraAgentEnabled";
  @Nullable
  private Boolean planExtraAgentEnabled;

  public static final String JSON_PROPERTY_DATA_TS = "dataTs";
  @Nullable
  private Long dataTs;

  public static final String JSON_PROPERTY_LICENSE_SERVER_ENDPOINT = "licenseServerEndpoint";
  @Nullable
  private String licenseServerEndpoint;

  public static final String JSON_PROPERTY_MAX_DEVICES = "maxDevices";
  @Nullable
  private Long maxDevices;

  public static final String JSON_PROPERTY_MAX_ASSETS = "maxAssets";
  @Nullable
  private Long maxAssets;

  public static final String JSON_PROPERTY_MAX_EDGES = "maxEdges";
  @Nullable
  private Long maxEdges;

  public static final String JSON_PROPERTY_MAX_AGENTS = "maxAgents";
  @Nullable
  private Long maxAgents;

  public static final String JSON_PROPERTY_MAX_INSTANCES = "maxInstances";
  @Nullable
  private Long maxInstances;

  public static final String JSON_PROPERTY_MAX_AI_CREDITS = "maxAiCredits";
  @Nullable
  private Long maxAiCredits;

  public static final String JSON_PROPERTY_WHITE_LABELING_ENABLED = "whiteLabelingEnabled";
  @Nullable
  private Boolean whiteLabelingEnabled;

  public static final String JSON_PROPERTY_EDGE_ENABLED = "edgeEnabled";
  @Nullable
  private Boolean edgeEnabled;

  public static final String JSON_PROPERTY_TRENDZ_ENABLED = "trendzEnabled";
  @Nullable
  private Boolean trendzEnabled;

  public static final String JSON_PROPERTY_DEVELOPMENT = "development";
  @Nullable
  private Boolean development;

  public static final String JSON_PROPERTY_NON_PRODUCTION = "nonProduction";
  @Nullable
  private Boolean nonProduction;

  public static final String JSON_PROPERTY_DEVICES_COUNT = "devicesCount";
  @Nullable
  private Long devicesCount;

  public static final String JSON_PROPERTY_ASSETS_COUNT = "assetsCount";
  @Nullable
  private Long assetsCount;

  public static final String JSON_PROPERTY_EDGES_COUNT = "edgesCount";
  @Nullable
  private Long edgesCount;

  public static final String JSON_PROPERTY_AGENTS_COUNT = "agentsCount";
  @Nullable
  private Long agentsCount;

  public static final String JSON_PROPERTY_INSTANCES_COUNT = "instancesCount";
  @Nullable
  private Long instancesCount;

  public static final String JSON_PROPERTY_USED_AI_CREDITS = "usedAiCredits";
  @Nullable
  private Long usedAiCredits;

  public static final String JSON_PROPERTY_COMMUNITY_GRANT_LICENSE = "communityGrantLicense";
  @Nullable
  private Boolean communityGrantLicense;

  public static final String JSON_PROPERTY_OFFLINE = "offline";
  @Nullable
  private Boolean offline;

  public static final String JSON_PROPERTY_PERPETUAL = "perpetual";
  @Nullable
  private Boolean perpetual;

  public SubscriptionInfo() { 
  }

  public SubscriptionInfo subscriptionId(@Nullable String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Get subscriptionId
   * @return subscriptionId
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SUBSCRIPTION_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubscriptionId() {
    return subscriptionId;
  }


  @JsonProperty(value = JSON_PROPERTY_SUBSCRIPTION_ID, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionId(@Nullable String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public SubscriptionInfo subscriptionPlanName(@Nullable String subscriptionPlanName) {
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


  public SubscriptionInfo planUiType(@Nullable String planUiType) {
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


  public SubscriptionInfo currentPeriodStartTs(@Nullable Long currentPeriodStartTs) {
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


  public SubscriptionInfo currentPeriodEndTs(@Nullable Long currentPeriodEndTs) {
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


  public SubscriptionInfo endTs(@Nullable Long endTs) {
    this.endTs = endTs;
    return this;
  }

  /**
   * Get endTs
   * @return endTs
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_END_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEndTs() {
    return endTs;
  }


  @JsonProperty(value = JSON_PROPERTY_END_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTs(@Nullable Long endTs) {
    this.endTs = endTs;
  }


  public SubscriptionInfo upcomingInvoiceDate(@Nullable Long upcomingInvoiceDate) {
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


  public SubscriptionInfo upcomingInvoiceAmountDue(@Nullable Long upcomingInvoiceAmountDue) {
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


  public SubscriptionInfo planExtraDeviceEnabled(@Nullable Boolean planExtraDeviceEnabled) {
    this.planExtraDeviceEnabled = planExtraDeviceEnabled;
    return this;
  }

  /**
   * Get planExtraDeviceEnabled
   * @return planExtraDeviceEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PLAN_EXTRA_DEVICE_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPlanExtraDeviceEnabled() {
    return planExtraDeviceEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_PLAN_EXTRA_DEVICE_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanExtraDeviceEnabled(@Nullable Boolean planExtraDeviceEnabled) {
    this.planExtraDeviceEnabled = planExtraDeviceEnabled;
  }


  public SubscriptionInfo planEdgeEnabled(@Nullable Boolean planEdgeEnabled) {
    this.planEdgeEnabled = planEdgeEnabled;
    return this;
  }

  /**
   * Get planEdgeEnabled
   * @return planEdgeEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PLAN_EDGE_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPlanEdgeEnabled() {
    return planEdgeEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_PLAN_EDGE_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanEdgeEnabled(@Nullable Boolean planEdgeEnabled) {
    this.planEdgeEnabled = planEdgeEnabled;
  }


  public SubscriptionInfo planExtraEdgeEnabled(@Nullable Boolean planExtraEdgeEnabled) {
    this.planExtraEdgeEnabled = planExtraEdgeEnabled;
    return this;
  }

  /**
   * Get planExtraEdgeEnabled
   * @return planExtraEdgeEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PLAN_EXTRA_EDGE_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPlanExtraEdgeEnabled() {
    return planExtraEdgeEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_PLAN_EXTRA_EDGE_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanExtraEdgeEnabled(@Nullable Boolean planExtraEdgeEnabled) {
    this.planExtraEdgeEnabled = planExtraEdgeEnabled;
  }


  public SubscriptionInfo planTrendzEnabled(@Nullable Boolean planTrendzEnabled) {
    this.planTrendzEnabled = planTrendzEnabled;
    return this;
  }

  /**
   * Get planTrendzEnabled
   * @return planTrendzEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PLAN_TRENDZ_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPlanTrendzEnabled() {
    return planTrendzEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_PLAN_TRENDZ_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanTrendzEnabled(@Nullable Boolean planTrendzEnabled) {
    this.planTrendzEnabled = planTrendzEnabled;
  }


  public SubscriptionInfo planExtraAiCreditsEnabled(@Nullable Boolean planExtraAiCreditsEnabled) {
    this.planExtraAiCreditsEnabled = planExtraAiCreditsEnabled;
    return this;
  }

  /**
   * Get planExtraAiCreditsEnabled
   * @return planExtraAiCreditsEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PLAN_EXTRA_AI_CREDITS_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPlanExtraAiCreditsEnabled() {
    return planExtraAiCreditsEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_PLAN_EXTRA_AI_CREDITS_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanExtraAiCreditsEnabled(@Nullable Boolean planExtraAiCreditsEnabled) {
    this.planExtraAiCreditsEnabled = planExtraAiCreditsEnabled;
  }


  public SubscriptionInfo planExtraInstanceEnabled(@Nullable Boolean planExtraInstanceEnabled) {
    this.planExtraInstanceEnabled = planExtraInstanceEnabled;
    return this;
  }

  /**
   * Get planExtraInstanceEnabled
   * @return planExtraInstanceEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PLAN_EXTRA_INSTANCE_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPlanExtraInstanceEnabled() {
    return planExtraInstanceEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_PLAN_EXTRA_INSTANCE_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanExtraInstanceEnabled(@Nullable Boolean planExtraInstanceEnabled) {
    this.planExtraInstanceEnabled = planExtraInstanceEnabled;
  }


  public SubscriptionInfo planExtraAgentEnabled(@Nullable Boolean planExtraAgentEnabled) {
    this.planExtraAgentEnabled = planExtraAgentEnabled;
    return this;
  }

  /**
   * Get planExtraAgentEnabled
   * @return planExtraAgentEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PLAN_EXTRA_AGENT_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPlanExtraAgentEnabled() {
    return planExtraAgentEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_PLAN_EXTRA_AGENT_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanExtraAgentEnabled(@Nullable Boolean planExtraAgentEnabled) {
    this.planExtraAgentEnabled = planExtraAgentEnabled;
  }


  public SubscriptionInfo dataTs(@Nullable Long dataTs) {
    this.dataTs = dataTs;
    return this;
  }

  /**
   * Get dataTs
   * @return dataTs
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DATA_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDataTs() {
    return dataTs;
  }


  @JsonProperty(value = JSON_PROPERTY_DATA_TS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataTs(@Nullable Long dataTs) {
    this.dataTs = dataTs;
  }


  public SubscriptionInfo licenseServerEndpoint(@Nullable String licenseServerEndpoint) {
    this.licenseServerEndpoint = licenseServerEndpoint;
    return this;
  }

  /**
   * Get licenseServerEndpoint
   * @return licenseServerEndpoint
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_LICENSE_SERVER_ENDPOINT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLicenseServerEndpoint() {
    return licenseServerEndpoint;
  }


  @JsonProperty(value = JSON_PROPERTY_LICENSE_SERVER_ENDPOINT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLicenseServerEndpoint(@Nullable String licenseServerEndpoint) {
    this.licenseServerEndpoint = licenseServerEndpoint;
  }


  public SubscriptionInfo maxDevices(@Nullable Long maxDevices) {
    this.maxDevices = maxDevices;
    return this;
  }

  /**
   * Get maxDevices
   * @return maxDevices
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_DEVICES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxDevices() {
    return maxDevices;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_DEVICES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxDevices(@Nullable Long maxDevices) {
    this.maxDevices = maxDevices;
  }


  public SubscriptionInfo maxAssets(@Nullable Long maxAssets) {
    this.maxAssets = maxAssets;
    return this;
  }

  /**
   * Get maxAssets
   * @return maxAssets
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxAssets() {
    return maxAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxAssets(@Nullable Long maxAssets) {
    this.maxAssets = maxAssets;
  }


  public SubscriptionInfo maxEdges(@Nullable Long maxEdges) {
    this.maxEdges = maxEdges;
    return this;
  }

  /**
   * Get maxEdges
   * @return maxEdges
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_EDGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxEdges() {
    return maxEdges;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_EDGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxEdges(@Nullable Long maxEdges) {
    this.maxEdges = maxEdges;
  }


  public SubscriptionInfo maxAgents(@Nullable Long maxAgents) {
    this.maxAgents = maxAgents;
    return this;
  }

  /**
   * Get maxAgents
   * @return maxAgents
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_AGENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxAgents() {
    return maxAgents;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_AGENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxAgents(@Nullable Long maxAgents) {
    this.maxAgents = maxAgents;
  }


  public SubscriptionInfo maxInstances(@Nullable Long maxInstances) {
    this.maxInstances = maxInstances;
    return this;
  }

  /**
   * Get maxInstances
   * @return maxInstances
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_INSTANCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxInstances() {
    return maxInstances;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_INSTANCES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxInstances(@Nullable Long maxInstances) {
    this.maxInstances = maxInstances;
  }


  public SubscriptionInfo maxAiCredits(@Nullable Long maxAiCredits) {
    this.maxAiCredits = maxAiCredits;
    return this;
  }

  /**
   * Get maxAiCredits
   * @return maxAiCredits
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_AI_CREDITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxAiCredits() {
    return maxAiCredits;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_AI_CREDITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxAiCredits(@Nullable Long maxAiCredits) {
    this.maxAiCredits = maxAiCredits;
  }


  public SubscriptionInfo whiteLabelingEnabled(@Nullable Boolean whiteLabelingEnabled) {
    this.whiteLabelingEnabled = whiteLabelingEnabled;
    return this;
  }

  /**
   * Get whiteLabelingEnabled
   * @return whiteLabelingEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_WHITE_LABELING_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getWhiteLabelingEnabled() {
    return whiteLabelingEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_WHITE_LABELING_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhiteLabelingEnabled(@Nullable Boolean whiteLabelingEnabled) {
    this.whiteLabelingEnabled = whiteLabelingEnabled;
  }


  public SubscriptionInfo edgeEnabled(@Nullable Boolean edgeEnabled) {
    this.edgeEnabled = edgeEnabled;
    return this;
  }

  /**
   * Get edgeEnabled
   * @return edgeEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EDGE_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEdgeEnabled() {
    return edgeEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_EDGE_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdgeEnabled(@Nullable Boolean edgeEnabled) {
    this.edgeEnabled = edgeEnabled;
  }


  public SubscriptionInfo trendzEnabled(@Nullable Boolean trendzEnabled) {
    this.trendzEnabled = trendzEnabled;
    return this;
  }

  /**
   * Get trendzEnabled
   * @return trendzEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TRENDZ_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTrendzEnabled() {
    return trendzEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_TRENDZ_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrendzEnabled(@Nullable Boolean trendzEnabled) {
    this.trendzEnabled = trendzEnabled;
  }


  public SubscriptionInfo development(@Nullable Boolean development) {
    this.development = development;
    return this;
  }

  /**
   * Get development
   * @return development
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DEVELOPMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDevelopment() {
    return development;
  }


  @JsonProperty(value = JSON_PROPERTY_DEVELOPMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevelopment(@Nullable Boolean development) {
    this.development = development;
  }


  public SubscriptionInfo nonProduction(@Nullable Boolean nonProduction) {
    this.nonProduction = nonProduction;
    return this;
  }

  /**
   * Get nonProduction
   * @return nonProduction
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_NON_PRODUCTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNonProduction() {
    return nonProduction;
  }


  @JsonProperty(value = JSON_PROPERTY_NON_PRODUCTION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonProduction(@Nullable Boolean nonProduction) {
    this.nonProduction = nonProduction;
  }


  public SubscriptionInfo devicesCount(@Nullable Long devicesCount) {
    this.devicesCount = devicesCount;
    return this;
  }

  /**
   * Get devicesCount
   * @return devicesCount
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DEVICES_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDevicesCount() {
    return devicesCount;
  }


  @JsonProperty(value = JSON_PROPERTY_DEVICES_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevicesCount(@Nullable Long devicesCount) {
    this.devicesCount = devicesCount;
  }


  public SubscriptionInfo assetsCount(@Nullable Long assetsCount) {
    this.assetsCount = assetsCount;
    return this;
  }

  /**
   * Get assetsCount
   * @return assetsCount
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ASSETS_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAssetsCount() {
    return assetsCount;
  }


  @JsonProperty(value = JSON_PROPERTY_ASSETS_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetsCount(@Nullable Long assetsCount) {
    this.assetsCount = assetsCount;
  }


  public SubscriptionInfo edgesCount(@Nullable Long edgesCount) {
    this.edgesCount = edgesCount;
    return this;
  }

  /**
   * Get edgesCount
   * @return edgesCount
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EDGES_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEdgesCount() {
    return edgesCount;
  }


  @JsonProperty(value = JSON_PROPERTY_EDGES_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdgesCount(@Nullable Long edgesCount) {
    this.edgesCount = edgesCount;
  }


  public SubscriptionInfo agentsCount(@Nullable Long agentsCount) {
    this.agentsCount = agentsCount;
    return this;
  }

  /**
   * Get agentsCount
   * @return agentsCount
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_AGENTS_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAgentsCount() {
    return agentsCount;
  }


  @JsonProperty(value = JSON_PROPERTY_AGENTS_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentsCount(@Nullable Long agentsCount) {
    this.agentsCount = agentsCount;
  }


  public SubscriptionInfo instancesCount(@Nullable Long instancesCount) {
    this.instancesCount = instancesCount;
    return this;
  }

  /**
   * Get instancesCount
   * @return instancesCount
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_INSTANCES_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInstancesCount() {
    return instancesCount;
  }


  @JsonProperty(value = JSON_PROPERTY_INSTANCES_COUNT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstancesCount(@Nullable Long instancesCount) {
    this.instancesCount = instancesCount;
  }


  public SubscriptionInfo usedAiCredits(@Nullable Long usedAiCredits) {
    this.usedAiCredits = usedAiCredits;
    return this;
  }

  /**
   * Get usedAiCredits
   * @return usedAiCredits
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_USED_AI_CREDITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUsedAiCredits() {
    return usedAiCredits;
  }


  @JsonProperty(value = JSON_PROPERTY_USED_AI_CREDITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsedAiCredits(@Nullable Long usedAiCredits) {
    this.usedAiCredits = usedAiCredits;
  }


  public SubscriptionInfo communityGrantLicense(@Nullable Boolean communityGrantLicense) {
    this.communityGrantLicense = communityGrantLicense;
    return this;
  }

  /**
   * Get communityGrantLicense
   * @return communityGrantLicense
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_COMMUNITY_GRANT_LICENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCommunityGrantLicense() {
    return communityGrantLicense;
  }


  @JsonProperty(value = JSON_PROPERTY_COMMUNITY_GRANT_LICENSE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommunityGrantLicense(@Nullable Boolean communityGrantLicense) {
    this.communityGrantLicense = communityGrantLicense;
  }


  public SubscriptionInfo offline(@Nullable Boolean offline) {
    this.offline = offline;
    return this;
  }

  /**
   * Get offline
   * @return offline
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_OFFLINE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOffline() {
    return offline;
  }


  @JsonProperty(value = JSON_PROPERTY_OFFLINE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffline(@Nullable Boolean offline) {
    this.offline = offline;
  }


  public SubscriptionInfo perpetual(@Nullable Boolean perpetual) {
    this.perpetual = perpetual;
    return this;
  }

  /**
   * Get perpetual
   * @return perpetual
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_PERPETUAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPerpetual() {
    return perpetual;
  }


  @JsonProperty(value = JSON_PROPERTY_PERPETUAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerpetual(@Nullable Boolean perpetual) {
    this.perpetual = perpetual;
  }


  /**
   * Return true if this SubscriptionInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionInfo subscriptionInfo = (SubscriptionInfo) o;
    return Objects.equals(this.subscriptionId, subscriptionInfo.subscriptionId) &&
        Objects.equals(this.subscriptionPlanName, subscriptionInfo.subscriptionPlanName) &&
        Objects.equals(this.planUiType, subscriptionInfo.planUiType) &&
        Objects.equals(this.currentPeriodStartTs, subscriptionInfo.currentPeriodStartTs) &&
        Objects.equals(this.currentPeriodEndTs, subscriptionInfo.currentPeriodEndTs) &&
        Objects.equals(this.endTs, subscriptionInfo.endTs) &&
        Objects.equals(this.upcomingInvoiceDate, subscriptionInfo.upcomingInvoiceDate) &&
        Objects.equals(this.upcomingInvoiceAmountDue, subscriptionInfo.upcomingInvoiceAmountDue) &&
        Objects.equals(this.planExtraDeviceEnabled, subscriptionInfo.planExtraDeviceEnabled) &&
        Objects.equals(this.planEdgeEnabled, subscriptionInfo.planEdgeEnabled) &&
        Objects.equals(this.planExtraEdgeEnabled, subscriptionInfo.planExtraEdgeEnabled) &&
        Objects.equals(this.planTrendzEnabled, subscriptionInfo.planTrendzEnabled) &&
        Objects.equals(this.planExtraAiCreditsEnabled, subscriptionInfo.planExtraAiCreditsEnabled) &&
        Objects.equals(this.planExtraInstanceEnabled, subscriptionInfo.planExtraInstanceEnabled) &&
        Objects.equals(this.planExtraAgentEnabled, subscriptionInfo.planExtraAgentEnabled) &&
        Objects.equals(this.dataTs, subscriptionInfo.dataTs) &&
        Objects.equals(this.licenseServerEndpoint, subscriptionInfo.licenseServerEndpoint) &&
        Objects.equals(this.maxDevices, subscriptionInfo.maxDevices) &&
        Objects.equals(this.maxAssets, subscriptionInfo.maxAssets) &&
        Objects.equals(this.maxEdges, subscriptionInfo.maxEdges) &&
        Objects.equals(this.maxAgents, subscriptionInfo.maxAgents) &&
        Objects.equals(this.maxInstances, subscriptionInfo.maxInstances) &&
        Objects.equals(this.maxAiCredits, subscriptionInfo.maxAiCredits) &&
        Objects.equals(this.whiteLabelingEnabled, subscriptionInfo.whiteLabelingEnabled) &&
        Objects.equals(this.edgeEnabled, subscriptionInfo.edgeEnabled) &&
        Objects.equals(this.trendzEnabled, subscriptionInfo.trendzEnabled) &&
        Objects.equals(this.development, subscriptionInfo.development) &&
        Objects.equals(this.nonProduction, subscriptionInfo.nonProduction) &&
        Objects.equals(this.devicesCount, subscriptionInfo.devicesCount) &&
        Objects.equals(this.assetsCount, subscriptionInfo.assetsCount) &&
        Objects.equals(this.edgesCount, subscriptionInfo.edgesCount) &&
        Objects.equals(this.agentsCount, subscriptionInfo.agentsCount) &&
        Objects.equals(this.instancesCount, subscriptionInfo.instancesCount) &&
        Objects.equals(this.usedAiCredits, subscriptionInfo.usedAiCredits) &&
        Objects.equals(this.communityGrantLicense, subscriptionInfo.communityGrantLicense) &&
        Objects.equals(this.offline, subscriptionInfo.offline) &&
        Objects.equals(this.perpetual, subscriptionInfo.perpetual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, subscriptionPlanName, planUiType, currentPeriodStartTs, currentPeriodEndTs, endTs, upcomingInvoiceDate, upcomingInvoiceAmountDue, planExtraDeviceEnabled, planEdgeEnabled, planExtraEdgeEnabled, planTrendzEnabled, planExtraAiCreditsEnabled, planExtraInstanceEnabled, planExtraAgentEnabled, dataTs, licenseServerEndpoint, maxDevices, maxAssets, maxEdges, maxAgents, maxInstances, maxAiCredits, whiteLabelingEnabled, edgeEnabled, trendzEnabled, development, nonProduction, devicesCount, assetsCount, edgesCount, agentsCount, instancesCount, usedAiCredits, communityGrantLicense, offline, perpetual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionInfo {\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    subscriptionPlanName: ").append(toIndentedString(subscriptionPlanName)).append("\n");
    sb.append("    planUiType: ").append(toIndentedString(planUiType)).append("\n");
    sb.append("    currentPeriodStartTs: ").append(toIndentedString(currentPeriodStartTs)).append("\n");
    sb.append("    currentPeriodEndTs: ").append(toIndentedString(currentPeriodEndTs)).append("\n");
    sb.append("    endTs: ").append(toIndentedString(endTs)).append("\n");
    sb.append("    upcomingInvoiceDate: ").append(toIndentedString(upcomingInvoiceDate)).append("\n");
    sb.append("    upcomingInvoiceAmountDue: ").append(toIndentedString(upcomingInvoiceAmountDue)).append("\n");
    sb.append("    planExtraDeviceEnabled: ").append(toIndentedString(planExtraDeviceEnabled)).append("\n");
    sb.append("    planEdgeEnabled: ").append(toIndentedString(planEdgeEnabled)).append("\n");
    sb.append("    planExtraEdgeEnabled: ").append(toIndentedString(planExtraEdgeEnabled)).append("\n");
    sb.append("    planTrendzEnabled: ").append(toIndentedString(planTrendzEnabled)).append("\n");
    sb.append("    planExtraAiCreditsEnabled: ").append(toIndentedString(planExtraAiCreditsEnabled)).append("\n");
    sb.append("    planExtraInstanceEnabled: ").append(toIndentedString(planExtraInstanceEnabled)).append("\n");
    sb.append("    planExtraAgentEnabled: ").append(toIndentedString(planExtraAgentEnabled)).append("\n");
    sb.append("    dataTs: ").append(toIndentedString(dataTs)).append("\n");
    sb.append("    licenseServerEndpoint: ").append(toIndentedString(licenseServerEndpoint)).append("\n");
    sb.append("    maxDevices: ").append(toIndentedString(maxDevices)).append("\n");
    sb.append("    maxAssets: ").append(toIndentedString(maxAssets)).append("\n");
    sb.append("    maxEdges: ").append(toIndentedString(maxEdges)).append("\n");
    sb.append("    maxAgents: ").append(toIndentedString(maxAgents)).append("\n");
    sb.append("    maxInstances: ").append(toIndentedString(maxInstances)).append("\n");
    sb.append("    maxAiCredits: ").append(toIndentedString(maxAiCredits)).append("\n");
    sb.append("    whiteLabelingEnabled: ").append(toIndentedString(whiteLabelingEnabled)).append("\n");
    sb.append("    edgeEnabled: ").append(toIndentedString(edgeEnabled)).append("\n");
    sb.append("    trendzEnabled: ").append(toIndentedString(trendzEnabled)).append("\n");
    sb.append("    development: ").append(toIndentedString(development)).append("\n");
    sb.append("    nonProduction: ").append(toIndentedString(nonProduction)).append("\n");
    sb.append("    devicesCount: ").append(toIndentedString(devicesCount)).append("\n");
    sb.append("    assetsCount: ").append(toIndentedString(assetsCount)).append("\n");
    sb.append("    edgesCount: ").append(toIndentedString(edgesCount)).append("\n");
    sb.append("    agentsCount: ").append(toIndentedString(agentsCount)).append("\n");
    sb.append("    instancesCount: ").append(toIndentedString(instancesCount)).append("\n");
    sb.append("    usedAiCredits: ").append(toIndentedString(usedAiCredits)).append("\n");
    sb.append("    communityGrantLicense: ").append(toIndentedString(communityGrantLicense)).append("\n");
    sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
    sb.append("    perpetual: ").append(toIndentedString(perpetual)).append("\n");
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

    // add `subscriptionId` to the URL query string
    if (getSubscriptionId() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssubscriptionId%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSubscriptionId()))));
    }

    // add `subscriptionPlanName` to the URL query string
    if (getSubscriptionPlanName() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssubscriptionPlanName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSubscriptionPlanName()))));
    }

    // add `planUiType` to the URL query string
    if (getPlanUiType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splanUiType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlanUiType()))));
    }

    // add `currentPeriodStartTs` to the URL query string
    if (getCurrentPeriodStartTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrentPeriodStartTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentPeriodStartTs()))));
    }

    // add `currentPeriodEndTs` to the URL query string
    if (getCurrentPeriodEndTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scurrentPeriodEndTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCurrentPeriodEndTs()))));
    }

    // add `endTs` to the URL query string
    if (getEndTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sendTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEndTs()))));
    }

    // add `upcomingInvoiceDate` to the URL query string
    if (getUpcomingInvoiceDate() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%supcomingInvoiceDate%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUpcomingInvoiceDate()))));
    }

    // add `upcomingInvoiceAmountDue` to the URL query string
    if (getUpcomingInvoiceAmountDue() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%supcomingInvoiceAmountDue%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUpcomingInvoiceAmountDue()))));
    }

    // add `planExtraDeviceEnabled` to the URL query string
    if (getPlanExtraDeviceEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splanExtraDeviceEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlanExtraDeviceEnabled()))));
    }

    // add `planEdgeEnabled` to the URL query string
    if (getPlanEdgeEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splanEdgeEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlanEdgeEnabled()))));
    }

    // add `planExtraEdgeEnabled` to the URL query string
    if (getPlanExtraEdgeEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splanExtraEdgeEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlanExtraEdgeEnabled()))));
    }

    // add `planTrendzEnabled` to the URL query string
    if (getPlanTrendzEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splanTrendzEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlanTrendzEnabled()))));
    }

    // add `planExtraAiCreditsEnabled` to the URL query string
    if (getPlanExtraAiCreditsEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splanExtraAiCreditsEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlanExtraAiCreditsEnabled()))));
    }

    // add `planExtraInstanceEnabled` to the URL query string
    if (getPlanExtraInstanceEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splanExtraInstanceEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlanExtraInstanceEnabled()))));
    }

    // add `planExtraAgentEnabled` to the URL query string
    if (getPlanExtraAgentEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%splanExtraAgentEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPlanExtraAgentEnabled()))));
    }

    // add `dataTs` to the URL query string
    if (getDataTs() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdataTs%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDataTs()))));
    }

    // add `licenseServerEndpoint` to the URL query string
    if (getLicenseServerEndpoint() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%slicenseServerEndpoint%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getLicenseServerEndpoint()))));
    }

    // add `maxDevices` to the URL query string
    if (getMaxDevices() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxDevices%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxDevices()))));
    }

    // add `maxAssets` to the URL query string
    if (getMaxAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxAssets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxAssets()))));
    }

    // add `maxEdges` to the URL query string
    if (getMaxEdges() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxEdges%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxEdges()))));
    }

    // add `maxAgents` to the URL query string
    if (getMaxAgents() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxAgents%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxAgents()))));
    }

    // add `maxInstances` to the URL query string
    if (getMaxInstances() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxInstances%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxInstances()))));
    }

    // add `maxAiCredits` to the URL query string
    if (getMaxAiCredits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxAiCredits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxAiCredits()))));
    }

    // add `whiteLabelingEnabled` to the URL query string
    if (getWhiteLabelingEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%swhiteLabelingEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWhiteLabelingEnabled()))));
    }

    // add `edgeEnabled` to the URL query string
    if (getEdgeEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sedgeEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEdgeEnabled()))));
    }

    // add `trendzEnabled` to the URL query string
    if (getTrendzEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%strendzEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTrendzEnabled()))));
    }

    // add `development` to the URL query string
    if (getDevelopment() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdevelopment%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDevelopment()))));
    }

    // add `nonProduction` to the URL query string
    if (getNonProduction() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%snonProduction%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getNonProduction()))));
    }

    // add `devicesCount` to the URL query string
    if (getDevicesCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdevicesCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDevicesCount()))));
    }

    // add `assetsCount` to the URL query string
    if (getAssetsCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sassetsCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAssetsCount()))));
    }

    // add `edgesCount` to the URL query string
    if (getEdgesCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sedgesCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEdgesCount()))));
    }

    // add `agentsCount` to the URL query string
    if (getAgentsCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sagentsCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAgentsCount()))));
    }

    // add `instancesCount` to the URL query string
    if (getInstancesCount() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sinstancesCount%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getInstancesCount()))));
    }

    // add `usedAiCredits` to the URL query string
    if (getUsedAiCredits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%susedAiCredits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUsedAiCredits()))));
    }

    // add `communityGrantLicense` to the URL query string
    if (getCommunityGrantLicense() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scommunityGrantLicense%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCommunityGrantLicense()))));
    }

    // add `offline` to the URL query string
    if (getOffline() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%soffline%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOffline()))));
    }

    // add `perpetual` to the URL query string
    if (getPerpetual() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sperpetual%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getPerpetual()))));
    }

    return joiner.toString();
  }
}

