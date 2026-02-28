# DeviceControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignDeviceToCustomer**](DeviceControllerApi.md#assignDeviceToCustomer) | **POST** /api/customer/{customerId}/device/{deviceId} | Assign device to customer (assignDeviceToCustomer) |
| [**assignDeviceToEdge**](DeviceControllerApi.md#assignDeviceToEdge) | **POST** /api/edge/{edgeId}/device/{deviceId} | Assign device to edge (assignDeviceToEdge) |
| [**assignDeviceToPublicCustomer**](DeviceControllerApi.md#assignDeviceToPublicCustomer) | **POST** /api/customer/public/device/{deviceId} | Make device publicly available (assignDeviceToPublicCustomer) |
| [**assignDeviceToTenant**](DeviceControllerApi.md#assignDeviceToTenant) | **POST** /api/tenant/{tenantId}/device/{deviceId} | Assign device to tenant (assignDeviceToTenant) |
| [**claimDevice1**](DeviceControllerApi.md#claimDevice1) | **POST** /api/customer/device/{deviceName}/claim | Claim device (claimDevice) |
| [**countByDeviceProfileAndEmptyOtaPackage**](DeviceControllerApi.md#countByDeviceProfileAndEmptyOtaPackage) | **GET** /api/devices/count/{otaPackageType}/{deviceProfileId} | Count devices by device profile  (countByDeviceProfileAndEmptyOtaPackage) |
| [**deleteDevice**](DeviceControllerApi.md#deleteDevice) | **DELETE** /api/device/{deviceId} | Delete device (deleteDevice) |
| [**findByQuery3**](DeviceControllerApi.md#findByQuery3) | **POST** /api/devices | Find related devices (findByQuery) |
| [**getCustomerDeviceInfos**](DeviceControllerApi.md#getCustomerDeviceInfos) | **GET** /api/customer/{customerId}/deviceInfos | Get Customer Device Infos (getCustomerDeviceInfos) |
| [**getCustomerDevices**](DeviceControllerApi.md#getCustomerDevices) | **GET** /api/customer/{customerId}/devices | Get Customer Devices (getCustomerDevices) |
| [**getDeviceById**](DeviceControllerApi.md#getDeviceById) | **GET** /api/device/{deviceId} | Get Device (getDeviceById) |
| [**getDeviceCredentialsByDeviceId**](DeviceControllerApi.md#getDeviceCredentialsByDeviceId) | **GET** /api/device/{deviceId}/credentials | Get Device Credentials (getDeviceCredentialsByDeviceId) |
| [**getDeviceInfoById**](DeviceControllerApi.md#getDeviceInfoById) | **GET** /api/device/info/{deviceId} | Get Device Info (getDeviceInfoById) |
| [**getDeviceTypes**](DeviceControllerApi.md#getDeviceTypes) | **GET** /api/device/types | Get Device Types (getDeviceTypes) |
| [**getDevicesByIds**](DeviceControllerApi.md#getDevicesByIds) | **GET** /api/devices | Get Devices By Ids (getDevicesByIds) |
| [**getEdgeDevices**](DeviceControllerApi.md#getEdgeDevices) | **GET** /api/edge/{edgeId}/devices | Get devices assigned to edge (getEdgeDevices) |
| [**getTenantDeviceByName**](DeviceControllerApi.md#getTenantDeviceByName) | **GET** /api/tenant/device | Get Tenant Device (getTenantDeviceByName) |
| [**getTenantDeviceInfos**](DeviceControllerApi.md#getTenantDeviceInfos) | **GET** /api/tenant/deviceInfos | Get Tenant Device Infos (getTenantDeviceInfos) |
| [**getTenantDevices**](DeviceControllerApi.md#getTenantDevices) | **GET** /api/tenant/devices | Get Tenant Devices (getTenantDevices) |
| [**processDevicesBulkImport**](DeviceControllerApi.md#processDevicesBulkImport) | **POST** /api/device/bulk_import | Import the bulk of devices (processDevicesBulkImport) |
| [**reClaimDevice**](DeviceControllerApi.md#reClaimDevice) | **DELETE** /api/customer/device/{deviceName}/claim | Reclaim device (reClaimDevice) |
| [**saveDevice**](DeviceControllerApi.md#saveDevice) | **POST** /api/device | Create Or Update Device (saveDevice) |
| [**saveDeviceWithCredentials1**](DeviceControllerApi.md#saveDeviceWithCredentials1) | **POST** /api/device-with-credentials | Create Device (saveDevice) with credentials  |
| [**unassignDeviceFromCustomer**](DeviceControllerApi.md#unassignDeviceFromCustomer) | **DELETE** /api/customer/device/{deviceId} | Unassign device from customer (unassignDeviceFromCustomer) |
| [**unassignDeviceFromEdge**](DeviceControllerApi.md#unassignDeviceFromEdge) | **DELETE** /api/edge/{edgeId}/device/{deviceId} | Unassign device from edge (unassignDeviceFromEdge) |
| [**updateDeviceCredentials**](DeviceControllerApi.md#updateDeviceCredentials) | **POST** /api/device/credentials | Update device credentials (updateDeviceCredentials) |



## assignDeviceToCustomer

> Device assignDeviceToCustomer(customerId, deviceId)

Assign device to customer (assignDeviceToCustomer)

Creates assignment of the device to customer. Customer will be able to query device afterwards.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **deviceId** | **String**| A string value representing the device id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**Device**](Device.md)

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


## assignDeviceToEdge

> Device assignDeviceToEdge(edgeId, deviceId)

Assign device to edge (assignDeviceToEdge)

Creates assignment of an existing device to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment device (Edge will receive this instantly, if it&#39;s currently connected, or once it&#39;s going to be connected to platform). Third, once device will be delivered to edge service, it&#39;s going to be available for usage on remote edge instance.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**| A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **deviceId** | **String**| A string value representing the device id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**Device**](Device.md)

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


## assignDeviceToPublicCustomer

> Device assignDeviceToPublicCustomer(deviceId)

Make device publicly available (assignDeviceToPublicCustomer)

Device will be available for non-authorized (not logged-in) users. This is useful to create dashboards that you plan to share/embed on a publicly available website. However, users that are logged-in and belong to different tenant will not be able to access the device.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**| A string value representing the device id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**Device**](Device.md)

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


## assignDeviceToTenant

> Device assignDeviceToTenant(tenantId, deviceId)

Assign device to tenant (assignDeviceToTenant)

Creates assignment of the device to tenant. Thereafter tenant will be able to reassign the device to a customer.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| A string value representing the tenant id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **deviceId** | **String**| A string value representing the device id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**Device**](Device.md)

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


## claimDevice1

> String claimDevice1(deviceName, claimRequest)

Claim device (claimDevice)

Claiming makes it possible to assign a device to the specific customer using device/server side claiming data (in the form of secret key).To make this happen you have to provide unique device name and optional claiming data (it is needed only for device-side claiming).Once device is claimed, the customer becomes its owner and customer users may access device data as well as control the device.  In order to enable claiming devices feature a system parameter security.claim.allowClaimingByDefault should be set to true, otherwise a server-side claimingAllowed attribute with the value true is obligatory for provisioned devices.  See official documentation for more details regarding claiming.  Available for users with &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceName** | **String**| Unique name of the device which is going to be claimed | |
| **claimRequest** | [**ClaimRequest**](ClaimRequest.md)|  | [optional] |

### Return type

**String**

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


## countByDeviceProfileAndEmptyOtaPackage

> Long countByDeviceProfileAndEmptyOtaPackage(otaPackageType, deviceProfileId)

Count devices by device profile  (countByDeviceProfileAndEmptyOtaPackage)

The platform gives an ability to load OTA (over-the-air) packages to devices. It can be done in two different ways: device scope or device profile scope.In the response you will find the number of devices with specified device profile, but without previously defined device scope OTA package. It can be useful when you want to define number of devices that will be affected with future OTA package  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **otaPackageType** | **String**| OTA package type | [enum: FIRMWARE, SOFTWARE] |
| **deviceProfileId** | **String**| Device Profile Id. I.g. &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

**Long**

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


## deleteDevice

> deleteDevice(deviceId)

Delete device (deleteDevice)

Deletes the device, it&#39;s credentials and all the relations (from and to the device). Referencing non-existing device Id will cause an error.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**| A string value representing the device id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

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


## findByQuery3

> List&lt;Device&gt; findByQuery3(deviceSearchQuery)

Find related devices (findByQuery)

Returns all devices that are related to the specific entity. The entity id, relation type, device types, depth of the search, and other query parameters defined using complex &#39;DeviceSearchQuery&#39; object. See &#39;Model&#39; tab of the Parameters for more info.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceSearchQuery** | [**DeviceSearchQuery**](DeviceSearchQuery.md)|  | |

### Return type

[**List&lt;Device&gt;**](Device.md)

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


## getCustomerDeviceInfos

> PageDataDeviceInfo getCustomerDeviceInfos(customerId, pageSize, page, type, deviceProfileId, active, textSearch, sortProperty, sortOrder)

Get Customer Device Infos (getCustomerDeviceInfos)

Returns a page of devices info objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Device Info is an extension of the default Device object that contains information about the assigned customer name and device profile name.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **type** | **String**| Device type as the name of the device profile | [optional] |
| **deviceProfileId** | **String**| A string value representing the device profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | [optional] |
| **active** | **Boolean**| A boolean value representing the device active flag. | [optional] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the device name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, deviceProfileName, label, customerTitle] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataDeviceInfo**](PageDataDeviceInfo.md)

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


## getCustomerDevices

> PageDataDevice getCustomerDevices(customerId, pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Customer Devices (getCustomerDevices)

Returns a page of devices objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **type** | **String**| Device type as the name of the device profile | [optional] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the device name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, deviceProfileName, label, customerTitle] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataDevice**](PageDataDevice.md)

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


## getDeviceById

> Device getDeviceById(deviceId)

Get Device (getDeviceById)

Fetch the Device object based on the provided Device Id. If the user has the authority of &#39;TENANT_ADMIN&#39;, the server checks that the device is owned by the same tenant. If the user has the authority of &#39;CUSTOMER_USER&#39;, the server checks that the device is assigned to the same customer.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**| A string value representing the device id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**Device**](Device.md)

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


## getDeviceCredentialsByDeviceId

> DeviceCredentials getDeviceCredentialsByDeviceId(deviceId)

Get Device Credentials (getDeviceCredentialsByDeviceId)

If during device creation there wasn&#39;t specified any credentials, platform generates random &#39;ACCESS_TOKEN&#39; credentials.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**| A string value representing the device id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**DeviceCredentials**](DeviceCredentials.md)

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


## getDeviceInfoById

> DeviceInfo getDeviceInfoById(deviceId)

Get Device Info (getDeviceInfoById)

Fetch the Device Info object based on the provided Device Id. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that the device is owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the device is assigned to the same customer. Device Info is an extension of the default Device object that contains information about the assigned customer name and device profile name.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**| A string value representing the device id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**DeviceInfo**](DeviceInfo.md)

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


## getDeviceTypes

> List&lt;EntitySubtype&gt; getDeviceTypes()

Get Device Types (getDeviceTypes)

Deprecated. See &#39;getDeviceProfileNames&#39; API from Device Profile Controller instead.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;EntitySubtype&gt;**](EntitySubtype.md)

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


## getDevicesByIds

> List&lt;Device&gt; getDevicesByIds(deviceIds)

Get Devices By Ids (getDevicesByIds)

Requested devices must be owned by tenant or assigned to customer which user is performing the request.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceIds** | [**List&lt;String&gt;**](String.md)| A list of devices ids, separated by comma &#39;,&#39; | |

### Return type

[**List&lt;Device&gt;**](Device.md)

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


## getEdgeDevices

> PageDataDeviceInfo getEdgeDevices(edgeId, pageSize, page, type, deviceProfileId, active, textSearch, sortProperty, sortOrder, startTime, endTime)

Get devices assigned to edge (getEdgeDevices)

Returns a page of devices assigned to edge. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**| A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **type** | **String**| Device type as the name of the device profile | [optional] |
| **deviceProfileId** | **String**| A string value representing the device profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | [optional] |
| **active** | **Boolean**| A boolean value representing the device active flag. | [optional] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the device name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, deviceProfileName, label, customerTitle] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **startTime** | **Long**| Timestamp. Devices with creation time before it won&#39;t be queried | [optional] |
| **endTime** | **Long**| Timestamp. Devices with creation time after it won&#39;t be queried | [optional] |

### Return type

[**PageDataDeviceInfo**](PageDataDeviceInfo.md)

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


## getTenantDeviceByName

> Device getTenantDeviceByName(deviceName)

Get Tenant Device (getTenantDeviceByName)

Requested device must be owned by tenant that the user belongs to. Device name is an unique property of device. So it can be used to identify the device.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceName** | **String**| A string value representing the Device name. | |

### Return type

[**Device**](Device.md)

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


## getTenantDeviceInfos

> PageDataDeviceInfo getTenantDeviceInfos(pageSize, page, type, deviceProfileId, active, textSearch, sortProperty, sortOrder)

Get Tenant Device Infos (getTenantDeviceInfos)

Returns a page of devices info objects owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details. Device Info is an extension of the default Device object that contains information about the assigned customer name and device profile name.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **type** | **String**| Device type as the name of the device profile | [optional] |
| **deviceProfileId** | **String**| A string value representing the device profile id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | [optional] |
| **active** | **Boolean**| A boolean value representing the device active flag. | [optional] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the device name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, deviceProfileName, label, customerTitle] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataDeviceInfo**](PageDataDeviceInfo.md)

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


## getTenantDevices

> PageDataDevice getTenantDevices(pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Tenant Devices (getTenantDevices)

Returns a page of devices owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **type** | **String**| Device type as the name of the device profile | [optional] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the device name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, deviceProfileName, label, customerTitle] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataDevice**](PageDataDevice.md)

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


## processDevicesBulkImport

> BulkImportResultDevice processDevicesBulkImport(bulkImportRequest)

Import the bulk of devices (processDevicesBulkImport)

There&#39;s an ability to import the bulk of devices using the only .csv file.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bulkImportRequest** | [**BulkImportRequest**](BulkImportRequest.md)|  | |

### Return type

[**BulkImportResultDevice**](BulkImportResultDevice.md)

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


## reClaimDevice

> String reClaimDevice(deviceName)

Reclaim device (reClaimDevice)

Reclaiming means the device will be unassigned from the customer and the device will be available for claiming again.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceName** | **String**| Unique name of the device which is going to be reclaimed | |

### Return type

**String**

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


## saveDevice

> Device saveDevice(device, accessToken, nameConflictPolicy, uniquifySeparator, uniquifyStrategy)

Create Or Update Device (saveDevice)

Create or update the Device. When creating device, platform generates Device Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). Device credentials are also generated if not provided in the &#39;accessToken&#39; request parameter. The newly created device id will be present in the response. Specify existing Device id to update the device. Referencing non-existing device Id will cause &#39;Not Found&#39; error.  Device name is unique in the scope of tenant. Use unique identifiers like MAC or IMEI for the device names and non-unique &#39;label&#39; field for user-friendly visualization purposes.Remove &#39;id&#39;, &#39;tenantId&#39; and optionally &#39;customerId&#39; from the request body example (below) to create new Device entity.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **device** | [**Device**](Device.md)| A JSON value representing the device. | |
| **accessToken** | **String**| Optional value of the device credentials to be used during device creation. If omitted, access token will be auto-generated. | [optional] |
| **nameConflictPolicy** | [**NameConflictPolicy**](.md)| Optional value of name conflict policy. Possible values: FAIL or UNIQUIFY.  If omitted, FAIL policy is applied. FAIL policy implies exception will be thrown if an entity with the same name already exists.  UNIQUIFY policy appends a suffix to the entity name, if a name conflict occurs. | [optional] [default to FAIL] [enum: FAIL, UNIQUIFY] |
| **uniquifySeparator** | **String**| Optional value of name suffix separator used by UNIQUIFY policy. By default, underscore separator is used. For example, strategy is UNIQUIFY, separator is &#39;-&#39;; if a name conflict occurs for entity name &#39;test-name&#39;, created entity will have name like &#39;test-name-7fsh4f&#39;. | [optional] [default to _] |
| **uniquifyStrategy** | [**UniquifyStrategy**](.md)| Optional value of uniquify strategy used by UNIQUIFY policy. Possible values: RANDOM or INCREMENTAL. By default, RANDOM strategy is used, which means random alphanumeric string will be added as a suffix to entity name. INCREMENTAL implies the first possible number starting from 1 will be added as a name suffix. For example, strategy is UNIQUIFY, uniquify strategy is INCREMENTAL; if a name conflict occurs for entity name &#39;test-name&#39;, created entity will have name like &#39;test-name-1. | [optional] [default to RANDOM] [enum: RANDOM, INCREMENTAL] |

### Return type

[**Device**](Device.md)

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


## saveDeviceWithCredentials1

> Device saveDeviceWithCredentials1(saveDeviceWithCredentialsRequest, nameConflictPolicy, uniquifySeparator, uniquifyStrategy)

Create Device (saveDevice) with credentials 

Create or update the Device. When creating device, platform generates Device Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). Requires to provide the Device Credentials object as well as an existing device profile ID or use \&quot;default\&quot;. You may find the example of device with different type of credentials below:   - Credentials type: &lt;b&gt;\&quot;Access token\&quot;&lt;/b&gt; with &lt;b&gt;device profile ID&lt;/b&gt; below:   &#x60;&#x60;&#x60;json {   \&quot;device\&quot;: {     \&quot;name\&quot;:\&quot;Name_DeviceWithCredantial_AccessToken\&quot;,     \&quot;label\&quot;:\&quot;Label_DeviceWithCredantial_AccessToken\&quot;,     \&quot;deviceProfileId\&quot;:{       \&quot;id\&quot;:\&quot;9d9588c0-06c9-11ee-b618-19be30fdeb60\&quot;,       \&quot;entityType\&quot;:\&quot;DEVICE_PROFILE\&quot;      }    },   \&quot;credentials\&quot;: {     \&quot;credentialsType\&quot;: \&quot;ACCESS_TOKEN\&quot;,     \&quot;credentialsId\&quot;: \&quot;6hmxew8pmmzng4e3une2\&quot;    } } &#x60;&#x60;&#x60;  - Credentials type: &lt;b&gt;\&quot;Access token\&quot;&lt;/b&gt; with  &lt;b&gt;device profile default&lt;/b&gt; below:   &#x60;&#x60;&#x60;json {   \&quot;device\&quot;: {     \&quot;name\&quot;:\&quot;Name_DeviceWithCredantial_AccessToken_Default\&quot;,     \&quot;label\&quot;:\&quot;Label_DeviceWithCredantial_AccessToken_Default\&quot;,     \&quot;type\&quot;: \&quot;default\&quot;    },   \&quot;credentials\&quot;: {     \&quot;credentialsType\&quot;: \&quot;ACCESS_TOKEN\&quot;,     \&quot;credentialsId\&quot;: \&quot;6hmxew8pmmzng4e3une3\&quot;    } } &#x60;&#x60;&#x60;  - Credentials type: &lt;b&gt;\&quot;X509\&quot;&lt;/b&gt; with &lt;b&gt;device profile ID&lt;/b&gt; below:   Note: &lt;b&gt;credentialsId&lt;/b&gt; -  format &lt;b&gt;Sha3Hash&lt;/b&gt;, &lt;b&gt;certificateValue&lt;/b&gt; - format &lt;b&gt;PEM&lt;/b&gt; (with \&quot;--BEGIN CERTIFICATE----\&quot; and  -\&quot;----END CERTIFICATE-\&quot;).  &#x60;&#x60;&#x60;json {   \&quot;device\&quot;: {     \&quot;name\&quot;:\&quot;Name_DeviceWithCredantial_X509_Certificate\&quot;,     \&quot;label\&quot;:\&quot;Label_DeviceWithCredantial_X509_Certificate\&quot;,     \&quot;deviceProfileId\&quot;:{       \&quot;id\&quot;:\&quot;9d9588c0-06c9-11ee-b618-19be30fdeb60\&quot;,       \&quot;entityType\&quot;:\&quot;DEVICE_PROFILE\&quot;      }    },   \&quot;credentials\&quot;: {     \&quot;credentialsType\&quot;: \&quot;X509_CERTIFICATE\&quot;,     \&quot;credentialsId\&quot;: \&quot;84f5911765abba1f96bf4165604e9e90338fc6214081a8e623b6ff9669aedb27\&quot;,     \&quot;credentialsValue\&quot;: \&quot;-----BEGIN CERTIFICATE----- MIICMTCCAdegAwIBAgIUI9dBuwN6pTtK6uZ03rkiCwV4wEYwCgYIKoZIzj0EAwIwbjELMAkGA1UEBhMCVVMxETAPBgNVBAgMCE5ldyBZb3JrMRowGAYDVQQKDBFUaGluZ3NCb2FyZCwgSW5jLjEwMC4GA1UEAwwnZGV2aWNlQ2VydGlmaWNhdGVAWDUwOVByb3Zpc2lvblN0cmF0ZWd5MB4XDTIzMDMyOTE0NTYxN1oXDTI0MDMyODE0NTYxN1owbjELMAkGA1UEBhMCVVMxETAPBgNVBAgMCE5ldyBZb3JrMRowGAYDVQQKDBFUaGluZ3NCb2FyZCwgSW5jLjEwMC4GA1UEAwwnZGV2aWNlQ2VydGlmaWNhdGVAWDUwOVByb3Zpc2lvblN0cmF0ZWd5MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE9Zo791qKQiGNBm11r4ZGxh+w+ossZL3xc46ufq5QckQHP7zkD2XDAcmP5GvdkM1sBFN9AWaCkQfNnWmfERsOOKNTMFEwHQYDVR0OBBYEFFFc5uyCyglQoZiKhzXzMcQ3BKORMB8GA1UdIwQYMBaAFFFc5uyCyglQoZiKhzXzMcQ3BKORMA8GA1UdEwEB/wQFMAMBAf8wCgYIKoZIzj0EAwIDSAAwRQIhANbA9CuhoOifZMMmqkpuld+65CR+ItKdXeRAhLMZuccuAiB0FSQB34zMutXrZj1g8Gl5OkE7YryFHbei1z0SveHR8g&#x3D;&#x3D; -----END CERTIFICATE-----\&quot;    } } &#x60;&#x60;&#x60;  - Credentials type: &lt;b&gt;\&quot;MQTT_BASIC\&quot;&lt;/b&gt; with &lt;b&gt;device profile ID&lt;/b&gt; below:   &#x60;&#x60;&#x60;json {   \&quot;device\&quot;: {     \&quot;name\&quot;:\&quot;Name_DeviceWithCredantial_MQTT_Basic\&quot;,     \&quot;label\&quot;:\&quot;Label_DeviceWithCredantial_MQTT_Basic\&quot;,     \&quot;deviceProfileId\&quot;:{       \&quot;id\&quot;:\&quot;9d9588c0-06c9-11ee-b618-19be30fdeb60\&quot;,       \&quot;entityType\&quot;:\&quot;DEVICE_PROFILE\&quot;      }    },   \&quot;credentials\&quot;: {     \&quot;credentialsType\&quot;: \&quot;MQTT_BASIC\&quot;,     \&quot;credentialsValue\&quot;: \&quot;{\\\&quot;clientId\\\&quot;:\\\&quot;5euh5nzm34bjjh1efmlt\\\&quot;,\\\&quot;userName\\\&quot;:\\\&quot;onasd1lgwasmjl7v2v7h\\\&quot;,\\\&quot;password\\\&quot;:\\\&quot;b9xtm4ny8kt9zewaga5o\\\&quot;}\&quot;    } } &#x60;&#x60;&#x60;  - You may find the example of &lt;b&gt;LwM2M&lt;/b&gt; device and &lt;b&gt;RPK&lt;/b&gt; credentials below:   Note: LwM2M device - only existing device profile ID (Transport configuration -&gt; Transport type: \&quot;LWM2M\&quot;.  &#x60;&#x60;&#x60;json {   \&quot;device\&quot;: {     \&quot;name\&quot;:\&quot;Name_LwRpk00000000\&quot;,     \&quot;label\&quot;:\&quot;Label_LwRpk00000000\&quot;,     \&quot;deviceProfileId\&quot;:{       \&quot;id\&quot;:\&quot;a660bd50-10ef-11ee-8737-b5634e73c779\&quot;,       \&quot;entityType\&quot;:\&quot;DEVICE_PROFILE\&quot;      }    },   \&quot;credentials\&quot;: {     \&quot;credentialsType\&quot;: \&quot;LWM2M_CREDENTIALS\&quot;,     \&quot;credentialsId\&quot;: \&quot;LwRpk00000000\&quot;,     \&quot;credentialsValue\&quot;:        \&quot;{\\\&quot;client\\\&quot;:{ \\\&quot;endpoint\\\&quot;:\\\&quot;LwRpk00000000\\\&quot;, \\\&quot;securityConfigClientMode\\\&quot;:\\\&quot;RPK\\\&quot;, \\\&quot;key\\\&quot;:\\\&quot;MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEUEBxNl/RcYJNm8mk91CyVXoIJiROYDlXcSSqK6e5bDHwOW4ZiN2lNnXalyF0Jxw8MbAytnDMERXyAja5VEMeVQ&#x3D;&#x3D;\\\&quot;   }, \\\&quot;bootstrap\\\&quot;:{ \\\&quot;bootstrapServer\\\&quot;:{ \\\&quot;securityMode\\\&quot;:\\\&quot;RPK\\\&quot;, \\\&quot;clientPublicKeyOrId\\\&quot;:\\\&quot;MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEUEBxNl/RcYJNm8mk91CyVXoIJiROYDlXcSSqK6e5bDHwOW4ZiN2lNnXalyF0Jxw8MbAytnDMERXyAja5VEMeVQ&#x3D;&#x3D;\\\&quot;, \\\&quot;clientSecretKey\\\&quot;:\\\&quot;MIGHAgEAMBMGByqGSM49AgEGCCqGSM49AwEHBG0wawIBAQQgd9GAx7yZW37autew5KZykn4IgRpge/tZSjnudnZJnMahRANCAARQQHE2X9Fxgk2byaT3ULJVeggmJE5gOVdxJKorp7lsMfA5bhmI3aU2ddqXIXQnHDwxsDK2cMwRFfICNrlUQx5V\\\&quot;}, \\\&quot;lwm2mServer\\\&quot;:{ \\\&quot;securityMode\\\&quot;:\\\&quot;RPK\\\&quot;, \\\&quot;clientPublicKeyOrId\\\&quot;:\\\&quot;MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEUEBxNl/RcYJNm8mk91CyVXoIJiROYDlXcSSqK6e5bDHwOW4ZiN2lNnXalyF0Jxw8MbAytnDMERXyAja5VEMeVQ&#x3D;&#x3D;\\\&quot;, \\\&quot;clientSecretKey\\\&quot;:\\\&quot;MIGHAgEAMBMGByqGSM49AgEGCCqGSM49AwEHBG0wawIBAQQgd9GAx7yZW37autew5KZykn4IgRpge/tZSjnudnZJnMahRANCAARQQHE2X9Fxgk2byaT3ULJVeggmJE5gOVdxJKorp7lsMfA5bhmI3aU2ddqXIXQnHDwxsDK2cMwRFfICNrlUQx5V\\\&quot;}} }\&quot;    } } &#x60;&#x60;&#x60;  Remove &#39;id&#39;, &#39;tenantId&#39; and optionally &#39;customerId&#39; from the request body example (below) to create new Device entity.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **saveDeviceWithCredentialsRequest** | [**SaveDeviceWithCredentialsRequest**](SaveDeviceWithCredentialsRequest.md)|  | |
| **nameConflictPolicy** | [**NameConflictPolicy**](.md)| Optional value of name conflict policy. Possible values: FAIL or UNIQUIFY.  If omitted, FAIL policy is applied. FAIL policy implies exception will be thrown if an entity with the same name already exists.  UNIQUIFY policy appends a suffix to the entity name, if a name conflict occurs. | [optional] [default to FAIL] [enum: FAIL, UNIQUIFY] |
| **uniquifySeparator** | **String**| Optional value of name suffix separator used by UNIQUIFY policy. By default, underscore separator is used. For example, strategy is UNIQUIFY, separator is &#39;-&#39;; if a name conflict occurs for entity name &#39;test-name&#39;, created entity will have name like &#39;test-name-7fsh4f&#39;. | [optional] [default to _] |
| **uniquifyStrategy** | [**UniquifyStrategy**](.md)| Optional value of uniquify strategy used by UNIQUIFY policy. Possible values: RANDOM or INCREMENTAL. By default, RANDOM strategy is used, which means random alphanumeric string will be added as a suffix to entity name. INCREMENTAL implies the first possible number starting from 1 will be added as a name suffix. For example, strategy is UNIQUIFY, uniquify strategy is INCREMENTAL; if a name conflict occurs for entity name &#39;test-name&#39;, created entity will have name like &#39;test-name-1. | [optional] [default to RANDOM] [enum: RANDOM, INCREMENTAL] |

### Return type

[**Device**](Device.md)

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


## unassignDeviceFromCustomer

> Device unassignDeviceFromCustomer(deviceId)

Unassign device from customer (unassignDeviceFromCustomer)

Clears assignment of the device to customer. Customer will not be able to query device afterwards.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceId** | **String**| A string value representing the device id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**Device**](Device.md)

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


## unassignDeviceFromEdge

> Device unassignDeviceFromEdge(edgeId, deviceId)

Unassign device from edge (unassignDeviceFromEdge)

Clears assignment of the device to the edge. Unassignment works in async way - first, &#39;unassign&#39; notification event pushed to edge queue on platform. Second, remote edge service will receive an &#39;unassign&#39; command to remove device (Edge will receive this instantly, if it&#39;s currently connected, or once it&#39;s going to be connected to platform). Third, once &#39;unassign&#39; command will be delivered to edge service, it&#39;s going to remove device locally.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**| A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **deviceId** | **String**| A string value representing the device id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**Device**](Device.md)

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


## updateDeviceCredentials

> DeviceCredentials updateDeviceCredentials(deviceCredentials)

Update device credentials (updateDeviceCredentials)

During device creation, platform generates random &#39;ACCESS_TOKEN&#39; credentials. \&quot; + Use this method to update the device credentials. First use &#39;getDeviceCredentialsByDeviceId&#39; to get the credentials id and value. Then use current method to update the credentials type and value. It is not possible to create multiple device credentials for the same device. The structure of device credentials id and value is simple for the &#39;ACCESS_TOKEN&#39; but is much more complex for the &#39;MQTT_BASIC&#39; or &#39;LWM2M_CREDENTIALS&#39;. You may find the example of device with different type of credentials below:   - Credentials type: &lt;b&gt;\&quot;Access token\&quot;&lt;/b&gt; with &lt;b&gt;device ID&lt;/b&gt; and with &lt;b&gt;device ID&lt;/b&gt; below:   &#x60;&#x60;&#x60;json {   \&quot;id\&quot;: {     \&quot;id\&quot;:\&quot;c886a090-168d-11ee-87c9-6f157dbc816a\&quot;    },   \&quot;deviceId\&quot;: {     \&quot;id\&quot;:\&quot;c5fb3ac0-168d-11ee-87c9-6f157dbc816a\&quot;,     \&quot;entityType\&quot;:\&quot;DEVICE\&quot;    },   \&quot;credentialsType\&quot;: \&quot;ACCESS_TOKEN\&quot;,   \&quot;credentialsId\&quot;: \&quot;6hmxew8pmmzng4e3une4\&quot; } &#x60;&#x60;&#x60;  - Credentials type: &lt;b&gt;\&quot;X509\&quot;&lt;/b&gt; with &lt;b&gt;device profile ID&lt;/b&gt; below:   Note: &lt;b&gt;credentialsId&lt;/b&gt; -  format &lt;b&gt;Sha3Hash&lt;/b&gt;, &lt;b&gt;certificateValue&lt;/b&gt; - format &lt;b&gt;PEM&lt;/b&gt; (with \&quot;--BEGIN CERTIFICATE----\&quot; and  -\&quot;----END CERTIFICATE-\&quot;).  &#x60;&#x60;&#x60;json {   \&quot;id\&quot;: {     \&quot;id\&quot;:\&quot;309bd9c0-14f4-11ee-9fc9-d9b7463abb63\&quot;    },   \&quot;deviceId\&quot;: {     \&quot;id\&quot;:\&quot;3092b200-14f4-11ee-9fc9-d9b7463abb63\&quot;,     \&quot;entityType\&quot;:\&quot;DEVICE\&quot;    },   \&quot;credentialsType\&quot;: \&quot;X509_CERTIFICATE\&quot;,   \&quot;credentialsId\&quot;: \&quot;6b8adb49015500e51a527acd332b51684ab9b49b4ade03a9582a44c455e2e9b6\&quot;,   \&quot;credentialsValue\&quot;: \&quot;-----BEGIN CERTIFICATE----- MIICMTCCAdegAwIBAgIUUEKxS9hTz4l+oLUMF0LV6TC/gCIwCgYIKoZIzj0EAwIwbjELMAkGA1UEBhMCVVMxETAPBgNVBAgMCE5ldyBZb3JrMRowGAYDVQQKDBFUaGluZ3NCb2FyZCwgSW5jLjEwMC4GA1UEAwwnZGV2aWNlUHJvZmlsZUNlcnRAWDUwOVByb3Zpc2lvblN0cmF0ZWd5MB4XDTIzMDMyOTE0NTczNloXDTI0MDMyODE0NTczNlowbjELMAkGA1UEBhMCVVMxETAPBgNVBAgMCE5ldyBZb3JrMRowGAYDVQQKDBFUaGluZ3NCb2FyZCwgSW5jLjEwMC4GA1UEAwwnZGV2aWNlUHJvZmlsZUNlcnRAWDUwOVByb3Zpc2lvblN0cmF0ZWd5MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAECMlWO72krDoUL9FQjUmSCetkhaEGJUfQkdSfkLSNa0GyAEIMbfmzI4zITeapunu4rGet3EMyLydQzuQanBicp6NTMFEwHQYDVR0OBBYEFHpZ78tPnztNii4Da/yCw6mhEIL3MB8GA1UdIwQYMBaAFHpZ78tPnztNii4Da/yCw6mhEIL3MA8GA1UdEwEB/wQFMAMBAf8wCgYIKoZIzj0EAwIDSAAwRQIgJ7qyMFqNcwSYkH6o+UlQXzLWfwZbNjVk+aR7foAZNGsCIQDsd7v3WQIGHiArfZeDs1DLEDuV/2h6L+ZNoGNhEKL+1A&#x3D;&#x3D; -----END CERTIFICATE-----\&quot; } &#x60;&#x60;&#x60;  - Credentials type: &lt;b&gt;\&quot;MQTT_BASIC\&quot;&lt;/b&gt; with &lt;b&gt;device profile ID&lt;/b&gt; below:   &#x60;&#x60;&#x60;json {   \&quot;id\&quot;: {     \&quot;id\&quot;:\&quot;d877ffb0-14f5-11ee-9fc9-d9b7463abb63\&quot;    },   \&quot;deviceId\&quot;: {     \&quot;id\&quot;:\&quot;d875dcd0-14f5-11ee-9fc9-d9b7463abb63\&quot;,     \&quot;entityType\&quot;:\&quot;DEVICE\&quot;    },   \&quot;credentialsType\&quot;: \&quot;MQTT_BASIC\&quot;,   \&quot;credentialsValue\&quot;: \&quot;{\\\&quot;clientId\\\&quot;:\\\&quot;juy03yv4owqxcmqhqtvk\\\&quot;,\\\&quot;userName\\\&quot;:\\\&quot;ov19fxca0cyjn7lm7w7u\\\&quot;,\\\&quot;password\\\&quot;:\\\&quot;twy94he114dfi9usyk1o\\\&quot;}\&quot; } &#x60;&#x60;&#x60;  - You may find the example of &lt;b&gt;LwM2M&lt;/b&gt; device and &lt;b&gt;RPK&lt;/b&gt; credentials below:   Note: LwM2M device - only existing device profile ID (Transport configuration -&gt; Transport type: \&quot;LWM2M\&quot;.  &#x60;&#x60;&#x60;json {   \&quot;id\&quot;: {     \&quot;id\&quot;:\&quot;e238d4d0-1689-11ee-98c6-1713c1be5a8e\&quot;    },   \&quot;deviceId\&quot;: {     \&quot;id\&quot;:\&quot;e232e160-1689-11ee-98c6-1713c1be5a8e\&quot;,     \&quot;entityType\&quot;:\&quot;DEVICE\&quot;    },   \&quot;credentialsType\&quot;: \&quot;LWM2M_CREDENTIALS\&quot;,   \&quot;credentialsId\&quot;: \&quot;LwRpk00000000\&quot;,   \&quot;credentialsValue\&quot;:        \&quot;{\\\&quot;client\\\&quot;:{ \\\&quot;endpoint\\\&quot;:\\\&quot;LwRpk00000000\\\&quot;, \\\&quot;securityConfigClientMode\\\&quot;:\\\&quot;RPK\\\&quot;, \\\&quot;key\\\&quot;:\\\&quot;MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEdvBZZ2vQRK9wgDhctj6B1c7bxR3Z0wYg1+YdoYFnVUKWb+rIfTTyYK9tmQJx5Vlb5fxdLnVv1RJOPiwsLIQbAA&#x3D;&#x3D;\\\&quot;   }, \\\&quot;bootstrap\\\&quot;:{ \\\&quot;bootstrapServer\\\&quot;:{ \\\&quot;securityMode\\\&quot;:\\\&quot;RPK\\\&quot;, \\\&quot;clientPublicKeyOrId\\\&quot;:\\\&quot;MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEUEBxNl/RcYJNm8mk91CyVXoIJiROYDlXcSSqK6e5bDHwOW4ZiN2lNnXalyF0Jxw8MbAytnDMERXyAja5VEMeVQ&#x3D;&#x3D;\\\&quot;, \\\&quot;clientSecretKey\\\&quot;:\\\&quot;MIGHAgEAMBMGByqGSM49AgEGCCqGSM49AwEHBG0wawIBAQQgd9GAx7yZW37autew5KZykn4IgRpge/tZSjnudnZJnMahRANCAARQQHE2X9Fxgk2byaT3ULJVeggmJE5gOVdxJKorp7lsMfA5bhmI3aU2ddqXIXQnHDwxsDK2cMwRFfICNrlUQx5V\\\&quot;}, \\\&quot;lwm2mServer\\\&quot;:{ \\\&quot;securityMode\\\&quot;:\\\&quot;RPK\\\&quot;, \\\&quot;clientPublicKeyOrId\\\&quot;:\\\&quot;MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEUEBxNl/RcYJNm8mk91CyVXoIJiROYDlXcSSqK6e5bDHwOW4ZiN2lNnXalyF0Jxw8MbAytnDMERXyAja5VEMeVQ&#x3D;&#x3D;\\\&quot;, \\\&quot;clientSecretKey\\\&quot;:\\\&quot;MIGHAgEAMBMGByqGSM49AgEGCCqGSM49AwEHBG0wawIBAQQgd9GAx7yZW37autew5KZykn4IgRpge/tZSjnudnZJnMahRANCAARQQHE2X9Fxgk2byaT3ULJVeggmJE5gOVdxJKorp7lsMfA5bhmI3aU2ddqXIXQnHDwxsDK2cMwRFfICNrlUQx5V\\\&quot;}} }\&quot; } &#x60;&#x60;&#x60;  Update to real value:  - &#39;id&#39; (this is id of Device Credentials -&gt;  \&quot;Get Device Credentials (getDeviceCredentialsByDeviceId)\&quot;,  - &#39;deviceId.id&#39; (this is id of Device). Remove &#39;tenantId&#39; and optionally &#39;customerId&#39; from the request body example (below) to create new Device entity.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceCredentials** | [**DeviceCredentials**](DeviceCredentials.md)|  | |

### Return type

[**DeviceCredentials**](DeviceCredentials.md)

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

