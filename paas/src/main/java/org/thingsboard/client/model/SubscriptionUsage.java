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
 * SubscriptionUsage
 */
@JsonPropertyOrder({
  SubscriptionUsage.JSON_PROPERTY_DEVICES,
  SubscriptionUsage.JSON_PROPERTY_ASSETS,
  SubscriptionUsage.JSON_PROPERTY_CUSTOMERS,
  SubscriptionUsage.JSON_PROPERTY_USERS,
  SubscriptionUsage.JSON_PROPERTY_DASHBOARDS,
  SubscriptionUsage.JSON_PROPERTY_RULE_CHAINS,
  SubscriptionUsage.JSON_PROPERTY_INTEGRATIONS,
  SubscriptionUsage.JSON_PROPERTY_CONVERTERS,
  SubscriptionUsage.JSON_PROPERTY_SCHEDULER_EVENTS,
  SubscriptionUsage.JSON_PROPERTY_EDGES,
  SubscriptionUsage.JSON_PROPERTY_TRANSPORT_MESSAGES,
  SubscriptionUsage.JSON_PROPERTY_TRANSPORT_DATA_POINTS,
  SubscriptionUsage.JSON_PROPERTY_RE_EXECUTIONS,
  SubscriptionUsage.JSON_PROPERTY_JS_EXECUTIONS,
  SubscriptionUsage.JSON_PROPERTY_DP_STORAGE_DAYS,
  SubscriptionUsage.JSON_PROPERTY_EMAILS,
  SubscriptionUsage.JSON_PROPERTY_SMS,
  SubscriptionUsage.JSON_PROPERTY_ALARMS,
  SubscriptionUsage.JSON_PROPERTY_REPORTS,
  SubscriptionUsage.JSON_PROPERTY_AI_CREDITS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class SubscriptionUsage {
  public static final String JSON_PROPERTY_DEVICES = "devices";
  @javax.annotation.Nullable
  private Long devices;

  public static final String JSON_PROPERTY_ASSETS = "assets";
  @javax.annotation.Nullable
  private Long assets;

  public static final String JSON_PROPERTY_CUSTOMERS = "customers";
  @javax.annotation.Nullable
  private Long customers;

  public static final String JSON_PROPERTY_USERS = "users";
  @javax.annotation.Nullable
  private Long users;

  public static final String JSON_PROPERTY_DASHBOARDS = "dashboards";
  @javax.annotation.Nullable
  private Long dashboards;

  public static final String JSON_PROPERTY_RULE_CHAINS = "ruleChains";
  @javax.annotation.Nullable
  private Long ruleChains;

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  @javax.annotation.Nullable
  private Long integrations;

  public static final String JSON_PROPERTY_CONVERTERS = "converters";
  @javax.annotation.Nullable
  private Long converters;

  public static final String JSON_PROPERTY_SCHEDULER_EVENTS = "schedulerEvents";
  @javax.annotation.Nullable
  private Long schedulerEvents;

  public static final String JSON_PROPERTY_EDGES = "edges";
  @javax.annotation.Nullable
  private Long edges;

  public static final String JSON_PROPERTY_TRANSPORT_MESSAGES = "transportMessages";
  @javax.annotation.Nullable
  private Long transportMessages;

  public static final String JSON_PROPERTY_TRANSPORT_DATA_POINTS = "transportDataPoints";
  @javax.annotation.Nullable
  private Long transportDataPoints;

  public static final String JSON_PROPERTY_RE_EXECUTIONS = "reExecutions";
  @javax.annotation.Nullable
  private Long reExecutions;

  public static final String JSON_PROPERTY_JS_EXECUTIONS = "jsExecutions";
  @javax.annotation.Nullable
  private Long jsExecutions;

  public static final String JSON_PROPERTY_DP_STORAGE_DAYS = "dpStorageDays";
  @javax.annotation.Nullable
  private Long dpStorageDays;

  public static final String JSON_PROPERTY_EMAILS = "emails";
  @javax.annotation.Nullable
  private Long emails;

  public static final String JSON_PROPERTY_SMS = "sms";
  @javax.annotation.Nullable
  private Long sms;

  public static final String JSON_PROPERTY_ALARMS = "alarms";
  @javax.annotation.Nullable
  private Long alarms;

  public static final String JSON_PROPERTY_REPORTS = "reports";
  @javax.annotation.Nullable
  private Long reports;

  public static final String JSON_PROPERTY_AI_CREDITS = "aiCredits";
  @javax.annotation.Nullable
  private Long aiCredits;

  public SubscriptionUsage() { 
  }

  public SubscriptionUsage devices(@javax.annotation.Nullable Long devices) {
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


  public SubscriptionUsage assets(@javax.annotation.Nullable Long assets) {
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


  public SubscriptionUsage customers(@javax.annotation.Nullable Long customers) {
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


  public SubscriptionUsage users(@javax.annotation.Nullable Long users) {
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


  public SubscriptionUsage dashboards(@javax.annotation.Nullable Long dashboards) {
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


  public SubscriptionUsage ruleChains(@javax.annotation.Nullable Long ruleChains) {
    this.ruleChains = ruleChains;
    return this;
  }

  /**
   * Get ruleChains
   * @return ruleChains
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RULE_CHAINS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRuleChains() {
    return ruleChains;
  }


  @JsonProperty(value = JSON_PROPERTY_RULE_CHAINS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleChains(@javax.annotation.Nullable Long ruleChains) {
    this.ruleChains = ruleChains;
  }


  public SubscriptionUsage integrations(@javax.annotation.Nullable Long integrations) {
    this.integrations = integrations;
    return this;
  }

  /**
   * Get integrations
   * @return integrations
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEGRATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIntegrations() {
    return integrations;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEGRATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrations(@javax.annotation.Nullable Long integrations) {
    this.integrations = integrations;
  }


  public SubscriptionUsage converters(@javax.annotation.Nullable Long converters) {
    this.converters = converters;
    return this;
  }

  /**
   * Get converters
   * @return converters
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_CONVERTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getConverters() {
    return converters;
  }


  @JsonProperty(value = JSON_PROPERTY_CONVERTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConverters(@javax.annotation.Nullable Long converters) {
    this.converters = converters;
  }


  public SubscriptionUsage schedulerEvents(@javax.annotation.Nullable Long schedulerEvents) {
    this.schedulerEvents = schedulerEvents;
    return this;
  }

  /**
   * Get schedulerEvents
   * @return schedulerEvents
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_SCHEDULER_EVENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSchedulerEvents() {
    return schedulerEvents;
  }


  @JsonProperty(value = JSON_PROPERTY_SCHEDULER_EVENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedulerEvents(@javax.annotation.Nullable Long schedulerEvents) {
    this.schedulerEvents = schedulerEvents;
  }


  public SubscriptionUsage edges(@javax.annotation.Nullable Long edges) {
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


  public SubscriptionUsage transportMessages(@javax.annotation.Nullable Long transportMessages) {
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


  public SubscriptionUsage transportDataPoints(@javax.annotation.Nullable Long transportDataPoints) {
    this.transportDataPoints = transportDataPoints;
    return this;
  }

  /**
   * Get transportDataPoints
   * @return transportDataPoints
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_DATA_POINTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTransportDataPoints() {
    return transportDataPoints;
  }


  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_DATA_POINTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportDataPoints(@javax.annotation.Nullable Long transportDataPoints) {
    this.transportDataPoints = transportDataPoints;
  }


  public SubscriptionUsage reExecutions(@javax.annotation.Nullable Long reExecutions) {
    this.reExecutions = reExecutions;
    return this;
  }

  /**
   * Get reExecutions
   * @return reExecutions
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_RE_EXECUTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getReExecutions() {
    return reExecutions;
  }


  @JsonProperty(value = JSON_PROPERTY_RE_EXECUTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReExecutions(@javax.annotation.Nullable Long reExecutions) {
    this.reExecutions = reExecutions;
  }


  public SubscriptionUsage jsExecutions(@javax.annotation.Nullable Long jsExecutions) {
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


  public SubscriptionUsage dpStorageDays(@javax.annotation.Nullable Long dpStorageDays) {
    this.dpStorageDays = dpStorageDays;
    return this;
  }

  /**
   * Get dpStorageDays
   * @return dpStorageDays
   */
  @javax.annotation.Nullable
  @JsonProperty(value = JSON_PROPERTY_DP_STORAGE_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDpStorageDays() {
    return dpStorageDays;
  }


  @JsonProperty(value = JSON_PROPERTY_DP_STORAGE_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDpStorageDays(@javax.annotation.Nullable Long dpStorageDays) {
    this.dpStorageDays = dpStorageDays;
  }


  public SubscriptionUsage emails(@javax.annotation.Nullable Long emails) {
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


  public SubscriptionUsage sms(@javax.annotation.Nullable Long sms) {
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


  public SubscriptionUsage alarms(@javax.annotation.Nullable Long alarms) {
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


  public SubscriptionUsage reports(@javax.annotation.Nullable Long reports) {
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


  public SubscriptionUsage aiCredits(@javax.annotation.Nullable Long aiCredits) {
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


  /**
   * Return true if this SubscriptionUsage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionUsage subscriptionUsage = (SubscriptionUsage) o;
    return Objects.equals(this.devices, subscriptionUsage.devices) &&
        Objects.equals(this.assets, subscriptionUsage.assets) &&
        Objects.equals(this.customers, subscriptionUsage.customers) &&
        Objects.equals(this.users, subscriptionUsage.users) &&
        Objects.equals(this.dashboards, subscriptionUsage.dashboards) &&
        Objects.equals(this.ruleChains, subscriptionUsage.ruleChains) &&
        Objects.equals(this.integrations, subscriptionUsage.integrations) &&
        Objects.equals(this.converters, subscriptionUsage.converters) &&
        Objects.equals(this.schedulerEvents, subscriptionUsage.schedulerEvents) &&
        Objects.equals(this.edges, subscriptionUsage.edges) &&
        Objects.equals(this.transportMessages, subscriptionUsage.transportMessages) &&
        Objects.equals(this.transportDataPoints, subscriptionUsage.transportDataPoints) &&
        Objects.equals(this.reExecutions, subscriptionUsage.reExecutions) &&
        Objects.equals(this.jsExecutions, subscriptionUsage.jsExecutions) &&
        Objects.equals(this.dpStorageDays, subscriptionUsage.dpStorageDays) &&
        Objects.equals(this.emails, subscriptionUsage.emails) &&
        Objects.equals(this.sms, subscriptionUsage.sms) &&
        Objects.equals(this.alarms, subscriptionUsage.alarms) &&
        Objects.equals(this.reports, subscriptionUsage.reports) &&
        Objects.equals(this.aiCredits, subscriptionUsage.aiCredits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devices, assets, customers, users, dashboards, ruleChains, integrations, converters, schedulerEvents, edges, transportMessages, transportDataPoints, reExecutions, jsExecutions, dpStorageDays, emails, sms, alarms, reports, aiCredits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionUsage {\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
    sb.append("    ruleChains: ").append(toIndentedString(ruleChains)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    converters: ").append(toIndentedString(converters)).append("\n");
    sb.append("    schedulerEvents: ").append(toIndentedString(schedulerEvents)).append("\n");
    sb.append("    edges: ").append(toIndentedString(edges)).append("\n");
    sb.append("    transportMessages: ").append(toIndentedString(transportMessages)).append("\n");
    sb.append("    transportDataPoints: ").append(toIndentedString(transportDataPoints)).append("\n");
    sb.append("    reExecutions: ").append(toIndentedString(reExecutions)).append("\n");
    sb.append("    jsExecutions: ").append(toIndentedString(jsExecutions)).append("\n");
    sb.append("    dpStorageDays: ").append(toIndentedString(dpStorageDays)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    alarms: ").append(toIndentedString(alarms)).append("\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
    sb.append("    aiCredits: ").append(toIndentedString(aiCredits)).append("\n");
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

    // add `assets` to the URL query string
    if (getAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sassets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAssets()))));
    }

    // add `customers` to the URL query string
    if (getCustomers() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomers%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomers()))));
    }

    // add `users` to the URL query string
    if (getUsers() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%susers%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getUsers()))));
    }

    // add `dashboards` to the URL query string
    if (getDashboards() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdashboards%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDashboards()))));
    }

    // add `ruleChains` to the URL query string
    if (getRuleChains() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sruleChains%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRuleChains()))));
    }

    // add `integrations` to the URL query string
    if (getIntegrations() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sintegrations%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIntegrations()))));
    }

    // add `converters` to the URL query string
    if (getConverters() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sconverters%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getConverters()))));
    }

    // add `schedulerEvents` to the URL query string
    if (getSchedulerEvents() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sschedulerEvents%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSchedulerEvents()))));
    }

    // add `edges` to the URL query string
    if (getEdges() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sedges%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEdges()))));
    }

    // add `transportMessages` to the URL query string
    if (getTransportMessages() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stransportMessages%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransportMessages()))));
    }

    // add `transportDataPoints` to the URL query string
    if (getTransportDataPoints() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stransportDataPoints%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransportDataPoints()))));
    }

    // add `reExecutions` to the URL query string
    if (getReExecutions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreExecutions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReExecutions()))));
    }

    // add `jsExecutions` to the URL query string
    if (getJsExecutions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sjsExecutions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getJsExecutions()))));
    }

    // add `dpStorageDays` to the URL query string
    if (getDpStorageDays() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdpStorageDays%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDpStorageDays()))));
    }

    // add `emails` to the URL query string
    if (getEmails() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%semails%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEmails()))));
    }

    // add `sms` to the URL query string
    if (getSms() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssms%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSms()))));
    }

    // add `alarms` to the URL query string
    if (getAlarms() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%salarms%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAlarms()))));
    }

    // add `reports` to the URL query string
    if (getReports() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreports%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReports()))));
    }

    // add `aiCredits` to the URL query string
    if (getAiCredits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%saiCredits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAiCredits()))));
    }

    return joiner.toString();
  }
}

