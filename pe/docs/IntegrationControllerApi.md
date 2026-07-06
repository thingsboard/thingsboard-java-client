# IntegrationControllerApi

Methods on `ThingsboardClient`. Endpoints that take input accept a single request object: call
`<method>Args.builder()`, set the fields you need, then `build()`. Only required fields must be
set — `build()` throws `IllegalArgumentException` if a required field is missing. The `*Args`
classes are nested in `ThingsboardApi`, e.g.
`import org.thingsboard.client.api.ThingsboardApi.SaveDeviceArgs;`. Methods that take no input
have no `Args` object — call them directly.

```
Integration assignIntegrationToEdge(AssignIntegrationToEdgeArgs args) // Assign integration to edge (assignIntegrationToEdge)
void checkIntegrationConnection(CheckIntegrationConnectionArgs args) // Check integration connectivity (checkIntegrationConnection)
void deleteIntegration(DeleteIntegrationArgs args) // Delete integration (deleteIntegration)
byte[] exportIntegrationPackage(ExportIntegrationPackageArgs args) // Export integration as IoT Hub package
String findAllRelatedEdgesMissingAttributes(FindAllRelatedEdgesMissingAttributesArgs args) // Find missing attributes for all related edges (findAllRelatedEdgesMissingAttributes)
String findEdgeMissingAttributes(FindEdgeMissingAttributesArgs args) // Find edge missing attributes for assigned integrations (findEdgeMissingAttributes)
PageDataIntegrationInfo getEdgeIntegrationInfos(GetEdgeIntegrationInfosArgs args) // Get Edge Integrations (getEdgeIntegrationInfos)
PageDataIntegration getEdgeIntegrations(GetEdgeIntegrationsArgs args) // Get Edge Integrations (getEdgeIntegrations)
Integration getIntegrationById(GetIntegrationByIdArgs args) // Get Integration (getIntegrationById)
Integration getIntegrationByRoutingKey(GetIntegrationByRoutingKeyArgs args) // Get Integration by Routing Key (getIntegrationByRoutingKey)
PageDataIntegrationInfo getIntegrationInfos(GetIntegrationInfosArgs args) // Get Integration Infos (getIntegrationInfos)
PageDataIntegration getIntegrations(GetIntegrationsArgs args) // Get Integrations (getIntegrations)
List<Integration> getIntegrationsByIds(GetIntegrationsByIdsArgs args) // Get Integrations By Ids (getIntegrationsByIds)
Map<String, IntegrationConvertersInfo> getIntegrationsConvertersInfo() // Get Integrations Converters info (getIntegrationsConvertersInfo)
Integration saveIntegration(SaveIntegrationArgs args) // Create Or Update Integration (saveIntegration)
Integration unassignIntegrationFromEdge(UnassignIntegrationFromEdgeArgs args) // Unassign integration from edge (unassignIntegrationFromEdge)
```


## assignIntegrationToEdge

**POST** `/api/edge/{edgeId}/integration/{integrationId}`

Assign integration to edge (assignIntegrationToEdge)

Creates assignment of an existing integration edge template to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment integration (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once integration will be delivered to edge service, it's going to start locally.   Only integration edge template can be assigned to edge.  Available for users with 'TENANT_ADMIN' authority.

```java
Integration assignIntegrationToEdge(AssignIntegrationToEdgeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
AssignIntegrationToEdgeArgs.builder()
        .edgeId(String)
        .integrationId(String)
        .build()
```

### `AssignIntegrationToEdgeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** |  | |
| `integrationId` | `String` | **yes** |  | |

### Return type

`Integration`


## checkIntegrationConnection

**POST** `/api/integration/check`

Check integration connectivity (checkIntegrationConnection)

Checks if the connection to the integration is established. Throws an error if the connection is not established. Example: Failed to connect to MQTT broker at host:port.

```java
void checkIntegrationConnection(CheckIntegrationConnectionArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
CheckIntegrationConnectionArgs.builder()
        .integration(Integration)
        .build()
```

### `CheckIntegrationConnectionArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `integration` | `Integration` | **yes** |  | |

### Return type

null (empty response body)


## deleteIntegration

**DELETE** `/api/integration/{integrationId}`

Delete integration (deleteIntegration)

Deletes the integration and all the relations (from and to the integration). Referencing non-existing integration Id will cause an error.    Security check is performed to verify that the user has 'DELETE' permission for the entity (entities).

```java
void deleteIntegration(DeleteIntegrationArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
DeleteIntegrationArgs.builder()
        .integrationId(String)
        .build()
```

### `DeleteIntegrationArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `integrationId` | `String` | **yes** | A string value representing the integration id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

null (empty response body)


## exportIntegrationPackage

**GET** `/api/integration/{integrationId}/export-package`

Export integration as IoT Hub package

Returns a ZIP containing integration.json, uplink.json, optional downlink.json, and form.json. Sensitive fields are tokenized via @TemplateField annotations on the integration's runtime POJO.

```java
byte[] exportIntegrationPackage(ExportIntegrationPackageArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
ExportIntegrationPackageArgs.builder()
        .integrationId(String)
        .build()
```

### `ExportIntegrationPackageArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `integrationId` | `String` | **yes** |  | |

### Return type

`byte[]`


## findAllRelatedEdgesMissingAttributes

**GET** `/api/edge/integration/{integrationId}/allMissingAttributes`

Find missing attributes for all related edges (findAllRelatedEdgesMissingAttributes)

Returns list of attribute names of all related edges that are missing in the integration configuration.  Available for users with 'TENANT_ADMIN' authority.

```java
String findAllRelatedEdgesMissingAttributes(FindAllRelatedEdgesMissingAttributesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
FindAllRelatedEdgesMissingAttributesArgs.builder()
        .integrationId(String)
        .build()
```

### `FindAllRelatedEdgesMissingAttributesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `integrationId` | `String` | **yes** | A string value representing the integration id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`String`


## findEdgeMissingAttributes

**GET** `/api/edge/integration/{edgeId}/missingAttributes`

Find edge missing attributes for assigned integrations (findEdgeMissingAttributes)

Returns list of edge attribute names that are missing in assigned integrations.  Available for users with 'TENANT_ADMIN' authority.

```java
String findEdgeMissingAttributes(FindEdgeMissingAttributesArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
FindEdgeMissingAttributesArgs.builder()
        .edgeId(String)
        .integrationIds(List<String>)
        .build()
```

### `FindEdgeMissingAttributesArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `integrationIds` | `List<String>` | **yes** | A list of assigned integration ids, separated by comma ',' | |

### Return type

`String`


## getEdgeIntegrationInfos

**GET** `/api/edge/{edgeId}/integrationInfos`

Get Edge Integrations (getEdgeIntegrationInfos)

Returns a page of Integrations assigned to the specified edge. The integration object contains information about the Integration, including the heavyweight configuration object. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataIntegrationInfo getEdgeIntegrationInfos(GetEdgeIntegrationInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEdgeIntegrationInfosArgs.builder()
        .edgeId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetEdgeIntegrationInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'startsWith' filter based on the integration name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `debugMode`, `allowCreateDevicesOrAssets`, `enabled`, `remote`, `routingKey`, `secret` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataIntegrationInfo`


## getEdgeIntegrations

**GET** `/api/edge/{edgeId}/integrations`

Get Edge Integrations (getEdgeIntegrations)

Returns a page of Integrations assigned to the specified edge. The integration object contains information about the Integration, including the heavyweight configuration object. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with 'TENANT_ADMIN' authority.

```java
PageDataIntegration getEdgeIntegrations(GetEdgeIntegrationsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetEdgeIntegrationsArgs.builder()
        .edgeId(String)
        .pageSize(Integer)
        .page(Integer)
        .build()
```

### `GetEdgeIntegrationsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** | A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |
| `pageSize` | `Integer` | **yes** | Maximum amount of entities in a one page | |
| `page` | `Integer` | **yes** | Sequence number of page starting from 0 | |
| `textSearch` | `String` | no | The case insensitive 'startsWith' filter based on the integration name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `debugMode`, `allowCreateDevicesOrAssets`, `enabled`, `remote`, `routingKey`, `secret` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataIntegration`


## getIntegrationById

**GET** `/api/integration/{integrationId}`

Get Integration (getIntegrationById)

Fetch the Integration object based on the provided Integration Id. The server checks that the integration is owned by the same tenant.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
Integration getIntegrationById(GetIntegrationByIdArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetIntegrationByIdArgs.builder()
        .integrationId(String)
        .build()
```

### `GetIntegrationByIdArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `integrationId` | `String` | **yes** | A string value representing the integration id. For example, '784f394c-42b6-435a-983c-b7beff2784f9' | |

### Return type

`Integration`


## getIntegrationByRoutingKey

**GET** `/api/integration/routingKey/{routingKey}`

Get Integration by Routing Key (getIntegrationByRoutingKey)

Fetch the Integration object based on the provided routing key. The server checks that the integration is owned by the same tenant.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
Integration getIntegrationByRoutingKey(GetIntegrationByRoutingKeyArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetIntegrationByRoutingKeyArgs.builder()
        .routingKey(String)
        .build()
```

### `GetIntegrationByRoutingKeyArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `routingKey` | `String` | **yes** | A string value representing the integration routing key. For example, '542047e6-c1b2-112e-a87e-e49247c09d4b' | |

### Return type

`Integration`


## getIntegrationInfos

**GET** `/api/integrationInfos`

Get Integration Infos (getIntegrationInfos)

Returns a page of integration infos owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataIntegrationInfo getIntegrationInfos(GetIntegrationInfosArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetIntegrationInfosArgs.builder()
        .pageSize(String)
        .page(String)
        .build()
```

### `GetIntegrationInfosArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `String` | **yes** | Maximum amount of entities in a one page | |
| `page` | `String` | **yes** | Sequence number of page starting from 0 | |
| `isEdgeTemplate` | `Boolean` | no | Fetch edge template integrations | default: `false` |
| `textSearch` | `String` | no | The case insensitive 'startsWith' filter based on the integration name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `debugMode`, `allowCreateDevicesOrAssets`, `enabled`, `remote`, `routingKey`, `secret` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataIntegrationInfo`


## getIntegrations

**GET** `/api/integrations`

Get Integrations (getIntegrations)

Returns a page of integrations owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
PageDataIntegration getIntegrations(GetIntegrationsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetIntegrationsArgs.builder()
        .pageSize(String)
        .page(String)
        .build()
```

### `GetIntegrationsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `pageSize` | `String` | **yes** | Maximum amount of entities in a one page | |
| `page` | `String` | **yes** | Sequence number of page starting from 0 | |
| `isEdgeTemplate` | `Boolean` | no | Fetch edge template integrations | default: `false` |
| `textSearch` | `String` | no | The case insensitive 'startsWith' filter based on the integration name. | |
| `sortProperty` | `String` | no | Property of entity to sort by | enum: `createdTime`, `name`, `type`, `debugMode`, `allowCreateDevicesOrAssets`, `enabled`, `remote`, `routingKey`, `secret` |
| `sortOrder` | `String` | no | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | enum: `ASC`, `DESC` |

### Return type

`PageDataIntegration`


## getIntegrationsByIds

**GET** `/api/integrations/list`

Get Integrations By Ids (getIntegrationsByIds)

Requested integrations must be owned by tenant which is performing the request.    Security check is performed to verify that the user has 'READ' permission for the entity (entities).

```java
List<Integration> getIntegrationsByIds(GetIntegrationsByIdsArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
GetIntegrationsByIdsArgs.builder()
        .integrationIds(List<String>)
        .build()
```

### `GetIntegrationsByIdsArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `integrationIds` | `List<String>` | **yes** | A list of integration ids, separated by comma ',' | |

### Return type

`List<Integration>`


## getIntegrationsConvertersInfo

**GET** `/api/integrations/converters/info`

Get Integrations Converters info (getIntegrationsConvertersInfo)

Returns a JSON object containing information about existing tenant converters and converters available in library.   Available for users with 'TENANT_ADMIN' authority.

```java
Map<String, IntegrationConvertersInfo> getIntegrationsConvertersInfo()
```

### Return type

`Map<String, IntegrationConvertersInfo>`


## saveIntegration

**POST** `/api/integration`

Create Or Update Integration (saveIntegration)

Create or update the Integration. When creating integration, platform generates Integration Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created integration id will be present in the response. Specify existing Integration id to update the integration. Referencing non-existing integration Id will cause 'Not Found' error. Integration configuration is validated for each type of the integration before it can be created.   # Integration Configuration  Integration configuration (**'configuration'** field) is the JSON object representing the special configuration per integration type with the connectivity fields and other important parameters dependent on the specific integration type. Let's review the configuration object for the MQTT Integration type below.   ```json {    \"clientConfiguration\":{       \"host\":\"broker.hivemq.com\",       \"port\":1883,       \"cleanSession\":false,       \"ssl\":false,       \"connectTimeoutSec\":10,       \"clientId\":\"\",       \"maxBytesInMessage\":32368,       \"credentials\":{          \"type\":\"anonymous\"       }    },    \"downlinkTopicPattern\":\"${topic}\",    \"topicFilters\":[       {          \"filter\":\"tb/mqtt-integration-tutorial/sensors/+/temperature\",          \"qos\":0       }    ],    \"metadata\":{    } } ```  Remove 'id', 'tenantId' from the request body example (below) to create new Integration entity.   Available for users with 'TENANT_ADMIN' authority.

```java
Integration saveIntegration(SaveIntegrationArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
SaveIntegrationArgs.builder()
        .integration(Integration)
        .build()
```

### `SaveIntegrationArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `integration` | `Integration` | **yes** |  | |

### Return type

`Integration`


## unassignIntegrationFromEdge

**DELETE** `/api/edge/{edgeId}/integration/{integrationId}`

Unassign integration from edge (unassignIntegrationFromEdge)

Clears assignment of the integration to the edge. Unassignment works in async way - first, 'unassign' notification event pushed to edge queue on platform. Second, remote edge service will receive an 'unassign' command to remove integration (Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform). Third, once 'unassign' command will be delivered to edge service, it's going to remove integration locally.  Available for users with 'TENANT_ADMIN' authority.

```java
Integration unassignIntegrationFromEdge(UnassignIntegrationFromEdgeArgs args)
// build the request (required fields shown; add optional fields from the table below as needed):
UnassignIntegrationFromEdgeArgs.builder()
        .edgeId(String)
        .integrationId(String)
        .build()
```

### `UnassignIntegrationFromEdgeArgs` builder fields

| Field | Type | Required | Description | Notes |
|-------|------|----------|-------------|-------|
| `edgeId` | `String` | **yes** |  | |
| `integrationId` | `String` | **yes** |  | |

### Return type

`Integration`

