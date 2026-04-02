
# MergedGroupPermissionInfo

`org.thingsboard.client.model.MergedGroupPermissionInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **entityType** | **EntityType** |  | [optional] |
| **operations** | **Set\<Operation\>** |  | [optional] |



## Referenced Types

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

#### Operation (enum)
`ALL` | `CREATE` | `READ` | `WRITE` | `DELETE` | `RPC_CALL` | `READ_CREDENTIALS` | `WRITE_CREDENTIALS` | `READ_ATTRIBUTES` | `WRITE_ATTRIBUTES` | … (21 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

