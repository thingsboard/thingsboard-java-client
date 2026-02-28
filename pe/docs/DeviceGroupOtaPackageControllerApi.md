# DeviceGroupOtaPackageControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteDeviceGroupOtaPackage**](DeviceGroupOtaPackageControllerApi.md#deleteDeviceGroupOtaPackage) | **DELETE** /api/deviceGroupOtaPackage/{id} | deleteDeviceGroupOtaPackage |
| [**getFirmwareById**](DeviceGroupOtaPackageControllerApi.md#getFirmwareById) | **GET** /api/deviceGroupOtaPackage/{groupId}/{firmwareType} | getFirmwareById |
| [**saveDeviceGroupOtaPackage**](DeviceGroupOtaPackageControllerApi.md#saveDeviceGroupOtaPackage) | **POST** /api/deviceGroupOtaPackage | saveDeviceGroupOtaPackage |



## deleteDeviceGroupOtaPackage

> deleteDeviceGroupOtaPackage(id)

deleteDeviceGroupOtaPackage

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

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


## getFirmwareById

> DeviceGroupOtaPackage getFirmwareById(groupId, firmwareType)

getFirmwareById

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**|  | |
| **firmwareType** | **String**|  | |

### Return type

[**DeviceGroupOtaPackage**](DeviceGroupOtaPackage.md)

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


## saveDeviceGroupOtaPackage

> DeviceGroupOtaPackage saveDeviceGroupOtaPackage(deviceGroupOtaPackage)

saveDeviceGroupOtaPackage

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deviceGroupOtaPackage** | [**DeviceGroupOtaPackage**](DeviceGroupOtaPackage.md)|  | |

### Return type

[**DeviceGroupOtaPackage**](DeviceGroupOtaPackage.md)

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

