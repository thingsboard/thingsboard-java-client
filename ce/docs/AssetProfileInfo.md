
# AssetProfileInfo

`org.thingsboard.client.model.AssetProfileInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **AssetProfileId** | JSON object with the Asset Profile Id. | [optional] |
| **name** | **String** | Entity Name | [optional] |
| **image** | **String** | Either URL or Base64 data of the icon. Used in the mobile application to visualize set of asset profiles in the grid view.  | [optional] |
| **defaultDashboardId** | **DashboardId** | Reference to the dashboard. Used in the mobile application to open the default dashboard when user navigates to asset details. | [optional] |
| **tenantId** | **TenantId** | Tenant id. | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

