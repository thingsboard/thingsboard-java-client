

# Domain

A JSON value representing the Domain.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**DomainId**](DomainId.md) |  |  [optional] |
|**createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id |  [optional] |
|**customerId** | [**CustomerId**](CustomerId.md) | JSON object with Customer Id |  [optional] |
|**name** | **String** | Domain name. Cannot be empty |  |
|**oauth2Enabled** | **Boolean** | Whether OAuth2 settings are enabled or not |  [optional] |
|**propagateToEdge** | **Boolean** | Whether OAuth2 settings are enabled on Edge or not |  [optional] |
|**ownerId** | [**EntityId**](EntityId.md) | JSON object with Customer or Tenant Id |  [optional] [readonly] |



