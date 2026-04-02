
# ResourceExportData

`org.thingsboard.client.model.ResourceExportData`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **link** | **String** |  | [optional] |
| **title** | **String** |  | [optional] |
| **type** | **ResourceType** |  | [optional] |
| **subType** | **ResourceSubType** |  | [optional] |
| **resourceKey** | **String** |  | [optional] |
| **fileName** | **String** |  | [optional] |
| **publicResourceKey** | **String** |  | [optional] |
| **mediaType** | **String** |  | [optional] |
| **data** | **String** |  | [optional] |
| **isPublic** | **Boolean** |  | [optional] |
| **_public** | **Boolean** |  | [optional] |



## Referenced Types

#### ResourceType (enum)
`LWM2_M_MODEL` | `JKS` | `PKCS_12` | `JS_MODULE` | `IMAGE` | `DASHBOARD` | `GENERAL`

#### ResourceSubType (enum)
`IMAGE` | `SCADA_SYMBOL` | `EXTENSION` | `MODULE`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

