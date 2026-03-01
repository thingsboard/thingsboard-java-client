
# TenantProfile

`org.thingsboard.client.model.TenantProfile`

A JSON value representing the tenant profile.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **TenantProfileId** | JSON object with the tenant profile Id. Specify this field to update the tenant profile. Referencing non-existing tenant profile Id will cause error. Omit this field to create new tenant profile. | [optional] |
| **createdTime** | **Long** | Timestamp of the tenant profile creation, in milliseconds | [optional] [readonly] |
| **name** | **String** | Name of the tenant profile | [optional] |
| **description** | **String** | Description of the tenant profile | [optional] |
| **isolatedTbRuleEngine** | **Boolean** | If enabled, will push all messages related to this tenant and processed by the rule engine into separate queue. Useful for complex microservices deployments, to isolate processing of the data for specific tenants | [optional] |
| **_default** | **Boolean** | Default Tenant profile to be used. | [optional] |
| **profileData** | **TenantProfileData** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

