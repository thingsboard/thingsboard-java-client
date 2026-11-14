
# StateEntityOwnerFilter

`org.thingsboard.client.model.StateEntityOwnerFilter`

**Extends:** **EntityFilter**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **singleEntity** | **AliasEntityId** |  | [optional] |
| **defaultStateEntity** | **AliasEntityId** |  | [optional] |



## Referenced Types

#### EntityFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | String |  |  |

#### AliasEntityId
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| entityType | String | Entity type: an EntityType value, or an AliasEntityType value resolved for the current user |  |
| id | UUID | ID of the entity, time-based UUID v1. Required for an entity type; for CURRENT_CUSTOMER, the customer used when the current user does not belong to one | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

