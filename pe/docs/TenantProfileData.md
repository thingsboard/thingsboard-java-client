
# TenantProfileData

`org.thingsboard.client.model.TenantProfileData`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **_configuration** | **TenantProfileConfiguration** | Complex JSON object that contains profile settings: max devices, max assets, rate limits, etc. | [optional] |
| **queueConfiguration** | **List\<TenantProfileQueueConfiguration\>** | JSON array of queue configuration per tenant profile | [optional] |



## Referenced Types

#### TenantProfileConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### DefaultTenantProfileConfiguration  *(extends TenantProfileConfiguration, type=`DEFAULT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| maxDevices | Long |  | [optional] |
| maxAssets | Long |  | [optional] |
| maxCustomers | Long |  | [optional] |
| maxUsers | Long |  | [optional] |
| maxDashboards | Long |  | [optional] |
| maxRuleChains | Long |  | [optional] |
| maxEdges | Long |  | [optional] |
| maxResourcesInBytes | Long |  | [optional] |
| maxOtaPackagesInBytes | Long |  | [optional] |
| maxResourceSize | Long |  | [optional] |
| maxReportSizeInBytes | Long |  | [optional] |
| maxIntegrations | Long |  | [optional] |
| maxConverters | Long |  | [optional] |
| maxSchedulerEvents | Long |  | [optional] |
| transportTenantMsgRateLimit | String |  | [optional] |
| transportTenantTelemetryMsgRateLimit | String |  | [optional] |
| transportTenantTelemetryDataPointsRateLimit | String |  | [optional] |
| transportDeviceMsgRateLimit | String |  | [optional] |
| transportDeviceTelemetryMsgRateLimit | String |  | [optional] |
| transportDeviceTelemetryDataPointsRateLimit | String |  | [optional] |
| transportGatewayMsgRateLimit | String |  | [optional] |
| transportGatewayTelemetryMsgRateLimit | String |  | [optional] |
| transportGatewayTelemetryDataPointsRateLimit | String |  | [optional] |
| transportGatewayDeviceMsgRateLimit | String |  | [optional] |
| transportGatewayDeviceTelemetryMsgRateLimit | String |  | [optional] |
| transportGatewayDeviceTelemetryDataPointsRateLimit | String |  | [optional] |
| integrationMsgsPerTenantRateLimit | String |  | [optional] |
| integrationMsgsPerDeviceRateLimit | String |  | [optional] |
| integrationMsgsPerAssetRateLimit | String |  | [optional] |
| tenantEntityExportRateLimit | String |  | [optional] |
| tenantEntityImportRateLimit | String |  | [optional] |
| tenantNotificationRequestsRateLimit | String |  | [optional] |
| tenantNotificationRequestsPerRuleRateLimit | String |  | [optional] |
| maxTransportMessages | Long |  | [optional] |
| maxTransportDataPoints | Long |  | [optional] |
| maxREExecutions | Long |  | [optional] |
| maxJSExecutions | Long |  | [optional] |
| maxTbelExecutions | Long |  | [optional] |
| maxDPStorageDays | Long |  | [optional] |
| maxRuleNodeExecutionsPerMessage | Integer |  | [optional] |
| maxDebugModeDurationMinutes | Integer |  | [optional] |
| maxEmails | Long |  | [optional] |
| smsEnabled | Boolean |  | [optional] |
| maxSms | Long |  | [optional] |
| maxCreatedAlarms | Long |  | [optional] |
| maxGeneratedReports | Long |  | [optional] |
| maxAiCredits | Long |  | [optional] |
| tenantServerRestLimitsConfiguration | String |  | [optional] |
| customerServerRestLimitsConfiguration | String |  | [optional] |
| maxWsSessionsPerTenant | Integer |  | [optional] |
| maxWsSessionsPerCustomer | Integer |  | [optional] |
| maxWsSessionsPerRegularUser | Integer |  | [optional] |
| maxWsSessionsPerPublicUser | Integer |  | [optional] |
| wsMsgQueueLimitPerSession | Integer |  | [optional] |
| maxWsSubscriptionsPerTenant | Long |  | [optional] |
| maxWsSubscriptionsPerCustomer | Long |  | [optional] |
| maxWsSubscriptionsPerRegularUser | Long |  | [optional] |
| maxWsSubscriptionsPerPublicUser | Long |  | [optional] |
| wsUpdatesPerSessionRateLimit | String |  | [optional] |
| cassandraReadQueryTenantCoreRateLimits | String |  | [optional] |
| cassandraWriteQueryTenantCoreRateLimits | String |  | [optional] |
| cassandraReadQueryTenantRuleEngineRateLimits | String |  | [optional] |
| cassandraWriteQueryTenantRuleEngineRateLimits | String |  | [optional] |
| edgeEventRateLimits | String |  | [optional] |
| edgeEventRateLimitsPerEdge | String |  | [optional] |
| edgeUplinkMessagesRateLimits | String |  | [optional] |
| edgeUplinkMessagesRateLimitsPerEdge | String |  | [optional] |
| defaultStorageTtlDays | Integer |  | [optional] |
| alarmsTtlDays | Integer |  | [optional] |
| rpcTtlDays | Integer |  | [optional] |
| queueStatsTtlDays | Integer |  | [optional] |
| ruleEngineExceptionsTtlDays | Integer |  | [optional] |
| blobEntityTtlDays | Integer |  | [optional] |
| reportTtlDays | Integer |  | [optional] |
| warnThreshold | Double |  | [optional] |
| maxCalculatedFieldsPerEntity | Long |  | [optional] |
| maxArgumentsPerCF | Long |  | [optional] |
| minAllowedScheduledUpdateIntervalInSecForCF | Integer |  | [optional] |
| maxRelationLevelPerCfArgument | Integer |  | [optional] |
| maxRelatedEntitiesToReturnPerCfArgument | Integer |  | [optional] |
| maxDataPointsPerRollingArg | Long |  | [optional] |
| maxStateSizeInKBytes | Long |  | [optional] |
| maxSingleValueArgumentSizeInKBytes | Long |  | [optional] |
| minAllowedDeduplicationIntervalInSecForCF | Long |  | [optional] |
| minAllowedAggregationIntervalInSecForCF | Long |  | [optional] |
| intermediateAggregationIntervalInSecForCF | Long |  | [optional] |
| cfReevaluationCheckInterval | Long |  | [optional] |
| alarmsReevaluationInterval | Long |  | [optional] |
| aiChatRequestsPerTenantRateLimit | String |  | [optional] |

#### TenantProfileQueueConfiguration
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| name | String |  | [optional] |
| topic | String |  | [optional] |
| pollInterval | Integer |  | [optional] |
| partitions | Integer |  | [optional] |
| consumerPerPartition | Boolean |  | [optional] |
| packProcessingTimeout | Long |  | [optional] |
| submitStrategy | SubmitStrategy |  | [optional] |
| processingStrategy | ProcessingStrategy |  | [optional] |
| additionalInfo | com.fasterxml.jackson.databind.JsonNode |  | [optional] |

#### SubmitStrategy
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | SubmitStrategyType |  | [optional] |
| batchSize | Integer |  | [optional] |

#### ProcessingStrategy
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | ProcessingStrategyType |  | [optional] |
| retries | Integer |  | [optional] |
| failurePercentage | Double |  | [optional] |
| pauseBetweenRetries | Long |  | [optional] |
| maxPauseBetweenRetries | Long |  | [optional] |

#### SubmitStrategyType (enum)
`BURST` | `BATCH` | `SEQUENTIAL_BY_ORIGINATOR` | `SEQUENTIAL_BY_TENANT` | `SEQUENTIAL`

#### ProcessingStrategyType (enum)
`SKIP_ALL_FAILURES` | `SKIP_ALL_FAILURES_AND_TIMED_OUT` | `RETRY_ALL` | `RETRY_FAILED` | `RETRY_TIMED_OUT` | `RETRY_FAILED_AND_TIMED_OUT`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

