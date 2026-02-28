# TenantProfileControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTenantProfile**](TenantProfileControllerApi.md#deleteTenantProfile) | **DELETE** /api/tenantProfile/{tenantProfileId} | Delete Tenant Profile (deleteTenantProfile) |
| [**getDefaultTenantProfileInfo**](TenantProfileControllerApi.md#getDefaultTenantProfileInfo) | **GET** /api/tenantProfileInfo/default | Get default Tenant Profile Info (getDefaultTenantProfileInfo) |
| [**getTenantProfileById**](TenantProfileControllerApi.md#getTenantProfileById) | **GET** /api/tenantProfile/{tenantProfileId} | Get Tenant Profile (getTenantProfileById) |
| [**getTenantProfileInfoById**](TenantProfileControllerApi.md#getTenantProfileInfoById) | **GET** /api/tenantProfileInfo/{tenantProfileId} | Get Tenant Profile Info (getTenantProfileInfoById) |
| [**getTenantProfileInfos**](TenantProfileControllerApi.md#getTenantProfileInfos) | **GET** /api/tenantProfileInfos | Get Tenant Profiles Info (getTenantProfileInfos) |
| [**getTenantProfileList**](TenantProfileControllerApi.md#getTenantProfileList) | **GET** /api/tenantProfiles/list | Get Tenant Profile list (getTenantProfileList) |
| [**getTenantProfiles**](TenantProfileControllerApi.md#getTenantProfiles) | **GET** /api/tenantProfiles | Get Tenant Profiles (getTenantProfiles) |
| [**saveTenantProfile**](TenantProfileControllerApi.md#saveTenantProfile) | **POST** /api/tenantProfile | Create Or update Tenant Profile (saveTenantProfile) |
| [**setDefaultTenantProfile**](TenantProfileControllerApi.md#setDefaultTenantProfile) | **POST** /api/tenantProfile/{tenantProfileId}/default | Make tenant profile default (setDefaultTenantProfile) |



## deleteTenantProfile

> deleteTenantProfile(tenantProfileId)

Delete Tenant Profile (deleteTenantProfile)

Deletes the tenant profile. Referencing non-existing tenant profile Id will cause an error. Referencing profile that is used by the tenants will cause an error.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantProfileId** | **String**| A string value representing the tenant profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

null (empty response body)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getDefaultTenantProfileInfo

> EntityInfo getDefaultTenantProfileInfo()

Get default Tenant Profile Info (getDefaultTenantProfileInfo)

Fetch the default Tenant Profile Info object based. Tenant Profile Info is a lightweight object that contains only id and name of the profile.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

[**EntityInfo**](EntityInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getTenantProfileById

> TenantProfile getTenantProfileById(tenantProfileId)

Get Tenant Profile (getTenantProfileById)

Fetch the Tenant Profile object based on the provided Tenant Profile Id.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantProfileId** | **String**| A string value representing the tenant profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**TenantProfile**](TenantProfile.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getTenantProfileInfoById

> EntityInfo getTenantProfileInfoById(tenantProfileId)

Get Tenant Profile Info (getTenantProfileInfoById)

Fetch the Tenant Profile Info object based on the provided Tenant Profile Id. Tenant Profile Info is a lightweight object that contains only id and name of the profile.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantProfileId** | **String**| A string value representing the tenant profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**EntityInfo**](EntityInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getTenantProfileInfos

> PageDataEntityInfo getTenantProfileInfos(pageSize, page, textSearch, sortProperty, sortOrder)

Get Tenant Profiles Info (getTenantProfileInfos)

Returns a page of tenant profile info objects registered in the platform. Tenant Profile Info is a lightweight object that contains only id and name of the profile. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the tenant profile name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: id, name] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataEntityInfo**](PageDataEntityInfo.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getTenantProfileList

> List&lt;TenantProfile&gt; getTenantProfileList(ids)

Get Tenant Profile list (getTenantProfileList)

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ids** | [**List&lt;String&gt;**](String.md)| Comma-separated list of tenant profile ids | |

### Return type

[**List&lt;TenantProfile&gt;**](TenantProfile.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## getTenantProfiles

> PageDataTenantProfile getTenantProfiles(pageSize, page, textSearch, sortProperty, sortOrder)

Get Tenant Profiles (getTenantProfiles)

Returns a page of tenant profiles registered in the platform. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the tenant profile name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, description, isDefault] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataTenantProfile**](PageDataTenantProfile.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## saveTenantProfile

> TenantProfile saveTenantProfile(tenantProfile)

Create Or update Tenant Profile (saveTenantProfile)

Create or update the Tenant Profile. When creating tenant profile, platform generates Tenant Profile Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Tenant Profile Id will be present in the response. Specify existing Tenant Profile Id id to update the Tenant Profile. Referencing non-existing Tenant Profile Id will cause &#39;Not Found&#39; error.   Update of the tenant profile configuration will cause immediate recalculation of API limits for all affected Tenants.   The **&#39;profileData&#39;** object is the part of Tenant Profile that defines API limits and Rate limits.   You have an ability to define maximum number of devices (&#39;maxDevice&#39;), assets (&#39;maxAssets&#39;) and other entities. You may also define maximum number of messages to be processed per month (&#39;maxTransportMessages&#39;, &#39;maxREExecutions&#39;, etc). The &#39;*RateLimit&#39; defines the rate limits using simple syntax. For example, &#39;1000:1,20000:60&#39; means up to 1000 events per second but no more than 20000 event per minute. Let&#39;s review the example of tenant profile data below:   &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Your name\&quot;,   \&quot;description\&quot;: \&quot;Your description\&quot;,   \&quot;isolatedTbRuleEngine\&quot;: false,   \&quot;profileData\&quot;: {     \&quot;configuration\&quot;: {       \&quot;type\&quot;: \&quot;DEFAULT\&quot;,       \&quot;maxDevices\&quot;: 0,       \&quot;maxAssets\&quot;: 0,       \&quot;maxCustomers\&quot;: 0,       \&quot;maxUsers\&quot;: 0,       \&quot;maxDashboards\&quot;: 0,       \&quot;maxRuleChains\&quot;: 0,       \&quot;maxResourcesInBytes\&quot;: 0,       \&quot;maxOtaPackagesInBytes\&quot;: 0,       \&quot;maxResourceSize\&quot;: 0,       \&quot;transportTenantMsgRateLimit\&quot;: \&quot;1000:1,20000:60\&quot;,       \&quot;transportTenantTelemetryMsgRateLimit\&quot;: \&quot;1000:1,20000:60\&quot;,       \&quot;transportTenantTelemetryDataPointsRateLimit\&quot;: \&quot;1000:1,20000:60\&quot;,       \&quot;transportDeviceMsgRateLimit\&quot;: \&quot;20:1,600:60\&quot;,       \&quot;transportDeviceTelemetryMsgRateLimit\&quot;: \&quot;20:1,600:60\&quot;,       \&quot;transportDeviceTelemetryDataPointsRateLimit\&quot;: \&quot;20:1,600:60\&quot;,       \&quot;transportGatewayMsgRateLimit\&quot;: \&quot;20:1,600:60\&quot;,       \&quot;transportGatewayTelemetryMsgRateLimit\&quot;: \&quot;20:1,600:60\&quot;,       \&quot;transportGatewayTelemetryDataPointsRateLimit\&quot;: \&quot;20:1,600:60\&quot;,       \&quot;transportGatewayDeviceMsgRateLimit\&quot;: \&quot;20:1,600:60\&quot;,       \&quot;transportGatewayDeviceTelemetryMsgRateLimit\&quot;: \&quot;20:1,600:60\&quot;,       \&quot;transportGatewayDeviceTelemetryDataPointsRateLimit\&quot;: \&quot;20:1,600:60\&quot;,       \&quot;maxTransportMessages\&quot;: 10000000,       \&quot;maxTransportDataPoints\&quot;: 10000000,       \&quot;maxREExecutions\&quot;: 4000000,       \&quot;maxJSExecutions\&quot;: 5000000,       \&quot;maxDPStorageDays\&quot;: 0,       \&quot;maxRuleNodeExecutionsPerMessage\&quot;: 50,       \&quot;maxDebugModeDurationMinutes\&quot;: 15,       \&quot;maxEmails\&quot;: 0,       \&quot;maxSms\&quot;: 0,       \&quot;maxCreatedAlarms\&quot;: 1000,       \&quot;defaultStorageTtlDays\&quot;: 0,       \&quot;alarmsTtlDays\&quot;: 0,       \&quot;rpcTtlDays\&quot;: 0,       \&quot;queueStatsTtlDays\&quot;: 0,       \&quot;ruleEngineExceptionsTtlDays\&quot;: 0,       \&quot;warnThreshold\&quot;: 0,       \&quot;maxCalculatedFieldsPerEntity\&quot;: 5,       \&quot;maxArgumentsPerCF\&quot;: 10,       \&quot;minAllowedScheduledUpdateIntervalInSecForCF\&quot;: 10,       \&quot;maxRelationLevelPerCfArgument\&quot;: 2,       \&quot;maxRelatedEntitiesToReturnPerCfArgument\&quot;: 100,       \&quot;maxDataPointsPerRollingArg\&quot;: 1000,       \&quot;maxStateSizeInKBytes\&quot;: 32,       \&quot;maxSingleValueArgumentSizeInKBytes\&quot;: 2,      \&quot;minAllowedDeduplicationIntervalInSecForCF\&quot;: 10,      \&quot;minAllowedAggregationIntervalInSecForCF\&quot;: 60,      \&quot;intermediateAggregationIntervalInSecForCF\&quot;: 300,      \&quot;cfReevaluationCheckInterval\&quot;: 60,      \&quot;alarmsReevaluationInterval\&quot;: 60    }   },   \&quot;default\&quot;: false } &#x60;&#x60;&#x60;Remove &#39;id&#39;, from the request body example (below) to create new Tenant Profile entity.  Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantProfile** | [**TenantProfile**](TenantProfile.md)|  | |

### Return type

[**TenantProfile**](TenantProfile.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## setDefaultTenantProfile

> TenantProfile setDefaultTenantProfile(tenantProfileId)

Make tenant profile default (setDefaultTenantProfile)

Makes specified tenant profile to be default. Referencing non-existing tenant profile Id will cause an error.   Available for users with &#39;SYS_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantProfileId** | **String**| A string value representing the tenant profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**TenantProfile**](TenantProfile.md)

### Authorization

[api_key_form](../README.md#api_key_form), [http_login_form](../README.md#http_login_form)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |

