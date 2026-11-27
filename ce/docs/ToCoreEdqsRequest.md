
# ToCoreEdqsRequest

`org.thingsboard.client.model.ToCoreEdqsRequest`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **syncRequest** | **EdqsSyncRequest** |  | [optional] |
| **apiEnabled** | **Boolean** |  | [optional] |



## Referenced Types

#### EdqsSyncRequest
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| objectTypes | Set<ObjectType> |  | [optional] |

#### ObjectType (enum)
`TENANT` | `TENANT_PROFILE` | `CUSTOMER` | `QUEUE` | `RPC` | `RULE_CHAIN` | `OTA_PACKAGE` | `RESOURCE` | `ROLE` | `ENTITY_GROUP` | … (49 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

