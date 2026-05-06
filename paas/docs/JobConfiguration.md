
# JobConfiguration

`org.thingsboard.client.model.JobConfiguration`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **tasksKey** | **String** |  | |
| **toReprocess** | **List\<TaskResult\>** |  | [optional] |
| **type** | **String** |  | |



## Subtypes

#### CfReprocessingJobConfiguration  *(type=`CF_REPROCESSING`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| calculatedFieldId | CalculatedFieldId |  |  |
| calculatedFieldName | String |  | [optional] |
| startTs | Long |  | [optional] |
| endTs | Long |  | [optional] |

#### DummyJobConfiguration  *(type=`DUMMY`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| taskProcessingTimeMs | Long |  | [optional] |
| successfulTasksCount | Integer |  | [optional] |
| failedTasksCount | Integer |  | [optional] |
| permanentlyFailedTasksCount | Integer |  | [optional] |
| errors | List<String> |  | [optional] |
| retries | Integer |  | [optional] |
| taskProcessingTimeoutMs | Long |  | [optional] |
| generalError | String |  | [optional] |
| submittedTasksBeforeGeneralError | Integer |  | [optional] |

#### ReportJobConfiguration  *(type=`REPORT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| reportTemplateId | ReportTemplateId |  | [optional] |
| userId | UserId |  | [optional] |
| timezone | String |  | [optional] |
| targets | List<UUID> |  | [optional] |
| notificationTemplateId | NotificationTemplateId |  | [optional] |
| notificationRequests | List<NotificationRequest> |  | [optional] |
| originator | EntityId |  | [optional] |
| ruleNode | RuleNode |  | [optional] |
| outputTbMsgProto | String |  | [optional] |
| queueName | String |  | [optional] |
| schedulerEventInfo | EntityInfo |  | [optional] |

## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### TaskResult
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| key | String |  | [optional] |
| success | Boolean |  | [optional] |
| discarded | Boolean |  | [optional] |
| finishTs | Long |  | [optional] |
| error | String |  | [optional] |
| jobType | String |  |  |

#### NotificationRequest
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | NotificationRequestId |  | [optional] |
| createdTime | Long | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| tenantId | TenantId |  | [optional] |
| targets | List<UUID> |  |  |
| templateId | NotificationTemplateId |  | [optional] |
| template | NotificationTemplate |  | [optional] |
| info | NotificationInfo |  | [optional] |
| additionalConfig | NotificationRequestConfig |  | [optional] |
| originatorEntityId | EntityId |  | [optional] |
| ruleId | NotificationRuleId |  | [optional] |
| status | NotificationRequestStatus |  | [optional] |
| stats | NotificationRequestStats |  | [optional] |

#### RuleNode
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | RuleNodeId | JSON object with the Rule Node Id. Specify this field to update the Rule Node. Referencing non-existing Rule Node Id will cause error. Omit this field to create new rule node. | [optional] |
| createdTime | Long | Timestamp of the rule node creation, in milliseconds | [optional] [readonly] |
| additionalInfo | com.fasterxml.jackson.databind.JsonNode | Additional parameters of the rule node. May include: 'layoutX' (number, X coordinate for visualization), 'layoutY' (number, Y coordinate for visualization), 'description' (string). | [optional] |
| ruleChainId | RuleChainId | JSON object with the Rule Chain Id. | [optional] [readonly] |
| type | String | Full Java Class Name of the rule node implementation. | [optional] |
| name | String | User defined name of the rule node. Used on UI and for logging. | [optional] |
| debugSettings | DebugSettings | Debug settings object. | [optional] |
| singletonMode | Boolean | Enable/disable singleton mode. | [optional] |
| queueName | String | Queue name. | [optional] |
| configurationVersion | Integer | Version of rule node configuration. | [optional] |
| _configuration | com.fasterxml.jackson.databind.JsonNode | JSON with the rule node configuration. Structure depends on the rule node implementation. | [optional] |
| externalId | RuleNodeId |  | [optional] |
| debugMode | Boolean |  | [optional] |

#### EntityInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | EntityId | JSON object with the entity Id. | [optional] |
| name | String | Entity Name | [optional] |

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

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (52 values total)

#### DebugSettings
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| failuresEnabled | Boolean | Debug failures. | [optional] |
| allEnabled | Boolean | Debug All. Used as a trigger for updating debugAllUntil. | [optional] |
| allEnabledUntil | Long | Timestamp of the end time for the processing debug events. | [optional] |

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

