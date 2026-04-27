
# ErrorComponentAllOfExceptionCause

`org.thingsboard.client.model.ErrorComponentAllOfExceptionCause`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **stackTrace** | **List\<ErrorComponentAllOfExceptionCauseStackTrace\>** |  | [optional] |
| **message** | **String** |  | [optional] |
| **localizedMessage** | **String** |  | [optional] |



## Referenced Types

#### ErrorComponentAllOfExceptionCauseStackTrace
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| classLoaderName | String |  | [optional] |
| moduleName | String |  | [optional] |
| moduleVersion | String |  | [optional] |
| methodName | String |  | [optional] |
| fileName | String |  | [optional] |
| lineNumber | Integer |  | [optional] |
| className | String |  | [optional] |
| nativeMethod | Boolean |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

