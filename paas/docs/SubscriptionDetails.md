
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



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

