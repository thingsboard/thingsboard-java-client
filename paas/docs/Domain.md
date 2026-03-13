
# Domain

`org.thingsboard.client.model.Domain`

A JSON value representing the Domain.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **DomainId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id | [optional] |
| **customerId** | **CustomerId** | JSON object with Customer Id | [optional] |
| **name** | **String** | Domain name. Cannot be empty | |
| **oauth2Enabled** | **Boolean** | Whether OAuth2 settings are enabled or not | [optional] |
| **propagateToEdge** | **Boolean** | Whether OAuth2 settings are enabled on Edge or not | [optional] |
| **ownerId** | **EntityId** | JSON object with Customer or Tenant Id | [optional] [readonly] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

