

# EntityGroup

A JSON value representing the entity group.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**EntityGroupId**](EntityGroupId.md) | JSON object with the EntityGroupId Id. Specify this field to update the Entity Group. Referencing non-existing Entity Group Id will cause error. Omit this field to create new Entity Group. |  [optional] |
|**createdTime** | **Long** | Timestamp of the entity group creation, in milliseconds |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**name** | **String** | Name of the entity group |  |
|**ownerId** | [**EntityId**](EntityId.md) | JSON object with the owner of the group - Tenant or Customer Id. |  [optional] |
|**additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Arbitrary JSON with additional information about the group |  [optional] |
|**_configuration** | **com.fasterxml.jackson.databind.JsonNode** | JSON with the configuration for UI components: list of columns, settings, actions, etc  |  [optional] |
|**version** | **Long** |  |  [optional] |
|**groupAll** | **Boolean** | Indicates special group &#39;All&#39; that contains all entities and can&#39;t be deleted. |  [optional] |
|**edgeGroupAll** | **Boolean** | Indicates special edge group &#39;All&#39; that contains all entities and can&#39;t be deleted. |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TENANT | &quot;TENANT&quot; |
| CUSTOMER | &quot;CUSTOMER&quot; |
| USER | &quot;USER&quot; |
| DASHBOARD | &quot;DASHBOARD&quot; |
| ASSET | &quot;ASSET&quot; |
| DEVICE | &quot;DEVICE&quot; |
| ALARM | &quot;ALARM&quot; |
| ENTITY_GROUP | &quot;ENTITY_GROUP&quot; |
| CONVERTER | &quot;CONVERTER&quot; |
| INTEGRATION | &quot;INTEGRATION&quot; |
| RULE_CHAIN | &quot;RULE_CHAIN&quot; |
| RULE_NODE | &quot;RULE_NODE&quot; |
| SCHEDULER_EVENT | &quot;SCHEDULER_EVENT&quot; |
| BLOB_ENTITY | &quot;BLOB_ENTITY&quot; |
| REPORT_TEMPLATE | &quot;REPORT_TEMPLATE&quot; |
| REPORT | &quot;REPORT&quot; |
| ENTITY_VIEW | &quot;ENTITY_VIEW&quot; |
| WIDGETS_BUNDLE | &quot;WIDGETS_BUNDLE&quot; |
| WIDGET_TYPE | &quot;WIDGET_TYPE&quot; |
| ROLE | &quot;ROLE&quot; |
| GROUP_PERMISSION | &quot;GROUP_PERMISSION&quot; |
| TENANT_PROFILE | &quot;TENANT_PROFILE&quot; |
| DEVICE_PROFILE | &quot;DEVICE_PROFILE&quot; |
| ASSET_PROFILE | &quot;ASSET_PROFILE&quot; |
| API_USAGE_STATE | &quot;API_USAGE_STATE&quot; |
| TB_RESOURCE | &quot;TB_RESOURCE&quot; |
| OTA_PACKAGE | &quot;OTA_PACKAGE&quot; |
| EDGE | &quot;EDGE&quot; |
| RPC | &quot;RPC&quot; |
| QUEUE | &quot;QUEUE&quot; |
| NOTIFICATION_TARGET | &quot;NOTIFICATION_TARGET&quot; |
| NOTIFICATION_TEMPLATE | &quot;NOTIFICATION_TEMPLATE&quot; |
| NOTIFICATION_REQUEST | &quot;NOTIFICATION_REQUEST&quot; |
| NOTIFICATION | &quot;NOTIFICATION&quot; |
| NOTIFICATION_RULE | &quot;NOTIFICATION_RULE&quot; |
| QUEUE_STATS | &quot;QUEUE_STATS&quot; |
| OAUTH2_CLIENT | &quot;OAUTH2_CLIENT&quot; |
| DOMAIN | &quot;DOMAIN&quot; |
| MOBILE_APP | &quot;MOBILE_APP&quot; |
| MOBILE_APP_BUNDLE | &quot;MOBILE_APP_BUNDLE&quot; |
| CALCULATED_FIELD | &quot;CALCULATED_FIELD&quot; |
| JOB | &quot;JOB&quot; |
| SECRET | &quot;SECRET&quot; |
| ADMIN_SETTINGS | &quot;ADMIN_SETTINGS&quot; |
| AI_MODEL | &quot;AI_MODEL&quot; |
| API_KEY | &quot;API_KEY&quot; |



