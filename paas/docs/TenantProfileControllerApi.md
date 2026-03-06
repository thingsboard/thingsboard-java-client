# TenantProfileControllerApi

`ThingsboardClient` methods:

```
void deleteTenantProfile(@Nonnull String tenantProfileId) // Delete Tenant Profile (deleteTenantProfile)
EntityInfo getDefaultTenantProfileInfo() // Get default Tenant Profile Info (getDefaultTenantProfileInfo)
TenantProfile getTenantProfileById(@Nonnull String tenantProfileId) // Get Tenant Profile (getTenantProfileById)
EntityInfo getTenantProfileInfoById(@Nonnull String tenantProfileId) // Get Tenant Profile Info (getTenantProfileInfoById)
PageDataEntityInfo getTenantProfileInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Tenant Profiles Info (getTenantProfileInfos)
List<TenantProfile> getTenantProfileList(@Nonnull List<String> ids) // Get Tenant Profile list (getTenantProfileList)
PageDataTenantProfile getTenantProfiles(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder) // Get Tenant Profiles (getTenantProfiles)
TenantProfile saveTenantProfile(@Nonnull TenantProfile tenantProfile) // Create Or update Tenant Profile (saveTenantProfile)
TenantProfile setDefaultTenantProfile(@Nonnull String tenantProfileId) // Make tenant profile default (setDefaultTenantProfile)
```


## deleteTenantProfile

```
void deleteTenantProfile(@Nonnull String tenantProfileId)
```

**DELETE** `/api/tenantProfile/{tenantProfileId}`

Delete Tenant Profile (deleteTenantProfile)

Deletes the tenant profile. Referencing non-existing tenant profile Id will cause an error. Referencing profile that is used by the tenants will cause an error.   Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantProfileId** | **String** | A string value representing the tenant profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getDefaultTenantProfileInfo

```
EntityInfo getDefaultTenantProfileInfo()
```

**GET** `/api/tenantProfileInfo/default`

Get default Tenant Profile Info (getDefaultTenantProfileInfo)

Fetch the default Tenant Profile Info object based. Tenant Profile Info is a lightweight object that contains only id and name of the profile.   Available for users with 'SYS_ADMIN' authority.

### Return type

**EntityInfo**


## getTenantProfileById

```
TenantProfile getTenantProfileById(@Nonnull String tenantProfileId)
```

**GET** `/api/tenantProfile/{tenantProfileId}`

Get Tenant Profile (getTenantProfileById)

Fetch the Tenant Profile object based on the provided Tenant Profile Id.   Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantProfileId** | **String** | A string value representing the tenant profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**TenantProfile**


## getTenantProfileInfoById

```
EntityInfo getTenantProfileInfoById(@Nonnull String tenantProfileId)
```

**GET** `/api/tenantProfileInfo/{tenantProfileId}`

Get Tenant Profile Info (getTenantProfileInfoById)

Fetch the Tenant Profile Info object based on the provided Tenant Profile Id. Tenant Profile Info is a lightweight object that contains only id and name of the profile.   Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantProfileId** | **String** | A string value representing the tenant profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**EntityInfo**


## getTenantProfileInfos

```
PageDataEntityInfo getTenantProfileInfos(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/tenantProfileInfos`

Get Tenant Profiles Info (getTenantProfileInfos)

Returns a page of tenant profile info objects registered in the platform. Tenant Profile Info is a lightweight object that contains only id and name of the profile. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the tenant profile name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: id, name] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityInfo**


## getTenantProfileList

```
List<TenantProfile> getTenantProfileList(@Nonnull List<String> ids)
```

**GET** `/api/tenantProfiles/list`

Get Tenant Profile list (getTenantProfileList)


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ids** | **List<String>** | Comma-separated list of tenant profile ids | |

### Return type

**List<TenantProfile>**


## getTenantProfiles

```
PageDataTenantProfile getTenantProfiles(@Nonnull Integer pageSize, @Nonnull Integer page, @Nullable String textSearch, @Nullable String sortProperty, @Nullable String sortOrder)
```

**GET** `/api/tenantProfiles`

Get Tenant Profiles (getTenantProfiles)

Returns a page of tenant profiles registered in the platform. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the tenant profile name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, description, isDefault] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataTenantProfile**


## saveTenantProfile

```
TenantProfile saveTenantProfile(@Nonnull TenantProfile tenantProfile)
```

**POST** `/api/tenantProfile`

Create Or update Tenant Profile (saveTenantProfile)

Create or update the Tenant Profile. When creating tenant profile, platform generates Tenant Profile Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Tenant Profile Id will be present in the response. Specify existing Tenant Profile Id id to update the Tenant Profile. Referencing non-existing Tenant Profile Id will cause 'Not Found' error.   Update of the tenant profile configuration will cause immediate recalculation of API limits for all affected Tenants.   The **'profileData'** object is the part of Tenant Profile that defines API limits and Rate limits.   You have an ability to define maximum number of devices ('maxDevice'), assets ('maxAssets') and other entities. You may also define maximum number of messages to be processed per month ('maxTransportMessages', 'maxREExecutions', etc). The '*RateLimit' defines the rate limits using simple syntax. For example, '1000:1,20000:60' means up to 1000 events per second but no more than 20000 event per minute. Let's review the example of tenant profile data below:   ```json {   \"name\": \"Your name\",   \"description\": \"Your description\",   \"isolatedTbRuleEngine\": false,   \"profileData\": {     \"configuration\": {       \"type\": \"DEFAULT\",       \"maxDevices\": 0,       \"maxAssets\": 0,       \"maxCustomers\": 0,       \"maxUsers\": 0,       \"maxDashboards\": 0,       \"maxRuleChains\": 0,       \"maxResourcesInBytes\": 0,       \"maxOtaPackagesInBytes\": 0,       \"maxResourceSize\": 0,       \"transportTenantMsgRateLimit\": \"1000:1,20000:60\",       \"transportTenantTelemetryMsgRateLimit\": \"1000:1,20000:60\",       \"transportTenantTelemetryDataPointsRateLimit\": \"1000:1,20000:60\",       \"transportDeviceMsgRateLimit\": \"20:1,600:60\",       \"transportDeviceTelemetryMsgRateLimit\": \"20:1,600:60\",       \"transportDeviceTelemetryDataPointsRateLimit\": \"20:1,600:60\",       \"transportGatewayMsgRateLimit\": \"20:1,600:60\",       \"transportGatewayTelemetryMsgRateLimit\": \"20:1,600:60\",       \"transportGatewayTelemetryDataPointsRateLimit\": \"20:1,600:60\",       \"transportGatewayDeviceMsgRateLimit\": \"20:1,600:60\",       \"transportGatewayDeviceTelemetryMsgRateLimit\": \"20:1,600:60\",       \"transportGatewayDeviceTelemetryDataPointsRateLimit\": \"20:1,600:60\",       \"integrationMsgsPerTenantRateLimit\": \"20:1,600:60\",       \"integrationMsgsPerDeviceRateLimit\": \"20:1,600:60\",       \"integrationMsgsPerAssetRateLimit\": \"20:1,600:60\",       \"maxTransportMessages\": 10000000,       \"maxTransportDataPoints\": 10000000,       \"maxREExecutions\": 4000000,       \"maxJSExecutions\": 5000000,       \"maxDPStorageDays\": 0,       \"maxRuleNodeExecutionsPerMessage\": 50,       \"maxDebugModeDurationMinutes\": 15,       \"maxEmails\": 0,       \"maxSms\": 0,       \"maxCreatedAlarms\": 1000,       \"defaultStorageTtlDays\": 0,       \"alarmsTtlDays\": 0,       \"rpcTtlDays\": 0,       \"queueStatsTtlDays\": 0,       \"ruleEngineExceptionsTtlDays\": 0,       \"blobEntityTtlDays\": 0,       \"warnThreshold\": 0,       \"maxCalculatedFieldsPerEntity\": 100,       \"maxArgumentsPerCF\": 10,       \"minAllowedScheduledUpdateIntervalInSecForCF\": 10,       \"maxRelationLevelPerCfArgument\": 2,       \"maxRelatedEntitiesToReturnPerCfArgument\": 1000,       \"maxDataPointsPerRollingArg\": 1000,       \"maxStateSizeInKBytes\": 512,       \"maxSingleValueArgumentSizeInKBytes\": 32,      \"minAllowedDeduplicationIntervalInSecForCF\": 10,      \"minAllowedAggregationIntervalInSecForCF\": 60,      \"intermediateAggregationIntervalInSecForCF\": 300,      \"cfReevaluationCheckInterval\": 60,      \"alarmsReevaluationInterval\": 60    }   },   \"default\": false } ```Remove 'id', from the request body example (below) to create new Tenant Profile entity.  Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantProfile** | **TenantProfile** |  | |

### Return type

**TenantProfile**


## setDefaultTenantProfile

```
TenantProfile setDefaultTenantProfile(@Nonnull String tenantProfileId)
```

**POST** `/api/tenantProfile/{tenantProfileId}/default`

Make tenant profile default (setDefaultTenantProfile)

Makes specified tenant profile to be default. Referencing non-existing tenant profile Id will cause an error.   Available for users with 'SYS_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantProfileId** | **String** | A string value representing the tenant profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**TenantProfile**

