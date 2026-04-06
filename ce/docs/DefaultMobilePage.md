
# DefaultMobilePage

`org.thingsboard.client.model.DefaultMobilePage`

**Extends:** **MobilePage**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **label** | **String** | Page label | [optional] |
| **icon** | **String** | URL of the page icon | [optional] |
| **id** | **DefaultPageId** | Identifier for default page | [optional] |



## Referenced Types

#### MobilePage
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | MobilePageType |  |  |
| visible | Boolean |  | [optional] |

#### DefaultPageId (enum)
`HOME` | `ALARMS` | `DEVICES` | `CUSTOMERS` | `ASSETS` | `AUDIT_LOGS` | `NOTIFICATIONS` | `DEVICE_LIST` | `DASHBOARDS`

#### MobilePageType (enum)
`DEFAULT` | `DASHBOARD` | `WEB_VIEW` | `CUSTOM`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

