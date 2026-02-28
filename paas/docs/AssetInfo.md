
# AssetInfo

`org.thingsboard.client.model.AssetInfo`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **AssetId** | JSON object with the asset Id. Specify this field to update the asset. Referencing non-existing asset Id will cause error. Omit this field to create new asset. | [optional] |
| **createdTime** | **Long** | Timestamp of the asset creation, in milliseconds | [optional] [readonly] |
| **tenantId** | **TenantId** | JSON object with Tenant Id. | [optional] [readonly] |
| **customerId** | **CustomerId** | JSON object with Customer Id. Use 'assignAssetToCustomer' to change the Customer Id. | [optional] [readonly] |
| **name** | **String** | Unique Asset Name in scope of Tenant | |
| **type** | **String** | Asset type | [optional] |
| **label** | **String** | Label that may be used in widgets | [optional] |
| **assetProfileId** | **AssetProfileId** | JSON object with Asset Profile Id. | [optional] |
| **version** | **Long** |  | [optional] |
| **ownerName** | **String** | Owner name | [optional] [readonly] |
| **groups** | **List\<EntityInfo\>** | Groups | [optional] |
| **ownerId** | **EntityId** | JSON object with Customer or Tenant Id | [optional] [readonly] |
| **additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the asset | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

