
# Secret

`org.thingsboard.client.model.Secret`

A JSON value representing the Secret.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **SecretId** | JSON object with the Secret Id. Specify this field to update the Secret. Referencing non-existing Secret Id will cause error. Omit this field to create new Secret. | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. Tenant Id of the secret cannot be changed. | [optional] [readonly] |
| **name** | **String** | Secret name | |
| **type** | **SecretType** | Secret type. | |
| **description** | **String** | Secret description. | [optional] |
| **value** | **String** |  | [optional] |
| **encryptedValue** | **String** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

