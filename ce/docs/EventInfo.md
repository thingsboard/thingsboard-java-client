
# EventInfo

`org.thingsboard.client.model.EventInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **EventId** |  | [optional] |
| **createdTime** | **Long** | Timestamp of the event creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. | [optional] [readonly] |
| **type** | **String** | Event type | [optional] |
| **uid** | **String** | string | [optional] |
| **entityId** | **EntityId** | JSON object with Entity Id for which event is created. | [optional] |
| **body** | **com.fasterxml.jackson.databind.JsonNode** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

