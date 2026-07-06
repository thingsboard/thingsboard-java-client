# EntityGroupControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
void addEntitiesToEntityGroup(AddEntitiesToEntityGroupArgs args) // Add entities to the group (addEntitiesToEntityGroup)
EntityGroup assignEntityGroupToEdge(AssignEntityGroupToEdgeArgs args) // Assign entity group to edge (assignEntityGroupToEdge)
void deleteEntityGroup(DeleteEntityGroupArgs args) // Delete Entity Group (deleteEntityGroup)
List<EntityGroupInfo> getAllEdgeEntityGroups(GetAllEdgeEntityGroupsArgs args) // Get All Edge Entity Groups by entity type (getAllEdgeEntityGroups)
List<EntityGroupInfo> getAllEntityGroupsByOwnerAndType(GetAllEntityGroupsByOwnerAndTypeArgs args) // Get Entity Groups by owner and entity type (getAllEntityGroupsByOwnerAndType)
List<EntityGroupInfo> getAllEntityGroupsByType(GetAllEntityGroupsByTypeArgs args) // Get Entity Groups by entity type (getAllEntityGroupsByType)
List<EntityGroupInfo> getAllSharedEntityGroups(GetAllSharedEntityGroupsArgs args) // Get Shared Entity Groups by entity type (getAllSharedEntityGroups)
PageDataEntityGroupInfo getEdgeEntityGroups(GetEdgeEntityGroupsArgs args) // Get Edge Entity Groups by entity type (getEdgeEntityGroups)
PageDataShortEntityView getEntities(GetEntitiesArgs args) // Get Group Entities (getEntities)
EntityGroupInfo getEntityGroupAllByOwnerAndType(GetEntityGroupAllByOwnerAndTypeArgs args) // Get special group All by owner and entity type (getEntityGroupsByOwnerAndType)
EntityGroupInfo getEntityGroupById(GetEntityGroupByIdArgs args) // Get Entity Group Info (getEntityGroupById)
EntityGroupInfo getEntityGroupByOwnerAndNameAndType(GetEntityGroupByOwnerAndNameAndTypeArgs args) // Get Entity Group by owner, type and name (getEntityGroupByOwnerAndNameAndType)
EntityInfo getEntityGroupEntityInfoById(GetEntityGroupEntityInfoByIdArgs args) // Get Entity Group Entity Info (getEntityGroupEntityInfoById)
List<EntityInfo> getEntityGroupEntityInfosByIds(GetEntityGroupEntityInfosByIdsArgs args) // Get Entity Group Entity Infos by Ids (getEntityGroupEntityInfosByIds)
PageDataEntityInfo getEntityGroupEntityInfosByOwnerAndTypeAndPageLink(GetEntityGroupEntityInfosByOwnerAndTypeAndPageLinkArgs args) // Get Entity Group Entity Infos by owner and entity type and page link (getEntityGroupEntityInfosByOwnerAndTypeAndPageLink)
PageDataEntityInfo getEntityGroupEntityInfosByTypeAndPageLink(GetEntityGroupEntityInfosByTypeAndPageLinkArgs args) // Get Entity Group Entity Infos by entity type and page link (getEntityGroupEntityInfosByTypeAndPageLink)
PageDataEntityInfo getEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLink(GetEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLinkArgs args) // Get Entity Group Entity Infos for all owners starting from specified than ending with owner of current user (getEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLink)
List<EntityGroupInfo> getEntityGroupsByIds(GetEntityGroupsByIdsArgs args) // Get Entity Groups by Ids (getEntityGroupsByIds)
PageDataEntityGroupInfo getEntityGroupsByOwnerAndTypeAndPageLink(GetEntityGroupsByOwnerAndTypeAndPageLinkArgs args) // Get Entity Groups by owner and entity type and page link (getEntityGroupsByOwnerAndTypeAndPageLink)
PageDataEntityGroupInfo getEntityGroupsByTypeAndPageLink(GetEntityGroupsByTypeAndPageLinkArgs args) // Get Entity Groups by entity type and page link (getEntityGroupsByTypeAndPageLink)
List<EntityGroupId> getEntityGroupsForEntity(GetEntityGroupsForEntityArgs args) // Get Entity Groups by Entity Id (getEntityGroupsForEntity)
PageDataEntityGroupInfo getEntityGroupsHierarchyByOwnerAndTypeAndPageLink(GetEntityGroupsHierarchyByOwnerAndTypeAndPageLinkArgs args) // Get Entity Groups for all owners starting from specified than ending with owner of current user (getEntityGroupsHierarchyByOwnerAndTypeAndPageLink)
ShortEntityView getGroupEntity(GetGroupEntityArgs args) // Get Group Entity (getGroupEntity)
EntityInfo getOwnerInfo(GetOwnerInfoArgs args) // Get Owner Info (getOwnerInfo)
PageDataEntityInfo getOwnerInfos(GetOwnerInfosArgs args) // Get Owner Infos (getOwnerInfos)
PageDataContactBasedObject getOwners(GetOwnersArgs args) // Get Owners (getOwners)
PageDataEntityInfo getSharedEntityGroupEntityInfosByTypeAndPageLink(GetSharedEntityGroupEntityInfosByTypeAndPageLinkArgs args) // Get Shared Entity Group Entity Infos by entity type and page link (getSharedEntityGroupEntityInfosByTypeAndPageLink)
PageDataEntityGroupInfo getSharedEntityGroupsByTypeAndPageLink(GetSharedEntityGroupsByTypeAndPageLinkArgs args) // Get Shared Entity Groups by entity type and page link (getSharedEntityGroupsByTypeAndPageLink)
void makeEntityGroupPrivate(MakeEntityGroupPrivateArgs args) // Make Entity Group Private (makeEntityGroupPrivate)
void makeEntityGroupPublic(MakeEntityGroupPublicArgs args) // Make Entity Group Publicly available (makeEntityGroupPublic)
void removeEntitiesFromEntityGroup(RemoveEntitiesFromEntityGroupArgs args) // Remove entities from the group (removeEntitiesFromEntityGroup)
EntityGroupInfo saveEntityGroup(SaveEntityGroupArgs args) // Create Or Update Entity Group (saveEntityGroup)
void shareEntityGroup(ShareEntityGroupArgs args) // Share the Entity Group (shareEntityGroup)
void shareEntityGroupToChildOwnerUserGroup(ShareEntityGroupToChildOwnerUserGroupArgs args) // Share the Entity Group with User group (shareEntityGroupToChildOwnerUserGroup)
EntityGroup unassignEntityGroupFromEdge(UnassignEntityGroupFromEdgeArgs args) // Unassign entity group from edge (unassignEntityGroupFromEdge)
```


## addEntitiesToEntityGroup

**POST** `/api/entityGroup/{entityGroupId}/addEntities`

Add entities to the group (addEntitiesToEntityGroup)

Add entities to the specified entity group. This operation is idempotent: entities that are already members of the group are silently ignored. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'ADD_TO_GROUP' permission for specified group.

```java
void addEntitiesToEntityGroup(AddEntitiesToEntityGroupArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AddEntitiesToEntityGroupArgs.builder()
        .entityGroupId(String)
        .requestBody(List<String>)
        .build()
```

### `AddEntitiesToEntityGroupArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `requestBody` | `List<String>` | **yes** |  | |

### Return type

null (empty response body)


## assignEntityGroupToEdge

**POST** `/api/edge/{edgeId}/entityGroup/{entityGroupId}/{groupType}`

Assign entity group to edge (assignEntityGroupToEdge)

Creates assignment of an existing entity group to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment entity group (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once entity group will be delivered to edge service, edge will request entities of this group to be send to edge. Once entities will be delivered to edge service, they are going to be available for usage on remote edge instance.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).

```java
EntityGroup assignEntityGroupToEdge(AssignEntityGroupToEdgeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignEntityGroupToEdgeArgs.builder()
        .edgeId(String)
        .groupType(String)
        .entityGroupId(String)
        .build()
```

### `AssignEntityGroupToEdgeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `groupType` | `String` | **yes** | EntityGroup type | enum: `ASSET`, `DEVICE`, `USER`, `ENTITY_VIEW`, `DASHBOARD` |
| `entityGroupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`EntityGroup`


## deleteEntityGroup

**DELETE** `/api/entityGroup/{entityGroupId}`

Delete Entity Group (deleteEntityGroup)

Deletes the entity group but does not delete the entities in the group, since they are also present in reserved group 'All'. Referencing non-existing Entity Group Id will cause an error.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'DELETE' permission for specified group.

```java
void deleteEntityGroup(DeleteEntityGroupArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteEntityGroupArgs.builder()
        .entityGroupId(String)
        .build()
```

### `DeleteEntityGroupArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## getAllEdgeEntityGroups

**GET** `/api/allEntityGroups/edge/{edgeId}/{groupType}`

Get All Edge Entity Groups by entity type (getAllEdgeEntityGroups)

Fetch the list of Entity Group Info objects based on the provided Entity Type and assigned to the provided Edge entity. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
List<EntityGroupInfo> getAllEdgeEntityGroups(GetAllEdgeEntityGroupsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAllEdgeEntityGroupsArgs.builder()
        .edgeId(String)
        .groupType(String)
        .build()
```

### `GetAllEdgeEntityGroupsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `groupType` | `String` | **yes** | EntityGroup type | enum: `ASSET`, `DEVICE`, `USER`, `ENTITY_VIEW`, `DASHBOARD` |

### Return type

`List<EntityGroupInfo>`


## getAllEntityGroupsByOwnerAndType

**GET** `/api/entityGroups/{ownerType}/{ownerId}/{groupType}/all`

Get Entity Groups by owner and entity type (getAllEntityGroupsByOwnerAndType)

Fetch the list of Entity Group Info objects based on the provided Owner Id and Entity Type. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
List<EntityGroupInfo> getAllEntityGroupsByOwnerAndType(GetAllEntityGroupsByOwnerAndTypeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAllEntityGroupsByOwnerAndTypeArgs.builder()
        .ownerType(String)
        .ownerId(String)
        .groupType(String)
        .build()
```

### `GetAllEntityGroupsByOwnerAndTypeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ownerType` | `String` | **yes** | Tenant or Customer | enum: `TENANT`, `CUSTOMER` |
| `ownerId` | `String` | **yes** | A string value representing the Tenant or Customer id | |
| `groupType` | `String` | **yes** | Entity Group type | enum: `CUSTOMER`, `ASSET`, `DEVICE`, `USER`, `ENTITY_VIEW`, `DASHBOARD`, `EDGE` |

### Return type

`List<EntityGroupInfo>`


## getAllEntityGroupsByType

**GET** `/api/entityGroups/{groupType}/all`

Get Entity Groups by entity type (getAllEntityGroupsByType)

Fetch the list of Entity Group Info objects based on the provided Entity Type. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
List<EntityGroupInfo> getAllEntityGroupsByType(GetAllEntityGroupsByTypeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAllEntityGroupsByTypeArgs.builder()
        .groupType(String)
        .build()
```

### `GetAllEntityGroupsByTypeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `groupType` | `String` | **yes** | Entity Group type | enum: `CUSTOMER`, `ASSET`, `DEVICE`, `USER`, `ENTITY_VIEW`, `DASHBOARD`, `EDGE` |
| `includeShared` | `Boolean` | no | Whether to include shared entity groups. | |

### Return type

`List<EntityGroupInfo>`


## getAllSharedEntityGroups

**GET** `/api/entityGroups/{groupType}/shared/all`

Get Shared Entity Groups by entity type (getAllSharedEntityGroups)

Fetch the list of Shared Entity Group Info objects based on the provided Entity Type. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
List<EntityGroupInfo> getAllSharedEntityGroups(GetAllSharedEntityGroupsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetAllSharedEntityGroupsArgs.builder()
        .groupType(String)
        .build()
```

### `GetAllSharedEntityGroupsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `groupType` | `String` | **yes** | Entity Group type | enum: `CUSTOMER`, `ASSET`, `DEVICE`, `USER`, `ENTITY_VIEW`, `DASHBOARD`, `EDGE` |

### Return type

`List<EntityGroupInfo>`


## getEdgeEntityGroups

**GET** `/api/entityGroups/edge/{edgeId}/{groupType}`

Get Edge Entity Groups by entity type (getEdgeEntityGroups)

Returns a page of Entity Group Info objects based on the provided Entity Type and assigned to the provided Edge entity. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataEntityGroupInfo getEdgeEntityGroups(GetEdgeEntityGroupsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEdgeEntityGroupsArgs.builder()
        .edgeId(String)
        .groupType(String)
        .pageSize(String)
        .page(String)
        .build()
```

### `GetEdgeEntityGroupsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `groupType` | `String` | **yes** | EntityGroup type | enum: `ASSET`, `DEVICE`, `USER`, `ENTITY_VIEW`, `DASHBOARD` |
| `pageSize` | `String` | **yes** | Maximum amount of entities in a one page | |
| `page` | `String` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'startsWith' filter based on the entity group name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEntityGroupInfo`


## getEntities

**GET** `/api/entityGroup/{entityGroupId}/entities`

Get Group Entities (getEntities)

Returns a page of Short Entity View objects that belongs to specified Entity Group Id. Short Entity View object contains the entity id and number of fields (attributes, telemetry, etc). List of those fields is configurable and defined in the group configuration.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
PageDataShortEntityView getEntities(GetEntitiesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEntitiesArgs.builder()
        .entityGroupId(String)
        .pageSize(String)
        .page(String)
        .build()
```

### `GetEntitiesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `String` | **yes** | Maximum amount of entities in a one page | |
| `page` | `String` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'startsWith' filter based on the entity group name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataShortEntityView`


## getEntityGroupAllByOwnerAndType

**GET** `/api/entityGroup/all/{ownerType}/{ownerId}/{groupType}`

Get special group All by owner and entity type (getEntityGroupsByOwnerAndType)

Fetch reserved group 'All' based on the provided Owner Id and Entity Type. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
EntityGroupInfo getEntityGroupAllByOwnerAndType(GetEntityGroupAllByOwnerAndTypeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEntityGroupAllByOwnerAndTypeArgs.builder()
        .ownerType(String)
        .ownerId(String)
        .groupType(String)
        .build()
```

### `GetEntityGroupAllByOwnerAndTypeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ownerType` | `String` | **yes** | Tenant or Customer | enum: `TENANT`, `CUSTOMER` |
| `ownerId` | `String` | **yes** | A string value representing the Tenant or Customer id | |
| `groupType` | `String` | **yes** | Entity Group type | enum: `CUSTOMER`, `ASSET`, `DEVICE`, `USER`, `ENTITY_VIEW`, `DASHBOARD`, `EDGE` |

### Return type

`EntityGroupInfo`


## getEntityGroupById

**GET** `/api/entityGroup/{entityGroupId}`

Get Entity Group Info (getEntityGroupById)

Fetch the Entity Group object based on the provided Entity Group Id. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.  Entity group name is unique in the scope of owner and entity type. For example, you can't create two tenant device groups called 'Water meters'. However, you may create device and asset group with the same name. And also you may create groups with the same name for two different customers of the same tenant.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
EntityGroupInfo getEntityGroupById(GetEntityGroupByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEntityGroupByIdArgs.builder()
        .entityGroupId(String)
        .build()
```

### `GetEntityGroupByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`EntityGroupInfo`


## getEntityGroupByOwnerAndNameAndType

**GET** `/api/entityGroup/{ownerType}/{ownerId}/{groupType}/{groupName}`

Get Entity Group by owner, type and name (getEntityGroupByOwnerAndNameAndType)

Fetch the Entity Group object based on the provided Entity Group Id. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.  Entity group name is unique in the scope of owner and entity type. For example, you can't create two tenant device groups called 'Water meters'. However, you may create device and asset group with the same name. And also you may create groups with the same name for two different customers of the same tenant.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
EntityGroupInfo getEntityGroupByOwnerAndNameAndType(GetEntityGroupByOwnerAndNameAndTypeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEntityGroupByOwnerAndNameAndTypeArgs.builder()
        .ownerType(String)
        .ownerId(String)
        .groupType(String)
        .groupName(String)
        .build()
```

### `GetEntityGroupByOwnerAndNameAndTypeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ownerType` | `String` | **yes** | Tenant or Customer | enum: `TENANT`, `CUSTOMER` |
| `ownerId` | `String` | **yes** | A string value representing the Tenant or Customer id | |
| `groupType` | `String` | **yes** | Entity Group type | enum: `CUSTOMER`, `ASSET`, `DEVICE`, `USER`, `ENTITY_VIEW`, `DASHBOARD`, `EDGE` |
| `groupName` | `String` | **yes** | Entity Group name | |

### Return type

`EntityGroupInfo`


## getEntityGroupEntityInfoById

**GET** `/api/entityGroupInfo/{entityGroupId}`

Get Entity Group Entity Info (getEntityGroupEntityInfoById)

Fetch the Entity Group Entity Info object based on the provided Entity Group Id. Entity Info is a lightweight object that contains only id and name of the entity group.   Entity group name is unique in the scope of owner and entity type. For example, you can't create two tenant device groups called 'Water meters'. However, you may create device and asset group with the same name. And also you may create groups with the same name for two different customers of the same tenant.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
EntityInfo getEntityGroupEntityInfoById(GetEntityGroupEntityInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEntityGroupEntityInfoByIdArgs.builder()
        .entityGroupId(String)
        .build()
```

### `GetEntityGroupEntityInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`EntityInfo`


## getEntityGroupEntityInfosByIds

**GET** `/api/entityGroupInfos`

Get Entity Group Entity Infos by Ids (getEntityGroupEntityInfosByIds)

Fetch the list of Entity Group Entity Info objects based on the provided entity group ids list. Entity Info is a lightweight object that contains only id and name of the entity group.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
List<EntityInfo> getEntityGroupEntityInfosByIds(GetEntityGroupEntityInfosByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEntityGroupEntityInfosByIdsArgs.builder()
        .entityGroupIds(List<String>)
        .build()
```

### `GetEntityGroupEntityInfosByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroupIds` | `List<String>` | **yes** | A list of group ids, separated by comma ',' | |

### Return type

`List<EntityInfo>`


## getEntityGroupEntityInfosByOwnerAndTypeAndPageLink

**GET** `/api/entityGroupInfos/{ownerType}/{ownerId}/{groupType}`

Get Entity Group Entity Infos by owner and entity type and page link (getEntityGroupEntityInfosByOwnerAndTypeAndPageLink)

Returns a page of Entity Group Entity Info objects based on the provided Owner Id and Entity Type and Page Link. Entity Info is a lightweight object that contains only id and name of the entity group. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
PageDataEntityInfo getEntityGroupEntityInfosByOwnerAndTypeAndPageLink(GetEntityGroupEntityInfosByOwnerAndTypeAndPageLinkArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEntityGroupEntityInfosByOwnerAndTypeAndPageLinkArgs.builder()
        .ownerType(String)
        .ownerId(String)
        .groupType(String)
        .pageSize(String)
        .page(String)
        .build()
```

### `GetEntityGroupEntityInfosByOwnerAndTypeAndPageLinkArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ownerType` | `String` | **yes** | Tenant or Customer | enum: `TENANT`, `CUSTOMER` |
| `ownerId` | `String` | **yes** | A string value representing the Tenant or Customer id | |
| `groupType` | `String` | **yes** | Entity Group type | enum: `CUSTOMER`, `ASSET`, `DEVICE`, `USER`, `ENTITY_VIEW`, `DASHBOARD`, `EDGE` |
| `pageSize` | `String` | **yes** | Maximum amount of entities in a one page | |
| `page` | `String` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'startsWith' filter based on the entity group name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEntityInfo`


## getEntityGroupEntityInfosByTypeAndPageLink

**GET** `/api/entityGroupInfos/{groupType}`

Get Entity Group Entity Infos by entity type and page link (getEntityGroupEntityInfosByTypeAndPageLink)

Returns a page of Entity Group Entity Info objects based on the provided Entity Type and Page Link. Entity Info is a lightweight object that contains only id and name of the entity group. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
PageDataEntityInfo getEntityGroupEntityInfosByTypeAndPageLink(GetEntityGroupEntityInfosByTypeAndPageLinkArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEntityGroupEntityInfosByTypeAndPageLinkArgs.builder()
        .groupType(String)
        .pageSize(String)
        .page(String)
        .build()
```

### `GetEntityGroupEntityInfosByTypeAndPageLinkArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `groupType` | `String` | **yes** | Entity Group type | enum: `CUSTOMER`, `ASSET`, `DEVICE`, `USER`, `ENTITY_VIEW`, `DASHBOARD`, `EDGE` |
| `pageSize` | `String` | **yes** | Maximum amount of entities in a one page | |
| `page` | `String` | **yes** | Sequence number of page starting from 0 | |
| `includeShared` | `Boolean` | no | Whether to include shared entity groups. | |
| `textSearch` | `String` | no | The case insensitive 'startsWith' filter based on the entity group name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEntityInfo`


## getEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLink

**GET** `/api/entityGroupInfosHierarchy/{ownerType}/{ownerId}/{groupType}`

Get Entity Group Entity Infos for all owners starting from specified than ending with owner of current user (getEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLink)

Returns a page of Entity Group Entity Info objects based on the provided Owner Id and Entity Type and Page Link. Entity Info is a lightweight object that contains only id and name of the entity group. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
PageDataEntityInfo getEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLink(GetEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLinkArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLinkArgs.builder()
        .ownerType(String)
        .ownerId(String)
        .groupType(String)
        .pageSize(String)
        .page(String)
        .build()
```

### `GetEntityGroupEntityInfosHierarchyByOwnerAndTypeAndPageLinkArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ownerType` | `String` | **yes** | Tenant or Customer | enum: `TENANT`, `CUSTOMER` |
| `ownerId` | `String` | **yes** | A string value representing the Tenant or Customer id | |
| `groupType` | `String` | **yes** | Entity Group type | enum: `CUSTOMER`, `ASSET`, `DEVICE`, `USER`, `ENTITY_VIEW`, `DASHBOARD`, `EDGE` |
| `pageSize` | `String` | **yes** | Maximum amount of entities in a one page | |
| `page` | `String` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'startsWith' filter based on the entity group name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEntityInfo`


## getEntityGroupsByIds

**GET** `/api/entityGroups/list`

Get Entity Groups by Ids (getEntityGroupsByIds)

Fetch the list of Entity Group Info objects based on the provided entity group ids list. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
List<EntityGroupInfo> getEntityGroupsByIds(GetEntityGroupsByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEntityGroupsByIdsArgs.builder()
        .entityGroupIds(List<String>)
        .build()
```

### `GetEntityGroupsByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroupIds` | `List<String>` | **yes** | A list of group ids, separated by comma ',' | |

### Return type

`List<EntityGroupInfo>`


## getEntityGroupsByOwnerAndTypeAndPageLink

**GET** `/api/entityGroups/{ownerType}/{ownerId}/{groupType}`

Get Entity Groups by owner and entity type and page link (getEntityGroupsByOwnerAndTypeAndPageLink)

Returns a page of Entity Group objects based on the provided Owner Id and Entity Type and Page Link. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
PageDataEntityGroupInfo getEntityGroupsByOwnerAndTypeAndPageLink(GetEntityGroupsByOwnerAndTypeAndPageLinkArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEntityGroupsByOwnerAndTypeAndPageLinkArgs.builder()
        .ownerType(String)
        .ownerId(String)
        .groupType(String)
        .pageSize(String)
        .page(String)
        .build()
```

### `GetEntityGroupsByOwnerAndTypeAndPageLinkArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ownerType` | `String` | **yes** | Tenant or Customer | enum: `TENANT`, `CUSTOMER` |
| `ownerId` | `String` | **yes** | A string value representing the Tenant or Customer id | |
| `groupType` | `String` | **yes** | Entity Group type | enum: `CUSTOMER`, `ASSET`, `DEVICE`, `USER`, `ENTITY_VIEW`, `DASHBOARD`, `EDGE` |
| `pageSize` | `String` | **yes** | Maximum amount of entities in a one page | |
| `page` | `String` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'startsWith' filter based on the entity group name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEntityGroupInfo`


## getEntityGroupsByTypeAndPageLink

**GET** `/api/entityGroups/{groupType}`

Get Entity Groups by entity type and page link (getEntityGroupsByTypeAndPageLink)

Returns a page of Entity Group Info objects based on the provided Entity Type and Page Link. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
PageDataEntityGroupInfo getEntityGroupsByTypeAndPageLink(GetEntityGroupsByTypeAndPageLinkArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEntityGroupsByTypeAndPageLinkArgs.builder()
        .groupType(String)
        .pageSize(String)
        .page(String)
        .build()
```

### `GetEntityGroupsByTypeAndPageLinkArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `groupType` | `String` | **yes** | Entity Group type | enum: `CUSTOMER`, `ASSET`, `DEVICE`, `USER`, `ENTITY_VIEW`, `DASHBOARD`, `EDGE` |
| `pageSize` | `String` | **yes** | Maximum amount of entities in a one page | |
| `page` | `String` | **yes** | Sequence number of page starting from 0 | |
| `includeShared` | `Boolean` | no | Whether to include shared entity groups. | |
| `textSearch` | `String` | no | The case insensitive 'startsWith' filter based on the entity group name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEntityGroupInfo`


## getEntityGroupsForEntity

**GET** `/api/entityGroups/{entityType}/{entityId}`

Get Entity Groups by Entity Id (getEntityGroupsForEntity)

Returns a list of groups that contain the specified Entity Id. For example, all device groups that contain specific device. The list always contain at least one element - special group 'All'.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
List<EntityGroupId> getEntityGroupsForEntity(GetEntityGroupsForEntityArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEntityGroupsForEntityArgs.builder()
        .entityType(String)
        .entityId(String)
        .build()
```

### `GetEntityGroupsForEntityArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityType` | `String` | **yes** | Entity Group type | enum: `CUSTOMER`, `ASSET`, `DEVICE`, `USER`, `ENTITY_VIEW`, `DASHBOARD`, `EDGE` |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`List<EntityGroupId>`


## getEntityGroupsHierarchyByOwnerAndTypeAndPageLink

**GET** `/api/entityGroupsHierarchy/{ownerType}/{ownerId}/{groupType}`

Get Entity Groups for all owners starting from specified than ending with owner of current user (getEntityGroupsHierarchyByOwnerAndTypeAndPageLink)

Returns a page of Entity Group objects based on the provided Owner Id and Entity Type and Page Link. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
PageDataEntityGroupInfo getEntityGroupsHierarchyByOwnerAndTypeAndPageLink(GetEntityGroupsHierarchyByOwnerAndTypeAndPageLinkArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEntityGroupsHierarchyByOwnerAndTypeAndPageLinkArgs.builder()
        .ownerType(String)
        .ownerId(String)
        .groupType(String)
        .pageSize(String)
        .page(String)
        .build()
```

### `GetEntityGroupsHierarchyByOwnerAndTypeAndPageLinkArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ownerType` | `String` | **yes** | Tenant or Customer | enum: `TENANT`, `CUSTOMER` |
| `ownerId` | `String` | **yes** | A string value representing the Tenant or Customer id | |
| `groupType` | `String` | **yes** | Entity Group type | enum: `CUSTOMER`, `ASSET`, `DEVICE`, `USER`, `ENTITY_VIEW`, `DASHBOARD`, `EDGE` |
| `pageSize` | `String` | **yes** | Maximum amount of entities in a one page | |
| `page` | `String` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'startsWith' filter based on the entity group name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEntityGroupInfo`


## getGroupEntity

**GET** `/api/entityGroup/{entityGroupId}/{entityId}`

Get Group Entity (getGroupEntity)

Fetch the Short Entity View object based on the group and entity id. Short Entity View object contains the entity id and number of fields (attributes, telemetry, etc). List of those fields is configurable and defined in the group configuration.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
ShortEntityView getGroupEntity(GetGroupEntityArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetGroupEntityArgs.builder()
        .entityGroupId(String)
        .entityId(String)
        .build()
```

### `GetGroupEntityArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`ShortEntityView`


## getOwnerInfo

**GET** `/api/ownerInfo/{ownerType}/{ownerId}`

Get Owner Info (getOwnerInfo)

Fetch the owner info (tenant or customer) presented as Entity Info object based on the provided owner Id.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
EntityInfo getOwnerInfo(GetOwnerInfoArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetOwnerInfoArgs.builder()
        .ownerType(String)
        .ownerId(String)
        .build()
```

### `GetOwnerInfoArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ownerType` | `String` | **yes** | Tenant or Customer | enum: `TENANT`, `CUSTOMER` |
| `ownerId` | `String` | **yes** | A string value representing the Tenant or Customer id | |

### Return type

`EntityInfo`


## getOwnerInfos

**GET** `/api/ownerInfos`

Get Owner Infos (getOwnerInfos)

Provides a rage view of Customers that the current user has READ access to. If the current user is Tenant administrator, the result set also contains the tenant. The call is designed for the UI auto-complete component to show tenant and all possible Customers that the user may select to change the owner of the particular entity or entity group.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataEntityInfo getOwnerInfos(GetOwnerInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetOwnerInfosArgs.builder()
        .pageSize(String)
        .page(String)
        .build()
```

### `GetOwnerInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `String` | **yes** | Maximum amount of entities in a one page | |
| `page` | `String` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'startsWith' filter based on the entity group name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEntityInfo`


## getOwners

**GET** `/api/owners`

Get Owners (getOwners)

Provides a rage view of Customers that the current user has READ access to. If the current user is Tenant administrator, the result set also contains the tenant. The call is designed for the UI auto-complete component to show tenant and all possible Customers that the user may select to change the owner of the particular entity or entity group.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataContactBasedObject getOwners(GetOwnersArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetOwnersArgs.builder()
        .pageSize(String)
        .page(String)
        .build()
```

### `GetOwnersArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `String` | **yes** | Maximum amount of entities in a one page | |
| `page` | `String` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'startsWith' filter based on the entity group name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataContactBasedObject`


## getSharedEntityGroupEntityInfosByTypeAndPageLink

**GET** `/api/entityGroupInfos/{groupType}/shared`

Get Shared Entity Group Entity Infos by entity type and page link (getSharedEntityGroupEntityInfosByTypeAndPageLink)

Returns a page of Shared Entity Group Entity Info objects based on the provided Entity Type and Page Link. Entity Info is a lightweight object that contains only id and name of the entity group. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
PageDataEntityInfo getSharedEntityGroupEntityInfosByTypeAndPageLink(GetSharedEntityGroupEntityInfosByTypeAndPageLinkArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetSharedEntityGroupEntityInfosByTypeAndPageLinkArgs.builder()
        .groupType(String)
        .pageSize(String)
        .page(String)
        .build()
```

### `GetSharedEntityGroupEntityInfosByTypeAndPageLinkArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `groupType` | `String` | **yes** | Entity Group type | enum: `CUSTOMER`, `ASSET`, `DEVICE`, `USER`, `ENTITY_VIEW`, `DASHBOARD`, `EDGE` |
| `pageSize` | `String` | **yes** | Maximum amount of entities in a one page | |
| `page` | `String` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'startsWith' filter based on the entity group name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEntityInfo`


## getSharedEntityGroupsByTypeAndPageLink

**GET** `/api/entityGroups/{groupType}/shared`

Get Shared Entity Groups by entity type and page link (getSharedEntityGroupsByTypeAndPageLink)

Returns a page of Shared Entity Group Info objects based on the provided Entity Type and Page Link. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.Entity Group Info extends Entity Group object and adds 'ownerIds' - a list of owner ids.You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'READ' permission for specified group.

```java
PageDataEntityGroupInfo getSharedEntityGroupsByTypeAndPageLink(GetSharedEntityGroupsByTypeAndPageLinkArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetSharedEntityGroupsByTypeAndPageLinkArgs.builder()
        .groupType(String)
        .pageSize(String)
        .page(String)
        .build()
```

### `GetSharedEntityGroupsByTypeAndPageLinkArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `groupType` | `String` | **yes** | Entity Group type | enum: `CUSTOMER`, `ASSET`, `DEVICE`, `USER`, `ENTITY_VIEW`, `DASHBOARD`, `EDGE` |
| `pageSize` | `String` | **yes** | Maximum amount of entities in a one page | |
| `page` | `String` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'startsWith' filter based on the entity group name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataEntityGroupInfo`


## makeEntityGroupPrivate

**POST** `/api/entityGroup/{entityGroupId}/makePrivate`

Make Entity Group Private (makeEntityGroupPrivate)

Make the entity group not available for non authorized users. Every group is private by default. This call is useful to hide the group that was previously made public.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for specified group.

```java
void makeEntityGroupPrivate(MakeEntityGroupPrivateArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
MakeEntityGroupPrivateArgs.builder()
        .entityGroupId(String)
        .build()
```

### `MakeEntityGroupPrivateArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## makeEntityGroupPublic

**POST** `/api/entityGroup/{entityGroupId}/makePublic`

Make Entity Group Publicly available (makeEntityGroupPublic)

Make the entity group available for non authorized users. Useful for public dashboards that will be embedded into the public websites.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for specified group.

```java
void makeEntityGroupPublic(MakeEntityGroupPublicArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
MakeEntityGroupPublicArgs.builder()
        .entityGroupId(String)
        .build()
```

### `MakeEntityGroupPublicArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## removeEntitiesFromEntityGroup

**POST** `/api/entityGroup/{entityGroupId}/deleteEntities`

Remove entities from the group (removeEntitiesFromEntityGroup)

Removes entities from the specified entity group. Entity group allows you to group multiple entities of the same entity type (Device, Asset, Customer, User, Dashboard, etc). Entity Group always have an owner - particular Tenant or Customer. Each entity may belong to multiple groups simultaneously.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'REMOVE_FROM_GROUP' permission for specified group.

```java
void removeEntitiesFromEntityGroup(RemoveEntitiesFromEntityGroupArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
RemoveEntitiesFromEntityGroupArgs.builder()
        .entityGroupId(String)
        .requestBody(List<String>)
        .build()
```

### `RemoveEntitiesFromEntityGroupArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `requestBody` | `List<String>` | **yes** |  | |

### Return type

null (empty response body)


## saveEntityGroup

**POST** `/api/entityGroup`

Create Or Update Entity Group (saveEntityGroup)

Create or update the Entity Group. When creating Entity Group, platform generates Entity Group Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created Entity Group Id will be present in the response. Specify existing Entity Group Id to update the group. Referencing non-existing Entity Group Id will cause 'Not Found' error.Remove 'id', 'tenantId' and optionally 'ownerId' from the request body example (below) to create new Entity Group entity. When 'ownerId' is not set (or null), it defaults to the current user's owner (Tenant for tenant admins, Customer for customer users).   Entity group name is unique in the scope of owner and entity type. For example, you can't create two tenant device groups called 'Water meters'. However, you may create device and asset group with the same name. And also you may create groups with the same name for two different customers of the same tenant.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for specified group.

```java
EntityGroupInfo saveEntityGroup(SaveEntityGroupArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveEntityGroupArgs.builder()
        .entityGroup(EntityGroup)
        .build()
```

### `SaveEntityGroupArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroup` | `EntityGroup` | **yes** |  | |

### Return type

`EntityGroupInfo`


## shareEntityGroup

**POST** `/api/entityGroup/{entityGroupId}/share`

Share the Entity Group (shareEntityGroup)

Share the entity group with certain user group based on the provided Share Group Request. The request is quite flexible and processing of the request involves multiple security checks using platform RBAC feature.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for specified group.

```java
void shareEntityGroup(ShareEntityGroupArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ShareEntityGroupArgs.builder()
        .entityGroupId(String)
        .shareGroupRequest(ShareGroupRequest)
        .build()
```

### `ShareEntityGroupArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `shareGroupRequest` | `ShareGroupRequest` | **yes** |  | |

### Return type

null (empty response body)


## shareEntityGroupToChildOwnerUserGroup

**POST** `/api/entityGroup/{entityGroupId}/{userGroupId}/{roleId}/share`

Share the Entity Group with User group (shareEntityGroupToChildOwnerUserGroup)

Share the entity group with specified user group using specified role.   Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for specified group.

```java
void shareEntityGroupToChildOwnerUserGroup(ShareEntityGroupToChildOwnerUserGroupArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ShareEntityGroupToChildOwnerUserGroupArgs.builder()
        .entityGroupId(String)
        .userGroupId(String)
        .roleId(String)
        .build()
```

### `ShareEntityGroupToChildOwnerUserGroupArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityGroupId` | `String` | **yes** | A string value representing the Entity Group Id that you would like to share. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `userGroupId` | `String` | **yes** | A string value representing the Entity(User) Group Id that you would like to share with. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `roleId` | `String` | **yes** | A string value representing the Role Id that describes set of permissions you would like to share (read, write, etc). For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## unassignEntityGroupFromEdge

**DELETE** `/api/edge/{edgeId}/entityGroup/{entityGroupId}/{groupType}`

Unassign entity group from edge (unassignEntityGroupFromEdge)

Clears assignment of the entity group to the edge. Unassignment works in async way - first, 'unassign' notification event pushed to edge queue on platform. Second, remote edge service will receive an 'unassign' command to remove entity group (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once 'unassign' command will be delivered to edge service, it's going to remove entity group and entities inside this group locally.  Available for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority. Security check is performed to verify that the user has 'WRITE' permission for the entity (entities).

```java
EntityGroup unassignEntityGroupFromEdge(UnassignEntityGroupFromEdgeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UnassignEntityGroupFromEdgeArgs.builder()
        .edgeId(String)
        .groupType(String)
        .entityGroupId(String)
        .build()
```

### `UnassignEntityGroupFromEdgeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `groupType` | `String` | **yes** | EntityGroup type | enum: `ASSET`, `DEVICE`, `USER`, `ENTITY_VIEW`, `DASHBOARD` |
| `entityGroupId` | `String` | **yes** | A string value representing the Entity Group Id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`EntityGroup`

