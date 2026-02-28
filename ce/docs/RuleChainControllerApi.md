# RuleChainControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignRuleChainToEdge**](RuleChainControllerApi.md#assignRuleChainToEdge) | **POST** /api/edge/{edgeId}/ruleChain/{ruleChainId} | Assign rule chain to edge (assignRuleChainToEdge) |
| [**deleteRuleChain**](RuleChainControllerApi.md#deleteRuleChain) | **DELETE** /api/ruleChain/{ruleChainId} | Delete rule chain (deleteRuleChain) |
| [**exportRuleChains**](RuleChainControllerApi.md#exportRuleChains) | **GET** /api/ruleChains/export | Export Rule Chains |
| [**getAutoAssignToEdgeRuleChains**](RuleChainControllerApi.md#getAutoAssignToEdgeRuleChains) | **GET** /api/ruleChain/autoAssignToEdgeRuleChains | Get Auto Assign To Edge Rule Chains (getAutoAssignToEdgeRuleChains) |
| [**getEdgeRuleChains**](RuleChainControllerApi.md#getEdgeRuleChains) | **GET** /api/edge/{edgeId}/ruleChains | Get Edge Rule Chains (getEdgeRuleChains) |
| [**getLatestRuleNodeDebugInput**](RuleChainControllerApi.md#getLatestRuleNodeDebugInput) | **GET** /api/ruleNode/{ruleNodeId}/debugIn | Get latest input message (getLatestRuleNodeDebugInput) |
| [**getRuleChainById**](RuleChainControllerApi.md#getRuleChainById) | **GET** /api/ruleChain/{ruleChainId} | Get Rule Chain (getRuleChainById) |
| [**getRuleChainMetaData**](RuleChainControllerApi.md#getRuleChainMetaData) | **GET** /api/ruleChain/{ruleChainId}/metadata | Get Rule Chain (getRuleChainById) |
| [**getRuleChainOutputLabels**](RuleChainControllerApi.md#getRuleChainOutputLabels) | **GET** /api/ruleChain/{ruleChainId}/output/labels | Get Rule Chain output labels (getRuleChainOutputLabels) |
| [**getRuleChainOutputLabelsUsage**](RuleChainControllerApi.md#getRuleChainOutputLabelsUsage) | **GET** /api/ruleChain/{ruleChainId}/output/labels/usage | Get output labels usage (getRuleChainOutputLabelsUsage) |
| [**getRuleChains**](RuleChainControllerApi.md#getRuleChains) | **GET** /api/ruleChains | Get Rule Chains (getRuleChains) |
| [**getRuleChainsByIdsV2**](RuleChainControllerApi.md#getRuleChainsByIdsV2) | **GET** /api/ruleChains/list | Get Rule Chains By Ids (getRuleChainsByIdsV2) |
| [**importRuleChains**](RuleChainControllerApi.md#importRuleChains) | **POST** /api/ruleChains/import | Import Rule Chains |
| [**isTbelEnabled**](RuleChainControllerApi.md#isTbelEnabled) | **GET** /api/ruleChain/tbelEnabled | Is TBEL script executor enabled |
| [**saveRuleChain**](RuleChainControllerApi.md#saveRuleChain) | **POST** /api/ruleChain | Create Or Update Rule Chain (saveRuleChain) |
| [**saveRuleChain1**](RuleChainControllerApi.md#saveRuleChain1) | **POST** /api/ruleChain/device/default | Create Default Rule Chain |
| [**saveRuleChainMetaData**](RuleChainControllerApi.md#saveRuleChainMetaData) | **POST** /api/ruleChain/metadata | Update Rule Chain Metadata |
| [**setAutoAssignToEdgeRuleChain**](RuleChainControllerApi.md#setAutoAssignToEdgeRuleChain) | **POST** /api/ruleChain/{ruleChainId}/autoAssignToEdge | Set Auto Assign To Edge Rule Chain (setAutoAssignToEdgeRuleChain) |
| [**setEdgeTemplateRootRuleChain**](RuleChainControllerApi.md#setEdgeTemplateRootRuleChain) | **POST** /api/ruleChain/{ruleChainId}/edgeTemplateRoot | Set Edge Template Root Rule Chain (setEdgeTemplateRootRuleChain) |
| [**setRootRuleChain**](RuleChainControllerApi.md#setRootRuleChain) | **POST** /api/ruleChain/{ruleChainId}/root | Set Root Rule Chain (setRootRuleChain) |
| [**testScript**](RuleChainControllerApi.md#testScript) | **POST** /api/ruleChain/testScript | Test Script function |
| [**unassignRuleChainFromEdge**](RuleChainControllerApi.md#unassignRuleChainFromEdge) | **DELETE** /api/edge/{edgeId}/ruleChain/{ruleChainId} | Unassign rule chain from edge (unassignRuleChainFromEdge) |
| [**unsetAutoAssignToEdgeRuleChain**](RuleChainControllerApi.md#unsetAutoAssignToEdgeRuleChain) | **DELETE** /api/ruleChain/{ruleChainId}/autoAssignToEdge | Unset Auto Assign To Edge Rule Chain (unsetAutoAssignToEdgeRuleChain) |



## assignRuleChainToEdge

> RuleChain assignRuleChainToEdge(edgeId, ruleChainId)

Assign rule chain to edge (assignRuleChainToEdge)

Creates assignment of an existing rule chain to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment rule chain (Edge will receive this instantly, if it&#39;s currently connected, or once it&#39;s going to be connected to platform). Third, once rule chain will be delivered to edge service, it&#39;s going to start processing messages locally.   Only rule chain with type &#39;EDGE&#39; can be assigned to edge.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**|  | |
| **ruleChainId** | **String**|  | |

### Return type

[**RuleChain**](RuleChain.md)

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


## deleteRuleChain

> deleteRuleChain(ruleChainId)

Delete rule chain (deleteRuleChain)

Deletes the rule chain. Referencing non-existing rule chain Id will cause an error. Referencing rule chain that is used in the device profiles will cause an error.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainId** | **String**| A string value representing the rule chain id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

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


## exportRuleChains

> RuleChainData exportRuleChains(limit)

Export Rule Chains

Exports all tenant rule chains as one JSON.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| A limit of rule chains to export. | |

### Return type

[**RuleChainData**](RuleChainData.md)

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


## getAutoAssignToEdgeRuleChains

> List&lt;RuleChain&gt; getAutoAssignToEdgeRuleChains()

Get Auto Assign To Edge Rule Chains (getAutoAssignToEdgeRuleChains)

Returns a list of Rule Chains that will be assigned to a newly created edge. The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate &#39;metadata&#39; object.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;RuleChain&gt;**](RuleChain.md)

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


## getEdgeRuleChains

> PageDataRuleChain getEdgeRuleChains(edgeId, pageSize, page, textSearch, sortProperty, sortOrder)

Get Edge Rule Chains (getEdgeRuleChains)

Returns a page of Rule Chains assigned to the specified edge. The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate &#39;metadata&#39; object.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**| A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the rule chain name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, root] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataRuleChain**](PageDataRuleChain.md)

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


## getLatestRuleNodeDebugInput

> com.fasterxml.jackson.databind.JsonNode getLatestRuleNodeDebugInput(ruleNodeId)

Get latest input message (getLatestRuleNodeDebugInput)

Gets the input message from the debug events for specified Rule Chain Id. Referencing non-existing rule chain Id will cause an error.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleNodeId** | **String**| A string value representing the rule node id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

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


## getRuleChainById

> RuleChain getRuleChainById(ruleChainId)

Get Rule Chain (getRuleChainById)

Fetch the Rule Chain object based on the provided Rule Chain Id. The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate &#39;metadata&#39; object.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainId** | **String**| A string value representing the rule chain id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**RuleChain**](RuleChain.md)

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


## getRuleChainMetaData

> RuleChainMetaData getRuleChainMetaData(ruleChainId)

Get Rule Chain (getRuleChainById)

Fetch the Rule Chain Metadata object based on the provided Rule Chain Id. The metadata object contains information about the rule nodes and their connections.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainId** | **String**| A string value representing the rule chain id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**RuleChainMetaData**](RuleChainMetaData.md)

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


## getRuleChainOutputLabels

> Set&lt;String&gt; getRuleChainOutputLabels(ruleChainId)

Get Rule Chain output labels (getRuleChainOutputLabels)

Fetch the unique labels for the \&quot;output\&quot; Rule Nodes that belong to the Rule Chain based on the provided Rule Chain Id. The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate &#39;metadata&#39; object.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainId** | **String**| A string value representing the rule chain id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

**Set&lt;String&gt;**

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


## getRuleChainOutputLabelsUsage

> List&lt;RuleChainOutputLabelsUsage&gt; getRuleChainOutputLabelsUsage(ruleChainId)

Get output labels usage (getRuleChainOutputLabelsUsage)

Fetch the list of rule chains and the relation types (labels) they use to process output of the current rule chain based on the provided Rule Chain Id. The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate &#39;metadata&#39; object.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainId** | **String**| A string value representing the rule chain id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**List&lt;RuleChainOutputLabelsUsage&gt;**](RuleChainOutputLabelsUsage.md)

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


## getRuleChains

> PageDataRuleChain getRuleChains(pageSize, page, type, textSearch, sortProperty, sortOrder)

Get Rule Chains (getRuleChains)

Returns a page of Rule Chains owned by tenant. The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate &#39;metadata&#39; object.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Maximum amount of entities in a one page | |
| **page** | **Integer**| Sequence number of page starting from 0 | |
| **type** | **String**| Rule chain type (CORE or EDGE) | [optional] [enum: CORE, EDGE] |
| **textSearch** | **String**| The case insensitive &#39;substring&#39; filter based on the rule chain name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] [enum: createdTime, name, root] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataRuleChain**](PageDataRuleChain.md)

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


## getRuleChainsByIdsV2

> List&lt;RuleChain&gt; getRuleChainsByIdsV2(ruleChainIds)

Get Rule Chains By Ids (getRuleChainsByIdsV2)

Requested rule chains must be owned by tenant which is performing the request.   

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainIds** | [**List&lt;String&gt;**](String.md)| A list of rule chain ids, separated by comma &#39;,&#39; | |

### Return type

[**List&lt;RuleChain&gt;**](RuleChain.md)

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


## importRuleChains

> List&lt;RuleChainImportResult&gt; importRuleChains(ruleChainData, overwrite)

Import Rule Chains

Imports all tenant rule chains as one JSON.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainData** | [**RuleChainData**](RuleChainData.md)|  | |
| **overwrite** | **Boolean**| Enables overwrite for existing rule chains with the same name. | [optional] [default to false] |

### Return type

[**List&lt;RuleChainImportResult&gt;**](RuleChainImportResult.md)

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


## isTbelEnabled

> Boolean isTbelEnabled()

Is TBEL script executor enabled

Returns &#39;True&#39; if the TBEL script execution is enabled  Available for users with &#39;TENANT_ADMIN&#39; authority.

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


## saveRuleChain

> RuleChain saveRuleChain(ruleChain)

Create Or Update Rule Chain (saveRuleChain)

Create or update the Rule Chain. When creating Rule Chain, platform generates Rule Chain Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Rule Chain Id will be present in the response. Specify existing Rule Chain id to update the rule chain. Referencing non-existing rule chain Id will cause &#39;Not Found&#39; error.  The rule chain object is lightweight and contains general information about the rule chain. List of rule nodes and their connection is stored in a separate &#39;metadata&#39; object.Remove &#39;id&#39;, &#39;tenantId&#39; from the request body example (below) to create new Rule Chain entity.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChain** | [**RuleChain**](RuleChain.md)|  | |

### Return type

[**RuleChain**](RuleChain.md)

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


## saveRuleChain1

> RuleChain saveRuleChain1(defaultRuleChainCreateRequest)

Create Default Rule Chain

Create rule chain from template, based on the specified name in the request. Creates the rule chain based on the template that is used to create root rule chain.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **defaultRuleChainCreateRequest** | [**DefaultRuleChainCreateRequest**](DefaultRuleChainCreateRequest.md)|  | |

### Return type

[**RuleChain**](RuleChain.md)

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


## saveRuleChainMetaData

> RuleChainMetaData saveRuleChainMetaData(ruleChainMetaData, updateRelated)

Update Rule Chain Metadata

Updates the rule chain metadata. The metadata object contains information about the rule nodes and their connections.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainMetaData** | [**RuleChainMetaData**](RuleChainMetaData.md)|  | |
| **updateRelated** | **Boolean**| Update related rule nodes. | [optional] [default to true] |

### Return type

[**RuleChainMetaData**](RuleChainMetaData.md)

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


## setAutoAssignToEdgeRuleChain

> RuleChain setAutoAssignToEdgeRuleChain(ruleChainId)

Set Auto Assign To Edge Rule Chain (setAutoAssignToEdgeRuleChain)

Makes the rule chain to be automatically assigned for any new edge that will be created. Does not assign this rule chain for already created edges.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainId** | **String**| A string value representing the rule chain id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**RuleChain**](RuleChain.md)

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


## setEdgeTemplateRootRuleChain

> RuleChain setEdgeTemplateRootRuleChain(ruleChainId)

Set Edge Template Root Rule Chain (setEdgeTemplateRootRuleChain)

Makes the rule chain to be root rule chain for any new edge that will be created. Does not update root rule chain for already created edges.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainId** | **String**| A string value representing the rule chain id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**RuleChain**](RuleChain.md)

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


## setRootRuleChain

> RuleChain setRootRuleChain(ruleChainId)

Set Root Rule Chain (setRootRuleChain)

Makes the rule chain to be root rule chain. Updates previous root rule chain as well.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainId** | **String**| A string value representing the rule chain id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**RuleChain**](RuleChain.md)

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


## testScript

> com.fasterxml.jackson.databind.JsonNode testScript(body, scriptLang)

Test Script function

Execute the Script function and return the result. The format of request:   &#x60;&#x60;&#x60;json {   \&quot;script\&quot;: \&quot;Your Function as String\&quot;,   \&quot;scriptType\&quot;: \&quot;One of: update, generate, filter, switch, json, string\&quot;,   \&quot;argNames\&quot;: [\&quot;msg\&quot;, \&quot;metadata\&quot;, \&quot;type\&quot;],   \&quot;msg\&quot;: \&quot;{\\\&quot;temperature\\\&quot;: 42}\&quot;,    \&quot;metadata\&quot;: {     \&quot;deviceName\&quot;: \&quot;Device A\&quot;,     \&quot;deviceType\&quot;: \&quot;Thermometer\&quot;   },   \&quot;msgType\&quot;: \&quot;POST_TELEMETRY_REQUEST\&quot; } &#x60;&#x60;&#x60;   Expected result JSON contains \&quot;output\&quot; and \&quot;error\&quot;.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**| Test JS request. See API call description above. | |
| **scriptLang** | [**ScriptLanguage**](.md)| Script language: JS or TBEL | [optional] [enum: JS, TBEL] |

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


## unassignRuleChainFromEdge

> RuleChain unassignRuleChainFromEdge(edgeId, ruleChainId)

Unassign rule chain from edge (unassignRuleChainFromEdge)

Clears assignment of the rule chain to the edge. Unassignment works in async way - first, &#39;unassign&#39; notification event pushed to edge queue on platform. Second, remote edge service will receive an &#39;unassign&#39; command to remove rule chain (Edge will receive this instantly, if it&#39;s currently connected, or once it&#39;s going to be connected to platform). Third, once &#39;unassign&#39; command will be delivered to edge service, it&#39;s going to remove rule chain locally.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**|  | |
| **ruleChainId** | **String**|  | |

### Return type

[**RuleChain**](RuleChain.md)

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


## unsetAutoAssignToEdgeRuleChain

> RuleChain unsetAutoAssignToEdgeRuleChain(ruleChainId)

Unset Auto Assign To Edge Rule Chain (unsetAutoAssignToEdgeRuleChain)

Removes the rule chain from the list of rule chains that are going to be automatically assigned for any new edge that will be created. Does not unassign this rule chain for already assigned edges.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ruleChainId** | **String**| A string value representing the rule chain id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**RuleChain**](RuleChain.md)

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

