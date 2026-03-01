# EntityGroupControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addEntitiesToEntityGroup**](#addEntitiesToEntityGroup) | **POST** /api/entityGroup/{entityGroupId}/addEntities | Add entities to the group (addEntitiesToEntityGroup) |
| [**assignEntityGroupToEdge**](#assignEntityGroupToEdge) | **POST** /api/edge/{edgeId}/entityGroup/{entityGroupId}/{groupType} | Assign entity group to edge (assignEntityGroupToEdge) |
| [**deleteEntityGroup**](#deleteEntityGroup) | **DELETE** /api/entityGroup/{entityGroupId} | Delete Entity Group (deleteEntityGroup) |
| [**getAllEdgeEntityGroups**](#getAllEdgeEntityGroups) | **GET** /api/allEntityGroups/edge/{edgeId}/{groupType} | Get All Edge Entity Groups by entity type (getAllEdgeEntityGroups) |
| [**getAllEntityGroupsByOwnerAndType**](#getAllEntityGroupsByOwnerAndType) | **GET** /api/entityGroups/{ownerType}/{ownerId}/{groupType}/all | Get Entity Groups by owner and entity type (getEntityGroupsByOwnerAndTypeList) |
| [**getAllEntityGroupsByType**](#getAllEntityGroupsByType) | **GET** /api/entityGroups/{groupType}/all | Get Entity Groups by entity type (getAllEntityGroupsByType) |
| [**getAllSharedEntityGroups**](#getAllSharedEntityGroups) | **GET** /api/entityGroups/{groupType}/shared/all | Get Shared Entity Groups by entity type (getAllSharedEntityGroups) |
| [**getEdgeEntityGroups**](#getEdgeEntityGroups) | **GET** /api/entityGroups/edge/{edgeId}/{groupType} | Get Edge Entity Groups by entity type (getEdgeEntityGroups) |
| [**getEntities**](#getEntities) | **GET** /api/entityGroup/{entityGroupId}/entities | Get Group Entities (getEntities) |
| [**getEntityGroupAllByOwnerAndType**](#getEntityGroupAllByOwnerAndType) | **GET** /api/entityGroup/all/{ownerType}/{ownerId}/{groupType} | Get special group All by owner and entity type (getEntityGroupsByOwnerAndType) |
| [**getEntityGroupById**](#getEntityGroupById) | **GET** /api/entityGroup/{entityGroupId} | Get Entity Group Info (getEntityGroupById) |
| [**getEntityGroupByOwnerAndNameAndType**](#getEntityGroupByOwnerAndNameAndType) | **GET** /api/entityGroup/{ownerType}/{ownerId}/{groupType}/{groupName} | Get Entity Group by owner, type and name (getEntityGroupByOwnerAndNameAndType) |
| [**getEntityGroupEntityInfoById**](#getEntityGroupEntityInfoById) | **GET** /api/entityGroupInfo/{entityGroupId} | Get Entity Group Entity Info (getEntityGroupEntityInfoById) |
| [**getEntityGroupEntityInfosByIds**](#getEntityGroupEntityInfosByIds) | **GET** /api/entityGroupInfos | Get Entity Group Entity Infos by Ids (getEntityGroupEntityInfosByIds) |
| [**getEntityGroupEntityInfosByOwnerAndTypeAndPageLink**](#getEntityGroupEntityInfosByOwnerAndTypeAndPageLink) | **GET** /api/entityGroupInfos/{ownerType}/{ownerId}/{groupType} | Get Entity Group Entity Infos by owner and entity type and page link (getEntityGroupEntityInfosByOwnerAndTypeAndPageLink) |
| [**getEntityGroupEntityInfosByTypeAndPageLink**](#getEntityGroupEntityInfosByTypeAndPageLink) | **GET** /api/entityGroupInfos/{groupType} | Get Entity Group Entity Infos by entity type and page link (getEntityGroupEntityInfosByTypeAndPageLink) |
| [**getEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLink**](#getEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLink) | **GET** /api/entityGroupInfosHierarchy/{ownerType}/{ownerId}/{groupType} | Get Entity Group Entity Infos for all owners starting from specified than ending with owner of current user (getEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLink) |
| [**getEntityGroupsByIdsV2**](#getEntityGroupsByIdsV2) | **GET** /api/entityGroups/list | Get Entity Groups by Ids (getEntityGroupsByIdsV2) |
| [**getEntityGroupsByOwnerAndTypeAndPageLink**](#getEntityGroupsByOwnerAndTypeAndPageLink) | **GET** /api/entityGroups/{ownerType}/{ownerId}/{groupType} | Get Entity Groups by owner and entity type and page link (getEntityGroupsByOwnerAndTypeAndPageLink) |
| [**getEntityGroupsByTypeAndPageLink**](#getEntityGroupsByTypeAndPageLink) | **GET** /api/entityGroups/{groupType} | Get Entity Groups by entity type and page link (getEntityGroupsByTypeAndPageLink) |
| [**getEntityGroupsForEntity**](#getEntityGroupsForEntity) | **GET** /api/entityGroups/{entityType}/{entityId} | Get Entity Groups by Entity Id (getEntityGroupsForEntity) |
| [**getEntityGroupsHierarchyByOwnerAndTypeAndPageLink**](#getEntityGroupsHierarchyByOwnerAndTypeAndPageLink) | **GET** /api/entityGroupsHierarchy/{ownerType}/{ownerId}/{groupType} | Get Entity Groups for all owners starting from specified than ending with owner of current user (getEntityGroupsHierarchyByOwnerAndTypeAndPageLink) |
| [**getGroupEntity**](#getGroupEntity) | **GET** /api/entityGroup/{entityGroupId}/{entityId} | Get Group Entity (getGroupEntity) |
| [**getOwnerInfo**](#getOwnerInfo) | **GET** /api/ownerInfo/{ownerType}/{ownerId} | Get Owner Info (getOwnerInfo) |
| [**getOwnerInfos**](#getOwnerInfos) | **GET** /api/ownerInfos | Get Owner Infos (getOwnerInfos) |
| [**getOwners**](#getOwners) | **GET** /api/owners | Get Owners (getOwners) |
| [**getSharedEntityGroupEntityInfosByTypeAndPageLink**](#getSharedEntityGroupEntityInfosByTypeAndPageLink) | **GET** /api/entityGroupInfos/{groupType}/shared | Get Shared Entity Group Entity Infos by entity type and page link (getSharedEntityGroupEntityInfosByTypeAndPageLink) |
| [**getSharedEntityGroupsByTypeAndPageLink**](#getSharedEntityGroupsByTypeAndPageLink) | **GET** /api/entityGroups/{groupType}/shared | Get Shared Entity Groups by entity type and page link (getSharedEntityGroupsByTypeAndPageLink) |
| [**makeEntityGroupPrivate**](#makeEntityGroupPrivate) | **POST** /api/entityGroup/{entityGroupId}/makePrivate | Make Entity Group Private (makeEntityGroupPrivate) |
| [**makeEntityGroupPublic**](#makeEntityGroupPublic) | **POST** /api/entityGroup/{entityGroupId}/makePublic | Make Entity Group Publicly available (makeEntityGroupPublic) |
| [**removeEntitiesFromEntityGroup**](#removeEntitiesFromEntityGroup) | **POST** /api/entityGroup/{entityGroupId}/deleteEntities | Remove entities from the group (removeEntitiesFromEntityGroup) |
| [**saveEntityGroup**](#saveEntityGroup) | **POST** /api/entityGroup | Create Or Update Entity Group (saveEntityGroup) |
| [**shareEntityGroup**](#shareEntityGroup) | **POST** /api/entityGroup/{entityGroupId}/share | Share the Entity Group (shareEntityGroup) |
| [**shareEntityGroupToChildOwnerUserGroup**](#shareEntityGroupToChildOwnerUserGroup) | **POST** /api/entityGroup/{entityGroupId}/{userGroupId}/{roleId}/share | Share the Entity Group with User group (shareEntityGroupToChildOwnerUserGroup) |
| [**unassignEntityGroupFromEdge**](#unassignEntityGroupFromEdge) | **DELETE** /api/edge/{edgeId}/entityGroup/{entityGroupId}/{groupType} | Unassign entity group from edge (unassignEntityGroupFromEdge) |



## addEntitiesToEntityGroup

> addEntitiesToEntityGroup(entityGroupId, requestBody)

Add entities to the group (addEntitiesToEntityGroup)

Add entities to the specified entity group. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'ADD_TO_GROUP' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **requestBody** | **List<String>** |  | |

### Return type

null (empty response body)


## assignEntityGroupToEdge

> EntityGroup assignEntityGroupToEdge(edgeId, groupType, entityGroupId)

Assign entity group to edge (assignEntityGroupToEdge)

Creates assignment of an existing entity group to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment entity group (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once entity group will be delivered to edge service, edge will request entities of this group to be send to edge. Once entities will be delivered to edge service, they are going to be available for usage on remote edge instance.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **groupType** | **String** | EntityGroup type | [enum: ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD] |
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**EntityGroup**


## deleteEntityGroup

> deleteEntityGroup(entityGroupId)

Delete Entity Group (deleteEntityGroup)

Deletes the entity group but does not delete the entities in the group, since they are also present in reserved group 'All'. Referencing non-existing Entity Group Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'DELETE' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getAllEdgeEntityGroups

> List<EntityGroupInfo> getAllEdgeEntityGroups(edgeId, groupType)

Get All Edge Entity Groups by entity type (getAllEdgeEntityGroups)

Fetch the list of Entity Group Info objects based on the provided Entity Type and assigned to the provided Edge entity. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **groupType** | **String** | EntityGroup type | [enum: ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD] |

### Return type

**List<EntityGroupInfo>**


## getAllEntityGroupsByOwnerAndType

> List<EntityGroupInfo> getAllEntityGroupsByOwnerAndType(ownerType, ownerId, groupType)

Get Entity Groups by owner and entity type (getEntityGroupsByOwnerAndTypeList)

Fetch the list of Entity Group Info objects based on the provided Owner Id and Entity Type. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerType** | **String** | Tenant or Customer | [enum: TENANT, CUSTOMER] |
| **ownerId** | **String** | A string value representing the Tenant or Customer id | |
| **groupType** | **String** | Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |

### Return type

**List<EntityGroupInfo>**


## getAllEntityGroupsByType

> List<EntityGroupInfo> getAllEntityGroupsByType(groupType, includeShared)

Get Entity Groups by entity type (getAllEntityGroupsByType)

Fetch the list of Entity Group Info objects based on the provided Entity Type. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupType** | **String** | Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **includeShared** | **Boolean** | Whether to include shared entity groups. | [optional] |

### Return type

**List<EntityGroupInfo>**


## getAllSharedEntityGroups

> List<EntityGroupInfo> getAllSharedEntityGroups(groupType)

Get Shared Entity Groups by entity type (getAllSharedEntityGroups)

Fetch the list of Shared Entity Group Info objects based on the provided Entity Type. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupType** | **String** | Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |

### Return type

**List<EntityGroupInfo>**


## getEdgeEntityGroups

> PageDataEntityGroupInfo getEdgeEntityGroups(edgeId, groupType, pageSize, page, textSearch, sortProperty, sortOrder)

Get Edge Entity Groups by entity type (getEdgeEntityGroups)

Returns a page of Entity Group Info objects based on the provided Entity Type and assigned to the provided Edge entity. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **groupType** | **String** | EntityGroup type | [enum: ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD] |
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'startsWith' filter based on the entity group name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityGroupInfo**


## getEntities

> PageDataShortEntityView getEntities(entityGroupId, pageSize, page, textSearch, sortProperty, sortOrder)

Get Group Entities (getEntities)

Returns a page of Short Entity View objects that belongs to specified Entity Group Id. Short Entity View object contains the entity id and number of fields (attributes, telemetry, etc). List of those fields is configurable and defined in the group configuration.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'startsWith' filter based on the entity group name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataShortEntityView**


## getEntityGroupAllByOwnerAndType

> EntityGroupInfo getEntityGroupAllByOwnerAndType(ownerType, ownerId, groupType)

Get special group All by owner and entity type (getEntityGroupsByOwnerAndType)

Fetch reserved group 'All' based on the provided Owner Id and Entity Type. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerType** | **String** | Tenant or Customer | [enum: TENANT, CUSTOMER] |
| **ownerId** | **String** | A string value representing the Tenant or Customer id | |
| **groupType** | **String** | Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |

### Return type

**EntityGroupInfo**


## getEntityGroupById

> EntityGroupInfo getEntityGroupById(entityGroupId)

Get Entity Group Info (getEntityGroupById)

Fetch the Entity Group object based on the provided Entity Group Id. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.  Entity group name is unique in the scope of owner and entity type. For example, you can't create two tenant device groups called 'Water meters'. However, you may create device and asset group with the same name. And also you may create groups with the same name for two different customers of the same tenant.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**EntityGroupInfo**


## getEntityGroupByOwnerAndNameAndType

> EntityGroupInfo getEntityGroupByOwnerAndNameAndType(ownerType, ownerId, groupType, groupName)

Get Entity Group by owner, type and name (getEntityGroupByOwnerAndNameAndType)

Fetch the Entity Group object based on the provided Entity Group Id. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.  Entity group name is unique in the scope of owner and entity type. For example, you can't create two tenant device groups called 'Water meters'. However, you may create device and asset group with the same name. And also you may create groups with the same name for two different customers of the same tenant.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerType** | **String** | Tenant or Customer | [enum: TENANT, CUSTOMER] |
| **ownerId** | **String** | A string value representing the Tenant or Customer id | |
| **groupType** | **String** | Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **groupName** | **String** | Entity Group name | |

### Return type

**EntityGroupInfo**


## getEntityGroupEntityInfoById

> EntityInfo getEntityGroupEntityInfoById(entityGroupId)

Get Entity Group Entity Info (getEntityGroupEntityInfoById)

Fetch the Entity Group Entity Info object based on the provided Entity Group Id. Entity Info is a lightweight object that contains only id and name of the entity group.   Entity group name is unique in the scope of owner and entity type. For example, you can't create two tenant device groups called 'Water meters'. However, you may create device and asset group with the same name. And also you may create groups with the same name for two different customers of the same tenant.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**EntityInfo**


## getEntityGroupEntityInfosByIds

> List<EntityInfo> getEntityGroupEntityInfosByIds(entityGroupIds)

Get Entity Group Entity Infos by Ids (getEntityGroupEntityInfosByIds)

Fetch the list of Entity Group Entity Info objects based on the provided entity group ids list. Entity Info is a lightweight object that contains only id and name of the entity group.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupIds** | **List<String>** | A list of group ids, separated by comma ',' | |

### Return type

**List<EntityInfo>**


## getEntityGroupEntityInfosByOwnerAndTypeAndPageLink

> PageDataEntityInfo getEntityGroupEntityInfosByOwnerAndTypeAndPageLink(ownerType, ownerId, groupType, pageSize, page, textSearch, sortProperty, sortOrder)

Get Entity Group Entity Infos by owner and entity type and page link (getEntityGroupEntityInfosByOwnerAndTypeAndPageLink)

Returns a page of Entity Group Entity Info objects based on the provided Owner Id and Entity Type and Page Link. Entity Info is a lightweight object that contains only id and name of the entity group. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerType** | **String** | Tenant or Customer | [enum: TENANT, CUSTOMER] |
| **ownerId** | **String** | A string value representing the Tenant or Customer id | |
| **groupType** | **String** | Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'startsWith' filter based on the entity group name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityInfo**


## getEntityGroupEntityInfosByTypeAndPageLink

> PageDataEntityInfo getEntityGroupEntityInfosByTypeAndPageLink(groupType, pageSize, page, includeShared, textSearch, sortProperty, sortOrder)

Get Entity Group Entity Infos by entity type and page link (getEntityGroupEntityInfosByTypeAndPageLink)

Returns a page of Entity Group Entity Info objects based on the provided Entity Type and Page Link. Entity Info is a lightweight object that contains only id and name of the entity group. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupType** | **String** | Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **includeShared** | **Boolean** | Whether to include shared entity groups. | [optional] |
| **textSearch** | **String** | The case insensitive 'startsWith' filter based on the entity group name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityInfo**


## getEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLink

> PageDataEntityInfo getEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLink(ownerType, ownerId, groupType, pageSize, page, textSearch, sortProperty, sortOrder)

Get Entity Group Entity Infos for all owners starting from specified than ending with owner of current user (getEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLink)

Returns a page of Entity Group Entity Info objects based on the provided Owner Id and Entity Type and Page Link. Entity Info is a lightweight object that contains only id and name of the entity group. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerType** | **String** | Tenant or Customer | [enum: TENANT, CUSTOMER] |
| **ownerId** | **String** | A string value representing the Tenant or Customer id | |
| **groupType** | **String** | Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'startsWith' filter based on the entity group name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityInfo**


## getEntityGroupsByIdsV2

> List<EntityGroupInfo> getEntityGroupsByIdsV2(entityGroupIds)

Get Entity Groups by Ids (getEntityGroupsByIdsV2)

Fetch the list of Entity Group Info objects based on the provided entity group ids list. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupIds** | **List<String>** | A list of group ids, separated by comma ',' | |

### Return type

**List<EntityGroupInfo>**


## getEntityGroupsByOwnerAndTypeAndPageLink

> PageDataEntityGroupInfo getEntityGroupsByOwnerAndTypeAndPageLink(ownerType, ownerId, groupType, pageSize, page, textSearch, sortProperty, sortOrder)

Get Entity Groups by owner and entity type and page link (getEntityGroupsByOwnerAndTypeAndPageLink)

Returns a page of Entity Group objects based on the provided Owner Id and Entity Type and Page Link. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerType** | **String** | Tenant or Customer | [enum: TENANT, CUSTOMER] |
| **ownerId** | **String** | A string value representing the Tenant or Customer id | |
| **groupType** | **String** | Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'startsWith' filter based on the entity group name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityGroupInfo**


## getEntityGroupsByTypeAndPageLink

> PageDataEntityGroupInfo getEntityGroupsByTypeAndPageLink(groupType, pageSize, page, includeShared, textSearch, sortProperty, sortOrder)

Get Entity Groups by entity type and page link (getEntityGroupsByTypeAndPageLink)

Returns a page of Entity Group Info objects based on the provided Entity Type and Page Link. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupType** | **String** | Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **includeShared** | **Boolean** | Whether to include shared entity groups. | [optional] |
| **textSearch** | **String** | The case insensitive 'startsWith' filter based on the entity group name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityGroupInfo**


## getEntityGroupsForEntity

> List<EntityGroupId> getEntityGroupsForEntity(entityType, entityId)

Get Entity Groups by Entity Id (getEntityGroupsForEntity)

Returns a list of groups that contain the specified Entity Id. For example, all device groups that contain specific device. The list always contain at least one element - special group 'All'.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **String** | Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**List<EntityGroupId>**


## getEntityGroupsHierarchyByOwnerAndTypeAndPageLink

> PageDataEntityGroupInfo getEntityGroupsHierarchyByOwnerAndTypeAndPageLink(ownerType, ownerId, groupType, pageSize, page, textSearch, sortProperty, sortOrder)

Get Entity Groups for all owners starting from specified than ending with owner of current user (getEntityGroupsHierarchyByOwnerAndTypeAndPageLink)

Returns a page of Entity Group objects based on the provided Owner Id and Entity Type and Page Link. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerType** | **String** | Tenant or Customer | [enum: TENANT, CUSTOMER] |
| **ownerId** | **String** | A string value representing the Tenant or Customer id | |
| **groupType** | **String** | Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'startsWith' filter based on the entity group name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityGroupInfo**


## getGroupEntity

> ShortEntityView getGroupEntity(entityGroupId, entityId)

Get Group Entity (getGroupEntity)

Fetch the Short Entity View object based on the group and entity id. Short Entity View object contains the entity id and number of fields (attributes, telemetry, etc). List of those fields is configurable and defined in the group configuration.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**ShortEntityView**


## getOwnerInfo

> EntityInfo getOwnerInfo(ownerType, ownerId)

Get Owner Info (getOwnerInfo)

Fetch the owner info (tenant or customer) presented as Entity Info object based on the provided owner Id.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ownerType** | **String** | Tenant or Customer | [enum: TENANT, CUSTOMER] |
| **ownerId** | **String** | A string value representing the Tenant or Customer id | |

### Return type

**EntityInfo**


## getOwnerInfos

> PageDataEntityInfo getOwnerInfos(pageSize, page, textSearch, sortProperty, sortOrder)

Get Owner Infos (getOwnerInfos)

Provides a rage view of Customers that the current user has READ access to. If the current user is Tenant administrator, the result set also contains the tenant. The call is designed for the UI auto-complete component to show tenant and all possible Customers that the user may select to change the owner of the particular entity or entity group.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'startsWith' filter based on the entity group name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityInfo**


## getOwners

> PageDataContactBasedObject getOwners(pageSize, page, textSearch, sortProperty, sortOrder)

Get Owners (getOwners)

Provides a rage view of Customers that the current user has READ access to. If the current user is Tenant administrator, the result set also contains the tenant. The call is designed for the UI auto-complete component to show tenant and all possible Customers that the user may select to change the owner of the particular entity or entity group.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'startsWith' filter based on the entity group name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataContactBasedObject**


## getSharedEntityGroupEntityInfosByTypeAndPageLink

> PageDataEntityInfo getSharedEntityGroupEntityInfosByTypeAndPageLink(groupType, pageSize, page, textSearch, sortProperty, sortOrder)

Get Shared Entity Group Entity Infos by entity type and page link (getSharedEntityGroupEntityInfosByTypeAndPageLink)

Returns a page of Shared Entity Group Entity Info objects based on the provided Entity Type and Page Link. Entity Info is a lightweight object that contains only id and name of the entity group. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupType** | **String** | Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'startsWith' filter based on the entity group name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityInfo**


## getSharedEntityGroupsByTypeAndPageLink

> PageDataEntityGroupInfo getSharedEntityGroupsByTypeAndPageLink(groupType, pageSize, page, textSearch, sortProperty, sortOrder)

Get Shared Entity Groups by entity type and page link (getSharedEntityGroupsByTypeAndPageLink)

Returns a page of Shared Entity Group Info objects based on the provided Entity Type and Page Link. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupType** | **String** | Entity Group type | [enum: CUSTOMER, ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD, EDGE] |
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'startsWith' filter based on the entity group name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityGroupInfo**


## makeEntityGroupPrivate

> makeEntityGroupPrivate(entityGroupId)

Make Entity Group Private (makeEntityGroupPrivate)

Make the entity group not available for non authorized users. Every group is private by default. This call is useful to hide the group that was previously made public.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## makeEntityGroupPublic

> makeEntityGroupPublic(entityGroupId)

Make Entity Group Publicly available (makeEntityGroupPublic)

Make the entity group available for non authorized users. Useful for public dashboards that will be embedded into the public websites.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## removeEntitiesFromEntityGroup

> removeEntitiesFromEntityGroup(entityGroupId, requestBody)

Remove entities from the group (removeEntitiesFromEntityGroup)

Removes entities from the specified entity group. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'REMOVE_FROM_GROUP' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **requestBody** | **List<String>** |  | |

### Return type

null (empty response body)


## saveEntityGroup

> EntityGroupInfo saveEntityGroup(entityGroup)

Create Or Update Entity Group (saveEntityGroup)

Create or update the Entity Group. When creating Entity Group, platform generates Entity Group Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Entity Group Id will be present in the response. Specify existing Entity Group Id to update the group. Referencing non-existing Entity Group Id will cause 'Not Found' error.Remove 'id', 'tenantId' and optionally 'ownerId' from the request body example (below) to create new Entity Group entity.   Entity group name is unique in the scope of owner and entity type. For example, you can't create two tenant device groups called 'Water meters'. However, you may create device and asset group with the same name. And also you may create groups with the same name for two different customers of the same tenant.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroup** | **EntityGroup** |  | |

### Return type

**EntityGroupInfo**


## shareEntityGroup

> shareEntityGroup(entityGroupId, shareGroupRequest)

Share the Entity Group (shareEntityGroup)

Share the entity group with certain user group based on the provided Share Group Request. The request is quite flexible and processing of the request involves multiple security checks using platform RBAC feature.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **shareGroupRequest** | **ShareGroupRequest** |  | |

### Return type

null (empty response body)


## shareEntityGroupToChildOwnerUserGroup

> shareEntityGroupToChildOwnerUserGroup(entityGroupId, userGroupId, roleId)

Share the Entity Group with User group (shareEntityGroupToChildOwnerUserGroup)

Share the entity group with specified user group using specified role.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for specified group.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityGroupId** | **String** | A string value representing the Entity Group Id that you would like to share. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **userGroupId** | **String** | A string value representing the Entity(User) Group Id that you would like to share with. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **roleId** | **String** | A string value representing the Role Id that describes set of permissions you would like to share (read, write, etc). For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## unassignEntityGroupFromEdge

> EntityGroup unassignEntityGroupFromEdge(edgeId, groupType, entityGroupId)

Unassign entity group from edge (unassignEntityGroupFromEdge)

Clears assignment of the entity group to the edge. Unassignment works in async way - first, 'unassign' notification event pushed to edge queue on platform. Second, remote edge service will receive an 'unassign' command to remove entity group (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once 'unassign' command will be delivered to edge service, it's going to remove entity group and entities inside this group locally.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **groupType** | **String** | EntityGroup type | [enum: ASSET, DEVICE, USER, ENTITY_VIEW, DASHBOARD] |
| **entityGroupId** | **String** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**EntityGroup**

