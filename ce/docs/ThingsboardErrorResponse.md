
# ThingsboardErrorResponse

`org.thingsboard.client.model.ThingsboardErrorResponse`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **errorCode** | **ThingsboardErrorCode** |  | [optional] |
| **message** | **String** | Error message | [optional] [readonly] |
| **status** | **Integer** | HTTP Response Status Code | [optional] [readonly] |
| **timestamp** | **Long** | Timestamp | [optional] [readonly] |



## Referenced Types

#### ThingsboardErrorCode (enum)
`NUMBER_2` | `NUMBER_10` | `NUMBER_11` | `NUMBER_15` | `NUMBER_20` | `NUMBER_30` | `NUMBER_31` | `NUMBER_32` | `NUMBER_33` | `NUMBER_34` | … (15 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

