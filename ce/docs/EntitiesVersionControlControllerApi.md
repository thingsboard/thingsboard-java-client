# EntitiesVersionControlControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**compareEntityDataToVersion**](#compareEntityDataToVersion) | **GET** /api/entities/vc/diff/{entityType}/{internalEntityUuid} | Compare entity data to version (compareEntityDataToVersion) |
| [**getEntityDataInfo**](#getEntityDataInfo) | **GET** /api/entities/vc/info/{versionId}/{entityType}/{externalEntityUuid} | Get entity data info (getEntityDataInfo) |
| [**getVersionCreateRequestStatus**](#getVersionCreateRequestStatus) | **GET** /api/entities/vc/version/{requestId}/status | Get version create request status (getVersionCreateRequestStatus) |
| [**getVersionLoadRequestStatus**](#getVersionLoadRequestStatus) | **GET** /api/entities/vc/entity/{requestId}/status | Get version load request status (getVersionLoadRequestStatus) |
| [**listAllEntitiesAtVersion**](#listAllEntitiesAtVersion) | **GET** /api/entities/vc/entity/{versionId} | List all entities at version (listAllEntitiesAtVersion) |
| [**listBranches**](#listBranches) | **GET** /api/entities/vc/branches | List branches (listBranches) |
| [**listEntitiesAtVersion**](#listEntitiesAtVersion) | **GET** /api/entities/vc/entity/{entityType}/{versionId} | List entities at version (listEntitiesAtVersion) |
| [**listEntityTypeVersions**](#listEntityTypeVersions) | **GET** /api/entities/vc/version/{entityType} | List entity type versions (listEntityTypeVersions) |
| [**listEntityVersions**](#listEntityVersions) | **GET** /api/entities/vc/version/{entityType}/{externalEntityUuid} | List entity versions (listEntityVersions) |
| [**listVersions**](#listVersions) | **GET** /api/entities/vc/version | List all versions (listVersions) |
| [**loadEntitiesVersion**](#loadEntitiesVersion) | **POST** /api/entities/vc/entity | Load entities version (loadEntitiesVersion) |
| [**saveEntitiesVersion**](#saveEntitiesVersion) | **POST** /api/entities/vc/version | Save entities version (saveEntitiesVersion) |



## compareEntityDataToVersion

> EntityDataDiff compareEntityDataToVersion(entityType, internalEntityUuid, versionId)

Compare entity data to version (compareEntityDataToVersion)

Returns an object with current entity data and the one at a specific version. Entity data structure is the same as stored in a repository.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **EntityType** | A string value representing the entity type. For example, 'DEVICE' | [enum: TENANT, CUSTOMER, USER, DASHBOARD, ASSET, DEVICE, ALARM, RULE_CHAIN, RULE_NODE, ENTITY_VIEW, WIDGETS_BUNDLE, WIDGET_TYPE, TENANT_PROFILE, DEVICE_PROFILE, ASSET_PROFILE, API_USAGE_STATE, TB_RESOURCE, OTA_PACKAGE, EDGE, RPC, QUEUE, NOTIFICATION_TARGET, NOTIFICATION_TEMPLATE, NOTIFICATION_REQUEST, NOTIFICATION, NOTIFICATION_RULE, QUEUE_STATS, OAUTH2_CLIENT, DOMAIN, MOBILE_APP, MOBILE_APP_BUNDLE, CALCULATED_FIELD, JOB, ADMIN_SETTINGS, AI_MODEL, API_KEY] |
| **internalEntityUuid** | **UUID** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **versionId** | **String** | Version id, for example fd82625bdd7d6131cf8027b44ee967012ecaf990. Represents commit hash. | |

### Return type

**EntityDataDiff**


## getEntityDataInfo

> EntityDataInfo getEntityDataInfo(versionId, entityType, externalEntityUuid)

Get entity data info (getEntityDataInfo)

Retrieves short info about the remote entity by external id at a concrete version.  Returned entity data info contains following properties: `hasRelations` (whether stored entity data contains relations), `hasAttributes` (contains attributes) and `hasCredentials` (whether stored device data has credentials).  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **versionId** | **String** | Version id, for example fd82625bdd7d6131cf8027b44ee967012ecaf990. Represents commit hash. | |
| **entityType** | **EntityType** | A string value representing the entity type. For example, 'DEVICE' | [enum: TENANT, CUSTOMER, USER, DASHBOARD, ASSET, DEVICE, ALARM, RULE_CHAIN, RULE_NODE, ENTITY_VIEW, WIDGETS_BUNDLE, WIDGET_TYPE, TENANT_PROFILE, DEVICE_PROFILE, ASSET_PROFILE, API_USAGE_STATE, TB_RESOURCE, OTA_PACKAGE, EDGE, RPC, QUEUE, NOTIFICATION_TARGET, NOTIFICATION_TEMPLATE, NOTIFICATION_REQUEST, NOTIFICATION, NOTIFICATION_RULE, QUEUE_STATS, OAUTH2_CLIENT, DOMAIN, MOBILE_APP, MOBILE_APP_BUNDLE, CALCULATED_FIELD, JOB, ADMIN_SETTINGS, AI_MODEL, API_KEY] |
| **externalEntityUuid** | **UUID** | A string value representing external entity id | |

### Return type

**EntityDataInfo**


## getVersionCreateRequestStatus

> VersionCreationResult getVersionCreateRequestStatus(requestId)

Get version create request status (getVersionCreateRequestStatus)

Returns the status of previously made version create request.   This status contains following properties: - `done` - whether request processing is finished; - `version` - created version info: timestamp, version id (commit hash), commit name and commit author; - `added` - count of items that were created in the remote repo; - `modified` - modified items count; - `removed` - removed items count; - `error` - error message, if an error occurred while handling the request.  An example of successful status: ```json {   \"done\": true,   \"added\": 10,   \"modified\": 2,   \"removed\": 5,   \"version\": {     \"timestamp\": 1655198528000,     \"id\":\"8a834dd389ed80e0759ba8ee338b3f1fd160a114\",     \"name\": \"My devices v2.0\",     \"author\": \"John Doe\"   },   \"error\": null } ```  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestId** | **UUID** | A string value representing the version control request id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**VersionCreationResult**


## getVersionLoadRequestStatus

> VersionLoadResult getVersionLoadRequestStatus(requestId)

Get version load request status (getVersionLoadRequestStatus)

Returns the status of previously made version load request. The structure contains following parameters: - `done` - if the request was successfully processed; - `result` - a list of load results for each entity type:      - `created` - created entities count;      - `updated` - updated entities count;      - `deleted` - removed entities count. - `error` - if an error occurred during processing, error info:      - `type` - error type;      - `source` - an external id of remote entity;      - `target` - if failed to find referenced entity by external id - this external id;      - `message` - error message.  An example of successfully processed request status: ```json {   \"done\": true,   \"result\": [     {       \"entityType\": \"DEVICE\",       \"created\": 10,       \"updated\": 5,       \"deleted\": 5     },      {       \"entityType\": \"ASSET\",       \"created\": 4,       \"updated\": 0,       \"deleted\": 8     }   ] } ```  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestId** | **UUID** | A string value representing the version control request id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

**VersionLoadResult**


## listAllEntitiesAtVersion

> List<VersionedEntityInfo> listAllEntitiesAtVersion(versionId)

List all entities at version (listAllEntitiesAtVersion)

Returns a list of all remote entities available in a specific version. Response type is the same as for listAllEntitiesAtVersion API method.  Returned entities order will be the same as in the repository.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **versionId** | **String** | Version id, for example fd82625bdd7d6131cf8027b44ee967012ecaf990. Represents commit hash. | |

### Return type

**List<VersionedEntityInfo>**


## listBranches

> List<BranchInfo> listBranches()

List branches (listBranches)

Lists branches available in the remote repository.   Response example:  ```json [   {     \"name\": \"master\",     \"default\": true   },   {     \"name\": \"dev\",     \"default\": false   },   {     \"name\": \"dev-2\",     \"default\": false   } ] ```

### Return type

**List<BranchInfo>**


## listEntitiesAtVersion

> List<VersionedEntityInfo> listEntitiesAtVersion(entityType, versionId)

List entities at version (listEntitiesAtVersion)

Returns a list of remote entities of a specific entity type that are available at a concrete version.  Each entity item in the result has `externalId` property. Entities order will be the same as in the repository.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **EntityType** | A string value representing the entity type. For example, 'DEVICE' | [enum: TENANT, CUSTOMER, USER, DASHBOARD, ASSET, DEVICE, ALARM, RULE_CHAIN, RULE_NODE, ENTITY_VIEW, WIDGETS_BUNDLE, WIDGET_TYPE, TENANT_PROFILE, DEVICE_PROFILE, ASSET_PROFILE, API_USAGE_STATE, TB_RESOURCE, OTA_PACKAGE, EDGE, RPC, QUEUE, NOTIFICATION_TARGET, NOTIFICATION_TEMPLATE, NOTIFICATION_REQUEST, NOTIFICATION, NOTIFICATION_RULE, QUEUE_STATS, OAUTH2_CLIENT, DOMAIN, MOBILE_APP, MOBILE_APP_BUNDLE, CALCULATED_FIELD, JOB, ADMIN_SETTINGS, AI_MODEL, API_KEY] |
| **versionId** | **String** | Version id, for example fd82625bdd7d6131cf8027b44ee967012ecaf990. Represents commit hash. | |

### Return type

**List<VersionedEntityInfo>**


## listEntityTypeVersions

> PageDataEntityVersion listEntityTypeVersions(entityType, branch, pageSize, page, textSearch, sortProperty, sortOrder)

List entity type versions (listEntityTypeVersions)

Returns list of versions of an entity type in a branch. This is a collected list of versions that were created for entities of this type in a remote branch.  If specified branch does not exist - empty page data will be returned. The response structure is the same as for `listEntityVersions` API method.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **EntityType** | A string value representing the entity type. For example, 'DEVICE' | [enum: TENANT, CUSTOMER, USER, DASHBOARD, ASSET, DEVICE, ALARM, RULE_CHAIN, RULE_NODE, ENTITY_VIEW, WIDGETS_BUNDLE, WIDGET_TYPE, TENANT_PROFILE, DEVICE_PROFILE, ASSET_PROFILE, API_USAGE_STATE, TB_RESOURCE, OTA_PACKAGE, EDGE, RPC, QUEUE, NOTIFICATION_TARGET, NOTIFICATION_TEMPLATE, NOTIFICATION_REQUEST, NOTIFICATION, NOTIFICATION_RULE, QUEUE_STATS, OAUTH2_CLIENT, DOMAIN, MOBILE_APP, MOBILE_APP_BUNDLE, CALCULATED_FIELD, JOB, ADMIN_SETTINGS, AI_MODEL, API_KEY] |
| **branch** | **String** | The name of the working branch, for example 'master' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the entity version name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: timestamp] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityVersion**


## listEntityVersions

> PageDataEntityVersion listEntityVersions(entityType, externalEntityUuid, branch, pageSize, page, textSearch, sortProperty, sortOrder)

List entity versions (listEntityVersions)

Returns list of versions for a specific entity in a concrete branch.  You need to specify external id of an entity to list versions for. This is `externalId` property of an entity, or otherwise if not set - simply id of this entity.  If specified branch does not exist - empty page data will be returned.   Each version info item has timestamp, id, name and author. Version id can then be used to restore the version. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Response example:  ```json {   \"data\": [     {       \"timestamp\": 1655198593000,       \"id\": \"fd82625bdd7d6131cf8027b44ee967012ecaf990\",       \"name\": \"Devices and assets - v2.0\",       \"author\": \"John Doe <johndoe@gmail.com>\"     },     {       \"timestamp\": 1655198528000,       \"id\": \"682adcffa9c8a2f863af6f00c4850323acbd4219\",       \"name\": \"Update my device\",       \"author\": \"John Doe <johndoe@gmail.com>\"     },     {       \"timestamp\": 1655198280000,       \"id\": \"d2a6087c2b30e18cc55e7cdda345a8d0dfb959a4\",       \"name\": \"Devices and assets - v1.0\",       \"author\": \"John Doe <johndoe@gmail.com>\"     }   ],   \"totalPages\": 1,   \"totalElements\": 3,   \"hasNext\": false } ```  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **EntityType** | A string value representing the entity type. For example, 'DEVICE' | [enum: TENANT, CUSTOMER, USER, DASHBOARD, ASSET, DEVICE, ALARM, RULE_CHAIN, RULE_NODE, ENTITY_VIEW, WIDGETS_BUNDLE, WIDGET_TYPE, TENANT_PROFILE, DEVICE_PROFILE, ASSET_PROFILE, API_USAGE_STATE, TB_RESOURCE, OTA_PACKAGE, EDGE, RPC, QUEUE, NOTIFICATION_TARGET, NOTIFICATION_TEMPLATE, NOTIFICATION_REQUEST, NOTIFICATION, NOTIFICATION_RULE, QUEUE_STATS, OAUTH2_CLIENT, DOMAIN, MOBILE_APP, MOBILE_APP_BUNDLE, CALCULATED_FIELD, JOB, ADMIN_SETTINGS, AI_MODEL, API_KEY] |
| **externalEntityUuid** | **UUID** | A string value representing external entity id. This is `externalId` property of an entity, or otherwise if not set - simply id of this entity. | |
| **branch** | **String** | The name of the working branch, for example 'master' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the entity version name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: timestamp] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityVersion**


## listVersions

> PageDataEntityVersion listVersions(branch, pageSize, page, textSearch, sortProperty, sortOrder)

List all versions (listVersions)

Lists all available versions in a branch for all entity types.  If specified branch does not exist - empty page data will be returned. The response format is the same as for `listEntityVersions` API method.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **branch** | **String** | The name of the working branch, for example 'master' | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive 'substring' filter based on the entity version name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: timestamp] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |

### Return type

**PageDataEntityVersion**


## loadEntitiesVersion

> UUID loadEntitiesVersion(versionLoadRequest)

Load entities version (loadEntitiesVersion)

Loads specific version of remote entities (or single entity) by request. Supported entity types: CUSTOMER, ASSET, RULE_CHAIN, DASHBOARD, DEVICE_PROFILE, DEVICE, ENTITY_VIEW, WIDGETS_BUNDLE.  There are multiple types of request. Each of them requires branch name (`branch`) and version id (`versionId`). Request of type `SINGLE_ENTITY` is needed to restore a concrete version of a specific entity. It contains id of a remote entity (`externalEntityId`) and additional configuration (`config`): - `loadRelations` - to update relations list (in case `saveRelations` option was enabled during version creation); - `loadAttributes` - to load entity attributes (if `saveAttributes` config option was enabled); - `loadCredentials` - to update device credentials (if `saveCredentials` option was enabled during version creation).  An example of such request: ```json {   \"type\": \"SINGLE_ENTITY\",      \"branch\": \"dev\",   \"versionId\": \"b3c28d722d328324c7c15b0b30047b0c40011cf7\",      \"externalEntityId\": {     \"entityType\": \"DEVICE\",     \"id\": \"b7944123-d4f4-11ec-847b-0f432358ab48\"   },   \"config\": {     \"loadRelations\": false,     \"loadAttributes\": true,     \"loadCredentials\": true   } } ```  Another request type (`ENTITY_TYPE`) is needed to load specific version of the whole entity types. It contains a structure with entity types to load and configs for each entity type (`entityTypes`). For each specified entity type, the method will load all remote entities of this type that are present at the version. A config for each entity type contains the same options as in `SINGLE_ENTITY` request type, and additionally contains following options: - `removeOtherEntities` - to remove local entities that are not present on the remote - basically to    overwrite local entity type with the remote one; - `findExistingEntityByName` - when you are loading some remote entities that are not yet present at this tenant,    try to find existing entity by name and update it rather than create new.  Here is an example of the request to completely restore version of the whole device entity type: ```json {   \"type\": \"ENTITY_TYPE\",    \"branch\": \"dev\",   \"versionId\": \"b3c28d722d328324c7c15b0b30047b0c40011cf7\",    \"entityTypes\": {     \"DEVICE\": {       \"removeOtherEntities\": true,       \"findExistingEntityByName\": false,       \"loadRelations\": true,       \"loadAttributes\": true,       \"loadCredentials\": true     }   } } ```  The response will contain generated request UUID that is to be used to check the status of operation via `getVersionLoadRequestStatus`.  Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **versionLoadRequest** | **VersionLoadRequest** |  | |

### Return type

**UUID**


## saveEntitiesVersion

> UUID saveEntitiesVersion(versionCreateRequest)

Save entities version (saveEntitiesVersion)

Creates a new version of entities (or a single entity) by request. Supported entity types: CUSTOMER, ASSET, RULE_CHAIN, DASHBOARD, DEVICE_PROFILE, DEVICE, ENTITY_VIEW, WIDGETS_BUNDLE.  There are two available types of request: `SINGLE_ENTITY` and `COMPLEX`. Each of them contains version name (`versionName`) and name of a branch (`branch`) to create version (commit) in. If specified branch does not exists in a remote repo, then new empty branch will be created. Request of the `SINGLE_ENTITY` type has id of an entity (`entityId`) and additional configuration (`config`) which has following options:  - `saveRelations` - whether to add inbound and outbound relations of type COMMON to created entity version; - `saveAttributes` - to save attributes of server scope (and also shared scope for devices); - `saveCredentials` - when saving a version of a device, to add its credentials to the version.  An example of a `SINGLE_ENTITY` version create request: ```json {   \"type\": \"SINGLE_ENTITY\",    \"versionName\": \"Version 1.0\",   \"branch\": \"dev\",    \"entityId\": {     \"entityType\": \"DEVICE\",     \"id\": \"b79448e0-d4f4-11ec-847b-0f432358ab48\"   },   \"config\": {     \"saveRelations\": true,     \"saveAttributes\": true,     \"saveCredentials\": false   } } ```  Second request type (`COMPLEX`), additionally to `branch` and `versionName`, contains following properties: - `entityTypes` - a structure with entity types to export and configuration for each entity type;    this configuration has all the options available for `SINGLE_ENTITY` and additionally has these ones:       - `allEntities` and `entityIds` - if you want to save the version of all entities of the entity type         then set `allEntities` param to true, otherwise set it to false and specify the list of specific entities (`entityIds`);      - `syncStrategy` - synchronization strategy to use for this entity type: when set to `OVERWRITE`         then the list of remote entities of this type will be overwritten by newly added entities. If set to         `MERGE` - existing remote entities of this entity type will not be removed, new entities will just         be added on top (or existing remote entities will be updated). - `syncStrategy` - default synchronization strategy to use when it is not specified for an entity type.  Example for this type of request: ```json {   \"type\": \"COMPLEX\",    \"versionName\": \"Devices and profiles: release 2\",   \"branch\": \"master\",    \"syncStrategy\": \"OVERWRITE\",   \"entityTypes\": {     \"DEVICE\": {       \"syncStrategy\": null,       \"allEntities\": true,       \"saveRelations\": true,       \"saveAttributes\": true,       \"saveCredentials\": true     },     \"DEVICE_PROFILE\": {       \"syncStrategy\": \"MERGE\",       \"allEntities\": false,       \"entityIds\": [         \"b79448e0-d4f4-11ec-847b-0f432358ab48\"       ],       \"saveRelations\": true     }   } } ```  Response wil contain generated request UUID, that can be then used to retrieve status of operation via `getVersionCreateRequestStatus`.   Available for users with 'TENANT_ADMIN' authority.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **versionCreateRequest** | **VersionCreateRequest** |  | |

### Return type

**UUID**

