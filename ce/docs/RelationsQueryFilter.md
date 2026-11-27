
# RelationsQueryFilter

`org.thingsboard.client.model.RelationsQueryFilter`

**Extends:** **EntityFilter**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **rootEntity** | **AliasEntityId** |  | [optional] |
| **multiRoot** | **Boolean** |  | [optional] |
| **multiRootEntitiesType** | **EntityType** |  | [optional] |
| **multiRootEntityIds** | **Set\<String\>** |  | [optional] |
| **direction** | **EntitySearchDirection** |  | [optional] |
| **filters** | **List\<RelationEntityTypeFilter\>** |  | [optional] |
| **maxLevel** | **Integer** |  | [optional] |
| **fetchLastLevelOnly** | **Boolean** |  | [optional] |
| **negate** | **Boolean** |  | [optional] |
| **rootStateEntity** | **Boolean** |  | [optional] |
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

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (53 values total)

#### EntitySearchDirection (enum)
`FROM` | `TO`

#### RelationEntityTypeFilter
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| relationType | String | Type of the relation between root entity and other entity (e.g. 'Contains' or 'Manages'). | [optional] |
| entityTypes | List<EntityType> | Array of entity types to filter the related entities (e.g. 'DEVICE', 'ASSET'). | [optional] |
| negate | Boolean | Negate relation type between root entity and other entity. | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

