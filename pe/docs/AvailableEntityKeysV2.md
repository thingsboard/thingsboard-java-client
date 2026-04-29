
# AvailableEntityKeysV2

`org.thingsboard.client.model.AvailableEntityKeysV2`

Contains unique time series and attribute key names discovered from entities matching a query, optionally including a sample value for each key.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **totalEntities** | **Integer** | Total number of entities that matched the query filter. | |
| **entityTypes** | **Set\<EntityType\>** | Set of entity types found among the matched entities. | |
| **timeseries** | **List\<KeyInfo\>** |  | [optional] |
| **attributes** | **Map\<String, List<KeyInfo>\>** | Map of attribute scope to the list of unique attribute keys available on the matched entities. Only scopes supported by the matched entity types are included. Omitted when attribute keys were not requested or when none of the requested scopes apply to the matched entity types. | [optional] |



## Referenced Types

#### EntityType (enum)
`TENANT` | `CUSTOMER` | `USER` | `DASHBOARD` | `ASSET` | `DEVICE` | `ALARM` | `ENTITY_GROUP` | `CONVERTER` | `INTEGRATION` | … (46 values total)

#### KeyInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| key | String | Key name. |  |
| sample | KeySample | Most recent sample value for this key across the matched entities. Omitted when samples were not requested. | [optional] |

#### KeySample
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| ts | Long | Timestamp in milliseconds since epoch. |  |
| value | Object |  |  |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

