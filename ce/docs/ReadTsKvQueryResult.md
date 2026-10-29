
# ReadTsKvQueryResult

`org.thingsboard.client.model.ReadTsKvQueryResult`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **queryId** | **Integer** |  | [optional] |
| **data** | **List\<TsKvEntry\>** |  | [optional] |
| **lastEntryTs** | **Long** |  | [optional] |



## Referenced Types

#### TsKvEntry
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| ts | Long |  | [optional] |
| value | Object |  | [optional] |
| key | String |  | [optional] |
| doubleValue | Double |  | [optional] |
| longValue | Long |  | [optional] |
| booleanValue | Boolean |  | [optional] |
| valueAsString | String |  | [optional] |
| dataType | DataType |  | [optional] |
| jsonValue | String |  | [optional] |
| strValue | String |  | [optional] |
| version | Long |  | [optional] |

#### DataType (enum)
`BOOLEAN` | `LONG` | `DOUBLE` | `STRING` | `JSON`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

