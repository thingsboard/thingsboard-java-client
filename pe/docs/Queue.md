
# Queue

`org.thingsboard.client.model.Queue`

A JSON value representing the queue.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **QueueId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** |  | [optional] |
| **tenantId** | **TenantId** |  | [optional] |
| **name** | **String** |  | [optional] |
| **topic** | **String** |  | [optional] |
| **pollInterval** | **Integer** |  | [optional] |
| **partitions** | **Integer** |  | [optional] |
| **consumerPerPartition** | **Boolean** |  | [optional] |
| **packProcessingTimeout** | **Long** |  | [optional] |
| **submitStrategy** | **SubmitStrategy** |  | [optional] |
| **processingStrategy** | **ProcessingStrategy** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

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

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

