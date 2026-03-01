
# SolutionInstallResponse

`org.thingsboard.client.model.SolutionInstallResponse`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **dashboardGroupId** | **EntityGroupId** | Id of the group that contains main dashboard of the solution | [optional] |
| **dashboardId** | **DashboardId** | Id of the main dashboard of the solution | [optional] |
| **publicId** | **CustomerId** | Id of the public customer if solution has public entities | [optional] |
| **mainDashboardPublic** | **Boolean** | Is the main dashboard public | [optional] |
| **details** | **String** | Markdown with solution usage instructions | [optional] |
| **success** | **Boolean** | Indicates that template was installed successfully | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

