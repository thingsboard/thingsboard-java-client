
# NotificationRequest

`org.thingsboard.client.model.NotificationRequest`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **NotificationRequestId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **tenantId** | **TenantId** |  | [optional] |
| **targets** | **List\<UUID\>** |  | |
| **templateId** | **NotificationTemplateId** |  | [optional] |
| **template** | **NotificationTemplate** |  | [optional] |
| **info** | **NotificationInfo** |  | [optional] |
| **additionalConfig** | **NotificationRequestConfig** |  | [optional] |
| **originatorEntityId** | **EntityId** |  | [optional] |
| **ruleId** | **NotificationRuleId** |  | [optional] |
| **status** | **NotificationRequestStatus** |  | [optional] |
| **stats** | **NotificationRequestStats** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AgentAppEventId`, `AgentAppProfileId`, `AgentAppUnitId`, `AgentApplicationId`, `AgentBulkActionId`, `AgentId`, `AgentProfileId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### NotificationTemplate
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | NotificationTemplateId |  | [optional] |
| createdTime | Long | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| tenantId | TenantId |  | [optional] |
| name | String |  |  |
| notificationType | NotificationType |  |  |
| _configuration | NotificationTemplateConfig |  |  |

#### NotificationInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| dashboardId | DashboardId |  | [optional] |
| stateEntityId | EntityId |  | [optional] |
| type | String |  |  |

#### AddonAccessErrorNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.AddonAccessErrorNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| addonType | AddonType |  | [optional] |
| addonNameOverride | String |  | [optional] |
| userEmail | String |  | [optional] |
| checkConfigurationActionLabel | String |  | [optional] |
| checkConfigurationLink | String |  | [optional] |
| baseUrl | String |  | [optional] |

#### AddonAccessRequestNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.AddonAccessRequestNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| addonType | AddonType |  | [optional] |
| addonNameOverride | String |  | [optional] |
| userEmail | String |  | [optional] |
| enableAddonActionLabel | String |  | [optional] |
| enableAddonLink | String |  | [optional] |
| baseUrl | String |  | [optional] |

#### AlarmAssignmentNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.AlarmAssignmentNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| action | String |  | [optional] |
| assigneeEmail | String |  | [optional] |
| assigneeFirstName | String |  | [optional] |
| assigneeLastName | String |  | [optional] |
| assigneeId | UserId |  | [optional] |
| userEmail | String |  | [optional] |
| userFirstName | String |  | [optional] |
| userLastName | String |  | [optional] |
| alarmType | String |  | [optional] |
| alarmId | UUID |  | [optional] |
| alarmOriginator | EntityId |  | [optional] |
| alarmOriginatorName | String |  | [optional] |
| alarmOriginatorLabel | String |  | [optional] |
| alarmSeverity | AlarmSeverity |  | [optional] |
| alarmStatus | AlarmStatus |  | [optional] |
| alarmCustomerId | CustomerId |  | [optional] |
| affectedCustomerId | CustomerId |  | [optional] |
| affectedTenantId | TenantId |  | [optional] |
| affectedUserId | UserId |  | [optional] |

#### AlarmCommentNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.AlarmCommentNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| comment | String |  | [optional] |
| action | String |  | [optional] |
| userEmail | String |  | [optional] |
| userFirstName | String |  | [optional] |
| userLastName | String |  | [optional] |
| alarmType | String |  | [optional] |
| alarmId | UUID |  | [optional] |
| alarmOriginator | EntityId |  | [optional] |
| alarmOriginatorName | String |  | [optional] |
| alarmOriginatorLabel | String |  | [optional] |
| alarmSeverity | AlarmSeverity |  | [optional] |
| alarmStatus | AlarmStatus |  | [optional] |
| alarmCustomerId | CustomerId |  | [optional] |
| affectedCustomerId | CustomerId |  | [optional] |
| affectedTenantId | TenantId |  | [optional] |
| affectedUserId | UserId |  | [optional] |

#### AlarmNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.AlarmNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| alarmType | String |  | [optional] |
| action | String |  | [optional] |
| alarmId | UUID |  | [optional] |
| alarmOriginator | EntityId |  | [optional] |
| alarmOriginatorName | String |  | [optional] |
| alarmOriginatorLabel | String |  | [optional] |
| alarmSeverity | AlarmSeverity |  | [optional] |
| alarmStatus | AlarmStatus |  | [optional] |
| acknowledged | Boolean |  | [optional] |
| cleared | Boolean |  | [optional] |
| alarmCustomerId | CustomerId |  | [optional] |
| details | Map<String, String> |  | [optional] |
| affectedCustomerId | CustomerId |  | [optional] |
| affectedTenantId | TenantId |  | [optional] |
| affectedUserId | UserId |  | [optional] |

#### ApiUsageLimitNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.ApiUsageLimitNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| feature | ApiFeature |  | [optional] |
| recordKey | ApiUsageRecordKey |  | [optional] |
| status | ApiUsageStateValue |  | [optional] |
| limit | String |  | [optional] |
| currentValue | String |  | [optional] |
| tenantId | TenantId |  | [optional] |
| tenantName | String |  | [optional] |
| affectedCustomerId | CustomerId |  | [optional] |
| affectedTenantId | TenantId |  | [optional] |
| affectedUserId | UserId |  | [optional] |

#### DeviceActivityNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.DeviceActivityNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| eventType | String |  | [optional] |
| deviceId | UUID |  | [optional] |
| deviceName | String |  | [optional] |
| deviceLabel | String |  | [optional] |
| deviceType | String |  | [optional] |
| deviceCustomerId | CustomerId |  | [optional] |
| affectedCustomerId | CustomerId |  | [optional] |
| affectedTenantId | TenantId |  | [optional] |
| affectedUserId | UserId |  | [optional] |

#### EdgeCommunicationFailureNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.EdgeCommunicationFailureNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tenantId | TenantId |  | [optional] |
| customerId | CustomerId |  | [optional] |
| edgeId | EdgeId |  | [optional] |
| edgeName | String |  | [optional] |
| failureMsg | String |  | [optional] |
| affectedCustomerId | CustomerId |  | [optional] |
| affectedTenantId | TenantId |  | [optional] |
| affectedUserId | UserId |  | [optional] |

#### EdgeConnectionNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.EdgeConnectionNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| eventType | String |  | [optional] |
| tenantId | TenantId |  | [optional] |
| customerId | CustomerId |  | [optional] |
| edgeId | EdgeId |  | [optional] |
| edgeName | String |  | [optional] |
| affectedCustomerId | CustomerId |  | [optional] |
| affectedTenantId | TenantId |  | [optional] |
| affectedUserId | UserId |  | [optional] |

#### EntitiesLimitIncreaseRequestNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.EntitiesLimitIncreaseRequestNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityType | EntityType |  | [optional] |
| userEmail | String |  | [optional] |
| increaseLimitActionLabel | String |  | [optional] |
| increaseLimitLink | String |  | [optional] |
| baseUrl | String |  | [optional] |

#### EntitiesLimitNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.EntitiesLimitNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityType | EntityType |  | [optional] |
| currentCount | Long |  | [optional] |
| limit | Long |  | [optional] |
| percents | Integer |  | [optional] |
| tenantId | TenantId |  | [optional] |
| tenantName | String |  | [optional] |
| affectedCustomerId | CustomerId |  | [optional] |
| affectedTenantId | TenantId |  | [optional] |
| affectedUserId | UserId |  | [optional] |

#### EntityActionNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.EntityActionNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityId | EntityId |  | [optional] |
| entityName | String |  | [optional] |
| actionType | ActionType |  | [optional] |
| customerId | CustomerId |  | [optional] |
| userId | UUID |  | [optional] |
| userTitle | String |  | [optional] |
| userEmail | String |  | [optional] |
| userFirstName | String |  | [optional] |
| userLastName | String |  | [optional] |
| affectedCustomerId | CustomerId |  | [optional] |
| affectedTenantId | TenantId |  | [optional] |
| affectedUserId | UserId |  | [optional] |

#### GeneralNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.GeneralNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| data | Map<String, String> |  | [optional] |
| affectedCustomerId | CustomerId |  | [optional] |
| affectedTenantId | TenantId |  | [optional] |
| affectedUserId | UserId |  | [optional] |

#### IntegrationLifecycleEventNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.IntegrationLifecycleEventNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| integrationId | IntegrationId |  | [optional] |
| integrationType | String |  | [optional] |
| integrationName | String |  | [optional] |
| action | String |  | [optional] |
| eventType | ComponentLifecycleEvent |  | [optional] |
| error | String |  | [optional] |
| affectedCustomerId | CustomerId |  | [optional] |
| affectedTenantId | TenantId |  | [optional] |
| affectedUserId | UserId |  | [optional] |

#### NewPlatformVersionNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.NewPlatformVersionNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| latestVersion | String |  | [optional] |
| latestVersionReleaseNotesUrl | String |  | [optional] |
| upgradeInstructionsUrl | String |  | [optional] |
| currentVersion | String |  | [optional] |
| currentVersionReleaseNotesUrl | String |  | [optional] |
| affectedCustomerId | CustomerId |  | [optional] |
| affectedTenantId | TenantId |  | [optional] |
| affectedUserId | UserId |  | [optional] |

#### PlanUpgradeRequestNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.PlanUpgradeRequestNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| planName | String |  | [optional] |
| userEmail | String |  | [optional] |
| upgradePlanLink | String |  | [optional] |
| baseUrl | String |  | [optional] |

#### RateLimitsNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.RateLimitsNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tenantId | TenantId |  | [optional] |
| tenantName | String |  | [optional] |
| api | LimitedApi |  | [optional] |
| limitLevel | EntityId |  | [optional] |
| limitLevelEntityName | String |  | [optional] |
| affectedCustomerId | CustomerId |  | [optional] |
| affectedTenantId | TenantId |  | [optional] |
| affectedUserId | UserId |  | [optional] |

#### ReportGeneratedNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.ReportGeneratedNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tenantId | TenantId |  | [optional] |
| customerId | CustomerId |  | [optional] |
| reportFormat | TbReportFormat |  | [optional] |
| reportName | String |  | [optional] |
| userId | UserId |  | [optional] |
| reportPublicUrl | String |  | [optional] |
| affectedCustomerId | CustomerId |  | [optional] |
| affectedTenantId | TenantId |  | [optional] |
| affectedUserId | UserId |  | [optional] |

#### ResourcesShortageNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.ResourcesShortageNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| resource | String |  | [optional] |
| usage | Long |  | [optional] |
| serviceId | String |  | [optional] |
| serviceType | String |  | [optional] |
| affectedCustomerId | CustomerId |  | [optional] |
| affectedTenantId | TenantId |  | [optional] |
| affectedUserId | UserId |  | [optional] |

#### RuleEngineComponentLifecycleEventNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.RuleEngineComponentLifecycleEventNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| ruleChainId | RuleChainId |  | [optional] |
| ruleChainName | String |  | [optional] |
| componentId | EntityId |  | [optional] |
| componentName | String |  | [optional] |
| action | String |  | [optional] |
| eventType | ComponentLifecycleEvent |  | [optional] |
| error | String |  | [optional] |
| affectedCustomerId | CustomerId |  | [optional] |
| affectedTenantId | TenantId |  | [optional] |
| affectedUserId | UserId |  | [optional] |

#### RuleEngineOriginatedNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.RuleEngineOriginatedNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| msgOriginator | EntityId |  | [optional] |
| msgCustomerId | CustomerId |  | [optional] |
| msgType | String |  | [optional] |
| msgMetadata | Map<String, String> |  | [optional] |
| msgData | Map<String, String> |  | [optional] |
| affectedCustomerId | CustomerId |  | [optional] |
| affectedTenantId | TenantId |  | [optional] |
| affectedUserId | UserId |  | [optional] |

#### TaskProcessingFailureNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.TaskProcessingFailureNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| tenantId | TenantId |  | [optional] |
| entityId | EntityId |  | [optional] |
| taskType | HousekeeperTaskType |  | [optional] |
| taskDescription | String |  | [optional] |
| error | String |  | [optional] |
| attempt | Integer |  | [optional] |
| affectedCustomerId | CustomerId |  | [optional] |
| affectedTenantId | TenantId |  | [optional] |
| affectedUserId | UserId |  | [optional] |

#### UserActivatedNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.UserActivatedNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| userFullName | String |  | [optional] |
| userEmail | String |  | [optional] |

#### UserRegisteredNotificationInfo  *(extends NotificationInfo, type=`org.thingsboard.server.common.data.notification.info.UserRegisteredNotificationInfo`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| userFullName | String |  | [optional] |
| userEmail | String |  | [optional] |

#### NotificationRequestConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| sendingDelayInSec | Integer |  | [optional] |
| reports | List<ReportId> |  | [optional] |

#### NotificationRequestStatus (enum)
`PROCESSING` | `SENT` | `SCHEDULED`

#### NotificationRequestStats
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| sent | Map<String, Integer> |  | [optional] |
| errors | Map<String, Map<String, String>> |  | [optional] |
| totalErrors | Integer |  | [optional] |
| error | String |  | [optional] |
| totalSent | Integer |  | [optional] |

#### NotificationType (enum)
`GENERAL` | `ALARM` | `DEVICE_ACTIVITY` | `ENTITY_ACTION` | `ALARM_COMMENT` | `RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT` | `ALARM_ASSIGNMENT` | `NEW_PLATFORM_VERSION` | `ENTITIES_LIMIT` | `ENTITIES_LIMIT_INCREASE_REQUEST` | … (24 values total)

#### NotificationTemplateConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| deliveryMethodsTemplates | Map<String, DeliveryMethodNotificationTemplate> |  |  |
| attachReport | Boolean |  | [optional] |
| reportTemplateId | ReportTemplateId |  | [optional] |
| userId | UserId |  | [optional] |
| timezone | String |  | [optional] |
| makePublic | Boolean |  | [optional] |

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (59 values total)

#### DeliveryMethodNotificationTemplate
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| enabled | Boolean |  | [optional] |
| body | String |  |  |
| method | String |  |  |

#### EmailDeliveryMethodNotificationTemplate  *(extends DeliveryMethodNotificationTemplate, method=`EMAIL`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| subject | String |  |  |

#### MicrosoftTeamsDeliveryMethodNotificationTemplate  *(extends DeliveryMethodNotificationTemplate, method=`MICROSOFT_TEAMS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| subject | String |  | [optional] |
| themeColor | String |  | [optional] |
| button | Button |  | [optional] |

#### MobileAppDeliveryMethodNotificationTemplate  *(extends DeliveryMethodNotificationTemplate, method=`MOBILE_APP`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| subject | String | Subject line for the mobile notification |  |
| additionalConfig | com.fasterxml.jackson.databind.JsonNode | Additional JSON configuration for web buttons/actions | [optional] |

#### SlackDeliveryMethodNotificationTemplate  *(extends DeliveryMethodNotificationTemplate, method=`SLACK`)*
*See DeliveryMethodNotificationTemplate for properties.*

#### SmsDeliveryMethodNotificationTemplate  *(extends DeliveryMethodNotificationTemplate, method=`SMS`)*
*See DeliveryMethodNotificationTemplate for properties.*

#### WebDeliveryMethodNotificationTemplate  *(extends DeliveryMethodNotificationTemplate, method=`WEB`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| subject | String | Subject line for the web notification |  |
| additionalConfig | com.fasterxml.jackson.databind.JsonNode | Additional JSON configuration for web buttons/actions | [optional] |

#### AddonType (enum)
`EDGE` | `TRENDZ` | `WHITE_LABELING`

#### AlarmSeverity (enum)
`CRITICAL` | `MAJOR` | `MINOR` | `WARNING` | `INDETERMINATE`

#### AlarmStatus (enum)
`ACTIVE_UNACK` | `ACTIVE_ACK` | `CLEARED_UNACK` | `CLEARED_ACK`

#### ApiFeature (enum)
`TRANSPORT` | `DB` | `RE` | `JS` | `TBEL` | `EMAIL` | `SMS` | `ALARM` | `REPORT` | `AI`

#### ApiUsageRecordKey (enum)
`TRANSPORT_MSG_COUNT` | `TRANSPORT_DP_COUNT` | `STORAGE_DP_COUNT` | `RE_EXEC_COUNT` | `JS_EXEC_COUNT` | `TBEL_EXEC_COUNT` | `EMAIL_EXEC_COUNT` | `SMS_EXEC_COUNT` | `CREATED_ALARMS_COUNT` | `ACTIVE_DEVICES` | … (13 values total)

#### ApiUsageStateValue (enum)
`ENABLED` | `WARNING` | `DISABLED`

#### ActionType (enum)
`ADDED` | `DELETED` | `UPDATED` | `ATTRIBUTES_UPDATED` | `ATTRIBUTES_DELETED` | `TIMESERIES_UPDATED` | `TIMESERIES_DELETED` | `RPC_CALL` | `CREDENTIALS_UPDATED` | `ASSIGNED_TO_CUSTOMER` | … (47 values total)

#### ComponentLifecycleEvent (enum)
`CREATED` | `STARTED` | `ACTIVATED` | `SUSPENDED` | `UPDATED` | `STOPPED` | `DELETED` | `FAILED` | `DEACTIVATED` | `RELATION_UPDATED` | … (11 values total)

#### LimitedApi (enum)
`ENTITY_EXPORT` | `ENTITY_IMPORT` | `NOTIFICATION_REQUESTS` | `NOTIFICATION_REQUESTS_PER_RULE` | `REST_REQUESTS_PER_TENANT` | `REST_REQUESTS_PER_CUSTOMER` | `WS_UPDATES_PER_SESSION` | `CASSANDRA_WRITE_QUERIES_CORE` | `CASSANDRA_READ_QUERIES_CORE` | `CASSANDRA_WRITE_QUERIES_RULE_ENGINE` | … (40 values total)

#### TbReportFormat (enum)
`PDF` | `CSV`

#### HousekeeperTaskType (enum)
`DELETE_ATTRIBUTES` | `DELETE_TELEMETRY` | `DELETE_LATEST_TS` | `DELETE_TS_HISTORY` | `DELETE_EVENTS` | `DELETE_ALARMS` | `DELETE_ALARM_COMMENTS` | `UNASSIGN_ALARMS` | `DELETE_TENANT_ENTITIES` | `DELETE_ENTITIES` | … (15 values total)

#### Button
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| enabled | Boolean |  | [optional] |
| text | String |  | [optional] |
| linkType | LinkType |  | [optional] |
| link | String |  | [optional] |
| dashboardId | UUID |  | [optional] |
| dashboardState | String |  | [optional] |
| setEntityIdInState | Boolean |  | [optional] |

#### LinkType (enum)
`LINK` | `DASHBOARD`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

