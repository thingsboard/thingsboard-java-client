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

Returns an object with current entity data and the one at a specific version. Entity data structure is the same as stored in a repository.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **EntityType** | A string value representing the entity type. For example, &#39;DEVICE&#39; | [enum: TENANT, CUSTOMER, USER, DASHBOARD, ASSET, DEVICE, ALARM, ENTITY_GROUP, CONVERTER, INTEGRATION, RULE_CHAIN, RULE_NODE, SCHEDULER_EVENT, BLOB_ENTITY, REPORT_TEMPLATE, REPORT, ENTITY_VIEW, WIDGETS_BUNDLE, WIDGET_TYPE, ROLE, GROUP_PERMISSION, TENANT_PROFILE, DEVICE_PROFILE, ASSET_PROFILE, API_USAGE_STATE, TB_RESOURCE, OTA_PACKAGE, EDGE, RPC, QUEUE, NOTIFICATION_TARGET, NOTIFICATION_TEMPLATE, NOTIFICATION_REQUEST, NOTIFICATION, NOTIFICATION_RULE, QUEUE_STATS, OAUTH2_CLIENT, DOMAIN, MOBILE_APP, MOBILE_APP_BUNDLE, CALCULATED_FIELD, JOB, SECRET, ADMIN_SETTINGS, AI_MODEL, API_KEY] |
| **internalEntityUuid** | **UUID** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **versionId** | **String** | Version id, for example fd82625bdd7d6131cf8027b44ee967012ecaf990. Represents commit hash. | |


## getEntityDataInfo

> EntityDataInfo getEntityDataInfo(versionId, entityType, externalEntityUuid, internalEntityId)

Get entity data info (getEntityDataInfo)

Retrieves short info about the remote entity by external id at a concrete version.  Returned entity data info contains following properties: &#x60;hasRelations&#x60; (whether stored entity data contains relations), &#x60;hasAttributes&#x60; (contains attributes), &#x60;hasCredentials&#x60; (whether stored device data has credentials), &#x60;hasPermissions&#x60; (user group data contains group permission list) and &#x60;hasGroupEntities&#x60; (entity group data contains group entities).  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **versionId** | **String** | Version id, for example fd82625bdd7d6131cf8027b44ee967012ecaf990. Represents commit hash. | |
| **entityType** | **EntityType** | A string value representing the entity type. For example, &#39;DEVICE&#39; | [enum: TENANT, CUSTOMER, USER, DASHBOARD, ASSET, DEVICE, ALARM, ENTITY_GROUP, CONVERTER, INTEGRATION, RULE_CHAIN, RULE_NODE, SCHEDULER_EVENT, BLOB_ENTITY, REPORT_TEMPLATE, REPORT, ENTITY_VIEW, WIDGETS_BUNDLE, WIDGET_TYPE, ROLE, GROUP_PERMISSION, TENANT_PROFILE, DEVICE_PROFILE, ASSET_PROFILE, API_USAGE_STATE, TB_RESOURCE, OTA_PACKAGE, EDGE, RPC, QUEUE, NOTIFICATION_TARGET, NOTIFICATION_TEMPLATE, NOTIFICATION_REQUEST, NOTIFICATION, NOTIFICATION_RULE, QUEUE_STATS, OAUTH2_CLIENT, DOMAIN, MOBILE_APP, MOBILE_APP_BUNDLE, CALCULATED_FIELD, JOB, SECRET, ADMIN_SETTINGS, AI_MODEL, API_KEY] |
| **externalEntityUuid** | **UUID** | A string value representing external entity id | |
| **internalEntityId** | **UUID** | A string value representing the entity id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | [optional] |


## getVersionCreateRequestStatus

> VersionCreationResult getVersionCreateRequestStatus(requestId)

Get version create request status (getVersionCreateRequestStatus)

Returns the status of previously made version create request.   This status contains following properties: - &#x60;done&#x60; - whether request processing is finished; - &#x60;version&#x60; - created version info: timestamp, version id (commit hash), commit name and commit author; - &#x60;added&#x60; - count of items that were created in the remote repo; - &#x60;modified&#x60; - modified items count; - &#x60;removed&#x60; - removed items count; - &#x60;error&#x60; - error message, if an error occurred while handling the request.  An example of successful status: &#x60;&#x60;&#x60;json {   \&quot;done\&quot;: true,   \&quot;added\&quot;: 10,   \&quot;modified\&quot;: 2,   \&quot;removed\&quot;: 5,   \&quot;version\&quot;: {     \&quot;timestamp\&quot;: 1655198528000,     \&quot;id\&quot;:\&quot;8a834dd389ed80e0759ba8ee338b3f1fd160a114\&quot;,     \&quot;name\&quot;: \&quot;My devices v2.0\&quot;,     \&quot;author\&quot;: \&quot;John Doe\&quot;   },   \&quot;error\&quot;: null } &#x60;&#x60;&#x60;  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestId** | **UUID** | A string value representing the version control request id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getVersionLoadRequestStatus

> VersionLoadResult getVersionLoadRequestStatus(requestId)

Get version load request status (getVersionLoadRequestStatus)

Returns the status of previously made version load request. The structure contains following parameters: - &#x60;done&#x60; - if the request was successfully processed; - &#x60;result&#x60; - a list of load results for each entity type:      - &#x60;created&#x60; - created entities count;      - &#x60;updated&#x60; - updated entities count;      - &#x60;deleted&#x60; - removed entities count;      - &#x60;groupsCreated&#x60; - created entity groups count;      - &#x60;groupsUpdated&#x60; - updated entity groups count;      - &#x60;groupsDeleted&#x60; - removed entity groups count. - &#x60;error&#x60; - if an error occurred during processing, error info:      - &#x60;type&#x60; - error type;      - &#x60;source&#x60; - an external id of remote entity;      - &#x60;target&#x60; - if failed to find referenced entity by external id - this external id;      - &#x60;message&#x60; - error message.  An example of successfully processed request status: &#x60;&#x60;&#x60;json {   \&quot;done\&quot;: true,   \&quot;result\&quot;: [     {       \&quot;entityType\&quot;: \&quot;DEVICE\&quot;,       \&quot;created\&quot;: 10,       \&quot;updated\&quot;: 5,       \&quot;deleted\&quot;: 5,       \&quot;groupsCreated\&quot;: 1,       \&quot;groupsUpdated\&quot;: 1,       \&quot;groupsDeleted\&quot;: 1     },      {       \&quot;entityType\&quot;: \&quot;ASSET\&quot;,       \&quot;created\&quot;: 4,       \&quot;updated\&quot;: 0,       \&quot;deleted\&quot;: 8,       \&quot;groupsCreated\&quot;: 1,       \&quot;groupsUpdated\&quot;: 0,       \&quot;groupsDeleted\&quot;: 2     }   ] } &#x60;&#x60;&#x60;  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestId** | **UUID** | A string value representing the version control request id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## listAllEntitiesAtVersion

> List&lt;VersionedEntityInfo&gt; listAllEntitiesAtVersion(versionId)

List all entities at version (listAllEntitiesAtVersion)

Returns a list of all remote entities available in a specific version. Response type is the same as for listAllEntitiesAtVersion API method.  Returned entities order will be the same as in the repository.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **versionId** | **String** | Version id, for example fd82625bdd7d6131cf8027b44ee967012ecaf990. Represents commit hash. | |


## listBranches

> List&lt;BranchInfo&gt; listBranches()

List branches (listBranches)

Lists branches available in the remote repository.   Response example:  &#x60;&#x60;&#x60;json [   {     \&quot;name\&quot;: \&quot;master\&quot;,     \&quot;default\&quot;: true   },   {     \&quot;name\&quot;: \&quot;dev\&quot;,     \&quot;default\&quot;: false   },   {     \&quot;name\&quot;: \&quot;dev-2\&quot;,     \&quot;default\&quot;: false   } ] &#x60;&#x60;&#x60;

## listEntitiesAtVersion

> List&lt;VersionedEntityInfo&gt; listEntitiesAtVersion(entityType, versionId)

List entities at version (listEntitiesAtVersion)

Returns a list of remote entities of a specific entity type that are available at a concrete version.  Each entity item in the result has &#x60;externalId&#x60; property. Entities order will be the same as in the repository.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **EntityType** | A string value representing the entity type. For example, &#39;DEVICE&#39; | [enum: TENANT, CUSTOMER, USER, DASHBOARD, ASSET, DEVICE, ALARM, ENTITY_GROUP, CONVERTER, INTEGRATION, RULE_CHAIN, RULE_NODE, SCHEDULER_EVENT, BLOB_ENTITY, REPORT_TEMPLATE, REPORT, ENTITY_VIEW, WIDGETS_BUNDLE, WIDGET_TYPE, ROLE, GROUP_PERMISSION, TENANT_PROFILE, DEVICE_PROFILE, ASSET_PROFILE, API_USAGE_STATE, TB_RESOURCE, OTA_PACKAGE, EDGE, RPC, QUEUE, NOTIFICATION_TARGET, NOTIFICATION_TEMPLATE, NOTIFICATION_REQUEST, NOTIFICATION, NOTIFICATION_RULE, QUEUE_STATS, OAUTH2_CLIENT, DOMAIN, MOBILE_APP, MOBILE_APP_BUNDLE, CALCULATED_FIELD, JOB, SECRET, ADMIN_SETTINGS, AI_MODEL, API_KEY] |
| **versionId** | **String** | Version id, for example fd82625bdd7d6131cf8027b44ee967012ecaf990. Represents commit hash. | |


## listEntityTypeVersions

> PageDataEntityVersion listEntityTypeVersions(entityType, branch, pageSize, page, textSearch, sortProperty, sortOrder)

List entity type versions (listEntityTypeVersions)

Returns list of versions of an entity type in a branch. This is a collected list of versions that were created for entities of this type in a remote branch.  If specified branch does not exist - empty page data will be returned. The response structure is the same as for &#x60;listEntityVersions&#x60; API method.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **EntityType** | A string value representing the entity type. For example, &#39;DEVICE&#39; | [enum: TENANT, CUSTOMER, USER, DASHBOARD, ASSET, DEVICE, ALARM, ENTITY_GROUP, CONVERTER, INTEGRATION, RULE_CHAIN, RULE_NODE, SCHEDULER_EVENT, BLOB_ENTITY, REPORT_TEMPLATE, REPORT, ENTITY_VIEW, WIDGETS_BUNDLE, WIDGET_TYPE, ROLE, GROUP_PERMISSION, TENANT_PROFILE, DEVICE_PROFILE, ASSET_PROFILE, API_USAGE_STATE, TB_RESOURCE, OTA_PACKAGE, EDGE, RPC, QUEUE, NOTIFICATION_TARGET, NOTIFICATION_TEMPLATE, NOTIFICATION_REQUEST, NOTIFICATION, NOTIFICATION_RULE, QUEUE_STATS, OAUTH2_CLIENT, DOMAIN, MOBILE_APP, MOBILE_APP_BUNDLE, CALCULATED_FIELD, JOB, SECRET, ADMIN_SETTINGS, AI_MODEL, API_KEY] |
| **branch** | **String** | The name of the working branch, for example &#39;master&#39; | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the entity version name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: timestamp] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## listEntityVersions

> PageDataEntityVersion listEntityVersions(entityType, externalEntityUuid, branch, pageSize, page, internalEntityId, textSearch, sortProperty, sortOrder)

List entity versions (listEntityVersions)

Returns list of versions for a specific entity in a concrete branch.  You need to specify external id of an entity to list versions for. This is &#x60;externalId&#x60; property of an entity, or otherwise if not set - simply id of this entity.  If specified branch does not exist - empty page data will be returned.   Each version info item has timestamp, id, name and author. Version id can then be used to restore the version. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Response example:  &#x60;&#x60;&#x60;json {   \&quot;data\&quot;: [     {       \&quot;timestamp\&quot;: 1655198593000,       \&quot;id\&quot;: \&quot;fd82625bdd7d6131cf8027b44ee967012ecaf990\&quot;,       \&quot;name\&quot;: \&quot;Devices and assets - v2.0\&quot;,       \&quot;author\&quot;: \&quot;John Doe &lt;johndoe@gmail.com&gt;\&quot;     },     {       \&quot;timestamp\&quot;: 1655198528000,       \&quot;id\&quot;: \&quot;682adcffa9c8a2f863af6f00c4850323acbd4219\&quot;,       \&quot;name\&quot;: \&quot;Update my device\&quot;,       \&quot;author\&quot;: \&quot;John Doe &lt;johndoe@gmail.com&gt;\&quot;     },     {       \&quot;timestamp\&quot;: 1655198280000,       \&quot;id\&quot;: \&quot;d2a6087c2b30e18cc55e7cdda345a8d0dfb959a4\&quot;,       \&quot;name\&quot;: \&quot;Devices and assets - v1.0\&quot;,       \&quot;author\&quot;: \&quot;John Doe &lt;johndoe@gmail.com&gt;\&quot;     }   ],   \&quot;totalPages\&quot;: 1,   \&quot;totalElements\&quot;: 3,   \&quot;hasNext\&quot;: false } &#x60;&#x60;&#x60;  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityType** | **EntityType** | A string value representing the entity type. For example, &#39;DEVICE&#39; | [enum: TENANT, CUSTOMER, USER, DASHBOARD, ASSET, DEVICE, ALARM, ENTITY_GROUP, CONVERTER, INTEGRATION, RULE_CHAIN, RULE_NODE, SCHEDULER_EVENT, BLOB_ENTITY, REPORT_TEMPLATE, REPORT, ENTITY_VIEW, WIDGETS_BUNDLE, WIDGET_TYPE, ROLE, GROUP_PERMISSION, TENANT_PROFILE, DEVICE_PROFILE, ASSET_PROFILE, API_USAGE_STATE, TB_RESOURCE, OTA_PACKAGE, EDGE, RPC, QUEUE, NOTIFICATION_TARGET, NOTIFICATION_TEMPLATE, NOTIFICATION_REQUEST, NOTIFICATION, NOTIFICATION_RULE, QUEUE_STATS, OAUTH2_CLIENT, DOMAIN, MOBILE_APP, MOBILE_APP_BUNDLE, CALCULATED_FIELD, JOB, SECRET, ADMIN_SETTINGS, AI_MODEL, API_KEY] |
| **externalEntityUuid** | **UUID** | A string value representing external entity id. This is &#x60;externalId&#x60; property of an entity, or otherwise if not set - simply id of this entity. | |
| **branch** | **String** | The name of the working branch, for example &#39;master&#39; | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **internalEntityId** | **UUID** |  | [optional] |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the entity version name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: timestamp] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## listVersions

> PageDataEntityVersion listVersions(branch, pageSize, page, textSearch, sortProperty, sortOrder)

List all versions (listVersions)

Lists all available versions in a branch for all entity types.  If specified branch does not exist - empty page data will be returned. The response format is the same as for &#x60;listEntityVersions&#x60; API method.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **branch** | **String** | The name of the working branch, for example &#39;master&#39; | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive &#39;substring&#39; filter based on the entity version name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: timestamp] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## loadEntitiesVersion

> UUID loadEntitiesVersion(versionLoadRequest)

Load entities version (loadEntitiesVersion)

Loads specific version of remote entities (or single entity) by request. Supported entity types: CUSTOMER, ASSET, RULE_CHAIN, DASHBOARD, DEVICE_PROFILE, DEVICE, ENTITY_VIEW, WIDGETS_BUNDLE, CONVERTER, INTEGRATION, ROLE and USER group.  There are multiple types of request. Each of them requires branch name (&#x60;branch&#x60;) and version id (&#x60;versionId&#x60;). Request of type &#x60;SINGLE_ENTITY&#x60; is needed to restore a concrete version of a specific entity. It contains id of a remote entity (&#x60;externalEntityId&#x60;), internal entity id (&#x60;internalEntityId&#x60;) and additional configuration (&#x60;config&#x60;): - &#x60;loadRelations&#x60; - to update relations list (in case &#x60;saveRelations&#x60; option was enabled during version creation); - &#x60;loadAttributes&#x60; - to load entity attributes (if &#x60;saveAttributes&#x60; config option was enabled); - &#x60;loadCredentials&#x60; - to update device credentials (if &#x60;saveCredentials&#x60; option was enabled during version creation); - &#x60;loadPermissions&#x60; - when loading user group, to update group permission list; - &#x60;loadGroupEntities&#x60; - when loading an entity group, to load its entities as well; - &#x60;autoGenerateIntegrationKey&#x60; - if loading integration version, to autogenerate routing key.  An example of such request: &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;SINGLE_ENTITY\&quot;,      \&quot;branch\&quot;: \&quot;dev\&quot;,   \&quot;versionId\&quot;: \&quot;b3c28d722d328324c7c15b0b30047b0c40011cf7\&quot;,      \&quot;externalEntityId\&quot;: {     \&quot;entityType\&quot;: \&quot;DEVICE\&quot;,     \&quot;id\&quot;: \&quot;b7944123-d4f4-11ec-847b-0f432358ab48\&quot;   },   \&quot;config\&quot;: {     \&quot;loadRelations\&quot;: false,     \&quot;loadAttributes\&quot;: true,     \&quot;loadCredentials\&quot;: true   } } &#x60;&#x60;&#x60;  Another request type (&#x60;ENTITY_TYPE&#x60;) is needed to load specific version of the whole entity types. It contains a structure with entity types to load and configs for each entity type (&#x60;entityTypes&#x60;). For each specified entity type, the method will load all remote entities of this type that are present at the version. A config for each entity type contains the same options as in &#x60;SINGLE_ENTITY&#x60; request type, and additionally contains following options: - &#x60;removeOtherEntities&#x60; - to remove local entities that are not present on the remote - basically to    overwrite local entity type with the remote one; - &#x60;findExistingEntityByName&#x60; - when you are loading some remote entities that are not yet present at this tenant,    try to find existing entity by name and update it rather than create new.  Here is an example of the request to completely restore version of the whole device entity type: &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;ENTITY_TYPE\&quot;,    \&quot;branch\&quot;: \&quot;dev\&quot;,   \&quot;versionId\&quot;: \&quot;b3c28d722d328324c7c15b0b30047b0c40011cf7\&quot;,    \&quot;entityTypes\&quot;: {     \&quot;DEVICE\&quot;: {       \&quot;removeOtherEntities\&quot;: true,       \&quot;findExistingEntityByName\&quot;: false,       \&quot;loadRelations\&quot;: true,       \&quot;loadAttributes\&quot;: true,       \&quot;loadCredentials\&quot;: true     }   } } &#x60;&#x60;&#x60;  The response will contain generated request UUID that is to be used to check the status of operation via &#x60;getVersionLoadRequestStatus&#x60;.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **versionLoadRequest** | **VersionLoadRequest** |  | |


## saveEntitiesVersion

> UUID saveEntitiesVersion(versionCreateRequest)

Save entities version (saveEntitiesVersion)

Creates a new version of entities (or a single entity) by request. Supported entity types: CUSTOMER, ASSET, RULE_CHAIN, DASHBOARD, DEVICE_PROFILE, DEVICE, ENTITY_VIEW, WIDGETS_BUNDLE, CONVERTER, INTEGRATION, ROLE and USER group.  There are two available types of request: &#x60;SINGLE_ENTITY&#x60; and &#x60;COMPLEX&#x60;. Each of them contains version name (&#x60;versionName&#x60;) and name of a branch (&#x60;branch&#x60;) to create version (commit) in. If specified branch does not exists in a remote repo, then new empty branch will be created. Request of the &#x60;SINGLE_ENTITY&#x60; type has id of an entity (&#x60;entityId&#x60;) and additional configuration (&#x60;config&#x60;) which has following options:  - &#x60;saveRelations&#x60; - whether to add inbound and outbound relations of type COMMON to created entity version; - &#x60;saveAttributes&#x60; - to save attributes of server scope (and also shared scope for devices); - &#x60;saveCredentials&#x60; - when saving a version of a device, to add its credentials to the version; - &#x60;savePermissions&#x60; - when saving a user group - to save group permission list; - &#x60;saveGroupEntities&#x60; - when saving an entity group - to save its entities as well.  An example of a &#x60;SINGLE_ENTITY&#x60; version create request: &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;SINGLE_ENTITY\&quot;,    \&quot;versionName\&quot;: \&quot;Version 1.0\&quot;,   \&quot;branch\&quot;: \&quot;dev\&quot;,    \&quot;entityId\&quot;: {     \&quot;entityType\&quot;: \&quot;DEVICE\&quot;,     \&quot;id\&quot;: \&quot;b79448e0-d4f4-11ec-847b-0f432358ab48\&quot;   },   \&quot;config\&quot;: {     \&quot;saveRelations\&quot;: true,     \&quot;saveAttributes\&quot;: true,     \&quot;saveCredentials\&quot;: false   } } &#x60;&#x60;&#x60;  Second request type (&#x60;COMPLEX&#x60;), additionally to &#x60;branch&#x60; and &#x60;versionName&#x60;, contains following properties: - &#x60;entityTypes&#x60; - a structure with entity types to export and configuration for each entity type;    this configuration has all the options available for &#x60;SINGLE_ENTITY&#x60; and additionally has these ones:       - &#x60;allEntities&#x60; and &#x60;entityIds&#x60; - if you want to save the version of all entities of the entity type         then set &#x60;allEntities&#x60; param to true, otherwise set it to false and specify &#x60;entityIds&#x60; -         in case entity type is group entity, list of specific entity groups, or if not - list of entities;      - &#x60;syncStrategy&#x60; - synchronization strategy to use for this entity type: when set to &#x60;OVERWRITE&#x60;         then the list of remote entities of this type will be overwritten by newly added entities. If set to         &#x60;MERGE&#x60; - existing remote entities of this entity type will not be removed, new entities will just         be added on top (or existing remote entities will be updated). - &#x60;syncStrategy&#x60; - default synchronization strategy to use when it is not specified for an entity type.  Example for this type of request: &#x60;&#x60;&#x60;json {   \&quot;type\&quot;: \&quot;COMPLEX\&quot;,    \&quot;versionName\&quot;: \&quot;Devices and profiles: release 2\&quot;,   \&quot;branch\&quot;: \&quot;master\&quot;,    \&quot;syncStrategy\&quot;: \&quot;OVERWRITE\&quot;,   \&quot;entityTypes\&quot;: {     \&quot;DEVICE\&quot;: {       \&quot;syncStrategy\&quot;: null,       \&quot;allEntities\&quot;: true,       \&quot;saveRelations\&quot;: true,       \&quot;saveAttributes\&quot;: true,       \&quot;saveCredentials\&quot;: true     },     \&quot;DEVICE_PROFILE\&quot;: {       \&quot;syncStrategy\&quot;: \&quot;MERGE\&quot;,       \&quot;allEntities\&quot;: false,       \&quot;entityIds\&quot;: [         \&quot;b79448e0-d4f4-11ec-847b-0f432358ab48\&quot;       ],       \&quot;saveRelations\&quot;: true     }   } } &#x60;&#x60;&#x60;  Response wil contain generated request UUID, that can be then used to retrieve status of operation via &#x60;getVersionCreateRequestStatus&#x60;.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **versionCreateRequest** | **VersionCreateRequest** |  | |

