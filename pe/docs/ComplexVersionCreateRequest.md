
# ComplexVersionCreateRequest

`org.thingsboard.client.model.ComplexVersionCreateRequest`

**Extends:** **VersionCreateRequest**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **syncStrategy** | **SyncStrategy** |  | [optional] |
| **entityTypes** | **Map\<String, EntityTypeVersionCreateConfig\>** |  | [optional] |



## Referenced Types

#### VersionCreateRequest
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| versionName | String |  | [optional] |
| branch | String |  | [optional] |
| type | VersionCreateRequestType | Type of the version to create |  |

#### SyncStrategy (enum)
`MERGE` | `OVERWRITE`

#### EntityTypeVersionCreateConfig
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| saveRelations | Boolean |  | [optional] |
| saveAttributes | Boolean |  | [optional] |
| saveCredentials | Boolean |  | [optional] |
| saveCalculatedFields | Boolean |  | [optional] |
| savePermissions | Boolean |  | [optional] |
| saveGroupEntities | Boolean |  | [optional] |
| syncStrategy | SyncStrategy |  | [optional] |
| entityIds | List<UUID> |  | [optional] |
| allEntities | Boolean |  | [optional] |

#### VersionCreateRequestType (enum)
`SINGLE_ENTITY` | `COMPLEX`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

