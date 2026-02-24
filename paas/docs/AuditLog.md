

# AuditLog


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**AuditLogId**](AuditLogId.md) | JSON object with the auditLog Id |  [optional] |
|**createdTime** | **Long** | Timestamp of the auditLog creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id |  [optional] [readonly] |
|**customerId** | [**CustomerId**](CustomerId.md) | JSON object with Customer Id |  [optional] [readonly] |
|**entityId** | [**EntityId**](EntityId.md) | JSON object with Entity id |  [optional] [readonly] |
|**entityName** | **String** | Name of the logged entity |  [optional] [readonly] |
|**userId** | [**UserId**](UserId.md) | JSON object with User id. |  [optional] [readonly] |
|**userName** | **String** | Unique user name(email) of the user that performed some action on logged entity |  [optional] [readonly] |
|**actionType** | **ActionType** | String represented Action type |  [optional] [readonly] |
|**actionData** | **com.fasterxml.jackson.databind.JsonNode** | JsonNode represented action data |  [optional] [readonly] |
|**actionStatus** | **ActionStatus** | String represented Action status |  [optional] [readonly] |
|**actionFailureDetails** | **String** | Failure action details info. An empty string in case of action status type &#39;SUCCESS&#39;, otherwise includes stack trace of the caused exception. |  [optional] [readonly] |



