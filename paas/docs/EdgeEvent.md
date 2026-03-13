
# EdgeEvent

`org.thingsboard.client.model.EdgeEvent`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **EdgeEventId** |  | [optional] |
| **createdTime** | **Long** | Entity creation timestamp in milliseconds since Unix epoch | [optional] [readonly] |
| **seqId** | **Long** |  | [optional] |
| **tenantId** | **TenantId** |  | [optional] |
| **edgeId** | **EdgeId** |  | [optional] |
| **action** | **EdgeEventActionType** |  | [optional] |
| **entityId** | **UUID** |  | [optional] |
| **uid** | **String** |  | [optional] |
| **type** | **EdgeEventType** |  | [optional] |
| **body** | **com.fasterxml.jackson.databind.JsonNode** |  | [optional] |
| **entityGroupId** | **UUID** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

