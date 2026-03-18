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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.thingsboard.client.model.TenantProfileConfiguration;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.thingsboard.client.JSON;
import org.thingsboard.client.ApiClient;
/**
 * DefaultTenantProfileConfiguration
 */
@JsonPropertyOrder({
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_DEVICES,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_ASSETS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_CUSTOMERS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_USERS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_DASHBOARDS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_RULE_CHAINS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_EDGES,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_RESOURCES_IN_BYTES,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_OTA_PACKAGES_IN_BYTES,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_RESOURCE_SIZE,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_REPORT_SIZE_IN_BYTES,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_INTEGRATIONS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_CONVERTERS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_SCHEDULER_EVENTS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_TRANSPORT_TENANT_MSG_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_TRANSPORT_TENANT_TELEMETRY_MSG_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_TRANSPORT_TENANT_TELEMETRY_DATA_POINTS_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_TRANSPORT_DEVICE_MSG_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_TRANSPORT_DEVICE_TELEMETRY_MSG_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_TRANSPORT_DEVICE_TELEMETRY_DATA_POINTS_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_TRANSPORT_GATEWAY_MSG_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_TRANSPORT_GATEWAY_TELEMETRY_MSG_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_TRANSPORT_GATEWAY_TELEMETRY_DATA_POINTS_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_TRANSPORT_GATEWAY_DEVICE_MSG_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_TRANSPORT_GATEWAY_DEVICE_TELEMETRY_MSG_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_TRANSPORT_GATEWAY_DEVICE_TELEMETRY_DATA_POINTS_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_INTEGRATION_MSGS_PER_TENANT_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_INTEGRATION_MSGS_PER_DEVICE_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_INTEGRATION_MSGS_PER_ASSET_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_TENANT_ENTITY_EXPORT_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_TENANT_ENTITY_IMPORT_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_TENANT_NOTIFICATION_REQUESTS_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_TENANT_NOTIFICATION_REQUESTS_PER_RULE_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_TRANSPORT_MESSAGES,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_TRANSPORT_DATA_POINTS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_R_E_EXECUTIONS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_J_S_EXECUTIONS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_TBEL_EXECUTIONS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_D_P_STORAGE_DAYS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_RULE_NODE_EXECUTIONS_PER_MESSAGE,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_DEBUG_MODE_DURATION_MINUTES,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_EMAILS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_SMS_ENABLED,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_SMS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_CREATED_ALARMS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_GENERATED_REPORTS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_TENANT_SERVER_REST_LIMITS_CONFIGURATION,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_CUSTOMER_SERVER_REST_LIMITS_CONFIGURATION,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_WS_SESSIONS_PER_TENANT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_WS_SESSIONS_PER_CUSTOMER,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_WS_SESSIONS_PER_REGULAR_USER,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_WS_SESSIONS_PER_PUBLIC_USER,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_WS_MSG_QUEUE_LIMIT_PER_SESSION,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_WS_SUBSCRIPTIONS_PER_TENANT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_WS_SUBSCRIPTIONS_PER_CUSTOMER,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_WS_SUBSCRIPTIONS_PER_REGULAR_USER,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_WS_SUBSCRIPTIONS_PER_PUBLIC_USER,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_WS_UPDATES_PER_SESSION_RATE_LIMIT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_CASSANDRA_READ_QUERY_TENANT_CORE_RATE_LIMITS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_CASSANDRA_WRITE_QUERY_TENANT_CORE_RATE_LIMITS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_CASSANDRA_READ_QUERY_TENANT_RULE_ENGINE_RATE_LIMITS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_CASSANDRA_WRITE_QUERY_TENANT_RULE_ENGINE_RATE_LIMITS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_EDGE_EVENT_RATE_LIMITS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_EDGE_EVENT_RATE_LIMITS_PER_EDGE,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_EDGE_UPLINK_MESSAGES_RATE_LIMITS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_EDGE_UPLINK_MESSAGES_RATE_LIMITS_PER_EDGE,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_DEFAULT_STORAGE_TTL_DAYS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_ALARMS_TTL_DAYS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_RPC_TTL_DAYS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_QUEUE_STATS_TTL_DAYS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_RULE_ENGINE_EXCEPTIONS_TTL_DAYS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_BLOB_ENTITY_TTL_DAYS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_REPORT_TTL_DAYS,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_WARN_THRESHOLD,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_CALCULATED_FIELDS_PER_ENTITY,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_ARGUMENTS_PER_C_F,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MIN_ALLOWED_SCHEDULED_UPDATE_INTERVAL_IN_SEC_FOR_C_F,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_RELATION_LEVEL_PER_CF_ARGUMENT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_RELATED_ENTITIES_TO_RETURN_PER_CF_ARGUMENT,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_DATA_POINTS_PER_ROLLING_ARG,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_STATE_SIZE_IN_K_BYTES,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MAX_SINGLE_VALUE_ARGUMENT_SIZE_IN_K_BYTES,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MIN_ALLOWED_DEDUPLICATION_INTERVAL_IN_SEC_FOR_C_F,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_MIN_ALLOWED_AGGREGATION_INTERVAL_IN_SEC_FOR_C_F,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_INTERMEDIATE_AGGREGATION_INTERVAL_IN_SEC_FOR_C_F,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_CF_REEVALUATION_CHECK_INTERVAL,
  DefaultTenantProfileConfiguration.JSON_PROPERTY_ALARMS_REEVALUATION_INTERVAL
})
@Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.20.0")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class DefaultTenantProfileConfiguration extends TenantProfileConfiguration {
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

  public static final String JSON_PROPERTY_MAX_DASHBOARDS = "maxDashboards";
  @Nullable
  private Long maxDashboards;

  public static final String JSON_PROPERTY_MAX_RULE_CHAINS = "maxRuleChains";
  @Nullable
  private Long maxRuleChains;

  public static final String JSON_PROPERTY_MAX_EDGES = "maxEdges";
  @Nullable
  private Long maxEdges;

  public static final String JSON_PROPERTY_MAX_RESOURCES_IN_BYTES = "maxResourcesInBytes";
  @Nullable
  private Long maxResourcesInBytes;

  public static final String JSON_PROPERTY_MAX_OTA_PACKAGES_IN_BYTES = "maxOtaPackagesInBytes";
  @Nullable
  private Long maxOtaPackagesInBytes;

  public static final String JSON_PROPERTY_MAX_RESOURCE_SIZE = "maxResourceSize";
  @Nullable
  private Long maxResourceSize;

  public static final String JSON_PROPERTY_MAX_REPORT_SIZE_IN_BYTES = "maxReportSizeInBytes";
  @Nullable
  private Long maxReportSizeInBytes;

  public static final String JSON_PROPERTY_MAX_INTEGRATIONS = "maxIntegrations";
  @Nullable
  private Long maxIntegrations;

  public static final String JSON_PROPERTY_MAX_CONVERTERS = "maxConverters";
  @Nullable
  private Long maxConverters;

  public static final String JSON_PROPERTY_MAX_SCHEDULER_EVENTS = "maxSchedulerEvents";
  @Nullable
  private Long maxSchedulerEvents;

  public static final String JSON_PROPERTY_TRANSPORT_TENANT_MSG_RATE_LIMIT = "transportTenantMsgRateLimit";
  @Nullable
  private String transportTenantMsgRateLimit;

  public static final String JSON_PROPERTY_TRANSPORT_TENANT_TELEMETRY_MSG_RATE_LIMIT = "transportTenantTelemetryMsgRateLimit";
  @Nullable
  private String transportTenantTelemetryMsgRateLimit;

  public static final String JSON_PROPERTY_TRANSPORT_TENANT_TELEMETRY_DATA_POINTS_RATE_LIMIT = "transportTenantTelemetryDataPointsRateLimit";
  @Nullable
  private String transportTenantTelemetryDataPointsRateLimit;

  public static final String JSON_PROPERTY_TRANSPORT_DEVICE_MSG_RATE_LIMIT = "transportDeviceMsgRateLimit";
  @Nullable
  private String transportDeviceMsgRateLimit;

  public static final String JSON_PROPERTY_TRANSPORT_DEVICE_TELEMETRY_MSG_RATE_LIMIT = "transportDeviceTelemetryMsgRateLimit";
  @Nullable
  private String transportDeviceTelemetryMsgRateLimit;

  public static final String JSON_PROPERTY_TRANSPORT_DEVICE_TELEMETRY_DATA_POINTS_RATE_LIMIT = "transportDeviceTelemetryDataPointsRateLimit";
  @Nullable
  private String transportDeviceTelemetryDataPointsRateLimit;

  public static final String JSON_PROPERTY_TRANSPORT_GATEWAY_MSG_RATE_LIMIT = "transportGatewayMsgRateLimit";
  @Nullable
  private String transportGatewayMsgRateLimit;

  public static final String JSON_PROPERTY_TRANSPORT_GATEWAY_TELEMETRY_MSG_RATE_LIMIT = "transportGatewayTelemetryMsgRateLimit";
  @Nullable
  private String transportGatewayTelemetryMsgRateLimit;

  public static final String JSON_PROPERTY_TRANSPORT_GATEWAY_TELEMETRY_DATA_POINTS_RATE_LIMIT = "transportGatewayTelemetryDataPointsRateLimit";
  @Nullable
  private String transportGatewayTelemetryDataPointsRateLimit;

  public static final String JSON_PROPERTY_TRANSPORT_GATEWAY_DEVICE_MSG_RATE_LIMIT = "transportGatewayDeviceMsgRateLimit";
  @Nullable
  private String transportGatewayDeviceMsgRateLimit;

  public static final String JSON_PROPERTY_TRANSPORT_GATEWAY_DEVICE_TELEMETRY_MSG_RATE_LIMIT = "transportGatewayDeviceTelemetryMsgRateLimit";
  @Nullable
  private String transportGatewayDeviceTelemetryMsgRateLimit;

  public static final String JSON_PROPERTY_TRANSPORT_GATEWAY_DEVICE_TELEMETRY_DATA_POINTS_RATE_LIMIT = "transportGatewayDeviceTelemetryDataPointsRateLimit";
  @Nullable
  private String transportGatewayDeviceTelemetryDataPointsRateLimit;

  public static final String JSON_PROPERTY_INTEGRATION_MSGS_PER_TENANT_RATE_LIMIT = "integrationMsgsPerTenantRateLimit";
  @Nullable
  private String integrationMsgsPerTenantRateLimit;

  public static final String JSON_PROPERTY_INTEGRATION_MSGS_PER_DEVICE_RATE_LIMIT = "integrationMsgsPerDeviceRateLimit";
  @Nullable
  private String integrationMsgsPerDeviceRateLimit;

  public static final String JSON_PROPERTY_INTEGRATION_MSGS_PER_ASSET_RATE_LIMIT = "integrationMsgsPerAssetRateLimit";
  @Nullable
  private String integrationMsgsPerAssetRateLimit;

  public static final String JSON_PROPERTY_TENANT_ENTITY_EXPORT_RATE_LIMIT = "tenantEntityExportRateLimit";
  @Nullable
  private String tenantEntityExportRateLimit;

  public static final String JSON_PROPERTY_TENANT_ENTITY_IMPORT_RATE_LIMIT = "tenantEntityImportRateLimit";
  @Nullable
  private String tenantEntityImportRateLimit;

  public static final String JSON_PROPERTY_TENANT_NOTIFICATION_REQUESTS_RATE_LIMIT = "tenantNotificationRequestsRateLimit";
  @Nullable
  private String tenantNotificationRequestsRateLimit;

  public static final String JSON_PROPERTY_TENANT_NOTIFICATION_REQUESTS_PER_RULE_RATE_LIMIT = "tenantNotificationRequestsPerRuleRateLimit";
  @Nullable
  private String tenantNotificationRequestsPerRuleRateLimit;

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

  public static final String JSON_PROPERTY_MAX_TBEL_EXECUTIONS = "maxTbelExecutions";
  @Nullable
  private Long maxTbelExecutions;

  public static final String JSON_PROPERTY_MAX_D_P_STORAGE_DAYS = "maxDPStorageDays";
  @Nullable
  private Long maxDPStorageDays;

  public static final String JSON_PROPERTY_MAX_RULE_NODE_EXECUTIONS_PER_MESSAGE = "maxRuleNodeExecutionsPerMessage";
  @Nullable
  private Integer maxRuleNodeExecutionsPerMessage;

  public static final String JSON_PROPERTY_MAX_DEBUG_MODE_DURATION_MINUTES = "maxDebugModeDurationMinutes";
  @Nullable
  private Integer maxDebugModeDurationMinutes;

  public static final String JSON_PROPERTY_MAX_EMAILS = "maxEmails";
  @Nullable
  private Long maxEmails;

  public static final String JSON_PROPERTY_SMS_ENABLED = "smsEnabled";
  @Nullable
  private Boolean smsEnabled;

  public static final String JSON_PROPERTY_MAX_SMS = "maxSms";
  @Nullable
  private Long maxSms;

  public static final String JSON_PROPERTY_MAX_CREATED_ALARMS = "maxCreatedAlarms";
  @Nullable
  private Long maxCreatedAlarms;

  public static final String JSON_PROPERTY_MAX_GENERATED_REPORTS = "maxGeneratedReports";
  @Nullable
  private Long maxGeneratedReports;

  public static final String JSON_PROPERTY_TENANT_SERVER_REST_LIMITS_CONFIGURATION = "tenantServerRestLimitsConfiguration";
  @Nullable
  private String tenantServerRestLimitsConfiguration;

  public static final String JSON_PROPERTY_CUSTOMER_SERVER_REST_LIMITS_CONFIGURATION = "customerServerRestLimitsConfiguration";
  @Nullable
  private String customerServerRestLimitsConfiguration;

  public static final String JSON_PROPERTY_MAX_WS_SESSIONS_PER_TENANT = "maxWsSessionsPerTenant";
  @Nullable
  private Integer maxWsSessionsPerTenant;

  public static final String JSON_PROPERTY_MAX_WS_SESSIONS_PER_CUSTOMER = "maxWsSessionsPerCustomer";
  @Nullable
  private Integer maxWsSessionsPerCustomer;

  public static final String JSON_PROPERTY_MAX_WS_SESSIONS_PER_REGULAR_USER = "maxWsSessionsPerRegularUser";
  @Nullable
  private Integer maxWsSessionsPerRegularUser;

  public static final String JSON_PROPERTY_MAX_WS_SESSIONS_PER_PUBLIC_USER = "maxWsSessionsPerPublicUser";
  @Nullable
  private Integer maxWsSessionsPerPublicUser;

  public static final String JSON_PROPERTY_WS_MSG_QUEUE_LIMIT_PER_SESSION = "wsMsgQueueLimitPerSession";
  @Nullable
  private Integer wsMsgQueueLimitPerSession;

  public static final String JSON_PROPERTY_MAX_WS_SUBSCRIPTIONS_PER_TENANT = "maxWsSubscriptionsPerTenant";
  @Nullable
  private Long maxWsSubscriptionsPerTenant;

  public static final String JSON_PROPERTY_MAX_WS_SUBSCRIPTIONS_PER_CUSTOMER = "maxWsSubscriptionsPerCustomer";
  @Nullable
  private Long maxWsSubscriptionsPerCustomer;

  public static final String JSON_PROPERTY_MAX_WS_SUBSCRIPTIONS_PER_REGULAR_USER = "maxWsSubscriptionsPerRegularUser";
  @Nullable
  private Long maxWsSubscriptionsPerRegularUser;

  public static final String JSON_PROPERTY_MAX_WS_SUBSCRIPTIONS_PER_PUBLIC_USER = "maxWsSubscriptionsPerPublicUser";
  @Nullable
  private Long maxWsSubscriptionsPerPublicUser;

  public static final String JSON_PROPERTY_WS_UPDATES_PER_SESSION_RATE_LIMIT = "wsUpdatesPerSessionRateLimit";
  @Nullable
  private String wsUpdatesPerSessionRateLimit;

  public static final String JSON_PROPERTY_CASSANDRA_READ_QUERY_TENANT_CORE_RATE_LIMITS = "cassandraReadQueryTenantCoreRateLimits";
  @Nullable
  private String cassandraReadQueryTenantCoreRateLimits;

  public static final String JSON_PROPERTY_CASSANDRA_WRITE_QUERY_TENANT_CORE_RATE_LIMITS = "cassandraWriteQueryTenantCoreRateLimits";
  @Nullable
  private String cassandraWriteQueryTenantCoreRateLimits;

  public static final String JSON_PROPERTY_CASSANDRA_READ_QUERY_TENANT_RULE_ENGINE_RATE_LIMITS = "cassandraReadQueryTenantRuleEngineRateLimits";
  @Nullable
  private String cassandraReadQueryTenantRuleEngineRateLimits;

  public static final String JSON_PROPERTY_CASSANDRA_WRITE_QUERY_TENANT_RULE_ENGINE_RATE_LIMITS = "cassandraWriteQueryTenantRuleEngineRateLimits";
  @Nullable
  private String cassandraWriteQueryTenantRuleEngineRateLimits;

  public static final String JSON_PROPERTY_EDGE_EVENT_RATE_LIMITS = "edgeEventRateLimits";
  @Nullable
  private String edgeEventRateLimits;

  public static final String JSON_PROPERTY_EDGE_EVENT_RATE_LIMITS_PER_EDGE = "edgeEventRateLimitsPerEdge";
  @Nullable
  private String edgeEventRateLimitsPerEdge;

  public static final String JSON_PROPERTY_EDGE_UPLINK_MESSAGES_RATE_LIMITS = "edgeUplinkMessagesRateLimits";
  @Nullable
  private String edgeUplinkMessagesRateLimits;

  public static final String JSON_PROPERTY_EDGE_UPLINK_MESSAGES_RATE_LIMITS_PER_EDGE = "edgeUplinkMessagesRateLimitsPerEdge";
  @Nullable
  private String edgeUplinkMessagesRateLimitsPerEdge;

  public static final String JSON_PROPERTY_DEFAULT_STORAGE_TTL_DAYS = "defaultStorageTtlDays";
  @Nullable
  private Integer defaultStorageTtlDays;

  public static final String JSON_PROPERTY_ALARMS_TTL_DAYS = "alarmsTtlDays";
  @Nullable
  private Integer alarmsTtlDays;

  public static final String JSON_PROPERTY_RPC_TTL_DAYS = "rpcTtlDays";
  @Nullable
  private Integer rpcTtlDays;

  public static final String JSON_PROPERTY_QUEUE_STATS_TTL_DAYS = "queueStatsTtlDays";
  @Nullable
  private Integer queueStatsTtlDays;

  public static final String JSON_PROPERTY_RULE_ENGINE_EXCEPTIONS_TTL_DAYS = "ruleEngineExceptionsTtlDays";
  @Nullable
  private Integer ruleEngineExceptionsTtlDays;

  public static final String JSON_PROPERTY_BLOB_ENTITY_TTL_DAYS = "blobEntityTtlDays";
  @Nullable
  private Integer blobEntityTtlDays;

  public static final String JSON_PROPERTY_REPORT_TTL_DAYS = "reportTtlDays";
  @Nullable
  private Integer reportTtlDays;

  public static final String JSON_PROPERTY_WARN_THRESHOLD = "warnThreshold";
  @Nullable
  private Double warnThreshold;

  public static final String JSON_PROPERTY_MAX_CALCULATED_FIELDS_PER_ENTITY = "maxCalculatedFieldsPerEntity";
  @Nullable
  private Long maxCalculatedFieldsPerEntity;

  public static final String JSON_PROPERTY_MAX_ARGUMENTS_PER_C_F = "maxArgumentsPerCF";
  @Nullable
  private Long maxArgumentsPerCF;

  public static final String JSON_PROPERTY_MIN_ALLOWED_SCHEDULED_UPDATE_INTERVAL_IN_SEC_FOR_C_F = "minAllowedScheduledUpdateIntervalInSecForCF";
  @Nullable
  private Integer minAllowedScheduledUpdateIntervalInSecForCF;

  public static final String JSON_PROPERTY_MAX_RELATION_LEVEL_PER_CF_ARGUMENT = "maxRelationLevelPerCfArgument";
  @Nullable
  private Integer maxRelationLevelPerCfArgument;

  public static final String JSON_PROPERTY_MAX_RELATED_ENTITIES_TO_RETURN_PER_CF_ARGUMENT = "maxRelatedEntitiesToReturnPerCfArgument";
  @Nullable
  private Integer maxRelatedEntitiesToReturnPerCfArgument;

  public static final String JSON_PROPERTY_MAX_DATA_POINTS_PER_ROLLING_ARG = "maxDataPointsPerRollingArg";
  @Nullable
  private Long maxDataPointsPerRollingArg;

  public static final String JSON_PROPERTY_MAX_STATE_SIZE_IN_K_BYTES = "maxStateSizeInKBytes";
  @Nullable
  private Long maxStateSizeInKBytes;

  public static final String JSON_PROPERTY_MAX_SINGLE_VALUE_ARGUMENT_SIZE_IN_K_BYTES = "maxSingleValueArgumentSizeInKBytes";
  @Nullable
  private Long maxSingleValueArgumentSizeInKBytes;

  public static final String JSON_PROPERTY_MIN_ALLOWED_DEDUPLICATION_INTERVAL_IN_SEC_FOR_C_F = "minAllowedDeduplicationIntervalInSecForCF";
  @Nullable
  private Long minAllowedDeduplicationIntervalInSecForCF;

  public static final String JSON_PROPERTY_MIN_ALLOWED_AGGREGATION_INTERVAL_IN_SEC_FOR_C_F = "minAllowedAggregationIntervalInSecForCF";
  @Nullable
  private Long minAllowedAggregationIntervalInSecForCF;

  public static final String JSON_PROPERTY_INTERMEDIATE_AGGREGATION_INTERVAL_IN_SEC_FOR_C_F = "intermediateAggregationIntervalInSecForCF";
  @Nullable
  private Long intermediateAggregationIntervalInSecForCF;

  public static final String JSON_PROPERTY_CF_REEVALUATION_CHECK_INTERVAL = "cfReevaluationCheckInterval";
  @Nullable
  private Long cfReevaluationCheckInterval;

  public static final String JSON_PROPERTY_ALARMS_REEVALUATION_INTERVAL = "alarmsReevaluationInterval";
  @Nullable
  private Long alarmsReevaluationInterval;

  public DefaultTenantProfileConfiguration() { 
  }

  public DefaultTenantProfileConfiguration maxDevices(@Nullable Long maxDevices) {
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


  public DefaultTenantProfileConfiguration maxAssets(@Nullable Long maxAssets) {
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


  public DefaultTenantProfileConfiguration maxCustomers(@Nullable Long maxCustomers) {
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


  public DefaultTenantProfileConfiguration maxUsers(@Nullable Long maxUsers) {
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


  public DefaultTenantProfileConfiguration maxDashboards(@Nullable Long maxDashboards) {
    this.maxDashboards = maxDashboards;
    return this;
  }

  /**
   * Get maxDashboards
   * @return maxDashboards
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_DASHBOARDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxDashboards() {
    return maxDashboards;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_DASHBOARDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxDashboards(@Nullable Long maxDashboards) {
    this.maxDashboards = maxDashboards;
  }


  public DefaultTenantProfileConfiguration maxRuleChains(@Nullable Long maxRuleChains) {
    this.maxRuleChains = maxRuleChains;
    return this;
  }

  /**
   * Get maxRuleChains
   * @return maxRuleChains
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_RULE_CHAINS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxRuleChains() {
    return maxRuleChains;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_RULE_CHAINS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxRuleChains(@Nullable Long maxRuleChains) {
    this.maxRuleChains = maxRuleChains;
  }


  public DefaultTenantProfileConfiguration maxEdges(@Nullable Long maxEdges) {
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


  public DefaultTenantProfileConfiguration maxResourcesInBytes(@Nullable Long maxResourcesInBytes) {
    this.maxResourcesInBytes = maxResourcesInBytes;
    return this;
  }

  /**
   * Get maxResourcesInBytes
   * @return maxResourcesInBytes
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_RESOURCES_IN_BYTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxResourcesInBytes() {
    return maxResourcesInBytes;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_RESOURCES_IN_BYTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxResourcesInBytes(@Nullable Long maxResourcesInBytes) {
    this.maxResourcesInBytes = maxResourcesInBytes;
  }


  public DefaultTenantProfileConfiguration maxOtaPackagesInBytes(@Nullable Long maxOtaPackagesInBytes) {
    this.maxOtaPackagesInBytes = maxOtaPackagesInBytes;
    return this;
  }

  /**
   * Get maxOtaPackagesInBytes
   * @return maxOtaPackagesInBytes
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_OTA_PACKAGES_IN_BYTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxOtaPackagesInBytes() {
    return maxOtaPackagesInBytes;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_OTA_PACKAGES_IN_BYTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxOtaPackagesInBytes(@Nullable Long maxOtaPackagesInBytes) {
    this.maxOtaPackagesInBytes = maxOtaPackagesInBytes;
  }


  public DefaultTenantProfileConfiguration maxResourceSize(@Nullable Long maxResourceSize) {
    this.maxResourceSize = maxResourceSize;
    return this;
  }

  /**
   * Get maxResourceSize
   * @return maxResourceSize
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_RESOURCE_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxResourceSize() {
    return maxResourceSize;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_RESOURCE_SIZE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxResourceSize(@Nullable Long maxResourceSize) {
    this.maxResourceSize = maxResourceSize;
  }


  public DefaultTenantProfileConfiguration maxReportSizeInBytes(@Nullable Long maxReportSizeInBytes) {
    this.maxReportSizeInBytes = maxReportSizeInBytes;
    return this;
  }

  /**
   * Get maxReportSizeInBytes
   * @return maxReportSizeInBytes
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_REPORT_SIZE_IN_BYTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxReportSizeInBytes() {
    return maxReportSizeInBytes;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_REPORT_SIZE_IN_BYTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxReportSizeInBytes(@Nullable Long maxReportSizeInBytes) {
    this.maxReportSizeInBytes = maxReportSizeInBytes;
  }


  public DefaultTenantProfileConfiguration maxIntegrations(@Nullable Long maxIntegrations) {
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


  public DefaultTenantProfileConfiguration maxConverters(@Nullable Long maxConverters) {
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


  public DefaultTenantProfileConfiguration maxSchedulerEvents(@Nullable Long maxSchedulerEvents) {
    this.maxSchedulerEvents = maxSchedulerEvents;
    return this;
  }

  /**
   * Get maxSchedulerEvents
   * @return maxSchedulerEvents
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_SCHEDULER_EVENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxSchedulerEvents() {
    return maxSchedulerEvents;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_SCHEDULER_EVENTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxSchedulerEvents(@Nullable Long maxSchedulerEvents) {
    this.maxSchedulerEvents = maxSchedulerEvents;
  }


  public DefaultTenantProfileConfiguration transportTenantMsgRateLimit(@Nullable String transportTenantMsgRateLimit) {
    this.transportTenantMsgRateLimit = transportTenantMsgRateLimit;
    return this;
  }

  /**
   * Get transportTenantMsgRateLimit
   * @return transportTenantMsgRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_TENANT_MSG_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransportTenantMsgRateLimit() {
    return transportTenantMsgRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_TENANT_MSG_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportTenantMsgRateLimit(@Nullable String transportTenantMsgRateLimit) {
    this.transportTenantMsgRateLimit = transportTenantMsgRateLimit;
  }


  public DefaultTenantProfileConfiguration transportTenantTelemetryMsgRateLimit(@Nullable String transportTenantTelemetryMsgRateLimit) {
    this.transportTenantTelemetryMsgRateLimit = transportTenantTelemetryMsgRateLimit;
    return this;
  }

  /**
   * Get transportTenantTelemetryMsgRateLimit
   * @return transportTenantTelemetryMsgRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_TENANT_TELEMETRY_MSG_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransportTenantTelemetryMsgRateLimit() {
    return transportTenantTelemetryMsgRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_TENANT_TELEMETRY_MSG_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportTenantTelemetryMsgRateLimit(@Nullable String transportTenantTelemetryMsgRateLimit) {
    this.transportTenantTelemetryMsgRateLimit = transportTenantTelemetryMsgRateLimit;
  }


  public DefaultTenantProfileConfiguration transportTenantTelemetryDataPointsRateLimit(@Nullable String transportTenantTelemetryDataPointsRateLimit) {
    this.transportTenantTelemetryDataPointsRateLimit = transportTenantTelemetryDataPointsRateLimit;
    return this;
  }

  /**
   * Get transportTenantTelemetryDataPointsRateLimit
   * @return transportTenantTelemetryDataPointsRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_TENANT_TELEMETRY_DATA_POINTS_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransportTenantTelemetryDataPointsRateLimit() {
    return transportTenantTelemetryDataPointsRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_TENANT_TELEMETRY_DATA_POINTS_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportTenantTelemetryDataPointsRateLimit(@Nullable String transportTenantTelemetryDataPointsRateLimit) {
    this.transportTenantTelemetryDataPointsRateLimit = transportTenantTelemetryDataPointsRateLimit;
  }


  public DefaultTenantProfileConfiguration transportDeviceMsgRateLimit(@Nullable String transportDeviceMsgRateLimit) {
    this.transportDeviceMsgRateLimit = transportDeviceMsgRateLimit;
    return this;
  }

  /**
   * Get transportDeviceMsgRateLimit
   * @return transportDeviceMsgRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_DEVICE_MSG_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransportDeviceMsgRateLimit() {
    return transportDeviceMsgRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_DEVICE_MSG_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportDeviceMsgRateLimit(@Nullable String transportDeviceMsgRateLimit) {
    this.transportDeviceMsgRateLimit = transportDeviceMsgRateLimit;
  }


  public DefaultTenantProfileConfiguration transportDeviceTelemetryMsgRateLimit(@Nullable String transportDeviceTelemetryMsgRateLimit) {
    this.transportDeviceTelemetryMsgRateLimit = transportDeviceTelemetryMsgRateLimit;
    return this;
  }

  /**
   * Get transportDeviceTelemetryMsgRateLimit
   * @return transportDeviceTelemetryMsgRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_DEVICE_TELEMETRY_MSG_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransportDeviceTelemetryMsgRateLimit() {
    return transportDeviceTelemetryMsgRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_DEVICE_TELEMETRY_MSG_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportDeviceTelemetryMsgRateLimit(@Nullable String transportDeviceTelemetryMsgRateLimit) {
    this.transportDeviceTelemetryMsgRateLimit = transportDeviceTelemetryMsgRateLimit;
  }


  public DefaultTenantProfileConfiguration transportDeviceTelemetryDataPointsRateLimit(@Nullable String transportDeviceTelemetryDataPointsRateLimit) {
    this.transportDeviceTelemetryDataPointsRateLimit = transportDeviceTelemetryDataPointsRateLimit;
    return this;
  }

  /**
   * Get transportDeviceTelemetryDataPointsRateLimit
   * @return transportDeviceTelemetryDataPointsRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_DEVICE_TELEMETRY_DATA_POINTS_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransportDeviceTelemetryDataPointsRateLimit() {
    return transportDeviceTelemetryDataPointsRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_DEVICE_TELEMETRY_DATA_POINTS_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportDeviceTelemetryDataPointsRateLimit(@Nullable String transportDeviceTelemetryDataPointsRateLimit) {
    this.transportDeviceTelemetryDataPointsRateLimit = transportDeviceTelemetryDataPointsRateLimit;
  }


  public DefaultTenantProfileConfiguration transportGatewayMsgRateLimit(@Nullable String transportGatewayMsgRateLimit) {
    this.transportGatewayMsgRateLimit = transportGatewayMsgRateLimit;
    return this;
  }

  /**
   * Get transportGatewayMsgRateLimit
   * @return transportGatewayMsgRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_GATEWAY_MSG_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransportGatewayMsgRateLimit() {
    return transportGatewayMsgRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_GATEWAY_MSG_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportGatewayMsgRateLimit(@Nullable String transportGatewayMsgRateLimit) {
    this.transportGatewayMsgRateLimit = transportGatewayMsgRateLimit;
  }


  public DefaultTenantProfileConfiguration transportGatewayTelemetryMsgRateLimit(@Nullable String transportGatewayTelemetryMsgRateLimit) {
    this.transportGatewayTelemetryMsgRateLimit = transportGatewayTelemetryMsgRateLimit;
    return this;
  }

  /**
   * Get transportGatewayTelemetryMsgRateLimit
   * @return transportGatewayTelemetryMsgRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_GATEWAY_TELEMETRY_MSG_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransportGatewayTelemetryMsgRateLimit() {
    return transportGatewayTelemetryMsgRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_GATEWAY_TELEMETRY_MSG_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportGatewayTelemetryMsgRateLimit(@Nullable String transportGatewayTelemetryMsgRateLimit) {
    this.transportGatewayTelemetryMsgRateLimit = transportGatewayTelemetryMsgRateLimit;
  }


  public DefaultTenantProfileConfiguration transportGatewayTelemetryDataPointsRateLimit(@Nullable String transportGatewayTelemetryDataPointsRateLimit) {
    this.transportGatewayTelemetryDataPointsRateLimit = transportGatewayTelemetryDataPointsRateLimit;
    return this;
  }

  /**
   * Get transportGatewayTelemetryDataPointsRateLimit
   * @return transportGatewayTelemetryDataPointsRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_GATEWAY_TELEMETRY_DATA_POINTS_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransportGatewayTelemetryDataPointsRateLimit() {
    return transportGatewayTelemetryDataPointsRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_GATEWAY_TELEMETRY_DATA_POINTS_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportGatewayTelemetryDataPointsRateLimit(@Nullable String transportGatewayTelemetryDataPointsRateLimit) {
    this.transportGatewayTelemetryDataPointsRateLimit = transportGatewayTelemetryDataPointsRateLimit;
  }


  public DefaultTenantProfileConfiguration transportGatewayDeviceMsgRateLimit(@Nullable String transportGatewayDeviceMsgRateLimit) {
    this.transportGatewayDeviceMsgRateLimit = transportGatewayDeviceMsgRateLimit;
    return this;
  }

  /**
   * Get transportGatewayDeviceMsgRateLimit
   * @return transportGatewayDeviceMsgRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_GATEWAY_DEVICE_MSG_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransportGatewayDeviceMsgRateLimit() {
    return transportGatewayDeviceMsgRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_GATEWAY_DEVICE_MSG_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportGatewayDeviceMsgRateLimit(@Nullable String transportGatewayDeviceMsgRateLimit) {
    this.transportGatewayDeviceMsgRateLimit = transportGatewayDeviceMsgRateLimit;
  }


  public DefaultTenantProfileConfiguration transportGatewayDeviceTelemetryMsgRateLimit(@Nullable String transportGatewayDeviceTelemetryMsgRateLimit) {
    this.transportGatewayDeviceTelemetryMsgRateLimit = transportGatewayDeviceTelemetryMsgRateLimit;
    return this;
  }

  /**
   * Get transportGatewayDeviceTelemetryMsgRateLimit
   * @return transportGatewayDeviceTelemetryMsgRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_GATEWAY_DEVICE_TELEMETRY_MSG_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransportGatewayDeviceTelemetryMsgRateLimit() {
    return transportGatewayDeviceTelemetryMsgRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_GATEWAY_DEVICE_TELEMETRY_MSG_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportGatewayDeviceTelemetryMsgRateLimit(@Nullable String transportGatewayDeviceTelemetryMsgRateLimit) {
    this.transportGatewayDeviceTelemetryMsgRateLimit = transportGatewayDeviceTelemetryMsgRateLimit;
  }


  public DefaultTenantProfileConfiguration transportGatewayDeviceTelemetryDataPointsRateLimit(@Nullable String transportGatewayDeviceTelemetryDataPointsRateLimit) {
    this.transportGatewayDeviceTelemetryDataPointsRateLimit = transportGatewayDeviceTelemetryDataPointsRateLimit;
    return this;
  }

  /**
   * Get transportGatewayDeviceTelemetryDataPointsRateLimit
   * @return transportGatewayDeviceTelemetryDataPointsRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_GATEWAY_DEVICE_TELEMETRY_DATA_POINTS_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTransportGatewayDeviceTelemetryDataPointsRateLimit() {
    return transportGatewayDeviceTelemetryDataPointsRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_TRANSPORT_GATEWAY_DEVICE_TELEMETRY_DATA_POINTS_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransportGatewayDeviceTelemetryDataPointsRateLimit(@Nullable String transportGatewayDeviceTelemetryDataPointsRateLimit) {
    this.transportGatewayDeviceTelemetryDataPointsRateLimit = transportGatewayDeviceTelemetryDataPointsRateLimit;
  }


  public DefaultTenantProfileConfiguration integrationMsgsPerTenantRateLimit(@Nullable String integrationMsgsPerTenantRateLimit) {
    this.integrationMsgsPerTenantRateLimit = integrationMsgsPerTenantRateLimit;
    return this;
  }

  /**
   * Get integrationMsgsPerTenantRateLimit
   * @return integrationMsgsPerTenantRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEGRATION_MSGS_PER_TENANT_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIntegrationMsgsPerTenantRateLimit() {
    return integrationMsgsPerTenantRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEGRATION_MSGS_PER_TENANT_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationMsgsPerTenantRateLimit(@Nullable String integrationMsgsPerTenantRateLimit) {
    this.integrationMsgsPerTenantRateLimit = integrationMsgsPerTenantRateLimit;
  }


  public DefaultTenantProfileConfiguration integrationMsgsPerDeviceRateLimit(@Nullable String integrationMsgsPerDeviceRateLimit) {
    this.integrationMsgsPerDeviceRateLimit = integrationMsgsPerDeviceRateLimit;
    return this;
  }

  /**
   * Get integrationMsgsPerDeviceRateLimit
   * @return integrationMsgsPerDeviceRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEGRATION_MSGS_PER_DEVICE_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIntegrationMsgsPerDeviceRateLimit() {
    return integrationMsgsPerDeviceRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEGRATION_MSGS_PER_DEVICE_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationMsgsPerDeviceRateLimit(@Nullable String integrationMsgsPerDeviceRateLimit) {
    this.integrationMsgsPerDeviceRateLimit = integrationMsgsPerDeviceRateLimit;
  }


  public DefaultTenantProfileConfiguration integrationMsgsPerAssetRateLimit(@Nullable String integrationMsgsPerAssetRateLimit) {
    this.integrationMsgsPerAssetRateLimit = integrationMsgsPerAssetRateLimit;
    return this;
  }

  /**
   * Get integrationMsgsPerAssetRateLimit
   * @return integrationMsgsPerAssetRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_INTEGRATION_MSGS_PER_ASSET_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIntegrationMsgsPerAssetRateLimit() {
    return integrationMsgsPerAssetRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_INTEGRATION_MSGS_PER_ASSET_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationMsgsPerAssetRateLimit(@Nullable String integrationMsgsPerAssetRateLimit) {
    this.integrationMsgsPerAssetRateLimit = integrationMsgsPerAssetRateLimit;
  }


  public DefaultTenantProfileConfiguration tenantEntityExportRateLimit(@Nullable String tenantEntityExportRateLimit) {
    this.tenantEntityExportRateLimit = tenantEntityExportRateLimit;
    return this;
  }

  /**
   * Get tenantEntityExportRateLimit
   * @return tenantEntityExportRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ENTITY_EXPORT_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTenantEntityExportRateLimit() {
    return tenantEntityExportRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ENTITY_EXPORT_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantEntityExportRateLimit(@Nullable String tenantEntityExportRateLimit) {
    this.tenantEntityExportRateLimit = tenantEntityExportRateLimit;
  }


  public DefaultTenantProfileConfiguration tenantEntityImportRateLimit(@Nullable String tenantEntityImportRateLimit) {
    this.tenantEntityImportRateLimit = tenantEntityImportRateLimit;
    return this;
  }

  /**
   * Get tenantEntityImportRateLimit
   * @return tenantEntityImportRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_ENTITY_IMPORT_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTenantEntityImportRateLimit() {
    return tenantEntityImportRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_ENTITY_IMPORT_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantEntityImportRateLimit(@Nullable String tenantEntityImportRateLimit) {
    this.tenantEntityImportRateLimit = tenantEntityImportRateLimit;
  }


  public DefaultTenantProfileConfiguration tenantNotificationRequestsRateLimit(@Nullable String tenantNotificationRequestsRateLimit) {
    this.tenantNotificationRequestsRateLimit = tenantNotificationRequestsRateLimit;
    return this;
  }

  /**
   * Get tenantNotificationRequestsRateLimit
   * @return tenantNotificationRequestsRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_NOTIFICATION_REQUESTS_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTenantNotificationRequestsRateLimit() {
    return tenantNotificationRequestsRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_NOTIFICATION_REQUESTS_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantNotificationRequestsRateLimit(@Nullable String tenantNotificationRequestsRateLimit) {
    this.tenantNotificationRequestsRateLimit = tenantNotificationRequestsRateLimit;
  }


  public DefaultTenantProfileConfiguration tenantNotificationRequestsPerRuleRateLimit(@Nullable String tenantNotificationRequestsPerRuleRateLimit) {
    this.tenantNotificationRequestsPerRuleRateLimit = tenantNotificationRequestsPerRuleRateLimit;
    return this;
  }

  /**
   * Get tenantNotificationRequestsPerRuleRateLimit
   * @return tenantNotificationRequestsPerRuleRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_NOTIFICATION_REQUESTS_PER_RULE_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTenantNotificationRequestsPerRuleRateLimit() {
    return tenantNotificationRequestsPerRuleRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_NOTIFICATION_REQUESTS_PER_RULE_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantNotificationRequestsPerRuleRateLimit(@Nullable String tenantNotificationRequestsPerRuleRateLimit) {
    this.tenantNotificationRequestsPerRuleRateLimit = tenantNotificationRequestsPerRuleRateLimit;
  }


  public DefaultTenantProfileConfiguration maxTransportMessages(@Nullable Long maxTransportMessages) {
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


  public DefaultTenantProfileConfiguration maxTransportDataPoints(@Nullable Long maxTransportDataPoints) {
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


  public DefaultTenantProfileConfiguration maxREExecutions(@Nullable Long maxREExecutions) {
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


  public DefaultTenantProfileConfiguration maxJSExecutions(@Nullable Long maxJSExecutions) {
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


  public DefaultTenantProfileConfiguration maxTbelExecutions(@Nullable Long maxTbelExecutions) {
    this.maxTbelExecutions = maxTbelExecutions;
    return this;
  }

  /**
   * Get maxTbelExecutions
   * @return maxTbelExecutions
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_TBEL_EXECUTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxTbelExecutions() {
    return maxTbelExecutions;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_TBEL_EXECUTIONS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxTbelExecutions(@Nullable Long maxTbelExecutions) {
    this.maxTbelExecutions = maxTbelExecutions;
  }


  public DefaultTenantProfileConfiguration maxDPStorageDays(@Nullable Long maxDPStorageDays) {
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


  public DefaultTenantProfileConfiguration maxRuleNodeExecutionsPerMessage(@Nullable Integer maxRuleNodeExecutionsPerMessage) {
    this.maxRuleNodeExecutionsPerMessage = maxRuleNodeExecutionsPerMessage;
    return this;
  }

  /**
   * Get maxRuleNodeExecutionsPerMessage
   * @return maxRuleNodeExecutionsPerMessage
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_RULE_NODE_EXECUTIONS_PER_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMaxRuleNodeExecutionsPerMessage() {
    return maxRuleNodeExecutionsPerMessage;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_RULE_NODE_EXECUTIONS_PER_MESSAGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxRuleNodeExecutionsPerMessage(@Nullable Integer maxRuleNodeExecutionsPerMessage) {
    this.maxRuleNodeExecutionsPerMessage = maxRuleNodeExecutionsPerMessage;
  }


  public DefaultTenantProfileConfiguration maxDebugModeDurationMinutes(@Nullable Integer maxDebugModeDurationMinutes) {
    this.maxDebugModeDurationMinutes = maxDebugModeDurationMinutes;
    return this;
  }

  /**
   * Get maxDebugModeDurationMinutes
   * @return maxDebugModeDurationMinutes
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_DEBUG_MODE_DURATION_MINUTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMaxDebugModeDurationMinutes() {
    return maxDebugModeDurationMinutes;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_DEBUG_MODE_DURATION_MINUTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxDebugModeDurationMinutes(@Nullable Integer maxDebugModeDurationMinutes) {
    this.maxDebugModeDurationMinutes = maxDebugModeDurationMinutes;
  }


  public DefaultTenantProfileConfiguration maxEmails(@Nullable Long maxEmails) {
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


  public DefaultTenantProfileConfiguration smsEnabled(@Nullable Boolean smsEnabled) {
    this.smsEnabled = smsEnabled;
    return this;
  }

  /**
   * Get smsEnabled
   * @return smsEnabled
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_SMS_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSmsEnabled() {
    return smsEnabled;
  }


  @JsonProperty(value = JSON_PROPERTY_SMS_ENABLED, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmsEnabled(@Nullable Boolean smsEnabled) {
    this.smsEnabled = smsEnabled;
  }


  public DefaultTenantProfileConfiguration maxSms(@Nullable Long maxSms) {
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


  public DefaultTenantProfileConfiguration maxCreatedAlarms(@Nullable Long maxCreatedAlarms) {
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


  public DefaultTenantProfileConfiguration maxGeneratedReports(@Nullable Long maxGeneratedReports) {
    this.maxGeneratedReports = maxGeneratedReports;
    return this;
  }

  /**
   * Get maxGeneratedReports
   * @return maxGeneratedReports
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_GENERATED_REPORTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxGeneratedReports() {
    return maxGeneratedReports;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_GENERATED_REPORTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxGeneratedReports(@Nullable Long maxGeneratedReports) {
    this.maxGeneratedReports = maxGeneratedReports;
  }


  public DefaultTenantProfileConfiguration tenantServerRestLimitsConfiguration(@Nullable String tenantServerRestLimitsConfiguration) {
    this.tenantServerRestLimitsConfiguration = tenantServerRestLimitsConfiguration;
    return this;
  }

  /**
   * Get tenantServerRestLimitsConfiguration
   * @return tenantServerRestLimitsConfiguration
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_TENANT_SERVER_REST_LIMITS_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTenantServerRestLimitsConfiguration() {
    return tenantServerRestLimitsConfiguration;
  }


  @JsonProperty(value = JSON_PROPERTY_TENANT_SERVER_REST_LIMITS_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantServerRestLimitsConfiguration(@Nullable String tenantServerRestLimitsConfiguration) {
    this.tenantServerRestLimitsConfiguration = tenantServerRestLimitsConfiguration;
  }


  public DefaultTenantProfileConfiguration customerServerRestLimitsConfiguration(@Nullable String customerServerRestLimitsConfiguration) {
    this.customerServerRestLimitsConfiguration = customerServerRestLimitsConfiguration;
    return this;
  }

  /**
   * Get customerServerRestLimitsConfiguration
   * @return customerServerRestLimitsConfiguration
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_SERVER_REST_LIMITS_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomerServerRestLimitsConfiguration() {
    return customerServerRestLimitsConfiguration;
  }


  @JsonProperty(value = JSON_PROPERTY_CUSTOMER_SERVER_REST_LIMITS_CONFIGURATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerServerRestLimitsConfiguration(@Nullable String customerServerRestLimitsConfiguration) {
    this.customerServerRestLimitsConfiguration = customerServerRestLimitsConfiguration;
  }


  public DefaultTenantProfileConfiguration maxWsSessionsPerTenant(@Nullable Integer maxWsSessionsPerTenant) {
    this.maxWsSessionsPerTenant = maxWsSessionsPerTenant;
    return this;
  }

  /**
   * Get maxWsSessionsPerTenant
   * @return maxWsSessionsPerTenant
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_WS_SESSIONS_PER_TENANT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMaxWsSessionsPerTenant() {
    return maxWsSessionsPerTenant;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_WS_SESSIONS_PER_TENANT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxWsSessionsPerTenant(@Nullable Integer maxWsSessionsPerTenant) {
    this.maxWsSessionsPerTenant = maxWsSessionsPerTenant;
  }


  public DefaultTenantProfileConfiguration maxWsSessionsPerCustomer(@Nullable Integer maxWsSessionsPerCustomer) {
    this.maxWsSessionsPerCustomer = maxWsSessionsPerCustomer;
    return this;
  }

  /**
   * Get maxWsSessionsPerCustomer
   * @return maxWsSessionsPerCustomer
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_WS_SESSIONS_PER_CUSTOMER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMaxWsSessionsPerCustomer() {
    return maxWsSessionsPerCustomer;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_WS_SESSIONS_PER_CUSTOMER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxWsSessionsPerCustomer(@Nullable Integer maxWsSessionsPerCustomer) {
    this.maxWsSessionsPerCustomer = maxWsSessionsPerCustomer;
  }


  public DefaultTenantProfileConfiguration maxWsSessionsPerRegularUser(@Nullable Integer maxWsSessionsPerRegularUser) {
    this.maxWsSessionsPerRegularUser = maxWsSessionsPerRegularUser;
    return this;
  }

  /**
   * Get maxWsSessionsPerRegularUser
   * @return maxWsSessionsPerRegularUser
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_WS_SESSIONS_PER_REGULAR_USER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMaxWsSessionsPerRegularUser() {
    return maxWsSessionsPerRegularUser;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_WS_SESSIONS_PER_REGULAR_USER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxWsSessionsPerRegularUser(@Nullable Integer maxWsSessionsPerRegularUser) {
    this.maxWsSessionsPerRegularUser = maxWsSessionsPerRegularUser;
  }


  public DefaultTenantProfileConfiguration maxWsSessionsPerPublicUser(@Nullable Integer maxWsSessionsPerPublicUser) {
    this.maxWsSessionsPerPublicUser = maxWsSessionsPerPublicUser;
    return this;
  }

  /**
   * Get maxWsSessionsPerPublicUser
   * @return maxWsSessionsPerPublicUser
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_WS_SESSIONS_PER_PUBLIC_USER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMaxWsSessionsPerPublicUser() {
    return maxWsSessionsPerPublicUser;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_WS_SESSIONS_PER_PUBLIC_USER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxWsSessionsPerPublicUser(@Nullable Integer maxWsSessionsPerPublicUser) {
    this.maxWsSessionsPerPublicUser = maxWsSessionsPerPublicUser;
  }


  public DefaultTenantProfileConfiguration wsMsgQueueLimitPerSession(@Nullable Integer wsMsgQueueLimitPerSession) {
    this.wsMsgQueueLimitPerSession = wsMsgQueueLimitPerSession;
    return this;
  }

  /**
   * Get wsMsgQueueLimitPerSession
   * @return wsMsgQueueLimitPerSession
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_WS_MSG_QUEUE_LIMIT_PER_SESSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getWsMsgQueueLimitPerSession() {
    return wsMsgQueueLimitPerSession;
  }


  @JsonProperty(value = JSON_PROPERTY_WS_MSG_QUEUE_LIMIT_PER_SESSION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWsMsgQueueLimitPerSession(@Nullable Integer wsMsgQueueLimitPerSession) {
    this.wsMsgQueueLimitPerSession = wsMsgQueueLimitPerSession;
  }


  public DefaultTenantProfileConfiguration maxWsSubscriptionsPerTenant(@Nullable Long maxWsSubscriptionsPerTenant) {
    this.maxWsSubscriptionsPerTenant = maxWsSubscriptionsPerTenant;
    return this;
  }

  /**
   * Get maxWsSubscriptionsPerTenant
   * @return maxWsSubscriptionsPerTenant
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_WS_SUBSCRIPTIONS_PER_TENANT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxWsSubscriptionsPerTenant() {
    return maxWsSubscriptionsPerTenant;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_WS_SUBSCRIPTIONS_PER_TENANT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxWsSubscriptionsPerTenant(@Nullable Long maxWsSubscriptionsPerTenant) {
    this.maxWsSubscriptionsPerTenant = maxWsSubscriptionsPerTenant;
  }


  public DefaultTenantProfileConfiguration maxWsSubscriptionsPerCustomer(@Nullable Long maxWsSubscriptionsPerCustomer) {
    this.maxWsSubscriptionsPerCustomer = maxWsSubscriptionsPerCustomer;
    return this;
  }

  /**
   * Get maxWsSubscriptionsPerCustomer
   * @return maxWsSubscriptionsPerCustomer
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_WS_SUBSCRIPTIONS_PER_CUSTOMER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxWsSubscriptionsPerCustomer() {
    return maxWsSubscriptionsPerCustomer;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_WS_SUBSCRIPTIONS_PER_CUSTOMER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxWsSubscriptionsPerCustomer(@Nullable Long maxWsSubscriptionsPerCustomer) {
    this.maxWsSubscriptionsPerCustomer = maxWsSubscriptionsPerCustomer;
  }


  public DefaultTenantProfileConfiguration maxWsSubscriptionsPerRegularUser(@Nullable Long maxWsSubscriptionsPerRegularUser) {
    this.maxWsSubscriptionsPerRegularUser = maxWsSubscriptionsPerRegularUser;
    return this;
  }

  /**
   * Get maxWsSubscriptionsPerRegularUser
   * @return maxWsSubscriptionsPerRegularUser
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_WS_SUBSCRIPTIONS_PER_REGULAR_USER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxWsSubscriptionsPerRegularUser() {
    return maxWsSubscriptionsPerRegularUser;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_WS_SUBSCRIPTIONS_PER_REGULAR_USER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxWsSubscriptionsPerRegularUser(@Nullable Long maxWsSubscriptionsPerRegularUser) {
    this.maxWsSubscriptionsPerRegularUser = maxWsSubscriptionsPerRegularUser;
  }


  public DefaultTenantProfileConfiguration maxWsSubscriptionsPerPublicUser(@Nullable Long maxWsSubscriptionsPerPublicUser) {
    this.maxWsSubscriptionsPerPublicUser = maxWsSubscriptionsPerPublicUser;
    return this;
  }

  /**
   * Get maxWsSubscriptionsPerPublicUser
   * @return maxWsSubscriptionsPerPublicUser
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_WS_SUBSCRIPTIONS_PER_PUBLIC_USER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxWsSubscriptionsPerPublicUser() {
    return maxWsSubscriptionsPerPublicUser;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_WS_SUBSCRIPTIONS_PER_PUBLIC_USER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxWsSubscriptionsPerPublicUser(@Nullable Long maxWsSubscriptionsPerPublicUser) {
    this.maxWsSubscriptionsPerPublicUser = maxWsSubscriptionsPerPublicUser;
  }


  public DefaultTenantProfileConfiguration wsUpdatesPerSessionRateLimit(@Nullable String wsUpdatesPerSessionRateLimit) {
    this.wsUpdatesPerSessionRateLimit = wsUpdatesPerSessionRateLimit;
    return this;
  }

  /**
   * Get wsUpdatesPerSessionRateLimit
   * @return wsUpdatesPerSessionRateLimit
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_WS_UPDATES_PER_SESSION_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWsUpdatesPerSessionRateLimit() {
    return wsUpdatesPerSessionRateLimit;
  }


  @JsonProperty(value = JSON_PROPERTY_WS_UPDATES_PER_SESSION_RATE_LIMIT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWsUpdatesPerSessionRateLimit(@Nullable String wsUpdatesPerSessionRateLimit) {
    this.wsUpdatesPerSessionRateLimit = wsUpdatesPerSessionRateLimit;
  }


  public DefaultTenantProfileConfiguration cassandraReadQueryTenantCoreRateLimits(@Nullable String cassandraReadQueryTenantCoreRateLimits) {
    this.cassandraReadQueryTenantCoreRateLimits = cassandraReadQueryTenantCoreRateLimits;
    return this;
  }

  /**
   * Get cassandraReadQueryTenantCoreRateLimits
   * @return cassandraReadQueryTenantCoreRateLimits
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CASSANDRA_READ_QUERY_TENANT_CORE_RATE_LIMITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCassandraReadQueryTenantCoreRateLimits() {
    return cassandraReadQueryTenantCoreRateLimits;
  }


  @JsonProperty(value = JSON_PROPERTY_CASSANDRA_READ_QUERY_TENANT_CORE_RATE_LIMITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCassandraReadQueryTenantCoreRateLimits(@Nullable String cassandraReadQueryTenantCoreRateLimits) {
    this.cassandraReadQueryTenantCoreRateLimits = cassandraReadQueryTenantCoreRateLimits;
  }


  public DefaultTenantProfileConfiguration cassandraWriteQueryTenantCoreRateLimits(@Nullable String cassandraWriteQueryTenantCoreRateLimits) {
    this.cassandraWriteQueryTenantCoreRateLimits = cassandraWriteQueryTenantCoreRateLimits;
    return this;
  }

  /**
   * Get cassandraWriteQueryTenantCoreRateLimits
   * @return cassandraWriteQueryTenantCoreRateLimits
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CASSANDRA_WRITE_QUERY_TENANT_CORE_RATE_LIMITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCassandraWriteQueryTenantCoreRateLimits() {
    return cassandraWriteQueryTenantCoreRateLimits;
  }


  @JsonProperty(value = JSON_PROPERTY_CASSANDRA_WRITE_QUERY_TENANT_CORE_RATE_LIMITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCassandraWriteQueryTenantCoreRateLimits(@Nullable String cassandraWriteQueryTenantCoreRateLimits) {
    this.cassandraWriteQueryTenantCoreRateLimits = cassandraWriteQueryTenantCoreRateLimits;
  }


  public DefaultTenantProfileConfiguration cassandraReadQueryTenantRuleEngineRateLimits(@Nullable String cassandraReadQueryTenantRuleEngineRateLimits) {
    this.cassandraReadQueryTenantRuleEngineRateLimits = cassandraReadQueryTenantRuleEngineRateLimits;
    return this;
  }

  /**
   * Get cassandraReadQueryTenantRuleEngineRateLimits
   * @return cassandraReadQueryTenantRuleEngineRateLimits
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CASSANDRA_READ_QUERY_TENANT_RULE_ENGINE_RATE_LIMITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCassandraReadQueryTenantRuleEngineRateLimits() {
    return cassandraReadQueryTenantRuleEngineRateLimits;
  }


  @JsonProperty(value = JSON_PROPERTY_CASSANDRA_READ_QUERY_TENANT_RULE_ENGINE_RATE_LIMITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCassandraReadQueryTenantRuleEngineRateLimits(@Nullable String cassandraReadQueryTenantRuleEngineRateLimits) {
    this.cassandraReadQueryTenantRuleEngineRateLimits = cassandraReadQueryTenantRuleEngineRateLimits;
  }


  public DefaultTenantProfileConfiguration cassandraWriteQueryTenantRuleEngineRateLimits(@Nullable String cassandraWriteQueryTenantRuleEngineRateLimits) {
    this.cassandraWriteQueryTenantRuleEngineRateLimits = cassandraWriteQueryTenantRuleEngineRateLimits;
    return this;
  }

  /**
   * Get cassandraWriteQueryTenantRuleEngineRateLimits
   * @return cassandraWriteQueryTenantRuleEngineRateLimits
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CASSANDRA_WRITE_QUERY_TENANT_RULE_ENGINE_RATE_LIMITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCassandraWriteQueryTenantRuleEngineRateLimits() {
    return cassandraWriteQueryTenantRuleEngineRateLimits;
  }


  @JsonProperty(value = JSON_PROPERTY_CASSANDRA_WRITE_QUERY_TENANT_RULE_ENGINE_RATE_LIMITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCassandraWriteQueryTenantRuleEngineRateLimits(@Nullable String cassandraWriteQueryTenantRuleEngineRateLimits) {
    this.cassandraWriteQueryTenantRuleEngineRateLimits = cassandraWriteQueryTenantRuleEngineRateLimits;
  }


  public DefaultTenantProfileConfiguration edgeEventRateLimits(@Nullable String edgeEventRateLimits) {
    this.edgeEventRateLimits = edgeEventRateLimits;
    return this;
  }

  /**
   * Get edgeEventRateLimits
   * @return edgeEventRateLimits
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EDGE_EVENT_RATE_LIMITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEdgeEventRateLimits() {
    return edgeEventRateLimits;
  }


  @JsonProperty(value = JSON_PROPERTY_EDGE_EVENT_RATE_LIMITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdgeEventRateLimits(@Nullable String edgeEventRateLimits) {
    this.edgeEventRateLimits = edgeEventRateLimits;
  }


  public DefaultTenantProfileConfiguration edgeEventRateLimitsPerEdge(@Nullable String edgeEventRateLimitsPerEdge) {
    this.edgeEventRateLimitsPerEdge = edgeEventRateLimitsPerEdge;
    return this;
  }

  /**
   * Get edgeEventRateLimitsPerEdge
   * @return edgeEventRateLimitsPerEdge
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EDGE_EVENT_RATE_LIMITS_PER_EDGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEdgeEventRateLimitsPerEdge() {
    return edgeEventRateLimitsPerEdge;
  }


  @JsonProperty(value = JSON_PROPERTY_EDGE_EVENT_RATE_LIMITS_PER_EDGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdgeEventRateLimitsPerEdge(@Nullable String edgeEventRateLimitsPerEdge) {
    this.edgeEventRateLimitsPerEdge = edgeEventRateLimitsPerEdge;
  }


  public DefaultTenantProfileConfiguration edgeUplinkMessagesRateLimits(@Nullable String edgeUplinkMessagesRateLimits) {
    this.edgeUplinkMessagesRateLimits = edgeUplinkMessagesRateLimits;
    return this;
  }

  /**
   * Get edgeUplinkMessagesRateLimits
   * @return edgeUplinkMessagesRateLimits
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EDGE_UPLINK_MESSAGES_RATE_LIMITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEdgeUplinkMessagesRateLimits() {
    return edgeUplinkMessagesRateLimits;
  }


  @JsonProperty(value = JSON_PROPERTY_EDGE_UPLINK_MESSAGES_RATE_LIMITS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdgeUplinkMessagesRateLimits(@Nullable String edgeUplinkMessagesRateLimits) {
    this.edgeUplinkMessagesRateLimits = edgeUplinkMessagesRateLimits;
  }


  public DefaultTenantProfileConfiguration edgeUplinkMessagesRateLimitsPerEdge(@Nullable String edgeUplinkMessagesRateLimitsPerEdge) {
    this.edgeUplinkMessagesRateLimitsPerEdge = edgeUplinkMessagesRateLimitsPerEdge;
    return this;
  }

  /**
   * Get edgeUplinkMessagesRateLimitsPerEdge
   * @return edgeUplinkMessagesRateLimitsPerEdge
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_EDGE_UPLINK_MESSAGES_RATE_LIMITS_PER_EDGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEdgeUplinkMessagesRateLimitsPerEdge() {
    return edgeUplinkMessagesRateLimitsPerEdge;
  }


  @JsonProperty(value = JSON_PROPERTY_EDGE_UPLINK_MESSAGES_RATE_LIMITS_PER_EDGE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdgeUplinkMessagesRateLimitsPerEdge(@Nullable String edgeUplinkMessagesRateLimitsPerEdge) {
    this.edgeUplinkMessagesRateLimitsPerEdge = edgeUplinkMessagesRateLimitsPerEdge;
  }


  public DefaultTenantProfileConfiguration defaultStorageTtlDays(@Nullable Integer defaultStorageTtlDays) {
    this.defaultStorageTtlDays = defaultStorageTtlDays;
    return this;
  }

  /**
   * Get defaultStorageTtlDays
   * @return defaultStorageTtlDays
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_DEFAULT_STORAGE_TTL_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getDefaultStorageTtlDays() {
    return defaultStorageTtlDays;
  }


  @JsonProperty(value = JSON_PROPERTY_DEFAULT_STORAGE_TTL_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultStorageTtlDays(@Nullable Integer defaultStorageTtlDays) {
    this.defaultStorageTtlDays = defaultStorageTtlDays;
  }


  public DefaultTenantProfileConfiguration alarmsTtlDays(@Nullable Integer alarmsTtlDays) {
    this.alarmsTtlDays = alarmsTtlDays;
    return this;
  }

  /**
   * Get alarmsTtlDays
   * @return alarmsTtlDays
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ALARMS_TTL_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getAlarmsTtlDays() {
    return alarmsTtlDays;
  }


  @JsonProperty(value = JSON_PROPERTY_ALARMS_TTL_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlarmsTtlDays(@Nullable Integer alarmsTtlDays) {
    this.alarmsTtlDays = alarmsTtlDays;
  }


  public DefaultTenantProfileConfiguration rpcTtlDays(@Nullable Integer rpcTtlDays) {
    this.rpcTtlDays = rpcTtlDays;
    return this;
  }

  /**
   * Get rpcTtlDays
   * @return rpcTtlDays
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RPC_TTL_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getRpcTtlDays() {
    return rpcTtlDays;
  }


  @JsonProperty(value = JSON_PROPERTY_RPC_TTL_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRpcTtlDays(@Nullable Integer rpcTtlDays) {
    this.rpcTtlDays = rpcTtlDays;
  }


  public DefaultTenantProfileConfiguration queueStatsTtlDays(@Nullable Integer queueStatsTtlDays) {
    this.queueStatsTtlDays = queueStatsTtlDays;
    return this;
  }

  /**
   * Get queueStatsTtlDays
   * @return queueStatsTtlDays
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_QUEUE_STATS_TTL_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getQueueStatsTtlDays() {
    return queueStatsTtlDays;
  }


  @JsonProperty(value = JSON_PROPERTY_QUEUE_STATS_TTL_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueueStatsTtlDays(@Nullable Integer queueStatsTtlDays) {
    this.queueStatsTtlDays = queueStatsTtlDays;
  }


  public DefaultTenantProfileConfiguration ruleEngineExceptionsTtlDays(@Nullable Integer ruleEngineExceptionsTtlDays) {
    this.ruleEngineExceptionsTtlDays = ruleEngineExceptionsTtlDays;
    return this;
  }

  /**
   * Get ruleEngineExceptionsTtlDays
   * @return ruleEngineExceptionsTtlDays
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_RULE_ENGINE_EXCEPTIONS_TTL_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getRuleEngineExceptionsTtlDays() {
    return ruleEngineExceptionsTtlDays;
  }


  @JsonProperty(value = JSON_PROPERTY_RULE_ENGINE_EXCEPTIONS_TTL_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleEngineExceptionsTtlDays(@Nullable Integer ruleEngineExceptionsTtlDays) {
    this.ruleEngineExceptionsTtlDays = ruleEngineExceptionsTtlDays;
  }


  public DefaultTenantProfileConfiguration blobEntityTtlDays(@Nullable Integer blobEntityTtlDays) {
    this.blobEntityTtlDays = blobEntityTtlDays;
    return this;
  }

  /**
   * Get blobEntityTtlDays
   * @return blobEntityTtlDays
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_BLOB_ENTITY_TTL_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getBlobEntityTtlDays() {
    return blobEntityTtlDays;
  }


  @JsonProperty(value = JSON_PROPERTY_BLOB_ENTITY_TTL_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlobEntityTtlDays(@Nullable Integer blobEntityTtlDays) {
    this.blobEntityTtlDays = blobEntityTtlDays;
  }


  public DefaultTenantProfileConfiguration reportTtlDays(@Nullable Integer reportTtlDays) {
    this.reportTtlDays = reportTtlDays;
    return this;
  }

  /**
   * Get reportTtlDays
   * @return reportTtlDays
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_REPORT_TTL_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getReportTtlDays() {
    return reportTtlDays;
  }


  @JsonProperty(value = JSON_PROPERTY_REPORT_TTL_DAYS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportTtlDays(@Nullable Integer reportTtlDays) {
    this.reportTtlDays = reportTtlDays;
  }


  public DefaultTenantProfileConfiguration warnThreshold(@Nullable Double warnThreshold) {
    this.warnThreshold = warnThreshold;
    return this;
  }

  /**
   * Get warnThreshold
   * @return warnThreshold
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_WARN_THRESHOLD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWarnThreshold() {
    return warnThreshold;
  }


  @JsonProperty(value = JSON_PROPERTY_WARN_THRESHOLD, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarnThreshold(@Nullable Double warnThreshold) {
    this.warnThreshold = warnThreshold;
  }


  public DefaultTenantProfileConfiguration maxCalculatedFieldsPerEntity(@Nullable Long maxCalculatedFieldsPerEntity) {
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


  public DefaultTenantProfileConfiguration maxArgumentsPerCF(@Nullable Long maxArgumentsPerCF) {
    this.maxArgumentsPerCF = maxArgumentsPerCF;
    return this;
  }

  /**
   * Get maxArgumentsPerCF
   * @return maxArgumentsPerCF
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_ARGUMENTS_PER_C_F, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxArgumentsPerCF() {
    return maxArgumentsPerCF;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_ARGUMENTS_PER_C_F, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxArgumentsPerCF(@Nullable Long maxArgumentsPerCF) {
    this.maxArgumentsPerCF = maxArgumentsPerCF;
  }


  public DefaultTenantProfileConfiguration minAllowedScheduledUpdateIntervalInSecForCF(@Nullable Integer minAllowedScheduledUpdateIntervalInSecForCF) {
    this.minAllowedScheduledUpdateIntervalInSecForCF = minAllowedScheduledUpdateIntervalInSecForCF;
    return this;
  }

  /**
   * Get minAllowedScheduledUpdateIntervalInSecForCF
   * @return minAllowedScheduledUpdateIntervalInSecForCF
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MIN_ALLOWED_SCHEDULED_UPDATE_INTERVAL_IN_SEC_FOR_C_F, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMinAllowedScheduledUpdateIntervalInSecForCF() {
    return minAllowedScheduledUpdateIntervalInSecForCF;
  }


  @JsonProperty(value = JSON_PROPERTY_MIN_ALLOWED_SCHEDULED_UPDATE_INTERVAL_IN_SEC_FOR_C_F, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinAllowedScheduledUpdateIntervalInSecForCF(@Nullable Integer minAllowedScheduledUpdateIntervalInSecForCF) {
    this.minAllowedScheduledUpdateIntervalInSecForCF = minAllowedScheduledUpdateIntervalInSecForCF;
  }


  public DefaultTenantProfileConfiguration maxRelationLevelPerCfArgument(@Nullable Integer maxRelationLevelPerCfArgument) {
    this.maxRelationLevelPerCfArgument = maxRelationLevelPerCfArgument;
    return this;
  }

  /**
   * Get maxRelationLevelPerCfArgument
   * @return maxRelationLevelPerCfArgument
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_RELATION_LEVEL_PER_CF_ARGUMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMaxRelationLevelPerCfArgument() {
    return maxRelationLevelPerCfArgument;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_RELATION_LEVEL_PER_CF_ARGUMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxRelationLevelPerCfArgument(@Nullable Integer maxRelationLevelPerCfArgument) {
    this.maxRelationLevelPerCfArgument = maxRelationLevelPerCfArgument;
  }


  public DefaultTenantProfileConfiguration maxRelatedEntitiesToReturnPerCfArgument(@Nullable Integer maxRelatedEntitiesToReturnPerCfArgument) {
    this.maxRelatedEntitiesToReturnPerCfArgument = maxRelatedEntitiesToReturnPerCfArgument;
    return this;
  }

  /**
   * Get maxRelatedEntitiesToReturnPerCfArgument
   * @return maxRelatedEntitiesToReturnPerCfArgument
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_RELATED_ENTITIES_TO_RETURN_PER_CF_ARGUMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMaxRelatedEntitiesToReturnPerCfArgument() {
    return maxRelatedEntitiesToReturnPerCfArgument;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_RELATED_ENTITIES_TO_RETURN_PER_CF_ARGUMENT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxRelatedEntitiesToReturnPerCfArgument(@Nullable Integer maxRelatedEntitiesToReturnPerCfArgument) {
    this.maxRelatedEntitiesToReturnPerCfArgument = maxRelatedEntitiesToReturnPerCfArgument;
  }


  public DefaultTenantProfileConfiguration maxDataPointsPerRollingArg(@Nullable Long maxDataPointsPerRollingArg) {
    this.maxDataPointsPerRollingArg = maxDataPointsPerRollingArg;
    return this;
  }

  /**
   * Get maxDataPointsPerRollingArg
   * @return maxDataPointsPerRollingArg
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_DATA_POINTS_PER_ROLLING_ARG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxDataPointsPerRollingArg() {
    return maxDataPointsPerRollingArg;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_DATA_POINTS_PER_ROLLING_ARG, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxDataPointsPerRollingArg(@Nullable Long maxDataPointsPerRollingArg) {
    this.maxDataPointsPerRollingArg = maxDataPointsPerRollingArg;
  }


  public DefaultTenantProfileConfiguration maxStateSizeInKBytes(@Nullable Long maxStateSizeInKBytes) {
    this.maxStateSizeInKBytes = maxStateSizeInKBytes;
    return this;
  }

  /**
   * Get maxStateSizeInKBytes
   * @return maxStateSizeInKBytes
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_STATE_SIZE_IN_K_BYTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxStateSizeInKBytes() {
    return maxStateSizeInKBytes;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_STATE_SIZE_IN_K_BYTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxStateSizeInKBytes(@Nullable Long maxStateSizeInKBytes) {
    this.maxStateSizeInKBytes = maxStateSizeInKBytes;
  }


  public DefaultTenantProfileConfiguration maxSingleValueArgumentSizeInKBytes(@Nullable Long maxSingleValueArgumentSizeInKBytes) {
    this.maxSingleValueArgumentSizeInKBytes = maxSingleValueArgumentSizeInKBytes;
    return this;
  }

  /**
   * Get maxSingleValueArgumentSizeInKBytes
   * @return maxSingleValueArgumentSizeInKBytes
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MAX_SINGLE_VALUE_ARGUMENT_SIZE_IN_K_BYTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxSingleValueArgumentSizeInKBytes() {
    return maxSingleValueArgumentSizeInKBytes;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX_SINGLE_VALUE_ARGUMENT_SIZE_IN_K_BYTES, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxSingleValueArgumentSizeInKBytes(@Nullable Long maxSingleValueArgumentSizeInKBytes) {
    this.maxSingleValueArgumentSizeInKBytes = maxSingleValueArgumentSizeInKBytes;
  }


  public DefaultTenantProfileConfiguration minAllowedDeduplicationIntervalInSecForCF(@Nullable Long minAllowedDeduplicationIntervalInSecForCF) {
    this.minAllowedDeduplicationIntervalInSecForCF = minAllowedDeduplicationIntervalInSecForCF;
    return this;
  }

  /**
   * Get minAllowedDeduplicationIntervalInSecForCF
   * @return minAllowedDeduplicationIntervalInSecForCF
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MIN_ALLOWED_DEDUPLICATION_INTERVAL_IN_SEC_FOR_C_F, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMinAllowedDeduplicationIntervalInSecForCF() {
    return minAllowedDeduplicationIntervalInSecForCF;
  }


  @JsonProperty(value = JSON_PROPERTY_MIN_ALLOWED_DEDUPLICATION_INTERVAL_IN_SEC_FOR_C_F, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinAllowedDeduplicationIntervalInSecForCF(@Nullable Long minAllowedDeduplicationIntervalInSecForCF) {
    this.minAllowedDeduplicationIntervalInSecForCF = minAllowedDeduplicationIntervalInSecForCF;
  }


  public DefaultTenantProfileConfiguration minAllowedAggregationIntervalInSecForCF(@Nullable Long minAllowedAggregationIntervalInSecForCF) {
    this.minAllowedAggregationIntervalInSecForCF = minAllowedAggregationIntervalInSecForCF;
    return this;
  }

  /**
   * Get minAllowedAggregationIntervalInSecForCF
   * @return minAllowedAggregationIntervalInSecForCF
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_MIN_ALLOWED_AGGREGATION_INTERVAL_IN_SEC_FOR_C_F, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMinAllowedAggregationIntervalInSecForCF() {
    return minAllowedAggregationIntervalInSecForCF;
  }


  @JsonProperty(value = JSON_PROPERTY_MIN_ALLOWED_AGGREGATION_INTERVAL_IN_SEC_FOR_C_F, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinAllowedAggregationIntervalInSecForCF(@Nullable Long minAllowedAggregationIntervalInSecForCF) {
    this.minAllowedAggregationIntervalInSecForCF = minAllowedAggregationIntervalInSecForCF;
  }


  public DefaultTenantProfileConfiguration intermediateAggregationIntervalInSecForCF(@Nullable Long intermediateAggregationIntervalInSecForCF) {
    this.intermediateAggregationIntervalInSecForCF = intermediateAggregationIntervalInSecForCF;
    return this;
  }

  /**
   * Get intermediateAggregationIntervalInSecForCF
   * @return intermediateAggregationIntervalInSecForCF
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_INTERMEDIATE_AGGREGATION_INTERVAL_IN_SEC_FOR_C_F, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIntermediateAggregationIntervalInSecForCF() {
    return intermediateAggregationIntervalInSecForCF;
  }


  @JsonProperty(value = JSON_PROPERTY_INTERMEDIATE_AGGREGATION_INTERVAL_IN_SEC_FOR_C_F, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntermediateAggregationIntervalInSecForCF(@Nullable Long intermediateAggregationIntervalInSecForCF) {
    this.intermediateAggregationIntervalInSecForCF = intermediateAggregationIntervalInSecForCF;
  }


  public DefaultTenantProfileConfiguration cfReevaluationCheckInterval(@Nullable Long cfReevaluationCheckInterval) {
    this.cfReevaluationCheckInterval = cfReevaluationCheckInterval;
    return this;
  }

  /**
   * Get cfReevaluationCheckInterval
   * @return cfReevaluationCheckInterval
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_CF_REEVALUATION_CHECK_INTERVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCfReevaluationCheckInterval() {
    return cfReevaluationCheckInterval;
  }


  @JsonProperty(value = JSON_PROPERTY_CF_REEVALUATION_CHECK_INTERVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCfReevaluationCheckInterval(@Nullable Long cfReevaluationCheckInterval) {
    this.cfReevaluationCheckInterval = cfReevaluationCheckInterval;
  }


  public DefaultTenantProfileConfiguration alarmsReevaluationInterval(@Nullable Long alarmsReevaluationInterval) {
    this.alarmsReevaluationInterval = alarmsReevaluationInterval;
    return this;
  }

  /**
   * Get alarmsReevaluationInterval
   * @return alarmsReevaluationInterval
   */
  @Nullable
  @JsonProperty(value = JSON_PROPERTY_ALARMS_REEVALUATION_INTERVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAlarmsReevaluationInterval() {
    return alarmsReevaluationInterval;
  }


  @JsonProperty(value = JSON_PROPERTY_ALARMS_REEVALUATION_INTERVAL, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlarmsReevaluationInterval(@Nullable Long alarmsReevaluationInterval) {
    this.alarmsReevaluationInterval = alarmsReevaluationInterval;
  }


  @Override
  public DefaultTenantProfileConfiguration type(@Nonnull String type) {
    this.setType(type);
    return this;
  }

  /**
   * Return true if this DefaultTenantProfileConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultTenantProfileConfiguration defaultTenantProfileConfiguration = (DefaultTenantProfileConfiguration) o;
    return Objects.equals(this.maxDevices, defaultTenantProfileConfiguration.maxDevices) &&
        Objects.equals(this.maxAssets, defaultTenantProfileConfiguration.maxAssets) &&
        Objects.equals(this.maxCustomers, defaultTenantProfileConfiguration.maxCustomers) &&
        Objects.equals(this.maxUsers, defaultTenantProfileConfiguration.maxUsers) &&
        Objects.equals(this.maxDashboards, defaultTenantProfileConfiguration.maxDashboards) &&
        Objects.equals(this.maxRuleChains, defaultTenantProfileConfiguration.maxRuleChains) &&
        Objects.equals(this.maxEdges, defaultTenantProfileConfiguration.maxEdges) &&
        Objects.equals(this.maxResourcesInBytes, defaultTenantProfileConfiguration.maxResourcesInBytes) &&
        Objects.equals(this.maxOtaPackagesInBytes, defaultTenantProfileConfiguration.maxOtaPackagesInBytes) &&
        Objects.equals(this.maxResourceSize, defaultTenantProfileConfiguration.maxResourceSize) &&
        Objects.equals(this.maxReportSizeInBytes, defaultTenantProfileConfiguration.maxReportSizeInBytes) &&
        Objects.equals(this.maxIntegrations, defaultTenantProfileConfiguration.maxIntegrations) &&
        Objects.equals(this.maxConverters, defaultTenantProfileConfiguration.maxConverters) &&
        Objects.equals(this.maxSchedulerEvents, defaultTenantProfileConfiguration.maxSchedulerEvents) &&
        Objects.equals(this.transportTenantMsgRateLimit, defaultTenantProfileConfiguration.transportTenantMsgRateLimit) &&
        Objects.equals(this.transportTenantTelemetryMsgRateLimit, defaultTenantProfileConfiguration.transportTenantTelemetryMsgRateLimit) &&
        Objects.equals(this.transportTenantTelemetryDataPointsRateLimit, defaultTenantProfileConfiguration.transportTenantTelemetryDataPointsRateLimit) &&
        Objects.equals(this.transportDeviceMsgRateLimit, defaultTenantProfileConfiguration.transportDeviceMsgRateLimit) &&
        Objects.equals(this.transportDeviceTelemetryMsgRateLimit, defaultTenantProfileConfiguration.transportDeviceTelemetryMsgRateLimit) &&
        Objects.equals(this.transportDeviceTelemetryDataPointsRateLimit, defaultTenantProfileConfiguration.transportDeviceTelemetryDataPointsRateLimit) &&
        Objects.equals(this.transportGatewayMsgRateLimit, defaultTenantProfileConfiguration.transportGatewayMsgRateLimit) &&
        Objects.equals(this.transportGatewayTelemetryMsgRateLimit, defaultTenantProfileConfiguration.transportGatewayTelemetryMsgRateLimit) &&
        Objects.equals(this.transportGatewayTelemetryDataPointsRateLimit, defaultTenantProfileConfiguration.transportGatewayTelemetryDataPointsRateLimit) &&
        Objects.equals(this.transportGatewayDeviceMsgRateLimit, defaultTenantProfileConfiguration.transportGatewayDeviceMsgRateLimit) &&
        Objects.equals(this.transportGatewayDeviceTelemetryMsgRateLimit, defaultTenantProfileConfiguration.transportGatewayDeviceTelemetryMsgRateLimit) &&
        Objects.equals(this.transportGatewayDeviceTelemetryDataPointsRateLimit, defaultTenantProfileConfiguration.transportGatewayDeviceTelemetryDataPointsRateLimit) &&
        Objects.equals(this.integrationMsgsPerTenantRateLimit, defaultTenantProfileConfiguration.integrationMsgsPerTenantRateLimit) &&
        Objects.equals(this.integrationMsgsPerDeviceRateLimit, defaultTenantProfileConfiguration.integrationMsgsPerDeviceRateLimit) &&
        Objects.equals(this.integrationMsgsPerAssetRateLimit, defaultTenantProfileConfiguration.integrationMsgsPerAssetRateLimit) &&
        Objects.equals(this.tenantEntityExportRateLimit, defaultTenantProfileConfiguration.tenantEntityExportRateLimit) &&
        Objects.equals(this.tenantEntityImportRateLimit, defaultTenantProfileConfiguration.tenantEntityImportRateLimit) &&
        Objects.equals(this.tenantNotificationRequestsRateLimit, defaultTenantProfileConfiguration.tenantNotificationRequestsRateLimit) &&
        Objects.equals(this.tenantNotificationRequestsPerRuleRateLimit, defaultTenantProfileConfiguration.tenantNotificationRequestsPerRuleRateLimit) &&
        Objects.equals(this.maxTransportMessages, defaultTenantProfileConfiguration.maxTransportMessages) &&
        Objects.equals(this.maxTransportDataPoints, defaultTenantProfileConfiguration.maxTransportDataPoints) &&
        Objects.equals(this.maxREExecutions, defaultTenantProfileConfiguration.maxREExecutions) &&
        Objects.equals(this.maxJSExecutions, defaultTenantProfileConfiguration.maxJSExecutions) &&
        Objects.equals(this.maxTbelExecutions, defaultTenantProfileConfiguration.maxTbelExecutions) &&
        Objects.equals(this.maxDPStorageDays, defaultTenantProfileConfiguration.maxDPStorageDays) &&
        Objects.equals(this.maxRuleNodeExecutionsPerMessage, defaultTenantProfileConfiguration.maxRuleNodeExecutionsPerMessage) &&
        Objects.equals(this.maxDebugModeDurationMinutes, defaultTenantProfileConfiguration.maxDebugModeDurationMinutes) &&
        Objects.equals(this.maxEmails, defaultTenantProfileConfiguration.maxEmails) &&
        Objects.equals(this.smsEnabled, defaultTenantProfileConfiguration.smsEnabled) &&
        Objects.equals(this.maxSms, defaultTenantProfileConfiguration.maxSms) &&
        Objects.equals(this.maxCreatedAlarms, defaultTenantProfileConfiguration.maxCreatedAlarms) &&
        Objects.equals(this.maxGeneratedReports, defaultTenantProfileConfiguration.maxGeneratedReports) &&
        Objects.equals(this.tenantServerRestLimitsConfiguration, defaultTenantProfileConfiguration.tenantServerRestLimitsConfiguration) &&
        Objects.equals(this.customerServerRestLimitsConfiguration, defaultTenantProfileConfiguration.customerServerRestLimitsConfiguration) &&
        Objects.equals(this.maxWsSessionsPerTenant, defaultTenantProfileConfiguration.maxWsSessionsPerTenant) &&
        Objects.equals(this.maxWsSessionsPerCustomer, defaultTenantProfileConfiguration.maxWsSessionsPerCustomer) &&
        Objects.equals(this.maxWsSessionsPerRegularUser, defaultTenantProfileConfiguration.maxWsSessionsPerRegularUser) &&
        Objects.equals(this.maxWsSessionsPerPublicUser, defaultTenantProfileConfiguration.maxWsSessionsPerPublicUser) &&
        Objects.equals(this.wsMsgQueueLimitPerSession, defaultTenantProfileConfiguration.wsMsgQueueLimitPerSession) &&
        Objects.equals(this.maxWsSubscriptionsPerTenant, defaultTenantProfileConfiguration.maxWsSubscriptionsPerTenant) &&
        Objects.equals(this.maxWsSubscriptionsPerCustomer, defaultTenantProfileConfiguration.maxWsSubscriptionsPerCustomer) &&
        Objects.equals(this.maxWsSubscriptionsPerRegularUser, defaultTenantProfileConfiguration.maxWsSubscriptionsPerRegularUser) &&
        Objects.equals(this.maxWsSubscriptionsPerPublicUser, defaultTenantProfileConfiguration.maxWsSubscriptionsPerPublicUser) &&
        Objects.equals(this.wsUpdatesPerSessionRateLimit, defaultTenantProfileConfiguration.wsUpdatesPerSessionRateLimit) &&
        Objects.equals(this.cassandraReadQueryTenantCoreRateLimits, defaultTenantProfileConfiguration.cassandraReadQueryTenantCoreRateLimits) &&
        Objects.equals(this.cassandraWriteQueryTenantCoreRateLimits, defaultTenantProfileConfiguration.cassandraWriteQueryTenantCoreRateLimits) &&
        Objects.equals(this.cassandraReadQueryTenantRuleEngineRateLimits, defaultTenantProfileConfiguration.cassandraReadQueryTenantRuleEngineRateLimits) &&
        Objects.equals(this.cassandraWriteQueryTenantRuleEngineRateLimits, defaultTenantProfileConfiguration.cassandraWriteQueryTenantRuleEngineRateLimits) &&
        Objects.equals(this.edgeEventRateLimits, defaultTenantProfileConfiguration.edgeEventRateLimits) &&
        Objects.equals(this.edgeEventRateLimitsPerEdge, defaultTenantProfileConfiguration.edgeEventRateLimitsPerEdge) &&
        Objects.equals(this.edgeUplinkMessagesRateLimits, defaultTenantProfileConfiguration.edgeUplinkMessagesRateLimits) &&
        Objects.equals(this.edgeUplinkMessagesRateLimitsPerEdge, defaultTenantProfileConfiguration.edgeUplinkMessagesRateLimitsPerEdge) &&
        Objects.equals(this.defaultStorageTtlDays, defaultTenantProfileConfiguration.defaultStorageTtlDays) &&
        Objects.equals(this.alarmsTtlDays, defaultTenantProfileConfiguration.alarmsTtlDays) &&
        Objects.equals(this.rpcTtlDays, defaultTenantProfileConfiguration.rpcTtlDays) &&
        Objects.equals(this.queueStatsTtlDays, defaultTenantProfileConfiguration.queueStatsTtlDays) &&
        Objects.equals(this.ruleEngineExceptionsTtlDays, defaultTenantProfileConfiguration.ruleEngineExceptionsTtlDays) &&
        Objects.equals(this.blobEntityTtlDays, defaultTenantProfileConfiguration.blobEntityTtlDays) &&
        Objects.equals(this.reportTtlDays, defaultTenantProfileConfiguration.reportTtlDays) &&
        Objects.equals(this.warnThreshold, defaultTenantProfileConfiguration.warnThreshold) &&
        Objects.equals(this.maxCalculatedFieldsPerEntity, defaultTenantProfileConfiguration.maxCalculatedFieldsPerEntity) &&
        Objects.equals(this.maxArgumentsPerCF, defaultTenantProfileConfiguration.maxArgumentsPerCF) &&
        Objects.equals(this.minAllowedScheduledUpdateIntervalInSecForCF, defaultTenantProfileConfiguration.minAllowedScheduledUpdateIntervalInSecForCF) &&
        Objects.equals(this.maxRelationLevelPerCfArgument, defaultTenantProfileConfiguration.maxRelationLevelPerCfArgument) &&
        Objects.equals(this.maxRelatedEntitiesToReturnPerCfArgument, defaultTenantProfileConfiguration.maxRelatedEntitiesToReturnPerCfArgument) &&
        Objects.equals(this.maxDataPointsPerRollingArg, defaultTenantProfileConfiguration.maxDataPointsPerRollingArg) &&
        Objects.equals(this.maxStateSizeInKBytes, defaultTenantProfileConfiguration.maxStateSizeInKBytes) &&
        Objects.equals(this.maxSingleValueArgumentSizeInKBytes, defaultTenantProfileConfiguration.maxSingleValueArgumentSizeInKBytes) &&
        Objects.equals(this.minAllowedDeduplicationIntervalInSecForCF, defaultTenantProfileConfiguration.minAllowedDeduplicationIntervalInSecForCF) &&
        Objects.equals(this.minAllowedAggregationIntervalInSecForCF, defaultTenantProfileConfiguration.minAllowedAggregationIntervalInSecForCF) &&
        Objects.equals(this.intermediateAggregationIntervalInSecForCF, defaultTenantProfileConfiguration.intermediateAggregationIntervalInSecForCF) &&
        Objects.equals(this.cfReevaluationCheckInterval, defaultTenantProfileConfiguration.cfReevaluationCheckInterval) &&
        Objects.equals(this.alarmsReevaluationInterval, defaultTenantProfileConfiguration.alarmsReevaluationInterval) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxDevices, maxAssets, maxCustomers, maxUsers, maxDashboards, maxRuleChains, maxEdges, maxResourcesInBytes, maxOtaPackagesInBytes, maxResourceSize, maxReportSizeInBytes, maxIntegrations, maxConverters, maxSchedulerEvents, transportTenantMsgRateLimit, transportTenantTelemetryMsgRateLimit, transportTenantTelemetryDataPointsRateLimit, transportDeviceMsgRateLimit, transportDeviceTelemetryMsgRateLimit, transportDeviceTelemetryDataPointsRateLimit, transportGatewayMsgRateLimit, transportGatewayTelemetryMsgRateLimit, transportGatewayTelemetryDataPointsRateLimit, transportGatewayDeviceMsgRateLimit, transportGatewayDeviceTelemetryMsgRateLimit, transportGatewayDeviceTelemetryDataPointsRateLimit, integrationMsgsPerTenantRateLimit, integrationMsgsPerDeviceRateLimit, integrationMsgsPerAssetRateLimit, tenantEntityExportRateLimit, tenantEntityImportRateLimit, tenantNotificationRequestsRateLimit, tenantNotificationRequestsPerRuleRateLimit, maxTransportMessages, maxTransportDataPoints, maxREExecutions, maxJSExecutions, maxTbelExecutions, maxDPStorageDays, maxRuleNodeExecutionsPerMessage, maxDebugModeDurationMinutes, maxEmails, smsEnabled, maxSms, maxCreatedAlarms, maxGeneratedReports, tenantServerRestLimitsConfiguration, customerServerRestLimitsConfiguration, maxWsSessionsPerTenant, maxWsSessionsPerCustomer, maxWsSessionsPerRegularUser, maxWsSessionsPerPublicUser, wsMsgQueueLimitPerSession, maxWsSubscriptionsPerTenant, maxWsSubscriptionsPerCustomer, maxWsSubscriptionsPerRegularUser, maxWsSubscriptionsPerPublicUser, wsUpdatesPerSessionRateLimit, cassandraReadQueryTenantCoreRateLimits, cassandraWriteQueryTenantCoreRateLimits, cassandraReadQueryTenantRuleEngineRateLimits, cassandraWriteQueryTenantRuleEngineRateLimits, edgeEventRateLimits, edgeEventRateLimitsPerEdge, edgeUplinkMessagesRateLimits, edgeUplinkMessagesRateLimitsPerEdge, defaultStorageTtlDays, alarmsTtlDays, rpcTtlDays, queueStatsTtlDays, ruleEngineExceptionsTtlDays, blobEntityTtlDays, reportTtlDays, warnThreshold, maxCalculatedFieldsPerEntity, maxArgumentsPerCF, minAllowedScheduledUpdateIntervalInSecForCF, maxRelationLevelPerCfArgument, maxRelatedEntitiesToReturnPerCfArgument, maxDataPointsPerRollingArg, maxStateSizeInKBytes, maxSingleValueArgumentSizeInKBytes, minAllowedDeduplicationIntervalInSecForCF, minAllowedAggregationIntervalInSecForCF, intermediateAggregationIntervalInSecForCF, cfReevaluationCheckInterval, alarmsReevaluationInterval, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultTenantProfileConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    maxDevices: ").append(toIndentedString(maxDevices)).append("\n");
    sb.append("    maxAssets: ").append(toIndentedString(maxAssets)).append("\n");
    sb.append("    maxCustomers: ").append(toIndentedString(maxCustomers)).append("\n");
    sb.append("    maxUsers: ").append(toIndentedString(maxUsers)).append("\n");
    sb.append("    maxDashboards: ").append(toIndentedString(maxDashboards)).append("\n");
    sb.append("    maxRuleChains: ").append(toIndentedString(maxRuleChains)).append("\n");
    sb.append("    maxEdges: ").append(toIndentedString(maxEdges)).append("\n");
    sb.append("    maxResourcesInBytes: ").append(toIndentedString(maxResourcesInBytes)).append("\n");
    sb.append("    maxOtaPackagesInBytes: ").append(toIndentedString(maxOtaPackagesInBytes)).append("\n");
    sb.append("    maxResourceSize: ").append(toIndentedString(maxResourceSize)).append("\n");
    sb.append("    maxReportSizeInBytes: ").append(toIndentedString(maxReportSizeInBytes)).append("\n");
    sb.append("    maxIntegrations: ").append(toIndentedString(maxIntegrations)).append("\n");
    sb.append("    maxConverters: ").append(toIndentedString(maxConverters)).append("\n");
    sb.append("    maxSchedulerEvents: ").append(toIndentedString(maxSchedulerEvents)).append("\n");
    sb.append("    transportTenantMsgRateLimit: ").append(toIndentedString(transportTenantMsgRateLimit)).append("\n");
    sb.append("    transportTenantTelemetryMsgRateLimit: ").append(toIndentedString(transportTenantTelemetryMsgRateLimit)).append("\n");
    sb.append("    transportTenantTelemetryDataPointsRateLimit: ").append(toIndentedString(transportTenantTelemetryDataPointsRateLimit)).append("\n");
    sb.append("    transportDeviceMsgRateLimit: ").append(toIndentedString(transportDeviceMsgRateLimit)).append("\n");
    sb.append("    transportDeviceTelemetryMsgRateLimit: ").append(toIndentedString(transportDeviceTelemetryMsgRateLimit)).append("\n");
    sb.append("    transportDeviceTelemetryDataPointsRateLimit: ").append(toIndentedString(transportDeviceTelemetryDataPointsRateLimit)).append("\n");
    sb.append("    transportGatewayMsgRateLimit: ").append(toIndentedString(transportGatewayMsgRateLimit)).append("\n");
    sb.append("    transportGatewayTelemetryMsgRateLimit: ").append(toIndentedString(transportGatewayTelemetryMsgRateLimit)).append("\n");
    sb.append("    transportGatewayTelemetryDataPointsRateLimit: ").append(toIndentedString(transportGatewayTelemetryDataPointsRateLimit)).append("\n");
    sb.append("    transportGatewayDeviceMsgRateLimit: ").append(toIndentedString(transportGatewayDeviceMsgRateLimit)).append("\n");
    sb.append("    transportGatewayDeviceTelemetryMsgRateLimit: ").append(toIndentedString(transportGatewayDeviceTelemetryMsgRateLimit)).append("\n");
    sb.append("    transportGatewayDeviceTelemetryDataPointsRateLimit: ").append(toIndentedString(transportGatewayDeviceTelemetryDataPointsRateLimit)).append("\n");
    sb.append("    integrationMsgsPerTenantRateLimit: ").append(toIndentedString(integrationMsgsPerTenantRateLimit)).append("\n");
    sb.append("    integrationMsgsPerDeviceRateLimit: ").append(toIndentedString(integrationMsgsPerDeviceRateLimit)).append("\n");
    sb.append("    integrationMsgsPerAssetRateLimit: ").append(toIndentedString(integrationMsgsPerAssetRateLimit)).append("\n");
    sb.append("    tenantEntityExportRateLimit: ").append(toIndentedString(tenantEntityExportRateLimit)).append("\n");
    sb.append("    tenantEntityImportRateLimit: ").append(toIndentedString(tenantEntityImportRateLimit)).append("\n");
    sb.append("    tenantNotificationRequestsRateLimit: ").append(toIndentedString(tenantNotificationRequestsRateLimit)).append("\n");
    sb.append("    tenantNotificationRequestsPerRuleRateLimit: ").append(toIndentedString(tenantNotificationRequestsPerRuleRateLimit)).append("\n");
    sb.append("    maxTransportMessages: ").append(toIndentedString(maxTransportMessages)).append("\n");
    sb.append("    maxTransportDataPoints: ").append(toIndentedString(maxTransportDataPoints)).append("\n");
    sb.append("    maxREExecutions: ").append(toIndentedString(maxREExecutions)).append("\n");
    sb.append("    maxJSExecutions: ").append(toIndentedString(maxJSExecutions)).append("\n");
    sb.append("    maxTbelExecutions: ").append(toIndentedString(maxTbelExecutions)).append("\n");
    sb.append("    maxDPStorageDays: ").append(toIndentedString(maxDPStorageDays)).append("\n");
    sb.append("    maxRuleNodeExecutionsPerMessage: ").append(toIndentedString(maxRuleNodeExecutionsPerMessage)).append("\n");
    sb.append("    maxDebugModeDurationMinutes: ").append(toIndentedString(maxDebugModeDurationMinutes)).append("\n");
    sb.append("    maxEmails: ").append(toIndentedString(maxEmails)).append("\n");
    sb.append("    smsEnabled: ").append(toIndentedString(smsEnabled)).append("\n");
    sb.append("    maxSms: ").append(toIndentedString(maxSms)).append("\n");
    sb.append("    maxCreatedAlarms: ").append(toIndentedString(maxCreatedAlarms)).append("\n");
    sb.append("    maxGeneratedReports: ").append(toIndentedString(maxGeneratedReports)).append("\n");
    sb.append("    tenantServerRestLimitsConfiguration: ").append(toIndentedString(tenantServerRestLimitsConfiguration)).append("\n");
    sb.append("    customerServerRestLimitsConfiguration: ").append(toIndentedString(customerServerRestLimitsConfiguration)).append("\n");
    sb.append("    maxWsSessionsPerTenant: ").append(toIndentedString(maxWsSessionsPerTenant)).append("\n");
    sb.append("    maxWsSessionsPerCustomer: ").append(toIndentedString(maxWsSessionsPerCustomer)).append("\n");
    sb.append("    maxWsSessionsPerRegularUser: ").append(toIndentedString(maxWsSessionsPerRegularUser)).append("\n");
    sb.append("    maxWsSessionsPerPublicUser: ").append(toIndentedString(maxWsSessionsPerPublicUser)).append("\n");
    sb.append("    wsMsgQueueLimitPerSession: ").append(toIndentedString(wsMsgQueueLimitPerSession)).append("\n");
    sb.append("    maxWsSubscriptionsPerTenant: ").append(toIndentedString(maxWsSubscriptionsPerTenant)).append("\n");
    sb.append("    maxWsSubscriptionsPerCustomer: ").append(toIndentedString(maxWsSubscriptionsPerCustomer)).append("\n");
    sb.append("    maxWsSubscriptionsPerRegularUser: ").append(toIndentedString(maxWsSubscriptionsPerRegularUser)).append("\n");
    sb.append("    maxWsSubscriptionsPerPublicUser: ").append(toIndentedString(maxWsSubscriptionsPerPublicUser)).append("\n");
    sb.append("    wsUpdatesPerSessionRateLimit: ").append(toIndentedString(wsUpdatesPerSessionRateLimit)).append("\n");
    sb.append("    cassandraReadQueryTenantCoreRateLimits: ").append(toIndentedString(cassandraReadQueryTenantCoreRateLimits)).append("\n");
    sb.append("    cassandraWriteQueryTenantCoreRateLimits: ").append(toIndentedString(cassandraWriteQueryTenantCoreRateLimits)).append("\n");
    sb.append("    cassandraReadQueryTenantRuleEngineRateLimits: ").append(toIndentedString(cassandraReadQueryTenantRuleEngineRateLimits)).append("\n");
    sb.append("    cassandraWriteQueryTenantRuleEngineRateLimits: ").append(toIndentedString(cassandraWriteQueryTenantRuleEngineRateLimits)).append("\n");
    sb.append("    edgeEventRateLimits: ").append(toIndentedString(edgeEventRateLimits)).append("\n");
    sb.append("    edgeEventRateLimitsPerEdge: ").append(toIndentedString(edgeEventRateLimitsPerEdge)).append("\n");
    sb.append("    edgeUplinkMessagesRateLimits: ").append(toIndentedString(edgeUplinkMessagesRateLimits)).append("\n");
    sb.append("    edgeUplinkMessagesRateLimitsPerEdge: ").append(toIndentedString(edgeUplinkMessagesRateLimitsPerEdge)).append("\n");
    sb.append("    defaultStorageTtlDays: ").append(toIndentedString(defaultStorageTtlDays)).append("\n");
    sb.append("    alarmsTtlDays: ").append(toIndentedString(alarmsTtlDays)).append("\n");
    sb.append("    rpcTtlDays: ").append(toIndentedString(rpcTtlDays)).append("\n");
    sb.append("    queueStatsTtlDays: ").append(toIndentedString(queueStatsTtlDays)).append("\n");
    sb.append("    ruleEngineExceptionsTtlDays: ").append(toIndentedString(ruleEngineExceptionsTtlDays)).append("\n");
    sb.append("    blobEntityTtlDays: ").append(toIndentedString(blobEntityTtlDays)).append("\n");
    sb.append("    reportTtlDays: ").append(toIndentedString(reportTtlDays)).append("\n");
    sb.append("    warnThreshold: ").append(toIndentedString(warnThreshold)).append("\n");
    sb.append("    maxCalculatedFieldsPerEntity: ").append(toIndentedString(maxCalculatedFieldsPerEntity)).append("\n");
    sb.append("    maxArgumentsPerCF: ").append(toIndentedString(maxArgumentsPerCF)).append("\n");
    sb.append("    minAllowedScheduledUpdateIntervalInSecForCF: ").append(toIndentedString(minAllowedScheduledUpdateIntervalInSecForCF)).append("\n");
    sb.append("    maxRelationLevelPerCfArgument: ").append(toIndentedString(maxRelationLevelPerCfArgument)).append("\n");
    sb.append("    maxRelatedEntitiesToReturnPerCfArgument: ").append(toIndentedString(maxRelatedEntitiesToReturnPerCfArgument)).append("\n");
    sb.append("    maxDataPointsPerRollingArg: ").append(toIndentedString(maxDataPointsPerRollingArg)).append("\n");
    sb.append("    maxStateSizeInKBytes: ").append(toIndentedString(maxStateSizeInKBytes)).append("\n");
    sb.append("    maxSingleValueArgumentSizeInKBytes: ").append(toIndentedString(maxSingleValueArgumentSizeInKBytes)).append("\n");
    sb.append("    minAllowedDeduplicationIntervalInSecForCF: ").append(toIndentedString(minAllowedDeduplicationIntervalInSecForCF)).append("\n");
    sb.append("    minAllowedAggregationIntervalInSecForCF: ").append(toIndentedString(minAllowedAggregationIntervalInSecForCF)).append("\n");
    sb.append("    intermediateAggregationIntervalInSecForCF: ").append(toIndentedString(intermediateAggregationIntervalInSecForCF)).append("\n");
    sb.append("    cfReevaluationCheckInterval: ").append(toIndentedString(cfReevaluationCheckInterval)).append("\n");
    sb.append("    alarmsReevaluationInterval: ").append(toIndentedString(alarmsReevaluationInterval)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stype%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getType()))));
    }

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

    // add `maxDashboards` to the URL query string
    if (getMaxDashboards() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxDashboards%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxDashboards()))));
    }

    // add `maxRuleChains` to the URL query string
    if (getMaxRuleChains() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxRuleChains%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxRuleChains()))));
    }

    // add `maxEdges` to the URL query string
    if (getMaxEdges() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxEdges%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxEdges()))));
    }

    // add `maxResourcesInBytes` to the URL query string
    if (getMaxResourcesInBytes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxResourcesInBytes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxResourcesInBytes()))));
    }

    // add `maxOtaPackagesInBytes` to the URL query string
    if (getMaxOtaPackagesInBytes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxOtaPackagesInBytes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxOtaPackagesInBytes()))));
    }

    // add `maxResourceSize` to the URL query string
    if (getMaxResourceSize() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxResourceSize%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxResourceSize()))));
    }

    // add `maxReportSizeInBytes` to the URL query string
    if (getMaxReportSizeInBytes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxReportSizeInBytes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxReportSizeInBytes()))));
    }

    // add `maxIntegrations` to the URL query string
    if (getMaxIntegrations() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxIntegrations%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxIntegrations()))));
    }

    // add `maxConverters` to the URL query string
    if (getMaxConverters() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxConverters%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxConverters()))));
    }

    // add `maxSchedulerEvents` to the URL query string
    if (getMaxSchedulerEvents() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxSchedulerEvents%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxSchedulerEvents()))));
    }

    // add `transportTenantMsgRateLimit` to the URL query string
    if (getTransportTenantMsgRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stransportTenantMsgRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransportTenantMsgRateLimit()))));
    }

    // add `transportTenantTelemetryMsgRateLimit` to the URL query string
    if (getTransportTenantTelemetryMsgRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stransportTenantTelemetryMsgRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransportTenantTelemetryMsgRateLimit()))));
    }

    // add `transportTenantTelemetryDataPointsRateLimit` to the URL query string
    if (getTransportTenantTelemetryDataPointsRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stransportTenantTelemetryDataPointsRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransportTenantTelemetryDataPointsRateLimit()))));
    }

    // add `transportDeviceMsgRateLimit` to the URL query string
    if (getTransportDeviceMsgRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stransportDeviceMsgRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransportDeviceMsgRateLimit()))));
    }

    // add `transportDeviceTelemetryMsgRateLimit` to the URL query string
    if (getTransportDeviceTelemetryMsgRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stransportDeviceTelemetryMsgRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransportDeviceTelemetryMsgRateLimit()))));
    }

    // add `transportDeviceTelemetryDataPointsRateLimit` to the URL query string
    if (getTransportDeviceTelemetryDataPointsRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stransportDeviceTelemetryDataPointsRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransportDeviceTelemetryDataPointsRateLimit()))));
    }

    // add `transportGatewayMsgRateLimit` to the URL query string
    if (getTransportGatewayMsgRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stransportGatewayMsgRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransportGatewayMsgRateLimit()))));
    }

    // add `transportGatewayTelemetryMsgRateLimit` to the URL query string
    if (getTransportGatewayTelemetryMsgRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stransportGatewayTelemetryMsgRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransportGatewayTelemetryMsgRateLimit()))));
    }

    // add `transportGatewayTelemetryDataPointsRateLimit` to the URL query string
    if (getTransportGatewayTelemetryDataPointsRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stransportGatewayTelemetryDataPointsRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransportGatewayTelemetryDataPointsRateLimit()))));
    }

    // add `transportGatewayDeviceMsgRateLimit` to the URL query string
    if (getTransportGatewayDeviceMsgRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stransportGatewayDeviceMsgRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransportGatewayDeviceMsgRateLimit()))));
    }

    // add `transportGatewayDeviceTelemetryMsgRateLimit` to the URL query string
    if (getTransportGatewayDeviceTelemetryMsgRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stransportGatewayDeviceTelemetryMsgRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransportGatewayDeviceTelemetryMsgRateLimit()))));
    }

    // add `transportGatewayDeviceTelemetryDataPointsRateLimit` to the URL query string
    if (getTransportGatewayDeviceTelemetryDataPointsRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stransportGatewayDeviceTelemetryDataPointsRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTransportGatewayDeviceTelemetryDataPointsRateLimit()))));
    }

    // add `integrationMsgsPerTenantRateLimit` to the URL query string
    if (getIntegrationMsgsPerTenantRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sintegrationMsgsPerTenantRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIntegrationMsgsPerTenantRateLimit()))));
    }

    // add `integrationMsgsPerDeviceRateLimit` to the URL query string
    if (getIntegrationMsgsPerDeviceRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sintegrationMsgsPerDeviceRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIntegrationMsgsPerDeviceRateLimit()))));
    }

    // add `integrationMsgsPerAssetRateLimit` to the URL query string
    if (getIntegrationMsgsPerAssetRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sintegrationMsgsPerAssetRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIntegrationMsgsPerAssetRateLimit()))));
    }

    // add `tenantEntityExportRateLimit` to the URL query string
    if (getTenantEntityExportRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stenantEntityExportRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTenantEntityExportRateLimit()))));
    }

    // add `tenantEntityImportRateLimit` to the URL query string
    if (getTenantEntityImportRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stenantEntityImportRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTenantEntityImportRateLimit()))));
    }

    // add `tenantNotificationRequestsRateLimit` to the URL query string
    if (getTenantNotificationRequestsRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stenantNotificationRequestsRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTenantNotificationRequestsRateLimit()))));
    }

    // add `tenantNotificationRequestsPerRuleRateLimit` to the URL query string
    if (getTenantNotificationRequestsPerRuleRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stenantNotificationRequestsPerRuleRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTenantNotificationRequestsPerRuleRateLimit()))));
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

    // add `maxTbelExecutions` to the URL query string
    if (getMaxTbelExecutions() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxTbelExecutions%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxTbelExecutions()))));
    }

    // add `maxDPStorageDays` to the URL query string
    if (getMaxDPStorageDays() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxDPStorageDays%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxDPStorageDays()))));
    }

    // add `maxRuleNodeExecutionsPerMessage` to the URL query string
    if (getMaxRuleNodeExecutionsPerMessage() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxRuleNodeExecutionsPerMessage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxRuleNodeExecutionsPerMessage()))));
    }

    // add `maxDebugModeDurationMinutes` to the URL query string
    if (getMaxDebugModeDurationMinutes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxDebugModeDurationMinutes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxDebugModeDurationMinutes()))));
    }

    // add `maxEmails` to the URL query string
    if (getMaxEmails() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxEmails%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxEmails()))));
    }

    // add `smsEnabled` to the URL query string
    if (getSmsEnabled() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%ssmsEnabled%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getSmsEnabled()))));
    }

    // add `maxSms` to the URL query string
    if (getMaxSms() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxSms%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxSms()))));
    }

    // add `maxCreatedAlarms` to the URL query string
    if (getMaxCreatedAlarms() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxCreatedAlarms%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxCreatedAlarms()))));
    }

    // add `maxGeneratedReports` to the URL query string
    if (getMaxGeneratedReports() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxGeneratedReports%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxGeneratedReports()))));
    }

    // add `tenantServerRestLimitsConfiguration` to the URL query string
    if (getTenantServerRestLimitsConfiguration() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%stenantServerRestLimitsConfiguration%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTenantServerRestLimitsConfiguration()))));
    }

    // add `customerServerRestLimitsConfiguration` to the URL query string
    if (getCustomerServerRestLimitsConfiguration() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scustomerServerRestLimitsConfiguration%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCustomerServerRestLimitsConfiguration()))));
    }

    // add `maxWsSessionsPerTenant` to the URL query string
    if (getMaxWsSessionsPerTenant() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxWsSessionsPerTenant%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxWsSessionsPerTenant()))));
    }

    // add `maxWsSessionsPerCustomer` to the URL query string
    if (getMaxWsSessionsPerCustomer() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxWsSessionsPerCustomer%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxWsSessionsPerCustomer()))));
    }

    // add `maxWsSessionsPerRegularUser` to the URL query string
    if (getMaxWsSessionsPerRegularUser() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxWsSessionsPerRegularUser%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxWsSessionsPerRegularUser()))));
    }

    // add `maxWsSessionsPerPublicUser` to the URL query string
    if (getMaxWsSessionsPerPublicUser() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxWsSessionsPerPublicUser%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxWsSessionsPerPublicUser()))));
    }

    // add `wsMsgQueueLimitPerSession` to the URL query string
    if (getWsMsgQueueLimitPerSession() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%swsMsgQueueLimitPerSession%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWsMsgQueueLimitPerSession()))));
    }

    // add `maxWsSubscriptionsPerTenant` to the URL query string
    if (getMaxWsSubscriptionsPerTenant() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxWsSubscriptionsPerTenant%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxWsSubscriptionsPerTenant()))));
    }

    // add `maxWsSubscriptionsPerCustomer` to the URL query string
    if (getMaxWsSubscriptionsPerCustomer() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxWsSubscriptionsPerCustomer%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxWsSubscriptionsPerCustomer()))));
    }

    // add `maxWsSubscriptionsPerRegularUser` to the URL query string
    if (getMaxWsSubscriptionsPerRegularUser() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxWsSubscriptionsPerRegularUser%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxWsSubscriptionsPerRegularUser()))));
    }

    // add `maxWsSubscriptionsPerPublicUser` to the URL query string
    if (getMaxWsSubscriptionsPerPublicUser() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxWsSubscriptionsPerPublicUser%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxWsSubscriptionsPerPublicUser()))));
    }

    // add `wsUpdatesPerSessionRateLimit` to the URL query string
    if (getWsUpdatesPerSessionRateLimit() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%swsUpdatesPerSessionRateLimit%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWsUpdatesPerSessionRateLimit()))));
    }

    // add `cassandraReadQueryTenantCoreRateLimits` to the URL query string
    if (getCassandraReadQueryTenantCoreRateLimits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scassandraReadQueryTenantCoreRateLimits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCassandraReadQueryTenantCoreRateLimits()))));
    }

    // add `cassandraWriteQueryTenantCoreRateLimits` to the URL query string
    if (getCassandraWriteQueryTenantCoreRateLimits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scassandraWriteQueryTenantCoreRateLimits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCassandraWriteQueryTenantCoreRateLimits()))));
    }

    // add `cassandraReadQueryTenantRuleEngineRateLimits` to the URL query string
    if (getCassandraReadQueryTenantRuleEngineRateLimits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scassandraReadQueryTenantRuleEngineRateLimits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCassandraReadQueryTenantRuleEngineRateLimits()))));
    }

    // add `cassandraWriteQueryTenantRuleEngineRateLimits` to the URL query string
    if (getCassandraWriteQueryTenantRuleEngineRateLimits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scassandraWriteQueryTenantRuleEngineRateLimits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCassandraWriteQueryTenantRuleEngineRateLimits()))));
    }

    // add `edgeEventRateLimits` to the URL query string
    if (getEdgeEventRateLimits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sedgeEventRateLimits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEdgeEventRateLimits()))));
    }

    // add `edgeEventRateLimitsPerEdge` to the URL query string
    if (getEdgeEventRateLimitsPerEdge() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sedgeEventRateLimitsPerEdge%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEdgeEventRateLimitsPerEdge()))));
    }

    // add `edgeUplinkMessagesRateLimits` to the URL query string
    if (getEdgeUplinkMessagesRateLimits() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sedgeUplinkMessagesRateLimits%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEdgeUplinkMessagesRateLimits()))));
    }

    // add `edgeUplinkMessagesRateLimitsPerEdge` to the URL query string
    if (getEdgeUplinkMessagesRateLimitsPerEdge() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sedgeUplinkMessagesRateLimitsPerEdge%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getEdgeUplinkMessagesRateLimitsPerEdge()))));
    }

    // add `defaultStorageTtlDays` to the URL query string
    if (getDefaultStorageTtlDays() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sdefaultStorageTtlDays%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDefaultStorageTtlDays()))));
    }

    // add `alarmsTtlDays` to the URL query string
    if (getAlarmsTtlDays() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%salarmsTtlDays%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAlarmsTtlDays()))));
    }

    // add `rpcTtlDays` to the URL query string
    if (getRpcTtlDays() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%srpcTtlDays%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRpcTtlDays()))));
    }

    // add `queueStatsTtlDays` to the URL query string
    if (getQueueStatsTtlDays() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%squeueStatsTtlDays%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQueueStatsTtlDays()))));
    }

    // add `ruleEngineExceptionsTtlDays` to the URL query string
    if (getRuleEngineExceptionsTtlDays() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sruleEngineExceptionsTtlDays%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRuleEngineExceptionsTtlDays()))));
    }

    // add `blobEntityTtlDays` to the URL query string
    if (getBlobEntityTtlDays() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sblobEntityTtlDays%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getBlobEntityTtlDays()))));
    }

    // add `reportTtlDays` to the URL query string
    if (getReportTtlDays() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sreportTtlDays%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReportTtlDays()))));
    }

    // add `warnThreshold` to the URL query string
    if (getWarnThreshold() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%swarnThreshold%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getWarnThreshold()))));
    }

    // add `maxCalculatedFieldsPerEntity` to the URL query string
    if (getMaxCalculatedFieldsPerEntity() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxCalculatedFieldsPerEntity%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxCalculatedFieldsPerEntity()))));
    }

    // add `maxArgumentsPerCF` to the URL query string
    if (getMaxArgumentsPerCF() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxArgumentsPerCF%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxArgumentsPerCF()))));
    }

    // add `minAllowedScheduledUpdateIntervalInSecForCF` to the URL query string
    if (getMinAllowedScheduledUpdateIntervalInSecForCF() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sminAllowedScheduledUpdateIntervalInSecForCF%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinAllowedScheduledUpdateIntervalInSecForCF()))));
    }

    // add `maxRelationLevelPerCfArgument` to the URL query string
    if (getMaxRelationLevelPerCfArgument() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxRelationLevelPerCfArgument%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxRelationLevelPerCfArgument()))));
    }

    // add `maxRelatedEntitiesToReturnPerCfArgument` to the URL query string
    if (getMaxRelatedEntitiesToReturnPerCfArgument() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxRelatedEntitiesToReturnPerCfArgument%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxRelatedEntitiesToReturnPerCfArgument()))));
    }

    // add `maxDataPointsPerRollingArg` to the URL query string
    if (getMaxDataPointsPerRollingArg() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxDataPointsPerRollingArg%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxDataPointsPerRollingArg()))));
    }

    // add `maxStateSizeInKBytes` to the URL query string
    if (getMaxStateSizeInKBytes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxStateSizeInKBytes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxStateSizeInKBytes()))));
    }

    // add `maxSingleValueArgumentSizeInKBytes` to the URL query string
    if (getMaxSingleValueArgumentSizeInKBytes() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%smaxSingleValueArgumentSizeInKBytes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMaxSingleValueArgumentSizeInKBytes()))));
    }

    // add `minAllowedDeduplicationIntervalInSecForCF` to the URL query string
    if (getMinAllowedDeduplicationIntervalInSecForCF() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sminAllowedDeduplicationIntervalInSecForCF%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinAllowedDeduplicationIntervalInSecForCF()))));
    }

    // add `minAllowedAggregationIntervalInSecForCF` to the URL query string
    if (getMinAllowedAggregationIntervalInSecForCF() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sminAllowedAggregationIntervalInSecForCF%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMinAllowedAggregationIntervalInSecForCF()))));
    }

    // add `intermediateAggregationIntervalInSecForCF` to the URL query string
    if (getIntermediateAggregationIntervalInSecForCF() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%sintermediateAggregationIntervalInSecForCF%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getIntermediateAggregationIntervalInSecForCF()))));
    }

    // add `cfReevaluationCheckInterval` to the URL query string
    if (getCfReevaluationCheckInterval() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%scfReevaluationCheckInterval%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getCfReevaluationCheckInterval()))));
    }

    // add `alarmsReevaluationInterval` to the URL query string
    if (getAlarmsReevaluationInterval() != null) {
      joiner.add(String.format(java.util.Locale.ROOT, "%salarmsReevaluationInterval%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getAlarmsReevaluationInterval()))));
    }

    return joiner.toString();
  }
static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("DefaultTenantProfileConfiguration", DefaultTenantProfileConfiguration.class);
  JSON.registerDiscriminator(DefaultTenantProfileConfiguration.class, "type", mappings);
}
}

