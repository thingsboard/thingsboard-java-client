
# SystemVersionInfo

`org.thingsboard.client.model.SystemVersionInfo`

Version and edition of the platform build

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **version** | **String** | Platform version, or 'unknown' when the build information is not available | |
| **artifact** | **String** | Build artifact; absent when the build information is not available | [optional] |
| **name** | **String** | Build name; absent when the build information is not available | [optional] |
| **type** | **String** | Platform edition | |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

