# BlobEntityControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteBlobEntity**](BlobEntityControllerApi.md#deleteBlobEntity) | **DELETE** /api/blobEntity/{blobEntityId} | Delete Blob Entity (deleteBlobEntity) |
| [**downloadBlobEntity**](BlobEntityControllerApi.md#downloadBlobEntity) | **GET** /api/blobEntity/{blobEntityId}/download | Download Blob Entity By Id (downloadBlobEntity) |
| [**getBlobEntities**](BlobEntityControllerApi.md#getBlobEntities) | **GET** /api/blobEntities | Get Blob Entities (getBlobEntities) |
| [**getBlobEntitiesByIdsV2**](BlobEntityControllerApi.md#getBlobEntitiesByIdsV2) | **GET** /api/blobEntities/list | Get Blob Entities By Ids (getBlobEntitiesByIdsV2) |
| [**getBlobEntityInfoById**](BlobEntityControllerApi.md#getBlobEntityInfoById) | **GET** /api/blobEntity/info/{blobEntityId} | Get Blob Entity With Customer Info (getBlobEntityInfoById) |



## deleteBlobEntity

> deleteBlobEntity(blobEntityId)

Delete Blob Entity (deleteBlobEntity)

Delete Blob entity based on the provided Blob entity Id. Referencing non-existing Blob entity Id will cause an error.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.   Security check is performed to verify that the user has &#39;DELETE&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blobEntityId** | **String**| A string value representing the blob entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

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


## downloadBlobEntity

> File downloadBlobEntity(blobEntityId)

Download Blob Entity By Id (downloadBlobEntity)

Download report file based on the provided Blob entity Id. Referencing non-existing Blob entity Id will cause an error.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blobEntityId** | **String**| A string value representing the blob entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**File**](File.md)

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


## getBlobEntities

> PageDataBlobEntityWithCustomerInfo getBlobEntities(pageSize, page, type, textSearch, sortProperty, sortOrder, startTime, endTime)

Get Blob Entities (getBlobEntities)

Returns a page of BlobEntityWithCustomerInfo object that are available for the current user. The platform uses Blob(binary large object) entities in the reporting feature, in order to store Dashboard states snapshots of different content types in base64 format. BlobEntityWithCustomerInfo represents an object that contains base info about the blob entity(name, type, contentType, etc.) and info about the customer(customerTitle, customerIsPublic) of the user that scheduled generation of the dashboard report. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **type** | **String**| A string value representing the blob entity type. For example, &#39;report&#39; | [optional] |
| **textSearch** | **String**| The case insensitive &#39;startsWith&#39; filter based on the blob entity name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, type, contentType, customerTitle] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |
| **startTime** | **Long**| The start timestamp in milliseconds of the search time range over the BlobEntityWithCustomerInfo class field: &#39;createdTime&#39;. | [optional] |
| **endTime** | **Long**| The end timestamp in milliseconds of the search time range over the BlobEntityWithCustomerInfo class field: &#39;createdTime&#39;. | [optional] |

### Return type

[**PageDataBlobEntityWithCustomerInfo**](PageDataBlobEntityWithCustomerInfo.md)

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


## getBlobEntitiesByIdsV2

> List&lt;BlobEntityInfo&gt; getBlobEntitiesByIdsV2(blobEntityIds)

Get Blob Entities By Ids (getBlobEntitiesByIdsV2)

Requested blob entities must be owned by tenant or assigned to customer which user is performing the request. The platform uses Blob(binary large object) entities in the reporting feature, in order to store Dashboard states snapshots of different content types in base64 format. BlobEntityInfo represents an object that contains base info about the blob entity(name, type, contentType, etc.). See the &#39;Model&#39; tab of the Response Class for more details.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blobEntityIds** | [**List&lt;String&gt;**](String.md)| A list of blob entity ids, separated by comma &#39;,&#39; | |

### Return type

[**List&lt;BlobEntityInfo&gt;**](BlobEntityInfo.md)

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


## getBlobEntityInfoById

> BlobEntityWithCustomerInfo getBlobEntityInfoById(blobEntityId)

Get Blob Entity With Customer Info (getBlobEntityInfoById)

Fetch the BlobEntityWithCustomerInfo object based on the provided Blob entity Id. The platform uses Blob(binary large object) entities in the reporting feature, in order to store Dashboard states snapshots of different content types in base64 format. BlobEntityWithCustomerInfo represents an object that contains base info about the blob entity(name, type, contentType, etc.) and info about the customer(customerTitle, customerIsPublic) of the user that scheduled generation of the dashboard report. Referencing non-existing Blob entity Id will cause an error.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blobEntityId** | **String**| A string value representing the blob entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**BlobEntityWithCustomerInfo**](BlobEntityWithCustomerInfo.md)

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

