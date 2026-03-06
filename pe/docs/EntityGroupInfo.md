
# EntityGroupInfo

`org.thingsboard.client.model.EntityGroupInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **EntityGroupId** | JSON object with the EntityGroupId Id. Specify this field to update the Entity Group. Referencing non-existing Entity Group Id will cause error. Omit this field to create new Entity Group. | [optional] |
| **createdTime** | **Long** | Timestamp of the entity group creation, in milliseconds | [optional] [readonly] |
| **type** | **TypeEnum** |  | |
| **name** | **String** | Name of the entity group | |
| **ownerId** | **EntityId** | JSON object with the owner of the group - Tenant or Customer Id. | [optional] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the entity group. May include: 'description' (string), 'isPublic' (boolean, whether this group is shared publicly), 'publicCustomerId' (string, UUID of the public customer associated with this group). | [optional] |
| **_configuration** | **com.fasterxml.jackson.databind.JsonNode** | JSON with the configuration for UI components: list of columns, settings, actions, etc  | [optional] |
| **version** | **Long** |  | [optional] |
| **ownerIds** | **Set\<EntityId\>** | List of the entity group owners. | |
| **groupAll** | **Boolean** | Indicates special group 'All' that contains all entities and can't be deleted. | [optional] |
| **edgeGroupAll** | **Boolean** | Indicates special edge group 'All' that contains all entities and can't be deleted. | [optional] [readonly] |
| **tenantId** | **TenantId** |  | [optional] |


### Enum: TypeEnum

| Name | Value |
|---- | -----|
| TENANT | "TENANT" |
| CUSTOMER | "CUSTOMER" |
| USER | "USER" |
| DASHBOARD | "DASHBOARD" |
| ASSET | "ASSET" |
| DEVICE | "DEVICE" |
| ALARM | "ALARM" |
| ENTITY_GROUP | "ENTITY_GROUP" |
| CONVERTER | "CONVERTER" |
| INTEGRATION | "INTEGRATION" |
| RULE_CHAIN | "RULE_CHAIN" |
| RULE_NODE | "RULE_NODE" |
| SCHEDULER_EVENT | "SCHEDULER_EVENT" |
| BLOB_ENTITY | "BLOB_ENTITY" |
| REPORT_TEMPLATE | "REPORT_TEMPLATE" |
| REPORT | "REPORT" |
| ENTITY_VIEW | "ENTITY_VIEW" |
| WIDGETS_BUNDLE | "WIDGETS_BUNDLE" |
| WIDGET_TYPE | "WIDGET_TYPE" |
| ROLE | "ROLE" |
| GROUP_PERMISSION | "GROUP_PERMISSION" |
| TENANT_PROFILE | "TENANT_PROFILE" |
| DEVICE_PROFILE | "DEVICE_PROFILE" |
| ASSET_PROFILE | "ASSET_PROFILE" |
| API_USAGE_STATE | "API_USAGE_STATE" |
| TB_RESOURCE | "TB_RESOURCE" |
| OTA_PACKAGE | "OTA_PACKAGE" |
| EDGE | "EDGE" |
| RPC | "RPC" |
| QUEUE | "QUEUE" |
| NOTIFICATION_TARGET | "NOTIFICATION_TARGET" |
| NOTIFICATION_TEMPLATE | "NOTIFICATION_TEMPLATE" |
| NOTIFICATION_REQUEST | "NOTIFICATION_REQUEST" |
| NOTIFICATION | "NOTIFICATION" |
| NOTIFICATION_RULE | "NOTIFICATION_RULE" |
| QUEUE_STATS | "QUEUE_STATS" |
| OAUTH2_CLIENT | "OAUTH2_CLIENT" |
| DOMAIN | "DOMAIN" |
| MOBILE_APP | "MOBILE_APP" |
| MOBILE_APP_BUNDLE | "MOBILE_APP_BUNDLE" |
| CALCULATED_FIELD | "CALCULATED_FIELD" |
| JOB | "JOB" |
| SECRET | "SECRET" |
| ADMIN_SETTINGS | "ADMIN_SETTINGS" |
| AI_MODEL | "AI_MODEL" |
| API_KEY | "API_KEY" |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

