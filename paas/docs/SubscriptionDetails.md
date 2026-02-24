

# SubscriptionDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**SubscriptionId**](SubscriptionId.md) |  |  [optional] |
|**createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch |  [optional] [readonly] |
|**externalId** | **String** |  |  [optional] |
|**tenantId** | [**TenantId**](TenantId.md) |  |  [optional] |
|**billingCustomerId** | [**BillingCustomerId**](BillingCustomerId.md) |  |  [optional] |
|**subscriptionPlanId** | [**SubscriptionPlanId**](SubscriptionPlanId.md) |  |  [optional] |
|**currentPeriodStartTs** | **Long** |  |  [optional] |
|**currentPeriodEndTs** | **Long** |  |  [optional] |
|**active** | **Boolean** |  |  [optional] |
|**trial** | **Boolean** |  |  [optional] |
|**trialEndTs** | **Long** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**lastPaid** | **Boolean** |  |  [optional] |
|**upcomingInvoiceDate** | **Long** |  |  [optional] |
|**upcomingInvoiceAmountDue** | **Long** |  |  [optional] |
|**couponId** | [**CouponId**](CouponId.md) |  |  [optional] |
|**discountEndDate** | **Long** |  |  [optional] |
|**subscriptionPlanName** | **String** |  |  [optional] |
|**planHasAddons** | **Boolean** |  |  [optional] |
|**planUiType** | **String** |  |  [optional] |
|**planIsFree** | **Boolean** |  |  [optional] |
|**planIsActive** | **Boolean** |  |  [optional] |
|**edgeCountIncluded** | **Long** |  |  [optional] |
|**items** | [**SubscriptionItems**](SubscriptionItems.md) |  |  [optional] |
|**discount** | [**Discount**](Discount.md) |  |  [optional] |
|**name** | **String** |  |  [optional] [readonly] |
|**additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** |  |  [optional] |



