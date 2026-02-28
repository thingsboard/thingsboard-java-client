# EntityGroupControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addEntitiesToEntityGroup**](EntityGroupControllerApi.md#addEntitiesToEntityGroup) | **POST** /api/entityGroup/{entityGroupId}/addEntities | Add entities to the group (addEntitiesToEntityGroup) |
| [**assignEntityGroupToEdge**](EntityGroupControllerApi.md#assignEntityGroupToEdge) | **POST** /api/edge/{edgeId}/entityGroup/{entityGroupId}/{groupType} | Assign entity group to edge (assignEntityGroupToEdge) |
| [**deleteEntityGroup**](EntityGroupControllerApi.md#deleteEntityGroup) | **DELETE** /api/entityGroup/{entityGroupId} | Delete Entity Group (deleteEntityGroup) |
| [**getAllEdgeEntityGroups**](EntityGroupControllerApi.md#getAllEdgeEntityGroups) | **GET** /api/allEntityGroups/edge/{edgeId}/{groupType} | Get All Edge Entity Groups by entity type (getAllEdgeEntityGroups) |
| [**getAllEntityGroupsByOwnerAndType**](EntityGroupControllerApi.md#getAllEntityGroupsByOwnerAndType) | **GET** /api/entityGroups/{ownerType}/{ownerId}/{groupType}/all | Get Entity Groups by owner and entity type (getEntityGroupsByOwnerAndTypeList) |
| [**getAllEntityGroupsByType**](EntityGroupControllerApi.md#getAllEntityGroupsByType) | **GET** /api/entityGroups/{groupType}/all | Get Entity Groups by entity type (getAllEntityGroupsByType) |
| [**getAllSharedEntityGroups**](EntityGroupControllerApi.md#getAllSharedEntityGroups) | **GET** /api/entityGroups/{groupType}/shared/all | Get Shared Entity Groups by entity type (getAllSharedEntityGroups) |
| [**getEdgeEntityGroups**](EntityGroupControllerApi.md#getEdgeEntityGroups) | **GET** /api/entityGroups/edge/{edgeId}/{groupType} | Get Edge Entity Groups by entity type (getEdgeEntityGroups) |
| [**getEntities**](EntityGroupControllerApi.md#getEntities) | **GET** /api/entityGroup/{entityGroupId}/entities | Get Group Entities (getEntities) |
| [**getEntityGroupAllByOwnerAndType**](EntityGroupControllerApi.md#getEntityGroupAllByOwnerAndType) | **GET** /api/entityGroup/all/{ownerType}/{ownerId}/{groupType} | Get special group All by owner and entity type (getEntityGroupsByOwnerAndType) |
| [**getEntityGroupById**](EntityGroupControllerApi.md#getEntityGroupById) | **GET** /api/entityGroup/{entityGroupId} | Get Entity Group Info (getEntityGroupById) |
| [**getEntityGroupByOwnerAndNameAndType**](EntityGroupControllerApi.md#getEntityGroupByOwnerAndNameAndType) | **GET** /api/entityGroup/{ownerType}/{ownerId}/{groupType}/{groupName} | Get Entity Group by owner, type and name (getEntityGroupByOwnerAndNameAndType) |
| [**getEntityGroupEntityInfoById**](EntityGroupControllerApi.md#getEntityGroupEntityInfoById) | **GET** /api/entityGroupInfo/{entityGroupId} | Get Entity Group Entity Info (getEntityGroupEntityInfoById) |
| [**getEntityGroupEntityInfosByIds**](EntityGroupControllerApi.md#getEntityGroupEntityInfosByIds) | **GET** /api/entityGroupInfos | Get Entity Group Entity Infos by Ids (getEntityGroupEntityInfosByIds) |
| [**getEntityGroupEntityInfosByOwnerAndTypeAndPageLink**](EntityGroupControllerApi.md#getEntityGroupEntityInfosByOwnerAndTypeAndPageLink) | **GET** /api/entityGroupInfos/{ownerType}/{ownerId}/{groupType} | Get Entity Group Entity Infos by owner and entity type and page link (getEntityGroupEntityInfosByOwnerAndTypeAndPageLink) |
| [**getEntityGroupEntityInfosByTypeAndPageLink**](EntityGroupControllerApi.md#getEntityGroupEntityInfosByTypeAndPageLink) | **GET** /api/entityGroupInfos/{groupType} | Get Entity Group Entity Infos by entity type and page link (getEntityGroupEntityInfosByTypeAndPageLink) |
| [**getEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLink**](EntityGroupControllerApi.md#getEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLink) | **GET** /api/entityGroupInfosHierarchy/{ownerType}/{ownerId}/{groupType} | Get Entity Group Entity Infos for all owners starting from specified than ending with owner of current user (getEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLink) |
| [**getEntityGroupsByIdsV2**](EntityGroupControllerApi.md#getEntityGroupsByIdsV2) | **GET** /api/entityGroups/list | Get Entity Groups by Ids (getEntityGroupsByIdsV2) |
| [**getEntityGroupsByOwnerAndTypeAndPageLink**](EntityGroupControllerApi.md#getEntityGroupsByOwnerAndTypeAndPageLink) | **GET** /api/entityGroups/{ownerType}/{ownerId}/{groupType} | Get Entity Groups by owner and entity type and page link (getEntityGroupsByOwnerAndTypeAndPageLink) |
| [**getEntityGroupsByTypeAndPageLink**](EntityGroupControllerApi.md#getEntityGroupsByTypeAndPageLink) | **GET** /api/entityGroups/{groupType} | Get Entity Groups by entity type and page link (getEntityGroupsByTypeAndPageLink) |
| [**getEntityGroupsForEntity**](EntityGroupControllerApi.md#getEntityGroupsForEntity) | **GET** /api/entityGroups/{entityType}/{entityId} | Get Entity Groups by Entity Id (getEntityGroupsForEntity) |
| [**getEntityGroupsHierarchyByOwnerAndTypeAndPageLink**](EntityGroupControllerApi.md#getEntityGroupsHierarchyByOwnerAndTypeAndPageLink) | **GET** /api/entityGroupsHierarchy/{ownerType}/{ownerId}/{groupType} | Get Entity Groups for all owners starting from specified than ending with owner of current user (getEntityGroupsHierarchyByOwnerAndTypeAndPageLink) |
| [**getGroupEntity**](EntityGroupControllerApi.md#getGroupEntity) | **GET** /api/entityGroup/{entityGroupId}/{entityId} | Get Group Entity (getGroupEntity) |
| [**getOwnerInfo**](EntityGroupControllerApi.md#getOwnerInfo) | **GET** /api/ownerInfo/{ownerType}/{ownerId} | Get Owner Info (getOwnerInfo) |
| [**getOwnerInfos**](EntityGroupControllerApi.md#getOwnerInfos) | **GET** /api/ownerInfos | Get Owner Infos (getOwnerInfos) |
| [**getOwners**](EntityGroupControllerApi.md#getOwners) | **GET** /api/owners | Get Owners (getOwners) |
| [**getSharedEntityGroupEntityInfosByTypeAndPageLink**](EntityGroupControllerApi.md#getSharedEntityGroupEntityInfosByTypeAndPageLink) | **GET** /api/entityGroupInfos/{groupType}/shared | Get Shared Entity Group Entity Infos by entity type and page link (getSharedEntityGroupEntityInfosByTypeAndPageLink) |
| [**getSharedEntityGroupsByTypeAndPageLink**](EntityGroupControllerApi.md#getSharedEntityGroupsByTypeAndPageLink) | **GET** /api/entityGroups/{groupType}/shared | Get Shared Entity Groups by entity type and page link (getSharedEntityGroupsByTypeAndPageLink) |
| [**makeEntityGroupPrivate**](EntityGroupControllerApi.md#makeEntityGroupPrivate) | **POST** /api/entityGroup/{entityGroupId}/makePrivate | Make Entity Group Private (makeEntityGroupPrivate) |
| [**makeEntityGroupPublic**](EntityGroupControllerApi.md#makeEntityGroupPublic) | **POST** /api/entityGroup/{entityGroupId}/makePublic | Make Entity Group Publicly available (makeEntityGroupPublic) |
| [**removeEntitiesFromEntityGroup**](EntityGroupControllerApi.md#removeEntitiesFromEntityGroup) | **POST** /api/entityGroup/{entityGroupId}/deleteEntities | Remove entities from the group (removeEntitiesFromEntityGroup) |
| [**saveEntityGroup**](EntityGroupControllerApi.md#saveEntityGroup) | **POST** /api/entityGroup | Create Or Update Entity Group (saveEntityGroup) |
| [**shareEntityGroup**](EntityGroupControllerApi.md#shareEntityGroup) | **POST** /api/entityGroup/{entityGroupId}/share | Share the Entity Group (shareEntityGroup) |
| [**shareEntityGroupToChildOwnerUserGroup**](EntityGroupControllerApi.md#shareEntityGroupToChildOwnerUserGroup) | **POST** /api/entityGroup/{entityGroupId}/{userGroupId}/{roleId}/share | Share the Entity Group with User group (shareEntityGroupToChildOwnerUserGroup) |
| [**unassignEntityGroupFromEdge**](EntityGroupControllerApi.md#unassignEntityGroupFromEdge) | **DELETE** /api/edge/{edgeId}/entityGroup/{entityGroupId}/{groupType} | Unassign entity group from edge (unassignEntityGroupFromEdge) |



## addEntitiesToEntityGroup

> addEntitiesToEntityGroup(entityGroupId, requestBody)

Add entities to the group (addEntitiesToEntityGroup)

Add entities to the specified entity group. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;ADD_TO_GROUP&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String**| A string value representing the Entity Group Id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | |

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


## assignEntityGroupToEdge

> EntityGroup assignEntityGroupToEdge(edgeId, groupType, entityGroupId)

Assign entity group to edge (assignEntityGroupToEdge)

Creates assignment of an existing entity group to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment entity group (Edge will receive this instantly, if it&#39;s currently connected, or once it&#39;s going to be connected to platform). Third, once entity group will be delivered to edge service, edge will request entities of this group to be send to edge. Once entities will be delivered to edge service, they are going to be available for usage on remote edge instance.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;WRITE&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**| A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **groupType** | **String**| EntityGroup type | [enum: ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD] |
| **entityGroupId** | **String**| A string value representing the Entity Group Id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**EntityGroup**](EntityGroup.md)

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


## deleteEntityGroup

> deleteEntityGroup(entityGroupId)

Delete Entity Group (deleteEntityGroup)

Deletes the entity group but does not delete the entities in the group, since they are also present in reserved group &#39;All&#39;. Referencing non-existing Entity Group Id will cause an error.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;DELETE&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String**| A string value representing the Entity Group Id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

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


## getAllEdgeEntityGroups

> List&lt;EntityGroupInfo&gt; getAllEdgeEntityGroups(edgeId, groupType)

Get All Edge Entity Groups by entity type (getAllEdgeEntityGroups)

Fetch the list of Entity Group Info objects based on the provided Entity Type and assigned to the provided Edge entity. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds &#39;ownerIds&#39; - a list of owner ids.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**| A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **groupType** | **String**| EntityGroup type | [enum: ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD] |

### Return type

[**List&lt;EntityGroupInfo&gt;**](EntityGroupInfo.md)

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


## getAllEntityGroupsByOwnerAndType

> List&lt;EntityGroupInfo&gt; getAllEntityGroupsByOwnerAndType(ownerType, ownerId, groupType)

Get Entity Groups by owner and entity type (getEntityGroupsByOwnerAndTypeList)

Fetch the list of Entity Group Info objects based on the provided Owner Id and Entity Type. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds &#39;ownerIds&#39; - a list of owner ids.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerType** | **String**| Tenant or Customer | [enum: TENANT, CUSTOMER] |
| **ownerId** | **String**| A string value representing the Tenant or Customer id | |
| **groupType** | **String**| Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |

### Return type

[**List&lt;EntityGroupInfo&gt;**](EntityGroupInfo.md)

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


## getAllEntityGroupsByType

> List&lt;EntityGroupInfo&gt; getAllEntityGroupsByType(groupType, includeShared)

Get Entity Groups by entity type (getAllEntityGroupsByType)

Fetch the list of Entity Group Info objects based on the provided Entity Type. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds &#39;ownerIds&#39; - a list of owner ids.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupType** | **String**| Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **includeShared** | **Boolean**| Whether to include shared entity groups. | [optional] |

### Return type

[**List&lt;EntityGroupInfo&gt;**](EntityGroupInfo.md)

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


## getAllSharedEntityGroups

> List&lt;EntityGroupInfo&gt; getAllSharedEntityGroups(groupType)

Get Shared Entity Groups by entity type (getAllSharedEntityGroups)

Fetch the list of Shared Entity Group Info objects based on the provided Entity Type. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds &#39;ownerIds&#39; - a list of owner ids.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupType** | **String**| Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |

### Return type

[**List&lt;EntityGroupInfo&gt;**](EntityGroupInfo.md)

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


## getEdgeEntityGroups

> PageDataEntityGroupInfo getEdgeEntityGroups(edgeId, groupType, pageSize, page, textSearch, sortProperty, sortOrder)

Get Edge Entity Groups by entity type (getEdgeEntityGroups)

Returns a page of Entity Group Info objects based on the provided Entity Type and assigned to the provided Edge entity. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds &#39;ownerIds&#39; - a list of owner ids.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**| A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **groupType** | **String**| EntityGroup type | [enum: ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD] |
| **pageSize** | **String**| Maximum amount of entities in a one page | |
| **page** | **String**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;startsWith&#39; filter based on the entity group name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataEntityGroupInfo**](PageDataEntityGroupInfo.md)

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


## getEntities

> PageDataShortEntityView getEntities(entityGroupId, pageSize, page, textSearch, sortProperty, sortOrder)

Get Group Entities (getEntities)

Returns a page of Short Entity View objects that belongs to specified Entity Group Id. Short Entity View object contains the entity id and number of fields (attributes, telemetry, etc). List of those fields is configurable and defined in the group configuration.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String**| A string value representing the Entity Group Id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **String**| Maximum amount of entities in a one page | |
| **page** | **String**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;startsWith&#39; filter based on the entity group name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataShortEntityView**](PageDataShortEntityView.md)

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


## getEntityGroupAllByOwnerAndType

> EntityGroupInfo getEntityGroupAllByOwnerAndType(ownerType, ownerId, groupType)

Get special group All by owner and entity type (getEntityGroupsByOwnerAndType)

Fetch reserved group &#39;All&#39; based on the provided Owner Id and Entity Type. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds &#39;ownerIds&#39; - a list of owner ids.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerType** | **String**| Tenant or Customer | [enum: TENANT, CUSTOMER] |
| **ownerId** | **String**| A string value representing the Tenant or Customer id | |
| **groupType** | **String**| Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |

### Return type

[**EntityGroupInfo**](EntityGroupInfo.md)

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


## getEntityGroupById

> EntityGroupInfo getEntityGroupById(entityGroupId)

Get Entity Group Info (getEntityGroupById)

Fetch the Entity Group object based on the provided Entity Group Id. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds &#39;ownerIds&#39; - a list of owner ids.  Entity group name is unique in the scope of owner and entity type. For example, you can&#39;t create two tenant device groups called &#39;Water meters&#39;. However, you may create device and asset group with the same name. And also you may create groups with the same name for two different customers of the same tenant.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String**| A string value representing the Entity Group Id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**EntityGroupInfo**](EntityGroupInfo.md)

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


## getEntityGroupByOwnerAndNameAndType

> EntityGroupInfo getEntityGroupByOwnerAndNameAndType(ownerType, ownerId, groupType, groupName)

Get Entity Group by owner, type and name (getEntityGroupByOwnerAndNameAndType)

Fetch the Entity Group object based on the provided Entity Group Id. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds &#39;ownerIds&#39; - a list of owner ids.  Entity group name is unique in the scope of owner and entity type. For example, you can&#39;t create two tenant device groups called &#39;Water meters&#39;. However, you may create device and asset group with the same name. And also you may create groups with the same name for two different customers of the same tenant.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerType** | **String**| Tenant or Customer | [enum: TENANT, CUSTOMER] |
| **ownerId** | **String**| A string value representing the Tenant or Customer id | |
| **groupType** | **String**| Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **groupName** | **String**| Entity Group name | |

### Return type

[**EntityGroupInfo**](EntityGroupInfo.md)

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


## getEntityGroupEntityInfoById

> EntityInfo getEntityGroupEntityInfoById(entityGroupId)

Get Entity Group Entity Info (getEntityGroupEntityInfoById)

Fetch the Entity Group Entity Info object based on the provided Entity Group Id. Entity Info is a lightweight object that contains only id and name of the entity group.   Entity group name is unique in the scope of owner and entity type. For example, you can&#39;t create two tenant device groups called &#39;Water meters&#39;. However, you may create device and asset group with the same name. And also you may create groups with the same name for two different customers of the same tenant.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String**| A string value representing the Entity Group Id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

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


## getEntityGroupEntityInfosByIds

> List&lt;EntityInfo&gt; getEntityGroupEntityInfosByIds(entityGroupIds)

Get Entity Group Entity Infos by Ids (getEntityGroupEntityInfosByIds)

Fetch the list of Entity Group Entity Info objects based on the provided entity group ids list. Entity Info is a lightweight object that contains only id and name of the entity group.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupIds** | [**List&lt;String&gt;**](String.md)| A list of group ids, separated by comma &#39;,&#39; | |

### Return type

[**List&lt;EntityInfo&gt;**](EntityInfo.md)

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


## getEntityGroupEntityInfosByOwnerAndTypeAndPageLink

> PageDataEntityInfo getEntityGroupEntityInfosByOwnerAndTypeAndPageLink(ownerType, ownerId, groupType, pageSize, page, textSearch, sortProperty, sortOrder)

Get Entity Group Entity Infos by owner and entity type and page link (getEntityGroupEntityInfosByOwnerAndTypeAndPageLink)

Returns a page of Entity Group Entity Info objects based on the provided Owner Id and Entity Type and Page Link. Entity Info is a lightweight object that contains only id and name of the entity group. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerType** | **String**| Tenant or Customer | [enum: TENANT, CUSTOMER] |
| **ownerId** | **String**| A string value representing the Tenant or Customer id | |
| **groupType** | **String**| Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **pageSize** | **String**| Maximum amount of entities in a one page | |
| **page** | **String**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;startsWith&#39; filter based on the entity group name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] |
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


## getEntityGroupEntityInfosByTypeAndPageLink

> PageDataEntityInfo getEntityGroupEntityInfosByTypeAndPageLink(groupType, pageSize, page, includeShared, textSearch, sortProperty, sortOrder)

Get Entity Group Entity Infos by entity type and page link (getEntityGroupEntityInfosByTypeAndPageLink)

Returns a page of Entity Group Entity Info objects based on the provided Entity Type and Page Link. Entity Info is a lightweight object that contains only id and name of the entity group. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupType** | **String**| Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **pageSize** | **String**| Maximum amount of entities in a one page | |
| **page** | **String**| Sequence number of page starting from 0 | |
| **includeShared** | **Boolean**| Whether to include shared entity groups. | [optional] |
| **textSearch** | **String**| The case insensitive &#39;startsWith&#39; filter based on the entity group name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] |
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


## getEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLink

> PageDataEntityInfo getEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLink(ownerType, ownerId, groupType, pageSize, page, textSearch, sortProperty, sortOrder)

Get Entity Group Entity Infos for all owners starting from specified than ending with owner of current user (getEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLink)

Returns a page of Entity Group Entity Info objects based on the provided Owner Id and Entity Type and Page Link. Entity Info is a lightweight object that contains only id and name of the entity group. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerType** | **String**| Tenant or Customer | [enum: TENANT, CUSTOMER] |
| **ownerId** | **String**| A string value representing the Tenant or Customer id | |
| **groupType** | **String**| Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **pageSize** | **String**| Maximum amount of entities in a one page | |
| **page** | **String**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;startsWith&#39; filter based on the entity group name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] |
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


## getEntityGroupsByIdsV2

> List&lt;EntityGroupInfo&gt; getEntityGroupsByIdsV2(entityGroupIds)

Get Entity Groups by Ids (getEntityGroupsByIdsV2)

Fetch the list of Entity Group Info objects based on the provided entity group ids list. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds &#39;ownerIds&#39; - a list of owner ids.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupIds** | [**List&lt;String&gt;**](String.md)| A list of group ids, separated by comma &#39;,&#39; | |

### Return type

[**List&lt;EntityGroupInfo&gt;**](EntityGroupInfo.md)

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


## getEntityGroupsByOwnerAndTypeAndPageLink

> PageDataEntityGroupInfo getEntityGroupsByOwnerAndTypeAndPageLink(ownerType, ownerId, groupType, pageSize, page, textSearch, sortProperty, sortOrder)

Get Entity Groups by owner and entity type and page link (getEntityGroupsByOwnerAndTypeAndPageLink)

Returns a page of Entity Group objects based on the provided Owner Id and Entity Type and Page Link. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerType** | **String**| Tenant or Customer | [enum: TENANT, CUSTOMER] |
| **ownerId** | **String**| A string value representing the Tenant or Customer id | |
| **groupType** | **String**| Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **pageSize** | **String**| Maximum amount of entities in a one page | |
| **page** | **String**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;startsWith&#39; filter based on the entity group name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataEntityGroupInfo**](PageDataEntityGroupInfo.md)

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


## getEntityGroupsByTypeAndPageLink

> PageDataEntityGroupInfo getEntityGroupsByTypeAndPageLink(groupType, pageSize, page, includeShared, textSearch, sortProperty, sortOrder)

Get Entity Groups by entity type and page link (getEntityGroupsByTypeAndPageLink)

Returns a page of Entity Group Info objects based on the provided Entity Type and Page Link. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds &#39;ownerIds&#39; - a list of owner ids.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupType** | **String**| Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **pageSize** | **String**| Maximum amount of entities in a one page | |
| **page** | **String**| Sequence number of page starting from 0 | |
| **includeShared** | **Boolean**| Whether to include shared entity groups. | [optional] |
| **textSearch** | **String**| The case insensitive &#39;startsWith&#39; filter based on the entity group name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataEntityGroupInfo**](PageDataEntityGroupInfo.md)

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


## getEntityGroupsForEntity

> List&lt;EntityGroupId&gt; getEntityGroupsForEntity(entityType, entityId)

Get Entity Groups by Entity Id (getEntityGroupsForEntity)

Returns a list of groups that contain the specified Entity Id. For example, all device groups that contain specific device. The list always contain at least one element - special group &#39;All&#39;.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String**| Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **entityId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**List&lt;EntityGroupId&gt;**](EntityGroupId.md)

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


## getEntityGroupsHierarchyByOwnerAndTypeAndPageLink

> PageDataEntityGroupInfo getEntityGroupsHierarchyByOwnerAndTypeAndPageLink(ownerType, ownerId, groupType, pageSize, page, textSearch, sortProperty, sortOrder)

Get Entity Groups for all owners starting from specified than ending with owner of current user (getEntityGroupsHierarchyByOwnerAndTypeAndPageLink)

Returns a page of Entity Group objects based on the provided Owner Id and Entity Type and Page Link. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerType** | **String**| Tenant or Customer | [enum: TENANT, CUSTOMER] |
| **ownerId** | **String**| A string value representing the Tenant or Customer id | |
| **groupType** | **String**| Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **pageSize** | **String**| Maximum amount of entities in a one page | |
| **page** | **String**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;startsWith&#39; filter based on the entity group name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataEntityGroupInfo**](PageDataEntityGroupInfo.md)

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


## getGroupEntity

> ShortEntityView getGroupEntity(entityGroupId, entityId)

Get Group Entity (getGroupEntity)

Fetch the Short Entity View object based on the group and entity id. Short Entity View object contains the entity id and number of fields (attributes, telemetry, etc). List of those fields is configurable and defined in the group configuration.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String**| A string value representing the Entity Group Id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **entityId** | **String**| A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**ShortEntityView**](ShortEntityView.md)

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


## getOwnerInfo

> EntityInfo getOwnerInfo(ownerType, ownerId)

Get Owner Info (getOwnerInfo)

Fetch the owner info (tenant or customer) presented as Entity Info object based on the provided owner Id.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerType** | **String**| Tenant or Customer | [enum: TENANT, CUSTOMER] |
| **ownerId** | **String**| A string value representing the Tenant or Customer id | |

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


## getOwnerInfos

> PageDataEntityInfo getOwnerInfos(pageSize, page, textSearch, sortProperty, sortOrder)

Get Owner Infos (getOwnerInfos)

Provides a rage view of Customers that the current user has READ access to. If the current user is Tenant administrator, the result set also contains the tenant. The call is designed for the UI auto-complete component to show tenant and all possible Customers that the user may select to change the owner of the particular entity or entity group.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **String**| Maximum amount of entities in a one page | |
| **page** | **String**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;startsWith&#39; filter based on the entity group name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] |
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


## getOwners

> PageDataContactBasedObject getOwners(pageSize, page, textSearch, sortProperty, sortOrder)

Get Owners (getOwners)

Provides a rage view of Customers that the current user has READ access to. If the current user is Tenant administrator, the result set also contains the tenant. The call is designed for the UI auto-complete component to show tenant and all possible Customers that the user may select to change the owner of the particular entity or entity group.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **String**| Maximum amount of entities in a one page | |
| **page** | **String**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;startsWith&#39; filter based on the entity group name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataContactBasedObject**](PageDataContactBasedObject.md)

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


## getSharedEntityGroupEntityInfosByTypeAndPageLink

> PageDataEntityInfo getSharedEntityGroupEntityInfosByTypeAndPageLink(groupType, pageSize, page, textSearch, sortProperty, sortOrder)

Get Shared Entity Group Entity Infos by entity type and page link (getSharedEntityGroupEntityInfosByTypeAndPageLink)

Returns a page of Shared Entity Group Entity Info objects based on the provided Entity Type and Page Link. Entity Info is a lightweight object that contains only id and name of the entity group. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupType** | **String**| Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **pageSize** | **String**| Maximum amount of entities in a one page | |
| **page** | **String**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;startsWith&#39; filter based on the entity group name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] |
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


## getSharedEntityGroupsByTypeAndPageLink

> PageDataEntityGroupInfo getSharedEntityGroupsByTypeAndPageLink(groupType, pageSize, page, textSearch, sortProperty, sortOrder)

Get Shared Entity Groups by entity type and page link (getSharedEntityGroupsByTypeAndPageLink)

Returns a page of Shared Entity Group Info objects based on the provided Entity Type and Page Link. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds &#39;ownerIds&#39; - a list of owner ids.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;READ&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupType** | **String**| Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **pageSize** | **String**| Maximum amount of entities in a one page | |
| **page** | **String**| Sequence number of page starting from 0 | |
| **textSearch** | **String**| The case insensitive &#39;startsWith&#39; filter based on the entity group name. | [optional] |
| **sortProperty** | **String**| Property of entity to sort by | [optional] |
| **sortOrder** | **String**| Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

[**PageDataEntityGroupInfo**](PageDataEntityGroupInfo.md)

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


## makeEntityGroupPrivate

> makeEntityGroupPrivate(entityGroupId)

Make Entity Group Private (makeEntityGroupPrivate)

Make the entity group not available for non authorized users. Every group is private by default. This call is useful to hide the group that was previously made public.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;WRITE&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String**| A string value representing the Entity Group Id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

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


## makeEntityGroupPublic

> makeEntityGroupPublic(entityGroupId)

Make Entity Group Publicly available (makeEntityGroupPublic)

Make the entity group available for non authorized users. Useful for public dashboards that will be embedded into the public websites.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;WRITE&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String**| A string value representing the Entity Group Id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

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


## removeEntitiesFromEntityGroup

> removeEntitiesFromEntityGroup(entityGroupId, requestBody)

Remove entities from the group (removeEntitiesFromEntityGroup)

Removes entities from the specified entity group. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;REMOVE_FROM_GROUP&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String**| A string value representing the Entity Group Id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | |

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


## saveEntityGroup

> EntityGroupInfo saveEntityGroup(entityGroup)

Create Or Update Entity Group (saveEntityGroup)

Create or update the Entity Group. When creating Entity Group, platform generates Entity Group Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Entity Group Id will be present in the response. Specify existing Entity Group Id to update the group. Referencing non-existing Entity Group Id will cause &#39;Not Found&#39; error.Remove &#39;id&#39;, &#39;tenantId&#39; and optionally &#39;ownerId&#39; from the request body example (below) to create new Entity Group entity.   Entity group name is unique in the scope of owner and entity type. For example, you can&#39;t create two tenant device groups called &#39;Water meters&#39;. However, you may create device and asset group with the same name. And also you may create groups with the same name for two different customers of the same tenant.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;WRITE&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroup** | [**EntityGroup**](EntityGroup.md)|  | |

### Return type

[**EntityGroupInfo**](EntityGroupInfo.md)

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


## shareEntityGroup

> shareEntityGroup(entityGroupId, shareGroupRequest)

Share the Entity Group (shareEntityGroup)

Share the entity group with certain user group based on the provided Share Group Request. The request is quite flexible and processing of the request involves multiple security checks using platform RBAC feature.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;WRITE&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String**| A string value representing the Entity Group Id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **shareGroupRequest** | [**ShareGroupRequest**](ShareGroupRequest.md)|  | |

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


## shareEntityGroupToChildOwnerUserGroup

> shareEntityGroupToChildOwnerUserGroup(entityGroupId, userGroupId, roleId)

Share the Entity Group with User group (shareEntityGroupToChildOwnerUserGroup)

Share the entity group with specified user group using specified role.   Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;WRITE&#39; permission for specified group.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String**| A string value representing the Entity Group Id that you would like to share. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **userGroupId** | **String**| A string value representing the Entity(User) Group Id that you would like to share with. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **roleId** | **String**| A string value representing the Role Id that describes set of permissions you would like to share (read, write, etc). For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

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


## unassignEntityGroupFromEdge

> EntityGroup unassignEntityGroupFromEdge(edgeId, groupType, entityGroupId)

Unassign entity group from edge (unassignEntityGroupFromEdge)

Clears assignment of the entity group to the edge. Unassignment works in async way - first, &#39;unassign&#39; notification event pushed to edge queue on platform. Second, remote edge service will receive an &#39;unassign&#39; command to remove entity group (Edge will receive this instantly, if it&#39;s currently connected, or once it&#39;s going to be connected to platform). Third, once &#39;unassign&#39; command will be delivered to edge service, it&#39;s going to remove entity group and entities inside this group locally.  Available for users with &#39;TENANT_ADMIN&#39; or &#39;CUSTOMER_USER&#39; authority. Security check is performed to verify that the user has &#39;WRITE&#39; permission for the entity (entities).

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String**| A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **groupType** | **String**| EntityGroup type | [enum: ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD] |
| **entityGroupId** | **String**| A string value representing the Entity Group Id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |

### Return type

[**EntityGroup**](EntityGroup.md)

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

