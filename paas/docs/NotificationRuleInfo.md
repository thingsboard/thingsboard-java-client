
# NotificationRuleInfo

`org.thingsboard.client.model.NotificationRuleInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **NotificationRuleId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **tenantId** | **TenantId** |  | [optional] |
| **name** | **String** |  | |
| **enabled** | **Boolean** |  | [optional] |
| **templateId** | **NotificationTemplateId** |  | |
| **triggerType** | **NotificationRuleTriggerType** |  | |
| **triggerConfig** | **NotificationRuleTriggerConfig** |  | |
| **recipientsConfig** | **NotificationRuleRecipientsConfig** |  | |
| **additionalConfig** | **NotificationRuleConfig** |  | [optional] |
| **templateName** | **String** |  | [optional] |
| **deliveryMethods** | **List\<NotificationDeliveryMethod\>** |  | [optional] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### NotificationRuleTriggerType (enum)
`ENTITY_ACTION` | `ALARM` | `ALARM_COMMENT` | `ALARM_ASSIGNMENT` | `DEVICE_ACTIVITY` | `RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT` | `INTEGRATION_LIFECYCLE_EVENT` | `EDGE_CONNECTION` | `EDGE_COMMUNICATION_FAILURE` | `NEW_PLATFORM_VERSION` | … (15 values total)

#### NotificationRuleTriggerConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| triggerType | NotificationRuleTriggerType |  |  |

#### AlarmNotificationRuleTriggerConfig  *(extends NotificationRuleTriggerConfig, triggerType=`ALARM`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| alarmTypes | Set<String> |  | [optional] |
| alarmSeverities | Set<AlarmSeverity> |  | [optional] |
| notifyOn | Set<AlarmAction> |  |  |
| clearRule | ClearRule |  | [optional] |

#### AlarmAssignmentNotificationRuleTriggerConfig  *(extends NotificationRuleTriggerConfig, triggerType=`ALARM_ASSIGNMENT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| alarmTypes | Set<String> |  | [optional] |
| alarmSeverities | Set<AlarmSeverity> |  | [optional] |
| alarmStatuses | Set<AlarmSearchStatus> |  | [optional] |
| notifyOn | Set<Action> |  |  |

#### AlarmCommentNotificationRuleTriggerConfig  *(extends NotificationRuleTriggerConfig, triggerType=`ALARM_COMMENT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| alarmTypes | Set<String> |  | [optional] |
| alarmSeverities | Set<AlarmSeverity> |  | [optional] |
| alarmStatuses | Set<AlarmSearchStatus> |  | [optional] |
| onlyUserComments | Boolean |  | [optional] |
| notifyOnCommentUpdate | Boolean |  | [optional] |

#### ApiUsageLimitNotificationRuleTriggerConfig  *(extends NotificationRuleTriggerConfig, triggerType=`API_USAGE_LIMIT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| apiFeatures | Set<ApiFeature> |  | [optional] |
| notifyOn | Set<ApiUsageStateValue> |  | [optional] |

#### DeviceActivityNotificationRuleTriggerConfig  *(extends NotificationRuleTriggerConfig, triggerType=`DEVICE_ACTIVITY`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| devices | Set<UUID> |  | [optional] |
| deviceProfiles | Set<UUID> |  | [optional] |
| notifyOn | Set<DeviceEvent> |  |  |

#### EdgeCommunicationFailureNotificationRuleTriggerConfig  *(extends NotificationRuleTriggerConfig, triggerType=`EDGE_COMMUNICATION_FAILURE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| edges | Set<UUID> |  | [optional] |

#### EdgeConnectionNotificationRuleTriggerConfig  *(extends NotificationRuleTriggerConfig, triggerType=`EDGE_CONNECTION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| edges | Set<UUID> |  | [optional] |
| notifyOn | Set<EdgeConnectivityEvent> |  | [optional] |

#### EntitiesLimitNotificationRuleTriggerConfig  *(extends NotificationRuleTriggerConfig, triggerType=`ENTITIES_LIMIT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityTypes | Set<EntityType> |  | [optional] |
| threshold | Float |  | [optional] |

#### EntityActionNotificationRuleTriggerConfig  *(extends NotificationRuleTriggerConfig, triggerType=`ENTITY_ACTION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityTypes | Set<EntityType> |  | [optional] |
| created | Boolean |  | [optional] |
| updated | Boolean |  | [optional] |
| deleted | Boolean |  | [optional] |

#### IntegrationLifecycleEventNotificationRuleTriggerConfig  *(extends NotificationRuleTriggerConfig, triggerType=`INTEGRATION_LIFECYCLE_EVENT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| integrationTypes | Set<IntegrationType> |  | [optional] |
| integrations | Set<UUID> |  | [optional] |
| notifyOn | Set<ComponentLifecycleEvent> |  | [optional] |
| onlyOnError | Boolean |  | [optional] |

#### NewPlatformVersionNotificationRuleTriggerConfig  *(extends NotificationRuleTriggerConfig, triggerType=`NEW_PLATFORM_VERSION`)*
*See NotificationRuleTriggerConfig for properties.*

#### RateLimitsNotificationRuleTriggerConfig  *(extends NotificationRuleTriggerConfig, triggerType=`RATE_LIMITS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| apis | Set<LimitedApi> |  | [optional] |

#### ResourcesShortageNotificationRuleTriggerConfig  *(extends NotificationRuleTriggerConfig, triggerType=`RESOURCES_SHORTAGE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| cpuThreshold | Float |  | [optional] |
| ramThreshold | Float |  | [optional] |
| storageThreshold | Float |  | [optional] |

#### RuleEngineComponentLifecycleEventNotificationRuleTriggerConfig  *(extends NotificationRuleTriggerConfig, triggerType=`RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| ruleChains | Set<UUID> |  | [optional] |
| ruleChainEvents | Set<ComponentLifecycleEvent> |  | [optional] |
| onlyRuleChainLifecycleFailures | Boolean |  | [optional] |
| trackRuleNodeEvents | Boolean |  | [optional] |
| ruleNodeEvents | Set<ComponentLifecycleEvent> |  | [optional] |
| onlyRuleNodeLifecycleFailures | Boolean |  | [optional] |

#### TaskProcessingFailureNotificationRuleTriggerConfig  *(extends NotificationRuleTriggerConfig, triggerType=`TASK_PROCESSING_FAILURE`)*
*See NotificationRuleTriggerConfig for properties.*

#### NotificationRuleRecipientsConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| triggerType | NotificationRuleTriggerType |  | [optional] |

#### EscalatedNotificationRuleRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`ALARM`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| escalationTable | Map<String, List<UUID>> |  |  |

#### AlarmAssignmentRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`ALARM_ASSIGNMENT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### AlarmCommentRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`ALARM_COMMENT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### ApiUsageLimitRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`API_USAGE_LIMIT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### DeviceActivityRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`DEVICE_ACTIVITY`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### EdgeCommunicationFailureRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`EDGE_COMMUNICATION_FAILURE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### EdgeConnectionRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`EDGE_CONNECTION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### EntitiesLimitRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`ENTITIES_LIMIT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### EntityActionRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`ENTITY_ACTION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### IntegrationLifecycleEventRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`INTEGRATION_LIFECYCLE_EVENT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### NewPlatformVersionRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`NEW_PLATFORM_VERSION`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### RateLimitsRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`RATE_LIMITS`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### ResourceShortageRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`RESOURCES_SHORTAGE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### RuleEngineComponentLifecycleEventRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`RULE_ENGINE_COMPONENT_LIFECYCLE_EVENT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### TaskProcessingFailureRecipientsConfig  *(extends NotificationRuleRecipientsConfig, triggerType=`TASK_PROCESSING_FAILURE`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| targets | List<UUID> |  |  |

#### NotificationRuleConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| description | String |  | [optional] |

#### NotificationDeliveryMethod (enum)
`WEB` | `EMAIL` | `SMS` | `SLACK` | `MICROSOFT_TEAMS` | `MOBILE_APP`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (52 values total)

#### AlarmSeverity (enum)
`CRITICAL` | `MAJOR` | `MINOR` | `WARNING` | `INDETERMINATE`

#### AlarmAction (enum)
`CREATED` | `SEVERITY_CHANGED` | `ACKNOWLEDGED` | `CLEARED`

#### ClearRule
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| alarmStatuses | Set<AlarmSearchStatus> |  | [optional] |

#### DeviceEvent (enum)
`ACTIVE` | `INACTIVE`

#### AlarmSearchStatus (enum)
`ANY` | `ACTIVE` | `CLEARED` | `ACK` | `UNACK`

#### ComponentLifecycleEvent (enum)
`CREATED` | `STARTED` | `ACTIVATED` | `SUSPENDED` | `UPDATED` | `STOPPED` | `DELETED` | `FAILED` | `DEACTIVATED` | `RELATION_UPDATED` | … (11 values total)

#### Action (enum)
`ASSIGNED` | `UNASSIGNED`

#### ApiFeature (enum)
`TRANSPORT` | `DB` | `RE` | `JS` | `TBEL` | `EMAIL` | `SMS` | `ALARM` | `REPORT` | `AI`

#### ApiUsageStateValue (enum)
`ENABLED` | `WARNING` | `DISABLED`

#### LimitedApi (enum)
`ENTITY_EXPORT` | `ENTITY_IMPORT` | `NOTIFICATION_REQUESTS` | `NOTIFICATION_REQUESTS_PER_RULE` | `REST_REQUESTS_PER_TENANT` | `REST_REQUESTS_PER_CUSTOMER` | `WS_UPDATES_PER_SESSION` | `CASSANDRA_WRITE_QUERIES_CORE` | `CASSANDRA_READ_QUERIES_CORE` | `CASSANDRA_WRITE_QUERIES_RULE_ENGINE` | … (36 values total)

#### EdgeConnectivityEvent (enum)
`CONNECTED` | `DISCONNECTED`

#### IntegrationType (enum)
`OCEANCONNECT` | `SIGFOX` | `THINGPARK` | `TPE` | `CHIRPSTACK` | `PARTICLE` | `TMOBILE_IOT_CDP` | `HTTP` | `MQTT` | `PUB_SUB` | … (29 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

