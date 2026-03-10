
# Role

`org.thingsboard.client.model.Role`

A JSON value representing the role.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **tenantId** | **TenantId** | JSON object with Tenant Id. | [readonly] |
| **customerId** | **CustomerId** | JSON object with Customer Id.  | [optional] [readonly] |
| **name** | **String** | Role Name | |
| **type** | **RoleType** | Type of the role: generic or group | |
| **permissions** | **com.fasterxml.jackson.databind.JsonNode** |  | [optional] |
| **version** | **Long** |  | [optional] |
| **id** | **RoleId** | JSON object with the Role Id. Specify this field to update the Role. Referencing non-existing Role Id will cause error. Omit this field to create new Role. | [optional] |
| **createdTime** | **Long** | Timestamp of the role creation, in milliseconds | [optional] [readonly] |
| **ownerId** | **EntityId** | JSON object with Customer or Tenant Id | [optional] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the role. May include: 'description' (string). | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

