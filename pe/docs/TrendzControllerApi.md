# TrendzControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
TrendzSynchronizationResult connectToTrendz() // Connect to Trendz (connectToTrendz)
TrendzConfiguration getTrendzConfig() // Get Trendz configuration (getTrendzConfig)
TrendzSynchronizationResult getTrendzSyncResult() // Get Trendz synchronization result (getTrendzSyncResult)
TrendzHealthcheckResult performTrendzHealthcheck() // Perform Trendz healthcheck (performTrendzHealthcheck)
void publicConnectToTrendz() // Public connect to Trendz (publicConnectToTrendz)
TrendzConfiguration saveTrendzConfig(SaveTrendzConfigArgs args) // Save Trendz configuration (saveTrendzConfig)
```


## connectToTrendz

**POST** `/api/trendz/connect`

Connect to Trendz (connectToTrendz)

Initiates synchronization with Trendz (Connect button action). Uses Trendz configuration from settings or falls back to environment variables. Generates API key, saves configuration, checks Trendz version, and performs initial sync.   Available for users with 'SYS_ADMIN' authority.

```java
TrendzSynchronizationResult connectToTrendz()
```

### Return type

`TrendzSynchronizationResult`


## getTrendzConfig

**GET** `/api/trendz/config`

Get Trendz configuration (getTrendzConfig)

Retrieves Trendz configuration (URLs). Returns trendzUrl and tbUrl.  Available for users with 'SYS_ADMIN' authority.

```java
TrendzConfiguration getTrendzConfig()
```

### Return type

`TrendzConfiguration`


## getTrendzSyncResult

**GET** `/api/trendz/sync`

Get Trendz synchronization result (getTrendzSyncResult)

Retrieves Trendz synchronization result and status. Returns trendzVersion, updatedTs, resultType, and status.  Available for any authorized user. 

```java
TrendzSynchronizationResult getTrendzSyncResult()
```

### Return type

`TrendzSynchronizationResult`


## performTrendzHealthcheck

**GET** `/api/trendz/healthcheck`

Perform Trendz healthcheck (performTrendzHealthcheck)

Performs healthcheck for Trendz integration. Returns version, type, status, and message. Can only be performed if Trendz is already synchronized and integration is enabled.  Available for any authorized user. 

```java
TrendzHealthcheckResult performTrendzHealthcheck()
```

### Return type

`TrendzHealthcheckResult`


## publicConnectToTrendz

**POST** `/api/trendz/public/connect`

Public connect to Trendz (publicConnectToTrendz)

Initiates synchronization with Trendz if Trendz is not synced yet. Uses Trendz configuration from settings or falls back to environment variables. Generates API key, saves configuration, checks Trendz version, and performs initial sync.

```java
void publicConnectToTrendz()
```

### Return type

null (empty response body)


## saveTrendzConfig

**POST** `/api/trendz/config`

Save Trendz configuration (saveTrendzConfig)

Saves Trendz configuration (URLs only, without triggering synchronization). Request body example: ```json {   \"trendzUrl\": \"https://trendz.domain.com\",   \"tbUrl\": \"https://thingsboard.domain.com\" } ```  Available for users with 'SYS_ADMIN' authority.

```java
TrendzConfiguration saveTrendzConfig(SaveTrendzConfigArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveTrendzConfigArgs.builder()
        .trendzConfiguration(TrendzConfiguration)
        .build()
```

### `SaveTrendzConfigArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `trendzConfiguration` | `TrendzConfiguration` | **yes** |  | |

### Return type

`TrendzConfiguration`

