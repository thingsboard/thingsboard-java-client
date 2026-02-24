

# SchedulerEventWithCustomerInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**SchedulerEventId**](SchedulerEventId.md) | JSON object with the scheduler event Id. Specify this field to update the scheduler event. Referencing non-existing scheduler event Id will cause error. Omit this field to create new scheduler event |  [optional] |
|**createdTime** | **Long** | Timestamp of the scheduler event creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id |  [optional] [readonly] |
|**customerId** | [**CustomerId**](CustomerId.md) | JSON object with Customer Id |  [optional] [readonly] |
|**originatorId** | [**EntityId**](EntityId.md) | JSON object with Originator Id |  [optional] [readonly] |
|**name** | **String** | scheduler event name |  [optional] |
|**type** | **String** | scheduler event type |  [optional] |
|**schedule** | **com.fasterxml.jackson.databind.JsonNode** | a JSON value with schedule time configuration |  [optional] |
|**enabled** | **Boolean** | Enable/disable scheduler |  [optional] |
|**version** | **Long** |  |  [optional] |
|**customerTitle** | **String** | Title of the customer |  [optional] |
|**customerIsPublic** | **Boolean** | Parameter that specifies if customer is public |  [optional] [readonly] |
|**timestamps** | **List&lt;Long&gt;** |  |  [optional] |
|**ownerId** | [**EntityId**](EntityId.md) | JSON object with Customer or Tenant Id |  [optional] [readonly] |
|**additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the scheduler event |  [optional] |



