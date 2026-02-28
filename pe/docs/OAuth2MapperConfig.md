
# OAuth2MapperConfig

`org.thingsboard.client.model.OAuth2MapperConfig`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **allowUserCreation** | **Boolean** | Whether user should be created if not yet present on the platform after successful authentication | [optional] |
| **activateUser** | **Boolean** | Whether user credentials should be activated when user is created after successful authentication | [optional] |
| **type** | **MapperType** | Type of OAuth2 mapper. Depending on this param, different mapper config fields must be specified | |
| **basic** | **OAuth2BasicMapperConfig** | Mapper config for BASIC and GITHUB mapper types | [optional] |
| **custom** | **OAuth2CustomMapperConfig** | Mapper config for CUSTOM mapper type | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

