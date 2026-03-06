# EntityRelationControllerApi

`ThingsboardClient` methods:

```
EntityRelation deleteRelation(@Nonnull String fromId, @Nonnull String fromType, @Nonnull String relationType, @Nonnull String toId, @Nonnull String toType, @Nullable String relationTypeGroup) // Delete Relation (deleteRelation)
void deleteRelations(@Nonnull String entityId, @Nonnull String entityType) // Delete common relations (deleteRelations)
List<EntityRelationInfo> findEntityRelationInfosByFrom(@Nonnull String fromType, @Nonnull String fromId, @Nullable String relationTypeGroup) // Get List of Relation Infos (findEntityRelationInfosByFrom)
List<EntityRelationInfo> findEntityRelationInfosByQuery(@Nonnull EntityRelationsQuery entityRelationsQuery) // Find related entity infos (findEntityRelationInfosByQuery)
List<EntityRelationInfo> findEntityRelationInfosByTo(@Nonnull String toType, @Nonnull String toId, @Nullable String relationTypeGroup) // Get List of Relation Infos (findEntityRelationInfosByTo)
List<EntityRelation> findEntityRelationsByFrom(@Nonnull String fromType, @Nonnull String fromId, @Nullable String relationTypeGroup) // Get List of Relations (findEntityRelationsByFrom)
List<EntityRelation> findEntityRelationsByFromAndRelationType(@Nonnull String fromType, @Nonnull String fromId, @Nonnull String relationType, @Nullable String relationTypeGroup) // Get List of Relations (findEntityRelationsByFromAndRelationType)
List<EntityRelation> findEntityRelationsByQuery(@Nonnull EntityRelationsQuery entityRelationsQuery) // Find related entities (findEntityRelationsByQuery)
List<EntityRelation> findEntityRelationsByTo(@Nonnull String toType, @Nonnull String toId, @Nullable String relationTypeGroup) // Get List of Relations (findEntityRelationsByTo)
List<EntityRelation> findEntityRelationsByToAndRelationType(@Nonnull String toType, @Nonnull String toId, @Nonnull String relationType, @Nullable String relationTypeGroup) // Get List of Relations (findEntityRelationsByToAndRelationType)
EntityRelation getRelation(@Nonnull String fromId, @Nonnull String fromType, @Nonnull String relationType, @Nonnull String toId, @Nonnull String toType, @Nullable String relationTypeGroup) // Get Relation (getRelation)
EntityRelation saveRelation(@Nonnull EntityRelation entityRelation) // Create Relation (saveRelation)
```


## deleteRelation

```
EntityRelation deleteRelation(@Nonnull String fromId, @Nonnull String fromType, @Nonnull String relationType, @Nonnull String toId, @Nonnull String toType, @Nullable String relationTypeGroup)
```

**DELETE** `/api/v2/relation`

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

**EntityRelation**


## deleteRelations

```
void deleteRelations(@Nonnull String entityId, @Nonnull String entityType)
```

**DELETE** `/api/relations`

Delete common relations (deleteRelations)

Deletes all the relations ('from' and 'to' direction) for the specified entity and relation type group: 'COMMON'.   If the user has the authority of 'System Administrator', the server checks that the entity is owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that the entity is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the entity is assigned to the same customer.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **entityType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |

### Return type

null (empty response body)


## findEntityRelationInfosByFrom

```
List<EntityRelationInfo> findEntityRelationInfosByFrom(@Nonnull String fromType, @Nonnull String fromId, @Nullable String relationTypeGroup)
```

**GET** `/api/relations/info/from/{fromType}/{fromId}`

Get List of Relation Infos (findEntityRelationInfosByFrom)

Returns list of relation info objects for the specified entity by the 'from' direction.   If the user has the authority of 'System Administrator', the server checks that the entity is owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that the entity is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the entity is assigned to the same customer. Relation Info is an extension of the default Relation object that contains information about the 'from' and 'to' entity names. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fromType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **fromId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **relationTypeGroup** | **String** | A string value representing relation type group. For example, 'COMMON' | [optional] |

### Return type

**List<EntityRelationInfo>**


## findEntityRelationInfosByQuery

```
List<EntityRelationInfo> findEntityRelationInfosByQuery(@Nonnull EntityRelationsQuery entityRelationsQuery)
```

**POST** `/api/relations/info`

Find related entity infos (findEntityRelationInfosByQuery)

Returns all entity infos that are related to the specific entity. The entity id, relation type, entity types, depth of the search, and other query parameters defined using complex 'EntityRelationsQuery' object. See 'Model' tab of the Parameters for more info. Relation Info is an extension of the default Relation object that contains information about the 'from' and 'to' entity names. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityRelationsQuery** | **EntityRelationsQuery** |  | |

### Return type

**List<EntityRelationInfo>**


## findEntityRelationInfosByTo

```
List<EntityRelationInfo> findEntityRelationInfosByTo(@Nonnull String toType, @Nonnull String toId, @Nullable String relationTypeGroup)
```

**GET** `/api/relations/info/to/{toType}/{toId}`

Get List of Relation Infos (findEntityRelationInfosByTo)

Returns list of relation info objects for the specified entity by the 'to' direction.   If the user has the authority of 'System Administrator', the server checks that the entity is owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that the entity is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the entity is assigned to the same customer. Relation Info is an extension of the default Relation object that contains information about the 'from' and 'to' entity names. 


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **toId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **relationTypeGroup** | **String** | A string value representing relation type group. For example, 'COMMON' | [optional] |

### Return type

**List<EntityRelationInfo>**


## findEntityRelationsByFrom

```
List<EntityRelation> findEntityRelationsByFrom(@Nonnull String fromType, @Nonnull String fromId, @Nullable String relationTypeGroup)
```

**GET** `/api/relations/from/{fromType}/{fromId}`

Get List of Relations (findEntityRelationsByFrom)

Returns list of relation objects for the specified entity by the 'from' direction.   If the user has the authority of 'System Administrator', the server checks that the entity is owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that the entity is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the entity is assigned to the same customer.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fromType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **fromId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **relationTypeGroup** | **String** | A string value representing relation type group. For example, 'COMMON' | [optional] |

### Return type

**List<EntityRelation>**


## findEntityRelationsByFromAndRelationType

```
List<EntityRelation> findEntityRelationsByFromAndRelationType(@Nonnull String fromType, @Nonnull String fromId, @Nonnull String relationType, @Nullable String relationTypeGroup)
```

**GET** `/api/relations/from/{fromType}/{fromId}/{relationType}`

Get List of Relations (findEntityRelationsByFromAndRelationType)

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


## findEntityRelationsByQuery

```
List<EntityRelation> findEntityRelationsByQuery(@Nonnull EntityRelationsQuery entityRelationsQuery)
```

**POST** `/api/relations`

Find related entities (findEntityRelationsByQuery)

Returns all entities that are related to the specific entity. The entity id, relation type, entity types, depth of the search, and other query parameters defined using complex 'EntityRelationsQuery' object. See 'Model' tab of the Parameters for more info.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityRelationsQuery** | **EntityRelationsQuery** |  | |

### Return type

**List<EntityRelation>**


## findEntityRelationsByTo

```
List<EntityRelation> findEntityRelationsByTo(@Nonnull String toType, @Nonnull String toId, @Nullable String relationTypeGroup)
```

**GET** `/api/relations/to/{toType}/{toId}`

Get List of Relations (findEntityRelationsByTo)

Returns list of relation objects for the specified entity by the 'to' direction.   If the user has the authority of 'System Administrator', the server checks that the entity is owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that the entity is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the entity is assigned to the same customer.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toType** | **String** | A string value representing the entity type. For example, 'DEVICE' | |
| **toId** | **String** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| **relationTypeGroup** | **String** | A string value representing relation type group. For example, 'COMMON' | [optional] |

### Return type

**List<EntityRelation>**


## findEntityRelationsByToAndRelationType

```
List<EntityRelation> findEntityRelationsByToAndRelationType(@Nonnull String toType, @Nonnull String toId, @Nonnull String relationType, @Nullable String relationTypeGroup)
```

**GET** `/api/relations/to/{toType}/{toId}/{relationType}`

Get List of Relations (findEntityRelationsByToAndRelationType)

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


## getRelation

```
EntityRelation getRelation(@Nonnull String fromId, @Nonnull String fromType, @Nonnull String relationType, @Nonnull String toId, @Nonnull String toType, @Nullable String relationTypeGroup)
```

**GET** `/api/relation`

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

```
EntityRelation saveRelation(@Nonnull EntityRelation entityRelation)
```

**POST** `/api/v2/relation`

Create Relation (saveRelation)

Creates or updates a relation between two entities in the platform. Relations unique key is a combination of from/to entity id and relation type group and relation type.   If the user has the authority of 'System Administrator', the server checks that 'from' and 'to' entities are owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that 'from' and 'to' entities are owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the 'from' and 'to' entities are assigned to the same customer.


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityRelation** | **EntityRelation** |  | |

### Return type

**EntityRelation**

