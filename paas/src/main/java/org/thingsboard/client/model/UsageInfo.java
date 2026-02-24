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
 * UsageInfo
 */
@JsonPropertyOrder({
  UsageInfo.JSON_PROPERTY_DEVICES,
  UsageInfo.JSON_PROPERTY_MAX_DEVICES,
  UsageInfo.JSON_PROPERTY_ASSETS,
  UsageInfo.JSON_PROPERTY_MAX_ASSETS,
  UsageInfo.JSON_PROPERTY_CUSTOMERS,
  UsageInfo.JSON_PROPERTY_MAX_CUSTOMERS,
  UsageInfo.JSON_PROPERTY_USERS,
  UsageInfo.JSON_PROPERTY_MAX_USERS,
  UsageInfo.JSON_PROPERTY_DASHBOARDS,
  UsageInfo.JSON_PROPERTY_MAX_DASHBOARDS,
  UsageInfo.JSON_PROPERTY_EDGES,
  UsageInfo.JSON_PROPERTY_MAX_EDGES,
  UsageInfo.JSON_PROPERTY_TRANSPORT_MESSAGES,
  UsageInfo.JSON_PROPERTY_MAX_TRANSPORT_MESSAGES,
  UsageInfo.JSON_PROPERTY_JS_EXECUTIONS,
  UsageInfo.JSON_PROPERTY_TBEL_EXECUTIONS,
  UsageInfo.JSON_PROPERTY_MAX_JS_EXECUTIONS,
  UsageInfo.JSON_PROPERTY_MAX_TBEL_EXECUTIONS,
  UsageInfo.JSON_PROPERTY_EMAILS,
  UsageInfo.JSON_PROPERTY_MAX_EMAILS,
  UsageInfo.JSON_PROPERTY_SMS,
  UsageInfo.JSON_PROPERTY_MAX_SMS,
  UsageInfo.JSON_PROPERTY_SMS_ENABLED,
  UsageInfo.JSON_PROPERTY_ALARMS,
  UsageInfo.JSON_PROPERTY_MAX_ALARMS,
  UsageInfo.JSON_PROPERTY_REPORTS,
  UsageInfo.JSON_PROPERTY_MAX_REPORTS,
  UsageInfo.JSON_PROPERTY_AI_CREDITS,
  UsageInfo.JSON_PROPERTY_MAX_AI_CREDITS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-02-24T16:18:03.556877+02:00[Europe/Kiev]", comments = "Generator version: 7.20.0")
public class UsageInfo {
  public static final String JSON_PROPERTY_DEVICES = "devices";
  @javax.annotation.Nullable
  private Long devices;

  public static final String JSON_PROPERTY_MAX_DEVICES = "maxDevices";
  @javax.annotation.Nullable
  private Long maxDevices;

  public static final String JSON_PROPERTY_ASSETS = "assets";
  @javax.annotation.Nullable
  private Long assets;

  public static final String JSON_PROPERTY_MAX_ASSETS = "maxAssets";
  @javax.annotation.Nullable
  private Long maxAssets;

  public static final String JSON_PROPERTY_CUSTOMERS = "customers";
  @javax.annotation.Nullable
  private Long customers;

  public static final String JSON_PROPERTY_MAX_CUSTOMERS = "maxCustomers";
  @javax.annotation.Nullable
  private Long maxCustomers;

  public static final String JSON_PROPERTY_USERS = "users";
  @javax.annotation.Nullable
  private Long users;

  public static final String JSON_PROPERTY_MAX_USERS = "maxUsers";
  @javax.annotation.Nullable
  private Long maxUsers;

  public static final String JSON_PROPERTY_DASHBOARDS = "dashboards";
  @javax.annotation.Nullable
  private Long dashboards;

  public static final String JSON_PROPERTY_MAX_DASHBOARDS = "maxDashboards";
  @javax.annotation.Nullable
  private Long maxDashboards;

  public static final String JSON_PROPERTY_EDGES = "edges";
  @javax.annotation.Nullable
  private Long edges;

  public static final String JSON_PROPERTY_MAX_EDGES = "maxEdges";
  @javax.annotation.Nullable
  private Long maxEdges;

  public static final String JSON_PROPERTY_TRANSPORT_MESSAGES = "transportMessages";
  @javax.annotation.Nullable
  private Long transportMessages;

  public static final String JSON_PROPERTY_MAX_TRANSPORT_MESSAGES = "maxTransportMessages";
  @javax.annotation.Nullable
  private Long maxTransportMessages;

  public static final String JSON_PROPERTY_JS_EXECUTIONS = "jsExecutions";
  @javax.annotation.Nullable
  private Long jsExecutions;

  public static final String JSON_PROPERTY_TBEL_EXECUTIONS = "tbelExecutions";
  @javax.annotation.Nullable
  private Long tbelExecutions;

  public static final String JSON_PROPERTY_MAX_JS_EXECUTIONS = "maxJsExecutions";
  @javax.annotation.Nullable
  private Long maxJsExecutions;

  public static final String JSON_PROPERTY_MAX_TBEL_EXECUTIONS = "maxTbelExecutions";
  @javax.annotation.Nullable
  private Long maxTbelExecutions;

  public static final String JSON_PROPERTY_EMAILS = "emails";
  @javax.annotation.Nullable
  private Long emails;

  public static final String JSON_PROPERTY_MAX_EMAILS = "maxEmails";
  @javax.annotation.Nullable
  private Long maxEmails;

  public static final String JSON_PROPERTY_SMS = "sms";
  @javax.annotation.Nullable
  private Long sms;

  public static final String JSON_PROPERTY_MAX_SMS = "maxSms";
  @javax.annotation.Nullable
  private Long maxSms;

  public static final String JSON_PROPERTY_SMS_ENABLED = "smsEnabled";
  @javax.annotation.Nullable
  private Boolean smsEnabled;

  public static final String JSON_PROPERTY_ALARMS = "alarms";
  @javax.annotation.Nullable
  private Long alarms;

  public static final String JSON_PROPERTY_MAX_ALARMS = "maxAlarms";
  @javax.annotation.Nullable
  private Long maxAlarms;

  public static final String JSON_PROPERTY_REPORTS = "reports";
  @javax.annotation.Nullable
  private Long reports;

  public static final String JSON_PROPERTY_MAX_REPORTS = "maxReports";
  @javax.annotation.Nullable
  private Long maxReports;

  public static final String JSON_PROPERTY_AI_CREDITS = "aiCredits";
  @javax.annotation.Nullable
  private Long aiCredits;

  public static final String JSON_PROPERTY_MAX_AI_CREDITS = "maxAiCredits";
  @javax.annotation.Nullable
  private Long maxAiCredits;

  public UsageInfo() { 
  }

  public UsageInfo devices(@javax.annotation.Nullable Long devices) {
    this.devices = devices;
    return this;
  }

  /**
   * Get devices
   * @return devices
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DEVICES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDevices() {
    return devices;
  }


  @JsonProperty(value = JSON_PROPERTY_DEVICES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevices(@javax.annotation.Nullable Long devices) {
    this.devices = devices;
  }


  public UsageInfo maxDevices(@javax.annotation.Nullable Long maxDevices) {
    this.maxDevices = maxDevices;
    return this;
  }

  /**
   * Get maxDevices
   * @return maxDevices
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_DEVICES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxDevices() {
    return maxDevices;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_DEVICES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxDevices(@javax.annotation.Nullable Long maxDevices) {
    this.maxDevices = maxDevices;
  }


  public UsageInfo assets(@javax.annotation.Nullable Long assets) {
    this.assets = assets;
    return this;
  }

  /**
   * Get assets
   * @return assets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAssets() {
    return assets;
  }


  @JsonProperty(value = JSON_PROPERTY_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssets(@javax.annotation.Nullable Long assets) {
    this.assets = assets;
  }


  public UsageInfo maxAssets(@javax.annotation.Nullable Long maxAssets) {
    this.maxAssets = maxAssets;
    return this;
  }

  /**
   * Get maxAssets
   * @return maxAssets
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxAssets() {
    return maxAssets;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_ASSETS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxAssets(@javax.annotation.Nullable Long maxAssets) {
    this.maxAssets = maxAssets;
  }


  public UsageInfo customers(@javax.annotation.Nullable Long customers) {
    this.customers = customers;
    return this;
  }

  /**
   * Get customers
   * @return customers
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCustomers() {
    return customers;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOMERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomers(@javax.annotation.Nullable Long customers) {
    this.customers = customers;
  }


  public UsageInfo maxCustomers(@javax.annotation.Nullable Long maxCustomers) {
    this.maxCustomers = maxCustomers;
    return this;
  }

  /**
   * Get maxCustomers
   * @return maxCustomers
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_CUSTOMERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxCustomers() {
    return maxCustomers;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_CUSTOMERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxCustomers(@javax.annotation.Nullable Long maxCustomers) {
    this.maxCustomers = maxCustomers;
  }


  public UsageInfo users(@javax.annotation.Nullable Long users) {
    this.users = users;
    return this;
  }

  /**
   * Get users
   * @return users
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_USERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUsers() {
    return users;
  }


  @JsonProperty(value = JSON_PROPERTY_USERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsers(@javax.annotation.Nullable Long users) {
    this.users = users;
  }


  public UsageInfo maxUsers(@javax.annotation.Nullable Long maxUsers) {
    this.maxUsers = maxUsers;
    return this;
  }

  /**
   * Get maxUsers
   * @return maxUsers
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_USERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxUsers() {
    return maxUsers;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_USERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxUsers(@javax.annotation.Nullable Long maxUsers) {
    this.maxUsers = maxUsers;
  }


  public UsageInfo dashboards(@javax.annotation.Nullable Long dashboards) {
    this.dashboards = dashboards;
    return this;
  }

  /**
   * Get dashboards
   * @return dashboards
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DASHBOARDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDashboards() {
    return dashboards;
  }


  @JsonProperty(value = JSON_PROPERTY_DASHBOARDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDashboards(@javax.annotation.Nullable Long dashboards) {
    this.dashboards = dashboards;
  }


  public UsageInfo maxDashboards(@javax.annotation.Nullable Long maxDashboards) {
    this.maxDashboards = maxDashboards;
    return this;
  }

  /**
   * Get maxDashboards
   * @return maxDashboards
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_DASHBOARDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxDashboards() {
    return maxDashboards;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_DASHBOARDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxDashboards(@javax.annotation.Nullable Long maxDashboards) {
    this.maxDashboards = maxDashboards;
  }


  public UsageInfo edges(@javax.annotation.Nullable Long edges) {
    this.edges = edges;
    return this;
  }

  /**
   * Get edges
   * @return edges
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EDGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEdges() {
    return edges;
  }


  @JsonProperty(value = JSON_PROPERTY_EDGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdges(@javax.annotation.Nullable Long edges) {
    this.edges = edges;
  }


  public UsageInfo maxEdges(@javax.annotation.Nullable Long maxEdges) {
    this.maxEdges = maxEdges;
    return this;
  }

  /**
   * Get maxEdges
   * @return maxEdges
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_EDGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxEdges() {
    return maxEdges;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_EDGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxEdges(@javax.annotation.Nullable Long maxEdges) {
    this.maxEdges = maxEdges;
  }


  public UsageInfo transportMessages(@javax.annotation.Nullable Long transportMessages) {
    this.transportMessages = transportMessages;
    return this;
  }

  /**
   * Get transportMessages
   * @return transportMessages
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_MESSAGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTransportMessages() {
    return transportMessages;
  }


  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_MESSAGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportMessages(@javax.annotation.Nullable Long transportMessages) {
    this.transportMessages = transportMessages;
  }


  public UsageInfo maxTransportMessages(@javax.annotation.Nullable Long maxTransportMessages) {
    this.maxTransportMessages = maxTransportMessages;
    return this;
  }

  /**
   * Get maxTransportMessages
   * @return maxTransportMessages
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_TRANSPORT_MESSAGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxTransportMessages() {
    return maxTransportMessages;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_TRANSPORT_MESSAGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxTransportMessages(@javax.annotation.Nullable Long maxTransportMessages) {
    this.maxTransportMessages = maxTransportMessages;
  }


  public UsageInfo jsExecutions(@javax.annotation.Nullable Long jsExecutions) {
    this.jsExecutions = jsExecutions;
    return this;
  }

  /**
   * Get jsExecutions
   * @return jsExecutions
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_JS_EXECUTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getJsExecutions() {
    return jsExecutions;
  }


  @JsonProperty(value = JSON_PROPERTY_JS_EXECUTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJsExecutions(@javax.annotation.Nullable Long jsExecutions) {
    this.jsExecutions = jsExecutions;
  }


  public UsageInfo tbelExecutions(@javax.annotation.Nullable Long tbelExecutions) {
    this.tbelExecutions = tbelExecutions;
    return this;
  }

  /**
   * Get tbelExecutions
   * @return tbelExecutions
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TBEL_EXECUTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTbelExecutions() {
    return tbelExecutions;
  }


  @JsonProperty(value = JSON_PROPERTY_TBEL_EXECUTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTbelExecutions(@javax.annotation.Nullable Long tbelExecutions) {
    this.tbelExecutions = tbelExecutions;
  }


  public UsageInfo maxJsExecutions(@javax.annotation.Nullable Long maxJsExecutions) {
    this.maxJsExecutions = maxJsExecutions;
    return this;
  }

  /**
   * Get maxJsExecutions
   * @return maxJsExecutions
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_JS_EXECUTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxJsExecutions() {
    return maxJsExecutions;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_JS_EXECUTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxJsExecutions(@javax.annotation.Nullable Long maxJsExecutions) {
    this.maxJsExecutions = maxJsExecutions;
  }


  public UsageInfo maxTbelExecutions(@javax.annotation.Nullable Long maxTbelExecutions) {
    this.maxTbelExecutions = maxTbelExecutions;
    return this;
  }

  /**
   * Get maxTbelExecutions
   * @return maxTbelExecutions
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_TBEL_EXECUTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxTbelExecutions() {
    return maxTbelExecutions;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_TBEL_EXECUTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxTbelExecutions(@javax.annotation.Nullable Long maxTbelExecutions) {
    this.maxTbelExecutions = maxTbelExecutions;
  }


  public UsageInfo emails(@javax.annotation.Nullable Long emails) {
    this.emails = emails;
    return this;
  }

  /**
   * Get emails
   * @return emails
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_EMAILS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEmails() {
    return emails;
  }


  @JsonProperty(value = JSON_PROPERTY_EMAILS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmails(@javax.annotation.Nullable Long emails) {
    this.emails = emails;
  }


  public UsageInfo maxEmails(@javax.annotation.Nullable Long maxEmails) {
    this.maxEmails = maxEmails;
    return this;
  }

  /**
   * Get maxEmails
   * @return maxEmails
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_EMAILS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxEmails() {
    return maxEmails;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_EMAILS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxEmails(@javax.annotation.Nullable Long maxEmails) {
    this.maxEmails = maxEmails;
  }


  public UsageInfo sms(@javax.annotation.Nullable Long sms) {
    this.sms = sms;
    return this;
  }

  /**
   * Get sms
   * @return sms
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSms() {
    return sms;
  }


  @JsonProperty(value = JSON_PROPERTY_SMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSms(@javax.annotation.Nullable Long sms) {
    this.sms = sms;
  }


  public UsageInfo maxSms(@javax.annotation.Nullable Long maxSms) {
    this.maxSms = maxSms;
    return this;
  }

  /**
   * Get maxSms
   * @return maxSms
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_SMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxSms() {
    return maxSms;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_SMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxSms(@javax.annotation.Nullable Long maxSms) {
    this.maxSms = maxSms;
  }


  public UsageInfo smsEnabled(@javax.annotation.Nullable Boolean smsEnabled) {
    this.smsEnabled = smsEnabled;
    return this;
  }

  /**
   * Get smsEnabled
   * @return smsEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SMS_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSmsEnabled() {
    return smsEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_SMS_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmsEnabled(@javax.annotation.Nullable Boolean smsEnabled) {
    this.smsEnabled = smsEnabled;
  }


  public UsageInfo alarms(@javax.annotation.Nullable Long alarms) {
    this.alarms = alarms;
    return this;
  }

  /**
   * Get alarms
   * @return alarms
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_ALARMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAlarms() {
    return alarms;
  }


  @JsonProperty(value = JSON_PROPERTY_ALARMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlarms(@javax.annotation.Nullable Long alarms) {
    this.alarms = alarms;
  }


  public UsageInfo maxAlarms(@javax.annotation.Nullable Long maxAlarms) {
    this.maxAlarms = maxAlarms;
    return this;
  }

  /**
   * Get maxAlarms
   * @return maxAlarms
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_ALARMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxAlarms() {
    return maxAlarms;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_ALARMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxAlarms(@javax.annotation.Nullable Long maxAlarms) {
    this.maxAlarms = maxAlarms;
  }


  public UsageInfo reports(@javax.annotation.Nullable Long reports) {
    this.reports = reports;
    return this;
  }

  /**
   * Get reports
   * @return reports
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_REPORTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getReports() {
    return reports;
  }


  @JsonProperty(value = JSON_PROPERTY_REPORTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReports(@javax.annotation.Nullable Long reports) {
    this.reports = reports;
  }


  public UsageInfo maxReports(@javax.annotation.Nullable Long maxReports) {
    this.maxReports = maxReports;
    return this;
  }

  /**
   * Get maxReports
   * @return maxReports
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_REPORTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxReports() {
    return maxReports;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_REPORTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxReports(@javax.annotation.Nullable Long maxReports) {
    this.maxReports = maxReports;
  }


  public UsageInfo aiCredits(@javax.annotation.Nullable Long aiCredits) {
    this.aiCredits = aiCredits;
    return this;
  }

  /**
   * Get aiCredits
   * @return aiCredits
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_AI_CREDITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAiCredits() {
    return aiCredits;
  }


  @JsonProperty(value = JSON_PROPERTY_AI_CREDITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAiCredits(@javax.annotation.Nullable Long aiCredits) {
    this.aiCredits = aiCredits;
  }


  public UsageInfo maxAiCredits(@javax.annotation.Nullable Long maxAiCredits) {
    this.maxAiCredits = maxAiCredits;
    return this;
  }

  /**
   * Get maxAiCredits
   * @return maxAiCredits
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_AI_CREDITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxAiCredits() {
    return maxAiCredits;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_AI_CREDITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxAiCredits(@javax.annotation.Nullable Long maxAiCredits) {
    this.maxAiCredits = maxAiCredits;
  }


  /**
   * Return true if this UsageInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageInfo usageInfo = (UsageInfo) o;
    return Objects.equals(this.devices, usageInfo.devices) &&
        Objects.equals(this.maxDevices, usageInfo.maxDevices) &&
        Objects.equals(this.assets, usageInfo.assets) &&
        Objects.equals(this.maxAssets, usageInfo.maxAssets) &&
        Objects.equals(this.customers, usageInfo.customers) &&
        Objects.equals(this.maxCustomers, usageInfo.maxCustomers) &&
        Objects.equals(this.users, usageInfo.users) &&
        Objects.equals(this.maxUsers, usageInfo.maxUsers) &&
        Objects.equals(this.dashboards, usageInfo.dashboards) &&
        Objects.equals(this.maxDashboards, usageInfo.maxDashboards) &&
        Objects.equals(this.edges, usageInfo.edges) &&
        Objects.equals(this.maxEdges, usageInfo.maxEdges) &&
        Objects.equals(this.transportMessages, usageInfo.transportMessages) &&
        Objects.equals(this.maxTransportMessages, usageInfo.maxTransportMessages) &&
        Objects.equals(this.jsExecutions, usageInfo.jsExecutions) &&
        Objects.equals(this.tbelExecutions, usageInfo.tbelExecutions) &&
        Objects.equals(this.maxJsExecutions, usageInfo.maxJsExecutions) &&
        Objects.equals(this.maxTbelExecutions, usageInfo.maxTbelExecutions) &&
        Objects.equals(this.emails, usageInfo.emails) &&
        Objects.equals(this.maxEmails, usageInfo.maxEmails) &&
        Objects.equals(this.sms, usageInfo.sms) &&
        Objects.equals(this.maxSms, usageInfo.maxSms) &&
        Objects.equals(this.smsEnabled, usageInfo.smsEnabled) &&
        Objects.equals(this.alarms, usageInfo.alarms) &&
        Objects.equals(this.maxAlarms, usageInfo.maxAlarms) &&
        Objects.equals(this.reports, usageInfo.reports) &&
        Objects.equals(this.maxReports, usageInfo.maxReports) &&
        Objects.equals(this.aiCredits, usageInfo.aiCredits) &&
        Objects.equals(this.maxAiCredits, usageInfo.maxAiCredits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devices, maxDevices, assets, maxAssets, customers, maxCustomers, users, maxUsers, dashboards, maxDashboards, edges, maxEdges, transportMessages, maxTransportMessages, jsExecutions, tbelExecutions, maxJsExecutions, maxTbelExecutions, emails, maxEmails, sms, maxSms, smsEnabled, alarms, maxAlarms, reports, maxReports, aiCredits, maxAiCredits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageInfo {\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    maxDevices: ").append(toIndentedString(maxDevices)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    maxAssets: ").append(toIndentedString(maxAssets)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    maxCustomers: ").append(toIndentedString(maxCustomers)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    maxUsers: ").append(toIndentedString(maxUsers)).append("\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
    sb.append("    maxDashboards: ").append(toIndentedString(maxDashboards)).append("\n");
    sb.append("    edges: ").append(toIndentedString(edges)).append("\n");
    sb.append("    maxEdges: ").append(toIndentedString(maxEdges)).append("\n");
    sb.append("    transportMessages: ").append(toIndentedString(transportMessages)).append("\n");
    sb.append("    maxTransportMessages: ").append(toIndentedString(maxTransportMessages)).append("\n");
    sb.append("    jsExecutions: ").append(toIndentedString(jsExecutions)).append("\n");
    sb.append("    tbelExecutions: ").append(toIndentedString(tbelExecutions)).append("\n");
    sb.append("    maxJsExecutions: ").append(toIndentedString(maxJsExecutions)).append("\n");
    sb.append("    maxTbelExecutions: ").append(toIndentedString(maxTbelExecutions)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    maxEmails: ").append(toIndentedString(maxEmails)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    maxSms: ").append(toIndentedString(maxSms)).append("\n");
    sb.append("    smsEnabled: ").append(toIndentedString(smsEnabled)).append("\n");
    sb.append("    alarms: ").append(toIndentedString(alarms)).append("\n");
    sb.append("    maxAlarms: ").append(toIndentedString(maxAlarms)).append("\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
    sb.append("    maxReports: ").append(toIndentedString(maxReports)).append("\n");
    sb.append("    aiCredits: ").append(toIndentedString(aiCredits)).append("\n");
    sb.append("    maxAiCredits: ").append(toIndentedString(maxAiCredits)).append("\n");
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

    // add `devices` to the URL query string
    if (getDevices() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdevices%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDevices()))));
    }

    // add `maxDevices` to the URL query string
    if (getMaxDevices() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxDevices%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxDevices()))));
    }

    // add `assets` to the URL query string
    if (getAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sassets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAssets()))));
    }

    // add `maxAssets` to the URL query string
    if (getMaxAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxAssets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxAssets()))));
    }

    // add `customers` to the URL query string
    if (getCustomers() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomers%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomers()))));
    }

    // add `maxCustomers` to the URL query string
    if (getMaxCustomers() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxCustomers%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxCustomers()))));
    }

    // add `users` to the URL query string
    if (getUsers() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%susers%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUsers()))));
    }

    // add `maxUsers` to the URL query string
    if (getMaxUsers() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxUsers%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxUsers()))));
    }

    // add `dashboards` to the URL query string
    if (getDashboards() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdashboards%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDashboards()))));
    }

    // add `maxDashboards` to the URL query string
    if (getMaxDashboards() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxDashboards%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxDashboards()))));
    }

    // add `edges` to the URL query string
    if (getEdges() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sedges%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEdges()))));
    }

    // add `maxEdges` to the URL query string
    if (getMaxEdges() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxEdges%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxEdges()))));
    }

    // add `transportMessages` to the URL query string
    if (getTransportMessages() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stransportMessages%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransportMessages()))));
    }

    // add `maxTransportMessages` to the URL query string
    if (getMaxTransportMessages() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxTransportMessages%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxTransportMessages()))));
    }

    // add `jsExecutions` to the URL query string
    if (getJsExecutions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sjsExecutions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getJsExecutions()))));
    }

    // add `tbelExecutions` to the URL query string
    if (getTbelExecutions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stbelExecutions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTbelExecutions()))));
    }

    // add `maxJsExecutions` to the URL query string
    if (getMaxJsExecutions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxJsExecutions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxJsExecutions()))));
    }

    // add `maxTbelExecutions` to the URL query string
    if (getMaxTbelExecutions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxTbelExecutions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxTbelExecutions()))));
    }

    // add `emails` to the URL query string
    if (getEmails() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%semails%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEmails()))));
    }

    // add `maxEmails` to the URL query string
    if (getMaxEmails() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxEmails%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxEmails()))));
    }

    // add `sms` to the URL query string
    if (getSms() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssms%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSms()))));
    }

    // add `maxSms` to the URL query string
    if (getMaxSms() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxSms%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxSms()))));
    }

    // add `smsEnabled` to the URL query string
    if (getSmsEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssmsEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSmsEnabled()))));
    }

    // add `alarms` to the URL query string
    if (getAlarms() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%salarms%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAlarms()))));
    }

    // add `maxAlarms` to the URL query string
    if (getMaxAlarms() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxAlarms%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxAlarms()))));
    }

    // add `reports` to the URL query string
    if (getReports() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreports%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReports()))));
    }

    // add `maxReports` to the URL query string
    if (getMaxReports() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxReports%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxReports()))));
    }

    // add `aiCredits` to the URL query string
    if (getAiCredits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saiCredits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAiCredits()))));
    }

    // add `maxAiCredits` to the URL query string
    if (getMaxAiCredits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxAiCredits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxAiCredits()))));
    }

    return joiner.toString();
  }
}

