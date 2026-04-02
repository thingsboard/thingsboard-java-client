
# SubscriptionDetails

`org.thingsboard.client.model.SubscriptionDetails`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **SubscriptionId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** |  | [optional] |
| **externalId** | **String** |  | [optional] |
| **tenantId** | **TenantId** |  | [optional] |
| **billingCustomerId** | **BillingCustomerId** |  | [optional] |
| **subscriptionPlanId** | **SubscriptionPlanId** |  | [optional] |
| **currentPeriodStartTs** | **Long** |  | [optional] |
| **currentPeriodEndTs** | **Long** |  | [optional] |
| **active** | **Boolean** |  | [optional] |
| **trial** | **Boolean** |  | [optional] |
| **trialEndTs** | **Long** |  | [optional] |
| **status** | **String** |  | [optional] |
| **lastPaid** | **Boolean** |  | [optional] |
| **upcomingInvoiceDate** | **Long** |  | [optional] |
| **upcomingInvoiceAmountDue** | **Long** |  | [optional] |
| **couponId** | **CouponId** |  | [optional] |
| **discountEndDate** | **Long** |  | [optional] |
| **subscriptionPlanName** | **String** |  | [optional] |
| **planHasAddons** | **Boolean** |  | [optional] |
| **planUiType** | **String** |  | [optional] |
| **planIsFree** | **Boolean** |  | [optional] |
| **planIsActive** | **Boolean** |  | [optional] |
| **edgeCountIncluded** | **Long** |  | [optional] |
| **items** | **SubscriptionItems** |  | [optional] |
| **discount** | **Discount** |  | [optional] |
| **name** | **String** |  | [optional] [readonly] |



## Referenced Types

> **EntityId types** (`AdminSettingsId`, `AiModelId`, `AlarmId`, `ApiKeyId`, `ApiUsageStateId`, `AssetId`, `AssetProfileId`, `BillingCustomerId`, `BlobEntityId`, `CalculatedFieldId`, `ConverterId`, `CouponId`, `CustomerId`, `DashboardId`, `DeviceId`, `DeviceProfileId`, `DomainId`, `EdgeId`, `EntityGroupId`, `EntityViewId`, `GroupPermissionId`, `IntegrationId`, `JobId`, `MobileAppBundleId`, `MobileAppId`, `NotificationId`, `NotificationRequestId`, `NotificationRuleId`, `NotificationTargetId`, `NotificationTemplateId`, `OAuth2ClientId`, `OtaPackageId`, `ProductId`, `QueueId`, `QueueStatsId`, `ReportId`, `ReportTemplateId`, `RoleId`, `RpcId`, `RuleChainId`, `RuleNodeId`, `SchedulerEventId`, `SecretId`, `SubscriptionAddonId`, `SubscriptionId`, `SubscriptionPlanId`, `TbResourceId`, `TenantId`, `TenantProfileId`, `UserId`, `WidgetTypeId`, `WidgetsBundleId`, etc.): `{entityType: EntityType, id: UUID}` — all EntityId subtypes share this structure.

#### SubscriptionItems
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| extraDevicePackCount | Long |  | [optional] |
| extraCustomerPackCount | Long |  | [optional] |
| extraIntegrationPackCount | Long |  | [optional] |
| extraCalculatedFieldCount | Long |  | [optional] |
| trafficPackCount | Long |  | [optional] |
| computePackCount | Long |  | [optional] |
| storagePackCount | Long |  | [optional] |
| alarmPackCount | Long |  | [optional] |
| emailPackCount | Long |  | [optional] |
| smsPackCount | Long |  | [optional] |
| aiCreditsPackCount | Long |  | [optional] |
| edgeEnabled | Boolean |  | [optional] |
| extraEdgeCount | Long |  | [optional] |
| trendzEnabled | Boolean |  | [optional] |
| whiteLabelingAddonEnabled | Boolean |  | [optional] |

#### Discount
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| couponCode | String |  | [optional] |
| couponValid | Boolean |  | [optional] |
| amountOff | Long |  | [optional] |
| percentOff | Double |  | [optional] |
| couponId | CouponId |  | [optional] |
| duration | CouponDuration |  | [optional] |
| durationInMonths | Long |  | [optional] |
| endDate | Long |  | [optional] |
| _package | Boolean |  | [optional] |

#### CouponDuration (enum)
`FOREVER` | `ONCE` | `REPEATING`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (52 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

