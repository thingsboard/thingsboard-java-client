
# ErrorComponentAllOfException

`org.thingsboard.client.model.ErrorComponentAllOfException`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **cause** | **ErrorComponentAllOfExceptionCause** |  | [optional] |
| **stackTrace** | **List\<ErrorComponentAllOfExceptionCauseStackTrace\>** |  | [optional] |
| **message** | **String** |  | [optional] |
| **suppressed** | **List\<ErrorComponentAllOfExceptionCause\>** |  | [optional] |
| **localizedMessage** | **String** |  | [optional] |



## Referenced Types

#### ErrorComponentAllOfExceptionCause
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| stackTrace | List<ErrorComponentAllOfExceptionCauseStackTrace> |  | [optional] |
| message | String |  | [optional] |
| localizedMessage | String |  | [optional] |

#### ErrorComponentAllOfExceptionCauseStackTrace
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| classLoaderName | String |  | [optional] |
| moduleName | String |  | [optional] |
| moduleVersion | String |  | [optional] |
| methodName | String |  | [optional] |
| fileName | String |  | [optional] |
| lineNumber | Integer |  | [optional] |
| nativeMethod | Boolean |  | [optional] |
| className | String |  | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

