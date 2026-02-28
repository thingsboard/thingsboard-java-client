# EdgeControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateInstance**](EdgeControllerApi.md#activateInstance) | **POST** /api/license/activateInstance | Activate edge instance (activateInstance) |
| [**checkInstance**](EdgeControllerApi.md#checkInstance) | **POST** /api/license/checkInstance | Check edge license (checkInstance) |
| [**deleteEdge**](EdgeControllerApi.md#deleteEdge) | **DELETE** /api/edge/{edgeId} | Delete edge (deleteEdge) |
| [**findByQuery2**](EdgeControllerApi.md#findByQuery2) | **POST** /api/edges | Find related edges (findByQuery) |
| [**findMissingToRelatedRuleChains**](EdgeControllerApi.md#findMissingToRelatedRuleChains) | **GET** /api/edge/missingToRelatedRuleChains/{edgeId} | Find missing rule chains (findMissingToRelatedRuleChains) |
| [**getAllEdgeInfos**](EdgeControllerApi.md#getAllEdgeInfos) | **GET** /api/edgeInfos/all | Get All Edge Infos for current user (getAllEdgeInfos) |
| [**getCustomerEdgeInfos**](EdgeControllerApi.md#getCustomerEdgeInfos) | **GET** /api/customer/{customerId}/edgeInfos | Get Customer Edge Infos (getCustomerEdgeInfos) |
| [**getCustomerEdges**](EdgeControllerApi.md#getCustomerEdges) | **GET** /api/customer/{customerId}/edges | Get Customer Edges (getCustomerEdges) |
| [**getEdgeById**](EdgeControllerApi.md#getEdgeById) | **GET** /api/edge/{edgeId} | Get Edge (getEdgeById) |
| [**getEdgeInfoById**](EdgeControllerApi.md#getEdgeInfoById) | **GET** /api/edge/info/{edgeId} | Get Edge Info (getEdgeInfoById) |
| [**getEdgeInstallInstructions**](EdgeControllerApi.md#getEdgeInstallInstructions) | **GET** /api/edge/instructions/install/{edgeId}/{method} | Get Edge Install Instructions (getEdgeInstallInstructions) |
| [**getEdgeList**](EdgeControllerApi.md#getEdgeList) | **GET** /api/edges/list | Get Edges By Ids (getEdgeList) |
| [**getEdgeTypes**](EdgeControllerApi.md#getEdgeTypes) | **GET** /api/edge/types | Get Edge Types (getEdgeTypes) |
| [**getEdgeUpgradeInstructions**](EdgeControllerApi.md#getEdgeUpgradeInstructions) | **GET** /api/edge/instructions/upgrade/{edgeVersion}/{method} | Get Edge Upgrade Instructions (getEdgeUpgradeInstructions) |
| [**getEdges**](EdgeControllerApi.md#getEdges) | **GET** /api/edges | Get Tenant Edges (getEdges) |
| [**getEdgesByEntityGroupId**](EdgeControllerApi.md#getEdgesByEntityGroupId) | **GET** /api/entityGroup/{entityGroupId}/edges | Get edges by Entity Group Id (getEdgesByEntityGroupId) |
| [**getTenantEdgeByName**](EdgeControllerApi.md#getTenantEdgeByName) | **GET** /api/tenant/edge | Get Tenant Edge by name (getTenantEdgeByName) |
| [**getTenantEdges**](EdgeControllerApi.md#getTenantEdges) | **GET** /api/tenant/edges | Get Tenant Edges (getTenantEdges) |
| [**getUserEdges**](EdgeControllerApi.md#getUserEdges) | **GET** /api/user/edges | Get Edges (getUserEdges) |
| [**isEdgeUpgradeAvailable**](EdgeControllerApi.md#isEdgeUpgradeAvailable) | **GET** /api/edge/{edgeId}/upgrade/available | Is edge upgrade enabled (isEdgeUpgradeAvailable) |
| [**isEdgesSupportEnabled**](EdgeControllerApi.md#isEdgesSupportEnabled) | **GET** /api/edges/enabled | Is edges support enabled (isEdgesSupportEnabled) |
| [**processEdgesBulkImport**](EdgeControllerApi.md#processEdgesBulkImport) | **POST** /api/edge/bulk_import | Import the bulk of edges (processEdgesBulkImport) |
| [**saveEdge**](EdgeControllerApi.md#saveEdge) | **POST** /api/edge | Create Or Update Edge (saveEdge) |
| [**setEdgeRootRuleChain**](EdgeControllerApi.md#setEdgeRootRuleChain) | **POST** /api/edge/{edgeId}/{ruleChainId}/root | Set root rule chain for provided edge (setEdgeRootRuleChain) |
| [**syncEdge**](EdgeControllerApi.md#syncEdge) | **POST** /api/edge/sync/{edgeId} | Sync edge (syncEdge) |



## activateInstance

> com.fasterxml.jackson.databind.JsonNode activateInstance(licenseSecret, releaseDate)

Activate edge instance (activateInstance)

Activates edge license on license portal.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **licenseSecret** | **String**|  | |
| **releaseDate** | **String**|  | |

### Return type

[**com.fasterxml.jackson.databind.JsonNode**](com.fasterxml.jackson.databind.JsonNode.md)

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


## checkInstance

> com.fasterxml.jackson.databind.JsonNode checkInstance(body)

Check edge license (checkInstance)

Checks license request from edge service by forwarding request to license portal.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | |

### Return type

[**com.fasterxml.jackson.databind.JsonNode**](com.fasterxml.jackson.databind.JsonNode.md)

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


## deleteEdge

> deleteEdge(edgeId)

Delete edge (deleteEdge)

Deletes the edge. Referencing non-existing edge Id will cause an error.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**| A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

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


## findByQuery2

> List&lt;Edge&gt; findByQuery2(edgeSearchQuery)

Find related edges (findByQuery)

Returns all edges that are related to the specific entity. The entity id, relation type, edge types, depth of the search, and other query parameters defined using complex &#39;EdgeSearchQuery&#39; object. See &#39;Model&#39; tab of the Parameters for more info.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeSearchQuery** | [**EdgeSearchQuery**](EdgeSearchQuery.md)|  | |

### Return type

[**List&lt;Edge&gt;**](Edge.md)

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


## findMissingToRelatedRuleChains

> String findMissingToRelatedRuleChains(edgeId)

Find missing rule chains (findMissingToRelatedRuleChains)

Returns list of rule chains ids that are not assigned to particular edge, but these rule chains are present in the already assigned rule chains to edge.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**| A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

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


## getAllEdgeInfos

> PageDataEdgeInfo getAllEdgeInfos(pageSize, page, includeCustomers, type, textSearch, sortProperty, sortOrder)

Get All Edge Infos for current user (getAllEdgeInfos)

Returns a page of edge info objects owned by the tenant or the customer of a current user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **includeCustomers** | **Boolean**| Include customer or sub-customer entities | [optional] |
| **type** | **String**| A string value representing the edge type. For example, &#39;default&#39; | [optional] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the edge name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataEdgeInfo**](PageDataEdgeInfo.md)

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


## getCustomerEdgeInfos

> PageDataEdgeInfo getCustomerEdgeInfos(customerId, pageSize, page, includeCustomers, type, textSearch, sortProperty, sortOrder)

Get Customer Edge Infos (getCustomerEdgeInfos)

Returns a page of edge info objects owned by the specified customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **includeCustomers** | **Boolean**| Include customer or sub-customer entities | [optional] |
| **type** | **String**| A string value representing the edge type. For example, &#39;default&#39; | [optional] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the edge name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataEdgeInfo**](PageDataEdgeInfo.md)

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


## getCustomerEdges

> PageDataEdge getCustomerEdges(customerId, pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Customer Edges (getCustomerEdges)

Returns a page of edges objects assigned to customer. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A string value representing the customer id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **type** | **String**| A string value representing the edge type. For example, &#39;default&#39; | [optional] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the edge name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataEdge**](PageDataEdge.md)

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


## getEdgeById

> Edge getEdgeById(edgeId)

Get Edge (getEdgeById)

Get the Edge object based on the provided Edge Id. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that the edge is owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the edge is assigned to the same customer.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**| A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**Edge**](Edge.md)

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


## getEdgeInfoById

> EdgeInfo getEdgeInfoById(edgeId)

Get Edge Info (getEdgeInfoById)

Get the Edge info object based on the provided Edge Id. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that the edge is owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the edge is assigned to the same customer.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**| A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**EdgeInfo**](EdgeInfo.md)

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


## getEdgeInstallInstructions

> EdgeInstructions getEdgeInstallInstructions(edgeId, method)

Get Edge Install Instructions (getEdgeInstallInstructions)

Get an install instructions for provided edge id.If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that the edge is owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the edge is assigned to the same customer.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**| A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **method** | **String**| Installation method (&#39;docker&#39;, &#39;ubuntu&#39; or &#39;centos&#39;) | [enum: docker, ubuntu, centos] |

### Return type

[**EdgeInstructions**](EdgeInstructions.md)

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


## getEdgeList

> List&lt;Edge&gt; getEdgeList(edgeIds)

Get Edges By Ids (getEdgeList)

Requested edges must be owned by tenant or assigned to customer which user is performing the request.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeIds** | [**List&lt;String&gt;**](String.md)| A list of edges ids, separated by comma &#39;,&#39; | |

### Return type

[**List&lt;Edge&gt;**](Edge.md)

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


## getEdgeTypes

> List&lt;EntitySubtype&gt; getEdgeTypes()

Get Edge Types (getEdgeTypes)

Returns a set of unique edge types based on edges that are either owned by the tenant or assigned to the customer which user is performing the request.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

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


## getEdgeUpgradeInstructions

> EdgeInstructions getEdgeUpgradeInstructions(edgeVersion, method)

Get Edge Upgrade Instructions (getEdgeUpgradeInstructions)

Get an upgrade instructions for provided edge version.If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that the edge is owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the edge is assigned to the same customer.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeVersion** | **String**| Edge version | |
| **method** | **String**| Upgrade method (&#39;docker&#39;, &#39;ubuntu&#39; or &#39;centos&#39;) | [enum: docker, ubuntu, centos] |

### Return type

[**EdgeInstructions**](EdgeInstructions.md)

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


## getEdges

> PageDataEdge getEdges(pageSize, page, textSearch, sortProperty, sortOrder)

Get Tenant Edges (getEdges)

Returns a page of edges owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the edge name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataEdge**](PageDataEdge.md)

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


## getEdgesByEntityGroupId

> PageDataEdge getEdgesByEntityGroupId(entityGroupId, pageSize, page, textSearch, sortProperty, sortOrder)

Get edges by Entity Group Id (getEdgesByEntityGroupId)

Returns a page of Edge objects that belongs to specified Entity Group Id. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String**| A string value representing the Entity Group Id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **String**| Maximum amount of entities in a one page | |
| **page** | **String**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the edge name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataEdge**](PageDataEdge.md)

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


## getTenantEdgeByName

> Edge getTenantEdgeByName(edgeName)

Get Tenant Edge by name (getTenantEdgeByName)

Requested edge must be owned by tenant or customer that the user belongs to. Edge name is an unique property of edge. So it can be used to identify the edge.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeName** | **String**| Unique name of the edge | |

### Return type

[**Edge**](Edge.md)

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


## getTenantEdges

> PageDataEdge getTenantEdges(pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Tenant Edges (getTenantEdges)

Returns a page of edges owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **type** | **String**| A string value representing the edge type. For example, &#39;default&#39; | [optional] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the edge name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataEdge**](PageDataEdge.md)

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


## getUserEdges

> PageDataEdge getUserEdges(pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Edges (getUserEdges)

Returns a page of edges available for current user. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **String**| Maximum amount of entities in a one page | |
| **page** | **String**| Sequence number of page starting from 0 | |
| **type** | **String**| A string value representing the edge type. For example, &#39;default&#39; | [optional] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the edge name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, type, label, customerTitle] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataEdge**](PageDataEdge.md)

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


## isEdgeUpgradeAvailable

> Boolean isEdgeUpgradeAvailable(edgeId)

Is edge upgrade enabled (isEdgeUpgradeAvailable)

Returns &#39;true&#39; if upgrade available for connected edge, &#39;false&#39; - otherwise.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**| A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

**Boolean**

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


## isEdgesSupportEnabled

> Boolean isEdgesSupportEnabled()

Is edges support enabled (isEdgesSupportEnabled)

Returns &#39;true&#39; if edges support enabled on server, &#39;false&#39; - otherwise.

### Parameters

This endpoint does not need any parameter.

### Return type

**Boolean**

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


## processEdgesBulkImport

> BulkImportResultEdge processEdgesBulkImport(bulkImportRequest)

Import the bulk of edges (processEdgesBulkImport)

There&#39;s an ability to import the bulk of edges using the only .csv file.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bulkImportRequest** | [**BulkImportRequest**](BulkImportRequest.md)|  | |

### Return type

[**BulkImportResultEdge**](BulkImportResultEdge.md)

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


## saveEdge

> Edge saveEdge(edge, entityGroupId, entityGroupIds)

Create Or Update Edge (saveEdge)

Create or update the Edge. When creating edge, platform generates Edge Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created edge id will be present in the response. Specify existing Edge id to update the edge. Referencing non-existing Edge Id will cause &#39;Not Found&#39; error.  Edge name is unique in the scope of tenant. Use unique identifiers like MAC or IMEI for the edge names and non-unique &#39;label&#39; field for user-friendly visualization purposes.Remove &#39;id&#39;, &#39;tenantId&#39; and optionally &#39;customerId&#39; from the request body example (below) to create new Edge entity. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edge** | [**Edge**](Edge.md)|  | |
| **entityGroupId** | **String**|  | [optional] |
| **entityGroupIds** | [**List&lt;String&gt;**](String.md)| A list of entity group ids, separated by comma &#39;,&#39; | [optional] |

### Return type

[**Edge**](Edge.md)

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


## setEdgeRootRuleChain

> Edge setEdgeRootRuleChain(edgeId, ruleChainId)

Set root rule chain for provided edge (setEdgeRootRuleChain)

Change root rule chain of the edge to the new provided rule chain.  This operation will send a notification to update root rule chain on remote edge service.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**| A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **ruleChainId** | **String**| A string value representing the rule chain id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**Edge**](Edge.md)

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


## syncEdge

> String syncEdge(edgeId)

Sync edge (syncEdge)

Starts synchronization process between edge and cloud.  All entities that are assigned to particular edge are going to be send to remote edge service.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**| A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

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

