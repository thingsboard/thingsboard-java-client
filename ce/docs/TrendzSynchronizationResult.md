
# TrendzSynchronizationResult

`org.thingsboard.client.model.TrendzSynchronizationResult`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **version** | **String** |  | [optional] |
| **updatedTs** | **Long** |  | [optional] |
| **type** | **TrendzSynchronizationResultType** |  | [optional] |
| **status** | **TrendzSynchronizationStatus** |  | [optional] |



## Referenced Types

#### TrendzSynchronizationResultType (enum)
`SYNC_NOT_INITIALIZED` | `SYNC_COMPLETED` | `SYNC_DISABLED` | `TRENDZ_UNSUPPORTED_VERSION` | `TRENDZ_AUTH_INVALID` | `TRENDZ_URL_UNREACHABLE` | `TB_URL_MISMATCH` | `TB_URL_UNREACHABLE` | `TB_AUTH_INVALID` | `SYNC_INTERNAL_ERROR`

#### TrendzSynchronizationStatus (enum)
`NOT_AVAILABLE` | `AVAILABLE` | `SYNCED`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

