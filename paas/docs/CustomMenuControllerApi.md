# CustomMenuControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
CustomMenu createCustomMenu(CreateCustomMenuArgs args) // Create Custom Menu (createCustomMenu)
CustomMenuDeleteResult deleteCustomMenu(DeleteCustomMenuArgs args) // Delete custom menu (deleteCustomMenu)
CustomMenuConfig getCustomMenu(GetCustomMenuArgs args) // Get end-user Custom Menu configuration (getCustomMenu)
List<EntityInfo> getCustomMenuAssigneeList(GetCustomMenuAssigneeListArgs args) // Get Custom Menu assignee list (getCustomMenuAssigneeList)
CustomMenuConfig getCustomMenuConfig(GetCustomMenuConfigArgs args) // Get Custom Menu configuration by id (getCustomMenuConfig)
CustomMenuInfo getCustomMenuInfoById(GetCustomMenuInfoByIdArgs args) // Get Custom Menu Info (getCustomMenuInfoById)
PageDataCustomMenuInfo getCustomMenuInfos(GetCustomMenuInfosArgs args) // Get all custom menus configured at user level (getCustomMenuInfos)
void updateCustomMenuAssigneeList(UpdateCustomMenuAssigneeListArgs args) // Update custom menu assignee list (updateCustomMenuAssigneeList)
CustomMenu updateCustomMenuConfig(UpdateCustomMenuConfigArgs args) // Update Custom Menu configuration based on the provided Custom Menu Id (updateCustomMenuConfig)
void updateCustomMenuName(UpdateCustomMenuNameArgs args) // Update Custom Menu name based on the provided Custom Menu Id (updateCustomMenuName)
```


## createCustomMenu

**POST** `/api/customMenu`

Create Custom Menu (createCustomMenu)

The api is designed to create Custom Menu without configuration. Is not applicable for update.  Security check is performed to verify that the user has 'WRITE' permission for the custom menu with specified id.

```java
CustomMenu createCustomMenu(CreateCustomMenuArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
CreateCustomMenuArgs.builder()
        .customMenuInfo(CustomMenuInfo)
        .build()
```

### `CreateCustomMenuArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customMenuInfo` | `CustomMenuInfo` | **yes** |  | |
| `assignToList` | `List<String>` | no | A list of entity ids, separated by comma ',' | |
| `force` | `Boolean` | no | Use force if you want to create default menu that conflicts with the existing one (old one will be update NO_ASSIGN assignee type) | |

### Return type

`CustomMenu`


## deleteCustomMenu

**DELETE** `/api/customMenu/{customMenuId}`

Delete custom menu (deleteCustomMenu)

Deletes the custom menu based on the provided Custom Menu Id. Referencing non-existing custom menu Id will cause an error. If the custom menu is assigned to the list of users or customers bad request is returned.To delete a custom menu that has assignee list set 'force' request param to true 

```java
CustomMenuDeleteResult deleteCustomMenu(DeleteCustomMenuArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteCustomMenuArgs.builder()
        .customMenuId(UUID)
        .build()
```

### `DeleteCustomMenuArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customMenuId` | `UUID` | **yes** | A string value representing the custom menu id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `force` | `Boolean` | no | Force set to true will unassign menu before deletion | |

### Return type

`CustomMenuDeleteResult`


## getCustomMenu

**GET** `/api/customMenu`

Get end-user Custom Menu configuration (getCustomMenu)

Fetch the Custom Menu configuration object for the authorized user. The custom menu is configured in the white labeling parameters and has one of three user scopes:SYSTEM, TENANT, CUSTOMER and four assignee type: NO_ASSIGN, ALL, CUSTOMERS, USERS.There are three default (assignee type: ALL) menus configured on the system level for each scope and if no other menu is configured for user, system configuration of the corresponding scope will be applied.If a custom menu with assignee type ALL is configured on the tenant level, it overrides the menu configuration of the corresponding scope on the system level. If a custom menu with assignee type USER_GROUPS is configured on the tenant level, it overrides default tenant menu.If a custom menu with assignee type CUSTOMERS is configured on tenant level for specific customer, it will be applied to all customer users.If a custom menu with assignee type ALL is configured on the customer level, it overrides the menu assigned on tenant level.If a custom menu with assignee type USER_GROUPS is configured on the customer level, it overrides default customer menu.If a custom menu is assigned to specific user, it overrides all other configuration.

```java
CustomMenuConfig getCustomMenu(GetCustomMenuArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomMenuArgs.builder()
        .build()
```

### `GetCustomMenuArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `ifNoneMatch` | `String` | no |  | |

### Return type

`CustomMenuConfig`


## getCustomMenuAssigneeList

**GET** `/api/customMenu/{customMenuId}/assigneeList`

Get Custom Menu assignee list (getCustomMenuAssigneeList)

Fetch the list of Entity Info objects that represents users or customers, or empty list if custom menu is not assigned or has NO_ASSIGN/ALL assignee type.  Security check is performed to verify that the user has 'READ' permission for the custom menu with specified id.

```java
List<EntityInfo> getCustomMenuAssigneeList(GetCustomMenuAssigneeListArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomMenuAssigneeListArgs.builder()
        .customMenuId(UUID)
        .build()
```

### `GetCustomMenuAssigneeListArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customMenuId` | `UUID` | **yes** | A string value representing the custom menu id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`List<EntityInfo>`


## getCustomMenuConfig

**GET** `/api/customMenu/{customMenuId}/config`

Get Custom Menu configuration by id (getCustomMenuConfig)

Fetch the Custom Menu configuration based on the provided Custom Menu Id.   Security check is performed to verify that the user has 'READ' permission for the custom menu with specified id.

```java
CustomMenuConfig getCustomMenuConfig(GetCustomMenuConfigArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomMenuConfigArgs.builder()
        .customMenuId(UUID)
        .build()
```

### `GetCustomMenuConfigArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customMenuId` | `UUID` | **yes** | A string value representing the custom menu id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`CustomMenuConfig`


## getCustomMenuInfoById

**GET** `/api/customMenu/{customMenuId}/info`

Get Custom Menu Info (getCustomMenuInfoById)

Fetch the Custom Menu Info object based on the provided Custom Menu Id.   Security check is performed to verify that the user has 'READ' permission for the custom menu with specified id.

```java
CustomMenuInfo getCustomMenuInfoById(GetCustomMenuInfoByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomMenuInfoByIdArgs.builder()
        .customMenuId(UUID)
        .build()
```

### `GetCustomMenuInfoByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customMenuId` | `UUID` | **yes** | A string value representing the custom menu id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`CustomMenuInfo`


## getCustomMenuInfos

**GET** `/api/customMenu/infos`

Get all custom menus configured at user level (getCustomMenuInfos)

Returns a page of custom menu info objects owned by the tenant or the customer of a current user, scope and assigneeType request parameters can be used to filter the result.  Security check is performed to verify that the user has 'READ' permission for the white labeling resource.

```java
PageDataCustomMenuInfo getCustomMenuInfos(GetCustomMenuInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetCustomMenuInfosArgs.builder()
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetCustomMenuInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `scope` | `CMScope` | no | Custom menu scope. | enum: `SYSTEM`, `TENANT`, `CUSTOMER` |
| `assigneeType` | `CMAssigneeType` | no | Custom menu assignee type. | enum: `NO_ASSIGN`, `ALL`, `CUSTOMERS`, `USERS`, `USER_GROUPS` |
| `textSearch` | `String` | no | The case insensitive 'substring' filter based on the custom menu name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `title` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataCustomMenuInfo`


## updateCustomMenuAssigneeList

**PUT** `/api/customMenu/{id}/assign/{assigneeType}`

Update custom menu assignee list (updateCustomMenuAssigneeList)

The api designed to update the list of assignees or assignee type based on the provided Custom Menu Id. To change assignee type, put new assignee type in path parameter.  Security check is performed to verify that the user has 'WRITE' permission for the custom menu with specified id.

```java
void updateCustomMenuAssigneeList(UpdateCustomMenuAssigneeListArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UpdateCustomMenuAssigneeListArgs.builder()
        .id(UUID)
        .assigneeType(CMAssigneeType)
        .build()
```

### `UpdateCustomMenuAssigneeListArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `id` | `UUID` | **yes** |  | |
| `assigneeType` | `CMAssigneeType` | **yes** |  | enum: `NO_ASSIGN`, `ALL`, `CUSTOMERS`, `USERS`, `USER_GROUPS` |
| `force` | `Boolean` | no | Use force if you want to override default menu | |
| `requestBody` | `List<String>` | no |  | |

### Return type

null (empty response body)


## updateCustomMenuConfig

**PUT** `/api/customMenu/{customMenuId}/config`

Update Custom Menu configuration based on the provided Custom Menu Id (updateCustomMenuConfig)

  Security check is performed to verify that the user has 'WRITE' permission for the custom menu with specified id.

```java
CustomMenu updateCustomMenuConfig(UpdateCustomMenuConfigArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UpdateCustomMenuConfigArgs.builder()
        .customMenuId(UUID)
        .customMenuConfig(CustomMenuConfig)
        .build()
```

### `UpdateCustomMenuConfigArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customMenuId` | `UUID` | **yes** | A string value representing the custom menu id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `customMenuConfig` | `CustomMenuConfig` | **yes** |  | |

### Return type

`CustomMenu`


## updateCustomMenuName

**PUT** `/api/customMenu/{customMenuId}/name`

Update Custom Menu name based on the provided Custom Menu Id (updateCustomMenuName)

  Security check is performed to verify that the user has 'WRITE' permission for the custom menu with specified id.

```java
void updateCustomMenuName(UpdateCustomMenuNameArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UpdateCustomMenuNameArgs.builder()
        .customMenuId(UUID)
        .body(String)
        .build()
```

### `UpdateCustomMenuNameArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `customMenuId` | `UUID` | **yes** | A string value representing the custom menu id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `body` | `String` | **yes** |  | |

### Return type

null (empty response body)

