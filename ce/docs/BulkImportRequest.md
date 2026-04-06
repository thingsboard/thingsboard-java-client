
# BulkImportRequest

`org.thingsboard.client.model.BulkImportRequest`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **_file** | **String** |  | [optional] |
| **mapping** | **Mapping** |  | [optional] |



## Referenced Types

#### Mapping
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| columns | List<ColumnMapping> |  | [optional] |
| delimiter | String |  | [optional] |
| update | Boolean |  | [optional] |
| header | Boolean |  | [optional] |

#### ColumnMapping
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | BulkImportColumnType |  | [optional] |
| key | String |  | [optional] |

#### BulkImportColumnType (enum)
`NAME` | `TYPE` | `LABEL` | `SHARED_ATTRIBUTE` | `SERVER_ATTRIBUTE` | `TIMESERIES` | `ACCESS_TOKEN` | `X509` | `MQTT_CLIENT_ID` | `MQTT_USER_NAME` | … (30 values total)

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

