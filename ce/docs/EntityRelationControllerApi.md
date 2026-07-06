# EntityRelationControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
EntityRelation deleteRelation(DeleteRelationArgs args) // Delete Relation (deleteRelation)
void deleteRelations(DeleteRelationsArgs args) // Delete common relations (deleteRelations)
List<EntityRelationInfo> findEntityRelationInfosByFrom(FindEntityRelationInfosByFromArgs args) // Get List of Relation Infos (findEntityRelationInfosByFrom)
List<EntityRelationInfo> findEntityRelationInfosByQuery(FindEntityRelationInfosByQueryArgs args) // Find related entity infos (findEntityRelationInfosByQuery)
List<EntityRelationInfo> findEntityRelationInfosByTo(FindEntityRelationInfosByToArgs args) // Get List of Relation Infos (findEntityRelationInfosByTo)
List<EntityRelation> findEntityRelationsByFrom(FindEntityRelationsByFromArgs args) // Get List of Relations (findEntityRelationsByFrom)
List<EntityRelation> findEntityRelationsByFromAndRelationType(FindEntityRelationsByFromAndRelationTypeArgs args) // Get List of Relations (findEntityRelationsByFromAndRelationType)
List<EntityRelation> findEntityRelationsByQuery(FindEntityRelationsByQueryArgs args) // Find related entities (findEntityRelationsByQuery)
List<EntityRelation> findEntityRelationsByTo(FindEntityRelationsByToArgs args) // Get List of Relations (findEntityRelationsByTo)
List<EntityRelation> findEntityRelationsByToAndRelationType(FindEntityRelationsByToAndRelationTypeArgs args) // Get List of Relations (findEntityRelationsByToAndRelationType)
EntityRelation getRelation(GetRelationArgs args) // Get Relation (getRelation)
EntityRelation saveRelation(SaveRelationArgs args) // Create Relation (saveRelation)
```


## deleteRelation

**DELETE** `/api/v2/relation`

Delete Relation (deleteRelation)

Deletes a relation between two entities in the platform.   If the user has the authority of 'System Administrator', the server checks that 'from' and 'to' entities are owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that 'from' and 'to' entities are owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the 'from' and 'to' entities are assigned to the same customer.

```java
EntityRelation deleteRelation(DeleteRelationArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteRelationArgs.builder()
        .fromId(String)
        .fromType(String)
        .relationType(String)
        .toId(String)
        .toType(String)
        .build()
```

### `DeleteRelationArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `fromId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `fromType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `relationType` | `String` | **yes** | A string value representing relation type between entities. For example, 'Contains', 'Manages'. It can be any string value. | |
| `toId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `toType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `relationTypeGroup` | `String` | no | A string value representing relation type group. For example, 'COMMON' | |

### Return type

`EntityRelation`


## deleteRelations

**DELETE** `/api/relations`

Delete common relations (deleteRelations)

Deletes all the relations ('from' and 'to' direction) for the specified entity and relation type group: 'COMMON'.   If the user has the authority of 'System Administrator', the server checks that the entity is owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that the entity is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the entity is assigned to the same customer.

```java
void deleteRelations(DeleteRelationsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteRelationsArgs.builder()
        .entityId(String)
        .entityType(String)
        .build()
```

### `DeleteRelationsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `entityType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |

### Return type

null (empty response body)


## findEntityRelationInfosByFrom

**GET** `/api/relations/info/from/{fromType}/{fromId}`

Get List of Relation Infos (findEntityRelationInfosByFrom)

Returns list of relation info objects for the specified entity by the 'from' direction.   If the user has the authority of 'System Administrator', the server checks that the entity is owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that the entity is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the entity is assigned to the same customer. Relation Info is an extension of the default Relation object that contains information about the 'from' and 'to' entity names. 

```java
List<EntityRelationInfo> findEntityRelationInfosByFrom(FindEntityRelationInfosByFromArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
FindEntityRelationInfosByFromArgs.builder()
        .fromType(String)
        .fromId(String)
        .build()
```

### `FindEntityRelationInfosByFromArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `fromType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `fromId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `relationTypeGroup` | `String` | no | A string value representing relation type group. For example, 'COMMON' | |

### Return type

`List<EntityRelationInfo>`


## findEntityRelationInfosByQuery

**POST** `/api/relations/info`

Find related entity infos (findEntityRelationInfosByQuery)

Returns all entity infos that are related to the specific entity. The entity id, relation type, entity types, depth of the search, and other query parameters defined using complex 'EntityRelationsQuery' object. See 'Model' tab of the Parameters for more info. Relation Info is an extension of the default Relation object that contains information about the 'from' and 'to' entity names. 

```java
List<EntityRelationInfo> findEntityRelationInfosByQuery(FindEntityRelationInfosByQueryArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
FindEntityRelationInfosByQueryArgs.builder()
        .entityRelationsQuery(EntityRelationsQuery)
        .build()
```

### `FindEntityRelationInfosByQueryArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityRelationsQuery` | `EntityRelationsQuery` | **yes** |  | |

### Return type

`List<EntityRelationInfo>`


## findEntityRelationInfosByTo

**GET** `/api/relations/info/to/{toType}/{toId}`

Get List of Relation Infos (findEntityRelationInfosByTo)

Returns list of relation info objects for the specified entity by the 'to' direction.   If the user has the authority of 'System Administrator', the server checks that the entity is owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that the entity is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the entity is assigned to the same customer. Relation Info is an extension of the default Relation object that contains information about the 'from' and 'to' entity names. 

```java
List<EntityRelationInfo> findEntityRelationInfosByTo(FindEntityRelationInfosByToArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
FindEntityRelationInfosByToArgs.builder()
        .toType(String)
        .toId(String)
        .build()
```

### `FindEntityRelationInfosByToArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `toType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `toId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `relationTypeGroup` | `String` | no | A string value representing relation type group. For example, 'COMMON' | |

### Return type

`List<EntityRelationInfo>`


## findEntityRelationsByFrom

**GET** `/api/relations/from/{fromType}/{fromId}`

Get List of Relations (findEntityRelationsByFrom)

Returns list of relation objects for the specified entity by the 'from' direction.   If the user has the authority of 'System Administrator', the server checks that the entity is owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that the entity is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the entity is assigned to the same customer.

```java
List<EntityRelation> findEntityRelationsByFrom(FindEntityRelationsByFromArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
FindEntityRelationsByFromArgs.builder()
        .fromType(String)
        .fromId(String)
        .build()
```

### `FindEntityRelationsByFromArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `fromType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `fromId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `relationTypeGroup` | `String` | no | A string value representing relation type group. For example, 'COMMON' | |

### Return type

`List<EntityRelation>`


## findEntityRelationsByFromAndRelationType

**GET** `/api/relations/from/{fromType}/{fromId}/{relationType}`

Get List of Relations (findEntityRelationsByFromAndRelationType)

Returns list of relation objects for the specified entity by the 'from' direction and relation type.   If the user has the authority of 'System Administrator', the server checks that the entity is owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that the entity is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the entity is assigned to the same customer.

```java
List<EntityRelation> findEntityRelationsByFromAndRelationType(FindEntityRelationsByFromAndRelationTypeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
FindEntityRelationsByFromAndRelationTypeArgs.builder()
        .fromType(String)
        .fromId(String)
        .relationType(String)
        .build()
```

### `FindEntityRelationsByFromAndRelationTypeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `fromType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `fromId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `relationType` | `String` | **yes** | A string value representing relation type between entities. For example, 'Contains', 'Manages'. It can be any string value. | |
| `relationTypeGroup` | `String` | no | A string value representing relation type group. For example, 'COMMON' | |

### Return type

`List<EntityRelation>`


## findEntityRelationsByQuery

**POST** `/api/relations`

Find related entities (findEntityRelationsByQuery)

Returns all entities that are related to the specific entity. The entity id, relation type, entity types, depth of the search, and other query parameters defined using complex 'EntityRelationsQuery' object. See 'Model' tab of the Parameters for more info.

```java
List<EntityRelation> findEntityRelationsByQuery(FindEntityRelationsByQueryArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
FindEntityRelationsByQueryArgs.builder()
        .entityRelationsQuery(EntityRelationsQuery)
        .build()
```

### `FindEntityRelationsByQueryArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityRelationsQuery` | `EntityRelationsQuery` | **yes** |  | |

### Return type

`List<EntityRelation>`


## findEntityRelationsByTo

**GET** `/api/relations/to/{toType}/{toId}`

Get List of Relations (findEntityRelationsByTo)

Returns list of relation objects for the specified entity by the 'to' direction.   If the user has the authority of 'System Administrator', the server checks that the entity is owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that the entity is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the entity is assigned to the same customer.

```java
List<EntityRelation> findEntityRelationsByTo(FindEntityRelationsByToArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
FindEntityRelationsByToArgs.builder()
        .toType(String)
        .toId(String)
        .build()
```

### `FindEntityRelationsByToArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `toType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `toId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `relationTypeGroup` | `String` | no | A string value representing relation type group. For example, 'COMMON' | |

### Return type

`List<EntityRelation>`


## findEntityRelationsByToAndRelationType

**GET** `/api/relations/to/{toType}/{toId}/{relationType}`

Get List of Relations (findEntityRelationsByToAndRelationType)

Returns list of relation objects for the specified entity by the 'to' direction and relation type.   If the user has the authority of 'System Administrator', the server checks that the entity is owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that the entity is owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the entity is assigned to the same customer.

```java
List<EntityRelation> findEntityRelationsByToAndRelationType(FindEntityRelationsByToAndRelationTypeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
FindEntityRelationsByToAndRelationTypeArgs.builder()
        .toType(String)
        .toId(String)
        .relationType(String)
        .build()
```

### `FindEntityRelationsByToAndRelationTypeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `toType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `toId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `relationType` | `String` | **yes** | A string value representing relation type between entities. For example, 'Contains', 'Manages'. It can be any string value. | |
| `relationTypeGroup` | `String` | no | A string value representing relation type group. For example, 'COMMON' | |

### Return type

`List<EntityRelation>`


## getRelation

**GET** `/api/relation`

Get Relation (getRelation)

Returns relation object between two specified entities if present. Otherwise throws exception.   If the user has the authority of 'System Administrator', the server checks that 'from' and 'to' entities are owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that 'from' and 'to' entities are owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the 'from' and 'to' entities are assigned to the same customer.

```java
EntityRelation getRelation(GetRelationArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetRelationArgs.builder()
        .fromId(String)
        .fromType(String)
        .relationType(String)
        .toId(String)
        .toType(String)
        .build()
```

### `GetRelationArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `fromId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `fromType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `relationType` | `String` | **yes** | A string value representing relation type between entities. For example, 'Contains', 'Manages'. It can be any string value. | |
| `toId` | `String` | **yes** | A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `toType` | `String` | **yes** | A string value representing the entity type. For example, 'DEVICE' | |
| `relationTypeGroup` | `String` | no | A string value representing relation type group. For example, 'COMMON' | |

### Return type

`EntityRelation`


## saveRelation

**POST** `/api/v2/relation`

Create Relation (saveRelation)

Creates or updates a relation between two entities in the platform. Relations unique key is a combination of from/to entity id and relation type group and relation type.   If the user has the authority of 'System Administrator', the server checks that 'from' and 'to' entities are owned by the sysadmin. If the user has the authority of 'Tenant Administrator', the server checks that 'from' and 'to' entities are owned by the same tenant. If the user has the authority of 'Customer User', the server checks that the 'from' and 'to' entities are assigned to the same customer.

```java
EntityRelation saveRelation(SaveRelationArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveRelationArgs.builder()
        .entityRelation(EntityRelation)
        .build()
```

### `SaveRelationArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `entityRelation` | `EntityRelation` | **yes** |  | |

### Return type

`EntityRelation`

