# TrendzControllerApi

`ThingsboardClient` methods:

```
TrendzSynchronizationResult connectToTrendz() // Connect to Trendz (connectToTrendz)
TrendzConfiguration getTrendzConfig() // Get Trendz configuration (getTrendzConfig)
TrendzSynchronizationResult getTrendzSyncResult() // Get Trendz synchronization result (getTrendzSyncResult)
TrendzHealthcheckResult performTrendzHealthcheck() // Perform Trendz healthcheck (performTrendzHealthcheck)
void publicConnectToTrendz() // Public connect to Trendz (publicConnectToTrendz)
TrendzConfiguration saveTrendzConfig(@Nonnull TrendzConfiguration trendzConfiguration) // Save Trendz configuration (saveTrendzConfig)
```


## connectToTrendz

```
TrendzSynchronizationResult connectToTrendz()
```

**POST** `/api/trendz/connect`

Connect to Trendz (connectToTrendz)

Initiates synchronization with Trendz (Connect button action). Uses Trendz configuration from settings or falls back to environment variables. Generates API key, saves configuration, checks Trendz version, and performs initial sync.   Available for users with 'SYS_ADMIN' authority.

### Return type

**TrendzSynchronizationResult**


## getTrendzConfig

```
TrendzConfiguration getTrendzConfig()
```

**GET** `/api/trendz/config`

Get Trendz configuration (getTrendzConfig)

Retrieves Trendz configuration (URLs). Returns trendzUrl and tbUrl.  Available for users with 'SYS_ADMIN' authority.

### Return type

**TrendzConfiguration**


## getTrendzSyncResult

```
TrendzSynchronizationResult getTrendzSyncResult()
```

**GET** `/api/trendz/sync`

Get Trendz synchronization result (getTrendzSyncResult)

Retrieves Trendz synchronization result and status. Returns trendzVersion, updatedTs, resultType, and status.  Available for any authorized user. 

### Return type

**TrendzSynchronizationResult**


## performTrendzHealthcheck

```
TrendzHealthcheckResult performTrendzHealthcheck()
```

**GET** `/api/trendz/healthcheck`

Perform Trendz healthcheck (performTrendzHealthcheck)

Performs healthcheck for Trendz integration. Returns version, type, status, and message. Can only be performed if Trendz is already synchronized and integration is enabled.  Available for any authorized user. 

### Return type

**TrendzHealthcheckResult**


## publicConnectToTrendz

```
void publicConnectToTrendz()
```

**POST** `/api/trendz/public/connect`

Public connect to Trendz (publicConnectToTrendz)

Initiates synchronization with Trendz if Trendz is not synced yet. Uses Trendz configuration from settings or falls back to environment variables. Generates API key, saves configuration, checks Trendz version, and performs initial sync.

### Return type

null (empty response body)


## saveTrendzConfig

```
TrendzConfiguration saveTrendzConfig(@Nonnull TrendzConfiguration trendzConfiguration)
```

**POST** `/api/trendz/config`

Save Trendz configuration (saveTrendzConfig)

Saves Trendz configuration (URLs only, without triggering synchronization). Request body example: ```json {   \"trendzUrl\": \"https://trendz.domain.com\",   \"tbUrl\": \"https://thingsboard.domain.com\" } ```  Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **trendzConfiguration** | **TrendzConfiguration** |  | |

### Return type

**TrendzConfiguration**

