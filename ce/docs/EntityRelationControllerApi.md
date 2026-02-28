# EntityRelationControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteRelation**](EntityRelationControllerApi.md#deleteRelation) | **DELETE** /api/relation | Delete Relation (deleteRelation) |
| [**deleteRelationV2**](EntityRelationControllerApi.md#deleteRelationV2) | **DELETE** /api/v2/relation | Delete Relation (deleteRelationV2) |
| [**deleteRelations**](EntityRelationControllerApi.md#deleteRelations) | **DELETE** /api/relations | Delete common relations (deleteCommonRelations) |
| [**findByFromAndRelationType**](EntityRelationControllerApi.md#findByFromAndRelationType) | **GET** /api/relations/from/{fromType}/{fromId}/{relationType} | Get List of Relations (findByFromAndRelationType) |
| [**findByFromV2**](EntityRelationControllerApi.md#findByFromV2) | **GET** /api/relations/from/{fromType}/{fromId} | Get List of Relations (findByFromV2) |
| [**findByQuery**](EntityRelationControllerApi.md#findByQuery) | **POST** /api/relations | Find related entities (findByQuery) |
| [**findByToAndRelationType**](EntityRelationControllerApi.md#findByToAndRelationType) | **GET** /api/relations/to/{toType}/{toId}/{relationType} | Get List of Relations (findByToAndRelationType) |
| [**findByToV2**](EntityRelationControllerApi.md#findByToV2) | **GET** /api/relations/to/{toType}/{toId} | Get List of Relations (findByToV2) |
| [**findInfoByFromV2**](EntityRelationControllerApi.md#findInfoByFromV2) | **GET** /api/relations/info/from/{fromType}/{fromId} | Get List of Relation Infos (findInfoByFromV2) |
| [**findInfoByQuery**](EntityRelationControllerApi.md#findInfoByQuery) | **POST** /api/relations/info | Find related entity infos (findInfoByQuery) |
| [**findInfoByToV2**](EntityRelationControllerApi.md#findInfoByToV2) | **GET** /api/relations/info/to/{toType}/{toId} | Get List of Relation Infos (findInfoByToV2) |
| [**getRelation**](EntityRelationControllerApi.md#getRelation) | **GET** /api/relation | Get Relation (getRelation) |
| [**saveRelation**](EntityRelationControllerApi.md#saveRelation) | **POST** /api/relation | Create Relation (saveRelation) |
| [**saveRelationV2**](EntityRelationControllerApi.md#saveRelationV2) | **POST** /api/v2/relation | Create Relation (saveRelationV2) |



## deleteRelation

> deleteRelation(fromId, fromType, relationType, toId, toType, relationTypeGroup)

Delete Relation (deleteRelation)

Deletes a relation between two entities in the platform.   If the user has the authority of &#39;System Administrator&#39;, the server checks that &#39;from&#39; and &#39;to&#39; entities are owned by the sysadmin. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that &#39;from&#39; and &#39;to&#39; entities are owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the &#39;from&#39; and &#39;to&#39; entities are assigned to the same customer.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fromId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **fromType** | **String**| A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **relationType** | **String**| A string value representing relation type between entities. For example, &#39;Contains&#39;, &#39;Manages&#39;. It can be any string value. | |
| **toId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **toType** | **String**| A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **relationTypeGroup** | **String**| A string value representing relation type group. For example, &#39;COMMON&#39; | [optional] |

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


## deleteRelationV2

> EntityRelation deleteRelationV2(fromId, fromType, relationType, toId, toType, relationTypeGroup)

Delete Relation (deleteRelationV2)

Deletes a relation between two entities in the platform.   If the user has the authority of &#39;System Administrator&#39;, the server checks that &#39;from&#39; and &#39;to&#39; entities are owned by the sysadmin. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that &#39;from&#39; and &#39;to&#39; entities are owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the &#39;from&#39; and &#39;to&#39; entities are assigned to the same customer.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fromId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **fromType** | **String**| A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **relationType** | **String**| A string value representing relation type between entities. For example, &#39;Contains&#39;, &#39;Manages&#39;. It can be any string value. | |
| **toId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **toType** | **String**| A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **relationTypeGroup** | **String**| A string value representing relation type group. For example, &#39;COMMON&#39; | [optional] |

### Return type

[**EntityRelation**](EntityRelation.md)

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


## deleteRelations

> deleteRelations(entityId, entityType)

Delete common relations (deleteCommonRelations)

Deletes all the relations (&#39;from&#39; and &#39;to&#39; direction) for the specified entity and relation type group: &#39;COMMON&#39;.   If the user has the authority of &#39;System Administrator&#39;, the server checks that the entity is owned by the sysadmin. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that the entity is owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the entity is assigned to the same customer.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **entityType** | **String**| A string value representing the entity type. For example, &#39;DEVICE&#39; | |

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


## findByFromAndRelationType

> List&lt;EntityRelation&gt; findByFromAndRelationType(fromType, fromId, relationType, relationTypeGroup)

Get List of Relations (findByFromAndRelationType)

Returns list of relation objects for the specified entity by the &#39;from&#39; direction and relation type.   If the user has the authority of &#39;System Administrator&#39;, the server checks that the entity is owned by the sysadmin. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that the entity is owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the entity is assigned to the same customer.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fromType** | **String**| A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **fromId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **relationType** | **String**| A string value representing relation type between entities. For example, &#39;Contains&#39;, &#39;Manages&#39;. It can be any string value. | |
| **relationTypeGroup** | **String**| A string value representing relation type group. For example, &#39;COMMON&#39; | [optional] |

### Return type

[**List&lt;EntityRelation&gt;**](EntityRelation.md)

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


## findByFromV2

> List&lt;EntityRelation&gt; findByFromV2(fromType, fromId, relationTypeGroup)

Get List of Relations (findByFromV2)

Returns list of relation objects for the specified entity by the &#39;from&#39; direction.   If the user has the authority of &#39;System Administrator&#39;, the server checks that the entity is owned by the sysadmin. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that the entity is owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the entity is assigned to the same customer.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fromType** | **String**| A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **fromId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **relationTypeGroup** | **String**| A string value representing relation type group. For example, &#39;COMMON&#39; | [optional] |

### Return type

[**List&lt;EntityRelation&gt;**](EntityRelation.md)

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


## findByQuery

> List&lt;EntityRelation&gt; findByQuery(entityRelationsQuery)

Find related entities (findByQuery)

Returns all entities that are related to the specific entity. The entity id, relation type, entity types, depth of the search, and other query parameters defined using complex &#39;EntityRelationsQuery&#39; object. See &#39;Model&#39; tab of the Parameters for more info.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityRelationsQuery** | [**EntityRelationsQuery**](EntityRelationsQuery.md)|  | |

### Return type

[**List&lt;EntityRelation&gt;**](EntityRelation.md)

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


## findByToAndRelationType

> List&lt;EntityRelation&gt; findByToAndRelationType(toType, toId, relationType, relationTypeGroup)

Get List of Relations (findByToAndRelationType)

Returns list of relation objects for the specified entity by the &#39;to&#39; direction and relation type.   If the user has the authority of &#39;System Administrator&#39;, the server checks that the entity is owned by the sysadmin. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that the entity is owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the entity is assigned to the same customer.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toType** | **String**| A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **toId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **relationType** | **String**| A string value representing relation type between entities. For example, &#39;Contains&#39;, &#39;Manages&#39;. It can be any string value. | |
| **relationTypeGroup** | **String**| A string value representing relation type group. For example, &#39;COMMON&#39; | [optional] |

### Return type

[**List&lt;EntityRelation&gt;**](EntityRelation.md)

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


## findByToV2

> List&lt;EntityRelation&gt; findByToV2(toType, toId, relationTypeGroup)

Get List of Relations (findByToV2)

Returns list of relation objects for the specified entity by the &#39;to&#39; direction.   If the user has the authority of &#39;System Administrator&#39;, the server checks that the entity is owned by the sysadmin. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that the entity is owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the entity is assigned to the same customer.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toType** | **String**| A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **toId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **relationTypeGroup** | **String**| A string value representing relation type group. For example, &#39;COMMON&#39; | [optional] |

### Return type

[**List&lt;EntityRelation&gt;**](EntityRelation.md)

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


## findInfoByFromV2

> List&lt;EntityRelationInfo&gt; findInfoByFromV2(fromType, fromId, relationTypeGroup)

Get List of Relation Infos (findInfoByFromV2)

Returns list of relation info objects for the specified entity by the &#39;from&#39; direction.   If the user has the authority of &#39;System Administrator&#39;, the server checks that the entity is owned by the sysadmin. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that the entity is owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the entity is assigned to the same customer. Relation Info is an extension of the default Relation object that contains information about the &#39;from&#39; and &#39;to&#39; entity names. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fromType** | **String**| A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **fromId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **relationTypeGroup** | **String**| A string value representing relation type group. For example, &#39;COMMON&#39; | [optional] |

### Return type

[**List&lt;EntityRelationInfo&gt;**](EntityRelationInfo.md)

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


## findInfoByQuery

> List&lt;EntityRelationInfo&gt; findInfoByQuery(entityRelationsQuery)

Find related entity infos (findInfoByQuery)

Returns all entity infos that are related to the specific entity. The entity id, relation type, entity types, depth of the search, and other query parameters defined using complex &#39;EntityRelationsQuery&#39; object. See &#39;Model&#39; tab of the Parameters for more info. Relation Info is an extension of the default Relation object that contains information about the &#39;from&#39; and &#39;to&#39; entity names. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityRelationsQuery** | [**EntityRelationsQuery**](EntityRelationsQuery.md)|  | |

### Return type

[**List&lt;EntityRelationInfo&gt;**](EntityRelationInfo.md)

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


## findInfoByToV2

> List&lt;EntityRelationInfo&gt; findInfoByToV2(toType, toId, relationTypeGroup)

Get List of Relation Infos (findInfoByToV2)

Returns list of relation info objects for the specified entity by the &#39;to&#39; direction.   If the user has the authority of &#39;System Administrator&#39;, the server checks that the entity is owned by the sysadmin. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that the entity is owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the entity is assigned to the same customer. Relation Info is an extension of the default Relation object that contains information about the &#39;from&#39; and &#39;to&#39; entity names. 

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toType** | **String**| A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **toId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **relationTypeGroup** | **String**| A string value representing relation type group. For example, &#39;COMMON&#39; | [optional] |

### Return type

[**List&lt;EntityRelationInfo&gt;**](EntityRelationInfo.md)

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


## getRelation

> EntityRelation getRelation(fromId, fromType, relationType, toId, toType, relationTypeGroup)

Get Relation (getRelation)

Returns relation object between two specified entities if present. Otherwise throws exception.   If the user has the authority of &#39;System Administrator&#39;, the server checks that &#39;from&#39; and &#39;to&#39; entities are owned by the sysadmin. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that &#39;from&#39; and &#39;to&#39; entities are owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the &#39;from&#39; and &#39;to&#39; entities are assigned to the same customer.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fromId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **fromType** | **String**| A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **relationType** | **String**| A string value representing relation type between entities. For example, &#39;Contains&#39;, &#39;Manages&#39;. It can be any string value. | |
| **toId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **toType** | **String**| A string value representing the entity type. For example, &#39;DEVICE&#39; | |
| **relationTypeGroup** | **String**| A string value representing relation type group. For example, &#39;COMMON&#39; | [optional] |

### Return type

[**EntityRelation**](EntityRelation.md)

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


## saveRelation

> saveRelation(entityRelation)

Create Relation (saveRelation)

Creates or updates a relation between two entities in the platform. Relations unique key is a combination of from/to entity id and relation type group and relation type.   If the user has the authority of &#39;System Administrator&#39;, the server checks that &#39;from&#39; and &#39;to&#39; entities are owned by the sysadmin. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that &#39;from&#39; and &#39;to&#39; entities are owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the &#39;from&#39; and &#39;to&#39; entities are assigned to the same customer.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityRelation** | [**EntityRelation**](EntityRelation.md)|  | |

### Return type

null (empty response body)

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


## saveRelationV2

> EntityRelation saveRelationV2(entityRelation)

Create Relation (saveRelationV2)

Creates or updates a relation between two entities in the platform. Relations unique key is a combination of from/to entity id and relation type group and relation type.   If the user has the authority of &#39;System Administrator&#39;, the server checks that &#39;from&#39; and &#39;to&#39; entities are owned by the sysadmin. If the user has the authority of &#39;Tenant Administrator&#39;, the server checks that &#39;from&#39; and &#39;to&#39; entities are owned by the same tenant. If the user has the authority of &#39;Customer User&#39;, the server checks that the &#39;from&#39; and &#39;to&#39; entities are assigned to the same customer.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityRelation** | [**EntityRelation**](EntityRelation.md)|  | |

### Return type

[**EntityRelation**](EntityRelation.md)

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

