
# DashboardPage

`org.thingsboard.client.model.DashboardPage`

**Extends:** **MobilePage**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **label** | **String** | Page label | [optional] |
| **icon** | **String** | URL of the page icon | [optional] |
| **dashboardId** | **String** | Dashboard id | [optional] |



## Referenced Types

#### MobilePage
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| type | MobilePageType |  |  |
| visible | Boolean |  | [optional] |

#### CustomMobilePage  *(extends MobilePage, type=`CUSTOM`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| label | String | Page label | [optional] |
| icon | String | URL of the page icon | [optional] |
| path | String | Path to custom page | [optional] |

#### DefaultMobilePage  *(extends MobilePage, type=`DEFAULT`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| label | String | Page label | [optional] |
| icon | String | URL of the page icon | [optional] |
| id | DefaultPageId | Identifier for default page | [optional] |

#### WebViewPage  *(extends MobilePage, type=`WEB_VIEW`)*
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| label | String | Page label | [optional] |
| icon | String | URL of the page icon | [optional] |
| url | String | Url | [optional] |

#### MobilePageType (enum)
`DEFAULT` | `DASHBOARD` | `WEB_VIEW` | `CUSTOM`

#### DefaultPageId (enum)
`HOME` | `ALARMS` | `DEVICES` | `CUSTOMERS` | `ASSETS` | `AUDIT_LOGS` | `NOTIFICATIONS` | `DEVICE_LIST` | `DASHBOARDS`

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

