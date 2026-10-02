
# DashboardReportConfig

`org.thingsboard.client.model.DashboardReportConfig`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **baseUrl** | **String** | Base URL of ThingsBoard UI that should be accessible by Web Report Server. | |
| **dashboardId** | **String** | A string value representing the dashboard id. | |
| **state** | **String** | Target dashboard state for dashboard report generation. | [optional] |
| **timezone** | **String** | Timezone in which target dashboard will be presented in dashboard report. | |
| **useDashboardTimewindow** | **Boolean** | If set, timewindow configured in the target dashboard will be used during dashboard report generation. | [optional] |
| **timewindow** | **com.fasterxml.jackson.databind.JsonNode** | Specific dashboard timewindow that will be used during dashboard report generation. | [optional] |
| **namePattern** | **String** | If set, timewindow configured in the target dashboard will be used during dashboard report generation. | |
| **type** | **String** | Dashboard report file type, can be PDF | PNG | JPEG. | [optional] |
| **useCurrentUserCredentials** | **Boolean** | If set, credentials of user created this dashboard report configuration will be used to open dashboard UI during dashboard report generation. | [optional] |
| **userId** | **String** | A string value representing the user id. | |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

