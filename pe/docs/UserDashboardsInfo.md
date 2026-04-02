
# UserDashboardsInfo

`org.thingsboard.client.model.UserDashboardsInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **last** | **List\<LastVisitedDashboardInfo\>** | List of last visited dashboards. | [optional] |
| **starred** | **List\<StarredDashboardInfo\>** | List of starred dashboards. | [optional] |



## Referenced Types

#### LastVisitedDashboardInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | UUID | JSON object with Dashboard id. | [optional] [readonly] |
| title | String | Title of the dashboard. | [optional] |
| starred | Boolean | Starred flag | [optional] |
| lastVisited | Long | Last visit timestamp | [optional] |

#### StarredDashboardInfo
| Name | Type | Description | Notes |
|------|------|-------------|-------|
| id | UUID | JSON object with Dashboard id. | [optional] [readonly] |
| title | String | Title of the dashboard. | [optional] |
| starredAt | Long | Starred timestamp | [optional] |

---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

