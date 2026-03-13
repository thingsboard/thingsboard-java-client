
# EdgeInfo

`org.thingsboard.client.model.EdgeInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **EdgeId** | JSON object with the Edge Id. Specify this field to update the Edge. Referencing non-existing Edge Id will cause error. Omit this field to create new Edge. | [optional] |
| **createdTime** | **Long** | Timestamp of the edge creation, in milliseconds | [optional] [readonly] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the edge. May include: 'description' (string). | [optional] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. Use 'assignDeviceToTenant' to change the Tenant Id. | [optional] [readonly] |
| **customerId** | **CustomerId** | JSON object with Customer Id. Use 'assignEdgeToCustomer' to change the Customer Id. | [optional] [readonly] |
| **rootRuleChainId** | **RuleChainId** | JSON object with Root Rule Chain Id. Use 'setEdgeRootRuleChain' to change the Root Rule Chain Id. | [optional] [readonly] |
| **name** | **String** | Unique Edge Name in scope of Tenant | |
| **type** | **String** | Edge type | |
| **label** | **String** | Label that may be used in widgets | [optional] |
| **routingKey** | **String** | Edge routing key ('username') to authorize on cloud | |
| **secret** | **String** | Edge secret ('password') to authorize on cloud | |
| **edgeLicenseKey** | **String** | Edge license key obtained from license portal | |
| **cloudEndpoint** | **String** | Edge uses this cloud URL to activate and periodically check it's license | |
| **version** | **Long** |  | [optional] |
| **ownerName** | **String** | Owner name | [optional] [readonly] |
| **groups** | **List\<EntityInfo\>** | Groups | [optional] |
| **ownerId** | **EntityId** |  | [optional] [readonly] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

