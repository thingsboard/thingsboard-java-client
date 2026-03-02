# EntityRelationControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteRelation**](#deleteRelation) | **DELETE** /api/relation | Delete Relation (deleteRelation) |
| [**deleteRelationV2**](#deleteRelationV2) | **DELETE** /api/v2/relation | Delete Relation (deleteRelationV2) |
| [**deleteRelations**](#deleteRelations) | **DELETE** /api/relations | Delete common relations (deleteCommonRelations) |
| [**findByFromAndRelationType**](#findByFromAndRelationType) | **GET** /api/relations/from/{fromType}/{fromId}/{relationType} | Get List of Relations (findByFromAndRelationType) |
| [**findByFromV2**](#findByFromV2) | **GET** /api/relations/from/{fromType}/{fromId} | Get List of Relations (findByFromV2) |
| [**findByToAndRelationType**](#findByToAndRelationType) | **GET** /api/relations/to/{toType}/{toId}/{relationType} | Get List of Relations (findByToAndRelationType) |
| [**findByToV2**](#findByToV2) | **GET** /api/relations/to/{toType}/{toId} | Get List of Relations (findByToV2) |
| [**findEntityRelationsByQuery**](#findEntityRelationsByQuery) | **POST** /api/relations | Find related entities (findEntityRelationsByQuery) |
| [**findInfoByFromV2**](#findInfoByFromV2) | **GET** /api/relations/info/from/{fromType}/{fromId} | Get List of Relation Infos (findInfoByFromV2) |
| [**findInfoByQuery**](#findInfoByQuery) | **POST** /api/relations/info | Find related entity infos (findInfoByQuery) |
| [**findInfoByToV2**](#findInfoByToV2) | **GET** /api/relations/info/to/{toType}/{toId} | Get List of Relation Infos (findInfoByToV2) |
| [**getRelation**](#getRelation) | **GET** /api/relation | Get Relation (getRelation) |
| [**saveRelation**](#saveRelation) | **POST** /api/relation | Create Relation (saveRelation) |
| [**saveRelationV2**](#saveRelationV2) | **POST** /api/v2/relation | Create Relation (saveRelationV2) |



## deleteRelation

> deleteRelation(fromId, fromType, relationType, toId, toType, relationTypeGroup)

Delete Relation (deleteRelation)

Deletes a relation between two entities in the platform.   If the user has the authority of 'System Administrator', the server checks that 'from' and 'to' entities are owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that 'from' and 'to' entities are owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the 'from' and 'to' entities are assigned to the same customer.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fromId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **fromType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **relationType** | **String** | A string value representing relation type between entities. For example, 'Contains', 'Manages'. It can be any string value. | |
| **toId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **toType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **relationTypeGroup** | **String** | A string value representing relation type group. For example, 'COMMON' | [optional] |

### Return type

null (empty response body)


## deleteRelationV2

> EntityRelation deleteRelationV2(fromId, fromType, relationType, toId, toType, relationTypeGroup)

Delete Relation (deleteRelationV2)

Deletes a relation between two entities in the platform.   If the user has the authority of 'System Administrator', the server checks that 'from' and 'to' entities are owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that 'from' and 'to' entities are owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the 'from' and 'to' entities are assigned to the same customer.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fromId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **fromType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **relationType** | **String** | A string value representing relation type between entities. For example, 'Contains', 'Manages'. It can be any string value. | |
| **toId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **toType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **relationTypeGroup** | **String** | A string value representing relation type group. For example, 'COMMON' | [optional] |

### Return type

**EntityRelation**


## deleteRelations

> deleteRelations(entityId, entityType)

Delete common relations (deleteCommonRelations)

Deletes all the relations ('from' and 'to' direction) for the specified entity and relation type group: 'COMMON'.   If the user has the authority of 'System Administrator', the server checks that the entity is owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that the entity is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the entity is assigned to the same customer.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |

### Return type

null (empty response body)


## findByFromAndRelationType

> List<EntityRelation> findByFromAndRelationType(fromType, fromId, relationType, relationTypeGroup)

Get List of Relations (findByFromAndRelationType)

Returns list of relation objects for the specified entity by the 'from' direction and relation type.   If the user has the authority of 'System Administrator', the server checks that the entity is owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that the entity is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the entity is assigned to the same customer.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fromType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **fromId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **relationType** | **String** | A string value representing relation type between entities. For example, 'Contains', 'Manages'. It can be any string value. | |
| **relationTypeGroup** | **String** | A string value representing relation type group. For example, 'COMMON' | [optional] |

### Return type

**List<EntityRelation>**


## findByFromV2

> List<EntityRelation> findByFromV2(fromType, fromId, relationTypeGroup)

Get List of Relations (findByFromV2)

Returns list of relation objects for the specified entity by the 'from' direction.   If the user has the authority of 'System Administrator', the server checks that the entity is owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that the entity is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the entity is assigned to the same customer.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fromType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **fromId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **relationTypeGroup** | **String** | A string value representing relation type group. For example, 'COMMON' | [optional] |

### Return type

**List<EntityRelation>**


## findByToAndRelationType

> List<EntityRelation> findByToAndRelationType(toType, toId, relationType, relationTypeGroup)

Get List of Relations (findByToAndRelationType)

Returns list of relation objects for the specified entity by the 'to' direction and relation type.   If the user has the authority of 'System Administrator', the server checks that the entity is owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that the entity is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the entity is assigned to the same customer.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **toId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **relationType** | **String** | A string value representing relation type between entities. For example, 'Contains', 'Manages'. It can be any string value. | |
| **relationTypeGroup** | **String** | A string value representing relation type group. For example, 'COMMON' | [optional] |

### Return type

**List<EntityRelation>**


## findByToV2

> List<EntityRelation> findByToV2(toType, toId, relationTypeGroup)

Get List of Relations (findByToV2)

Returns list of relation objects for the specified entity by the 'to' direction.   If the user has the authority of 'System Administrator', the server checks that the entity is owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that the entity is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the entity is assigned to the same customer.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **toId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **relationTypeGroup** | **String** | A string value representing relation type group. For example, 'COMMON' | [optional] |

### Return type

**List<EntityRelation>**


## findEntityRelationsByQuery

> List<EntityRelation> findEntityRelationsByQuery(entityRelationsQuery)

Find related entities (findEntityRelationsByQuery)

Returns all entities that are related to the specific entity. The entity id, relation type, entity types, depth of the search, and other query parameters defined using complex 'EntityRelationsQuery' object. See 'Model' tab of the Parameters for more info.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityRelationsQuery** | **EntityRelationsQuery** |  | |

### Return type

**List<EntityRelation>**


## findInfoByFromV2

> List<EntityRelationInfo> findInfoByFromV2(fromType, fromId, relationTypeGroup)

Get List of Relation Infos (findInfoByFromV2)

Returns list of relation info objects for the specified entity by the 'from' direction.   If the user has the authority of 'System Administrator', the server checks that the entity is owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that the entity is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the entity is assigned to the same customer. Relation Info is an extension of the default Relation object that contains information about the 'from' and 'to' entity names. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fromType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **fromId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **relationTypeGroup** | **String** | A string value representing relation type group. For example, 'COMMON' | [optional] |

### Return type

**List<EntityRelationInfo>**


## findInfoByQuery

> List<EntityRelationInfo> findInfoByQuery(entityRelationsQuery)

Find related entity infos (findInfoByQuery)

Returns all entity infos that are related to the specific entity. The entity id, relation type, entity types, depth of the search, and other query parameters defined using complex 'EntityRelationsQuery' object. See 'Model' tab of the Parameters for more info. Relation Info is an extension of the default Relation object that contains information about the 'from' and 'to' entity names. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityRelationsQuery** | **EntityRelationsQuery** |  | |

### Return type

**List<EntityRelationInfo>**


## findInfoByToV2

> List<EntityRelationInfo> findInfoByToV2(toType, toId, relationTypeGroup)

Get List of Relation Infos (findInfoByToV2)

Returns list of relation info objects for the specified entity by the 'to' direction.   If the user has the authority of 'System Administrator', the server checks that the entity is owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that the entity is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the entity is assigned to the same customer. Relation Info is an extension of the default Relation object that contains information about the 'from' and 'to' entity names. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **toId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **relationTypeGroup** | **String** | A string value representing relation type group. For example, 'COMMON' | [optional] |

### Return type

**List<EntityRelationInfo>**


## getRelation

> EntityRelation getRelation(fromId, fromType, relationType, toId, toType, relationTypeGroup)

Get Relation (getRelation)

Returns relation object between two specified entities if present. Otherwise throws exception.   If the user has the authority of 'System Administrator', the server checks that 'from' and 'to' entities are owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that 'from' and 'to' entities are owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the 'from' and 'to' entities are assigned to the same customer.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fromId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **fromType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **relationType** | **String** | A string value representing relation type between entities. For example, 'Contains', 'Manages'. It can be any string value. | |
| **toId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **toType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **relationTypeGroup** | **String** | A string value representing relation type group. For example, 'COMMON' | [optional] |

### Return type

**EntityRelation**


## saveRelation

> saveRelation(entityRelation)

Create Relation (saveRelation)

Creates or updates a relation between two entities in the platform. Relations unique key is a combination of from/to entity id and relation type group and relation type.   If the user has the authority of 'System Administrator', the server checks that 'from' and 'to' entities are owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that 'from' and 'to' entities are owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the 'from' and 'to' entities are assigned to the same customer.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityRelation** | **EntityRelation** |  | |

### Return type

null (empty response body)


## saveRelationV2

> EntityRelation saveRelationV2(entityRelation)

Create Relation (saveRelationV2)

Creates or updates a relation between two entities in the platform. Relations unique key is a combination of from/to entity id and relation type group and relation type.   If the user has the authority of 'System Administrator', the server checks that 'from' and 'to' entities are owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that 'from' and 'to' entities are owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the 'from' and 'to' entities are assigned to the same customer.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityRelation** | **EntityRelation** |  | |

### Return type

**EntityRelation**

