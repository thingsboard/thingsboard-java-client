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
 * TenantAddonData
 */
@JsonPropertyOrder({
  TenantAddonData.JSON_PROPERTY_MAX_DEVICES,
  TenantAddonData.JSON_PROPERTY_MAX_ASSETS,
  TenantAddonData.JSON_PROPERTY_MAX_CUSTOMERS,
  TenantAddonData.JSON_PROPERTY_MAX_USERS,
  TenantAddonData.JSON_PROPERTY_MAX_INTEGRATIONS,
  TenantAddonData.JSON_PROPERTY_MAX_CONVERTERS,
  TenantAddonData.JSON_PROPERTY_MAX_CALCULATED_FIELDS_PER_ENTITY,
  TenantAddonData.JSON_PROPERTY_MAX_TRANSPORT_MESSAGES,
  TenantAddonData.JSON_PROPERTY_MAX_TRANSPORT_DATA_POINTS,
  TenantAddonData.JSON_PROPERTY_MAX_R_E_EXECUTIONS,
  TenantAddonData.JSON_PROPERTY_MAX_J_S_EXECUTIONS,
  TenantAddonData.JSON_PROPERTY_MAX_D_P_STORAGE_DAYS,
  TenantAddonData.JSON_PROPERTY_MAX_CREATED_ALARMS,
  TenantAddonData.JSON_PROPERTY_MAX_EMAILS,
  TenantAddonData.JSON_PROPERTY_MAX_SMS,
  TenantAddonData.JSON_PROPERTY_MAX_AI_CREDITS,
  TenantAddonData.JSON_PROPERTY_EDGE_ENABLED,
  TenantAddonData.JSON_PROPERTY_MAX_EDGES,
  TenantAddonData.JSON_PROPERTY_TRENDZ_ENABLED,
  TenantAddonData.JSON_PROPERTY_WHITE_LABELING_ENABLED,
  TenantAddonData.JSON_PROPERTY_DEFAULT
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
public class TenantAddonData {
  public static final String JSON_PROPERTY_MAX_DEVICES = "maxDevices";
  @Nullable
  private Long maxDevices;

  public static final String JSON_PROPERTY_MAX_ASSETS = "maxAssets";
  @Nullable
  private Long maxAssets;

  public static final String JSON_PROPERTY_MAX_CUSTOMERS = "maxCustomers";
  @Nullable
  private Long maxCustomers;

  public static final String JSON_PROPERTY_MAX_USERS = "maxUsers";
  @Nullable
  private Long maxUsers;

  public static final String JSON_PROPERTY_MAX_INTEGRATIONS = "maxIntegrations";
  @Nullable
  private Long maxIntegrations;

  public static final String JSON_PROPERTY_MAX_CONVERTERS = "maxConverters";
  @Nullable
  private Long maxConverters;

  public static final String JSON_PROPERTY_MAX_CALCULATED_FIELDS_PER_ENTITY = "maxCalculatedFieldsPerEntity";
  @Nullable
  private Long maxCalculatedFieldsPerEntity;

  public static final String JSON_PROPERTY_MAX_TRANSPORT_MESSAGES = "maxTransportMessages";
  @Nullable
  private Long maxTransportMessages;

  public static final String JSON_PROPERTY_MAX_TRANSPORT_DATA_POINTS = "maxTransportDataPoints";
  @Nullable
  private Long maxTransportDataPoints;

  public static final String JSON_PROPERTY_MAX_R_E_EXECUTIONS = "maxREExecutions";
  @Nullable
  private Long maxREExecutions;

  public static final String JSON_PROPERTY_MAX_J_S_EXECUTIONS = "maxJSExecutions";
  @Nullable
  private Long maxJSExecutions;

  public static final String JSON_PROPERTY_MAX_D_P_STORAGE_DAYS = "maxDPStorageDays";
  @Nullable
  private Long maxDPStorageDays;

  public static final String JSON_PROPERTY_MAX_CREATED_ALARMS = "maxCreatedAlarms";
  @Nullable
  private Long maxCreatedAlarms;

  public static final String JSON_PROPERTY_MAX_EMAILS = "maxEmails";
  @Nullable
  private Long maxEmails;

  public static final String JSON_PROPERTY_MAX_SMS = "maxSms";
  @Nullable
  private Long maxSms;

  public static final String JSON_PROPERTY_MAX_AI_CREDITS = "maxAiCredits";
  @Nullable
  private Long maxAiCredits;

  public static final String JSON_PROPERTY_EDGE_ENABLED = "edgeEnabled";
  @Nullable
  private Boolean edgeEnabled;

  public static final String JSON_PROPERTY_MAX_EDGES = "maxEdges";
  @Nullable
  private Long maxEdges;

  public static final String JSON_PROPERTY_TRENDZ_ENABLED = "trendzEnabled";
  @Nullable
  private Boolean trendzEnabled;

  public static final String JSON_PROPERTY_WHITE_LABELING_ENABLED = "whiteLabelingEnabled";
  @Nullable
  private Boolean whiteLabelingEnabled;

  public static final String JSON_PROPERTY_DEFAULT = "default";
  @Nullable
  private Boolean _default;

  public TenantAddonData() { 
  }

  public TenantAddonData maxDevices(@Nullable Long maxDevices) {
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


  public TenantAddonData maxAssets(@Nullable Long maxAssets) {
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


  public TenantAddonData maxCustomers(@Nullable Long maxCustomers) {
    this.maxCustomers = maxCustomers;
    return this;
  }

  /**
   * Get maxCustomers
   * @return maxCustomers
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_CUSTOMERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxCustomers() {
    return maxCustomers;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_CUSTOMERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxCustomers(@Nullable Long maxCustomers) {
    this.maxCustomers = maxCustomers;
  }


  public TenantAddonData maxUsers(@Nullable Long maxUsers) {
    this.maxUsers = maxUsers;
    return this;
  }

  /**
   * Get maxUsers
   * @return maxUsers
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_USERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxUsers() {
    return maxUsers;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_USERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxUsers(@Nullable Long maxUsers) {
    this.maxUsers = maxUsers;
  }


  public TenantAddonData maxIntegrations(@Nullable Long maxIntegrations) {
    this.maxIntegrations = maxIntegrations;
    return this;
  }

  /**
   * Get maxIntegrations
   * @return maxIntegrations
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_INTEGRATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxIntegrations() {
    return maxIntegrations;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_INTEGRATIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxIntegrations(@Nullable Long maxIntegrations) {
    this.maxIntegrations = maxIntegrations;
  }


  public TenantAddonData maxConverters(@Nullable Long maxConverters) {
    this.maxConverters = maxConverters;
    return this;
  }

  /**
   * Get maxConverters
   * @return maxConverters
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_CONVERTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxConverters() {
    return maxConverters;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_CONVERTERS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxConverters(@Nullable Long maxConverters) {
    this.maxConverters = maxConverters;
  }


  public TenantAddonData maxCalculatedFieldsPerEntity(@Nullable Long maxCalculatedFieldsPerEntity) {
    this.maxCalculatedFieldsPerEntity = maxCalculatedFieldsPerEntity;
    return this;
  }

  /**
   * Get maxCalculatedFieldsPerEntity
   * @return maxCalculatedFieldsPerEntity
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_CALCULATED_FIELDS_PER_ENTITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxCalculatedFieldsPerEntity() {
    return maxCalculatedFieldsPerEntity;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_CALCULATED_FIELDS_PER_ENTITY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxCalculatedFieldsPerEntity(@Nullable Long maxCalculatedFieldsPerEntity) {
    this.maxCalculatedFieldsPerEntity = maxCalculatedFieldsPerEntity;
  }


  public TenantAddonData maxTransportMessages(@Nullable Long maxTransportMessages) {
    this.maxTransportMessages = maxTransportMessages;
    return this;
  }

  /**
   * Get maxTransportMessages
   * @return maxTransportMessages
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_TRANSPORT_MESSAGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxTransportMessages() {
    return maxTransportMessages;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_TRANSPORT_MESSAGES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxTransportMessages(@Nullable Long maxTransportMessages) {
    this.maxTransportMessages = maxTransportMessages;
  }


  public TenantAddonData maxTransportDataPoints(@Nullable Long maxTransportDataPoints) {
    this.maxTransportDataPoints = maxTransportDataPoints;
    return this;
  }

  /**
   * Get maxTransportDataPoints
   * @return maxTransportDataPoints
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_TRANSPORT_DATA_POINTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxTransportDataPoints() {
    return maxTransportDataPoints;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_TRANSPORT_DATA_POINTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxTransportDataPoints(@Nullable Long maxTransportDataPoints) {
    this.maxTransportDataPoints = maxTransportDataPoints;
  }


  public TenantAddonData maxREExecutions(@Nullable Long maxREExecutions) {
    this.maxREExecutions = maxREExecutions;
    return this;
  }

  /**
   * Get maxREExecutions
   * @return maxREExecutions
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_R_E_EXECUTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxREExecutions() {
    return maxREExecutions;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_R_E_EXECUTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxREExecutions(@Nullable Long maxREExecutions) {
    this.maxREExecutions = maxREExecutions;
  }


  public TenantAddonData maxJSExecutions(@Nullable Long maxJSExecutions) {
    this.maxJSExecutions = maxJSExecutions;
    return this;
  }

  /**
   * Get maxJSExecutions
   * @return maxJSExecutions
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_J_S_EXECUTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxJSExecutions() {
    return maxJSExecutions;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_J_S_EXECUTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxJSExecutions(@Nullable Long maxJSExecutions) {
    this.maxJSExecutions = maxJSExecutions;
  }


  public TenantAddonData maxDPStorageDays(@Nullable Long maxDPStorageDays) {
    this.maxDPStorageDays = maxDPStorageDays;
    return this;
  }

  /**
   * Get maxDPStorageDays
   * @return maxDPStorageDays
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_D_P_STORAGE_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxDPStorageDays() {
    return maxDPStorageDays;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_D_P_STORAGE_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxDPStorageDays(@Nullable Long maxDPStorageDays) {
    this.maxDPStorageDays = maxDPStorageDays;
  }


  public TenantAddonData maxCreatedAlarms(@Nullable Long maxCreatedAlarms) {
    this.maxCreatedAlarms = maxCreatedAlarms;
    return this;
  }

  /**
   * Get maxCreatedAlarms
   * @return maxCreatedAlarms
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_CREATED_ALARMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxCreatedAlarms() {
    return maxCreatedAlarms;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_CREATED_ALARMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxCreatedAlarms(@Nullable Long maxCreatedAlarms) {
    this.maxCreatedAlarms = maxCreatedAlarms;
  }


  public TenantAddonData maxEmails(@Nullable Long maxEmails) {
    this.maxEmails = maxEmails;
    return this;
  }

  /**
   * Get maxEmails
   * @return maxEmails
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_EMAILS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxEmails() {
    return maxEmails;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_EMAILS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxEmails(@Nullable Long maxEmails) {
    this.maxEmails = maxEmails;
  }


  public TenantAddonData maxSms(@Nullable Long maxSms) {
    this.maxSms = maxSms;
    return this;
  }

  /**
   * Get maxSms
   * @return maxSms
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_SMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxSms() {
    return maxSms;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_SMS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxSms(@Nullable Long maxSms) {
    this.maxSms = maxSms;
  }


  public TenantAddonData maxAiCredits(@Nullable Long maxAiCredits) {
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


  public TenantAddonData edgeEnabled(@Nullable Boolean edgeEnabled) {
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


  public TenantAddonData maxEdges(@Nullable Long maxEdges) {
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


  public TenantAddonData trendzEnabled(@Nullable Boolean trendzEnabled) {
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


  public TenantAddonData whiteLabelingEnabled(@Nullable Boolean whiteLabelingEnabled) {
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


  public TenantAddonData _default(@Nullable Boolean _default) {
    this._default = _default;
    return this;
  }

  /**
   * Get _default
   * @return _default
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDefault() {
    return _default;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefault(@Nullable Boolean _default) {
    this._default = _default;
  }


  /**
   * Return true if this TenantAddonData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantAddonData tenantAddonData = (TenantAddonData) o;
    return Objects.equals(this.maxDevices, tenantAddonData.maxDevices) &&
        Objects.equals(this.maxAssets, tenantAddonData.maxAssets) &&
        Objects.equals(this.maxCustomers, tenantAddonData.maxCustomers) &&
        Objects.equals(this.maxUsers, tenantAddonData.maxUsers) &&
        Objects.equals(this.maxIntegrations, tenantAddonData.maxIntegrations) &&
        Objects.equals(this.maxConverters, tenantAddonData.maxConverters) &&
        Objects.equals(this.maxCalculatedFieldsPerEntity, tenantAddonData.maxCalculatedFieldsPerEntity) &&
        Objects.equals(this.maxTransportMessages, tenantAddonData.maxTransportMessages) &&
        Objects.equals(this.maxTransportDataPoints, tenantAddonData.maxTransportDataPoints) &&
        Objects.equals(this.maxREExecutions, tenantAddonData.maxREExecutions) &&
        Objects.equals(this.maxJSExecutions, tenantAddonData.maxJSExecutions) &&
        Objects.equals(this.maxDPStorageDays, tenantAddonData.maxDPStorageDays) &&
        Objects.equals(this.maxCreatedAlarms, tenantAddonData.maxCreatedAlarms) &&
        Objects.equals(this.maxEmails, tenantAddonData.maxEmails) &&
        Objects.equals(this.maxSms, tenantAddonData.maxSms) &&
        Objects.equals(this.maxAiCredits, tenantAddonData.maxAiCredits) &&
        Objects.equals(this.edgeEnabled, tenantAddonData.edgeEnabled) &&
        Objects.equals(this.maxEdges, tenantAddonData.maxEdges) &&
        Objects.equals(this.trendzEnabled, tenantAddonData.trendzEnabled) &&
        Objects.equals(this.whiteLabelingEnabled, tenantAddonData.whiteLabelingEnabled) &&
        Objects.equals(this._default, tenantAddonData._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxDevices, maxAssets, maxCustomers, maxUsers, maxIntegrations, maxConverters, maxCalculatedFieldsPerEntity, maxTransportMessages, maxTransportDataPoints, maxREExecutions, maxJSExecutions, maxDPStorageDays, maxCreatedAlarms, maxEmails, maxSms, maxAiCredits, edgeEnabled, maxEdges, trendzEnabled, whiteLabelingEnabled, _default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantAddonData {\n");
    sb.append("    maxDevices: ").append(toIndentedString(maxDevices)).append("\n");
    sb.append("    maxAssets: ").append(toIndentedString(maxAssets)).append("\n");
    sb.append("    maxCustomers: ").append(toIndentedString(maxCustomers)).append("\n");
    sb.append("    maxUsers: ").append(toIndentedString(maxUsers)).append("\n");
    sb.append("    maxIntegrations: ").append(toIndentedString(maxIntegrations)).append("\n");
    sb.append("    maxConverters: ").append(toIndentedString(maxConverters)).append("\n");
    sb.append("    maxCalculatedFieldsPerEntity: ").append(toIndentedString(maxCalculatedFieldsPerEntity)).append("\n");
    sb.append("    maxTransportMessages: ").append(toIndentedString(maxTransportMessages)).append("\n");
    sb.append("    maxTransportDataPoints: ").append(toIndentedString(maxTransportDataPoints)).append("\n");
    sb.append("    maxREExecutions: ").append(toIndentedString(maxREExecutions)).append("\n");
    sb.append("    maxJSExecutions: ").append(toIndentedString(maxJSExecutions)).append("\n");
    sb.append("    maxDPStorageDays: ").append(toIndentedString(maxDPStorageDays)).append("\n");
    sb.append("    maxCreatedAlarms: ").append(toIndentedString(maxCreatedAlarms)).append("\n");
    sb.append("    maxEmails: ").append(toIndentedString(maxEmails)).append("\n");
    sb.append("    maxSms: ").append(toIndentedString(maxSms)).append("\n");
    sb.append("    maxAiCredits: ").append(toIndentedString(maxAiCredits)).append("\n");
    sb.append("    edgeEnabled: ").append(toIndentedString(edgeEnabled)).append("\n");
    sb.append("    maxEdges: ").append(toIndentedString(maxEdges)).append("\n");
    sb.append("    trendzEnabled: ").append(toIndentedString(trendzEnabled)).append("\n");
    sb.append("    whiteLabelingEnabled: ").append(toIndentedString(whiteLabelingEnabled)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

    // add `maxDevices` to the URL query string
    if (getMaxDevices() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxDevices%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxDevices()))));
    }

    // add `maxAssets` to the URL query string
    if (getMaxAssets() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxAssets%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxAssets()))));
    }

    // add `maxCustomers` to the URL query string
    if (getMaxCustomers() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxCustomers%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxCustomers()))));
    }

    // add `maxUsers` to the URL query string
    if (getMaxUsers() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxUsers%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxUsers()))));
    }

    // add `maxIntegrations` to the URL query string
    if (getMaxIntegrations() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxIntegrations%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxIntegrations()))));
    }

    // add `maxConverters` to the URL query string
    if (getMaxConverters() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxConverters%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxConverters()))));
    }

    // add `maxCalculatedFieldsPerEntity` to the URL query string
    if (getMaxCalculatedFieldsPerEntity() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxCalculatedFieldsPerEntity%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxCalculatedFieldsPerEntity()))));
    }

    // add `maxTransportMessages` to the URL query string
    if (getMaxTransportMessages() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxTransportMessages%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxTransportMessages()))));
    }

    // add `maxTransportDataPoints` to the URL query string
    if (getMaxTransportDataPoints() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxTransportDataPoints%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxTransportDataPoints()))));
    }

    // add `maxREExecutions` to the URL query string
    if (getMaxREExecutions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxREExecutions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxREExecutions()))));
    }

    // add `maxJSExecutions` to the URL query string
    if (getMaxJSExecutions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxJSExecutions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxJSExecutions()))));
    }

    // add `maxDPStorageDays` to the URL query string
    if (getMaxDPStorageDays() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxDPStorageDays%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxDPStorageDays()))));
    }

    // add `maxCreatedAlarms` to the URL query string
    if (getMaxCreatedAlarms() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxCreatedAlarms%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxCreatedAlarms()))));
    }

    // add `maxEmails` to the URL query string
    if (getMaxEmails() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxEmails%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxEmails()))));
    }

    // add `maxSms` to the URL query string
    if (getMaxSms() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxSms%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxSms()))));
    }

    // add `maxAiCredits` to the URL query string
    if (getMaxAiCredits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxAiCredits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxAiCredits()))));
    }

    // add `edgeEnabled` to the URL query string
    if (getEdgeEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sedgeEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEdgeEnabled()))));
    }

    // add `maxEdges` to the URL query string
    if (getMaxEdges() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxEdges%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxEdges()))));
    }

    // add `trendzEnabled` to the URL query string
    if (getTrendzEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%strendzEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTrendzEnabled()))));
    }

    // add `whiteLabelingEnabled` to the URL query string
    if (getWhiteLabelingEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%swhiteLabelingEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWhiteLabelingEnabled()))));
    }

    // add `default` to the URL query string
    if (getDefault() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdefault%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDefault()))));
    }

    return joiner.toString();
  }
}

