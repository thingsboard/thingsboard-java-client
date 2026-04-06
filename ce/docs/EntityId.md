
# EntityId

`org.thingsboard.client.model.EntityId`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **entityType** | **EntityType** |  | |
| **id** | **UUID** | ID of the entity, time-based UUID v1 | |



## Subtypes

#### AdminSettingsId  *(entityType=`ADMIN_SETTINGS`)*
*(no additional properties)*

#### AiModelId  *(entityType=`AI_MODEL`)*
*(no additional properties)*

#### AlarmId  *(entityType=`ALARM`)*
*(no additional properties)*

#### ApiKeyId  *(entityType=`API_KEY`)*
*(no additional properties)*

#### ApiUsageStateId  *(entityType=`API_USAGE_STATE`)*
*(no additional properties)*

#### AssetId  *(entityType=`ASSET`)*
*(no additional properties)*

#### AssetProfileId  *(entityType=`ASSET_PROFILE`)*
*(no additional properties)*

#### CalculatedFieldId  *(entityType=`CALCULATED_FIELD`)*
*(no additional properties)*

#### CustomerId  *(entityType=`CUSTOMER`)*
*(no additional properties)*

#### DashboardId  *(entityType=`DASHBOARD`)*
*(no additional properties)*

#### DeviceId  *(entityType=`DEVICE`)*
*(no additional properties)*

#### DeviceProfileId  *(entityType=`DEVICE_PROFILE`)*
*(no additional properties)*

#### DomainId  *(entityType=`DOMAIN`)*
*(no additional properties)*

#### EdgeId  *(entityType=`EDGE`)*
*(no additional properties)*

#### EntityViewId  *(entityType=`ENTITY_VIEW`)*
*(no additional properties)*

#### JobId  *(entityType=`JOB`)*
*(no additional properties)*

#### MobileAppId  *(entityType=`MOBILE_APP`)*
*(no additional properties)*

#### MobileAppBundleId  *(entityType=`MOBILE_APP_BUNDLE`)*
*(no additional properties)*

#### NotificationId  *(entityType=`NOTIFICATION`)*
*(no additional properties)*

#### NotificationRequestId  *(entityType=`NOTIFICATION_REQUEST`)*
*(no additional properties)*

#### NotificationRuleId  *(entityType=`NOTIFICATION_RULE`)*
*(no additional properties)*

#### NotificationTargetId  *(entityType=`NOTIFICATION_TARGET`)*
*(no additional properties)*

#### NotificationTemplateId  *(entityType=`NOTIFICATION_TEMPLATE`)*
*(no additional properties)*

#### OAuth2ClientId  *(entityType=`OAUTH2_CLIENT`)*
*(no additional properties)*

#### OtaPackageId  *(entityType=`OTA_PACKAGE`)*
*(no additional properties)*

#### QueueId  *(entityType=`QUEUE`)*
*(no additional properties)*

#### QueueStatsId  *(entityType=`QUEUE_STATS`)*
*(no additional properties)*

#### RpcId  *(entityType=`RPC`)*
*(no additional properties)*

#### RuleChainId  *(entityType=`RULE_CHAIN`)*
*(no additional properties)*

#### RuleNodeId  *(entityType=`RULE_NODE`)*
*(no additional properties)*

#### TbResourceId  *(entityType=`TB_RESOURCE`)*
*(no additional properties)*

#### TenantId  *(entityType=`TENANT`)*
*(no additional properties)*

#### TenantProfileId  *(entityType=`TENANT_PROFILE`)*
*(no additional properties)*

#### UserId  *(entityType=`USER`)*
*(no additional properties)*

#### WidgetsBundleId  *(entityType=`WIDGETS_BUNDLE`)*
*(no additional properties)*

#### WidgetTypeId  *(entityType=`WIDGET_TYPE`)*
*(no additional properties)*

## Referenced Types

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `RULE_CHAIN` | `RULE_NODE` | `ENTITY_VIEW` | … (36 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

