# IntegrationControllerApi

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignIntegrationToEdge**](#assignIntegrationToEdge) | **POST** /api/edge/{edgeId}/integration/{integrationId} | Assign integration to edge (assignIntegrationToEdge) |
| [**checkIntegrationConnection**](#checkIntegrationConnection) | **POST** /api/integration/check | Check integration connectivity (checkIntegrationConnection) |
| [**deleteIntegration**](#deleteIntegration) | **DELETE** /api/integration/{integrationId} | Delete integration (deleteIntegration) |
| [**findAllRelatedEdgesMissingAttributes**](#findAllRelatedEdgesMissingAttributes) | **GET** /api/edge/integration/{integrationId}/allMissingAttributes | Find missing attributes for all related edges (findAllRelatedEdgesMissingAttributes) |
| [**findEdgeMissingAttributes**](#findEdgeMissingAttributes) | **GET** /api/edge/integration/{edgeId}/missingAttributes | Find edge missing attributes for assigned integrations (findEdgeMissingAttributes) |
| [**getEdgeIntegrationInfos**](#getEdgeIntegrationInfos) | **GET** /api/edge/{edgeId}/integrationInfos | Get Edge Integrations (getEdgeIntegrationInfos) |
| [**getEdgeIntegrations**](#getEdgeIntegrations) | **GET** /api/edge/{edgeId}/integrations | Get Edge Integrations (getEdgeIntegrations) |
| [**getIntegrationById**](#getIntegrationById) | **GET** /api/integration/{integrationId} | Get Integration (getIntegrationById) |
| [**getIntegrationByRoutingKey**](#getIntegrationByRoutingKey) | **GET** /api/integration/routingKey/{routingKey} | Get Integration by Routing Key (getIntegrationByRoutingKey) |
| [**getIntegrationInfos**](#getIntegrationInfos) | **GET** /api/integrationInfos | Get Integration Infos (getIntegrationInfos) |
| [**getIntegrations**](#getIntegrations) | **GET** /api/integrations | Get Integrations (getIntegrations) |
| [**getIntegrationsByIdsV2**](#getIntegrationsByIdsV2) | **GET** /api/integrations/list | Get Integrations By Ids (getIntegrationsByIdsV2) |
| [**getIntegrationsConvertersInfo**](#getIntegrationsConvertersInfo) | **GET** /api/integrations/converters/info | Get Integrations Converters info (getIntegrationsConvertersInfo) |
| [**saveIntegration**](#saveIntegration) | **POST** /api/integration | Create Or Update Integration (saveIntegration) |
| [**unassignIntegrationFromEdge**](#unassignIntegrationFromEdge) | **DELETE** /api/edge/{edgeId}/integration/{integrationId} | Unassign integration from edge (unassignIntegrationFromEdge) |



## assignIntegrationToEdge

> Integration assignIntegrationToEdge(edgeId, integrationId)

Assign integration to edge (assignIntegrationToEdge)

Creates assignment of an existing integration edge template to an instance of The Edge. Assignment works in async way - first, notification event pushed to edge service queue on platform. Second, remote edge service will receive a copy of assignment integration (Edge will receive this instantly, if it&#39;s currently connected, or once it&#39;s going to be connected to platform). Third, once integration will be delivered to edge service, it&#39;s going to start locally.   Only integration edge template can be assigned to edge.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** |  | |
| **integrationId** | **String** |  | |


## checkIntegrationConnection

> checkIntegrationConnection(integration)

Check integration connectivity (checkIntegrationConnection)

Checks if the connection to the integration is established. Throws an error if the connection is not established. Example: Failed to connect to MQTT broker at host:port.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integration** | **Integration** |  | |


## deleteIntegration

> deleteIntegration(integrationId)

Delete integration (deleteIntegration)

Deletes the integration and all the relations (from and to the integration). Referencing non-existing integration Id will cause an error.    Security check is performed to verify that the user has &#39;DELETE&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationId** | **String** | A string value representing the integration id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## findAllRelatedEdgesMissingAttributes

> String findAllRelatedEdgesMissingAttributes(integrationId)

Find missing attributes for all related edges (findAllRelatedEdgesMissingAttributes)

Returns list of attribute names of all related edges that are missing in the integration configuration.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationId** | **String** | A string value representing the integration id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## findEdgeMissingAttributes

> String findEdgeMissingAttributes(edgeId, integrationIds)

Find edge missing attributes for assigned integrations (findEdgeMissingAttributes)

Returns list of edge attribute names that are missing in assigned integrations.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **integrationIds** | **List&lt;String&gt;** | A list of assigned integration ids, separated by comma &#39;,&#39; | |


## getEdgeIntegrationInfos

> PageDataIntegrationInfo getEdgeIntegrationInfos(edgeId, pageSize, page, textSearch, sortProperty, sortOrder)

Get Edge Integrations (getEdgeIntegrationInfos)

Returns a page of Integrations assigned to the specified edge. The integration object contains information about the Integration, including the heavyweight configuration object. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive &#39;startsWith&#39; filter based on the integration name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, debugMode, allowCreateDevicesOrAssets, enabled, remote, routingKey, secret] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## getEdgeIntegrations

> PageDataIntegration getEdgeIntegrations(edgeId, pageSize, page, textSearch, sortProperty, sortOrder)

Get Edge Integrations (getEdgeIntegrations)

Returns a page of Integrations assigned to the specified edge. The integration object contains information about the Integration, including the heavyweight configuration object. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** | A string value representing the edge id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |
| **pageSize** | **Integer** | Maximum amount of entities in a one page | |
| **page** | **Integer** | Sequence number of page starting from 0 | |
| **textSearch** | **String** | The case insensitive &#39;startsWith&#39; filter based on the integration name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, debugMode, allowCreateDevicesOrAssets, enabled, remote, routingKey, secret] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## getIntegrationById

> Integration getIntegrationById(integrationId)

Get Integration (getIntegrationById)

Fetch the Integration object based on the provided Integration Id. The server checks that the integration is owned by the same tenant.    Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationId** | **String** | A string value representing the integration id. For example, &#39;784f394c-42b6-435a-983c-b7beff2784f9&#39; | |


## getIntegrationByRoutingKey

> Integration getIntegrationByRoutingKey(routingKey)

Get Integration by Routing Key (getIntegrationByRoutingKey)

Fetch the Integration object based on the provided routing key. The server checks that the integration is owned by the same tenant.    Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **routingKey** | **String** | A string value representing the integration routing key. For example, &#39;542047e6-c1b2-112e-a87e-e49247c09d4b&#39; | |


## getIntegrationInfos

> PageDataIntegrationInfo getIntegrationInfos(pageSize, page, isEdgeTemplate, textSearch, sortProperty, sortOrder)

Get Integration Infos (getIntegrationInfos)

Returns a page of integration infos owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.    Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **isEdgeTemplate** | **Boolean** | Fetch edge template integrations | [optional] [default to false] |
| **textSearch** | **String** | The case insensitive &#39;startsWith&#39; filter based on the integration name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, debugMode, allowCreateDevicesOrAssets, enabled, remote, routingKey, secret] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## getIntegrations

> PageDataIntegration getIntegrations(pageSize, page, isEdgeTemplate, textSearch, sortProperty, sortOrder)

Get Integrations (getIntegrations)

Returns a page of integrations owned by tenant. You can specify parameters to filter the results. The result is wrapped with PageData object that allows you to iterate over result set using pagination. See response schema for more details.    Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **String** | Maximum amount of entities in a one page | |
| **page** | **String** | Sequence number of page starting from 0 | |
| **isEdgeTemplate** | **Boolean** | Fetch edge template integrations | [optional] [default to false] |
| **textSearch** | **String** | The case insensitive &#39;startsWith&#39; filter based on the integration name. | [optional] |
| **sortProperty** | **String** | Property of entity to sort by | [optional] [enum: createdTime, name, type, debugMode, allowCreateDevicesOrAssets, enabled, remote, routingKey, secret] |
| **sortOrder** | **String** | Sort order. ASC (ASCENDING) or DESC (DESCENDING) | [optional] [enum: ASC, DESC] |


## getIntegrationsByIdsV2

> List&lt;Integration&gt; getIntegrationsByIdsV2(integrationIds)

Get Integrations By Ids (getIntegrationsByIdsV2)

Requested integrations must be owned by tenant which is performing the request.    Security check is performed to verify that the user has &#39;READ&#39; permission for the entity (entities).

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationIds** | **List&lt;String&gt;** | A list of integration ids, separated by comma &#39;,&#39; | |


## getIntegrationsConvertersInfo

> Map&lt;String, IntegrationConvertersInfo&gt; getIntegrationsConvertersInfo()

Get Integrations Converters info (getIntegrationsConvertersInfo)

Returns a JSON object containing information about existing tenant converters and converters available in library.   Available for users with &#39;TENANT_ADMIN&#39; authority.

## saveIntegration

> Integration saveIntegration(integration)

Create Or Update Integration (saveIntegration)

Create or update the Integration. When creating integration, platform generates Integration Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address)). The newly created integration id will be present in the response. Specify existing Integration id to update the integration. Referencing non-existing integration Id will cause &#39;Not Found&#39; error. Integration configuration is validated for each type of the integration before it can be created.   # Integration Configuration  Integration configuration (**&#39;configuration&#39;** field) is the JSON object representing the special configuration per integration type with the connectivity fields and other important parameters dependent on the specific integration type. Let&#39;s review the configuration object for the MQTT Integration type below.   &#x60;&#x60;&#x60;json {    \&quot;clientConfiguration\&quot;:{       \&quot;host\&quot;:\&quot;broker.hivemq.com\&quot;,       \&quot;port\&quot;:1883,       \&quot;cleanSession\&quot;:false,       \&quot;ssl\&quot;:false,       \&quot;connectTimeoutSec\&quot;:10,       \&quot;clientId\&quot;:\&quot;\&quot;,       \&quot;maxBytesInMessage\&quot;:32368,       \&quot;credentials\&quot;:{          \&quot;type\&quot;:\&quot;anonymous\&quot;       }    },    \&quot;downlinkTopicPattern\&quot;:\&quot;${topic}\&quot;,    \&quot;topicFilters\&quot;:[       {          \&quot;filter\&quot;:\&quot;tb/mqtt-integration-tutorial/sensors/+/temperature\&quot;,          \&quot;qos\&quot;:0       }    ],    \&quot;metadata\&quot;:{    } } &#x60;&#x60;&#x60;  Remove &#39;id&#39;, &#39;tenantId&#39; from the request body example (below) to create new Integration entity.   Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integration** | **Integration** |  | |


## unassignIntegrationFromEdge

> Integration unassignIntegrationFromEdge(edgeId, integrationId)

Unassign integration from edge (unassignIntegrationFromEdge)

Clears assignment of the integration to the edge. Unassignment works in async way - first, &#39;unassign&#39; notification event pushed to edge queue on platform. Second, remote edge service will receive an &#39;unassign&#39; command to remove integration (Edge will receive this instantly, if it&#39;s currently connected, or once it&#39;s going to be connected to platform). Third, once &#39;unassign&#39; command will be delivered to edge service, it&#39;s going to remove integration locally.  Available for users with &#39;TENANT_ADMIN&#39; authority.

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **edgeId** | **String** |  | |
| **integrationId** | **String** |  | |

