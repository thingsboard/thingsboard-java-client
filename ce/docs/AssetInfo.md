

# AssetInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**AssetId**](AssetId.md) | JSON object with the asset Id. Specify this field to update the asset. Referencing non-existing asset Id will cause error. Omit this field to create new asset. |  [optional] |
|**createdTime** | **Long** | Timestamp of the asset creation, in milliseconds |  [optional] [readonly] |
|**tenantId** | [**TenantId**](TenantId.md) | JSON object with Tenant Id. |  [optional] [readonly] |
|**customerId** | [**CustomerId**](CustomerId.md) | JSON object with Customer Id. Use &#39;assignAssetToCustomer&#39; to change the Customer Id. |  [optional] [readonly] |
|**name** | **String** | Unique Asset Name in scope of Tenant |  |
|**type** | **String** | Asset type |  [optional] |
|**label** | **String** | Label that may be used in widgets |  [optional] |
|**assetProfileId** | [**AssetProfileId**](AssetProfileId.md) | JSON object with Asset Profile Id. |  [optional] |
|**version** | **Long** |  |  [optional] |
|**customerTitle** | **String** | Title of the Customer that owns the asset. |  [optional] [readonly] |
|**customerIsPublic** | **Boolean** | Indicates special &#39;Public&#39; Customer that is auto-generated to use the assets on public dashboards. |  [optional] [readonly] |
|**assetProfileName** | **String** | Name of the corresponding Asset Profile. |  [optional] [readonly] |
|**additionalInfo** | **com.fasterxml.jackson.databind.JsonNode** | Additional parameters of the asset |  [optional] |



