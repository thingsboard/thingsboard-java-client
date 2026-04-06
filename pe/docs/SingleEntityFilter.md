
# SingleEntityFilter

`org.thingsboard.client.model.SingleEntityFilter`

**Extends:** **EntityFilter**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **singleEntity** | **AliasEntityId** |  | [optional] |



## Referenced Types

#### EntityFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### AliasEntityId
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| aliasEntityType | AliasEntityType |  | [optional] |
| entityType | EntityType |  |  |
| id | UUID | ID of the entity, time-based UUID v1 |  |

#### AliasEntityType (enum)
`CURRENT_CUSTOMER` | `CURRENT_TENANT` | `CURRENT_USER` | `CURRENT_USER_OWNER`

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

