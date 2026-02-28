
# Customer

`org.thingsboard.client.model.Customer`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **CustomerId** | JSON object with the customer Id. Specify this field to update the customer. Referencing non-existing customer Id will cause error. Omit this field to create new customer. | [optional] |
| **createdTime** | **Long** | Timestamp of the customer creation, in milliseconds | [optional] [readonly] |
| **country** | **String** | Country | [optional] |
| **state** | **String** | State | [optional] |
| **city** | **String** | City | [optional] |
| **address** | **String** | Address Line 1 | [optional] |
| **address2** | **String** | Address Line 2 | [optional] |
| **zip** | **String** | Zip code | [optional] |
| **phone** | **String** | Phone number | [optional] |
| **email** | **String** | Email | |
| **title** | **String** | Title of the customer | |
| **tenantId** | **TenantId** | JSON object with Tenant Id | [optional] |
| **parentCustomerId** | **CustomerId** | JSON object with parent Customer Id | [optional] |
| **version** | **Long** |  | [optional] |
| **customMenuId** | **CustomMenuId** |  | [optional] |
| **name** | **String** | Name of the customer. Read-only, duplicated from title for backward compatibility | [optional] [readonly] |
| **customerId** | **CustomerId** | JSON object with parent Customer Id | [optional] [readonly] |
| **ownerId** | **EntityId** | JSON object with Customer or Tenant Id | [optional] [readonly] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the device | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

