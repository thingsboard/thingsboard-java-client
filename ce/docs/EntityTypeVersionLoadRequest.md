
# EntityTypeVersionLoadRequest

`org.thingsboard.client.model.EntityTypeVersionLoadRequest`

**Extends:** **VersionLoadRequest**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **entityTypes** | **Map\<String, EntityTypeVersionLoadConfig\>** |  | [optional] |
| **rollbackOnError** | **Boolean** |  | [optional] |



## Referenced Types

#### VersionLoadRequest
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| versionId | String |  | [optional] |
| type | VersionLoadRequestType | Type of the version to load |  |

#### EntityTypeVersionLoadConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| loadRelations | Boolean |  | [optional] |
| loadAttributes | Boolean |  | [optional] |
| loadCredentials | Boolean |  | [optional] |
| loadCalculatedFields | Boolean |  | [optional] |
| removeOtherEntities | Boolean |  | [optional] |
| findExistingEntityByName | Boolean |  | [optional] |

#### VersionLoadRequestType (enum)
`SINGLE_ENTITY` | `ENTITY_TYPE`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

