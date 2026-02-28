
# Job

`org.thingsboard.client.model.Job`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **JobId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **tenantId** | **TenantId** |  | |
| **type** | **JobType** |  | |
| **key** | **String** |  | |
| **entityId** | **EntityId** |  | |
| **entityName** | **String** |  | [optional] |
| **status** | **JobStatus** |  | |
| **_configuration** | **JobConfiguration** |  | |
| **result** | **JobResult** |  | |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

