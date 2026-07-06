# DashboardReportControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
File downloadDashboardReport(DownloadDashboardReportArgs args) // Download dashboard report (downloadDashboardReport)
File downloadTestReport(DownloadTestReportArgs args) // Download test report (downloadTestReport)
```


## downloadDashboardReport

**POST** `/api/report/{dashboardId}/download`

Download dashboard report (downloadDashboardReport)

Generate and download a report from the specified dashboard. The request payload is a JSON object with params of report. For example:  ```json {     \"type\": \"pdf\",     \"timezone\": \"Europe/Kiev\",     \"timewindow\": {         \"displayValue\": \"\",         \"hideInterval\": false,         \"hideLastInterval\": false,         \"hideQuickInterval\": false,         \"hideAggregation\": false,         \"hideAggInterval\": false,         \"hideTimezone\": false,         \"selectedTab\": 0,         \"realtime\": {             \"realtimeType\": 0,             \"interval\": 1000,             \"timewindowMs\": 60000,             \"quickInterval\": \"CURRENT_DAY\"         },         \"history\": {             \"historyType\": 0,             \"interval\": 1000,             \"timewindowMs\": 60000,             \"fixedTimewindow\": {                 \"startTimeMs\": 1703687976592,                 \"endTimeMs\": 1703774376592             },             \"quickInterval\": \"CURRENT_DAY\"         },         \"aggregation\": {             \"type\": \"AVG\",             \"limit\": 25000         }     },     \"state\": null } ```   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
File downloadDashboardReport(DownloadDashboardReportArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DownloadDashboardReportArgs.builder()
        .dashboardId(String)
        .body(Object)
        .build()
```

### `DownloadDashboardReportArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `dashboardId` | `String` | **yes** | A string value representing the dashboard id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `body` | `Object` | **yes** |  | |

### Return type

`File`


## downloadTestReport

**POST** `/api/report/test`

Download test report (downloadTestReport)

Generate and download test report.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.

```java
File downloadTestReport(DownloadTestReportArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DownloadTestReportArgs.builder()
        .dashboardReportConfig(DashboardReportConfig)
        .build()
```

### `DownloadTestReportArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `dashboardReportConfig` | `DashboardReportConfig` | **yes** |  | |
| `reportsServerEndpointUrl` | `String` | no | A string value representing the report server endpoint. | |

### Return type

`File`

